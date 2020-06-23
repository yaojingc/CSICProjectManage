
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustinformationHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustinformationHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustinformationHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustinformationHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustinformationHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustinformationHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustinformationHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiCustinformationHVOPubServiceImpl {
	// 新增
	public AggCustinformationHVO[] pubinsertBills(AggCustinformationHVO[] clientFullVOs,
			AggCustinformationHVO[] originBills) throws BusinessException {
		try {
			synchronized (clientFullVOs) {
				// 数据库中数据和前台传递过来的差异VO合并后的结果
				BillTransferTool<AggCustinformationHVO> transferTool = new BillTransferTool<AggCustinformationHVO>(
						clientFullVOs);
				// 调用BP
				AceCustinformationHVOInsertBP action = new AceCustinformationHVOInsertBP();
				AggCustinformationHVO[] retvos = action.insert(clientFullVOs);
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
	public void pubdeleteBills(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggCustinformationHVO> transferTool = new BillTransferTool<AggCustinformationHVO>(
					clientFullVOs);
			// 调用BP
			new AceCustinformationHVODeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggCustinformationHVO[] pubupdateBills(AggCustinformationHVO[] clientFullVOs,
			AggCustinformationHVO[] originBills) throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggCustinformationHVO> transferTool = new BillTransferTool<AggCustinformationHVO>(
					clientFullVOs);
			AceCustinformationHVOUpdateBP bp = new AceCustinformationHVOUpdateBP();
			AggCustinformationHVO[] retvos = bp.update(clientFullVOs, originBills);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggCustinformationHVO[] pubquerybills(IQueryScheme queryScheme) throws BusinessException {
		AggCustinformationHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggCustinformationHVO> query = new BillLazyQuery<AggCustinformationHVO>(
					AggCustinformationHVO.class);
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
	public AggCustinformationHVO[] pubsendapprovebills(AggCustinformationHVO[] clientFullVOs,
			AggCustinformationHVO[] originBills) throws BusinessException {
		// 加锁 + 检查ts
		BillTransferTool<AggCustinformationHVO> transferTool = new BillTransferTool<AggCustinformationHVO>(
				clientFullVOs);
		AceCustinformationHVOSendApproveBP bp = new AceCustinformationHVOSendApproveBP();
		AggCustinformationHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// 收回
	public AggCustinformationHVO[] pubunsendapprovebills(AggCustinformationHVO[] clientFullVOs,
			AggCustinformationHVO[] originBills) throws BusinessException {
		// 加锁 + 检查ts
		BillTransferTool<AggCustinformationHVO> transferTool = new BillTransferTool<AggCustinformationHVO>(
				clientFullVOs);
		AceCustinformationHVOUnSendApproveBP bp = new AceCustinformationHVOUnSendApproveBP();
		AggCustinformationHVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// 审批
	public AggCustinformationHVO[] pubapprovebills(AggCustinformationHVO[] clientFullVOs,
			AggCustinformationHVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 加锁 + 检查ts
		BillTransferTool<AggCustinformationHVO> transferTool = new BillTransferTool<AggCustinformationHVO>(
				clientFullVOs);
		AceCustinformationHVOApproveBP bp = new AceCustinformationHVOApproveBP();
		AggCustinformationHVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// 弃审

	public AggCustinformationHVO[] pubunapprovebills(AggCustinformationHVO[] clientFullVOs,
			AggCustinformationHVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 加锁 + 检查ts
		BillTransferTool<AggCustinformationHVO> transferTool = new BillTransferTool<AggCustinformationHVO>(
				clientFullVOs);
		AceCustinformationHVOUnApproveBP bp = new AceCustinformationHVOUnApproveBP();
		AggCustinformationHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}