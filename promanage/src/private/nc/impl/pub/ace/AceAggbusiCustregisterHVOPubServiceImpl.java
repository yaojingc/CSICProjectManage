
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
        // ����
        public AggCustregisterHVO[] pubinsertBills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
                                BillTransferTool<AggCustregisterHVO> transferTool = new BillTransferTool<AggCustregisterHVO>(
                                                clientFullVOs);
                                // ����BP
                                AceCustregisterHVOInsertBP action = new AceCustregisterHVOInsertBP();
                                AggCustregisterHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                    BillTransferTool<AggCustregisterHVO> transferTool =
                        new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                        // ����BP
                        new AceCustregisterHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // �޸�
        public AggCustregisterHVO[] pubupdateBills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                        BillTransferTool<AggCustregisterHVO> transferTool = new BillTransferTool<AggCustregisterHVO>(
                                        clientFullVOs);
                        AceCustregisterHVOUpdateBP bp = new AceCustregisterHVOUpdateBP();
                        AggCustregisterHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // ���췵������
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
         * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
         * 
         * @param queryScheme
         */
        protected void preQuery(IQueryScheme queryScheme) {
                // ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
        }

        // �ύ
        public AggCustregisterHVO[] pubsendapprovebills(
                        AggCustregisterHVO[] clientFullVOs, AggCustregisterHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
        BillTransferTool<AggCustregisterHVO> transferTool =
                new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                AceCustregisterHVOSendApproveBP bp = new AceCustregisterHVOSendApproveBP();
                AggCustregisterHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // �ջ�
        public AggCustregisterHVO[] pubunsendapprovebills(
                        AggCustregisterHVO[] clientFullVOs, AggCustregisterHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
                BillTransferTool<AggCustregisterHVO> transferTool =
                        new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                AceCustregisterHVOUnSendApproveBP bp = new AceCustregisterHVOUnSendApproveBP();
                AggCustregisterHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // ����
        public AggCustregisterHVO[] pubapprovebills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggCustregisterHVO> transferTool =
                        new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                AceCustregisterHVOApproveBP bp = new AceCustregisterHVOApproveBP();
                AggCustregisterHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // ����

        public AggCustregisterHVO[] pubunapprovebills(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggCustregisterHVO> transferTool =
                        new BillTransferTool<AggCustregisterHVO>(clientFullVOs);
                AceCustregisterHVOUnApproveBP bp = new AceCustregisterHVOUnApproveBP();
                AggCustregisterHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}