
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MonprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IMonprojectplanhvoMaintain;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_MPJP_DELETE extends AbstractPfAction<AggMonprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggMonprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMonprojectplanHVO> processor = new CompareAroundProcesser<AggMonprojectplanHVO>(
                                MonprojectplanHVOPluginPoint.SCRIPT_DELETE);
                // TODO 在此处添加前后规则
                return processor;
        }

        @Override
        protected AggMonprojectplanHVO[] processBP(Object userObj,
                        AggMonprojectplanHVO[] clientFullVOs, AggMonprojectplanHVO[] originBills) {
                IMonprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IMonprojectplanhvoMaintain.class);
                try {
                        operator.delete(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return clientFullVOs;
        }

}
