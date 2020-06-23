package nc.adprepare.promanage.mlyprojectplanhvo.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.adprepare.promanage.mlyprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.util.CommonUtil;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.util.mmf.framework.base.MMValueCheck;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanBVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;

public class MlyprojectplanBVOdurationAction implements ICommonAction {

	@Override
	public Object doAction(IRequest paramIRequest) {
		BillCardOperator billCardOperator = new BillCardOperator();// 91H10599_CARD
		// 1、获取AGGVO （request转换主子VO）
		AggMlyprojectplanHVO vo = billCardOperator.toBill(paramIRequest);
		// 得到表头VO
		CircularlyAccessibleValueObject[] allChildrenVO = vo.getAllChildrenVO();
		for (int i = 0; i < allChildrenVO.length; i++) {
			MlyprojectplanBVO monprojectplanbvo = (MlyprojectplanBVO) allChildrenVO[i];
			// 计划开始日期
			UFDate start = monprojectplanbvo.getPlan_start_date();
			// 计划结束日期
			UFDate end = monprojectplanbvo.getPlan_end_date();

			if (MMValueCheck.isNotEmpty(start) && MMValueCheck.isNotEmpty(end)) {
				// 计算出计划工期
				int duration = UFDate.getDaysBetween(start, end);
				if (duration > 0) {
					monprojectplanbvo.setDuration(duration);
				}
			}
		}
		BillCard card = billCardOperator.toCard(vo);
		return card;
	}

}
