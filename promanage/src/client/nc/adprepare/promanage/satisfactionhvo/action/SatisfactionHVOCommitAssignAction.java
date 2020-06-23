
package nc.adprepare.promanage.satisfactionhvo.action;


import nc.bs.logging.Logger;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.vo.adprepare.promanage.SatisfactionHVOConst;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.container.IRequest;
import nc.adprepare.promanage.satisfactionhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.satisfactionhvo.promanage.util.CommonUtil;

public class SatisfactionHVOCommitAssignAction
    extends AbstractCommitAssignAction<AggSatisfactionHVO> {

    @Override
    public Object doAction(IRequest request) {
    // ��ȡǰ���������
    BillOperatorParam operaParam = this.getRequestParam(request);
    Object result = null;
    try {
    // ����pk��ѯ����������
    AggSatisfactionHVO[] operaVOs = this.queryBillsByPks(operaParam);
    // ts��ֵ
    CommonUtil.setBillsTs(operaParam.getPkMapTs(), operaVOs);
    // �Բ�ѯ���ִ�о���ҵ����
    Object resultVOs = this.doCommit(operaVOs, operaParam.getUserObj(),
    SatisfactionHVOConst.CONST_BILLTYPE_COST);
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