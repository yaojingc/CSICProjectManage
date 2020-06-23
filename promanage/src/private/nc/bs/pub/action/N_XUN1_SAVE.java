
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TenprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ITenprojectplanhvoMaintain;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XUN1_SAVE extends AbstractPfAction<AggTenprojectplanHVO> {

        protected CompareAroundProcesser<AggTenprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTenprojectplanHVO> processor = new CompareAroundProcesser<AggTenprojectplanHVO>(
                TenprojectplanHVOPluginPoint.SEND_APPROVE);
                // TODO 在此处添加审核前后规则
                IRule<AggTenprojectplanHVO> rule = new CommitStatusCheckRule();
                processor.addBeforeRule(rule);
                return processor;
        }

        @Override
        protected AggTenprojectplanHVO[] processBP(Object userObj,
                        AggTenprojectplanHVO[] clientFullVOs, AggTenprojectplanHVO[] originBills) {
                ITenprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                ITenprojectplanhvoMaintain.class);
                AggTenprojectplanHVO[] bills = null;
                try {
                        bills = operator.save(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
