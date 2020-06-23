
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;

/**
 * 标准单据审核的BP
 */
public class AceProfinishHVOApproveBP {

        /**
         * 审核动作
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
