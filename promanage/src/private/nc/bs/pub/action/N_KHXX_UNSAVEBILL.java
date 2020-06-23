
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.CustinformationHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UncommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ICustinformationhvoMaintain;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_KHXX_UNSAVEBILL extends AbstractPfAction<AggCustinformationHVO> {

        @Override
        protected CompareAroundProcesser<AggCustinformationHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggCustinformationHVO> processor = new CompareAroundProcesser<AggCustinformationHVO>(
                                CustinformationHVOPluginPoint.UNSEND_APPROVE);
                // TODO 在此处添加前后规则
                //processor.addBeforeRule(new UncommitStatusCheckRule());

                return processor;
        }

        @Override
        protected AggCustinformationHVO[] processBP(Object userObj,
                        AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills) {
                ICustinformationhvoMaintain operator = NCLocator.getInstance().lookup(
                                ICustinformationhvoMaintain.class);
                AggCustinformationHVO[] bills = null;
                try {
                        bills = operator.unsave(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
