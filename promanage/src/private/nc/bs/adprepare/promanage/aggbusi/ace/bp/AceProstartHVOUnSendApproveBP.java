
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceProstartHVOUnSendApproveBP {

        public AggProstartHVO[] unSend(AggProstartHVO[] clientBills,
                        AggProstartHVO[] originBills) {
                // 把VO持久化到数据库中
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggProstartHVO> update = new BillUpdate<AggProstartHVO>();
                AggProstartHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggProstartHVO[] clientBills) {
                for (AggProstartHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
