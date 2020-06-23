
package nc.vo.adprepare.marketproject;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.adprepare.marketproject.MarketprojectHVO;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.marketproject.MarketprojectHVO")
public class AggMarketprojectHVO extends AbstractBill {

        @Override
        public IBillMeta getMetaData() {
                IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(
                                AggMarketprojectHVOMeta.class);
                return billMeta;
        }

        @Override
        public MarketprojectHVO getParentVO() {
                return (MarketprojectHVO) this.getParent();
        }

        @Override
        public String getPrimaryKey() {
                return super.getPrimaryKey();
        }
}