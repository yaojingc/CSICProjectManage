
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TenprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.ITenprojectplanhvoMaintain;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XUN1_SAVEBASE extends AbstractPfAction<AggTenprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggTenprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTenprojectplanHVO> processor = null;
                AggTenprojectplanHVO[] clientFullVOs = (AggTenprojectplanHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggTenprojectplanHVO>(
                                        TenprojectplanHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggTenprojectplanHVO>(
                                        TenprojectplanHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggTenprojectplanHVO> rule = null;

                return processor;
        }

        @Override
        protected AggTenprojectplanHVO[] processBP(Object userObj,
                        AggTenprojectplanHVO[] clientFullVOs, AggTenprojectplanHVO[] originBills) {

                AggTenprojectplanHVO[] bills = null;
            try {
              ITenprojectplanhvoMaintain operator =
                  NCLocator.getInstance().lookup(ITenprojectplanhvoMaintain.class);
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
