
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;

/**
 * 标准单据审核的BP
 */
public class AceSsfactionHVOApproveBP {

        /**
         * 审核动作
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggSsfactionHVO[] approve(AggSsfactionHVO[] clientBills,
                        AggSsfactionHVO[] originBills) {
                for (AggSsfactionHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggSsfactionHVO> update = new BillUpdate<AggSsfactionHVO>();
                AggSsfactionHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
