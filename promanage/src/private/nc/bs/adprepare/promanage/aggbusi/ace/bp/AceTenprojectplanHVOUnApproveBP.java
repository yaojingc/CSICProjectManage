
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceTenprojectplanHVOUnApproveBP {

        public AggTenprojectplanHVO[] unApprove(AggTenprojectplanHVO[] clientBills,
                        AggTenprojectplanHVO[] originBills) {
                for (AggTenprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggTenprojectplanHVO> update = new BillUpdate<AggTenprojectplanHVO>();
                AggTenprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
