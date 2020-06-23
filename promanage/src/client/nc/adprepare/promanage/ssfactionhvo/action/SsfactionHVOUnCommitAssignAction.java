
package nc.adprepare.promanage.ssfactionhvo.action;

import nc.bs.logging.Logger;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.container.IRequest;
import nc.adprepare.promanage.ssfactionhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.ssfactionhvo.promanage.util.CommonUtil;

public class SsfactionHVOUnCommitAssignAction
    extends AbstractUnCommitAssignAction<AggSsfactionHVO> {

  @Override
  public Object doAction(IRequest request) {
    BillOperatorParam operaParam = this.getRequestParam(request);
    Object result = null;
    try {
  AggSsfactionHVO[] operaVOs = this.queryBillsByPks(operaParam);
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
