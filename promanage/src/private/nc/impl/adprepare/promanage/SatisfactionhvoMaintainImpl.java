
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiSatisfactionHVOPubServiceImpl;
import nc.itf.adprepare.promanage.ISatisfactionhvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.vo.pub.BusinessException;

public class SatisfactionhvoMaintainImpl extends AceAggbusiSatisfactionHVOPubServiceImpl implements ISatisfactionhvoMaintain  {

        @Override
        public void delete(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggSatisfactionHVO[] insert(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggSatisfactionHVO[] update(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggSatisfactionHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggSatisfactionHVO[] save(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggSatisfactionHVO[] unsave(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggSatisfactionHVO[] approve(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggSatisfactionHVO[] unapprove(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
