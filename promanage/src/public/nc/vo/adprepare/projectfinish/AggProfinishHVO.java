
package nc.vo.adprepare.projectfinish;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.adprepare.projectfinish.ProfinishHVO;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.projectfinish.ProfinishHVO")
public class AggProfinishHVO extends AbstractBill {

        @Override
        public IBillMeta getMetaData() {
                IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(
                                AggProfinishHVOMeta.class);
                return billMeta;
        }

        @Override
        public ProfinishHVO getParentVO() {
                return (ProfinishHVO) this.getParent();
        }

        @Override
        public String getPrimaryKey() {
                return super.getPrimaryKey();
        }
}