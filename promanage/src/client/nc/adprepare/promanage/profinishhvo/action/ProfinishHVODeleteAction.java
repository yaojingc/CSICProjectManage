
package nc.adprepare.promanage.profinishhvo.action;

import java.util.Collection;

import nc.bs.logging.Logger;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.promanage.ProfinishHVOConst;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.vo.adprepare.projectfinish.ProfinishHVO;
import nc.vo.pf.pub.util.SQLUtil;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.pubitf.riart.pflow.CloudPFlowContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nc.adprepare.promanage.profinishhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.profinishhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.profinishhvo.promanage.util.CommonUtil;

/**
 * ɾ����֧��������
 * @version  @since v3.5.6-1903
 */
public class ProfinishHVODeleteAction implements ICommonAction {

  @Override
  public Object doAction(IRequest paramIRequest) {
BillOperatorParam queryParam = this.getQueryParam(paramIRequest);
    try {
      // 1������ǰ�˴��ݵ�pks��ѯ����,��ȡAGGVO
      AggProfinishHVO[] bills = this.queryBills(queryParam);
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
    return ProfinishHVOConst.CONST_ACTION_DELETE;
  }

  /**
   * ���ö����ű�
   *
   * @param actionCode
   * @param aggVOs
   * @return
   * @throws BusinessException
   */
  private Object callActionScript(AggProfinishHVO... aggVOs)
      throws BusinessException {

    if ((aggVOs == null) || (aggVOs.length == 0)) {
      return null;
    }

    String actionCode = this.getActionCode();
    String billType = ProfinishHVOConst.CONST_BILLTYPE_COST;

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
  private AggProfinishHVO[] queryBills(BillOperatorParam queryParam)
      throws MetaDataException {
    // 1�����ݲ�����ѯ���
    IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
    String wheresql = SQLUtil.buildSqlForIn(
        "pk_projectfinish_h", queryParam.getPks());

    Collection<AggProfinishHVO> bills =
        service.queryBillOfVOByCond(AggProfinishHVO.class, wheresql, true,
            false);
    if ((bills == null) || (bills.size() == 0)) {
      return null;
    }
    return bills.toArray(new AggProfinishHVO[0]);
  }
}