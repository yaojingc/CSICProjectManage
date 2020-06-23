
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceMonprojectplanHVOUnSendApproveBP {

        public AggMonprojectplanHVO[] unSend(AggMonprojectplanHVO[] clientBills,
                        AggMonprojectplanHVO[] originBills) {
                // 把VO持久化到数据库中
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggMonprojectplanHVO> update = new BillUpdate<AggMonprojectplanHVO>();
                AggMonprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggMonprojectplanHVO[] clientBills) {
                for (AggMonprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
