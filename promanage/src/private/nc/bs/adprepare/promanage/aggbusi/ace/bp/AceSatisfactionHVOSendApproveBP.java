
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据送审的BP
 */
public class AceSatisfactionHVOSendApproveBP {
        /**
         * 送审动作
         *
         * @param vos
         *            单据VO数组
         * @param script
         *            单据动作脚本对象
         * @return 送审后的单据VO数组
         */

        public AggSatisfactionHVO[] sendApprove(AggSatisfactionHVO[] clientBills,
                        AggSatisfactionHVO[] originBills) {
                for (AggSatisfactionHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // 数据持久化
                AggSatisfactionHVO[] returnVos = new BillUpdate<AggSatisfactionHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
