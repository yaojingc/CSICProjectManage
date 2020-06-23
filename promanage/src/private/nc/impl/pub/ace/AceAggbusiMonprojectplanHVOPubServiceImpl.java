
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
        // ����
        public AggMonprojectplanHVO[] pubinsertBills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                try {
                        synchronized (clientFullVOs) {
                                // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
                                BillTransferTool<AggMonprojectplanHVO> transferTool = new BillTransferTool<AggMonprojectplanHVO>(
                                                clientFullVOs);
                                // ����BP
                                AceMonprojectplanHVOInsertBP action = new AceMonprojectplanHVOInsertBP();
                                AggMonprojectplanHVO[] retvos = action.insert(clientFullVOs);
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
        public void pubdeleteBills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                    BillTransferTool<AggMonprojectplanHVO> transferTool =
                        new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                        // ����BP
                        new AceMonprojectplanHVODeleteBP().delete(clientFullVOs);
                } catch (Exception e) {
                        ExceptionUtils.marsh(e);
                }
        }

        // �޸�
        public AggMonprojectplanHVO[] pubupdateBills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                try {
                        // ���� + ���ts
                        BillTransferTool<AggMonprojectplanHVO> transferTool = new BillTransferTool<AggMonprojectplanHVO>(
                                        clientFullVOs);
                        AceMonprojectplanHVOUpdateBP bp = new AceMonprojectplanHVOUpdateBP();
                        AggMonprojectplanHVO[] retvos = bp.update(clientFullVOs, originBills);
                        // ���췵������
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
         * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
         * 
         * @param queryScheme
         */
        protected void preQuery(IQueryScheme queryScheme) {
                // ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
        }

        // �ύ
        public AggMonprojectplanHVO[] pubsendapprovebills(
                        AggMonprojectplanHVO[] clientFullVOs, AggMonprojectplanHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
        BillTransferTool<AggMonprojectplanHVO> transferTool =
                new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                AceMonprojectplanHVOSendApproveBP bp = new AceMonprojectplanHVOSendApproveBP();
                AggMonprojectplanHVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
                return retvos;
        }

        // �ջ�
        public AggMonprojectplanHVO[] pubunsendapprovebills(
                        AggMonprojectplanHVO[] clientFullVOs, AggMonprojectplanHVO[] originBills)
                        throws BusinessException {
                // ���� + ���ts
                BillTransferTool<AggMonprojectplanHVO> transferTool =
                        new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                AceMonprojectplanHVOUnSendApproveBP bp = new AceMonprojectplanHVOUnSendApproveBP();
                AggMonprojectplanHVO[] retvos = bp.unSend(clientFullVOs, originBills);
                return retvos;
        };

        // ����
        public AggMonprojectplanHVO[] pubapprovebills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggMonprojectplanHVO> transferTool =
                        new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                AceMonprojectplanHVOApproveBP bp = new AceMonprojectplanHVOApproveBP();
                AggMonprojectplanHVO[] retvos = bp.approve(clientFullVOs, originBills);
                return retvos;
        }

        // ����

        public AggMonprojectplanHVO[] pubunapprovebills(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���� + ���ts
                BillTransferTool<AggMonprojectplanHVO> transferTool =
                        new BillTransferTool<AggMonprojectplanHVO>(clientFullVOs);
                AceMonprojectplanHVOUnApproveBP bp = new AceMonprojectplanHVOUnApproveBP();
                AggMonprojectplanHVO[] retvos = bp.unApprove(clientFullVOs, originBills);
                return retvos;
        }

}