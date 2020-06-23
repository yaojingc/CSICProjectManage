
package nc.vo.adprepare.satisfaction;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.adprepare.satisfaction.SatisfactionHVO;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.satisfaction.SatisfactionHVO")
public class AggSatisfactionHVO extends AbstractBill {

        @Override
        public IBillMeta getMetaData() {
                IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(
                                AggSatisfactionHVOMeta.class);
                return billMeta;
        }

        @Override
        public SatisfactionHVO getParentVO() {
                return (SatisfactionHVO) this.getParent();
        }

        @Override
        public String getPrimaryKey() {
                return super.getPrimaryKey();
        }
}