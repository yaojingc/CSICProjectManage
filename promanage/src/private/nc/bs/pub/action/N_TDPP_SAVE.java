
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TendaysprojplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ITendaysprojplanhvoMaintain;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_TDPP_SAVE extends AbstractPfAction<AggTendaysprojplanHVO> {

        protected CompareAroundProcesser<AggTendaysprojplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTendaysprojplanHVO> processor = new CompareAroundProcesser<AggTendaysprojplanHVO>(
                TendaysprojplanHVOPluginPoint.SEND_APPROVE);
                // TODO 在此处添加审核前后规则
                IRule<AggTendaysprojplanHVO> rule = new CommitStatusCheckRule();
                processor.addBeforeRule(rule);
                return processor;
        }

        @Override
        protected AggTendaysprojplanHVO[] processBP(Object userObj,
                        AggTendaysprojplanHVO[] clientFullVOs, AggTendaysprojplanHVO[] originBills) {
                ITendaysprojplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                ITendaysprojplanhvoMaintain.class);
                AggTendaysprojplanHVO[] bills = null;
                try {
                        bills = operator.save(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
