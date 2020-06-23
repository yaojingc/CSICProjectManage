
package nc.impl.adprepare.promanage;

import java.util.ArrayList;

import nc.bs.dao.BaseDAO;
import nc.impl.pub.ace.AceAggbusiCustinformationHVOPubServiceImpl;
import nc.itf.adprepare.promanage.ICustinformationhvoMaintain;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.adprepare.custinformation.CustinformationBVO;
import nc.vo.adprepare.custinformation.CustinformationHVO;
import nc.vo.pub.BusinessException;

public class CustinformationhvoMaintainImpl extends AceAggbusiCustinformationHVOPubServiceImpl
		implements ICustinformationhvoMaintain {

	@Override
	public void delete(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException {
		super.pubdeleteBills(clientFullVOs, originBills);
	}

	@Override
	public AggCustinformationHVO[] insert(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public AggCustinformationHVO[] update(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}

	@Override
	public AggCustinformationHVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

	@Override
	public AggCustinformationHVO[] save(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggCustinformationHVO[] unsave(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggCustinformationHVO[] approve(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggCustinformationHVO[] unapprove(AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills)
			throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

	@Override
	public ArrayList<CustinformationHVO> queryByPkCust(String cust) throws BusinessException {
		BaseDAO dao = new BaseDAO();

		StringBuffer sql = new StringBuffer();

		sql.append(" SELECT * FROM adprepare_custinformationHVO WHERE  custname='" + cust + "' and dr = '0'");

		@SuppressWarnings("unchecked")
		ArrayList<CustinformationHVO> hvos = (ArrayList<CustinformationHVO>) dao.executeQuery(sql.toString(),
				new BeanListProcessor(CustinformationHVO.class));

		return hvos;
	}

	@Override
	public ArrayList<CustinformationBVO> queryRownoByPkCust(String pk_information_h) throws BusinessException {
		BaseDAO dao = new BaseDAO();

		StringBuffer sql = new StringBuffer();

		sql.append("select * from ( select * from adprepare_custinformationbvo where  pk_information_h='"
				+ pk_information_h + "' order by rowno desc) where rownum = '1'");

		@SuppressWarnings("unchecked")
		ArrayList<CustinformationBVO> bvos = (ArrayList<CustinformationBVO>) dao.executeQuery(sql.toString(),
				new BeanListProcessor(CustinformationBVO.class));

		return bvos;
	}

	@Override
	public void updateTsAndDrByPk(String pk_information_h, String date) throws BusinessException {
		BaseDAO dao = new BaseDAO();

		StringBuffer sql = new StringBuffer();

		sql.append(" update adprepare_custinformationBVO set dr = 0 , ts = '" + date + "' where pk_information_h = '"
				+ pk_information_h + "' and dr = null");

		int executeUpdate = dao.executeUpdate(sql.toString());

	}

	@Override
	public void insertBvo(CustinformationBVO bvo) throws BusinessException {
		BaseDAO dao = new BaseDAO();

		StringBuffer sql = new StringBuffer();
		
		SQLParameter basSqlParam = new SQLParameter();

		sql.append(
				" insert into adprepare_custinformationbvo (PK_INFORMATION_B,ROWNO,CODE,PNAME,PK_INFORMATION_H,TS, DR) values ('"
						+ bvo.getPk_information_b() + "','" + bvo.getRowno() + "'," + bvo.getCode() + ",'"
						+ bvo.getPname() + "','" + bvo.getPk_information_h() + "','" + bvo.getTs() + "', 0 )");
		
		int executeUpdate = dao.executeUpdate(sql.toString());
	}

}
