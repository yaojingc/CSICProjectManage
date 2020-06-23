
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MarketprojectHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IMarketprojecthvoMaintain;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XMZZ_APPROVE extends AbstractPfAction<AggMarketprojectHVO> {

        public N_XMZZ_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggMarketprojectHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMarketprojectHVO> processor = new CompareAroundProcesser<AggMarketprojectHVO>(
                                MarketprojectHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggMarketprojectHVO[] processBP(Object userObj,
                        AggMarketprojectHVO[] clientFullVOs, AggMarketprojectHVO[] originBills) {
                AggMarketprojectHVO[] bills = null;
                IMarketprojecthvoMaintain operator = NCLocator.getInstance().lookup(
                                IMarketprojecthvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
