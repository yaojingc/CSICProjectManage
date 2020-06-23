
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMonprojectplanHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMonprojectplanHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMonprojectplanHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMonprojectplanHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMonprojectplanHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMonprojectplanHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceMonprojectplanHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiMonprojectplanHVOPubServiceImpl {
        // 新增
        public AggMonprojectplanHVO[] pubinsertBills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggMonprojectplanHVO> transferTool = new BillTransferTool<AggMonprojectplanHVO>(
                                                clientFullVOs);
                                // 调用BP
                                AceMonprojectplanHVOInsertBP action = new AceMonprojectplanHVOInsertBP();
                                AggMonprojectplanHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggMonprojectplanHVO> transferTool =
                        new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                        // 调用BP
                        new AceMonprojectplanHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggMonprojectplanHVO[] pubupdateBills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggMonprojectplanHVO> transferTool = new BillTransferTool<AggMonprojectplanHVO>(
                                        clientFullVOs);
                        AceMonprojectplanHVOUpdateBP bp = new AceMonprojectplanHVOUpdateBP();
                        AggMonprojectplanHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggMonprojectplanHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggMonprojectplanHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggMonprojectplanHVO> query = new BillLazyQuery<AggMonprojectplanHVO>(
                                        AggMonprojectplanHVO.class);
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
        public AggMonprojectplanHVO[] pubsendapprovebills(
                        AggMonprojectplanHVO[] clientFullVOs, AggMonprojectplanHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggMonprojectplanHVO> transferTool =
                new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                AceMonprojectplanHVOSendApproveBP bp = new AceMonprojectplanHVOSendApproveBP();
                AggMonprojectplanHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggMonprojectplanHVO[] pubunsendapprovebills(
                        AggMonprojectplanHVO[] clientFullVOs, AggMonprojectplanHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggMonprojectplanHVO> transferTool =
                        new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                AceMonprojectplanHVOUnSendApproveBP bp = new AceMonprojectplanHVOUnSendApproveBP();
                AggMonprojectplanHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggMonprojectplanHVO[] pubapprovebills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggMonprojectplanHVO> transferTool =
                        new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                AceMonprojectplanHVOApproveBP bp = new AceMonprojectplanHVOApproveBP();
                AggMonprojectplanHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggMonprojectplanHVO[] pubunapprovebills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggMonprojectplanHVO> transferTool =
                        new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                AceMonprojectplanHVOUnApproveBP bp = new AceMonprojectplanHVOUnApproveBP();
                AggMonprojectplanHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}