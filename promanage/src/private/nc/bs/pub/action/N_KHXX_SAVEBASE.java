
package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.CustinformationHVOPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.itf.adprepare.promanage.ICustinformationhvoMaintain;
import nc.vo.adprepare.custinformation.AggCustinformationHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_KHXX_SAVEBASE extends AbstractPfAction<AggCustinformationHVO> {

        @Override
        protected CompareAroundProcesser<AggCustinformationHVO> getCompareAroundProcesserWithRules(
                        Object userObj) {
                CompareAroundProcesser<AggCustinformationHVO> processor = null;
                AggCustinformationHVO[] clientFullVOs = (AggCustinformationHVO[]) this.getVos();
                if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
                                .getPrimaryKey())) {
                        processor = new CompareAroundProcesser<AggCustinformationHVO>(
                                        CustinformationHVOPluginPoint.SCRIPT_UPDATE);
                } else {
                        processor = new CompareAroundProcesser<AggCustinformationHVO>(
                                        CustinformationHVOPluginPoint.SCRIPT_INSERT);
                }
                // TODO 在此处添加前后规则
                IRule<AggCustinformationHVO> rule = null;

                return processor;
        }

        @Override
        protected AggCustinformationHVO[] processBP(Object userObj,
                        AggCustinformationHVO[] clientFullVOs, AggCustinformationHVO[] originBills) {

                AggCustinformationHVO[] bills = null;
            try {
              ICustinformationhvoMaintain operator =
                  NCLocator.getInstance().lookup(ICustinformationhvoMaintain.class);
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
