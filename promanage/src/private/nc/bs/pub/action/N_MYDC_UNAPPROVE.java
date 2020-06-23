
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SatisfactionHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ISatisfactionhvoMaintain;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_MYDC_UNAPPROVE extends AbstractPfAction<AggSatisfactionHVO> {

        @Override
        protected CompareAroundProcesser<AggSatisfactionHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggSatisfactionHVO> processor = new CompareAroundProcesser<AggSatisfactionHVO>(
                                SatisfactionHVOPluginPoint.UNAPPROVE);
                // TODO 在此处添加前后规则
                processor.addBeforeRule(new UnapproveStatusCheckRule());

                return processor;
        }

        @Override
        protected AggSatisfactionHVO[] processBP(Object userObj,
                        AggSatisfactionHVO[] clientFullVOs, AggSatisfactionHVO[] originBills) {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                AggSatisfactionHVO[] bills = null;
                try {
                        ISatisfactionhvoMaintain operator = NCLocator.getInstance()
                                        .lookup(ISatisfactionhvoMaintain.class);
                        bills = operator.unapprove(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
