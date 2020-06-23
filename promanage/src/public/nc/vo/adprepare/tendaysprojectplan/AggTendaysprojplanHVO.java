package nc.vo.adprepare.tendaysprojectplan;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.tendaysprojectplan.TendaysprojplanHVO")

public class AggTendaysprojplanHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggTendaysprojplanHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public TendaysprojplanHVO getParentVO(){
	  	return (TendaysprojplanHVO)this.getParent();
	  }
	  
}