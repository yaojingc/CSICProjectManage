
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSsfactionHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSsfactionHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSsfactionHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSsfactionHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSsfactionHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSsfactionHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceSsfactionHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiSsfactionHVOPubServiceImpl {
        // 新增
        public AggSsfactionHVO[] pubinsertBills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggSsfactionHVO> transferTool = new BillTransferTool<AggSsfactionHVO>(
                                                clientFullVOs);
                                // 调用BP
                                AceSsfactionHVOInsertBP action = new AceSsfactionHVOInsertBP();
                                AggSsfactionHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggSsfactionHVO> transferTool =
                        new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                        // 调用BP
                        new AceSsfactionHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggSsfactionHVO[] pubupdateBills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggSsfactionHVO> transferTool = new BillTransferTool<AggSsfactionHVO>(
                                        clientFullVOs);
                        AceSsfactionHVOUpdateBP bp = new AceSsfactionHVOUpdateBP();
                        AggSsfactionHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggSsfactionHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggSsfactionHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggSsfactionHVO> query = new BillLazyQuery<AggSsfactionHVO>(
                                        AggSsfactionHVO.class);
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
        public AggSsfactionHVO[] pubsendapprovebills(
                        AggSsfactionHVO[] clientFullVOs, AggSsfactionHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggSsfactionHVO> transferTool =
                new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                AceSsfactionHVOSendApproveBP bp = new AceSsfactionHVOSendApproveBP();
                AggSsfactionHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggSsfactionHVO[] pubunsendapprovebills(
                        AggSsfactionHVO[] clientFullVOs, AggSsfactionHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggSsfactionHVO> transferTool =
                        new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                AceSsfactionHVOUnSendApproveBP bp = new AceSsfactionHVOUnSendApproveBP();
                AggSsfactionHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggSsfactionHVO[] pubapprovebills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggSsfactionHVO> transferTool =
                        new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                AceSsfactionHVOApproveBP bp = new AceSsfactionHVOApproveBP();
                AggSsfactionHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggSsfactionHVO[] pubunapprovebills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggSsfactionHVO> transferTool =
                        new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                AceSsfactionHVOUnApproveBP bp = new AceSsfactionHVOUnApproveBP();
                AggSsfactionHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}