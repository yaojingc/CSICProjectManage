
package nc.adprepare.promanage.tenprojectplanhvo.action;


import nc.bs.logging.Logger;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.adprepare.promanage.TenprojectplanHVOConst;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.container.IRequest;
import nc.adprepare.promanage.tenprojectplanhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.tenprojectplanhvo.promanage.util.CommonUtil;

public class TenprojectplanHVOCommitAssignAction
    extends AbstractCommitAssignAction<AggTenprojectplanHVO> {

    @Override
    public Object doAction(IRequest request) {
    // ��ȡǰ���������
    BillOperatorParam operaParam = this.getRequestParam(request);
    Object result = null;
    try {
    // ����pk��ѯ����������
    AggTenprojectplanHVO[] operaVOs = this.queryBillsByPks(operaParam);
    // ts��ֵ
    CommonUtil.setBillsTs(operaParam.getPkMapTs(), operaVOs);
    // �Բ�ѯ���ִ�о���ҵ����
    Object resultVOs = this.doCommit(operaVOs, operaParam.getUserObj(),
    TenprojectplanHVOConst.CONST_BILLTYPE_COST);
    // ��Ƭҳ����Ҫ���ز���������ݵ�ǰ�ˣ��б���������ǰ�����µ����б��ѯ�������践�ز��������ݣ����Դ˴����տ�Ƭ�����ؽ��
    if (operaVOs.length < 2) {
    result = this.buildFontResult(operaParam, resultVOs);
    }
    else {
    result = resultVOs;
    }
    }
    catch (BusinessException ex) {
    Logger.error(ex.getMessage(), ex);
    ExceptionUtils.wrapException(ex);
    }
    return result;
    }

    }