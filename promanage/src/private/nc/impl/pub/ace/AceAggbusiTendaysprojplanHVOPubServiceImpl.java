
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTendaysprojplanHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTendaysprojplanHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTendaysprojplanHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTendaysprojplanHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTendaysprojplanHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTendaysprojplanHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTendaysprojplanHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiTendaysprojplanHVOPubServiceImpl {
        // 新增
        public AggTendaysprojplanHVO[] pubinsertBills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggTendaysprojplanHVO> transferTool = new BillTransferTool<AggTendaysprojplanHVO>(
                                                clientFullVOs);
                                // 调用BP
                                AceTendaysprojplanHVOInsertBP action = new AceTendaysprojplanHVOInsertBP();
                                AggTendaysprojplanHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggTendaysprojplanHVO> transferTool =
                        new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                        // 调用BP
                        new AceTendaysprojplanHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggTendaysprojplanHVO[] pubupdateBills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggTendaysprojplanHVO> transferTool = new BillTransferTool<AggTendaysprojplanHVO>(
                                        clientFullVOs);
                        AceTendaysprojplanHVOUpdateBP bp = new AceTendaysprojplanHVOUpdateBP();
                        AggTendaysprojplanHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggTendaysprojplanHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggTendaysprojplanHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggTendaysprojplanHVO> query = new BillLazyQuery<AggTendaysprojplanHVO>(
                                        AggTendaysprojplanHVO.class);
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
        public AggTendaysprojplanHVO[] pubsendapprovebills(
                        AggTendaysprojplanHVO[] clientFullVOs, AggTendaysprojplanHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggTendaysprojplanHVO> transferTool =
                new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                AceTendaysprojplanHVOSendApproveBP bp = new AceTendaysprojplanHVOSendApproveBP();
                AggTendaysprojplanHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggTendaysprojplanHVO[] pubunsendapprovebills(
                        AggTendaysprojplanHVO[] clientFullVOs, AggTendaysprojplanHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggTendaysprojplanHVO> transferTool =
                        new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                AceTendaysprojplanHVOUnSendApproveBP bp = new AceTendaysprojplanHVOUnSendApproveBP();
                AggTendaysprojplanHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggTendaysprojplanHVO[] pubapprovebills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggTendaysprojplanHVO> transferTool =
                        new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                AceTendaysprojplanHVOApproveBP bp = new AceTendaysprojplanHVOApproveBP();
                AggTendaysprojplanHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggTendaysprojplanHVO[] pubunapprovebills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggTendaysprojplanHVO> transferTool =
                        new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                AceTendaysprojplanHVOUnApproveBP bp = new AceTendaysprojplanHVOUnApproveBP();
                AggTendaysprojplanHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}