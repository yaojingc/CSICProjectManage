
package nc.adprepare.promanage.tenprojectplanhvo.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nccloud.framework.web.ui.model.row.Cell;
import nccloud.framework.web.ui.model.row.Row;
import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO;
import nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import util.CSICCommonUtils;
import nc.adprepare.promanage.tenprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.tenprojectplanhvo.promanage.util.CommonUtil;

/**
 * ��Ƭ��ѯ����ѯ����������
 * 
 * @version @since v3.5.6-1903
 */
public class TenprojectplanHVOQueryCardAction implements ICommonAction {

	@Override
	public Object doAction(IRequest paramIRequest) {
		PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
		try {
			// ��ѯ����
			Collection<AggTenprojectplanHVO> bills = this.queryBills(queryParam);

			List<AggTenprojectplanHVO> billsList = new ArrayList<>(bills);
			if (!billsList.isEmpty()) {
				for (AggTenprojectplanHVO vo : billsList) {
					if (vo.getChildren(TenprojectplanBVO.class) == null) {
						String con = "pk_time_plan='" + vo.getParentVO().getPk_time_plan() + "' order by full_seq asc";
						Collection<TenprojectplanBVO> result = new BaseDAO().retrieveByClause(TenprojectplanBVO.class,
								con);
						List<TenprojectplanBVO> childs = new ArrayList<>(result);
						if (!childs.isEmpty()) {
							TenprojectplanBVO[] childArray = new TenprojectplanBVO[childs.size()];
							childs.toArray(childArray);
							vo.setChildren(TenprojectplanBVO.class, childArray);
						}
					}
				}
			}
			
			// ������ظ���
			AggTenprojectplanHVO bill = bills.toArray(new AggTenprojectplanHVO[0])[0];
			BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
			
			BillCard billCard = operator.toCard(bill);

//			Row[] rows = billCard.getHead().getModel().getRows();
			
			Row[] rows = billCard.getBody().getModel().getRows();
			if (rows != null && rows.length > 0) {
				for (int i = 0; i < rows.length; i++) {
					Cell cell = rows[i].getCell("pk_front_plan");
					if(CSICCommonUtils.isNotEmpty(cell.getValue())) {
						cell.setDisplay(cell.getValue() + "");
					}
				}
			}
			
			
			
			
			
			return billCard;
		} catch (BusinessException ex) {
			// �����쳣��Ϣ
			Logger.error(ex);
			ExceptionUtils.wrapException(ex);
		}
		return null;
	}

	/**
	 * ��ȡ��ѯ����
	 *
	 * @param paramIRequest
	 * @return
	 */
	private PageQueryInfo getQueryParam(IRequest paramIRequest) {
		String strRead = paramIRequest.read();
		PageQueryInfo queryParam = JsonFactory.create().fromJson(strRead, PageQueryInfo.class);
		return queryParam;
	}

	/**
	 * ��ѯҵ������
	 *
	 * @param queryParam
	 * @return
	 * @throws MetaDataException
	 */
	private Collection<AggTenprojectplanHVO> queryBills(PageQueryInfo queryParam) throws MetaDataException {
		IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
		// ע�⣺ҵ���ṩ��ѯ������Ԫ���ݲ�ѯĬ�ϲ�ѯ��dr=1�������ˣ�
		String wheresql = "pk_time_plan" + "='" + queryParam.getPk() + "'";
		Collection<AggTenprojectplanHVO> bills = service.queryBillOfVOByCond(AggTenprojectplanHVO.class, wheresql, true,
				false);
		return bills;
	}

	/**
	 * VO ת��
	 *
	 * @param queryParam
	 * @param bill
	 * @return
	 */
	private BillCard transBillCard(PageQueryInfo queryParam, Collection<AggTenprojectplanHVO> bills) {
		if (bills == null) {
			return null;
		}
		AggTenprojectplanHVO bill = bills.toArray(new AggTenprojectplanHVO[0])[0];
		BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
		
		BillCard billCard = operator.toCard(bill);

		Row[] rows = billCard.getHead().getModel().getRows();
		if (rows != null && rows.length > 0) {
			for (int i = 0; i < rows.length; i++) {
				Cell cell = rows[i].getCell("pk_tradetype");
				if ("D3".equals(cell.getValue()) || "F3-Cxx-01".equals(cell.getValue())) {
					cell = rows[i].getCell("def26");
					cell.setDisplay(cell.getValue() + "");
				}
			}
		}
		
		return operator.toCard(bill);
	}
}
