
package nc.adprepare.promanage.custinformationhvo.action;

import nc.bs.logging.Logger;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.web.container.IRequest;
import nc.adprepare.promanage.custinformationhvo.promanage.bean.BillOperatorParam;
import nc.adprepare.promanage.custinformationhvo.promanage.util.CommonUtil;

public class CustinformationHVOUnCommitAssignAction extends AbstractUnCommitAssignAction<AggCustinformationHVO> {

	@Override
	public Object doAction(IRequest request) {
		BillOperatorParam operaParam = this.getRequestParam(request);
		Object result = null;
		try {
			AggCustinformationHVO[] operaVOs = this.queryBillsByPks(operaParam);
			CommonUtil.setBillsTs(operaParam.getPkMapTs(), operaVOs);
			Object resultVOs = this.unCommit(operaVOs);
			result = this.buildFontResult(operaParam, resultVOs);
		} catch (BusinessException ex) {
			Logger.error(ex.getMessage(), ex);
			ExceptionUtils.wrapException(ex);
		}
		return result;
	}

}
