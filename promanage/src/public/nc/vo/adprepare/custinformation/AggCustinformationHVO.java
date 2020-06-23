package nc.vo.adprepare.custinformation;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.adprepare.custinformation.CustinformationHVO")

public class AggCustinformationHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggCustinformationHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public CustinformationHVO getParentVO(){
	  	return (CustinformationHVO)this.getParent();
	  }
	  
}