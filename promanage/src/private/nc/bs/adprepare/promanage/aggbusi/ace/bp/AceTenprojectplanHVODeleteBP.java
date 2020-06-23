
package nc.bs.adprepare.promanage.aggbusi.ace.bp;


import nc.bs.adprepare.promanage.aggbusi.plugin.bpplugin.TenprojectplanHVOPluginPoint;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceTenprojectplanHVODeleteBP {

        public void delete(AggTenprojectplanHVO[] bills) {

                DeleteBPTemplate<AggTenprojectplanHVO> bp = new DeleteBPTemplate<AggTenprojectplanHVO>(
TenprojectplanHVOPluginPoint.DELETE);
                // 增加执行前规则
                this.addBeforeRule(bp.getAroundProcesser());
                // 增加执行后业务规则
                this.addAfterRule(bp.getAroundProcesser());
                bp.delete(bills);
        }

        private void addBeforeRule(AroundProcesser<AggTenprojectplanHVO> processer) {
                // TODO 前规则
//              IRule<AggTenprojectplanHVO> rule = null;
//              rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
//              processer.addBeforeRule(rule);
        }

        /**
         * 删除后业务规则
         *
         * @param processer
         */
        private void addAfterRule(AroundProcesser<AggTenprojectplanHVO> processer) {
                // TODO 后规则

        }
}
