
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceMlyprojectplanHVOUnApproveBP {

        public AggMlyprojectplanHVO[] unApprove(AggMlyprojectplanHVO[] clientBills,
                        AggMlyprojectplanHVO[] originBills) {
                for (AggMlyprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggMlyprojectplanHVO> update = new BillUpdate<AggMlyprojectplanHVO>();
                AggMlyprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
