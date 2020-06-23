package nc.vo.adprepare.custrevisitreg;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.custrevisitreg.CustrevisitregHVO")

public class AggCustrevisitregHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggCustrevisitregHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public CustrevisitregHVO getParentVO(){
	  	return (CustrevisitregHVO)this.getParent();
	  }
	  
}