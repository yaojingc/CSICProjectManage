
package nc.vo.adprepare.satisfactionsurvey;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.adprepare.satisfactionsurvey.SsfactionHVO;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.satisfactionsurvey.SsfactionHVO")
public class AggSsfactionHVO extends AbstractBill {

        @Override
        public IBillMeta getMetaData() {
                IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(
                                AggSsfactionHVOMeta.class);
                return billMeta;
        }

        @Override
        public SsfactionHVO getParentVO() {
                return (SsfactionHVO) this.getParent();
        }

        @Override
        public String getPrimaryKey() {
                return super.getPrimaryKey();
        }
}