
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiMarketprojectHVOPubServiceImpl;
import nc.itf.adprepare.promanage.IMarketprojecthvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.vo.pub.BusinessException;

public class MarketprojecthvoMaintainImpl extends AceAggbusiMarketprojectHVOPubServiceImpl implements IMarketprojecthvoMaintain  {

        @Override
        public void delete(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggMarketprojectHVO[] insert(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggMarketprojectHVO[] update(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggMarketprojectHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggMarketprojectHVO[] save(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggMarketprojectHVO[] unsave(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggMarketprojectHVO[] approve(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggMarketprojectHVO[] unapprove(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
