
package nc.vo.adprepare.projectstart;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.adprepare.projectstart.ProstartHVO;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.projectstart.ProstartHVO")
public class AggProstartHVO extends AbstractBill {

        @Override
        public IBillMeta getMetaData() {
                IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(
                                AggProstartHVOMeta.class);
                return billMeta;
        }

        @Override
        public ProstartHVO getParentVO() {
                return (ProstartHVO) this.getParent();
        }

        @Override
        public String getPrimaryKey() {
                return super.getPrimaryKey();
        }
}