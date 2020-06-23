
package nc.adprepare.promanage.custregisterhvo.action;

import nc.bs.logging.Logger;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.container.IRequest;
import nc.adprepare.promanage.custregisterhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.custregisterhvo.promanage.util.CommonUtil;

public class CustregisterHVOUnCommitAssignAction
    extends AbstractUnCommitAssignAction<AggCustregisterHVO> {

  @Override
  public Object doAction(IRequest request) {
    BillOperatorParam operaParam = this.getRequestParam(request);
    Object result = null;
    try {
  AggCustregisterHVO[] operaVOs = this.queryBillsByPks(operaParam);
      CommonUtil.setBillsTs(operaParam.getPkMapTs(), operaVOs);
      Object resultVOs = this.unCommit(operaVOs);
      result = this.buildFontResult(operaParam, resultVOs);
    }
    catch (BusinessException ex) {
      Logger.error(ex.getMessage(), ex);
      ExceptionUtils.wrapException(ex);
    }
    return result;
  }

}
