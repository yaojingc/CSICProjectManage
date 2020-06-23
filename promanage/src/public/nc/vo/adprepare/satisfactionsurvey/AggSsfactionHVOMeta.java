
package nc.vo.adprepare.satisfactionsurvey;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggSsfactionHVOMeta extends AbstractBillMeta{
        
        public AggSsfactionHVOMeta(){
                this.init();
        }
        
        private void init() {
                this.setParent(nc.vo.adprepare.satisfactionsurvey.SsfactionHVO.class);
                this.addChildren(nc.vo.adprepare.satisfactionsurvey.SsfactionBVO.class);
        }
}