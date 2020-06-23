
package nc.vo.adprepare.satisfaction;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggSatisfactionHVOMeta extends AbstractBillMeta{
        
        public AggSatisfactionHVOMeta(){
                this.init();
        }
        
        private void init() {
                this.setParent(nc.vo.adprepare.satisfaction.SatisfactionHVO.class);
                this.addChildren(nc.vo.adprepare.satisfaction.SatisfactionBVO.class);
        }
}