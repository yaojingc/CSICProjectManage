
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MonprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IMonprojectplanhvoMaintain;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_MPJP_SAVE extends AbstractPfAction<AggMonprojectplanHVO> {

        protected CompareAroundProcesser<AggMonprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMonprojectplanHVO> processor = new CompareAroundProcesser<AggMonprojectplanHVO>(
                MonprojectplanHVOPluginPoint.SEND_APPROVE);
                // TODO 在此处添加审核前后规则
                IRule<AggMonprojectplanHVO> rule = new CommitStatusCheckRule();
                processor.addBeforeRule(rule);
                return processor;
        }

        @Override
        protected AggMonprojectplanHVO[] processBP(Object userObj,
                        AggMonprojectplanHVO[] clientFullVOs, AggMonprojectplanHVO[] originBills) {
                IMonprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IMonprojectplanhvoMaintain.class);
                AggMonprojectplanHVO[] bills = null;
                try {
                        bills = operator.save(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return bills;
        }

}
