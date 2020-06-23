
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MlyprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.IMlyprojectplanhvoMaintain;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JJJ1_SAVEBASE extends AbstractPfAction<AggMlyprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggMlyprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMlyprojectplanHVO> processor = null;
                AggMlyprojectplanHVO[] clientFullVOs = (AggMlyprojectplanHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggMlyprojectplanHVO>(
                                        MlyprojectplanHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggMlyprojectplanHVO>(
                                        MlyprojectplanHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggMlyprojectplanHVO> rule = null;

                return processor;
        }

        @Override
        protected AggMlyprojectplanHVO[] processBP(Object userObj,
                        AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills) {

                AggMlyprojectplanHVO[] bills = null;
            try {
              IMlyprojectplanhvoMaintain operator =
                  NCLocator.getInstance().lookup(IMlyprojectplanhvoMaintain.class);
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
