
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceTendaysprojplanHVOUnSendApproveBP {

        public AggTendaysprojplanHVO[] unSend(AggTendaysprojplanHVO[] clientBills,
                        AggTendaysprojplanHVO[] originBills) {
                // 把VO持久化到数据库中
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggTendaysprojplanHVO> update = new BillUpdate<AggTendaysprojplanHVO>();
                AggTendaysprojplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggTendaysprojplanHVO[] clientBills) {
                for (AggTendaysprojplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
