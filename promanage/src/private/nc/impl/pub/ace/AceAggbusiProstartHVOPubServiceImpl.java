
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
        // ����
        public AggProstartHVO[] pubinsertBills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
                                BillTransferTool<AggProstartHVO> transferTool = new BillTransferTool<AggProstartHVO>(
                                                clientFullVOs);
                                // ����BP
                                AceProstartHVOInsertBP action = new AceProstartHVOInsertBP();
                                AggProstartHVO[] retvos = action.insert(clientFullVOs);
                                // ���췵������
        //                      return transferTool.getBillForToClient(retvos);
                                return retvos;
                        }
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        // ɾ��
        public void pubdeleteBills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                    BillTransferTool<AggProstartHVO> transferTool =
                        new BillTransferTool<AggProstartHVO>(clientFullVOs);
                        // ����BP
                        new AceProstartHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // �޸�
        public AggProstartHVO[] pubupdateBills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                        BillTransferTool<AggProstartHVO> transferTool = new BillTransferTool<AggProstartHVO>(
                                        clientFullVOs);
                        AceProstartHVOUpdateBP bp = new AceProstartHVOUpdateBP();
                        AggProstartHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // ���췵������
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
         * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
         * 
         * @param queryScheme
         */
        protected void preQuery(IQueryScheme queryScheme) {
                // ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
        }

        // �ύ
        public AggProstartHVO[] pubsendapprovebills(
                        AggProstartHVO[] clientFullVOs, AggProstartHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
        BillTransferTool<AggProstartHVO> transferTool =
                new BillTransferTool<AggProstartHVO>(clientFullVOs);
                AceProstartHVOSendApproveBP bp = new AceProstartHVOSendApproveBP();
                AggProstartHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // �ջ�
        public AggProstartHVO[] pubunsendapprovebills(
                        AggProstartHVO[] clientFullVOs, AggProstartHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
                BillTransferTool<AggProstartHVO> transferTool =
                        new BillTransferTool<AggProstartHVO>(clientFullVOs);
                AceProstartHVOUnSendApproveBP bp = new AceProstartHVOUnSendApproveBP();
                AggProstartHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // ����
        public AggProstartHVO[] pubapprovebills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggProstartHVO> transferTool =
                        new BillTransferTool<AggProstartHVO>(clientFullVOs);
                AceProstartHVOApproveBP bp = new AceProstartHVOApproveBP();
                AggProstartHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // ����

        public AggProstartHVO[] pubunapprovebills(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggProstartHVO> transferTool =
                        new BillTransferTool<AggProstartHVO>(clientFullVOs);
                AceProstartHVOUnApproveBP bp = new AceProstartHVOUnApproveBP();
                AggProstartHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}