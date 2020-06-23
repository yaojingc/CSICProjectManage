
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceTendaysprojplanHVOUnApproveBP {

        public AggTendaysprojplanHVO[] unApprove(AggTendaysprojplanHVO[] clientBills,
                        AggTendaysprojplanHVO[] originBills) {
                for (AggTendaysprojplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggTendaysprojplanHVO> update = new BillUpdate<AggTendaysprojplanHVO>();
                AggTendaysprojplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
