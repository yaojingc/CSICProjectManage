
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.vo.pub.BusinessException;

public interface ITendaysprojplanhvoMaintain {

        public void delete(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException;

        public AggTendaysprojplanHVO[] insert(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException;

        public AggTendaysprojplanHVO[] update(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException;

        public AggTendaysprojplanHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggTendaysprojplanHVO[] save(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException;

        public AggTendaysprojplanHVO[] unsave(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException;

        public AggTendaysprojplanHVO[] approve(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException;

        public AggTendaysprojplanHVO[] unapprove(AggTendaysprojplanHVO[] clientFullVOs,
                        AggTendaysprojplanHVO[] originBills) throws BusinessException;
}
