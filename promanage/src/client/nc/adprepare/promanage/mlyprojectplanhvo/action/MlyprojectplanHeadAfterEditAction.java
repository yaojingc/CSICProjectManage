package nc.adprepare.promanage.mlyprojectplanhvo.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.adprepare.promanage.mlyprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.bean.PageQueryVO;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.util.CommonUtil;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanBVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanHVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pubapp.pattern.pub.Constructor;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.model.PageInfo;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.framework.web.ui.pattern.extbillcard.ExtBillCard;
import nccloud.framework.web.ui.pattern.extbillcard.ExtBillCardOperator;
import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nccloud.web.pmpub.action.PMNCCAction;

/**
 * 项目管理新月度计划节点,卡片编辑态,表头编辑后事件 获取表头的年月 以及项目 信息 带出表体
 * 
 * @author ycw
 *
 */
public class MlyprojectplanHeadAfterEditAction extends PMNCCAction {

	public <T> Object execute(IRequest request, T para) throws Exception {
		BillCardOperator billCardOperator = new BillCardOperator();// 91H10599_CARD
		// 1、获取AGGVO （request转换主子VO）
		AggMlyprojectplanHVO aggVO = billCardOperator.toBill(request);
		// 得到表头VO
		MlyprojectplanHVO hvo = aggVO.getParentVO();
		// 获取表头项目
		String pk_project = hvo.getPk_project();
		String pk_time_plan = hvo.getPk_time_plan();
		// 获取表头的 枚举值
		String def5 = hvo.getDef5();
		// 获取表头旬(这里没用枚举) 0:上旬 1:中旬 2:下旬

		Collection<AggMlyprojectplanHVO> bills = this.queryBills(pk_project);
		List<MlyprojectplanBVO> childrens = new ArrayList<>();
		List<AggMlyprojectplanHVO> billsList = new ArrayList<>(bills);
		// 将所有chidren的值放入childrens中
		for (AggMlyprojectplanHVO aggMlyprojectplanHVO : billsList) {
			MlyprojectplanBVO[] childrenVO = (MlyprojectplanBVO[]) aggMlyprojectplanHVO.getChildrenVO();
			for (int i = 0; i < childrenVO.length; i++) {
				childrens.add(childrenVO[i]);
			}
		}
		MlyprojectplanBVO[] array = childrens.toArray(new MlyprojectplanBVO[childrens.size()]);
		aggVO.setChildrenVO(array);
		BillCard card = billCardOperator.toCard(aggVO);
		return card;
	}

	/**
	 * 查询业务数据
	 *
	 * @param queryParamx`
	 * @return
	 * @throws MetaDataException
	 * 
	 * def5:
	 * 		0 未完成
	 * 		1已完成
	 * 		2暂停
	 * 		3顺延
	 * 		4终止
	 */
	private Collection<AggMlyprojectplanHVO> queryBills(String pk_project) throws MetaDataException {
		IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
		// 注意：业务提供查询方法（元数据查询默认查询到dr=1的数据了）
		String wheresql = "pk_project" + "='" + pk_project + "'";
//		String wheresql = "pk_project" + "='" + pk_project + "' and def5 not in (1,2)";
		Collection<AggMlyprojectplanHVO> bills = service.queryBillOfVOByCond(AggMlyprojectplanHVO.class, wheresql, true,
				false);
//		service.queryBillOfVOByCond(AggMlyprojectplanBVO.class, wheresql, true,false)
//		if (!billsList.isEmpty()) {
//			for (AggMlyprojectplanHVO vo : billsList) {
//				vo.setChildrenVO(null);
//			}
//		}

		return bills;
	}

	@Override
	protected Class getParaClass() {
		return null;
	}

}
