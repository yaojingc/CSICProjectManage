package nc.vo.adprepare.mlyprojectplan;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.mlyprojectplan.MlyprojectplanHVO")

public class AggMlyprojectplanHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggMlyprojectplanHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public MlyprojectplanHVO getParentVO(){
	  	return (MlyprojectplanHVO)this.getParent();
	  }
	  
}