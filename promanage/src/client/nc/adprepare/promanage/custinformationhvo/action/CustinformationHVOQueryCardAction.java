
package nc.adprepare.promanage.custinformationhvo.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.adprepare.promanage.custinformationhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.custinformationhvo.promanage.util.CommonUtil;
import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.adprepare.custinformation.CustinformationCVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.framework.web.ui.pattern.extbillcard.ExtBillCardOperator;

/**
 * 卡片查询（查询方案）操作
 * 
 * @version @since v3.5.6-1903
 */
public class CustinformationHVOQueryCardAction implements ICommonAction {

	@Override
	public Object doAction(IRequest paramIRequest) {
		PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
		try {
			// 查询数据
			Collection<AggCustinformationHVO> bills = this.queryBills(queryParam);

			List<AggCustinformationHVO> billsList = new ArrayList<>(bills);
			if (!billsList.isEmpty()) {
				for (AggCustinformationHVO vo : billsList) {
					if (vo.getChildren(CustinformationCVO.class) == null) {
						String con = "pk_information_h='" + vo.getParentVO().getPk_information_h() + "'";
						Collection<CustinformationCVO> result = new BaseDAO().retrieveByClause(CustinformationCVO.class,
								con);
						List<CustinformationCVO> childs = new ArrayList<>(result);
						if (!childs.isEmpty()) {
							CustinformationCVO[] childArray = new CustinformationCVO[childs.size()];
							childs.toArray(childArray);
							vo.setChildren(CustinformationCVO.class, childArray);
						}
					}
				}
			}
			
			
			ExtBillCardOperator operator = new ExtBillCardOperator("91H10540_CARD");
			
			
			return operator.toCard(bills.toArray(new AggCustinformationHVO[0])[0]);
			
			//return this.transBillCard(queryParam, bills);
		} catch (BusinessException ex) {
// 处理异常信息
			Logger.error(ex);
			ExceptionUtils.wrapException(ex);
		}
		return null;
	}

	/**
	 * 获取查询参数
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
	 * 查询业务数据
	 *
	 * @param queryParam
	 * @return
	 * @throws MetaDataException
	 */
	private Collection<AggCustinformationHVO> queryBills(PageQueryInfo queryParam) throws MetaDataException {
		IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
// 注意：业务提供查询方法（元数据查询默认查询到dr=1的数据了）
		String wheresql = "pk_information_h" + "='" + queryParam.getPk() + "'";
		Collection<AggCustinformationHVO> bills = service.queryBillOfVOByCond(AggCustinformationHVO.class, wheresql,
				true, false);
		return bills;
	}

	/**
	 * VO 转换
	 *
	 * @param queryParam
	 * @param bill
	 * @return
	 */
	private BillCard transBillCard(PageQueryInfo queryParam, Collection<AggCustinformationHVO> bills) {
		if (bills == null) {
			return null;
		}
		AggCustinformationHVO bill = bills.toArray(new AggCustinformationHVO[0])[0];
		BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
		return operator.toCard(bill);
	}
}
