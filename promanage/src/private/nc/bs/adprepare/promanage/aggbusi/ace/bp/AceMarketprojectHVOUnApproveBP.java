
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceMarketprojectHVOUnApproveBP {

        public AggMarketprojectHVO[] unApprove(AggMarketprojectHVO[] clientBills,
                        AggMarketprojectHVO[] originBills) {
                for (AggMarketprojectHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggMarketprojectHVO> update = new BillUpdate<AggMarketprojectHVO>();
                AggMarketprojectHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }
}
