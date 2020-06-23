
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.pub.BusinessException;

public interface IMlyprojectplanhvoMaintain {

        public void delete(AggMlyprojectplanHVO[] clientFullVOs,
                        AggMlyprojectplanHVO[] originBills) throws BusinessException;

        public AggMlyprojectplanHVO[] insert(AggMlyprojectplanHVO[] clientFullVOs,
                        AggMlyprojectplanHVO[] originBills) throws BusinessException;

        public AggMlyprojectplanHVO[] update(AggMlyprojectplanHVO[] clientFullVOs,
                        AggMlyprojectplanHVO[] originBills) throws BusinessException;

        public AggMlyprojectplanHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggMlyprojectplanHVO[] save(AggMlyprojectplanHVO[] clientFullVOs,
                        AggMlyprojectplanHVO[] originBills) throws BusinessException;

        public AggMlyprojectplanHVO[] unsave(AggMlyprojectplanHVO[] clientFullVOs,
                        AggMlyprojectplanHVO[] originBills) throws BusinessException;

        public AggMlyprojectplanHVO[] approve(AggMlyprojectplanHVO[] clientFullVOs,
                        AggMlyprojectplanHVO[] originBills) throws BusinessException;

        public AggMlyprojectplanHVO[] unapprove(AggMlyprojectplanHVO[] clientFullVOs,
                        AggMlyprojectplanHVO[] originBills) throws BusinessException;
}
