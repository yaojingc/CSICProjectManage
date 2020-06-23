
package nc.bs.adprepare.promanage.aggbusi.ace.bp;


import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TendaysprojplanHVOPluginPoint;
import nc.vo.adprepare.tendaysprojectplan.AggTendaysprojplanHVO;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AceTendaysprojplanHVODeleteBP {

        public void delete(AggTendaysprojplanHVO[] bills) {

                DeleteBPTemplate<AggTendaysprojplanHVO> bp = new DeleteBPTemplate<AggTendaysprojplanHVO>(
TendaysprojplanHVOPluginPoint.DELETE);
                // ����ִ��ǰ����
                this.addBeforeRule(bp.getAroundProcesser());
                // ����ִ�к�ҵ�����
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggTendaysprojplanHVO> processer) {
                // TODO ǰ����
//              IRule<AggTendaysprojplanHVO> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * ɾ����ҵ�����
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggTendaysprojplanHVO> processer) {
                // TODO �����

        }
}
