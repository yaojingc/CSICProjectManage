
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiTendaysprojplanHVOPubServiceImpl;
import nc.itf.adprepare.promanage.ITendaysprojplanhvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.vo.pub.BusinessException;

public class TendaysprojplanhvoMaintainImpl extends AceAggbusiTendaysprojplanHVOPubServiceImpl implements ITendaysprojplanhvoMaintain  {

        @Override
        public void delete(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggTendaysprojplanHVO[] insert(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggTendaysprojplanHVO[] update(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggTendaysprojplanHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggTendaysprojplanHVO[] save(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggTendaysprojplanHVO[] unsave(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggTendaysprojplanHVO[] approve(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggTendaysprojplanHVO[] unapprove(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
