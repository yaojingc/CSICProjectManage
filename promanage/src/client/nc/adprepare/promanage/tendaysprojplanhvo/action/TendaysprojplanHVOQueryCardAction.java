
package nc.adprepare.promanage.tendaysprojplanhvo.action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.vo.adprepare.tendaysprojectplan.TendaysprojplanHVO;
import nc.vo.adprepare.tendaysprojectplan.TendaysprojplanBVO;

import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nc.adprepare.promanage.tendaysprojplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.tendaysprojplanhvo.promanage.util.CommonUtil;

/**
* ��Ƭ��ѯ����ѯ����������
* @version  @since v3.5.6-1903
*/
public class TendaysprojplanHVOQueryCardAction implements ICommonAction {

@Override
public Object doAction(IRequest paramIRequest) {
PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
try {
// ��ѯ����
Collection<AggTendaysprojplanHVO> bills = this.queryBills(queryParam);


List<AggTendaysprojplanHVO> billsList = new ArrayList<>(bills);
if (!billsList.isEmpty()) {
for (AggTendaysprojplanHVO vo : billsList) {
if (vo.getChildren(TendaysprojplanBVO.class) == null) {
String con = "pk_tendaysprojplan_h='" + vo.getParentVO().getPk_tendaysprojplan_h() + "'";
Collection<TendaysprojplanBVO> result = new BaseDAO().retrieveByClause(TendaysprojplanBVO.class, con);
List<TendaysprojplanBVO> childs = new ArrayList<>(result);
if (!childs.isEmpty()) {
TendaysprojplanBVO[] childArray = new TendaysprojplanBVO[childs.size()];
childs.toArray(childArray);
vo.setChildren(TendaysprojplanBVO.class, childArray);
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
private Collection<AggTendaysprojplanHVO> queryBills(PageQueryInfo queryParam)
throws MetaDataException {
IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
// ע�⣺ҵ���ṩ��ѯ������Ԫ���ݲ�ѯĬ�ϲ�ѯ��dr=1�������ˣ�
String wheresql =
"pk_tendaysprojplan_h" + "='" + queryParam.getPk() + "'";
Collection<AggTendaysprojplanHVO> bills =
service.queryBillOfVOByCond(AggTendaysprojplanHVO.class, wheresql, true,
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
Collection<AggTendaysprojplanHVO> bills) {
if (bills == null) {
return null;
}
AggTendaysprojplanHVO bill = bills.toArray(new AggTendaysprojplanHVO[0])[0];
BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
return operator.toCard(bill);
}
}
