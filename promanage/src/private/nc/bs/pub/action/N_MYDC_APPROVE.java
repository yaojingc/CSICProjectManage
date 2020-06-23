
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SatisfactionHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ISatisfactionhvoMaintain;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_MYDC_APPROVE extends AbstractPfAction<AggSatisfactionHVO> {

        public N_MYDC_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggSatisfactionHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggSatisfactionHVO> processor = new CompareAroundProcesser<AggSatisfactionHVO>(
                                SatisfactionHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggSatisfactionHVO[] processBP(Object userObj,
                        AggSatisfactionHVO[] clientFullVOs, AggSatisfactionHVO[] originBills) {
                AggSatisfactionHVO[] bills = null;
                ISatisfactionhvoMaintain operator = NCLocator.getInstance().lookup(
                                ISatisfactionhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
