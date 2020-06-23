
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.ProstartHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UncommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IProstarthvoMaintain;
import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_PROS_UNSAVEBILL extends AbstractPfAction<AggProstartHVO> {

        @Override
        protected CompareAroundProcesser<AggProstartHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggProstartHVO> processor = new CompareAroundProcesser<AggProstartHVO>(
                                ProstartHVOPluginPoint.UNSEND_APPROVE);
                // TODO 在此处添加前后规则
                //processor.addBeforeRule(new UncommitStatusCheckRule());

                return processor;
        }

        @Override
        protected AggProstartHVO[] processBP(Object userObj,
                        AggProstartHVO[] clientFullVOs, AggProstartHVO[] originBills) {
                IProstarthvoMaintain operator = NCLocator.getInstance().lookup(
                                IProstarthvoMaintain.class);
                AggProstartHVO[] bills = null;
                try {
                        bills = operator.unsave(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
