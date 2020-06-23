
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SsfactionHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.ISsfactionhvoMaintain;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XDC1_SAVEBASE extends AbstractPfAction<AggSsfactionHVO> {

        @Override
        protected CompareAroundProcesser<AggSsfactionHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggSsfactionHVO> processor = null;
                AggSsfactionHVO[] clientFullVOs = (AggSsfactionHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggSsfactionHVO>(
                                        SsfactionHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggSsfactionHVO>(
                                        SsfactionHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggSsfactionHVO> rule = null;

                return processor;
        }

        @Override
        protected AggSsfactionHVO[] processBP(Object userObj,
                        AggSsfactionHVO[] clientFullVOs, AggSsfactionHVO[] originBills) {

                AggSsfactionHVO[] bills = null;
            try {
              ISsfactionhvoMaintain operator =
                  NCLocator.getInstance().lookup(ISsfactionhvoMaintain.class);
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
