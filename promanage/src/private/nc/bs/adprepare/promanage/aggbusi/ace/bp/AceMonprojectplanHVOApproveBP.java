
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;

/**
 * ��׼������˵�BP
 */
public class AceMonprojectplanHVOApproveBP {

        /**
         * ��˶���
         * 
         * @param vos
         * @param script
         * @return
         */
        public AggMonprojectplanHVO[] approve(AggMonprojectplanHVO[] clientBills,
                        AggMonprojectplanHVO[] originBills) {
                for (AggMonprojectplanHVO clientBill : clientBills) {
                        clientBill.getParentVO().setStatus(VOStatus.UPDATED);
                }
                BillUpdate<AggMonprojectplanHVO> update = new BillUpdate<AggMonprojectplanHVO>();
                AggMonprojectplanHVO[] returnVos = update.update(clientBills, originBills);
                return returnVos;
        }

}
