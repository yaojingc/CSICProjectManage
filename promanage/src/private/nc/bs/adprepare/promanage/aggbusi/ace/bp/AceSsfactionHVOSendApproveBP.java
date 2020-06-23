
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceSsfactionHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggSsfactionHVO[] sendApprove(AggSsfactionHVO[] clientBills,
                        AggSsfactionHVO[] originBills) {
                for (AggSsfactionHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggSsfactionHVO[] returnVos = new BillUpdate<AggSsfactionHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
