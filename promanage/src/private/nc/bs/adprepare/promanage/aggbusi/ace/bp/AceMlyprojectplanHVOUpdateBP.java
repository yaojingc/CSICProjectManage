
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MlyprojectplanHVOPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;

/**
 * 修改保存的BP
 *
 */
public class AceMlyprojectplanHVOUpdateBP {

        public AggMlyprojectplanHVO[] update(AggMlyprojectplanHVO[] bills,
                        AggMlyprojectplanHVO[] originBills) {
                // 调用修改模板
                UpdateBPTemplate<AggMlyprojectplanHVO> bp = new UpdateBPTemplate<AggMlyprojectplanHVO>(
MlyprojectplanHVOPluginPoint.UPDATE);
                // 执行前规则
                this.addBeforeRule(bp.getAroundProcesser());
                // 执行后规则
                this.addAfterRule(bp.getAroundProcesser());
                return bp.update(bills, originBills);
        }

        private void addAfterRule(CompareAroundProcesser<AggMlyprojectplanHVO> processer) {
                // TODO 后规则
                IRule<AggMlyprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JJJ1");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setCodeItem("bill_code");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
                processer.addAfterRule(rule);

        }

        private void addBeforeRule(CompareAroundProcesser<AggMlyprojectplanHVO> processer) {
                // TODO 前规则
                IRule<AggMlyprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
                processer.addBeforeRule(rule);
                nc.impl.pubapp.pattern.rule.ICompareRule<AggMlyprojectplanHVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCbilltype("JJJ1");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCodeItem("bill_code");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setOrgItem("pk_org");
                processer.addBeforeRule(ruleCom);
        }

}
