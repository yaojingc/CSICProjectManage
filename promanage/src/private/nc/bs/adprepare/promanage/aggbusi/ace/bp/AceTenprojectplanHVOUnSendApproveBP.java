
package nc.bs.adprepare.promanage.aggbusi.ace.bp;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼�����ջص�BP
 */
public class AceTenprojectplanHVOUnSendApproveBP {

        public AggTenprojectplanHVO[] unSend(AggTenprojectplanHVO[] clientBills,
                        AggTenprojectplanHVO[] originBills) {
                // ��VO�־û������ݿ���
                this.setHeadVOStatus(clientBills);
                BillUpdate<AggTenprojectplanHVO> update = new BillUpdate<AggTenprojectplanHVO>();
                AggTenprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

        private void setHeadVOStatus(AggTenprojectplanHVO[] clientBills) {
                for (AggTenprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.FREE.value());
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
        }
}
