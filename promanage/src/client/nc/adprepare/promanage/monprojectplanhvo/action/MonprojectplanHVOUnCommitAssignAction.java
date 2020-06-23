
package nc.adprepare.promanage.monprojectplanhvo.action;

import nc.bs.logging.Logger;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.container.IRequest;
import nc.adprepare.promanage.monprojectplanhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.monprojectplanhvo.promanage.util.CommonUtil;

public class MonprojectplanHVOUnCommitAssignAction
    extends AbstractUnCommitAssignAction<AggMonprojectplanHVO> {

  @Override
  public Object doAction(IRequest request) {
    BillOperatorParam operaParam = this.getRequestParam(request);
    Object result = null;
    try {
  AggMonprojectplanHVO[] operaVOs = this.queryBillsByPks(operaParam);
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
