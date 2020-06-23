
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TendaysprojplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UncommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ITendaysprojplanhvoMaintain;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_TDPP_UNSAVEBILL extends AbstractPfAction<AggTendaysprojplanHVO> {

        @Override
        protected CompareAroundProcesser<AggTendaysprojplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTendaysprojplanHVO> processor = new CompareAroundProcesser<AggTendaysprojplanHVO>(
                                TendaysprojplanHVOPluginPoint.UNSEND_APPROVE);
                // TODO 在此处添加前后规则
                //processor.addBeforeRule(new UncommitStatusCheckRule());

                return processor;
        }

        @Override
        protected AggTendaysprojplanHVO[] processBP(Object userObj,
                        AggTendaysprojplanHVO[] clientFullVOs, AggTendaysprojplanHVO[] originBills) {
                ITendaysprojplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                ITendaysprojplanhvoMaintain.class);
                AggTendaysprojplanHVO[] bills = null;
                try {
                        bills = operator.unsave(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
