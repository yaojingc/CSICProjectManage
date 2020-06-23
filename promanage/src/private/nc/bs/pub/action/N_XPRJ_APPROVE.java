
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.XunprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IXunprojectplanhvoMaintain;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XPRJ_APPROVE extends AbstractPfAction<AggXunprojectplanHVO> {

        public N_XPRJ_APPROVE() {
                super();
        }

        @Override
        protected CompareAroundProcesser<AggXunprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggXunprojectplanHVO> processor = new CompareAroundProcesser<AggXunprojectplanHVO>(
                                XunprojectplanHVOPluginPoint.APPROVE);
                processor.addBeforeRule(new ApproveStatusCheckRule());
                return processor;
        }

        @Override
        protected AggXunprojectplanHVO[] processBP(Object userObj,
                        AggXunprojectplanHVO[] clientFullVOs, AggXunprojectplanHVO[] originBills) {
                AggXunprojectplanHVO[] bills = null;
                IXunprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IXunprojectplanhvoMaintain.class);
                try {
                        bills = operator.approve(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
