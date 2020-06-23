
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MonprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IMonprojectplanhvoMaintain;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_MPJP_APPROVE extends AbstractPfAction<AggMonprojectplanHVO> {

        public N_MPJP_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggMonprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMonprojectplanHVO> processor = new CompareAroundProcesser<AggMonprojectplanHVO>(
                                MonprojectplanHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggMonprojectplanHVO[] processBP(Object userObj,
                        AggMonprojectplanHVO[] clientFullVOs, AggMonprojectplanHVO[] originBills) {
                AggMonprojectplanHVO[] bills = null;
                IMonprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IMonprojectplanhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
