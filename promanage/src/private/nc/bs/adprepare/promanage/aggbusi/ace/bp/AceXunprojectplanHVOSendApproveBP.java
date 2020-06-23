
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceXunprojectplanHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggXunprojectplanHVO[] sendApprove(AggXunprojectplanHVO[] clientBills,
                        AggXunprojectplanHVO[] originBills) {
                for (AggXunprojectplanHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggXunprojectplanHVO[] returnVos = new BillUpdate<AggXunprojectplanHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
