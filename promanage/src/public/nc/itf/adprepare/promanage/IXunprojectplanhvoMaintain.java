
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.vo.pub.BusinessException;

public interface IXunprojectplanhvoMaintain {

        public void delete(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException;

        public AggXunprojectplanHVO[] insert(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException;

        public AggXunprojectplanHVO[] update(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException;

        public AggXunprojectplanHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggXunprojectplanHVO[] save(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException;

        public AggXunprojectplanHVO[] unsave(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException;

        public AggXunprojectplanHVO[] approve(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException;

        public AggXunprojectplanHVO[] unapprove(AggXunprojectplanHVO[] clientFullVOs,
                        AggXunprojectplanHVO[] originBills) throws BusinessException;
}
