
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.XunprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UncommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IXunprojectplanhvoMaintain;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XPRJ_UNSAVEBILL extends AbstractPfAction<AggXunprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggXunprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggXunprojectplanHVO> processor = new CompareAroundProcesser<AggXunprojectplanHVO>(
                                XunprojectplanHVOPluginPoint.UNSEND_APPROVE);
                // TODO 在此处添加前后规则
                //processor.addBeforeRule(new UncommitStatusCheckRule());

                return processor;
        }

        @Override
        protected AggXunprojectplanHVO[] processBP(Object userObj,
                        AggXunprojectplanHVO[] clientFullVOs, AggXunprojectplanHVO[] originBills) {
                IXunprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IXunprojectplanhvoMaintain.class);
                AggXunprojectplanHVO[] bills = null;
                try {
                        bills = operator.unsave(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
