
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.ProfinishHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IProfinishhvoMaintain;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_PROF_APPROVE extends AbstractPfAction<AggProfinishHVO> {

        public N_PROF_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggProfinishHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggProfinishHVO> processor = new CompareAroundProcesser<AggProfinishHVO>(
                                ProfinishHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggProfinishHVO[] processBP(Object userObj,
                        AggProfinishHVO[] clientFullVOs, AggProfinishHVO[] originBills) {
                AggProfinishHVO[] bills = null;
                IProfinishhvoMaintain operator = NCLocator.getInstance().lookup(
                                IProfinishhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
