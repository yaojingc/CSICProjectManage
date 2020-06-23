
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MarketprojectHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UncommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IMarketprojecthvoMaintain;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XMZZ_UNSAVEBILL extends AbstractPfAction<AggMarketprojectHVO> {

        @Override
        protected CompareAroundProcesser<AggMarketprojectHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMarketprojectHVO> processor = new CompareAroundProcesser<AggMarketprojectHVO>(
                                MarketprojectHVOPluginPoint.UNSEND_APPROVE);
                // TODO 在此处添加前后规则
                //processor.addBeforeRule(new UncommitStatusCheckRule());

                return processor;
        }

        @Override
        protected AggMarketprojectHVO[] processBP(Object userObj,
                        AggMarketprojectHVO[] clientFullVOs, AggMarketprojectHVO[] originBills) {
                IMarketprojecthvoMaintain operator = NCLocator.getInstance().lookup(
                                IMarketprojecthvoMaintain.class);
                AggMarketprojectHVO[] bills = null;
                try {
                        bills = operator.unsave(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
