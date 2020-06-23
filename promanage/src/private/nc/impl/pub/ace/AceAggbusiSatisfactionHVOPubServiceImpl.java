
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSatisfactionHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSatisfactionHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSatisfactionHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSatisfactionHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSatisfactionHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSatisfactionHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSatisfactionHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiSatisfactionHVOPubServiceImpl {
        // 新增
        public AggSatisfactionHVO[] pubinsertBills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggSatisfactionHVO> transferTool = new BillTransferTool<AggSatisfactionHVO>(
                                                clientFullVOs);
                                // 调用BP
                                AceSatisfactionHVOInsertBP action = new AceSatisfactionHVOInsertBP();
                                AggSatisfactionHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggSatisfactionHVO> transferTool =
                        new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                        // 调用BP
                        new AceSatisfactionHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggSatisfactionHVO[] pubupdateBills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggSatisfactionHVO> transferTool = new BillTransferTool<AggSatisfactionHVO>(
                                        clientFullVOs);
                        AceSatisfactionHVOUpdateBP bp = new AceSatisfactionHVOUpdateBP();
                        AggSatisfactionHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggSatisfactionHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggSatisfactionHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggSatisfactionHVO> query = new BillLazyQuery<AggSatisfactionHVO>(
                                        AggSatisfactionHVO.class);
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
        public AggSatisfactionHVO[] pubsendapprovebills(
                        AggSatisfactionHVO[] clientFullVOs, AggSatisfactionHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggSatisfactionHVO> transferTool =
                new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                AceSatisfactionHVOSendApproveBP bp = new AceSatisfactionHVOSendApproveBP();
                AggSatisfactionHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggSatisfactionHVO[] pubunsendapprovebills(
                        AggSatisfactionHVO[] clientFullVOs, AggSatisfactionHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggSatisfactionHVO> transferTool =
                        new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                AceSatisfactionHVOUnSendApproveBP bp = new AceSatisfactionHVOUnSendApproveBP();
                AggSatisfactionHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggSatisfactionHVO[] pubapprovebills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggSatisfactionHVO> transferTool =
                        new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                AceSatisfactionHVOApproveBP bp = new AceSatisfactionHVOApproveBP();
                AggSatisfactionHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggSatisfactionHVO[] pubunapprovebills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggSatisfactionHVO> transferTool =
                        new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                AceSatisfactionHVOUnApproveBP bp = new AceSatisfactionHVOUnApproveBP();
                AggSatisfactionHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}