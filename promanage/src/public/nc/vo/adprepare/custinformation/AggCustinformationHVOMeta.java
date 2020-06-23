package nc.vo.adprepare.custinformation;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggCustinformationHVOMeta extends AbstractBillMeta{
	
	public AggCustinformationHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.adprepare.custinformation.CustinformationHVO.class);
		this.addChildren(nc.vo.adprepare.custinformation.CustinformationCVO.class);
		this.addChildren(nc.vo.adprepare.custinformation.CustinformationBVO.class);
	}
}