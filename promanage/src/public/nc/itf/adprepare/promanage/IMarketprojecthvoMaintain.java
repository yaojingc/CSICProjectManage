
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.vo.pub.BusinessException;

public interface IMarketprojecthvoMaintain {

        public void delete(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException;

        public AggMarketprojectHVO[] insert(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException;

        public AggMarketprojectHVO[] update(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException;

        public AggMarketprojectHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggMarketprojectHVO[] save(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException;

        public AggMarketprojectHVO[] unsave(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException;

        public AggMarketprojectHVO[] approve(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException;

        public AggMarketprojectHVO[] unapprove(AggMarketprojectHVO[] clientFullVOs,
                        AggMarketprojectHVO[] originBills) throws BusinessException;
}
