
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.vo.pub.BusinessException;

public interface IProfinishhvoMaintain {

        public void delete(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException;

        public AggProfinishHVO[] insert(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException;

        public AggProfinishHVO[] update(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException;

        public AggProfinishHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggProfinishHVO[] save(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException;

        public AggProfinishHVO[] unsave(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException;

        public AggProfinishHVO[] approve(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException;

        public AggProfinishHVO[] unapprove(AggProfinishHVO[] clientFullVOs,
                        AggProfinishHVO[] originBills) throws BusinessException;
}
