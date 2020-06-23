
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceMarketprojectHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggMarketprojectHVO[] sendApprove(AggMarketprojectHVO[] clientBills,
                        AggMarketprojectHVO[] originBills) {
                for (AggMarketprojectHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggMarketprojectHVO[] returnVos = new BillUpdate<AggMarketprojectHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
