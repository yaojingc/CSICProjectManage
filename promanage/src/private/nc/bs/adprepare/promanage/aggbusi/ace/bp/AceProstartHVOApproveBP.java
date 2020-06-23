
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.projectstart.AggProstartHVO;

/**
 * ��׼������˵�BP
 */
public class AceProstartHVOApproveBP {

        /**
         * ��˶���
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggProstartHVO[] approve(AggProstartHVO[] clientBills,
                        AggProstartHVO[] originBills) {
                for (AggProstartHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggProstartHVO> update = new BillUpdate<AggProstartHVO>();
                AggProstartHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
