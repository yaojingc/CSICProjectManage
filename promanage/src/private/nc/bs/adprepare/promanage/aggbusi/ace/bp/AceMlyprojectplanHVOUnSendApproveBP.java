
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼�����ջص�BP
 */
public class AceMlyprojectplanHVOUnSendApproveBP {

        public AggMlyprojectplanHVO[] unSend(AggMlyprojectplanHVO[] clientBills,
                        AggMlyprojectplanHVO[] originBills) {
                // ��VO�־û������ݿ���
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
