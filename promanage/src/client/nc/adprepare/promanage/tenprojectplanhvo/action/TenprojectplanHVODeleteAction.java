
package nc.adprepare.promanage.tenprojectplanhvo.action;

import java.util.Collection;

import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.promanage.TenprojectplanHVOConst;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO;
import nc.vo.pf.pub.util.SQLUtil;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nc.adprepare.promanage.tenprojectplanhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.tenprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.tenprojectplanhvo.promanage.util.CommonUtil;

/**
 * ɾ����֧��������
 * @version  @since v3.5.6-1903
 */
public class TenprojectplanHVODeleteAction implements ICommonAction {

  @Override
  public Object doAction(IRequest paramIRequest) {
BillOperatorParam queryParam = this.getQueryParam(paramIRequest);
    try {
      // 1������ǰ�˴��ݵ�pks��ѯ����,��ȡAGGVO
      AggTenprojectplanHVO[] bills = this.queryBills(queryParam);
      // ts��ֵ
      CommonUtil.setBillsTs(queryParam.getPkMapTs(), bills);
      // 2�����õ��ݵı��涯���ű���delete�����õ��������
      this.callActionScript(bills);
    }
    catch (BusinessException ex) {
      // �����쳣��Ϣ
      Logger.error(ex);
      ExceptionUtils.wrapException(ex);
    }
    return null;
  }

  /**
   * ��������
   *
   * @return
   */
  protected String getActionCode() {
    return TenprojectplanHVOConst.CONST_ACTION_DELETE;
  }

  /**
   * ���ö����ű�
   *
   * @param actionCode
   * @param aggVOs
   * @return
   * @throws BusinessException
   */
  private Object callActionScript(AggTenprojectplanHVO... aggVOs)
      throws BusinessException {

    if ((aggVOs == null) || (aggVOs.length == 0)) {
      return null;
    }

    String actionCode = this.getActionCode();
    String billType = TenprojectplanHVOConst.CONST_BILLTYPE_COST;

    CloudPFlowContext context = new CloudPFlowContext();
    context.setActionName(actionCode);
    context.setBillType(billType);
    context.setBillVos(aggVOs);
    Logger.debug("��ʼ���ö����ű� ActionName[" + actionCode + "] BillType[" + billType
        + "]...");

    ICloudScriptPFlowService service = CommonUtil.getCloudScriptPFlowService();
    Object[] result = service.exeScriptPFlow(context);

    Logger.debug(
        "���ö����ű� ActionName[" + actionCode + "] BillType[" + billType + "]����");

    return result;
  }

  /**
   * ��ȡ��ѯ����
   *
   * @param paramIRequest
   * @return
   */
  private BillOperatorParam getQueryParam(IRequest paramIRequest) {
    String strRead = paramIRequest.read();
BillOperatorParam queryParam =
        JsonFactory.create().fromJson(strRead, BillOperatorParam.class);
    return queryParam;
  }

  /**
   * ��ѯҵ������
   *
   * @param queryParam
   * @return
   * @throws MetaDataException
   */
  private AggTenprojectplanHVO[] queryBills(BillOperatorParam queryParam)
      throws MetaDataException {
    // 1�����ݲ�����ѯ���
    IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
    String wheresql = SQLUtil.buildSqlForIn(
        "pk_time_plan", queryParam.getPks());

    Collection<AggTenprojectplanHVO> bills =
        service.queryBillOfVOByCond(AggTenprojectplanHVO.class, wheresql, true,
            false);
    if ((bills == null) || (bills.size() == 0)) {
      return null;
    }
    return bills.toArray(new AggTenprojectplanHVO[0]);
  }
}
