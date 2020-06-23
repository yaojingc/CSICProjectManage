
package nc.vo.adprepare.xunprojectplan;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.adprepare.xunprojectplan.XunprojectplanHVO;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.xunprojectplan.XunprojectplanHVO")
public class AggXunprojectplanHVO extends AbstractBill {

        @Override
        public IBillMeta getMetaData() {
                IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(
                                AggXunprojectplanHVOMeta.class);
                return billMeta;
        }

        @Override
        public XunprojectplanHVO getParentVO() {
                return (XunprojectplanHVO) this.getParent();
        }

        @Override
        public String getPrimaryKey() {
                return super.getPrimaryKey();
        }
}