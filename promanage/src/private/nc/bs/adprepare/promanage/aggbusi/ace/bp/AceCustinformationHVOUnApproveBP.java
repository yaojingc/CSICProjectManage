
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceCustinformationHVOUnApproveBP {

        public AggCustinformationHVO[] unApprove(AggCustinformationHVO[] clientBills,
                        AggCustinformationHVO[] originBills) {
                for (AggCustinformationHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggCustinformationHVO> update = new BillUpdate<AggCustinformationHVO>();
                AggCustinformationHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
