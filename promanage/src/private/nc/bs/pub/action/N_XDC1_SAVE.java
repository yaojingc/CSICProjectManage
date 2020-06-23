
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SsfactionHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ISsfactionhvoMaintain;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XDC1_SAVE extends AbstractPfAction<AggSsfactionHVO> {

        protected CompareAroundProcesser<AggSsfactionHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggSsfactionHVO> processor = new CompareAroundProcesser<AggSsfactionHVO>(
                SsfactionHVOPluginPoint.SEND_APPROVE);
                // TODO 在此处添加审核前后规则
                IRule<AggSsfactionHVO> rule = new CommitStatusCheckRule();
                processor.addBeforeRule(rule);
                return processor;
        }

        @Override
        protected AggSsfactionHVO[] processBP(Object userObj,
                        AggSsfactionHVO[] clientFullVOs, AggSsfactionHVO[] originBills) {
                ISsfactionhvoMaintain operator = NCLocator.getInstance().lookup(
                                ISsfactionhvoMaintain.class);
                AggSsfactionHVO[] bills = null;
                try {
                        bills = operator.save(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
