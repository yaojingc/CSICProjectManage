
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.CustinformationHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ICustinformationhvoMaintain;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_KHXX_APPROVE extends AbstractPfAction<AggCustinformationHVO> {

        public N_KHXX_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggCustinformationHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggCustinformationHVO> processor = new CompareAroundProcesser<AggCustinformationHVO>(
                                CustinformationHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggCustinformationHVO[] processBP(Object userObj,
                        AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills) {
                AggCustinformationHVO[] bills = null;
                ICustinformationhvoMaintain operator = NCLocator.getInstance().lookup(
                                ICustinformationhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
