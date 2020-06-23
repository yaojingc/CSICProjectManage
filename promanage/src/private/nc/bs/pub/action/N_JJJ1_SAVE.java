
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MlyprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IMlyprojectplanhvoMaintain;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JJJ1_SAVE extends AbstractPfAction<AggMlyprojectplanHVO> {

        protected CompareAroundProcesser<AggMlyprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMlyprojectplanHVO> processor = new CompareAroundProcesser<AggMlyprojectplanHVO>(
                MlyprojectplanHVOPluginPoint.SEND_APPROVE);
                // TODO 在此处添加审核前后规则
                IRule<AggMlyprojectplanHVO> rule = new CommitStatusCheckRule();
                processor.addBeforeRule(rule);
                return processor;
        }

        @Override
        protected AggMlyprojectplanHVO[] processBP(Object userObj,
                        AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills) {
                IMlyprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IMlyprojectplanhvoMaintain.class);
                AggMlyprojectplanHVO[] bills = null;
                try {
                        bills = operator.save(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
