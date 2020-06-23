
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.XunprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.IXunprojectplanhvoMaintain;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XPRJ_SAVEBASE extends AbstractPfAction<AggXunprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggXunprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggXunprojectplanHVO> processor = null;
                AggXunprojectplanHVO[] clientFullVOs = (AggXunprojectplanHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggXunprojectplanHVO>(
                                        XunprojectplanHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggXunprojectplanHVO>(
                                        XunprojectplanHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggXunprojectplanHVO> rule = null;

                return processor;
        }

        @Override
        protected AggXunprojectplanHVO[] processBP(Object userObj,
                        AggXunprojectplanHVO[] clientFullVOs, AggXunprojectplanHVO[] originBills) {

                AggXunprojectplanHVO[] bills = null;
            try {
              IXunprojectplanhvoMaintain operator =
                  NCLocator.getInstance().lookup(IXunprojectplanhvoMaintain.class);
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
