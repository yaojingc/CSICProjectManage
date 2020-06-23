
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.ProfinishHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UncommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IProfinishhvoMaintain;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_PROF_UNSAVEBILL extends AbstractPfAction<AggProfinishHVO> {

        @Override
        protected CompareAroundProcesser<AggProfinishHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggProfinishHVO> processor = new CompareAroundProcesser<AggProfinishHVO>(
                                ProfinishHVOPluginPoint.UNSEND_APPROVE);
                // TODO 在此处添加前后规则
                //processor.addBeforeRule(new UncommitStatusCheckRule());

                return processor;
        }

        @Override
        protected AggProfinishHVO[] processBP(Object userObj,
                        AggProfinishHVO[] clientFullVOs, AggProfinishHVO[] originBills) {
                IProfinishhvoMaintain operator = NCLocator.getInstance().lookup(
                                IProfinishhvoMaintain.class);
                AggProfinishHVO[] bills = null;
                try {
                        bills = operator.unsave(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
