
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceSatisfactionHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggSatisfactionHVO[] sendApprove(AggSatisfactionHVO[] clientBills,
                        AggSatisfactionHVO[] originBills) {
                for (AggSatisfactionHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggSatisfactionHVO[] returnVos = new BillUpdate<AggSatisfactionHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
