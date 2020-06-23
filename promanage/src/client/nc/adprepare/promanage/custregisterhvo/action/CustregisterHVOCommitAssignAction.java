
package nc.adprepare.promanage.custregisterhvo.action;


import nc.bs.logging.Logger;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.adprepare.promanage.CustregisterHVOConst;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.container.IRequest;
import nc.adprepare.promanage.custregisterhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.custregisterhvo.promanage.util.CommonUtil;

public class CustregisterHVOCommitAssignAction
    extends AbstractCommitAssignAction<AggCustregisterHVO> {

    @Override
    public Object doAction(IRequest request) {
    // ��ȡǰ���������
    BillOperatorParam operaParam = this.getRequestParam(request);
    Object result = null;
    try {
    // ����pk��ѯ����������
    AggCustregisterHVO[] operaVOs = this.queryBillsByPks(operaParam);
    // ts��ֵ
    CommonUtil.setBillsTs(operaParam.getPkMapTs(), operaVOs);
    // �Բ�ѯ���ִ�о���ҵ����
    Object resultVOs = this.doCommit(operaVOs, operaParam.getUserObj(),
    CustregisterHVOConst.CONST_BILLTYPE_COST);
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