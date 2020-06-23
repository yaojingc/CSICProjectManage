
package nc.vo.adprepare.marketproject;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggMarketprojectHVOMeta extends AbstractBillMeta{
        
        public AggMarketprojectHVOMeta(){
                this.init();
        }
        
        private void init() {
                this.setParent(nc.vo.adprepare.marketproject.MarketprojectHVO.class);
                this.addChildren(nc.vo.adprepare.marketproject.MarketprojectBVO.class);
        }
}