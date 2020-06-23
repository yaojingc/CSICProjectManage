
package nc.adprepare.promanage.satisfactionhvo.action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.vo.adprepare.satisfaction.SatisfactionHVO;
import nc.vo.adprepare.satisfaction.SatisfactionBVO;

import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nc.adprepare.promanage.satisfactionhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.satisfactionhvo.promanage.util.CommonUtil;

/**
* 卡片查询（查询方案）操作
* @version  @since v3.5.6-1903
*/
public class SatisfactionHVOQueryCardAction implements ICommonAction {

@Override
public Object doAction(IRequest paramIRequest) {
PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
try {
// 查询数据
Collection<AggSatisfactionHVO> bills = this.queryBills(queryParam);


List<AggSatisfactionHVO> billsList = new ArrayList<>(bills);
if (!billsList.isEmpty()) {
for (AggSatisfactionHVO vo : billsList) {
if (vo.getChildren(SatisfactionBVO.class) == null) {
String con = "pk_satisfaction_h='" + vo.getParentVO().getPk_satisfaction_h() + "'";
Collection<SatisfactionBVO> result = new BaseDAO().retrieveByClause(SatisfactionBVO.class, con);
List<SatisfactionBVO> childs = new ArrayList<>(result);
if (!childs.isEmpty()) {
SatisfactionBVO[] childArray = new SatisfactionBVO[childs.size()];
childs.toArray(childArray);
vo.setChildren(SatisfactionBVO.class, childArray);
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
private Collection<AggSatisfactionHVO> queryBills(PageQueryInfo queryParam)
throws MetaDataException {
IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
// 注意：业务提供查询方法（元数据查询默认查询到dr=1的数据了）
String wheresql =
"pk_satisfaction_h" + "='" + queryParam.getPk() + "'";
Collection<AggSatisfactionHVO> bills =
service.queryBillOfVOByCond(AggSatisfactionHVO.class, wheresql, true,
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
Collection<AggSatisfactionHVO> bills) {
if (bills == null) {
return null;
}
AggSatisfactionHVO bill = bills.toArray(new AggSatisfactionHVO[0])[0];
BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
return operator.toCard(bill);
}
}
