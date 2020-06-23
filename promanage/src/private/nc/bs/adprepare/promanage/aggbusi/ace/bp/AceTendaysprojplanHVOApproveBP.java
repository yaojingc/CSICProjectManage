
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;

/**
 * 标准单据审核的BP
 */
public class AceTendaysprojplanHVOApproveBP {

        /**
         * 审核动作
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggTendaysprojplanHVO[] approve(AggTendaysprojplanHVO[] clientBills,
                        AggTendaysprojplanHVO[] originBills) {
                for (AggTendaysprojplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggTendaysprojplanHVO> update = new BillUpdate<AggTendaysprojplanHVO>();
                AggTendaysprojplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
