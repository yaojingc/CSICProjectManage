
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.itf.adprepare.promanage.ICustinformationhvoMaintain;
import nc.jdbc.framework.generator.IdGenerator;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pub.lang.UFDateTime;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import nc.adprepare.promanage.custinformationhvo.promanage.util.CommonUtil;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.adprepare.custinformation.CustinformationBVO;
import nc.vo.adprepare.custinformation.CustinformationHVO;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;

/**
 * ��׼������˵�BP
 */
public class AceMarketprojectHVOApproveBP {

	private ICustinformationhvoMaintain main;

	private IdGenerator pkgenerator;

	public ICustinformationhvoMaintain getMaintain() {
		if (CommonUtil.isEmpty(main)) {
			main = NCLocator.getInstance().lookup(ICustinformationhvoMaintain.class);
		}
		return main;
	}

	public IdGenerator getPkgenerator() {
		if (pkgenerator == null) {
			pkgenerator = NCLocator.getInstance().lookup(IdGenerator.class);
		}
		return pkgenerator;
	}

	public void setPkgenerator(IdGenerator pkgenerator) {
		this.pkgenerator = pkgenerator;
	}

	/**
	 * ��˶���
	 * 
	 * @param vos
	 * @param script
	 * @return
	 * @throws BusinessException
	 */
	@SuppressWarnings({ "unused" })
	public AggMarketprojectHVO[] approve(AggMarketprojectHVO[] clientBills, AggMarketprojectHVO[] originBills)
			throws BusinessException {
		for (AggMarketprojectHVO clientBill : clientBills) {
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
			clientBill.getParentVO().getCustname();
		}
		BillUpdate<AggMarketprojectHVO> update = new BillUpdate<AggMarketprojectHVO>();
		AggMarketprojectHVO[] returnVos = update.update(clientBills, originBills);

		/*
		 * ��Ӫ����Ϣ������ش����ͻ���Ϣ�е�Ӫ����Ϣ
		 */
		BaseDAO dao = new BaseDAO();
		for (AggMarketprojectHVO aggmarketprojecthvo : clientBills) {
			String custname = aggmarketprojecthvo.getParentVO().getCustname();// �õ��ͻ�
			// ���ýӿ�ͨ���ͻ���ѯ
			ArrayList<CustinformationHVO> hvolist = getMaintain().queryByPkCust(custname);// �õ���ǰ�ͻ���Ӧ�ı�ͷvo

			List<AggCustinformationHVO> aggvos = new ArrayList<AggCustinformationHVO>();

			AggCustinformationHVO aggvo = new AggCustinformationHVO();

			List<CustinformationBVO> bvos2 = new ArrayList<CustinformationBVO>();

			CloudPFlowContext context = new CloudPFlowContext();

			for (int i = 0; i < 1; i++) {
				CustinformationHVO hvo = hvolist.get(0);
				String pk_information_h = hvo.getPk_information_h();
				// ���ݵ�ǰ����������id��ѯ�����ӱ������µ��ݵ��к�
				CustinformationBVO bvo = new CustinformationBVO();
				String proname = aggmarketprojecthvo.getParentVO().getProname();// ��������
				bvo.setPname(proname);//
				bvo.setPk_information_h(pk_information_h);
				String generate = getPkgenerator().generate();
				bvo.setPk_information_b(generate);
				ArrayList<CustinformationBVO> queryRownoByPkCust = getMaintain().queryRownoByPkCust(pk_information_h);
				int row = 0;
				if (CommonUtil.isNotEmpty(queryRownoByPkCust)) {
					String rowno = queryRownoByPkCust.get(0).getRowno();
					if (CommonUtil.isNotEmpty(rowno)) {
						int parseInt = Integer.parseInt(rowno);
						row = parseInt + 10;
						bvo.setRowno(String.valueOf(row));
					}
				} else {
					bvo.setRowno("10");
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Calendar cd = Calendar.getInstance();
				Date date = new Date();
				cd.setTime(date);
				String dates = sdf.format(cd.getTime());
				bvo.setTs(new UFDateTime(cd.getTime()));// 2020-05-29 09:44:25
				//bvo.setAttributeValue("dr", "0");
				//String insertVO = dao.insertVO(bvo);
				//�������ݵ�ǰ��Ϣ�������޸�dr��ts��ֵ
				getMaintain().insertBvo(bvo);
				//getMaintain().updateTsAndDrByPk(pk_information_h, dates);
			}
		}
		return returnVos;
	}

}
