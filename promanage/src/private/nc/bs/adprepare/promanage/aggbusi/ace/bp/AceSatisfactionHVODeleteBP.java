
package nc.bs.adprepare.promanage.aggbusi.ace.bp;


import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SatisfactionHVOPluginPoint;
import nc.vo.adprepare.satisfaction.AggSatisfactionHVO;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AceSatisfactionHVODeleteBP {

        public void delete(AggSatisfactionHVO[] bills) {

                DeleteBPTemplate<AggSatisfactionHVO> bp = new DeleteBPTemplate<AggSatisfactionHVO>(
SatisfactionHVOPluginPoint.DELETE);
                // ����ִ��ǰ����
                this.addBeforeRule(bp.getAroundProcesser());
                // ����ִ�к�ҵ�����
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggSatisfactionHVO> processer) {
                // TODO ǰ����
//              IRule<AggSatisfactionHVO> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * ɾ����ҵ�����
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggSatisfactionHVO> processer) {
                // TODO �����

        }
}
