
package nc.bs.adprepare.promanage.aggbusi.ace.bp;


import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.MlyprojectplanHVOPluginPoint;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceMlyprojectplanHVODeleteBP {

        public void delete(AggMlyprojectplanHVO[] bills) {

                DeleteBPTemplate<AggMlyprojectplanHVO> bp = new DeleteBPTemplate<AggMlyprojectplanHVO>(
MlyprojectplanHVOPluginPoint.DELETE);
                // 增加执行前规则
                this.addBeforeRule(bp.getAroundProcesser());
                // 增加执行后业务规则
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggMlyprojectplanHVO> processer) {
                // TODO 前规则
//              IRule<AggMlyprojectplanHVO> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * 删除后业务规则
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggMlyprojectplanHVO> processer) {
                // TODO 后规则

        }
}
