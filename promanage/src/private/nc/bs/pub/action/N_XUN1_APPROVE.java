
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TenprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ITenprojectplanhvoMaintain;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XUN1_APPROVE extends AbstractPfAction<AggTenprojectplanHVO> {

        public N_XUN1_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggTenprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTenprojectplanHVO> processor = new CompareAroundProcesser<AggTenprojectplanHVO>(
                                TenprojectplanHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggTenprojectplanHVO[] processBP(Object userObj,
                        AggTenprojectplanHVO[] clientFullVOs, AggTenprojectplanHVO[] originBills) {
                AggTenprojectplanHVO[] bills = null;
                ITenprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                ITenprojectplanhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
