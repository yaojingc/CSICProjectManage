
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceProfinishHVOUnApproveBP {

        public AggProfinishHVO[] unApprove(AggProfinishHVO[] clientBills,
                        AggProfinishHVO[] originBills) {
                for (AggProfinishHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggProfinishHVO> update = new BillUpdate<AggProfinishHVO>();
                AggProfinishHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
