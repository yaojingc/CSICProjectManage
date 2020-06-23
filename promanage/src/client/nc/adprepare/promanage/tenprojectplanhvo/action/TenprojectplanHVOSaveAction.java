
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
 * ���ӱ���
 * 
 * @version @since v3.5.6-1903
 */
public class TenprojectplanHVOSaveAction implements ICommonAction {

	@Override
	public Object doAction(IRequest paramIRequest) {
		try {
			BillCardOperator billCardOperator = new BillCardOperator();
			// 1����ȡAGGVO ��requestת������VO��
			AggTenprojectplanHVO vo = billCardOperator.toBill(paramIRequest);
			this.doBefore(vo);
			// 2�����õ��ݵı��涯���ű���savebase�����õ��������
			AggTenprojectplanHVO rtnObj = this.callActionScript(vo);
			// 3�������ؽ�����������ܣ�����ģ��ת��ǰ��BillCard�����շ��룬��ʾ��ʽ����
			Object billcard = billCardOperator.toCard(rtnObj);
			// 4�����ؽ����ǰ��
			return billcard;
		} catch (BusinessException ex) {
			// �����쳣��Ϣ
			Logger.error(ex);
			ExceptionUtils.wrapException(ex);
		}
		return null;
	}

	/**
	 * ��������
	 *
	 * @return
	 */
	protected String getActionCode() {
		return TenprojectplanHVOConst.CONST_ACTION_SAVEBASE;
	}

	/**
	 * ���ö����ű�
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
		Logger.debug("��ʼ���ö����ű� ActionName[" + actionCode + "] BillType[" + billType + "]...");

		ICloudScriptPFlowService service = CommonUtil.getCloudScriptPFlowService();

		Object[] result = service.exeScriptPFlow(context);

		Logger.debug("���ö����ű� ActionName[" + actionCode + "] BillType[" + billType + "]����");

		String wheresql = "pk_time_plan" + "='" + ((AggTenprojectplanHVO) result[0]).getPrimaryKey() + "'";
		Collection<AggTenprojectplanHVO> bills = CommonUtil.getMDPersistenceQueryService()
				.queryBillOfVOByCond(AggTenprojectplanHVO.class, wheresql, true, false);
		return bills.toArray(new AggTenprojectplanHVO[0])[0];
	}

	/**
	 * �ж��������޸�
	 *
	 * @param vo
	 */
	private void doBefore(AggTenprojectplanHVO vo) {
		// ��ȡ��ͷVO
		TenprojectplanHVO hvo =  vo.getParentVO();
		
		String parentPk = vo.getPrimaryKey();
		// �����Ƿ���������Ϣ�ж����������滹���޸ı���
		if ((parentPk != null) && !"".equals(parentPk)) {
			String pk_group = hvo.getPk_group();
			String pk_org = hvo.getPk_org();
			String pk_org_v = hvo.getPk_org_v();
			
			// ���õ���Ĭ��ֵ
			CircularlyAccessibleValueObject[] allchildren = vo.getAllChildrenVO();
			if (allchildren != null) {
				for (CircularlyAccessibleValueObject obj : allchildren) {
					obj.setAttributeValue("pk_time_plan", parentPk);
					obj.setAttributeValue("pk_group", pk_group);
					obj.setAttributeValue("pk_org", pk_org);
					obj.setAttributeValue("pk_org_v", pk_org_v);
				}
			}
		}else {// ��������
			// ���õ���Ĭ��ֵ
			hvo.setDbilldate(new UFDate());
		}
	}
}
