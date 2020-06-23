
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiProfinishHVOPubServiceImpl;
import nc.itf.adprepare.promanage.IProfinishhvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.vo.pub.BusinessException;

public class ProfinishhvoMaintainImpl extends AceAggbusiProfinishHVOPubServiceImpl implements IProfinishhvoMaintain  {

        @Override
        public void delete(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggProfinishHVO[] insert(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggProfinishHVO[] update(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggProfinishHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggProfinishHVO[] save(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggProfinishHVO[] unsave(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggProfinishHVO[] approve(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggProfinishHVO[] unapprove(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
