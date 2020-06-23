
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiSsfactionHVOPubServiceImpl;
import nc.itf.adprepare.promanage.ISsfactionhvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.vo.pub.BusinessException;

public class SsfactionhvoMaintainImpl extends AceAggbusiSsfactionHVOPubServiceImpl implements ISsfactionhvoMaintain  {

        @Override
        public void delete(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggSsfactionHVO[] insert(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggSsfactionHVO[] update(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggSsfactionHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggSsfactionHVO[] save(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggSsfactionHVO[] unsave(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggSsfactionHVO[] approve(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggSsfactionHVO[] unapprove(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
