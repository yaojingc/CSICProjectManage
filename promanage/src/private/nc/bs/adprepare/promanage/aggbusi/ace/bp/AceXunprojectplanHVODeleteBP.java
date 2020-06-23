
package nc.bs.adprepare.promanage.aggbusi.ace.bp;


import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.XunprojectplanHVOPluginPoint;
import nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AceXunprojectplanHVODeleteBP {

        public void delete(AggXunprojectplanHVO[] bills) {

                DeleteBPTemplate<AggXunprojectplanHVO> bp = new DeleteBPTemplate<AggXunprojectplanHVO>(
XunprojectplanHVOPluginPoint.DELETE);
                // ����ִ��ǰ����
                this.addBeforeRule(bp.getAroundProcesser());
                // ����ִ�к�ҵ�����
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggXunprojectplanHVO> processer) {
                // TODO ǰ����
//              IRule<AggXunprojectplanHVO> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * ɾ����ҵ�����
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggXunprojectplanHVO> processer) {
                // TODO �����

        }
}
