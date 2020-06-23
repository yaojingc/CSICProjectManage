
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceMlyprojectplanHVOUnSendApproveBP {

        public AggMlyprojectplanHVO[] unSend(AggMlyprojectplanHVO[] clientBills,
                        AggMlyprojectplanHVO[] originBills) {
                // 把VO持久化到数据库中
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggMlyprojectplanHVO> update = new BillUpdate<AggMlyprojectplanHVO>();
                AggMlyprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggMlyprojectplanHVO[] clientBills) {
                for (AggMlyprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
