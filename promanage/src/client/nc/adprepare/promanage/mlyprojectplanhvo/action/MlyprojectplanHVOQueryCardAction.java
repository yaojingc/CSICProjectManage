
package nc.adprepare.promanage.mlyprojectplanhvo.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanHVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanBVO;

import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.util.CommonUtil;

/**
 * ��Ƭ��ѯ����ѯ����������
 * 
 * @version @since v3.5.6-1903
 */
public class MlyprojectplanHVOQueryCardAction implements ICommonAction {

	@Override
	public Object doAction(IRequest paramIRequest) {
		PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
		try {
			// ��ѯ����
			Collection<AggMlyprojectplanHVO> bills = this.queryBills(queryParam);

			List<AggMlyprojectplanHVO> billsList = new ArrayList<>(bills);
			if (!billsList.isEmpty()) {
				for (AggMlyprojectplanHVO vo : billsList) {
					if (vo.getChildren(MlyprojectplanBVO.class) == null) {
						String con = "pk_time_plan='" + vo.getParentVO().getPk_time_plan() + "' order by full_seq asc ";

						Collection<MlyprojectplanBVO> result = new BaseDAO().retrieveByClause(MlyprojectplanBVO.class,
								con);
						List<MlyprojectplanBVO> childs = new ArrayList<>(result);
						if (!childs.isEmpty()) {
							MlyprojectplanBVO[] childArray = new MlyprojectplanBVO[childs.size()];
							childs.toArray(childArray);
							vo.setChildren(MlyprojectplanBVO.class, childArray);
						}
					}
				}
			}
			BillCard transBillCard = this.transBillCard(queryParam, bills);
			return transBillCard;
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
	private Collection<AggMlyprojectplanHVO> queryBills(PageQueryInfo queryParam) throws MetaDataException {
		IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
		// ע�⣺ҵ���ṩ��ѯ������Ԫ���ݲ�ѯĬ�ϲ�ѯ��dr=1�������ˣ�
		String wheresql = "pk_time_plan" + "='" + queryParam.getPk() + "'";
		Collection<AggMlyprojectplanHVO> bills = service.queryBillOfVOByCond(AggMlyprojectplanHVO.class, wheresql, true,false);
		
		List<AggMlyprojectplanHVO> billsList = new ArrayList<>(bills);
		
		if (!billsList.isEmpty()) {
			for (AggMlyprojectplanHVO vo : billsList) {
				vo.setChildrenVO(null);
			}
		}
		
		return bills;
	}

	/**
	 * VO ת��
	 *
	 * @param queryParam
	 * @param bill
	 * @return
	 */
	private BillCard transBillCard(PageQueryInfo queryParam, Collection<AggMlyprojectplanHVO> bills) {
		if (bills == null) {
			return null;
		}
		AggMlyprojectplanHVO bill = bills.toArray(new AggMlyprojectplanHVO[0])[0];
		BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
		return operator.toCard(bill);
	}
}
