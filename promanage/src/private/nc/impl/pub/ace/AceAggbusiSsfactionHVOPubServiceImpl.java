
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
        // ����
        public AggSsfactionHVO[] pubinsertBills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
                                BillTransferTool<AggSsfactionHVO> transferTool = new BillTransferTool<AggSsfactionHVO>(
                                                clientFullVOs);
                                // ����BP
                                AceSsfactionHVOInsertBP action = new AceSsfactionHVOInsertBP();
                                AggSsfactionHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                    BillTransferTool<AggSsfactionHVO> transferTool =
                        new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                        // ����BP
                        new AceSsfactionHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // �޸�
        public AggSsfactionHVO[] pubupdateBills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                        BillTransferTool<AggSsfactionHVO> transferTool = new BillTransferTool<AggSsfactionHVO>(
                                        clientFullVOs);
                        AceSsfactionHVOUpdateBP bp = new AceSsfactionHVOUpdateBP();
                        AggSsfactionHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // ���췵������
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
         * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
         * 
         * @param queryScheme
         */
        protected void preQuery(IQueryScheme queryScheme) {
                // ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
        }

        // �ύ
        public AggSsfactionHVO[] pubsendapprovebills(
                        AggSsfactionHVO[] clientFullVOs, AggSsfactionHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
        BillTransferTool<AggSsfactionHVO> transferTool =
                new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                AceSsfactionHVOSendApproveBP bp = new AceSsfactionHVOSendApproveBP();
                AggSsfactionHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // �ջ�
        public AggSsfactionHVO[] pubunsendapprovebills(
                        AggSsfactionHVO[] clientFullVOs, AggSsfactionHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
                BillTransferTool<AggSsfactionHVO> transferTool =
                        new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                AceSsfactionHVOUnSendApproveBP bp = new AceSsfactionHVOUnSendApproveBP();
                AggSsfactionHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // ����
        public AggSsfactionHVO[] pubapprovebills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggSsfactionHVO> transferTool =
                        new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                AceSsfactionHVOApproveBP bp = new AceSsfactionHVOApproveBP();
                AggSsfactionHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // ����

        public AggSsfactionHVO[] pubunapprovebills(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggSsfactionHVO> transferTool =
                        new BillTransferTool<AggSsfactionHVO>(clientFullVOs);
                AceSsfactionHVOUnApproveBP bp = new AceSsfactionHVOUnApproveBP();
                AggSsfactionHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}