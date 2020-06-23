
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.CustregisterHVOPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.adprepare.custregister.AggCustregisterHVO;

/**
 * ��׼��������BP
 */
public class AceCustregisterHVOInsertBP {

        public AggCustregisterHVO[] insert(AggCustregisterHVO[] bills) {

                InsertBPTemplate<AggCustregisterHVO> bp = new InsertBPTemplate<AggCustregisterHVO>(
CustregisterHVOPluginPoint.INSERT);
                this.addBeforeRule(bp.getAroundProcesser());
                this.addAfterRule(bp.getAroundProcesser());
                return bp.insert(bills);

        }

        /**
         * ���������
         *
         * @param processor
         */
        private void addAfterRule(AroundProcesser<AggCustregisterHVO> processor) {
                IRule<AggCustregisterHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("CHDJ");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setCodeItem("vbillcode");
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
        private void addBeforeRule(AroundProcesser<AggCustregisterHVO> processer) {
                IRule<AggCustregisterHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
                processer.addBeforeRule(rule);
                rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCbilltype("CHDJ");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
                                .setCodeItem("vbillcode");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setOrgItem("pk_org");
                processer.addBeforeRule(rule);
        }
}
