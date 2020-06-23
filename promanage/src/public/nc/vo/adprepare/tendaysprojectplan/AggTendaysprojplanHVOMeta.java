package nc.vo.adprepare.tendaysprojectplan;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggTendaysprojplanHVOMeta extends AbstractBillMeta{
	
	public AggTendaysprojplanHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.adprepare.tendaysprojectplan.TendaysprojplanHVO.class);
		this.addChildren(nc.vo.adprepare.tendaysprojectplan.TendaysprojplanBVO.class);
	}
}