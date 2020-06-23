
package nc.vo.adprepare.custregister;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.adprepare.custregister.CustregisterHVO;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.custregister.CustregisterHVO")
public class AggCustregisterHVO extends AbstractBill {

	@Override
	public IBillMeta getMetaData() {
		IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(AggCustregisterHVOMeta.class);
		return billMeta;
	}

	@Override
	public CustregisterHVO getParentVO() {
		return (CustregisterHVO) this.getParent();
	}

	@Override
	public String getPrimaryKey() {
		return super.getPrimaryKey();
	}
}