
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceMlyprojectplanHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggMlyprojectplanHVO[] sendApprove(AggMlyprojectplanHVO[] clientBills,
                        AggMlyprojectplanHVO[] originBills) {
                for (AggMlyprojectplanHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggMlyprojectplanHVO[] returnVos = new BillUpdate<AggMlyprojectplanHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
