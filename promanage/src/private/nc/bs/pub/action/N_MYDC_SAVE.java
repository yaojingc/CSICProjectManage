
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SatisfactionHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ISatisfactionhvoMaintain;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_MYDC_SAVE extends AbstractPfAction<AggSatisfactionHVO> {

        protected CompareAroundProcesser<AggSatisfactionHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggSatisfactionHVO> processor = new CompareAroundProcesser<AggSatisfactionHVO>(
                SatisfactionHVOPluginPoint.SEND_APPROVE);
                // TODO 在此处添加审核前后规则
                IRule<AggSatisfactionHVO> rule = new CommitStatusCheckRule();
                processor.addBeforeRule(rule);
                return processor;
        }

        @Override
        protected AggSatisfactionHVO[] processBP(Object userObj,
                        AggSatisfactionHVO[] clientFullVOs, AggSatisfactionHVO[] originBills) {
                ISatisfactionhvoMaintain operator = NCLocator.getInstance().lookup(
                                ISatisfactionhvoMaintain.class);
                AggSatisfactionHVO[] bills = null;
                try {
                        bills = operator.save(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
