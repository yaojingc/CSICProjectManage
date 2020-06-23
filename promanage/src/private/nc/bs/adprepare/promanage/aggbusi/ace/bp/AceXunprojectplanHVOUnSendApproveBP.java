
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceXunprojectplanHVOUnSendApproveBP {

        public AggXunprojectplanHVO[] unSend(AggXunprojectplanHVO[] clientBills,
                        AggXunprojectplanHVO[] originBills) {
                // 把VO持久化到数据库中
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggXunprojectplanHVO> update = new BillUpdate<AggXunprojectplanHVO>();
                AggXunprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggXunprojectplanHVO[] clientBills) {
                for (AggXunprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
