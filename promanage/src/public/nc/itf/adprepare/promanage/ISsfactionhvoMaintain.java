
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.vo.pub.BusinessException;

public interface ISsfactionhvoMaintain {

        public void delete(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException;

        public AggSsfactionHVO[] insert(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException;

        public AggSsfactionHVO[] update(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException;

        public AggSsfactionHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggSsfactionHVO[] save(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException;

        public AggSsfactionHVO[] unsave(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException;

        public AggSsfactionHVO[] approve(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException;

        public AggSsfactionHVO[] unapprove(AggSsfactionHVO[] clientFullVOs,
                        AggSsfactionHVO[] originBills) throws BusinessException;
}
