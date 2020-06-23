
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiProstartHVOPubServiceImpl;
import nc.itf.adprepare.promanage.IProstarthvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.vo.pub.BusinessException;

public class ProstarthvoMaintainImpl extends AceAggbusiProstartHVOPubServiceImpl implements IProstarthvoMaintain  {

        @Override
        public void delete(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggProstartHVO[] insert(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggProstartHVO[] update(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggProstartHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggProstartHVO[] save(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggProstartHVO[] unsave(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggProstartHVO[] approve(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggProstartHVO[] unapprove(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
