
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceProfinishHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggProfinishHVO[] sendApprove(AggProfinishHVO[] clientBills,
                        AggProfinishHVO[] originBills) {
                for (AggProfinishHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggProfinishHVO[] returnVos = new BillUpdate<AggProfinishHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
