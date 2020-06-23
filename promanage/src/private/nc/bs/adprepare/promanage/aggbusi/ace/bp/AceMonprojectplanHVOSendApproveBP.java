
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AceMonprojectplanHVOSendApproveBP {
        /**
         * ������
         *
         * @param vos
         *            ����VO����
         * @param script
         *            ���ݶ����ű�����
         * @return �����ĵ���VO����
         */

        public AggMonprojectplanHVO[] sendApprove(AggMonprojectplanHVO[] clientBills,
                        AggMonprojectplanHVO[] originBills) {
                for (AggMonprojectplanHVO clientFullVO : clientBills) {
                        clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
                                        BillStatusEnum.COMMIT.value());
                        clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
                }
                // ���ݳ־û�
                AggMonprojectplanHVO[] returnVos = new BillUpdate<AggMonprojectplanHVO>().update(
                                clientBills, originBills);
                return returnVos;
        }
}
