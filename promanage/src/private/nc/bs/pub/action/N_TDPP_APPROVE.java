
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TendaysprojplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ITendaysprojplanhvoMaintain;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_TDPP_APPROVE extends AbstractPfAction<AggTendaysprojplanHVO> {

        public N_TDPP_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggTendaysprojplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTendaysprojplanHVO> processor = new CompareAroundProcesser<AggTendaysprojplanHVO>(
                                TendaysprojplanHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggTendaysprojplanHVO[] processBP(Object userObj,
                        AggTendaysprojplanHVO[] clientFullVOs, AggTendaysprojplanHVO[] originBills) {
                AggTendaysprojplanHVO[] bills = null;
                ITendaysprojplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                ITendaysprojplanhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
