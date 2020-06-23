
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;

/**
 * ��׼������˵�BP
 */
public class AceCustinformationHVOApproveBP {

        /**
         * ��˶���
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggCustinformationHVO[] approve(AggCustinformationHVO[] clientBills,
                        AggCustinformationHVO[] originBills) {
                for (AggCustinformationHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggCustinformationHVO> update = new BillUpdate<AggCustinformationHVO>();
                AggCustinformationHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
