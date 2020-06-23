package nc.vo.adprepare.custrevisitreg;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggCustrevisitregHVOMeta extends AbstractBillMeta{
	
	public AggCustrevisitregHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.adprepare.custrevisitreg.CustrevisitregHVO.class);
		this.addChildren(nc.vo.adprepare.custrevisitreg.CustvisitregBVO.class);
	}
}