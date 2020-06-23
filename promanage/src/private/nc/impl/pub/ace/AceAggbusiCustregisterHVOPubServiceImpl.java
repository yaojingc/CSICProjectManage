
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustregisterHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustregisterHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustregisterHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustregisterHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustregisterHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustregisterHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceCustregisterHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiCustregisterHVOPubServiceImpl {
        // 新增
        public AggCustregisterHVO[] pubinsertBills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggCustregisterHVO> transferTool = new BillTransferTool<AggCustregisterHVO>(
                                                clientFullVOs);
                                // 调用BP
                                AceCustregisterHVOInsertBP action = new AceCustregisterHVOInsertBP();
                                AggCustregisterHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggCustregisterHVO> transferTool =
                        new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                        // 调用BP
                        new AceCustregisterHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggCustregisterHVO[] pubupdateBills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggCustregisterHVO> transferTool = new BillTransferTool<AggCustregisterHVO>(
                                        clientFullVOs);
                        AceCustregisterHVOUpdateBP bp = new AceCustregisterHVOUpdateBP();
                        AggCustregisterHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggCustregisterHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggCustregisterHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggCustregisterHVO> query = new BillLazyQuery<AggCustregisterHVO>(
                                        AggCustregisterHVO.class);
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
        public AggCustregisterHVO[] pubsendapprovebills(
                        AggCustregisterHVO[] clientFullVOs, AggCustregisterHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggCustregisterHVO> transferTool =
                new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                AceCustregisterHVOSendApproveBP bp = new AceCustregisterHVOSendApproveBP();
                AggCustregisterHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggCustregisterHVO[] pubunsendapprovebills(
                        AggCustregisterHVO[] clientFullVOs, AggCustregisterHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggCustregisterHVO> transferTool =
                        new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                AceCustregisterHVOUnSendApproveBP bp = new AceCustregisterHVOUnSendApproveBP();
                AggCustregisterHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggCustregisterHVO[] pubapprovebills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggCustregisterHVO> transferTool =
                        new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                AceCustregisterHVOApproveBP bp = new AceCustregisterHVOApproveBP();
                AggCustregisterHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggCustregisterHVO[] pubunapprovebills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggCustregisterHVO> transferTool =
                        new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                AceCustregisterHVOUnApproveBP bp = new AceCustregisterHVOUnApproveBP();
                AggCustregisterHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}