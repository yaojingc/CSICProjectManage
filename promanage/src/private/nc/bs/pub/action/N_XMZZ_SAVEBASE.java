
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MarketprojectHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.IMarketprojecthvoMaintain;
import nc.vo.adprepare.marketproject.AggMarketprojectHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XMZZ_SAVEBASE extends AbstractPfAction<AggMarketprojectHVO> {

        @Override
        protected CompareAroundProcesser<AggMarketprojectHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMarketprojectHVO> processor = null;
                AggMarketprojectHVO[] clientFullVOs = (AggMarketprojectHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggMarketprojectHVO>(
                                        MarketprojectHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggMarketprojectHVO>(
                                        MarketprojectHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggMarketprojectHVO> rule = null;

                return processor;
        }

        @Override
        protected AggMarketprojectHVO[] processBP(Object userObj,
                        AggMarketprojectHVO[] clientFullVOs, AggMarketprojectHVO[] originBills) {

                AggMarketprojectHVO[] bills = null;
            try {
              IMarketprojecthvoMaintain operator =
                  NCLocator.getInstance().lookup(IMarketprojecthvoMaintain.class);
              if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                  .getPrimaryKey())) {
                bills = operator.update(clientFullVOs, originBills);
              }
              else {
                bills = operator.insert(clientFullVOs, originBills);
              }
            }
            catch (BusinessException e) {
              ExceptionUtils.wrappBusinessException(e.getMessage());
            }
            return bills;
        }
}
