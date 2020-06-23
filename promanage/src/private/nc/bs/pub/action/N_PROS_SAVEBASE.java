
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.ProstartHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.IProstarthvoMaintain;
import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_PROS_SAVEBASE extends AbstractPfAction<AggProstartHVO> {

        @Override
        protected CompareAroundProcesser<AggProstartHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggProstartHVO> processor = null;
                AggProstartHVO[] clientFullVOs = (AggProstartHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggProstartHVO>(
                                        ProstartHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggProstartHVO>(
                                        ProstartHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggProstartHVO> rule = null;

                return processor;
        }

        @Override
        protected AggProstartHVO[] processBP(Object userObj,
                        AggProstartHVO[] clientFullVOs, AggProstartHVO[] originBills) {

                AggProstartHVO[] bills = null;
            try {
              IProstarthvoMaintain operator =
                  NCLocator.getInstance().lookup(IProstarthvoMaintain.class);
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
