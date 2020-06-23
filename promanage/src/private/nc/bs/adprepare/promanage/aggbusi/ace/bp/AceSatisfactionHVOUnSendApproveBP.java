
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceSatisfactionHVOUnSendApproveBP {

        public AggSatisfactionHVO[] unSend(AggSatisfactionHVO[] clientBills,
                        AggSatisfactionHVO[] originBills) {
                // 把VO持久化到数据库中
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggSatisfactionHVO> update = new BillUpdate<AggSatisfactionHVO>();
                AggSatisfactionHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggSatisfactionHVO[] clientBills) {
                for (AggSatisfactionHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
