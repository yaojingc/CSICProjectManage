
package nc.adprepare.promanage.marketprojecthvo.action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.vo.adprepare.marketproject.MarketprojectHVO;
import nc.vo.adprepare.marketproject.MarketprojectBVO;

import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nc.adprepare.promanage.marketprojecthvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.marketprojecthvo.promanage.util.CommonUtil;

/**
* 卡片查询（查询方案）操作
* @version  @since v3.5.6-1903
*/
public class MarketprojectHVOQueryCardAction implements ICommonAction {

@Override
public Object doAction(IRequest paramIRequest) {
PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
try {
// 查询数据
Collection<AggMarketprojectHVO> bills = this.queryBills(queryParam);


List<AggMarketprojectHVO> billsList = new ArrayList<>(bills);
if (!billsList.isEmpty()) {
for (AggMarketprojectHVO vo : billsList) {
if (vo.getChildren(MarketprojectBVO.class) == null) {
String con = "pk_marketproject_h='" + vo.getParentVO().getPk_marketproject_h() + "'";
Collection<MarketprojectBVO> result = new BaseDAO().retrieveByClause(MarketprojectBVO.class, con);
List<MarketprojectBVO> childs = new ArrayList<>(result);
if (!childs.isEmpty()) {
MarketprojectBVO[] childArray = new MarketprojectBVO[childs.size()];
childs.toArray(childArray);
vo.setChildren(MarketprojectBVO.class, childArray);
}
}
}
}
return this.transBillCard(queryParam, bills);
}
catch (BusinessException ex) {
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
PageQueryInfo queryParam =
JsonFactory.create().fromJson(strRead, PageQueryInfo.class);
return queryParam;
}

/**
* 查询业务数据
*
* @param queryParam
* @return
* @throws MetaDataException
*/
private Collection<AggMarketprojectHVO> queryBills(PageQueryInfo queryParam)
throws MetaDataException {
IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
// 注意：业务提供查询方法（元数据查询默认查询到dr=1的数据了）
String wheresql =
"pk_marketproject_h" + "='" + queryParam.getPk() + "'";
Collection<AggMarketprojectHVO> bills =
service.queryBillOfVOByCond(AggMarketprojectHVO.class, wheresql, true,
false);
return bills;
}

/**
* VO 转换
*
* @param queryParam
* @param bill
* @return
*/
private BillCard transBillCard(PageQueryInfo queryParam,
Collection<AggMarketprojectHVO> bills) {
if (bills == null) {
return null;
}
AggMarketprojectHVO bill = bills.toArray(new AggMarketprojectHVO[0])[0];
BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
return operator.toCard(bill);
}
}
