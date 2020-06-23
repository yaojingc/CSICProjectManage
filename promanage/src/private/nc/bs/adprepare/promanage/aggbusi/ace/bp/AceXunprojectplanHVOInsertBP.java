
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.XunprojectplanHVOPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;

/**
 * 标准单据新增BP
 */
public class AceXunprojectplanHVOInsertBP {

        public AggXunprojectplanHVO[] insert(AggXunprojectplanHVO[] bills) {

                InsertBPTemplate<AggXunprojectplanHVO> bp = new InsertBPTemplate<AggXunprojectplanHVO>(
XunprojectplanHVOPluginPoint.INSERT);
                this.addBeforeRule(bp.getAroundProcesser());
                this.addAfterRule(bp.getAroundProcesser());
                return bp.insert(bills);

        }

        /**
         * 新增后规则
         *
         * @param processor
         */
        private void addAfterRule(AroundProcesser<AggXunprojectplanHVO> processor) {
                IRule<AggXunprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("XPRJ");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setCodeItem("");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
                processor.addAfterRule(rule);
        }

        /**
         * 新增前规则
         *
         * @param processor
         */
        private void addBeforeRule(AroundProcesser<AggXunprojectplanHVO> processer) {
                IRule<AggXunprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
                processer.addBeforeRule(rule);
                rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCbilltype("XPRJ");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
                                .setCodeItem("");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setOrgItem("pk_org");
                processer.addBeforeRule(rule);
        }
}
