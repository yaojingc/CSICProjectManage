
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.CustregisterHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ICustregisterhvoMaintain;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_CHDJ_UNAPPROVE extends AbstractPfAction<AggCustregisterHVO> {

        @Override
        protected CompareAroundProcesser<AggCustregisterHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggCustregisterHVO> processor = new CompareAroundProcesser<AggCustregisterHVO>(
                                CustregisterHVOPluginPoint.UNAPPROVE);
                // TODO 在此处添加前后规则
                processor.addBeforeRule(new UnapproveStatusCheckRule());

                return processor;
        }

        @Override
        protected AggCustregisterHVO[] processBP(Object userObj,
                        AggCustregisterHVO[] clientFullVOs, AggCustregisterHVO[] originBills) {
                for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
                        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
                }
                AggCustregisterHVO[] bills = null;
                try {
                        ICustregisterhvoMaintain operator = NCLocator.getInstance()
                                        .lookup(ICustregisterhvoMaintain.class);
                        bills = operator.unapprove(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
