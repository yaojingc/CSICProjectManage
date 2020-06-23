package nc.vo.adprepare.tendayprojectplan;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggTenprojectplanHVOMeta extends AbstractBillMeta{
	
	public AggTenprojectplanHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO.class);
		this.addChildren(nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO.class);
	}
}