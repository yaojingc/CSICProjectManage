
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceMonprojectplanHVOUnApproveBP {

        public AggMonprojectplanHVO[] unApprove(AggMonprojectplanHVO[] clientBills,
                        AggMonprojectplanHVO[] originBills) {
                for (AggMonprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggMonprojectplanHVO> update = new BillUpdate<AggMonprojectplanHVO>();
                AggMonprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
