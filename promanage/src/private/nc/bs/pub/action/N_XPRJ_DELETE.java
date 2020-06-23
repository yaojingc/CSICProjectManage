
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.XunprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.IXunprojectplanhvoMaintain;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_XPRJ_DELETE extends AbstractPfAction<AggXunprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggXunprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggXunprojectplanHVO> processor = new CompareAroundProcesser<AggXunprojectplanHVO>(
                                XunprojectplanHVOPluginPoint.SCRIPT_DELETE);
                // TODO 在此处添加前后规则
                return processor;
        }

        @Override
        protected AggXunprojectplanHVO[] processBP(Object userObj,
                        AggXunprojectplanHVO[] clientFullVOs, AggXunprojectplanHVO[] originBills) {
                IXunprojectplanhvoMaintain operator = NCLocator.getInstance().lookup(
                                IXunprojectplanhvoMaintain.class);
                try {
                        operator.delete(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return clientFullVOs;
        }

}
