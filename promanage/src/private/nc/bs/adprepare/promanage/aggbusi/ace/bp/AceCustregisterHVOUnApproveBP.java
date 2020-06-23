
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceCustregisterHVOUnApproveBP {

        public AggCustregisterHVO[] unApprove(AggCustregisterHVO[] clientBills,
                        AggCustregisterHVO[] originBills) {
                for (AggCustregisterHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggCustregisterHVO> update = new BillUpdate<AggCustregisterHVO>();
                AggCustregisterHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
