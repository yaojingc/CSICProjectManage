
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceXunprojectplanHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceXunprojectplanHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceXunprojectplanHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceXunprojectplanHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceXunprojectplanHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceXunprojectplanHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceXunprojectplanHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiXunprojectplanHVOPubServiceImpl {
        // 新增
        public AggXunprojectplanHVO[] pubinsertBills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggXunprojectplanHVO> transferTool = new BillTransferTool<AggXunprojectplanHVO>(
                                                clientFullVOs);
                                // 调用BP
                                AceXunprojectplanHVOInsertBP action = new AceXunprojectplanHVOInsertBP();
                                AggXunprojectplanHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggXunprojectplanHVO> transferTool =
                        new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                        // 调用BP
                        new AceXunprojectplanHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggXunprojectplanHVO[] pubupdateBills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggXunprojectplanHVO> transferTool = new BillTransferTool<AggXunprojectplanHVO>(
                                        clientFullVOs);
                        AceXunprojectplanHVOUpdateBP bp = new AceXunprojectplanHVOUpdateBP();
                        AggXunprojectplanHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggXunprojectplanHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggXunprojectplanHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggXunprojectplanHVO> query = new BillLazyQuery<AggXunprojectplanHVO>(
                                        AggXunprojectplanHVO.class);
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
        public AggXunprojectplanHVO[] pubsendapprovebills(
                        AggXunprojectplanHVO[] clientFullVOs, AggXunprojectplanHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggXunprojectplanHVO> transferTool =
                new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                AceXunprojectplanHVOSendApproveBP bp = new AceXunprojectplanHVOSendApproveBP();
                AggXunprojectplanHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggXunprojectplanHVO[] pubunsendapprovebills(
                        AggXunprojectplanHVO[] clientFullVOs, AggXunprojectplanHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggXunprojectplanHVO> transferTool =
                        new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                AceXunprojectplanHVOUnSendApproveBP bp = new AceXunprojectplanHVOUnSendApproveBP();
                AggXunprojectplanHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggXunprojectplanHVO[] pubapprovebills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggXunprojectplanHVO> transferTool =
                        new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                AceXunprojectplanHVOApproveBP bp = new AceXunprojectplanHVOApproveBP();
                AggXunprojectplanHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggXunprojectplanHVO[] pubunapprovebills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggXunprojectplanHVO> transferTool =
                        new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                AceXunprojectplanHVOUnApproveBP bp = new AceXunprojectplanHVOUnApproveBP();
                AggXunprojectplanHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}