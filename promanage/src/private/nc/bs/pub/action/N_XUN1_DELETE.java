
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TenprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ITenprojectplanhvoMaintain;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XUN1_DELETE extends AbstractPfAction<AggTenprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggTenprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggTenprojectplanHVO> processor = new CompareAroundProcesser<AggTenprojectplanHVO>(
                                TenprojectplanHVOPluginPoint.SCRIPT_DELETE);
                // TODO 在此处添加前后规则
                return processor;
        }

        @Override
        protected AggTenprojectplanHVO[] processBP(Object userObj,
                        AggTenprojectplanHVO[] clientFullVOs, AggTenprojectplanHVO[] originBills) {
                ITenprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                ITenprojectplanhvoMaintain.class);
                try {
                        operator.delete(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return clientFullVOs;
        }

}
