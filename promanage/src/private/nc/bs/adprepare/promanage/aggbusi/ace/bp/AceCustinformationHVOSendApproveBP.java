
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceCustinformationHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggCustinformationHVO[] sendApprove(AggCustinformationHVO[] clientBills,
                        AggCustinformationHVO[] originBills) {
                for (AggCustinformationHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggCustinformationHVO[] returnVos = new BillUpdate<AggCustinformationHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
