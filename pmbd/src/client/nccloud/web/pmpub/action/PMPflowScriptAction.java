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
 * ��Ŀ����NCC�����ű�Action�������ڻ��ڵ���
 * ����·����pmbd.pmpub.pflowScript
 * 
 * Edit By  yaojing in CSIC 20200616
 * 		TODO--------1:����ƻ����Ʊ�ڵ�׼���湦�ܱ�����������ͻ����
 * 
 * 		TODO--------2:��Ŀ��Ϣ�Ǽǽڵ�
 *
 */
public class PMPflowScriptAction extends PMNCCAction {
	
	private IdGenerator generator;

	@Override
	public <T> Object execute(IRequest request, T para) throws Exception {
		PMPflowResultInfo result = new PMPflowResultInfo(); 
		
		// ��ȡǰ̨����
		PMPflowInfo4Cloud pflowInfo = getPflowInfo(request, para);
		// ��ô�����
		Object operator = getOperator(pflowInfo);
		if (operator == null) {
			throw new BusinessException("�ݲ�֧�ָ�ת����");
		}
		// ���ݼ�
		Object[] vos = getBillVOs(operator, request, pflowInfo);
		if (CommonUtilObj.isEmpty(vos)) {
			throw new BusinessException("��ǰ���ݲ�����!");
		}

		// ǰ����
		vos = beforeProcFlow(result, vos, para, pflowInfo);
		// ���ʣ�������Ѿ�Ϊ�վ�ֱ�ӷ�����
		if(CommonUtilObj.isEmpty(vos)){
			return result;
		}
		// ��������
		Object[] procResult = procFlow(vos, para, pflowInfo);
		// ����
		afterProcFlow(result, vos, procResult, para, pflowInfo);
		// ��չ���ؽ����
		extendResultInfo(result, vos, procResult, operator, pflowInfo);
		
		return result;
	}
	
	/**
	 * ǰ����Ԥ��
	 * @param vos
	 * @param para
	 * @param pflowInfo
	 */
	protected Object[] beforeProcFlow(PMPflowResultInfo result, Object[] vos, Object para,
			PMPflowInfo4Cloud pflowInfo){
		// ����״̬����ȷ�����ݲ���¼
		vos = filterData(result, vos, pflowInfo);
		
		/**
		 * TODO--------1
		 * Add By yaojing 20200616
		   *     ǰ�������������߼�,����һ�±�����������ͻ����
		 */
		String pageCode = pflowInfo.getPagecode();
		if("4830020005_card".equalsIgnoreCase(pageCode)) {// �ж��Ǽƻ����ƿ�Ƭ̬����ʱ
			Logger.error("TODO--------1 ִ���� yaojing");
			// �����������Ҫ����,�޸ı��治��Ҫ����,�ж����������Ƿ����
			if(CSICCommonUtils.isNotEmpty(vos)) {
				TimePlanBillVO billVO = (TimePlanBillVO) vos[0];
				// ���ܷ��ȡ��ͷ����
				String pk_head = billVO.getPrimaryKey();
				if(pk_head == null) {// ������������Ҫ�������������߼�
					TimePlanItemVO[] itemVOs = (TimePlanItemVO[]) billVO.getChildrenVO();
					// ѭ������,�����������ɵ������ŵ�def6, pk_time_plan_item��ֵһ������������
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
	 * ���������е����ݣ����˳������ϵ�ǰ����״̬������
	 * @param result
	 * @param vos
	 * @param pflowInfo
	 */
	private Object[] filterData(PMPflowResultInfo result, Object[] vos, PMPflowInfo4Cloud pflowInfo){
		List<String> filterCodes = result.getFilterCodes();
		Map<String, String> errorMsg = result.getErrorMsg();
		// �ܲ�����
		result.setTotalOperands(vos.length);
		// ������������
		String operatorType = pflowInfo.getOperatorType();
		// ʣ����ϱ��β����Ľ����
		List<Object> list = new ArrayList<Object>(Arrays.asList(vos));
		// ��������
		for (int i = 0; i < vos.length; i++) {
			// ������Ϣ
			AbstractBill bill = (AbstractBill) vos[i];
			String bill_status = bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_STATUS) == null ? null :
				bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_STATUS).toString();
			String bill_type = bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_TYPE) == null ? null :
				bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_TYPE).toString().toString();
			String billCode = bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_CODE) == null? null:
				bill.getParentVO().getAttributeValue(CommonKeyConst.BILL_CODE).toString();
			// �ύ ״̬����Ϊ����̬
			if (PMPflowConst.SAVE.equals(operatorType)) {
				if (!(BillStatusConst.free == Integer.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// �洢��ʾ��Ϣ
					errorMsg.put(billCode, "���ݷ�����̬�������ύ!");
				}
				// �ջ� ״̬����Ϊ���ύ(���ǵ�û���������������������̬Ҳ�����ջ�)
			} else if (PMPflowConst.UNSAVE.equals(operatorType)) {
				if (!(BillStatusConst.commit == Integer.parseInt(bill_status) 
						|| BillStatusConst.approved == Integer.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// �洢��ʾ��Ϣ
					errorMsg.put(billCode, "���ݷ��ύ̬�������ջ�!");
				}
				// ȡ������ ����Ϊ����ͨ��
			} else if (PMPflowConst.UNAPPROVE.equals(operatorType)) {
				if (!(BillStatusConst.approved == Integer.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// �洢��ʾ��Ϣ
					errorMsg.put(billCode, "���ݷ�����ͨ��̬����������!");
				}
				// ɾ�� ״̬����Ϊ����̬,���߲���
			} else if (PMPflowConst.DELETE.equals(operatorType)) {
				if (!(BillStatusConst.free == Integer.parseInt(bill_status) || BillStatusConst.nopass == Integer
						.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// �洢��ʾ��Ϣ
					errorMsg.put(billCode, "���ݷ����ɻ򲵻�̬������ɾ��!");
				}
			}else if (PMPflowConst.VALIDATE.equals(operatorType)) {
				if (!(BillStatusConst.approved == Integer.parseInt(bill_status))){
					list.remove(bill);
					filterCodes.add(billCode);
					// �洢��ʾ��Ϣ
					errorMsg.put(billCode, "���ݷ�����ͨ��̬��������Ч!");
				}
			}else if (PMPflowConst.UNVALIDATE.equals(operatorType)) {
				if (!(BillStatusConst.validate == Integer.parseInt(bill_status))){
					list.remove(bill);
					filterCodes.add(billCode);
					// �洢��ʾ��Ϣ
					errorMsg.put(billCode, "����δ��Ч������ȡ����Ч!");
				}
			}else if (PMPflowConst.FREEZE.equals(operatorType)) {
				if (!(BillStatusConst.validate == Integer.parseInt(bill_status)
						|| BillStatusConst.release == Integer.parseInt(bill_status))) {
					list.remove(bill);
					filterCodes.add(billCode);
					// �洢��ʾ��Ϣ
					errorMsg.put(billCode, "����δ��Ч�򷢲������ܶ���!");
				}
			} else if (PMPflowConst.UNFREEZE.equals(operatorType)) {
				if (!(BillStatusConst.frozen == Integer.parseInt(bill_status))){
					list.remove(bill);
					filterCodes.add(billCode);
					// �洢��ʾ��Ϣ
					errorMsg.put(billCode, "����δ���ᣬ���ܽⶳ!");
				}
			}else if (PMPflowConst.UNRELEASE.equals(operatorType)) {
				if(BillTypeConst.BUDGET.equals(bill_type)) {
					if (!(9 == Integer.parseInt(bill_status))){
						list.remove(bill);
						filterCodes.add(billCode);
						// �洢��ʾ��Ϣ
						errorMsg.put(billCode, "����δ����������ȡ������!");
					}
				}else {
					if (!(BillStatusConst.release == Integer.parseInt(bill_status))){
						list.remove(bill);
						filterCodes.add(billCode);
						// �洢��ʾ��Ϣ
						errorMsg.put(billCode, "����δ����������ȡ������!");
					}
				}
			}else if (PMPflowConst.RELEASE.equals(operatorType)) {
				if (!(BillStatusConst.approved == Integer.parseInt(bill_status))){
					list.remove(bill);
					filterCodes.add(billCode);
					// �洢��ʾ��Ϣ
					errorMsg.put(billCode, "����δ����ͨ�������ܷ���!");
				}
			}
		}
		// ״̬�����ϵ�Ҳ�����д���
		if(errorMsg.keySet().size() > 0){
			result.setResultState(PMPflowResultInfo.HAS_ERROR);
			result.setFailNum(result.getFailNum() + errorMsg.keySet().size());
		}
		return list.toArray(new AbstractBill[list.size()]);
	}
	/**
	 * ��Ϊ�˴�������չ�Ĳ���
	 * @param request
	 * @param para
	 * @return
	 */
	protected PMPflowInfo4Cloud getPflowInfo(IRequest request, Object para) {
		Object userjsonObj = ((Map) para).get(PMPflowConst.USERJSON);
		String userjson = "";
		PMPflowInfo4Cloud pflowInfo = null;
		// Ϊ��ʱ��˵���Ǵ��б�̬��������
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
		// ҳ�����
		String pagecode = pflowInfo.getPagecode();
		// ������������ָ�����ݴ�����
		String operatorType = getDataFOperatorType() == null ? pflowInfo.getDataFormat() : getDataFOperatorType();
		// ������
		Object operator = null;
		// ��ʼ�����������
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

		// ��Ƭ̬�����̬������Դ��Ӧ�����ݽṹ��ͬ
		if (PMPflowConst.FROM_CARDDATA.equals(dataFrom)) {
			AbstractBill[] objs = null;
			String appCode = LoginContextUtils4Cloud.getCurrAppCode();
			// ���� 
			if(operator instanceof FormOperator){
				T obj = ((FormOperator) operator).toVo(request);
				AbstractBill bill =  Constructor.construct(getBillVOClass());
				bill.setParentVO((SuperVO) obj);
				objs =(AbstractBill[]) Array.newInstance(getBillVOClass(), 1);
				objs[0] = bill;
			} else if (operator instanceof BillCardOperator) {// һ��һ�ӵ���
			    AbstractBill bill = getCardVO(request);
				// ��������ӱ�ͷ����
				fillHeadPrimaryKey4Bodys(bill);
				objs = new AbstractBill[] { bill };
			} else if (operator instanceof PMExtBillCardConvertor) {// һ�����ӵ���
				AbstractBill bill = getExtBillCardVO(request);
				// ��������ӱ�ͷ����
				fillHeadPrimaryKey4Bodys(bill);
				objs = new AbstractBill[] { bill };
			}
			if(PMPflowConst.SAVEBASE.equals(pflowInfo.getOperatorType()) 
					|| PMPflowConst.SAVE.equals(pflowInfo.getOperatorType())){
				// ��Ϊ����ʱ��Ϊ��������ͨ�ó�ʼֵ
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
			// ��Ҫ��ҳ�洫������ts �������������
			for (int i = 0; i < vos.length; i++) {
				AbstractBill bill = (AbstractBill) vos[i];
				String pkValue = bill.getPrimaryKey();
				if (pkValue == null || "".equals(pkValue)) {
					bill.getParent().setAttributeValue(CommonKeyConst.TS,
							tss.get(i));
					vos[i] = bill;
				} else {// ����Ӧ��ֱ��ͨ��paramInfoMap��ȡ�����ɷ���׶ο��Ǵ���Ӱ��
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
	 * �õ�BillCard����Ӧ��ʵ�壬�����о��ȴ���
	 * 
	 * @author zhangwce
	 * @time 2019��8��28�� ����8:34:28
	 */
	private <T> AbstractBill getCardVO(IRequest request) {
		String str = request.read();
		IJson json = JsonFactory.create();
		BillCard card = json.fromJson(str, BillCard.class);
		ScaleUtil4NCC.dealScale(card, LoginContextUtils4Cloud.getCurrAppCode(), OperatorConst.BILLCARDOPERATOR);
		// billcardתvo
		BillCardConvertProcessor processor = new BillCardConvertProcessor();
		T obj = processor.fromBillCard(card);
		AbstractBill bill = (AbstractBill) obj;
		return bill;
	}
	/**
	 * �õ�ExtBillCard����Ӧ��ʵ�壬�����о��ȴ���
	 * 
	 * @author zhangwce
	 * @time 2019��8��28�� ����8:34:28
	 */
	 private  <T> AbstractBill getExtBillCardVO(IRequest request) {
		    // ���ղ�ת��������jsonת��ΪExtBillCard
		    String str = request.read();
		    IJson json = JsonFactory.create();
		    ExtBillCard card = json.fromJson(str, ExtBillCard.class);
		    ScaleUtil4NCC.dealScale(card, LoginContextUtils4Cloud.getCurrAppCode(), OperatorConst.EXTBILLCARDOPERATOR);
		    // ExtBillCardת��Ϊvo
		    ExtBillCardConvertProcessor processor = new ExtBillCardConvertProcessor();
		    T obj = processor.fromExtBillCard(card);
		    AbstractBill bill = (AbstractBill) obj;
		    return bill;
		  }
	
	/**
	 * Ϊ������ӱ�ͷ��������Ϊֻ�п�Ƭ�༭
	 * @param bill
	 * @throws BusinessException 
	 */
	private void fillHeadPrimaryKey4Bodys(AbstractBill bill) throws BusinessException{
		// �����ֶ�
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
	 * ����Ĭ��ֵ
	 * @param objs
	 */
	private void setDefaultValue(AbstractBill[] objs) {
		ClientInfo loginInfo = SessionContext.getInstance().getClientInfo();
		AbstractBill bill = (AbstractBill) objs[0];
		CircularlyAccessibleValueObject headvo = bill.getParentVO();
		if (CommonUtilObj.isEmpty(headvo.getAttributeValue(CommonKeyConst.BILLMAKER))) {
			// �����Ƶ���
			headvo.setAttributeValue(CommonKeyConst.BILLMAKER, loginInfo.getUserid());
		}
		if (CommonUtilObj.isEmpty(headvo.getAttributeValue(CommonKeyConst.BILLMAKETIME))) {
			// �����Ƶ�ʱ��
			headvo.setAttributeValue(CommonKeyConst.BILLMAKETIME,
					new UFDateTime(loginInfo.getBizDateTime()));
		}
		if (CommonUtilObj.isEmpty(headvo.getAttributeValue(CommonKeyConst.PK_GROUP))) {
			// ���뼯����Ϣ 1909���������
			headvo.setAttributeValue(CommonKeyConst.PK_GROUP,LoginContextUtils4Cloud.getPkGroup() );
		}
	}
	/**
	 * �����������׼����ȫ��ȥִ�ж����ű�
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
	 * ����
	 * @param result
	 * @param para
	 * @param pflowInfo
	 * @throws BusinessException 
	 */
	protected void afterProcFlow(PMPflowResultInfo result, Object[] vos, Object[] procResult, Object para,
			PMPflowInfo4Cloud pflowInfo) throws BusinessException{	
		// ָ�����ݴ���
		setAssignInfo(result, procResult);
		// ��������������Ϣ��ȡ
		extractErrorMsg(result,procResult);
		// ��һ����������Ϣ��ȡ
		extractSingleErrorMsg(result, vos, procResult);
		// �����������̬�򱣴��ύû�гɹ�����Ҫ�˻����ݺ�
		rollBackBillCode(result, vos, pflowInfo);
		
		
		/**
		 * TODO--------2
		 * Add By yaojing 20200616
		   *    ��������Ŀ��Ϣ�Ǽǽڵ�
		   *    �ڵ��������ύʱ,����һ�����ݸ��ͻ���Ϣ�Ǽ� Ӫ��ҳǩ
		 *    CustinformationBVO
		 */
		
		String pageCode = pflowInfo.getPagecode();
		if(pageCode.contains("4806005005")) {// �ж��Ǽƻ����ƿ�Ƭ̬�ύ����ʱ
			Logger.error("TODO--------2 ִ���� yaojing");
			if(CSICCommonUtils.isNotEmpty(vos)) {
				ProjectRegisterBillVO billVO = (ProjectRegisterBillVO) vos[0];
				ProjectRegisterHeadVO projectRegisterHeadVO = billVO.getParentVO();
				// �ͻ�����(�Զ�����1) 
				String customer = projectRegisterHeadVO.getDef1();
				// ��Ŀ����
				String projectname = projectRegisterHeadVO.getProject_name();
				// ��ͨ���ͻ������õ��ͻ������������
				String custName = CSICCommonUtils.queryCustByPK(customer);
				
				if(CSICCommonUtils.isNotEmpty(custName)) {// ��֤�пͻ����ڵĻ�����������һ���Ĳ���
					// ��ͨ���ͻ�����,�������ͻ���Ϣ�Ǽǵ�һ�ŵ���
					IMDPersistenceQueryService service = ServiceLocator.find(IMDPersistenceQueryService.class);
					String wheresql = " def3 = '"+custName+"'";
					// ��ѯ�õ����ŵ���
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
	 * ��һ�������������Ϣ��ȡ
	 * 
	 * @author zhangwce
	 * @time 2019��7��15�� ����4:37:40
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
							errMsg .append("���ݣ�"+(String)billCode+","+(String)budgetInfo+"\r\n");
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
	 * ������Ϣ��ȡ
	 * @param result
	 * @param procResult
	 */
	private void extractErrorMsg(PMPflowResultInfo result,Object[] procResult){
		// ������Ϣ�Ľ����
		Map<String, String> errorMsg = result.getErrorMsg();
		
		String resumeMsg = new String();
		
		Set<String> skipCodeSet = new HashSet<String>(); 
		
		Set<String> pkResume = new HashSet<String>();
		
		// ���ýӿڵ������Ƿ��д�����ʾ��ʶ
		boolean errorFlag = false;
		// ������� ����ƽ̨��������װ��
		if(procResult == null || procResult.length == 0) 
			return;
		if (procResult[0] instanceof PfProcessBatchRetObject) {
			// �����������������ύ
			PfProcessBatchRetObject pfProcessBatchRetObject = (PfProcessBatchRetObject) procResult[0];
			// ������Ϣmap
			HashMap<Integer, String> exceptionInfo = pfProcessBatchRetObject
					.getExceptionInfo().getErrorMessageMap();
			// �쳣VO��map
			HashMap<Integer, Object> exBuziVOMap = pfProcessBatchRetObject
					.getExceptionInfo().getHm_index_billVO();
			// �쳣VO��map
			HashMap<Integer, Exception> exMap = pfProcessBatchRetObject
								.getExceptionInfo().getHm_index_exception();
			
			Iterator Msgs = exceptionInfo.entrySet().iterator();
			while (Msgs.hasNext()) {
				// �ռ�������Ϣ
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
						resumeMsg = resumeMsg + "���ݣ�"+ billCode +","+tx.getMessage()+"\r\n";
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
		// ������ö����ű��ӿڴ��ڴ�������ݼ�¼
		if(errorFlag){			
			int failNum = errorMsg.keySet().size();
			// ��ʧ����
			result.setFailNum(failNum);
			if(failNum>0){
				result.setResultState(PMPflowResultInfo.HAS_ERROR);
			}
		}
	}
	/**
	 * �˻����룬����ͱ����ύ�����ʧ�ܾ��˻��������ֲ������ǵ�������
	 * @param result
	 * @param procResult
	 * @param pflowInfo
	 * @throws BusinessException 
	 */
	private void rollBackBillCode(PMPflowResultInfo result, Object[] vos, PMPflowInfo4Cloud pflowInfo) throws BusinessException{
		// �жϵ�ǰ���� �Ƿ��ǣ�����ͱ����ύ
		if(PMPflowConst.SAVEBASE.equals(pflowInfo.getOperatorType()) 
				|| PMPflowConst.SAVEBASE.equals(pflowInfo.getOperatorType())) {
			AbstractBill bill = (AbstractBill) vos[0];
			// ԭʼvo��ȡ�������pk�ǿ���˵�����������ݣ����ڴ�����Ϣ���������ʧ�ܣ�Ҫ�����˱�����
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
	 * ָ����Ϣ����
	 * @param result
	 * @param procResult
	 */
	private void setAssignInfo(PMPflowResultInfo result, Object[] procResult){
		// ����ƽ̨�Ĺ涨��������ص�ֵ�Ǹ�Map���ͣ���ô����ָ����Ϣ
		if(procResult == null || procResult.length == 0) 
			return;
		if (procResult[0] instanceof Map) {
			result.setAssignFlag(true);
			result.setAssignInfo((Map<String, Object>) procResult[0]);
		}
	}
	/**
	 * ���� ǰ̨��������ts id ��ѯvo����
	 * 
	 * @param paramInfoMap
	 * @param ids
	 * @param tss
	 * @return
	 */
	protected Object[] queryVo(Map<String, UFDateTime> paramInfoMap, List ids,
			List tss) {
		Iterator it = paramInfoMap.keySet().iterator();
		// ��װǰ̨��������id �� ts Ϊ����
		while (it.hasNext()) {
			String key = it.next().toString();
			ids.add(key);
			tss.add(paramInfoMap.get(key));
		}
		IPMCloudQueryService service = ServiceLocator.find(IPMCloudQueryService.class);
		// ����id�����ѯ����vo
		Object[] vos = service.queryBillByPks(
				(String[]) ids.toArray(new String[ids.size()]), getBillVOClass());
		return vos;
	}

	/**
	 * ��ò���������-���������ָ��Operator����
	 * 
	 * ����ָ�����ȼ����ڣ�ǰ�˴���
	 * @see nccloud.pub.pmpub.common.OperatorConst
	 * @param type
	 */
	protected String getDataFOperatorType(){
		return null;
	}

	/**
	 * �ۺ�VO��������ָ��
	 * 
	 * ���Ӧ��ע��ۺ���û����ȷע�ᣬ�������õı�ͷvo�࣬��������ʵ��
	 * 
	 * @return
	 */
	protected  <T extends AbstractBill> Class<T> getBillVOClass(){
		ITempletResource resourc = Locator.find(ITempletResource.class);
	    TempletQueryPara para = new TempletQueryPara();
	    // Ĭ�ϸ��ݵ�ǰappcode���в�ѯ
	    PageTemplet templet = resourc.query(para);
	    if(templet!=null && StringUtil.isNotBlank(templet.getClazz()) ){
	    	try {
				Class clazz = Class.forName(templet.getClazz());
				if(!AbstractBill.class.isAssignableFrom(clazz)){
					ExceptionUtils.wrapBusinessException("Ӧ��ע��->�ۺ���:û��������ȷ�ľۺ���,��ȷ���ã�������ʵ��!");
				}
				return clazz;
			} catch (ClassNotFoundException e) {
				ExceptionUtils.wrapException(e);
			}
	    }
	    return null;
	}
	/**
	 * Ϊ���ౣ���Լ�������չ����ֵ�Ļ���,����/�����ύ,ǰ�˿�����Ҫ�����Ľ��,�����Դ���������ͺͷ��ص���������һ��
	 * ����:����Form 
	 * �����һ�£��������ʱ�õ���Form��������󷵻صĽ����ȴ��BillCard,����ͬһ��ת��������������ʵ��
	 * TODO ��Ҫ�������
	 * @param result
	 * @param procResult
	 */
	protected void extendResultInfo(PMPflowResultInfo result, Object[] vos, Object[] procResult, Object operator, PMPflowInfo4Cloud pflowInfo){
		if(procResult == null || procResult.length == 0) 
			return;
		// ĿǰӦ��ֻ��ɾ������Ҫ����saveObj
		if(!PMPflowConst.DELETE.equals(pflowInfo.getOperatorType()) ) {
			if(!result.getAssignFlag()){
				// ����ϲ�
				ClientBillCombinServer4NCC<AbstractBill> clientBillCombinServer = new ClientBillCombinServer4NCC<>();
				if(procResult[0] instanceof PfProcessBatchRetObject){
					// �����������������ύ
					PfProcessBatchRetObject pfProcessBatchRetObject = (PfProcessBatchRetObject) procResult[0];
					if(pfProcessBatchRetObject.getRetObj() == null){
						return;
					}
					clientBillCombinServer.combine((AbstractBill[])vos, (AbstractBill[])pfProcessBatchRetObject.getRetObj());
				} else {			
					clientBillCombinServer.combine((AbstractBill[])vos, (AbstractBill[])procResult);
				}
			}		
			
			// ת����չʾ����
			Object obj = toDisplayResult(vos, operator);

			result.setSaveObj(obj);
		}
	}
	/**
	 * VO����ת����չʾ����
	 * 
	 * @author zhangwce
	 * @time 2019��7��26�� ����11:05:25
	 */
	private Object toDisplayResult(Object[] vos, Object operator) {
		// ת��Ϊҳ����Ҫ�ĸ�ʽ����
		String operType = null;
		Object obj = null;
		if (operator instanceof GridOperator) {
			operType = OperatorConst.GRIDOPERATOR;
			obj = ((GridOperator) operator).toGrid(new Object[]{vos[0]});
		} else if (operator instanceof FormOperator) {
			operType = OperatorConst.FORMOPERATOR;
			// FormOperator ͳһת�ɱ�ͷVO
			obj = ((FormOperator) operator).toForm(((AbstractBill)vos[0]).getParentVO());
		} else if (operator instanceof BillCardOperator) {
			operType = OperatorConst.BILLCARDOPERATOR;
			obj = ((BillCardOperator) operator).toCard(vos[0]);
		} else if (operator instanceof PMExtBillCardConvertor) {
			operType = OperatorConst.EXTBILLCARDOPERATOR;
			obj = ((PMExtBillCardConvertor) operator).toCard(vos[0]);
		}
		// ����ֵ���ȴ���
		ScaleUtil4NCC.dealScale(obj, LoginContextUtils4Cloud.getCurrAppCode(), operType);
		return obj;
	}
	
	
	private IdGenerator getPKGenerator() {
		if(CSICCommonUtils.isEmpty(generator)) {
			// ���������Ķ���
			return new SequenceGenerator();
		}
		return null;
	}
	
	
}
