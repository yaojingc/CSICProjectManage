
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceCustregisterHVOUnSendApproveBP {

        public AggCustregisterHVO[] unSend(AggCustregisterHVO[] clientBills,
                        AggCustregisterHVO[] originBills) {
                // 把VO持久化到数据库中
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggCustregisterHVO> update = new BillUpdate<AggCustregisterHVO>();
                AggCustregisterHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggCustregisterHVO[] clientBills) {
                for (AggCustregisterHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
