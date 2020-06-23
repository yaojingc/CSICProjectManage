
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceMarketprojectHVOUnSendApproveBP {

        public AggMarketprojectHVO[] unSend(AggMarketprojectHVO[] clientBills,
                        AggMarketprojectHVO[] originBills) {
                // 把VO持久化到数据库中
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggMarketprojectHVO> update = new BillUpdate<AggMarketprojectHVO>();
                AggMarketprojectHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggMarketprojectHVO[] clientBills) {
                for (AggMarketprojectHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
