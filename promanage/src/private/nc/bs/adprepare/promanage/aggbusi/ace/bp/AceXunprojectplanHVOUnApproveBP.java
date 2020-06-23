
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceXunprojectplanHVOUnApproveBP {

        public AggXunprojectplanHVO[] unApprove(AggXunprojectplanHVO[] clientBills,
                        AggXunprojectplanHVO[] originBills) {
                for (AggXunprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggXunprojectplanHVO> update = new BillUpdate<AggXunprojectplanHVO>();
                AggXunprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
