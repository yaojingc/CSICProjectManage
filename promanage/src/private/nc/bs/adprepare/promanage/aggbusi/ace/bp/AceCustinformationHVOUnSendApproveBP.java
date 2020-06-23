
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼�����ջص�BP
 */
public class AceCustinformationHVOUnSendApproveBP {

        public AggCustinformationHVO[] unSend(AggCustinformationHVO[] clientBills,
                        AggCustinformationHVO[] originBills) {
                // ��VO�־û������ݿ���
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggCustinformationHVO> update = new BillUpdate<AggCustinformationHVO>();
                AggCustinformationHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggCustinformationHVO[] clientBills) {
                for (AggCustinformationHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
