
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.custregister.AggCustregisterHVO;

/**
 * 标准单据审核的BP
 */
public class AceCustregisterHVOApproveBP {

        /**
         * 审核动作
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggCustregisterHVO[] approve(AggCustregisterHVO[] clientBills,
                        AggCustregisterHVO[] originBills) {
                for (AggCustregisterHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggCustregisterHVO> update = new BillUpdate<AggCustregisterHVO>();
                AggCustregisterHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
