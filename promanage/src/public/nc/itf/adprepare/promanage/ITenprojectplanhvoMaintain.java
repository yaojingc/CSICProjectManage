
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.pub.BusinessException;

public interface ITenprojectplanhvoMaintain {

        public void delete(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException;

        public AggTenprojectplanHVO[] insert(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException;

        public AggTenprojectplanHVO[] update(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException;

        public AggTenprojectplanHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggTenprojectplanHVO[] save(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException;

        public AggTenprojectplanHVO[] unsave(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException;

        public AggTenprojectplanHVO[] approve(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException;

        public AggTenprojectplanHVO[] unapprove(AggTenprojectplanHVO[] clientFullVOs,
                        AggTenprojectplanHVO[] originBills) throws BusinessException;
}
