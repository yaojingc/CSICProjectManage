
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
        // ����
        public AggTendaysprojplanHVO[] pubinsertBills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
                                BillTransferTool<AggTendaysprojplanHVO> transferTool = new BillTransferTool<AggTendaysprojplanHVO>(
                                                clientFullVOs);
                                // ����BP
                                AceTendaysprojplanHVOInsertBP action = new AceTendaysprojplanHVOInsertBP();
                                AggTendaysprojplanHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                    BillTransferTool<AggTendaysprojplanHVO> transferTool =
                        new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                        // ����BP
                        new AceTendaysprojplanHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // �޸�
        public AggTendaysprojplanHVO[] pubupdateBills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                        BillTransferTool<AggTendaysprojplanHVO> transferTool = new BillTransferTool<AggTendaysprojplanHVO>(
                                        clientFullVOs);
                        AceTendaysprojplanHVOUpdateBP bp = new AceTendaysprojplanHVOUpdateBP();
                        AggTendaysprojplanHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // ���췵������
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
         * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
         * 
         * @param queryScheme
         */
        protected void preQuery(IQueryScheme queryScheme) {
                // ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
        }

        // �ύ
        public AggTendaysprojplanHVO[] pubsendapprovebills(
                        AggTendaysprojplanHVO[] clientFullVOs, AggTendaysprojplanHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
        BillTransferTool<AggTendaysprojplanHVO> transferTool =
                new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                AceTendaysprojplanHVOSendApproveBP bp = new AceTendaysprojplanHVOSendApproveBP();
                AggTendaysprojplanHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // �ջ�
        public AggTendaysprojplanHVO[] pubunsendapprovebills(
                        AggTendaysprojplanHVO[] clientFullVOs, AggTendaysprojplanHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
                BillTransferTool<AggTendaysprojplanHVO> transferTool =
                        new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                AceTendaysprojplanHVOUnSendApproveBP bp = new AceTendaysprojplanHVOUnSendApproveBP();
                AggTendaysprojplanHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // ����
        public AggTendaysprojplanHVO[] pubapprovebills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggTendaysprojplanHVO> transferTool =
                        new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                AceTendaysprojplanHVOApproveBP bp = new AceTendaysprojplanHVOApproveBP();
                AggTendaysprojplanHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // ����

        public AggTendaysprojplanHVO[] pubunapprovebills(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggTendaysprojplanHVO> transferTool =
                        new BillTransferTool<AggTendaysprojplanHVO>(clientFullVOs);
                AceTendaysprojplanHVOUnApproveBP bp = new AceTendaysprojplanHVOUnApproveBP();
                AggTendaysprojplanHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}