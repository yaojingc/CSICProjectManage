
package nc.vo.adprepare.custregister;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggCustregisterHVOMeta extends AbstractBillMeta{
        
        public AggCustregisterHVOMeta(){
                this.init();
        }
        
        private void init() {
                this.setParent(nc.vo.adprepare.custregister.CustregisterHVO.class);
                this.addChildren(nc.vo.adprepare.custregister.CustregisterBVO.class);
        }
}