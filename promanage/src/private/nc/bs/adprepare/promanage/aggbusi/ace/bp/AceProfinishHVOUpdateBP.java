
package nc.bs.adprepare.promanage.aggbusi.ace.bp;

import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.ProfinishHVOPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.adprepare.projectfinish.AggProfinishHVO;

/**
 * �޸ı����BP
 *
 */
public class AceProfinishHVOUpdateBP {

        public AggProfinishHVO[] update(AggProfinishHVO[] bills,
                        AggProfinishHVO[] originBills) {
                // �����޸�ģ��
                UpdateBPTemplate<AggProfinishHVO> bp = new UpdateBPTemplate<AggProfinishHVO>(
ProfinishHVOPluginPoint.UPDATE);
                // ִ��ǰ����
                this.addBeforeRule(bp.getAroundProcesser());
                // ִ�к����
                this.addAfterRule(bp.getAroundProcesser());
                return bp.update(bills, originBills);
        }

        private void addAfterRule(CompareAroundProcesser<AggProfinishHVO> processer) {
                // TODO �����
                IRule<AggProfinishHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("PROF");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setCodeItem("vbillcode");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
                processer.addAfterRule(rule);

        }

        private void addBeforeRule(CompareAroundProcesser<AggProfinishHVO> processer) {
                // TODO ǰ����
                IRule<AggProfinishHVO> rule = null;
                rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
                processer.addBeforeRule(rule);
                nc.impl.pubapp.pattern.rule.ICompareRule<AggProfinishHVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCbilltype("PROF");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setCodeItem("vbillcode");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setGroupItem("pk_group");
                ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
                                .setOrgItem("pk_org");
                processer.addBeforeRule(ruleCom);
        }

}
