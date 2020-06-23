
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.XunprojectplanHVOPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;

/**
 * 修改保存的BP
 *
 */
public class AceXunprojectplanHVOUpdateBP {

        public AggXunprojectplanHVO[] update(AggXunprojectplanHVO[] bills,
                        AggXunprojectplanHVO[] originBills) {
                // 调用修改模板
                UpdateBPTemplate<AggXunprojectplanHVO> bp = new UpdateBPTemplate<AggXunprojectplanHVO>(
XunprojectplanHVOPluginPoint.UPDATE);
                // 执行前规则
                this.addBeforeRule(bp.getAroundProcesser());
                // 执行后规则
                this.addAfterRule(bp.getAroundProcesser());
                return bp.update(bills, originBills);
        }

        private void addAfterRule(CompareAroundProcesser<AggXunprojectplanHVO> processer) {
                // TODO 后规则
                IRule<AggXunprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("XPRJ");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setCodeItem("");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
                processer.addAfterRule(rule);

        }

        private void addBeforeRule(CompareAroundProcesser<AggXunprojectplanHVO> processer) {
                // TODO 前规则
                IRule<AggXunprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
                processer.addBeforeRule(rule);
                nc.impl.pubapp.pattern.rule.ICompareRule<AggXunprojectplanHVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCbilltype("XPRJ");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCodeItem("");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setOrgItem("pk_org");
                processer.addBeforeRule(ruleCom);
        }

}
