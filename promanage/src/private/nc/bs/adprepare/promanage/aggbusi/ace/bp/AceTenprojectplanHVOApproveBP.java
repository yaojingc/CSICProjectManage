
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;

/**
 * ��׼������˵�BP
 */
public class AceTenprojectplanHVOApproveBP {

        /**
         * ��˶���
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggTenprojectplanHVO[] approve(AggTenprojectplanHVO[] clientBills,
                        AggTenprojectplanHVO[] originBills) {
                for (AggTenprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggTenprojectplanHVO> update = new BillUpdate<AggTenprojectplanHVO>();
                AggTenprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
