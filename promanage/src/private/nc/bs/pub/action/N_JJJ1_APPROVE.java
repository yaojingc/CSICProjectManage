
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MlyprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IMlyprojectplanhvoMaintain;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JJJ1_APPROVE extends AbstractPfAction<AggMlyprojectplanHVO> {

        public N_JJJ1_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggMlyprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMlyprojectplanHVO> processor = new CompareAroundProcesser<AggMlyprojectplanHVO>(
                                MlyprojectplanHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggMlyprojectplanHVO[] processBP(Object userObj,
                        AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills) {
                AggMlyprojectplanHVO[] bills = null;
                IMlyprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IMlyprojectplanhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
