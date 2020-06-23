package nc.vo.adprepare.monthprojectplan;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggMonprojectplanHVOMeta extends AbstractBillMeta{
	
	public AggMonprojectplanHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.adprepare.monthprojectplan.MonprojectplanHVO.class);
		this.addChildren(nc.vo.adprepare.monthprojectplan.MonprojectplanBVO.class);
	}
}