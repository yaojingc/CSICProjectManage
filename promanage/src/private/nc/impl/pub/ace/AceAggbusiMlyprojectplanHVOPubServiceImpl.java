
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMlyprojectplanHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMlyprojectplanHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMlyprojectplanHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMlyprojectplanHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMlyprojectplanHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMlyprojectplanHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMlyprojectplanHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiMlyprojectplanHVOPubServiceImpl {
	// ����
	public AggMlyprojectplanHVO[] pubinsertBills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		try {
			synchronized (clientFullVOs) {
				// ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
				BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(
						clientFullVOs);
				// ����BP
				AceMlyprojectplanHVOInsertBP action = new AceMlyprojectplanHVOInsertBP();
				AggMlyprojectplanHVO[] retvos = action.insert(clientFullVOs);
				// ���췵������
				// return transferTool.getBillForToClient(retvos);
				return retvos;
			}
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// ɾ��
	public void pubdeleteBills(AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills)
			throws BusinessException {
		try {
			// ���� + ���ts
			BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(
					clientFullVOs);
			// ����BP
			new AceMlyprojectplanHVODeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// �޸�
	public AggMlyprojectplanHVO[] pubupdateBills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		try {
			// ���� + ���ts
			BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(
					clientFullVOs);
			AceMlyprojectplanHVOUpdateBP bp = new AceMlyprojectplanHVOUpdateBP();
			AggMlyprojectplanHVO[] retvos = bp.update(clientFullVOs, originBills);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggMlyprojectplanHVO[] pubquerybills(IQueryScheme queryScheme) throws BusinessException {
		AggMlyprojectplanHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggMlyprojectplanHVO> query = new BillLazyQuery<AggMlyprojectplanHVO>(
					AggMlyprojectplanHVO.class);
			bills = query.query(queryScheme, null);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return bills;
	}

	/**
	 * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	}

	// �ύ
	public AggMlyprojectplanHVO[] pubsendapprovebills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		// ���� + ���ts
		BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(clientFullVOs);
		AceMlyprojectplanHVOSendApproveBP bp = new AceMlyprojectplanHVOSendApproveBP();
		AggMlyprojectplanHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// �ջ�
	public AggMlyprojectplanHVO[] pubunsendapprovebills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		// ���� + ���ts
		BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(clientFullVOs);
		AceMlyprojectplanHVOUnSendApproveBP bp = new AceMlyprojectplanHVOUnSendApproveBP();
		AggMlyprojectplanHVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// ����
	public AggMlyprojectplanHVO[] pubapprovebills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		// ���� + ���ts
		BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(clientFullVOs);
		AceMlyprojectplanHVOApproveBP bp = new AceMlyprojectplanHVOApproveBP();
		AggMlyprojectplanHVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// ����

	public AggMlyprojectplanHVO[] pubunapprovebills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		// ���� + ���ts
		BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(clientFullVOs);
		AceMlyprojectplanHVOUnApproveBP bp = new AceMlyprojectplanHVOUnApproveBP();
		AggMlyprojectplanHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}