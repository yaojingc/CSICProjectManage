
package nc.bs.adprepare.promanage.aggbusi.ace.bp;


import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.SsfactionHVOPluginPoint;
import nc.vo.adprepare.satisfactionsurvey.AggSsfactionHVO;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceSsfactionHVODeleteBP {

        public void delete(AggSsfactionHVO[] bills) {

                DeleteBPTemplate<AggSsfactionHVO> bp = new DeleteBPTemplate<AggSsfactionHVO>(
SsfactionHVOPluginPoint.DELETE);
                // 增加执行前规则
                this.addBeforeRule(bp.getAroundProcesser());
                // 增加执行后业务规则
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggSsfactionHVO> processer) {
                // TODO 前规则
//              IRule<AggSsfactionHVO> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * 删除后业务规则
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggSsfactionHVO> processer) {
                // TODO 后规则

        }
}
