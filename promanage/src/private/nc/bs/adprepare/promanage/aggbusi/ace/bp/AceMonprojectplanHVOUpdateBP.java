
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MonprojectplanHVOPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;

/**
 * 修改保存的BP
 *
 */
public class AceMonprojectplanHVOUpdateBP {

        public AggMonprojectplanHVO[] update(AggMonprojectplanHVO[] bills,
                        AggMonprojectplanHVO[] originBills) {
                // 调用修改模板
                UpdateBPTemplate<AggMonprojectplanHVO> bp = new UpdateBPTemplate<AggMonprojectplanHVO>(
MonprojectplanHVOPluginPoint.UPDATE);
                // 执行前规则
                this.addBeforeRule(bp.getAroundProcesser());
                // 执行后规则
                this.addAfterRule(bp.getAroundProcesser());
                return bp.update(bills, originBills);
        }

        private void addAfterRule(CompareAroundProcesser<AggMonprojectplanHVO> processer) {
                // TODO 后规则
                IRule<AggMonprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("MPJP");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setCodeItem("billno");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
                processer.addAfterRule(rule);

        }

        private void addBeforeRule(CompareAroundProcesser<AggMonprojectplanHVO> processer) {
                // TODO 前规则
                IRule<AggMonprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
                processer.addBeforeRule(rule);
                nc.impl.pubapp.pattern.rule.ICompareRule<AggMonprojectplanHVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCbilltype("MPJP");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCodeItem("billno");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setOrgItem("pk_org");
                processer.addBeforeRule(ruleCom);
        }

}
