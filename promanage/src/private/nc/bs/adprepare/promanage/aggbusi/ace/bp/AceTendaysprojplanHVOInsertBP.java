
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TendaysprojplanHVOPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;

/**
 * ��׼��������BP
 */
public class AceTendaysprojplanHVOInsertBP {

        public AggTendaysprojplanHVO[] insert(AggTendaysprojplanHVO[] bills) {

                InsertBPTemplate<AggTendaysprojplanHVO> bp = new InsertBPTemplate<AggTendaysprojplanHVO>(
TendaysprojplanHVOPluginPoint.INSERT);
                this.addBeforeRule(bp.getAroundProcesser());
                this.addAfterRule(bp.getAroundProcesser());
                return bp.insert(bills);

        }

        /**
         * ���������
         *
         * @param processor
         */
        private void addAfterRule(AroundProcesser<AggTendaysprojplanHVO> processor) {
                IRule<AggTendaysprojplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("TDPP");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setCodeItem("billno");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
                processor.addAfterRule(rule);
        }

        /**
         * ����ǰ����
         *
         * @param processor
         */
        private void addBeforeRule(AroundProcesser<AggTendaysprojplanHVO> processer) {
                IRule<AggTendaysprojplanHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
                processer.addBeforeRule(rule);
                rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCbilltype("TDPP");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
                                .setCodeItem("billno");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setOrgItem("pk_org");
                processer.addBeforeRule(rule);
        }
}
