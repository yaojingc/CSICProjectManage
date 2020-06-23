
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MonprojectplanHVOPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.adprepare.monthprojectplan.AggMonprojectplanHVO;

/**
 * 标准单据新增BP
 */
public class AceMonprojectplanHVOInsertBP {

        public AggMonprojectplanHVO[] insert(AggMonprojectplanHVO[] bills) {

                InsertBPTemplate<AggMonprojectplanHVO> bp = new InsertBPTemplate<AggMonprojectplanHVO>(
MonprojectplanHVOPluginPoint.INSERT);
                this.addBeforeRule(bp.getAroundProcesser());
                this.addAfterRule(bp.getAroundProcesser());
                return bp.insert(bills);

        }

        /**
         * 新增后规则
         *
         * @param processor
         */
        private void addAfterRule(AroundProcesser<AggMonprojectplanHVO> processor) {
                IRule<AggMonprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("MPJP");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setCodeItem("billno");
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
        private void addBeforeRule(AroundProcesser<AggMonprojectplanHVO> processer) {
                IRule<AggMonprojectplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
                processer.addBeforeRule(rule);
                rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCbilltype("MPJP");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
                                .setCodeItem("billno");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setOrgItem("pk_org");
                processer.addBeforeRule(rule);
        }
}
