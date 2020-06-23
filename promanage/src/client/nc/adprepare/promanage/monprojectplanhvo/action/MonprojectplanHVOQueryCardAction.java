
package nc.adprepare.promanage.monprojectplanhvo.action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.adprepare.monthprojectplan.MonprojectplanHVO;
import nc.vo.adprepare.monthprojectplan.MonprojectplanBVO;

import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nc.adprepare.promanage.monprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.monprojectplanhvo.promanage.util.CommonUtil;

/**
* ��Ƭ��ѯ����ѯ����������
* @version  @since v3.5.6-1903
*/
public class MonprojectplanHVOQueryCardAction implements ICommonAction {

@Override
public Object doAction(IRequest paramIRequest) {
PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
try {
// ��ѯ����
Collection<AggMonprojectplanHVO> bills = this.queryBills(queryParam);


List<AggMonprojectplanHVO> billsList = new ArrayList<>(bills);
if (!billsList.isEmpty()) {
for (AggMonprojectplanHVO vo : billsList) {
if (vo.getChildren(MonprojectplanBVO.class) == null) {
String con = "pk_monthprojplan_h='" + vo.getParentVO().getPk_monthprojplan_h() + "'";
Collection<MonprojectplanBVO> result = new BaseDAO().retrieveByClause(MonprojectplanBVO.class, con);
List<MonprojectplanBVO> childs = new ArrayList<>(result);
if (!childs.isEmpty()) {
MonprojectplanBVO[] childArray = new MonprojectplanBVO[childs.size()];
childs.toArray(childArray);
vo.setChildren(MonprojectplanBVO.class, childArray);
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
private Collection<AggMonprojectplanHVO> queryBills(PageQueryInfo queryParam)
throws MetaDataException {
IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
// ע�⣺ҵ���ṩ��ѯ������Ԫ���ݲ�ѯĬ�ϲ�ѯ��dr=1�������ˣ�
String wheresql =
"pk_monthprojplan_h" + "='" + queryParam.getPk() + "'";
Collection<AggMonprojectplanHVO> bills =
service.queryBillOfVOByCond(AggMonprojectplanHVO.class, wheresql, true,
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
Collection<AggMonprojectplanHVO> bills) {
if (bills == null) {
return null;
}
AggMonprojectplanHVO bill = bills.toArray(new AggMonprojectplanHVO[0])[0];
BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
return operator.toCard(bill);
}
}
