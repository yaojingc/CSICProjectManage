
package nc.impl.pub.ace;

import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProfinishHVOApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProfinishHVODeleteBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProfinishHVOInsertBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProfinishHVOSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProfinishHVOUnApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProfinishHVOUnSendApproveBP;
import nc.bs.adprepare.promanage.aggbusi.ace.bp.AceProfinishHVOUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceAggbusiProfinishHVOPubServiceImpl {
        // ����
        public AggProfinishHVO[] pubinsertBills(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
                                BillTransferTool<AggProfinishHVO> transferTool = new BillTransferTool<AggProfinishHVO>(
                                                clientFullVOs);
                                // ����BP
                                AceProfinishHVOInsertBP action = new AceProfinishHVOInsertBP();
                                AggProfinishHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                    BillTransferTool<AggProfinishHVO> transferTool =
                        new BillTransferTool<AggProfinishHVO>(clientFullVOs);
                        // ����BP
                        new AceProfinishHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // �޸�
        public AggProfinishHVO[] pubupdateBills(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                        BillTransferTool<AggProfinishHVO> transferTool = new BillTransferTool<AggProfinishHVO>(
                                        clientFullVOs);
                        AceProfinishHVOUpdateBP bp = new AceProfinishHVOUpdateBP();
                        AggProfinishHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // ���췵������
                        return transferTool.getBillForToClient(retvos);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
                return null;
        }

        public AggProfinishHVO[] pubquerybills(IQueryScheme queryScheme)
                        throws BusinessException {
                AggProfinishHVO[] bills = null;
                try {
                        this.preQuery(queryScheme);
                        BillLazyQuery<AggProfinishHVO> query = new BillLazyQuery<AggProfinishHVO>(
                                        AggProfinishHVO.class);
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
        public AggProfinishHVO[] pubsendapprovebills(
                        AggProfinishHVO[] clientFullVOs, AggProfinishHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
        BillTransferTool<AggProfinishHVO> transferTool =
                new BillTransferTool<AggProfinishHVO>(clientFullVOs);
                AceProfinishHVOSendApproveBP bp = new AceProfinishHVOSendApproveBP();
                AggProfinishHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // �ջ�
        public AggProfinishHVO[] pubunsendapprovebills(
                        AggProfinishHVO[] clientFullVOs, AggProfinishHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
                BillTransferTool<AggProfinishHVO> transferTool =
                        new BillTransferTool<AggProfinishHVO>(clientFullVOs);
                AceProfinishHVOUnSendApproveBP bp = new AceProfinishHVOUnSendApproveBP();
                AggProfinishHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // ����
        public AggProfinishHVO[] pubapprovebills(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggProfinishHVO> transferTool =
                        new BillTransferTool<AggProfinishHVO>(clientFullVOs);
                AceProfinishHVOApproveBP bp = new AceProfinishHVOApproveBP();
                AggProfinishHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // ����

        public AggProfinishHVO[] pubunapprovebills(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggProfinishHVO> transferTool =
                        new BillTransferTool<AggProfinishHVO>(clientFullVOs);
                AceProfinishHVOUnApproveBP bp = new AceProfinishHVOUnApproveBP();
                AggProfinishHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}