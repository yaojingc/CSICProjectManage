
package nc.adprepare.promanage.mlyprojectplanhvo.action;

import java.util.Collection;

import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.promanage.MlyprojectplanHVOConst;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanHVO;
import nc.vo.pf.pub.util.SQLUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.util.CommonUtil;

/**
 * 删除（支持批量）
 * 
 * @version @since v3.5.6-1903
 */
public class MlyprojectplanHVODeleteAction implements ICommonAction {

	@Override
	public Object doAction(IRequest paramIRequest) {
		BillOperatorParam queryParam = this.getQueryParam(paramIRequest);
		try {
			// 1、根据前端传递的pks查询数据,获取AGGVO
			AggMlyprojectplanHVO[] bills = this.queryBills(queryParam);
			// ts赋值
//			for (int i = 0; i < bills.length; i++) {
//				bills[i].getAllChildrenVO()
//			}
//			CircularlyAccessibleValueObject[] allChildrenVO = bills[0].getAllChildrenVO();
//			String primaryKey = allChildrenVO[0].getPrimaryKey();
//			allChildrenVO[0].setPrimaryKey(primaryKey.trim());
//			CommonUtil.setBillsTs(queryParam.getPkMapTs(), bills);
			// 2、调用单据的保存动作脚本（delete），得到保存后结果
			this.callActionScript(bills);
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
		return MlyprojectplanHVOConst.CONST_ACTION_DELETE;
	}

	/**
	 * 调用动作脚本
	 *
	 * @param actionCode
	 * @param aggVOs
	 * @return
	 * @throws BusinessException
	 */
	private Object callActionScript(AggMlyprojectplanHVO... aggVOs) throws BusinessException {

		if ((aggVOs == null) || (aggVOs.length == 0)) {
			return null;
		}

		String actionCode = this.getActionCode();
		String billType = MlyprojectplanHVOConst.CONST_BILLTYPE_COST;

		CloudPFlowContext context = new CloudPFlowContext();
		context.setActionName(actionCode);
		context.setBillType(billType);
		context.setBillVos(aggVOs);
		Logger.debug("开始调用动作脚本 ActionName[" + actionCode + "] BillType[" + billType + "]...");

		ICloudScriptPFlowService service = CommonUtil.getCloudScriptPFlowService();
		Object[] result = service.exeScriptPFlow(context);

		Logger.debug("调用动作脚本 ActionName[" + actionCode + "] BillType[" + billType + "]结束");

		return result;
	}

	/**
	 * 获取查询参数
	 *
	 * @param paramIRequest
	 * @return
	 */
	private BillOperatorParam getQueryParam(IRequest paramIRequest) {
		String strRead = paramIRequest.read();
		BillOperatorParam queryParam = JsonFactory.create().fromJson(strRead, BillOperatorParam.class);
		return queryParam;
	}

	/**
	 * 查询业务数据
	 *
	 * @param queryParam
	 * @return
	 * @throws MetaDataException
	 */
	private AggMlyprojectplanHVO[] queryBills(BillOperatorParam queryParam) throws MetaDataException {
		// 1、根据参数查询结果
		IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
		String wheresql = SQLUtil.buildSqlForIn("pk_time_plan", queryParam.getPks());

		Collection<AggMlyprojectplanHVO> bills = service.queryBillOfVOByCond(AggMlyprojectplanHVO.class, wheresql, true,
				false);
		if ((bills == null) || (bills.size() == 0)) {
			return null;
		}
		return bills.toArray(new AggMlyprojectplanHVO[0]);
	}
}
