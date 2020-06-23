
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMarketprojectHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMarketprojectHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMarketprojectHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMarketprojectHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMarketprojectHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMarketprojectHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMarketprojectHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiMarketprojectHVOPubServiceImpl {
        // 新增
        public AggMarketprojectHVO[] pubinsertBills(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggMarketprojectHVO> transferTool = new BillTransferTool<AggMarketprojectHVO>(
                                                clientFullVOs);
                                // 调用BP
                                AceMarketprojectHVOInsertBP action = new AceMarketprojectHVOInsertBP();
                                AggMarketprojectHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggMarketprojectHVO> transferTool =
                        new BillTransferTool<AggMarketprojectHVO>(clientFullVOs);
                        // 调用BP
                        new AceMarketprojectHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggMarketprojectHVO[] pubupdateBills(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggMarketprojectHVO> transferTool = new BillTransferTool<AggMarketprojectHVO>(
                                        clientFullVOs);
                        AceMarketprojectHVOUpdateBP bp = new AceMarketprojectHVOUpdateBP();
                        AggMarketprojectHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggMarketprojectHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggMarketprojectHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggMarketprojectHVO> query = new BillLazyQuery<AggMarketprojectHVO>(
                                        AggMarketprojectHVO.class);
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
        public AggMarketprojectHVO[] pubsendapprovebills(
                        AggMarketprojectHVO[] clientFullVOs, AggMarketprojectHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggMarketprojectHVO> transferTool =
                new BillTransferTool<AggMarketprojectHVO>(clientFullVOs);
                AceMarketprojectHVOSendApproveBP bp = new AceMarketprojectHVOSendApproveBP();
                AggMarketprojectHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggMarketprojectHVO[] pubunsendapprovebills(
                        AggMarketprojectHVO[] clientFullVOs, AggMarketprojectHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggMarketprojectHVO> transferTool =
                        new BillTransferTool<AggMarketprojectHVO>(clientFullVOs);
                AceMarketprojectHVOUnSendApproveBP bp = new AceMarketprojectHVOUnSendApproveBP();
                AggMarketprojectHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggMarketprojectHVO[] pubapprovebills(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggMarketprojectHVO> transferTool =
                        new BillTransferTool<AggMarketprojectHVO>(clientFullVOs);
                AceMarketprojectHVOApproveBP bp = new AceMarketprojectHVOApproveBP();
                AggMarketprojectHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggMarketprojectHVO[] pubunapprovebills(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggMarketprojectHVO> transferTool =
                        new BillTransferTool<AggMarketprojectHVO>(clientFullVOs);
                AceMarketprojectHVOUnApproveBP bp = new AceMarketprojectHVOUnApproveBP();
                AggMarketprojectHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}