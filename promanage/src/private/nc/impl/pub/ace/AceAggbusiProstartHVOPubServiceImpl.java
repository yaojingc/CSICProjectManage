
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProstartHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProstartHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProstartHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProstartHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProstartHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProstartHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProstartHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiProstartHVOPubServiceImpl {
        // 新增
        public AggProstartHVO[] pubinsertBills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggProstartHVO> transferTool = new BillTransferTool<AggProstartHVO>(
                                                clientFullVOs);
                                // 调用BP
                                AceProstartHVOInsertBP action = new AceProstartHVOInsertBP();
                                AggProstartHVO[] retvos = action.insert(clientFullVOs);
                                // 构造返回数据
        //                      return transferTool.getBillForToClient(retvos);
                                return retvos;
                        }
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        // 删除
        public void pubdeleteBills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggProstartHVO> transferTool =
                        new BillTransferTool<AggProstartHVO>(clientFullVOs);
                        // 调用BP
                        new AceProstartHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggProstartHVO[] pubupdateBills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggProstartHVO> transferTool = new BillTransferTool<AggProstartHVO>(
                                        clientFullVOs);
                        AceProstartHVOUpdateBP bp = new AceProstartHVOUpdateBP();
                        AggProstartHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggProstartHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggProstartHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggProstartHVO> query = new BillLazyQuery<AggProstartHVO>(
                                        AggProstartHVO.class);
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
        public AggProstartHVO[] pubsendapprovebills(
                        AggProstartHVO[] clientFullVOs, AggProstartHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggProstartHVO> transferTool =
                new BillTransferTool<AggProstartHVO>(clientFullVOs);
                AceProstartHVOSendApproveBP bp = new AceProstartHVOSendApproveBP();
                AggProstartHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggProstartHVO[] pubunsendapprovebills(
                        AggProstartHVO[] clientFullVOs, AggProstartHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggProstartHVO> transferTool =
                        new BillTransferTool<AggProstartHVO>(clientFullVOs);
                AceProstartHVOUnSendApproveBP bp = new AceProstartHVOUnSendApproveBP();
                AggProstartHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggProstartHVO[] pubapprovebills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggProstartHVO> transferTool =
                        new BillTransferTool<AggProstartHVO>(clientFullVOs);
                AceProstartHVOApproveBP bp = new AceProstartHVOApproveBP();
                AggProstartHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggProstartHVO[] pubunapprovebills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggProstartHVO> transferTool =
                        new BillTransferTool<AggProstartHVO>(clientFullVOs);
                AceProstartHVOUnApproveBP bp = new AceProstartHVOUnApproveBP();
                AggProstartHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}