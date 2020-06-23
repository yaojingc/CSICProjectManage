
package nc.itf.adprepare.promanage;

import java.util.ArrayList;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.adprepare.custinformation.CustinformationBVO;
import nc.vo.adprepare.custinformation.CustinformationHVO;
import nc.vo.pub.BusinessException;

public interface ICustinformationhvoMaintain {

	public void delete(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException;

	public AggCustinformationHVO[] insert(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException;

	public AggCustinformationHVO[] update(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException;

	public AggCustinformationHVO[] query(IQueryScheme queryScheme) throws BusinessException;

	public AggCustinformationHVO[] save(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException;

	public AggCustinformationHVO[] unsave(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException;

	public AggCustinformationHVO[] approve(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException;

	public AggCustinformationHVO[] unapprove(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException;

	public ArrayList<CustinformationHVO> queryByPkCust(String cust) throws BusinessException;

	public ArrayList<CustinformationBVO> queryRownoByPkCust(String pk_information_h) throws BusinessException;

	public void updateTsAndDrByPk(String pk_information_h, String date) throws BusinessException;
	
	public void insertBvo(CustinformationBVO bvo) throws BusinessException;

}
