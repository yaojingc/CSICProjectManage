
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SsfactionHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ISsfactionhvoMaintain;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XDC1_APPROVE extends AbstractPfAction<AggSsfactionHVO> {

        public N_XDC1_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggSsfactionHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggSsfactionHVO> processor = new CompareAroundProcesser<AggSsfactionHVO>(
                                SsfactionHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggSsfactionHVO[] processBP(Object userObj,
                        AggSsfactionHVO[] clientFullVOs, AggSsfactionHVO[] originBills) {
                AggSsfactionHVO[] bills = null;
                ISsfactionhvoMaintain operator = NCLocator.getInstance().lookup(
                                ISsfactionhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
