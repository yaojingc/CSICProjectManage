
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceSsfactionHVOUnSendApproveBP {

        public AggSsfactionHVO[] unSend(AggSsfactionHVO[] clientBills,
                        AggSsfactionHVO[] originBills) {
                // 把VO持久化到数据库中
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggSsfactionHVO> update = new BillUpdate<AggSsfactionHVO>();
                AggSsfactionHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggSsfactionHVO[] clientBills) {
                for (AggSsfactionHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
