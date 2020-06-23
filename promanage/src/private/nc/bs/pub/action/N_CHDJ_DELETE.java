
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.CustregisterHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.adprepare.promanage.ICustregisterhvoMaintain;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_CHDJ_DELETE extends AbstractPfAction<AggCustregisterHVO> {

        @Override
        protected CompareAroundProcesser<AggCustregisterHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggCustregisterHVO> processor = new CompareAroundProcesser<AggCustregisterHVO>(
                                CustregisterHVOPluginPoint.SCRIPT_DELETE);
                // TODO 在此处添加前后规则
                return processor;
        }

        @Override
        protected AggCustregisterHVO[] processBP(Object userObj,
                        AggCustregisterHVO[] clientFullVOs, AggCustregisterHVO[] originBills) {
                ICustregisterhvoMaintain operator = NCLocator.getInstance().lookup(
                                ICustregisterhvoMaintain.class);
                try {
                        operator.delete(clientFullVOs, originBills);
                } catch (BusinessException e) {
                        ExceptionUtils.wrappBusinessException(e.getMessage());
                }
                return clientFullVOs;
        }

}
