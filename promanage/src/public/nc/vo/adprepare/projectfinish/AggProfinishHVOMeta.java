
package nc.vo.adprepare.projectfinish;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggProfinishHVOMeta extends AbstractBillMeta{
        
        public AggProfinishHVOMeta(){
                this.init();
        }
        
        private void init() {
                this.setParent(nc.vo.adprepare.projectfinish.ProfinishHVO.class);
                this.addChildren(nc.vo.adprepare.projectfinish.ProfinishBVO.class);
        }
}