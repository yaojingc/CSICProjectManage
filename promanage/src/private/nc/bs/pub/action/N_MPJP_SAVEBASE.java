
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MonprojectplanHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.IMonprojectplanhvoMaintain;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_MPJP_SAVEBASE extends AbstractPfAction<AggMonprojectplanHVO> {

        @Override
        protected CompareAroundProcesser<AggMonprojectplanHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggMonprojectplanHVO> processor = null;
                AggMonprojectplanHVO[] clientFullVOs = (AggMonprojectplanHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggMonprojectplanHVO>(
                                        MonprojectplanHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggMonprojectplanHVO>(
                                        MonprojectplanHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggMonprojectplanHVO> rule = null;

                return processor;
        }

        @Override
        protected AggMonprojectplanHVO[] processBP(Object userObj,
                        AggMonprojectplanHVO[] clientFullVOs, AggMonprojectplanHVO[] originBills) {

                AggMonprojectplanHVO[] bills = null;
            try {
              IMonprojectplanhvoMaintain operator =
                  NCLocator.getInstance().lookup(IMonprojectplanhvoMaintain.class);
              if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                  .getPrimaryKey())) {
                bills = operator.update(clientFullVOs, originBills);
              }
              else {
                bills = operator.insert(clientFullVOs, originBills);
              }
            }
            catch (BusinessException e) {
              ExceptionUtils.wrappBusinessException(e.getMessage());
            }
            return bills;
        }
}
