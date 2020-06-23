
package nc.adprepare.promanage.mlyprojectplanhvo.action;

import java.util.Collection;

import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.impl.obm.pattern.data.bill.BillQuery;
import nc.jdbc.framework.generator.IdGenerator;
import nc.ui.so.mreturnassign.model.returnassign_base_config;
import nc.vo.adprepare.promanage.MlyprojectplanHVOConst;
import nc.vo.am.common.itf.IBill;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanBVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDateTime;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.util.CommonUtil;

/**
 * ���ӱ���
 * 
 * @version @since v3.5.6-1903
 */
public class MlyprojectplanHVOSaveAction implements ICommonAction {

	private IdGenerator pkgenerator;

	@Override
	public Object doAction(IRequest paramIRequest) {
		try {
			BillCardOperator billCardOperator = new BillCardOperator();
			// 1����ȡAGGVO ��requestת������VO��
			AggMlyprojectplanHVO vo = billCardOperator.toBill(paramIRequest);
			MlyprojectplanBVO[] allChildrenVO = (MlyprojectplanBVO[]) vo.getAllChildrenVO();
			// �ж������������޸�:������޸ĵ�ֵΪtrue
			Boolean isModify = this.doBefore(vo);
			if (!isModify) {
				for (MlyprojectplanBVO bbody : allChildrenVO) {
					UFDateTime ts = bbody.getTs();
					if(ts!=null) {
						// ��֤pk���ظ�
						int status = bbody.getStatus();
						String pk_time_plan_item = bbody.getPk_time_plan_item();
						String generate = getPkgenerator().generate();
						bbody.setDef6(pk_time_plan_item);
						bbody.setPk_time_plan_item(generate);
						bbody.setStatus(2);
					}
				}
			}
			// 2�����õ��ݵı��涯���ű���savebase�����õ��������
			AggMlyprojectplanHVO rtnObj = this.callActionScript(vo);
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

	public IdGenerator getPkgenerator() {
		if (pkgenerator == null) {
			pkgenerator = NCLocator.getInstance().lookup(IdGenerator.class);
		}
		return pkgenerator;
	}

	/**
	 * ��������
	 *
	 * @return
	 */
	protected String getActionCode() {
		return MlyprojectplanHVOConst.CONST_ACTION_SAVEBASE;
	}

	/**
	 * ���ö����ű�
	 *
	 * @param actionCode
	 * @param aggVOs
	 * @return
	 * @throws BusinessException
	 */
	private AggMlyprojectplanHVO callActionScript(AggMlyprojectplanHVO... aggVOs) throws BusinessException {

		String actionCode = this.getActionCode();
		String billType = MlyprojectplanHVOConst.CONST_BILLTYPE_COST;

		CloudPFlowContext context = new CloudPFlowContext();
		context.setActionName(actionCode);
		context.setBillType(billType);
		context.setBillVos(aggVOs);
		Logger.debug("��ʼ���ö����ű� ActionName[" + actionCode + "] BillType[" + billType + "]...");

		ICloudScriptPFlowService service = CommonUtil.getCloudScriptPFlowService();

		Object[] result = service.exeScriptPFlow(context);

		Logger.debug("���ö����ű� ActionName[" + actionCode + "] BillType[" + billType + "]����");

		String wheresql = "pk_time_plan" + "='" + ((AggMlyprojectplanHVO) result[0]).getPrimaryKey() + "'";
		Collection<AggMlyprojectplanHVO> bills = CommonUtil.getMDPersistenceQueryService()
				.queryBillOfVOByCond(AggMlyprojectplanHVO.class, wheresql, true, false);
		return bills.toArray(new AggMlyprojectplanHVO[0])[0];
	}

	/**
	 * �ж��������޸�
	 *
	 * @param vo
	 */
	private Boolean doBefore(AggMlyprojectplanHVO vo) {
		String parentPk = vo.getPrimaryKey();
		// �����Ƿ���������Ϣ�ж����������滹���޸ı���
		Boolean flag = false;// false -- ���� true--�޸�
		if ((parentPk != null) && !"".equals(parentPk)) {
			flag = true;
			MlyprojectplanHVO hvo = vo.getParentVO();
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
		}
		return flag;
	}
}
