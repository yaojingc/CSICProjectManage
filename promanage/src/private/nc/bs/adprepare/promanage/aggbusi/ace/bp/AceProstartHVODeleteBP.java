
package nc.bs.adprepare.promanage.aggbusi.ace.bp;


import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.ProstartHVOPluginPoint;
import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AceProstartHVODeleteBP {

        public void delete(AggProstartHVO[] bills) {

                DeleteBPTemplate<AggProstartHVO> bp = new DeleteBPTemplate<AggProstartHVO>(
ProstartHVOPluginPoint.DELETE);
                // ����ִ��ǰ����
                this.addBeforeRule(bp.getAroundProcesser());
                // ����ִ�к�ҵ�����
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggProstartHVO> processer) {
                // TODO ǰ����
//              IRule<AggProstartHVO> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * ɾ����ҵ�����
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggProstartHVO> processer) {
                // TODO �����

        }
}
