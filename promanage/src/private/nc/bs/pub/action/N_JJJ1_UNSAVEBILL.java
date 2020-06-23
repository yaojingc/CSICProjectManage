
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MlyprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UncommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IMlyprojectplanhvoMaintain;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JJJ1_UNSAVEBILL extends AbstractPfAction<AggMlyprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggMlyprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMlyprojectplanHVO> processor = new CompareAroundProcesser<AggMlyprojectplanHVO>(
                                MlyprojectplanHVOPluginPoint.UNSEND_APPROVE);
                // TODO 在此处添加前后规则
                //processor.addBeforeRule(new UncommitStatusCheckRule());

                return processor;
        }

        @Override
        protected AggMlyprojectplanHVO[] processBP(Object userObj,
                        AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills) {
                IMlyprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IMlyprojectplanhvoMaintain.class);
                AggMlyprojectplanHVO[] bills = null;
                try {
                        bills = operator.unsave(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
