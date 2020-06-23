
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SatisfactionHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.ISatisfactionhvoMaintain;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_MYDC_SAVEBASE extends AbstractPfAction<AggSatisfactionHVO> {

        @Override
        protected CompareAroundProcesser<AggSatisfactionHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggSatisfactionHVO> processor = null;
                AggSatisfactionHVO[] clientFullVOs = (AggSatisfactionHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggSatisfactionHVO>(
                                        SatisfactionHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggSatisfactionHVO>(
                                        SatisfactionHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggSatisfactionHVO> rule = null;

                return processor;
        }

        @Override
        protected AggSatisfactionHVO[] processBP(Object userObj,
                        AggSatisfactionHVO[] clientFullVOs, AggSatisfactionHVO[] originBills) {

                AggSatisfactionHVO[] bills = null;
            try {
              ISatisfactionhvoMaintain operator =
                  NCLocator.getInstance().lookup(ISatisfactionhvoMaintain.class);
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
