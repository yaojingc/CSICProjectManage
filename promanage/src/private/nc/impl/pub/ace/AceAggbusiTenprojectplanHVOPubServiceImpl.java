
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTenprojectplanHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTenprojectplanHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTenprojectplanHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTenprojectplanHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTenprojectplanHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTenprojectplanHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceTenprojectplanHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiTenprojectplanHVOPubServiceImpl {
        // 新增
        public AggTenprojectplanHVO[] pubinsertBills(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // 数据库中数据和前台传递过来的差异VO合并后的结果
                                BillTransferTool<AggTenprojectplanHVO> transferTool = new BillTransferTool<AggTenprojectplanHVO>(
                                                clientFullVOs);
                                // 调用BP
                                AceTenprojectplanHVOInsertBP action = new AceTenprojectplanHVOInsertBP();
                                AggTenprojectplanHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                    BillTransferTool<AggTenprojectplanHVO> transferTool =
                        new BillTransferTool<AggTenprojectplanHVO>(clientFullVOs);
                        // 调用BP
                        new AceTenprojectplanHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // 修改
        public AggTenprojectplanHVO[] pubupdateBills(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // 加锁 + 检查ts
                        BillTransferTool<AggTenprojectplanHVO> transferTool = new BillTransferTool<AggTenprojectplanHVO>(
                                        clientFullVOs);
                        AceTenprojectplanHVOUpdateBP bp = new AceTenprojectplanHVOUpdateBP();
                        AggTenprojectplanHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // 构造返回数据
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggTenprojectplanHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggTenprojectplanHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggTenprojectplanHVO> query = new BillLazyQuery<AggTenprojectplanHVO>(
                                        AggTenprojectplanHVO.class);
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
        public AggTenprojectplanHVO[] pubsendapprovebills(
                        AggTenprojectplanHVO[] clientFullVOs, AggTenprojectplanHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
        BillTransferTool<AggTenprojectplanHVO> transferTool =
                new BillTransferTool<AggTenprojectplanHVO>(clientFullVOs);
                AceTenprojectplanHVOSendApproveBP bp = new AceTenprojectplanHVOSendApproveBP();
                AggTenprojectplanHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // 收回
        public AggTenprojectplanHVO[] pubunsendapprovebills(
                        AggTenprojectplanHVO[] clientFullVOs, AggTenprojectplanHVO[] originBills)
                        throws BusinessException {
                // 加锁 + 检查ts
                BillTransferTool<AggTenprojectplanHVO> transferTool =
                        new BillTransferTool<AggTenprojectplanHVO>(clientFullVOs);
                AceTenprojectplanHVOUnSendApproveBP bp = new AceTenprojectplanHVOUnSendApproveBP();
                AggTenprojectplanHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // 审批
        public AggTenprojectplanHVO[] pubapprovebills(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggTenprojectplanHVO> transferTool =
                        new BillTransferTool<AggTenprojectplanHVO>(clientFullVOs);
                AceTenprojectplanHVOApproveBP bp = new AceTenprojectplanHVOApproveBP();
                AggTenprojectplanHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // 弃审

        public AggTenprojectplanHVO[] pubunapprovebills(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 加锁 + 检查ts
                BillTransferTool<AggTenprojectplanHVO> transferTool =
                        new BillTransferTool<AggTenprojectplanHVO>(clientFullVOs);
                AceTenprojectplanHVOUnApproveBP bp = new AceTenprojectplanHVOUnApproveBP();
                AggTenprojectplanHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}