
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.vo.pub.BusinessException;

public interface IProstarthvoMaintain {

        public void delete(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException;

        public AggProstartHVO[] insert(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException;

        public AggProstartHVO[] update(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException;

        public AggProstartHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggProstartHVO[] save(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException;

        public AggProstartHVO[] unsave(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException;

        public AggProstartHVO[] approve(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException;

        public AggProstartHVO[] unapprove(AggProstartHVO[] clientFullVOs,
                        AggProstartHVO[] originBills) throws BusinessException;
}
