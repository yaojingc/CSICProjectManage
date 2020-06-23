
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.XunprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IXunprojectplanhvoMaintain;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XPRJ_SAVE extends AbstractPfAction<AggXunprojectplanHVO> {

        protected CompareAroundProcesser<AggXunprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggXunprojectplanHVO> processor = new CompareAroundProcesser<AggXunprojectplanHVO>(
                XunprojectplanHVOPluginPoint.SEND_APPROVE);
                // TODO 在此处添加审核前后规则
                IRule<AggXunprojectplanHVO> rule = new CommitStatusCheckRule();
                processor.addBeforeRule(rule);
                return processor;
        }

        @Override
        protected AggXunprojectplanHVO[] processBP(Object userObj,
                        AggXunprojectplanHVO[] clientFullVOs, AggXunprojectplanHVO[] originBills) {
                IXunprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IXunprojectplanhvoMaintain.class);
                AggXunprojectplanHVO[] bills = null;
                try {
                        bills = operator.save(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
