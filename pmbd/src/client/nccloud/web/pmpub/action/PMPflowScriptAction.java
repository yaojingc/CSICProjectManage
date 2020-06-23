package nccloud.web.pmpub.action;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import nc.bs.bd.bp.operator.VOInsertOperator;
import nc.bs.logging.Logger;
import nc.bs.trade.business.HYPubBO;
import nc.itf.pubapp.pub.exception.IResumeException;
import nc.jdbc.framework.generator.IdGenerator;
import nc.jdbc.framework.generator.SequenceGenerator;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.adprepare.custinformation.CustinformationBVO;
import nc.vo.phm.projectregister.ProjectRegisterBillVO;
import nc.vo.phm.projectregister.ProjectRegisterHeadVO;
import nc.vo.pm.constant.BillStatusConst;
import nc.vo.pm.constant.BillTypeConst;
import nc.vo.pm.constant.CommonKeyConst;
import nc.vo.pm.exp.ExceptionTypeConst;
import nc.vo.pm.util.ArrayUtil;
import nc.vo.pm.util.StringUtil;
import nc.vo.pmsch.plan.TimePlanBillVO;
import nc.vo.pmsch.plan.TimePlanItemVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.IAttributeMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.pub.Constructor;
import nc.vo.uap.pf.PfProcessBatchRetObject;
import nccloud.framework.core.env.Locator;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.core.json.IJson;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.ClientInfo;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.container.SessionContext;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.processor.template.BillCardConvertProcessor;
import nccloud.framework.web.processor.template.ExtBillCardConvertProcessor;
import nccloud.framework.web.ui.config.ITempletResource;
import nccloud.framework.web.ui.config.PageTemplet;
import nccloud.framework.web.ui.config.TempletQueryPara;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.framework.web.ui.pattern.extbillcard.ExtBillCard;
import nccloud.framework.web.ui.pattern.form.FormOperator;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nccloud.itf.pmpub.pub.IPMBillCodeService;
import nccloud.itf.pmpub.pub.IPMCloudQueryService;
import nccloud.pub.pmpub.common.OperatorConst;
import nccloud.pub.pmpub.common.PMPflowConst;
import nccloud.pub.pmpub.script.IPMScript4Cloud;
import nccloud.pub.pmpub.util.ClientBillCombinServer4NCC;
import nccloud.pub.pmpub.util.CommonUtilObj;
import nccloud.pub.pmpub.vo.PMPflowInfo4Cloud;
import nccloud.pub.pmpub.vo.PMPflowResultInfo;
import nccloud.web.pmbd.processor.PMExtBillCardConvertor;
import nccloud.web.pmpub.util.LoginContextUtils4Cloud;
import nccloud.web.pmpub.util.scale.ScaleUtil4NCC;
import util.CSICCommonUtils;
/**
 * 项目管理NCC动作脚本Action，主用于基于单据
 * 请求路径：pmbd.pmpub.pflowScript
 * 
 * Edit By  yaojing in CSIC 20200616
 * 		TODO--------1:解决计划编制标节点准保存功能表体行主键冲突问题
 * 
 * 		TODO--------2:项目信息登记节点
 *
 */
public class PMPflowScriptAction extends PMNCCAction {
	
	private IdGenerator generator;

	@Override
	public <T> Object execute(IRequest request, T para) throws Exception {
		PMPflowResultInfo result = new PMPflowResultInfo(); 
		
		// 获取前台参数
		PMPflowInfo4Cloud pflowInfo = getPflowInfo(request, para);
		// 获得处理器
		Object operator = getOperator(pflowInfo);
		if (operator == null) {
			throw new BusinessException("暂不支持该转换器");
		}
		// 数据集
		Object[] vos = getBillVOs(operator, request, pflowInfo);
		if (CommonUtilObj.isEmpty(vos)) {
			throw new BusinessException("当前数据不存在!");
		}

		// 前处理
		vos = beforeProcFlow(result, vos, para, pflowInfo);
		// 如果剩余数据已经为空就直接返回了
		if(CommonUtilObj.isEmpty(vos)){
			return result;
		}
		// 动作处理
		Object[] procResult = procFlow(vos, para, pflowInfo);
		// 后处理
		afterProcFlow(result, vos, procResult, para, pflowInfo);
		// 扩展返回结果集
		extendResultInfo(result, vos, procResult, operator, pflowInfo);
		
		return result;
	}
	
	/**
	 * 前处理，预留
	 * @param vos
	 * @param para
	 * @param pflowInfo
	 */
	protected Object[] beforeProcFlow(PMPflowResultInfo result, Object[] vos, Object para,
			PMPflowInfo4Cloud pflowInfo){
		// 过滤状态不正确的数据并记录
		vos = filterData(result, vos, pflowInfo);
		
		/**
		 * TODO--------1
		 * Add By yaojing 20200616
		   *     前处理中添加这段逻辑,处理一下表体行主键冲突问题
		 */
		String pageCode = pflowInfo.getPagecode();
		if("4830020005_card".equalsIgnoreCase(pageCode)) {// 判断是计划编制卡片态保存时
			Logger.error("TODO--------1 执行了 yaojing");
			// 新增保存才需要处理,修改保存不需要处理,判断主表主键是否存在
			if(CSICCommonUtils.isNotEmpty(vos)) {
				TimePlanBillVO billVO = (TimePlanBillVO) vos[0];
				// 看能否获取表头主键
				String pk_head = billVO.getPrimaryKey();
				if(pk_head == null) {// 新增保存在需要加载生成主键逻辑
					TimePlanItemVO[] itemVOs = (TimePlanItemVO[]) billVO.getChildrenVO();
					// 循环表体,将界面上生成的主键放到def6, pk_time_plan_item赋值一个真正的主键
					for (int i = 0; i < itemVOs.length; i++) {
						TimePlanItemVO itemVO = itemVOs[i];
						String pk_item_old = itemVO.getPk_time_plan_item();
						
						itemVO.setDef6(pk_item_old);
						itemVO.setPk_time_plan_item(getPKGenerator().generate());
					}
				}
			}
		}
		return vos;
	}
	/**
	 * 过滤请求中的数据，过滤出不符合当前操作状态的数据
	 * @param result
	 * @param vos
	 * @param pflowInfo
	 */
	private Object[] filterData(PMPflowResultInfo result, Object[] vos, PMPflowInfo4Cloud pflowInfo){
		List<String> filterCodes = result.getFilterCodes();
		Map<String, String> errorMsg = result.getErrorMsg();
		// 总操作数
		result.setTotalOperands(vos.length);
		// 操作动作类型
		String operatorType = pflowInfo.getOperatorType();
		// 剩余符合本次操作的结果集
		List<Object> list = new ArrayList<Object>(Arrays.asList(vos));
		// 过滤数据
		for (int i = 0; i < vos.length; i++) {
			// 拦截消息
			AbstractBill bill = (AbstractBill) vos[i];
			String bill_status = bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_STATUS) == null ? null :
				bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_STATUS).toString();
			String bill_type = bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_TYPE) == null ? null :
				bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_TYPE).toString().toString();
			String billCode = bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_CODE) == null? null:
				bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_CODE).toString();
			// 提交 状态必须为自由态
			if (PMPflowConst.SAVE.equals(operatorType)) {
				if (!(BillStatusConst.free == Integer.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// 存储提示消息
					errorMsg.put(billCode, "单据非自由态，不能提交!");
				}
				// 收回 状态必须为已提交(考虑到没有审批流情况，所以审批态也可能收回)
			} else if (PMPflowConst.UNSAVE.equals(operatorType)) {
				if (!(BillStatusConst.commit == Integer.parseInt(bill_status) 
						|| BillStatusConst.approved == Integer.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// 存储提示消息
					errorMsg.put(billCode, "单据非提交态，不能收回!");
				}
				// 取消审批 必须为审批通过
			} else if (PMPflowConst.UNAPPROVE.equals(operatorType)) {
				if (!(BillStatusConst.approved == Integer.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// 存储提示消息
					errorMsg.put(billCode, "单据非审批通过态，不能弃审!");
				}
				// 删除 状态必须为自由态,或者驳回
			} else if (PMPflowConst.DELETE.equals(operatorType)) {
				if (!(BillStatusConst.free == Integer.parseInt(bill_status) || BillStatusConst.nopass == Integer
						.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// 存储提示消息
					errorMsg.put(billCode, "单据非自由或驳回态，不能删除!");
				}
			}else if (PMPflowConst.VALIDATE.equals(operatorType)) {
				if (!(BillStatusConst.approved == Integer.parseInt(bill_status))){
					list.remove(bill);
					filterCodes.add(billCode);
					// 存储提示消息
					errorMsg.put(billCode, "单据非审批通过态，不能生效!");
				}
			}else if (PMPflowConst.UNVALIDATE.equals(operatorType)) {
				if (!(BillStatusConst.validate == Integer.parseInt(bill_status))){
					list.remove(bill);
					filterCodes.add(billCode);
					// 存储提示消息
					errorMsg.put(billCode, "单据未生效，不能取消生效!");
				}
			}else if (PMPflowConst.FREEZE.equals(operatorType)) {
				if (!(BillStatusConst.validate == Integer.parseInt(bill_status)
						|| BillStatusConst.release == Integer.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// 存储提示消息
					errorMsg.put(billCode, "单据未生效或发布，不能冻结!");
				}
			} else if (PMPflowConst.UNFREEZE.equals(operatorType)) {
				if (!(BillStatusConst.frozen == Integer.parseInt(bill_status))){
					list.remove(bill);
					filterCodes.add(billCode);
					// 存储提示消息
					errorMsg.put(billCode, "单据未冻结，不能解冻!");
				}
			}else if (PMPflowConst.UNRELEASE.equals(operatorType)) {
				if(BillTypeConst.BUDGET.equals(bill_type)) {
					if (!(9 == Integer.parseInt(bill_status))){
						list.remove(bill);
						filterCodes.add(billCode);
						// 存储提示消息
						errorMsg.put(billCode, "单据未发布，不能取消发布!");
					}
				}else {
					if (!(BillStatusConst.release == Integer.parseInt(bill_status))){
						list.remove(bill);
						filterCodes.add(billCode);
						// 存储提示消息
						errorMsg.put(billCode, "单据未发布，不能取消发布!");
					}
				}
			}else if (PMPflowConst.RELEASE.equals(operatorType)) {
				if (!(BillStatusConst.approved == Integer.parseInt(bill_status))){
					list.remove(bill);
					filterCodes.add(billCode);
					// 存储提示消息
					errorMsg.put(billCode, "单据未审批通过，不能发布!");
				}
			}
		}
		// 状态不符合的也算是有错误
		if(errorMsg.keySet().size() > 0){
			result.setResultState(PMPflowResultInfo.HAS_ERROR);
			result.setFailNum(result.getFailNum() + errorMsg.keySet().size());
		}
		return list.toArray(new AbstractBill[list.size()]);
	}
	/**
	 * 因为此处传有扩展的参数
	 * @param request
	 * @param para
	 * @return
	 */
	protected PMPflowInfo4Cloud getPflowInfo(IRequest request, Object para) {
		Object userjsonObj = ((Map) para).get(PMPflowConst.USERJSON);
		String userjson = "";
		PMPflowInfo4Cloud pflowInfo = null;
		// 为空时候说明是从列表态传过来的
		if (userjsonObj == null) {
			pflowInfo = JsonFactory.create().fromJson(request.read(),
					PMPflowInfo4Cloud.class);
		} else {
			userjson = userjsonObj.toString();
			pflowInfo = JsonFactory.create().fromJson(userjson,
					PMPflowInfo4Cloud.class);
		}
	
		handleResumeInfo(pflowInfo);
		
		return pflowInfo;
	}

	private void handleResumeInfo(PMPflowInfo4Cloud pflowInfo) {
		if(pflowInfo.getParmeter() != null ) {
			String[] skipCodes = pflowInfo.getParmeter().getSkipCodes();
			if(ArrayUtil.isNotEmpty(skipCodes)) {
				for (String code : skipCodes) {
					if(ExceptionTypeConst.BUDGET_ALERT.equals(code)) {
						pflowInfo.getParmeter().setBudgetCheckkFlag(true);
					}
				}
			}
		}
	}

	protected Object getOperator(PMPflowInfo4Cloud pflowInfo) {
		// 页面编码
		String pagecode = pflowInfo.getPagecode();
		// 根据数据类型指定数据处理器
		String operatorType = getDataFOperatorType() == null ? pflowInfo.getDataFormat() : getDataFOperatorType();
		// 处理器
		Object operator = null;
		// 开始辨别处理器类型
		if (OperatorConst.GRIDOPERATOR.equals(operatorType)) {
			operator = new GridOperator(pagecode);
		} else if (OperatorConst.FORMOPERATOR.equals(operatorType)) {
			operator = new FormOperator(pagecode);
		} else if (OperatorConst.BILLCARDOPERATOR.equals(operatorType)) {
			operator = new BillCardOperator(pagecode);
		} else if (OperatorConst.EXTBILLCARDOPERATOR.equals(operatorType)) {
			operator = new PMExtBillCardConvertor(pagecode);
		}
		return operator;
	}

	protected <T> Object[] getBillVOs(Object operator, IRequest request,
			PMPflowInfo4Cloud pflowInfo) throws BusinessException {
		String dataFrom = pflowInfo.getDataFrom();

		// 卡片态、类表态数据来源对应的数据结构不同
		if (PMPflowConst.FROM_CARDDATA.equals(dataFrom)) {
			AbstractBill[] objs = null;
			String appCode = LoginContextUtils4Cloud.getCurrAppCode();
			// 单表 
			if(operator instanceof FormOperator){
				T obj = ((FormOperator) operator).toVo(request);
				AbstractBill bill =  Constructor.construct(getBillVOClass());
				bill.setParentVO((SuperVO) obj);
				objs =(AbstractBill[]) Array.newInstance(getBillVOClass(), 1);
				objs[0] = bill;
			} else if (operator instanceof BillCardOperator) {// 一主一子单据
			    AbstractBill bill = getCardVO(request);
				// 给表体添加表头主键
				fillHeadPrimaryKey4Bodys(bill);
				objs = new AbstractBill[] { bill };
			} else if (operator instanceof PMExtBillCardConvertor) {// 一主多子单据
				AbstractBill bill = getExtBillCardVO(request);
				// 给表体添加表头主键
				fillHeadPrimaryKey4Bodys(bill);
				objs = new AbstractBill[] { bill };
			}
			if(PMPflowConst.SAVEBASE.equals(pflowInfo.getOperatorType()) 
					|| PMPflowConst.SAVE.equals(pflowInfo.getOperatorType())){
				// 当为新增时，为单据设置通用初始值
				setDefaultValue(objs);
			}
			return objs;
		} else if (PMPflowConst.FROM_LISTDATA.equals(dataFrom)) {
			Map<String, UFDateTime> paramInfoMap = pflowInfo.getParamInfoMap();
			List ids = new ArrayList();
			List tss = new ArrayList();
			Object[] vos = queryVo(paramInfoMap, ids, tss);
			if (vos == null || vos.length == 0) {
				return null;
			}
			// 需要把页面传过来的ts 赋给查出的数据
			for (int i = 0; i < vos.length; i++) {
				AbstractBill bill = (AbstractBill) vos[i];
				String pkValue = bill.getPrimaryKey();
				if (pkValue == null || "".equals(pkValue)) {
					bill.getParent().setAttributeValue(CommonKeyConst.TS,
							tss.get(i));
					vos[i] = bill;
				} else {// 正常应该直接通过paramInfoMap获取，集成发版阶段考虑代码影响
					for (int j = 0; j < ids.size(); j++) {
						if (pkValue.equals(ids.get(j))) {
							bill.getParent().setAttributeValue(
									CommonKeyConst.TS, tss.get(j));
							vos[i] = bill;
							break;
						}
					}
				}
			}
			return vos;
		}
		return null;
	}

	/**
	 * 得到BillCard表单对应的实体，并进行精度处理
	 * 
	 * @author zhangwce
	 * @time 2019年8月28日 下午8:34:28
	 */
	private <T> AbstractBill getCardVO(IRequest request) {
		String str = request.read();
		IJson json = JsonFactory.create();
		BillCard card = json.fromJson(str, BillCard.class);
		ScaleUtil4NCC.dealScale(card, LoginContextUtils4Cloud.getCurrAppCode(), OperatorConst.BILLCARDOPERATOR);
		// billcard转vo
		BillCardConvertProcessor processor = new BillCardConvertProcessor();
		T obj = processor.fromBillCard(card);
		AbstractBill bill = (AbstractBill) obj;
		return bill;
	}
	/**
	 * 得到ExtBillCard表单对应的实体，并进行精度处理
	 * 
	 * @author zhangwce
	 * @time 2019年8月28日 下午8:34:28
	 */
	 private  <T> AbstractBill getExtBillCardVO(IRequest request) {
		    // 接收并转化参数，json转化为ExtBillCard
		    String str = request.read();
		    IJson json = JsonFactory.create();
		    ExtBillCard card = json.fromJson(str, ExtBillCard.class);
		    ScaleUtil4NCC.dealScale(card, LoginContextUtils4Cloud.getCurrAppCode(), OperatorConst.EXTBILLCARDOPERATOR);
		    // ExtBillCard转化为vo
		    ExtBillCardConvertProcessor processor = new ExtBillCardConvertProcessor();
		    T obj = processor.fromExtBillCard(card);
		    AbstractBill bill = (AbstractBill) obj;
		    return bill;
		  }
	
	/**
	 * 为表体添加表头主键，因为只有卡片编辑
	 * @param bill
	 * @throws BusinessException 
	 */
	private void fillHeadPrimaryKey4Bodys(AbstractBill bill) throws BusinessException{
		// 主键字段
		IAttributeMeta primaryAttribute = bill.getParent().getMetaData().getPrimaryAttribute();
		String headPkColumn = primaryAttribute.getColumn().getName();
		String headPk = bill.getPrimaryKey();

		CircularlyAccessibleValueObject[] allChildrenVOs = bill.getAllChildrenVO();
		if(!CommonUtilObj.isEmpty(headPk) && !CommonUtilObj.isEmpty(allChildrenVOs)){
			for(CircularlyAccessibleValueObject childrenVo : allChildrenVOs){
				if(CommonUtilObj.isEmpty(childrenVo.getAttributeValue(headPkColumn))){
					childrenVo.setAttributeValue(headPkColumn, headPk);
				}
			}
		}
	}
	/**
	 * 设置默认值
	 * @param objs
	 */
	private void setDefaultValue(AbstractBill[] objs) {
		ClientInfo loginInfo = SessionContext.getInstance().getClientInfo();
		AbstractBill bill = (AbstractBill) objs[0];
		CircularlyAccessibleValueObject headvo = bill.getParentVO();
		if (CommonUtilObj.isEmpty(headvo.getAttributeValue(CommonKeyConst.BILLMAKER))) {
			// 设置制单人
			headvo.setAttributeValue(CommonKeyConst.BILLMAKER, loginInfo.getUserid());
		}
		if (CommonUtilObj.isEmpty(headvo.getAttributeValue(CommonKeyConst.BILLMAKETIME))) {
			// 设置制单时间
			headvo.setAttributeValue(CommonKeyConst.BILLMAKETIME,
					new UFDateTime(loginInfo.getBizDateTime()));
		}
		if (CommonUtilObj.isEmpty(headvo.getAttributeValue(CommonKeyConst.PK_GROUP))) {
			// 补齐集团信息 1909发版后增加
			headvo.setAttributeValue(CommonKeyConst.PK_GROUP,LoginContextUtils4Cloud.getPkGroup() );
		}
	}
	/**
	 * 所需参数都已准备齐全，去执行动作脚本
	 * @param vos
	 * @param para
	 * @param pflowInfo
	 * @return
	 * @throws BusinessException
	 */
	protected Object[] procFlow(Object[] vos, Object para,
			PMPflowInfo4Cloud pflowInfo) throws BusinessException {
		Object ret[] = ServiceLocator.find(IPMScript4Cloud.class).procFlow(vos,
				para, pflowInfo);
		return ret;
	}
	/**
	 * 后处理
	 * @param result
	 * @param para
	 * @param pflowInfo
	 * @throws BusinessException 
	 */
	protected void afterProcFlow(PMPflowResultInfo result, Object[] vos, Object[] procResult, Object para,
			PMPflowInfo4Cloud pflowInfo) throws BusinessException{	
		// 指派数据处理
		setAssignInfo(result, procResult);
		// 批量操作错误信息提取
		extractErrorMsg(result,procResult);
		// 单一操作错误信息提取
		extractSingleErrorMsg(result, vos, procResult);
		// 如果处于新增态或保存提交没有成功，需要退还单据号
		rollBackBillCode(result, vos, pflowInfo);
		
		
		/**
		 * TODO--------2
		 * Add By yaojing 20200616
		   *    适用于项目信息登记节点
		   *    在单据审批提交时,推送一条数据给客户信息登记 营销页签
		 *    CustinformationBVO
		 */
		
		String pageCode = pflowInfo.getPagecode();
		if(pageCode.contains("4806005005")) {// 判断是计划编制卡片态提交审批时
			Logger.error("TODO--------2 执行了 yaojing");
			if(CSICCommonUtils.isNotEmpty(vos)) {
				ProjectRegisterBillVO billVO = (ProjectRegisterBillVO) vos[0];
				ProjectRegisterHeadVO projectRegisterHeadVO = billVO.getParentVO();
				// 客户主键(自定义项1) 
				String customer = projectRegisterHeadVO.getDef1();
				// 项目名称
				String projectname = projectRegisterHeadVO.getProject_name();
				// 先通过客户主键得到客户编码或者名称
				String custName = CSICCommonUtils.queryCustByPK(customer);
				
				if(CSICCommonUtils.isNotEmpty(custName)) {// 保证有客户存在的基础上在做下一步的操作
					// 在通过客户名称,关联到客户信息登记的一张单据
					IMDPersistenceQueryService service = ServiceLocator.find(IMDPersistenceQueryService.class);
					String wheresql = " def3 = '"+custName+"'";
					// 查询得到整张单据
					Collection<AggCustinformationHVO> bills = service.queryBillOfVOByCond(AggCustinformationHVO.class, wheresql, true,false);
					List<AggCustinformationHVO> billsList = new ArrayList<>(bills);
					AggCustinformationHVO custinformation = billsList.get(0);
					if(CSICCommonUtils.isNotEmpty(custinformation)) {
						String pk_information_h = custinformation.getParentVO().getPk_information_h();
						
						CustinformationBVO custBVO = new CustinformationBVO();
						custBVO.setPk_information_b(getPKGenerator().generate());
						custBVO.setPk_information_h(pk_information_h);
						custBVO.setPname(projectname);
						
						
						VOInsertOperator<CustinformationBVO> voinsert = new VOInsertOperator();
						voinsert.operate(new CustinformationBVO[] {custBVO});
					}
				}
			}
		}
	}
	/**
	 * 单一操作结果错误信息提取
	 * 
	 * @author zhangwce
	 * @time 2019年7月15日 下午4:37:40
	 */
	private void extractSingleErrorMsg(PMPflowResultInfo result, Object[] vos, Object[] procResult) {
		if ((ArrayUtil.isEmpty(procResult) || !(procResult[0] instanceof PfProcessBatchRetObject)) &&
				StringUtil.isEmpty(result.getBudgetInfo()) && ArrayUtil.isEmpty(result.getSkipCodes())) {
			if(vos!=null) {
				StringBuffer errMsg = new StringBuffer();
				Set<String> skipCodeSet = new HashSet<String>(); 
				Object budgetInfo = null;
				String[] skipCodes = new String[0];
				for (Object vo : vos) {
					if(vo instanceof AbstractBill) {
						budgetInfo =((AbstractBill)vo).getParentVO().getAttributeValue("budget_info");
						skipCodes = (String[])((AbstractBill)vo).getParentVO().getAttributeValue("skipCodes");	
					}else if(vo instanceof SuperVO) {
						budgetInfo =((SuperVO)vo).getAttributeValue("budget_info");
						skipCodes = (String[])((SuperVO)vo).getAttributeValue("skipCodes");	
					}
					if(budgetInfo != null) {
						Object billCode = ((AbstractBill)vo).getParentVO().getAttributeValue(CommonKeyConst.BILL_CODE);
						if(billCode == null) {
							errMsg .append((String)budgetInfo+"\r\n");
						}else {
							errMsg .append("单据："+(String)billCode+","+(String)budgetInfo+"\r\n");
						}
						
					}
						
					if(skipCodes != null && skipCodes.length >0) {
						for (String skipCode : skipCodes) {
							skipCodeSet.add(skipCode);
						}
					}
				}
				if(StringUtil.isNotEmpty(errMsg.toString())) {
					result.setBudgetInfo(errMsg.toString());
					result.setSkipCodes(skipCodeSet.toArray(new String[0]));
				}
			}
		}
	}
	/**
	 * 错误信息提取
	 * @param result
	 * @param procResult
	 */
	private void extractErrorMsg(PMPflowResultInfo result,Object[] procResult){
		// 错误消息的结果集
		Map<String, String> errorMsg = result.getErrorMsg();
		
		String resumeMsg = new String();
		
		Set<String> skipCodeSet = new HashSet<String>(); 
		
		Set<String> pkResume = new HashSet<String>();
		
		// 调用接口的数据是否有错误提示标识
		boolean errorFlag = false;
		// 批量情况 返回平台处理结果封装类
		if(procResult == null || procResult.length == 0) 
			return;
		if (procResult[0] instanceof PfProcessBatchRetObject) {
			// 正常的有审批流的提交
			PfProcessBatchRetObject pfProcessBatchRetObject = (PfProcessBatchRetObject) procResult[0];
			// 错误信息map
			HashMap<Integer, String> exceptionInfo = pfProcessBatchRetObject
					.getExceptionInfo().getErrorMessageMap();
			// 异常VO的map
			HashMap<Integer, Object> exBuziVOMap = pfProcessBatchRetObject
					.getExceptionInfo().getHm_index_billVO();
			// 异常VO的map
			HashMap<Integer, Exception> exMap = pfProcessBatchRetObject
								.getExceptionInfo().getHm_index_exception();
			
			Iterator Msgs = exceptionInfo.entrySet().iterator();
			while (Msgs.hasNext()) {
				// 收集错误信息
				Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) Msgs.next();
				Integer key = entry.getKey();
				String val = entry.getValue();
				AbstractBill bill = (AbstractBill) exBuziVOMap.get(key);
				
				Object billCode = bill.getParentVO()
						.getAttributeValue(CommonKeyConst.BILL_CODE);
				if(exMap.get(key) != null) {
					Exception ex = exMap.get(key);
					Throwable tx = ExceptionUtils.unmarsh(ex);
					if(tx instanceof IResumeException) {
						resumeMsg = resumeMsg + "单据："+ billCode +","+tx.getMessage()+"\r\n";
						skipCodeSet.add(((IResumeException)tx).getBusiExceptionType());
						pkResume.add(bill.getPrimaryKey());
					}else {
						errorFlag = true;
						errorMsg.put(billCode == null ? "" : billCode.toString(), val);
					}
				}else {
					errorFlag = true;
					errorMsg.put(billCode == null ? "" : billCode.toString(), val);
				}
			}
		}
		if(StringUtil.isNotEmpty(resumeMsg) ) {
			result.setBudgetInfo(resumeMsg);
		}
		if(skipCodeSet != null && skipCodeSet.size()>0) {
			result.setSkipCodes(skipCodeSet.toArray(new String[0]));
		}
		if(pkResume != null && pkResume.size()>0) {
			result.setPkResume(pkResume.toArray(new String[0]));
		}
		// 如果调用动作脚本接口存在错误的数据记录
		if(errorFlag){			
			int failNum = errorMsg.keySet().size();
			// 总失败数
			result.setFailNum(failNum);
			if(failNum>0){
				result.setResultState(PMPflowResultInfo.HAS_ERROR);
			}
		}
	}
	/**
	 * 退还编码，保存和保存提交，如果失败就退还，这两种操作都是单条数据
	 * @param result
	 * @param procResult
	 * @param pflowInfo
	 * @throws BusinessException 
	 */
	private void rollBackBillCode(PMPflowResultInfo result, Object[] vos, PMPflowInfo4Cloud pflowInfo) throws BusinessException{
		// 判断当前操作 是否是：保存和保存提交
		if(PMPflowConst.SAVEBASE.equals(pflowInfo.getOperatorType()) 
				|| PMPflowConst.SAVEBASE.equals(pflowInfo.getOperatorType())) {
			AbstractBill bill = (AbstractBill) vos[0];
			// 原始vo中取出，如果pk是空则说明是新增数据，存在错误消息，则代表保存失败，要进行退编码吗
			String pkBill = bill.getParentVO().getPrimaryKey();
			if(StringUtil.isEmpty(pkBill) && PMPflowResultInfo.HAS_ERROR.equals(result.getResultState())){
				String billType = (String) bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_TYPE);
				String pk_group = (String) bill.getParentVO().getAttributeValue(CommonKeyConst.PK_GROUP);
				String pk_org = (String) bill.getParentVO().getAttributeValue(CommonKeyConst.PK_ORG);
				String billCode = (String) bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_CODE);
				ServiceLocator.find(IPMBillCodeService.class).rollBackPreBillCode(billType, pk_group, pk_org, billCode);
			}
		}
	}
	/**
	 * 指派信息处理
	 * @param result
	 * @param procResult
	 */
	private void setAssignInfo(PMPflowResultInfo result, Object[] procResult){
		// 按照平台的规定，如果返回的值是个Map类型，那么就是指派信息
		if(procResult == null || procResult.length == 0) 
			return;
		if (procResult[0] instanceof Map) {
			result.setAssignFlag(true);
			result.setAssignInfo((Map<String, Object>) procResult[0]);
		}
	}
	/**
	 * 根据 前台传过来的ts id 查询vo数据
	 * 
	 * @param paramInfoMap
	 * @param ids
	 * @param tss
	 * @return
	 */
	protected Object[] queryVo(Map<String, UFDateTime> paramInfoMap, List ids,
			List tss) {
		Iterator it = paramInfoMap.keySet().iterator();
		// 组装前台传过来的id 和 ts 为集合
		while (it.hasNext()) {
			String key = it.next().toString();
			ids.add(key);
			tss.add(paramInfoMap.get(key));
		}
		IPMCloudQueryService service = ServiceLocator.find(IPMCloudQueryService.class);
		// 根据id数组查询单据vo
		Object[] vos = service.queryBillByPks(
				(String[]) ids.toArray(new String[ids.size()]), getBillVOClass());
		return vos;
	}

	/**
	 * 获得操作器类型-由子类进行指定Operator类型
	 * 
	 * 子类指定优先级高于，前端传递
	 * @see nccloud.pub.pmpub.common.OperatorConst
	 * @param type
	 */
	protected String getDataFOperatorType(){
		return null;
	}

	/**
	 * 聚合VO类型子类指定
	 * 
	 * 如果应用注册聚合类没有正确注册，而是配置的表头vo类，子类自行实现
	 * 
	 * @return
	 */
	protected  <T extends AbstractBill> Class<T> getBillVOClass(){
		ITempletResource resourc = Locator.find(ITempletResource.class);
	    TempletQueryPara para = new TempletQueryPara();
	    // 默认根据当前appcode进行查询
	    PageTemplet templet = resourc.query(para);
	    if(templet!=null && StringUtil.isNotBlank(templet.getClazz()) ){
	    	try {
				Class clazz = Class.forName(templet.getClazz());
				if(!AbstractBill.class.isAssignableFrom(clazz)){
					ExceptionUtils.wrapBusinessException("应用注册->聚合类:没有配置正确的聚合类,正确配置，或子类实现!");
				}
				return clazz;
			} catch (ClassNotFoundException e) {
				ExceptionUtils.wrapException(e);
			}
	    }
	    return null;
	}
	/**
	 * 为子类保留自己可以扩展返回值的机会,保存/保存提交,前端可能需要保存后的结果,如果来源的数据类型和返回的数据类型一致
	 * 例如:都是Form 
	 * 如果不一致，比如接收时用的是Form，而保存后返回的结果集却是BillCard,不是同一种转换器，子类自行实现
	 * TODO 需要补充设计
	 * @param result
	 * @param procResult
	 */
	protected void extendResultInfo(PMPflowResultInfo result, Object[] vos, Object[] procResult, Object operator, PMPflowInfo4Cloud pflowInfo){
		if(procResult == null || procResult.length == 0) 
			return;
		// 目前应该只有删除不需要返回saveObj
		if(!PMPflowConst.DELETE.equals(pflowInfo.getOperatorType()) ) {
			if(!result.getAssignFlag()){
				// 差异合并
				ClientBillCombinServer4NCC<AbstractBill> clientBillCombinServer = new ClientBillCombinServer4NCC<>();
				if(procResult[0] instanceof PfProcessBatchRetObject){
					// 正常的有审批流的提交
					PfProcessBatchRetObject pfProcessBatchRetObject = (PfProcessBatchRetObject) procResult[0];
					if(pfProcessBatchRetObject.getRetObj() == null){
						return;
					}
					clientBillCombinServer.combine((AbstractBill[])vos, (AbstractBill[])pfProcessBatchRetObject.getRetObj());
				} else {			
					clientBillCombinServer.combine((AbstractBill[])vos, (AbstractBill[])procResult);
				}
			}		
			
			// 转换成展示数据
			Object obj = toDisplayResult(vos, operator);

			result.setSaveObj(obj);
		}
	}
	/**
	 * VO对象转换成展示数据
	 * 
	 * @author zhangwce
	 * @time 2019年7月26日 上午11:05:25
	 */
	private Object toDisplayResult(Object[] vos, Object operator) {
		// 转换为页面需要的格式数据
		String operType = null;
		Object obj = null;
		if (operator instanceof GridOperator) {
			operType = OperatorConst.GRIDOPERATOR;
			obj = ((GridOperator) operator).toGrid(new Object[]{vos[0]});
		} else if (operator instanceof FormOperator) {
			operType = OperatorConst.FORMOPERATOR;
			// FormOperator 统一转成表头VO
			obj = ((FormOperator) operator).toForm(((AbstractBill)vos[0]).getParentVO());
		} else if (operator instanceof BillCardOperator) {
			operType = OperatorConst.BILLCARDOPERATOR;
			obj = ((BillCardOperator) operator).toCard(vos[0]);
		} else if (operator instanceof PMExtBillCardConvertor) {
			operType = OperatorConst.EXTBILLCARDOPERATOR;
			obj = ((PMExtBillCardConvertor) operator).toCard(vos[0]);
		}
		// 返回值精度处理
		ScaleUtil4NCC.dealScale(obj, LoginContextUtils4Cloud.getCurrAppCode(), operType);
		return obj;
	}
	
	
	private IdGenerator getPKGenerator() {
		if(CSICCommonUtils.isEmpty(generator)) {
			// 生成主键的对象
			return new SequenceGenerator();
		}
		return null;
	}
	
	
}
