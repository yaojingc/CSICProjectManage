
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.pub.BusinessException;

public interface ICustregisterhvoMaintain {

        public void delete(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException;

        public AggCustregisterHVO[] insert(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException;

        public AggCustregisterHVO[] update(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException;

        public AggCustregisterHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggCustregisterHVO[] save(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException;

        public AggCustregisterHVO[] unsave(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException;

        public AggCustregisterHVO[] approve(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException;

        public AggCustregisterHVO[] unapprove(AggCustregisterHVO[] clientFullVOs,
                        AggCustregisterHVO[] originBills) throws BusinessException;
}
