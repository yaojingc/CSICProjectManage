
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;

/**
 * ��׼������˵�BP
 */
public class AceProfinishHVOApproveBP {

        /**
         * ��˶���
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggProfinishHVO[] approve(AggProfinishHVO[] clientBills,
                        AggProfinishHVO[] originBills) {
                for (AggProfinishHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggProfinishHVO> update = new BillUpdate<AggProfinishHVO>();
                AggProfinishHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
