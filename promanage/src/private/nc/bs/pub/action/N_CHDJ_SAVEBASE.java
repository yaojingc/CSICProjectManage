
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.CustregisterHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.ICustregisterhvoMaintain;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_CHDJ_SAVEBASE extends AbstractPfAction<AggCustregisterHVO> {

        @Override
        protected CompareAroundProcesser<AggCustregisterHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggCustregisterHVO> processor = null;
                AggCustregisterHVO[] clientFullVOs = (AggCustregisterHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggCustregisterHVO>(
                                        CustregisterHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggCustregisterHVO>(
                                        CustregisterHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggCustregisterHVO> rule = null;

                return processor;
        }

        @Override
        protected AggCustregisterHVO[] processBP(Object userObj,
                        AggCustregisterHVO[] clientFullVOs, AggCustregisterHVO[] originBills) {

                AggCustregisterHVO[] bills = null;
            try {
              ICustregisterhvoMaintain operator =
                  NCLocator.getInstance().lookup(ICustregisterhvoMaintain.class);
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
