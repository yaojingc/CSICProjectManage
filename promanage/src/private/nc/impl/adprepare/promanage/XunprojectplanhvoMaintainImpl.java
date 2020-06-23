
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiXunprojectplanHVOPubServiceImpl;
import nc.itf.adprepare.promanage.IXunprojectplanhvoMaintain ;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.vo.pub.BusinessException;

public class XunprojectplanhvoMaintainImpl extends AceAggbusiXunprojectplanHVOPubServiceImpl implements IXunprojectplanhvoMaintain  {

        @Override
        public void delete(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                super.pubdeleteBills(clientFullVOs, originBills);
        }

        @Override
        public AggXunprojectplanHVO[] insert(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                return super.pubinsertBills(clientFullVOs, originBills);
        }

        @Override
        public AggXunprojectplanHVO[] update(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                return super.pubupdateBills(clientFullVOs, originBills);
        }

        @Override
        public AggXunprojectplanHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException {
                return super.pubquerybills(queryScheme);
        }

        @Override
        public AggXunprojectplanHVO[] save(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                return super.pubsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggXunprojectplanHVO[] unsave(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                return super.pubunsendapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggXunprojectplanHVO[] approve(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                return super.pubapprovebills(clientFullVOs, originBills);
        }

        @Override
        public AggXunprojectplanHVO[] unapprove(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException {
                return super.pubunapprovebills(clientFullVOs, originBills);
        }

}
