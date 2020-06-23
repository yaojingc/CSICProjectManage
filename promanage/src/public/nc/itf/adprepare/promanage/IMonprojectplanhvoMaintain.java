
package nc.itf.adprepare.promanage;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.pub.BusinessException;

public interface IMonprojectplanhvoMaintain {

        public void delete(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException;

        public AggMonprojectplanHVO[] insert(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException;

        public AggMonprojectplanHVO[] update(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException;

        public AggMonprojectplanHVO[] query(IQueryScheme queryScheme)
                        throws BusinessException;

        public AggMonprojectplanHVO[] save(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException;

        public AggMonprojectplanHVO[] unsave(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException;

        public AggMonprojectplanHVO[] approve(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException;

        public AggMonprojectplanHVO[] unapprove(AggMonprojectplanHVO[] clientFullVOs,
                        AggMonprojectplanHVO[] originBills) throws BusinessException;
}
