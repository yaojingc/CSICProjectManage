package nc.vo.adprepare.tendayprojectplan;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO")

public class AggTenprojectplanHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggTenprojectplanHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public TenprojectplanHVO getParentVO(){
	  	return (TenprojectplanHVO)this.getParent();
	  }
	  
}