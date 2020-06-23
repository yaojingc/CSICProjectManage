
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TenprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ITenprojectplanhvoMaintain;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XUN1_UNAPPROVE extends AbstractPfAction<AggTenprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggTenprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTenprojectplanHVO> processor = new CompareAroundProcesser<AggTenprojectplanHVO>(
                                TenprojectplanHVOPluginPoint.UNAPPROVE);
                // TODO 在此处添加前后规则
                processor.addBeforeRule(new UnapproveStatusCheckRule());

                return processor;
        }

        @Override
        protected AggTenprojectplanHVO[] processBP(Object userObj,
                        AggTenprojectplanHVO[] clientFullVOs, AggTenprojectplanHVO[] originBills) {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                AggTenprojectplanHVO[] bills = null;
                try {
                        ITenprojectplanhvoMaintain operator = NCLocator.getInstance()
                                        .lookup(ITenprojectplanhvoMaintain.class);
                        bills = operator.unapprove(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
