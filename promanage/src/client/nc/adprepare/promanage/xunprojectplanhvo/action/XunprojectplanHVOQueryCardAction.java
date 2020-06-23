
package nc.adprepare.promanage.xunprojectplanhvo.action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.vo.adprepare.xunprojectplan.XunprojectplanHVO;
import nc.vo.adprepare.xunprojectplan.XunprojectplanBVO;

import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nc.adprepare.promanage.xunprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.xunprojectplanhvo.promanage.util.CommonUtil;

/**
* ��Ƭ��ѯ����ѯ����������
* @version  @since v3.5.6-1903
*/
public class XunprojectplanHVOQueryCardAction implements ICommonAction {

@Override
public Object doAction(IRequest paramIRequest) {
PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
try {
// ��ѯ����
Collection<AggXunprojectplanHVO> bills = this.queryBills(queryParam);


List<AggXunprojectplanHVO> billsList = new ArrayList<>(bills);
if (!billsList.isEmpty()) {
for (AggXunprojectplanHVO vo : billsList) {
if (vo.getChildren(XunprojectplanBVO.class) == null) {
String con = "pk_time_plan='" + vo.getParentVO().getPk_time_plan() + "'";
Collection<XunprojectplanBVO> result = new BaseDAO().retrieveByClause(XunprojectplanBVO.class, con);
List<XunprojectplanBVO> childs = new ArrayList<>(result);
if (!childs.isEmpty()) {
XunprojectplanBVO[] childArray = new XunprojectplanBVO[childs.size()];
childs.toArray(childArray);
vo.setChildren(XunprojectplanBVO.class, childArray);
}
}
}
}
return this.transBillCard(queryParam, bills);
}
catch (BusinessException ex) {
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
PageQueryInfo queryParam =
JsonFactory.create().fromJson(strRead, PageQueryInfo.class);
return queryParam;
}

/**
* ��ѯҵ������
*
* @param queryParam
* @return
* @throws MetaDataException
*/
private Collection<AggXunprojectplanHVO> queryBills(PageQueryInfo queryParam)
throws MetaDataException {
IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
// ע�⣺ҵ���ṩ��ѯ������Ԫ���ݲ�ѯĬ�ϲ�ѯ��dr=1�������ˣ�
String wheresql =
"pk_time_plan" + "='" + queryParam.getPk() + "'";
Collection<AggXunprojectplanHVO> bills =
service.queryBillOfVOByCond(AggXunprojectplanHVO.class, wheresql, true,
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
private BillCard transBillCard(PageQueryInfo queryParam,
Collection<AggXunprojectplanHVO> bills) {
if (bills == null) {
return null;
}
AggXunprojectplanHVO bill = bills.toArray(new AggXunprojectplanHVO[0])[0];
BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
return operator.toCard(bill);
}
}
