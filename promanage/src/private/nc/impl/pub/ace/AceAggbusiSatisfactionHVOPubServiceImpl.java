
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
        // ����
        public AggSatisfactionHVO[] pubinsertBills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
                                BillTransferTool<AggSatisfactionHVO> transferTool = new BillTransferTool<AggSatisfactionHVO>(
                                                clientFullVOs);
                                // ����BP
                                AceSatisfactionHVOInsertBP action = new AceSatisfactionHVOInsertBP();
                                AggSatisfactionHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                    BillTransferTool<AggSatisfactionHVO> transferTool =
                        new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                        // ����BP
                        new AceSatisfactionHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // �޸�
        public AggSatisfactionHVO[] pubupdateBills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                        BillTransferTool<AggSatisfactionHVO> transferTool = new BillTransferTool<AggSatisfactionHVO>(
                                        clientFullVOs);
                        AceSatisfactionHVOUpdateBP bp = new AceSatisfactionHVOUpdateBP();
                        AggSatisfactionHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // ���췵������
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
         * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
         * 
         * @param queryScheme
         */
        protected void preQuery(IQueryScheme queryScheme) {
                // ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
        }

        // �ύ
        public AggSatisfactionHVO[] pubsendapprovebills(
                        AggSatisfactionHVO[] clientFullVOs, AggSatisfactionHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
        BillTransferTool<AggSatisfactionHVO> transferTool =
                new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                AceSatisfactionHVOSendApproveBP bp = new AceSatisfactionHVOSendApproveBP();
                AggSatisfactionHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // �ջ�
        public AggSatisfactionHVO[] pubunsendapprovebills(
                        AggSatisfactionHVO[] clientFullVOs, AggSatisfactionHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
                BillTransferTool<AggSatisfactionHVO> transferTool =
                        new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                AceSatisfactionHVOUnSendApproveBP bp = new AceSatisfactionHVOUnSendApproveBP();
                AggSatisfactionHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // ����
        public AggSatisfactionHVO[] pubapprovebills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggSatisfactionHVO> transferTool =
                        new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                AceSatisfactionHVOApproveBP bp = new AceSatisfactionHVOApproveBP();
                AggSatisfactionHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // ����

        public AggSatisfactionHVO[] pubunapprovebills(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggSatisfactionHVO> transferTool =
                        new BillTransferTool<AggSatisfactionHVO>(clientFullVOs);
                AceSatisfactionHVOUnApproveBP bp = new AceSatisfactionHVOUnApproveBP();
                AggSatisfactionHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}