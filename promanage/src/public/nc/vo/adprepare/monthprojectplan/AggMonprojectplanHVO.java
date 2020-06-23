package nc.vo.adprepare.monthprojectplan;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.monthprojectplan.MonprojectplanHVO")

public class AggMonprojectplanHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggMonprojectplanHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public MonprojectplanHVO getParentVO(){
	  	return (MonprojectplanHVO)this.getParent();
	  }
	  
}