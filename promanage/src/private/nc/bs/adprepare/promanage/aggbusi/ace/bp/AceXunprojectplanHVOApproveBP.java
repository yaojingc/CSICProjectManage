
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;

/**
 * ��׼������˵�BP
 */
public class AceXunprojectplanHVOApproveBP {

        /**
         * ��˶���
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggXunprojectplanHVO[] approve(AggXunprojectplanHVO[] clientBills,
                        AggXunprojectplanHVO[] originBills) {
                for (AggXunprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggXunprojectplanHVO> update = new BillUpdate<AggXunprojectplanHVO>();
                AggXunprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
