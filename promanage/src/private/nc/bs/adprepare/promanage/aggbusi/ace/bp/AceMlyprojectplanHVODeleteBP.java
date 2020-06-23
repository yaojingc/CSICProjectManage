
package nc.bs.adprepare.promanage.aggbusi.ace.bp;


import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MlyprojectplanHVOPluginPoint;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AceMlyprojectplanHVODeleteBP {

        public void delete(AggMlyprojectplanHVO[] bills) {

                DeleteBPTemplate<AggMlyprojectplanHVO> bp = new DeleteBPTemplate<AggMlyprojectplanHVO>(
MlyprojectplanHVOPluginPoint.DELETE);
                // ����ִ��ǰ����
                this.addBeforeRule(bp.getAroundProcesser());
                // ����ִ�к�ҵ�����
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggMlyprojectplanHVO> processer) {
                // TODO ǰ����
//              IRule<AggMlyprojectplanHVO> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * ɾ����ҵ�����
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggMlyprojectplanHVO> processer) {
                // TODO �����

        }
}
