
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MlyprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IMlyprojectplanhvoMaintain;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JJJ1_UNAPPROVE extends AbstractPfAction<AggMlyprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggMlyprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMlyprojectplanHVO> processor = new CompareAroundProcesser<AggMlyprojectplanHVO>(
                                MlyprojectplanHVOPluginPoint.UNAPPROVE);
                // TODO 在此处添加前后规则
                processor.addBeforeRule(new UnapproveStatusCheckRule());

                return processor;
        }

        @Override
        protected AggMlyprojectplanHVO[] processBP(Object userObj,
                        AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills) {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                AggMlyprojectplanHVO[] bills = null;
                try {
                        IMlyprojectplanhvoMaintain operator = NCLocator.getInstance()
                                        .lookup(IMlyprojectplanhvoMaintain.class);
                        bills = operator.unapprove(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
