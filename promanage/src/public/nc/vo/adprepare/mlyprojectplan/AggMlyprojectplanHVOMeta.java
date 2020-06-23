package nc.vo.adprepare.mlyprojectplan;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggMlyprojectplanHVOMeta extends AbstractBillMeta{
	
	public AggMlyprojectplanHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.adprepare.mlyprojectplan.MlyprojectplanHVO.class);
		this.addChildren(nc.vo.adprepare.mlyprojectplan.MlyprojectplanBVO.class);
	}
}