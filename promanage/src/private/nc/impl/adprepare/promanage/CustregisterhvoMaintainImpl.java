
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiCustregisterHVOPubServiceImpl;
import nc.itf.adprepare.promanage.ICustregisterhvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.pub.BusinessException;

public class CustregisterhvoMaintainImpl extends AceAggbusiCustregisterHVOPubServiceImpl implements ICustregisterhvoMaintain  {

        @Override
        public void delete(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggCustregisterHVO[] insert(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggCustregisterHVO[] update(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggCustregisterHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggCustregisterHVO[] save(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggCustregisterHVO[] unsave(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggCustregisterHVO[] approve(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggCustregisterHVO[] unapprove(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
