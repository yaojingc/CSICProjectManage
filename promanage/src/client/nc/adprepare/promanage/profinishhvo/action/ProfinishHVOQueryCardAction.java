
package nc.adprepare.promanage.profinishhvo.action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.vo.adprepare.projectfinish.ProfinishHVO;
import nc.vo.adprepare.projectfinish.ProfinishBVO;

import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nc.adprepare.promanage.profinishhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.profinishhvo.promanage.util.CommonUtil;

/**
* ��Ƭ��ѯ����ѯ����������
* @version  @since v3.5.6-1903
*/
public class ProfinishHVOQueryCardAction implements ICommonAction {

@Override
public Object doAction(IRequest paramIRequest) {
PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
try {
// ��ѯ����
Collection<AggProfinishHVO> bills = this.queryBills(queryParam);


List<AggProfinishHVO> billsList = new ArrayList<>(bills);
if (!billsList.isEmpty()) {
for (AggProfinishHVO vo : billsList) {
if (vo.getChildren(ProfinishBVO.class) == null) {
String con = "pk_projectfinish_h='" + vo.getParentVO().getPk_projectfinish_h() + "'";
Collection<ProfinishBVO> result = new BaseDAO().retrieveByClause(ProfinishBVO.class, con);
List<ProfinishBVO> childs = new ArrayList<>(result);
if (!childs.isEmpty()) {
ProfinishBVO[] childArray = new ProfinishBVO[childs.size()];
childs.toArray(childArray);
vo.setChildren(ProfinishBVO.class, childArray);
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
private Collection<AggProfinishHVO> queryBills(PageQueryInfo queryParam)
throws MetaDataException {
IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
// ע�⣺ҵ���ṩ��ѯ������Ԫ���ݲ�ѯĬ�ϲ�ѯ��dr=1�������ˣ�
String wheresql =
"pk_projectfinish_h" + "='" + queryParam.getPk() + "'";
Collection<AggProfinishHVO> bills =
service.queryBillOfVOByCond(AggProfinishHVO.class, wheresql, true,
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
Collection<AggProfinishHVO> bills) {
if (bills == null) {
return null;
}
AggProfinishHVO bill = bills.toArray(new AggProfinishHVO[0])[0];
BillCardOperator operator = new BillCardOperator(queryParam.getPagecode());
return operator.toCard(bill);
}
}
