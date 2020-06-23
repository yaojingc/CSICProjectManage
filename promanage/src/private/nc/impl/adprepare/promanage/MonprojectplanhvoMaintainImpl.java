
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiMonprojectplanHVOPubServiceImpl;
import nc.itf.adprepare.promanage.IMonprojectplanhvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.pub.BusinessException;

public class MonprojectplanhvoMaintainImpl extends AceAggbusiMonprojectplanHVOPubServiceImpl implements IMonprojectplanhvoMaintain  {

        @Override
        public void delete(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggMonprojectplanHVO[] insert(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggMonprojectplanHVO[] update(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggMonprojectplanHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggMonprojectplanHVO[] save(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggMonprojectplanHVO[] unsave(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggMonprojectplanHVO[] approve(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggMonprojectplanHVO[] unapprove(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
