
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼�����ջص�BP
 */
public class AceProfinishHVOUnSendApproveBP {

        public AggProfinishHVO[] unSend(AggProfinishHVO[] clientBills,
                        AggProfinishHVO[] originBills) {
                // ��VO�־û������ݿ���
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggProfinishHVO> update = new BillUpdate<AggProfinishHVO>();
                AggProfinishHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggProfinishHVO[] clientBills) {
                for (AggProfinishHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
