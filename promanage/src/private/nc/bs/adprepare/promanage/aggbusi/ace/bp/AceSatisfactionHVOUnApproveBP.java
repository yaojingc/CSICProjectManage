
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceSatisfactionHVOUnApproveBP {

        public AggSatisfactionHVO[] unApprove(AggSatisfactionHVO[] clientBills,
                        AggSatisfactionHVO[] originBills) {
                for (AggSatisfactionHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggSatisfactionHVO> update = new BillUpdate<AggSatisfactionHVO>();
                AggSatisfactionHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
