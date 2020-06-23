
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiTenprojectplanHVOPubServiceImpl;
import nc.itf.adprepare.promanage.ITenprojectplanhvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.pub.BusinessException;

public class TenprojectplanhvoMaintainImpl extends AceAggbusiTenprojectplanHVOPubServiceImpl implements ITenprojectplanhvoMaintain  {

        @Override
        public void delete(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggTenprojectplanHVO[] insert(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggTenprojectplanHVO[] update(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggTenprojectplanHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggTenprojectplanHVO[] save(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggTenprojectplanHVO[] unsave(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggTenprojectplanHVO[] approve(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggTenprojectplanHVO[] unapprove(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
