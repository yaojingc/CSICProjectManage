
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceTendaysprojplanHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggTendaysprojplanHVO[] sendApprove(AggTendaysprojplanHVO[] clientBills,
                        AggTendaysprojplanHVO[] originBills) {
                for (AggTendaysprojplanHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggTendaysprojplanHVO[] returnVos = new BillUpdate<AggTendaysprojplanHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
