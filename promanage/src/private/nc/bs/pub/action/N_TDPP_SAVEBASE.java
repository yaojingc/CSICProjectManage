
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TendaysprojplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.ITendaysprojplanhvoMaintain;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_TDPP_SAVEBASE extends AbstractPfAction<AggTendaysprojplanHVO> {

        @Override
        protected CompareAroundProcesser<AggTendaysprojplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTendaysprojplanHVO> processor = null;
                AggTendaysprojplanHVO[] clientFullVOs = (AggTendaysprojplanHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggTendaysprojplanHVO>(
                                        TendaysprojplanHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggTendaysprojplanHVO>(
                                        TendaysprojplanHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggTendaysprojplanHVO> rule = null;

                return processor;
        }

        @Override
        protected AggTendaysprojplanHVO[] processBP(Object userObj,
                        AggTendaysprojplanHVO[] clientFullVOs, AggTendaysprojplanHVO[] originBills) {

                AggTendaysprojplanHVO[] bills = null;
            try {
              ITendaysprojplanhvoMaintain operator =
                  NCLocator.getInstance().lookup(ITendaysprojplanhvoMaintain.class);
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
