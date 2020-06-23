
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceProstartHVOUnApproveBP {

        public AggProstartHVO[] unApprove(AggProstartHVO[] clientBills,
                        AggProstartHVO[] originBills) {
                for (AggProstartHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggProstartHVO> update = new BillUpdate<AggProstartHVO>();
                AggProstartHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
