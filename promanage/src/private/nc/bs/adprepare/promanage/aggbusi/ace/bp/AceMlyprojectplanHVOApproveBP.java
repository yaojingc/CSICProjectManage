
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;

/**
 * ��׼������˵�BP
 */
public class AceMlyprojectplanHVOApproveBP {

        /**
         * ��˶���
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggMlyprojectplanHVO[] approve(AggMlyprojectplanHVO[] clientBills,
                        AggMlyprojectplanHVO[] originBills) {
                for (AggMlyprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggMlyprojectplanHVO> update = new BillUpdate<AggMlyprojectplanHVO>();
                AggMlyprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
