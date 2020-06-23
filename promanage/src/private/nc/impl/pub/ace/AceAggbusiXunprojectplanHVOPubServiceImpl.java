
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
        // ����
        public AggXunprojectplanHVO[] pubinsertBills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
                                BillTransferTool<AggXunprojectplanHVO> transferTool = new BillTransferTool<AggXunprojectplanHVO>(
                                                clientFullVOs);
                                // ����BP
                                AceXunprojectplanHVOInsertBP action = new AceXunprojectplanHVOInsertBP();
                                AggXunprojectplanHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                    BillTransferTool<AggXunprojectplanHVO> transferTool =
                        new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                        // ����BP
                        new AceXunprojectplanHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // �޸�
        public AggXunprojectplanHVO[] pubupdateBills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                        BillTransferTool<AggXunprojectplanHVO> transferTool = new BillTransferTool<AggXunprojectplanHVO>(
                                        clientFullVOs);
                        AceXunprojectplanHVOUpdateBP bp = new AceXunprojectplanHVOUpdateBP();
                        AggXunprojectplanHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // ���췵������
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
         * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
         * 
         * @param queryScheme
         */
        protected void preQuery(IQueryScheme queryScheme) {
                // ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
        }

        // �ύ
        public AggXunprojectplanHVO[] pubsendapprovebills(
                        AggXunprojectplanHVO[] clientFullVOs, AggXunprojectplanHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
        BillTransferTool<AggXunprojectplanHVO> transferTool =
                new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                AceXunprojectplanHVOSendApproveBP bp = new AceXunprojectplanHVOSendApproveBP();
                AggXunprojectplanHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // �ջ�
        public AggXunprojectplanHVO[] pubunsendapprovebills(
                        AggXunprojectplanHVO[] clientFullVOs, AggXunprojectplanHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
                BillTransferTool<AggXunprojectplanHVO> transferTool =
                        new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                AceXunprojectplanHVOUnSendApproveBP bp = new AceXunprojectplanHVOUnSendApproveBP();
                AggXunprojectplanHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // ����
        public AggXunprojectplanHVO[] pubapprovebills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggXunprojectplanHVO> transferTool =
                        new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                AceXunprojectplanHVOApproveBP bp = new AceXunprojectplanHVOApproveBP();
                AggXunprojectplanHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // ����

        public AggXunprojectplanHVO[] pubunapprovebills(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggXunprojectplanHVO> transferTool =
                        new BillTransferTool<AggXunprojectplanHVO>(clientFullVOs);
                AceXunprojectplanHVOUnApproveBP bp = new AceXunprojectplanHVOUnApproveBP();
                AggXunprojectplanHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}