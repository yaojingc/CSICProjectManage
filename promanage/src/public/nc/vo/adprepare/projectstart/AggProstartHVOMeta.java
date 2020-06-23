
package nc.vo.adprepare.projectstart;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggProstartHVOMeta extends AbstractBillMeta{
        
        public AggProstartHVOMeta(){
                this.init();
        }
        
        private void init() {
                this.setParent(nc.vo.adprepare.projectstart.ProstartHVO.class);
                this.addChildren(nc.vo.adprepare.projectstart.ProstartBVO.class);
        }
}