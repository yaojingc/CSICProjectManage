
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceSsfactionHVOUnApproveBP {

        public AggSsfactionHVO[] unApprove(AggSsfactionHVO[] clientBills,
                        AggSsfactionHVO[] originBills) {
                for (AggSsfactionHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggSsfactionHVO> update = new BillUpdate<AggSsfactionHVO>();
                AggSsfactionHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
