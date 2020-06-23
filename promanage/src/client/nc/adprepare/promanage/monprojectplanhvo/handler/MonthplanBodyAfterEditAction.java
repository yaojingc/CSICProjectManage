package nc.adprepare.promanage.monprojectplanhvo.handler;

import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.web.pmbd.event.CardEvent;
import nccloud.web.pmbd.event.PMBaseEditEvent4Cloud;
import nccloud.web.pmpub.action.handler.PMCardBodyAfterEditAction;

public class MonthplanBodyAfterEditAction extends PMCardBodyAfterEditAction{

	@Override
	protected void processResult(Object result, PMBaseEditEvent4Cloud e) {
		//  根据rowid，合并后台不更新的字段
		CardEvent event = (CardEvent) e;
		BillCard origCard = event.getCard();
		BillCard resultCard = (BillCard) result;
		new MonthplanCardResultProcessor().process(resultCard, origCard);
		
	}

	@Override
	protected String getEditClass() {
		return "nccloud.impl.pmsch.plan.TimePlanBodyAfterEditHandler";
	}

}
