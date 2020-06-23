
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.CustregisterHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ICustregisterhvoMaintain;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_CHDJ_APPROVE extends AbstractPfAction<AggCustregisterHVO> {

        public N_CHDJ_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggCustregisterHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggCustregisterHVO> processor = new CompareAroundProcesser<AggCustregisterHVO>(
                                CustregisterHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggCustregisterHVO[] processBP(Object userObj,
                        AggCustregisterHVO[] clientFullVOs, AggCustregisterHVO[] originBills) {
                AggCustregisterHVO[] bills = null;
                ICustregisterhvoMaintain operator = NCLocator.getInstance().lookup(
                                ICustregisterhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
