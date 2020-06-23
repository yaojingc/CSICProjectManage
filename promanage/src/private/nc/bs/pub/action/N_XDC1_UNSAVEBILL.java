
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SsfactionHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UncommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ISsfactionhvoMaintain;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XDC1_UNSAVEBILL extends AbstractPfAction<AggSsfactionHVO> {

        @Override
        protected CompareAroundProcesser<AggSsfactionHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggSsfactionHVO> processor = new CompareAroundProcesser<AggSsfactionHVO>(
                                SsfactionHVOPluginPoint.UNSEND_APPROVE);
                // TODO 在此处添加前后规则
                //processor.addBeforeRule(new UncommitStatusCheckRule());

                return processor;
        }

        @Override
        protected AggSsfactionHVO[] processBP(Object userObj,
                        AggSsfactionHVO[] clientFullVOs, AggSsfactionHVO[] originBills) {
                ISsfactionhvoMaintain operator = NCLocator.getInstance().lookup(
                                ISsfactionhvoMaintain.class);
                AggSsfactionHVO[] bills = null;
                try {
                        bills = operator.unsave(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
