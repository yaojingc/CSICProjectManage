
package nc.adprepare.promanage.monprojectplanhvo.action;

import java.util.Collection;

import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.adprepare.monthprojectplan.MonprojectplanHVO;
import nc.vo.pf.pub.util.SQLUtil;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nc.adprepare.promanage.monprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.monprojectplanhvo.promanage.util.CommonUtil;

/**
 * �б�ҳ��ѯ
 * @version  @since v3.5.6-1903
 */
public class MonprojectplanHVOQueryByPksAction implements ICommonAction {

  @Override
  public Object doAction(IRequest paramIRequest) {
    PageQueryInfo queryParam = this.getQueryParam(paramIRequest);
    try {
      // ����ǰ�˴��ݵ�pks��ѯ����
      Collection<AggMonprojectplanHVO> bills = this.queryBills(queryParam);
      // ���ز�ѯ��Ϣ
      return this.transGrid(queryParam, bills);
    }
    catch (BusinessException ex) {
      // �����쳣��Ϣ
      Logger.error(ex);
      ExceptionUtils.wrapException(ex);
    }
    return null;
  }

  /**
   * ��VOת��ǰ��Grid��Ϣ
   *
   * @param info
   * @param bills
   * @return
   */
  protected Object transGrid(PageQueryInfo info,
      Collection<AggMonprojectplanHVO> bills) {
    if ((bills == null) || (bills.size() == 0)) {
      return null;
    }

    Object[] heads = new Object[bills.size()];
    int i = 0;
    for (AggMonprojectplanHVO bill : bills) {
      heads[i++] = bill.getParent();
    }

    GridOperator operator = new GridOperator(info.getPagecode());
    Grid grid = operator.toGrid(heads);
    return grid;
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
    // 1�����ݲ�����ѯ���
    IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
    String wheresql =
        SQLUtil.buildSqlForIn("pk_monthprojplan_h",queryParam.getPks());
    Collection<AggMonprojectplanHVO> bills =
        service.queryBillOfVOByCond(AggMonprojectplanHVO.class, wheresql, false,
            false);
    return bills;
  }
}
