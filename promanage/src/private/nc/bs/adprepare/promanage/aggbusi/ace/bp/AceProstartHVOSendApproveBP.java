
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceProstartHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggProstartHVO[] sendApprove(AggProstartHVO[] clientBills,
                        AggProstartHVO[] originBills) {
                for (AggProstartHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggProstartHVO[] returnVos = new BillUpdate<AggProstartHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
