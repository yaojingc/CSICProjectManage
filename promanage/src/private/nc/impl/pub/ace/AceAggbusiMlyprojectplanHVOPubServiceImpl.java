
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
	// 新增
	public AggMlyprojectplanHVO[] pubinsertBills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		try {
			synchronized (clientFullVOs) {
				// 数据库中数据和前台传递过来的差异VO合并后的结果
				BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(
						clientFullVOs);
				// 调用BP
				AceMlyprojectplanHVOInsertBP action = new AceMlyprojectplanHVOInsertBP();
				AggMlyprojectplanHVO[] retvos = action.insert(clientFullVOs);
				// 构造返回数据
				// return transferTool.getBillForToClient(retvos);
				return retvos;
			}
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(
					clientFullVOs);
			// 调用BP
			new AceMlyprojectplanHVODeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggMlyprojectplanHVO[] pubupdateBills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(
					clientFullVOs);
			AceMlyprojectplanHVOUpdateBP bp = new AceMlyprojectplanHVOUpdateBP();
			AggMlyprojectplanHVO[] retvos = bp.update(clientFullVOs, originBills);
			// 构造返回数据
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
	 * 由子类实现，查询之前对queryScheme进行加工，加入自己的逻辑
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// 查询之前对queryScheme进行加工，加入自己的逻辑
	}

	// 提交
	public AggMlyprojectplanHVO[] pubsendapprovebills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		// 加锁 + 检查ts
		BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(clientFullVOs);
		AceMlyprojectplanHVOSendApproveBP bp = new AceMlyprojectplanHVOSendApproveBP();
		AggMlyprojectplanHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// 收回
	public AggMlyprojectplanHVO[] pubunsendapprovebills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		// 加锁 + 检查ts
		BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(clientFullVOs);
		AceMlyprojectplanHVOUnSendApproveBP bp = new AceMlyprojectplanHVOUnSendApproveBP();
		AggMlyprojectplanHVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// 审批
	public AggMlyprojectplanHVO[] pubapprovebills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 加锁 + 检查ts
		BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(clientFullVOs);
		AceMlyprojectplanHVOApproveBP bp = new AceMlyprojectplanHVOApproveBP();
		AggMlyprojectplanHVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// 弃审

	public AggMlyprojectplanHVO[] pubunapprovebills(AggMlyprojectplanHVO[] clientFullVOs,
			AggMlyprojectplanHVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 加锁 + 检查ts
		BillTransferTool<AggMlyprojectplanHVO> transferTool = new BillTransferTool<AggMlyprojectplanHVO>(clientFullVOs);
		AceMlyprojectplanHVOUnApproveBP bp = new AceMlyprojectplanHVOUnApproveBP();
		AggMlyprojectplanHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}