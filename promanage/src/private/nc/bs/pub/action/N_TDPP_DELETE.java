
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TendaysprojplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ITendaysprojplanhvoMaintain;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_TDPP_DELETE extends AbstractPfAction<AggTendaysprojplanHVO> {

        @Override
        protected CompareAroundProcesser<AggTendaysprojplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTendaysprojplanHVO> processor = new CompareAroundProcesser<AggTendaysprojplanHVO>(
                                TendaysprojplanHVOPluginPoint.SCRIPT_DELETE);
                // TODO 在此处添加前后规则
                return processor;
        }

        @Override
        protected AggTendaysprojplanHVO[] processBP(Object userObj,
                        AggTendaysprojplanHVO[] clientFullVOs, AggTendaysprojplanHVO[] originBills) {
                ITendaysprojplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                ITendaysprojplanhvoMaintain.class);
                try {
                        operator.delete(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return clientFullVOs;
        }

}
