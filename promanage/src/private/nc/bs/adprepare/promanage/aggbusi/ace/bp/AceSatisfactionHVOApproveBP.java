
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;

/**
 * ��׼������˵�BP
 */
public class AceSatisfactionHVOApproveBP {

        /**
         * ��˶���
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggSatisfactionHVO[] approve(AggSatisfactionHVO[] clientBills,
                        AggSatisfactionHVO[] originBills) {
                for (AggSatisfactionHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggSatisfactionHVO> update = new BillUpdate<AggSatisfactionHVO>();
                AggSatisfactionHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
