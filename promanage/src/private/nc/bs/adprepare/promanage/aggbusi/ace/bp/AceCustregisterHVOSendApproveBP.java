
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceCustregisterHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggCustregisterHVO[] sendApprove(AggCustregisterHVO[] clientBills,
                        AggCustregisterHVO[] originBills) {
                for (AggCustregisterHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggCustregisterHVO[] returnVos = new BillUpdate<AggCustregisterHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
