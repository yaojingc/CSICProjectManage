
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.vo.pub.BusinessException;

public interface ISatisfactionhvoMaintain {

        public void delete(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException;

        public AggSatisfactionHVO[] insert(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException;

        public AggSatisfactionHVO[] update(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException;

        public AggSatisfactionHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggSatisfactionHVO[] save(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException;

        public AggSatisfactionHVO[] unsave(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException;

        public AggSatisfactionHVO[] approve(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException;

        public AggSatisfactionHVO[] unapprove(AggSatisfactionHVO[] clientFullVOs,
                        AggSatisfactionHVO[] originBills) throws BusinessException;
}
