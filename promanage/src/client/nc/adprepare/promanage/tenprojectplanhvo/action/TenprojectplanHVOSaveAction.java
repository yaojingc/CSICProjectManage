
package nc.adprepare.promanage.tenprojectplanhvo.action;

import java.util.Collection;

import nc.bs.logging.Logger;
import nc.vo.adprepare.promanage.TenprojectplanHVOConst;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nc.adprepare.promanage.tenprojectplanhvo.promanage.util.CommonUtil;

/**
 * 主子表保存
 * 
 * @version @since v3.5.6-1903
 */
public class TenprojectplanHVOSaveAction implements ICommonAction {

	@Override
	public Object doAction(IRequest paramIRequest) {
		try {
			BillCardOperator billCardOperator = new BillCardOperator();
			// 1、获取AGGVO （request转换主子VO）
			AggTenprojectplanHVO vo = billCardOperator.toBill(paramIRequest);
			this.doBefore(vo);
			// 2、调用单据的保存动作脚本（savebase），得到保存后结果
			AggTenprojectplanHVO rtnObj = this.callActionScript(vo);
			// 3、处理返回结果（包含功能：根据模板转换前端BillCard，参照翻译，显示公式处理）
			Object billcard = billCardOperator.toCard(rtnObj);
			// 4、返回结果到前端
			return billcard;
		} catch (BusinessException ex) {
			// 处理异常信息
			Logger.error(ex);
			ExceptionUtils.wrapException(ex);
		}
		return null;
	}

	/**
	 * 动作编码
	 *
	 * @return
	 */
	protected String getActionCode() {
		return TenprojectplanHVOConst.CONST_ACTION_SAVEBASE;
	}

	/**
	 * 调用动作脚本
	 *
	 * @param actionCode
	 * @param aggVOs
	 * @return
	 * @throws BusinessException
	 */
	private AggTenprojectplanHVO callActionScript(AggTenprojectplanHVO... aggVOs) throws BusinessException {

		String actionCode = this.getActionCode();
		String billType = TenprojectplanHVOConst.CONST_BILLTYPE_COST;

		CloudPFlowContext context = new CloudPFlowContext();
		context.setActionName(actionCode);
		context.setBillType(billType);
		context.setBillVos(aggVOs);
		Logger.debug("开始调用动作脚本 ActionName[" + actionCode + "] BillType[" + billType + "]...");

		ICloudScriptPFlowService service = CommonUtil.getCloudScriptPFlowService();

		Object[] result = service.exeScriptPFlow(context);

		Logger.debug("调用动作脚本 ActionName[" + actionCode + "] BillType[" + billType + "]结束");

		String wheresql = "pk_time_plan" + "='" + ((AggTenprojectplanHVO) result[0]).getPrimaryKey() + "'";
		Collection<AggTenprojectplanHVO> bills = CommonUtil.getMDPersistenceQueryService()
				.queryBillOfVOByCond(AggTenprojectplanHVO.class, wheresql, true, false);
		return bills.toArray(new AggTenprojectplanHVO[0])[0];
	}

	/**
	 * 判断新增或修改
	 *
	 * @param vo
	 */
	private void doBefore(AggTenprojectplanHVO vo) {
		// 获取表头VO
		TenprojectplanHVO hvo =  vo.getParentVO();
		
		String parentPk = vo.getPrimaryKey();
		// 根据是否有主键信息判断是新增保存还是修改保存
		if ((parentPk != null) && !"".equals(parentPk)) {
			String pk_group = hvo.getPk_group();
			String pk_org = hvo.getPk_org();
			String pk_org_v = hvo.getPk_org_v();
			
			// 设置单据默认值
			CircularlyAccessibleValueObject[] allchildren = vo.getAllChildrenVO();
			if (allchildren != null) {
				for (CircularlyAccessibleValueObject obj : allchildren) {
					obj.setAttributeValue("pk_time_plan", parentPk);
					obj.setAttributeValue("pk_group", pk_group);
					obj.setAttributeValue("pk_org", pk_org);
					obj.setAttributeValue("pk_org_v", pk_org_v);
				}
			}
		}else {// 新增保存
			// 设置单据默认值
			hvo.setDbilldate(new UFDate());
		}
	}
}
