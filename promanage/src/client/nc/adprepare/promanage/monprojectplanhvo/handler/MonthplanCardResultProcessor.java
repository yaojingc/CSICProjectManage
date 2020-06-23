package nc.adprepare.promanage.monprojectplanhvo.handler;

import java.util.HashMap;
import java.util.Map;

import nc.vo.pmsch.plan.TimePlanItemVO;
import nccloud.framework.web.ui.model.row.Cell;
import nccloud.framework.web.ui.model.row.Row;
import nccloud.framework.web.ui.pattern.billcard.BillCard;

public class MonthplanCardResultProcessor {
	public void process(BillCard resultCard, BillCard origCard) {
		if (resultCard.getBody() == null
				|| resultCard.getBody().getModel() == null
				|| resultCard.getBody().getModel().getRows() == null) {
			return;
		}
		// 处理前置计划显示值不对的问题
		Row[] resultRows = resultCard.getBody().getModel().getRows();
		Map<String, String> idNameMap = new HashMap<>();
		for (Row row : resultRows) {
			Cell cell = row.getCell(TimePlanItemVO.PK_TIME_PLAN_ITEM);
			if (cell == null) {
				continue;
			}
			Cell seqCell = row.getCell(TimePlanItemVO.FULL_SEQ);
			idNameMap.put((String) cell.getValue(), (String) seqCell.getValue());
		}
		for (Row row : resultRows) {
			Cell cell = row.getCell(TimePlanItemVO.PK_FRONT_PLAN);
			if (cell == null || cell.getValue() == null) {
				continue;
			}
			cell.setDisplay(idNameMap.get(cell.getValue()));
		}
	}
}
