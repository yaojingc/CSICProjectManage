package nccloud.impl.pmsch.plan.progress;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.impl.pubapp.pattern.data.bill.BillQuery;
import nc.itf.pmsch.plan.ITimePlanItemQuery;
import nc.itf.pmsch.plan.ITimePlanMaintain;
import nc.itf.pmsch.plan.progress.ITimePlanProgressQuery;
import nc.itf.uap.IUAPQueryBS;
import nc.vo.pm.constant.BillStatusConst;
import nc.vo.pm.constant.BillTypeConst;
import nc.vo.pm.constant.CommonKeyConst;
import nc.vo.pm.proxy.PMProxy;
import nc.vo.pmsch.plan.TimePlanBillVO;
import nc.vo.pmsch.plan.TimePlanItemVO;
import nc.vo.pmsch.plan.TimePlanStatusConst;
import nc.vo.pmsch.plan.progress.TimeProgressItemVO;
import nc.vo.pmsch.plan.progress.TimeProgressRecordVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nccloud.framework.service.ServiceLocator;
import nccloud.itf.pmsch.plan.progress.ITimeProgressRecordInit;
import nccloud.pub.pmpub.util.OrgChangeDefaultHandler;

public class TimeProgressRecordInitImpl implements ITimeProgressRecordInit {
	public TimeProgressRecordVO initRecord(String pkPlanItem) throws BusinessException {
		TimePlanItemVO item = PMProxy.lookup(ITimePlanItemQuery.class).queryByPKs(new String[] { pkPlanItem })[0];
		
		TimeProgressItemVO progress = PMProxy.lookup(ITimePlanProgressQuery.class).queryProgressItemByPlan(pkPlanItem);
		TimeProgressRecordVO result = new TimeProgressRecordVO();
		result.setPk_group(InvocationInfoProxy.getInstance().getGroupId());
		result.setPk_plan_item(item.getPk_time_plan_item());
		result.setPk_plan(item.getPk_time_plan());
		result.setBill_type(BillTypeConst.TIME_PLAN_RECORD);
		result.setPk_project(item.getPk_project());
		result.setBill_status(BillStatusConst.free);
		result.setReal_duration(progress.getReal_duration());
		result.setReal_start_date(progress.getReal_start_date());
		result.setReal_end_date(progress.getReal_end_date());
		result.setPercentage(progress.getPercentage());
		//start add by libing 侧边栏增加两个字段
		result.setDef1(progress.getDef1());
		result.setDef2(progress.getDef2());
		
//		BillQuery<TimePlanBillVO> query = new BillQuery<>(TimePlanBillVO.class);
//		TimePlanBillVO[] billvos = query.query(new String[]{item.getPk_time_plan()});
		String sql = "update pmsch_time_plan_item set def1 = '"+progress.getDef1()+"', def2 = '"+progress.getDef2()+"' where pk_origin_item = '"+item.getPk_time_plan_item()+"' ";
		
		new BaseDAO().executeUpdate(sql);
		
//		item.setDef1(progress.getDef1());
//		item.setDef2(progress.getDef2());
//		ServiceLocator.find(ITimePlanMaintain.class).updateTimePlan(billvos, billvos);
		//end
		UFDate now = new UFDate();
		if (now.afterDate(item.getPlan_end_date())) {
			result.setExec_mark(TimePlanStatusConst.EXEC_MARK_EXCEED);
		} else {
			result.setExec_mark(TimePlanStatusConst.EXEC_MARK_OK);
		}
		// 触发组织切换 生成单据号
		OrgChangeDefaultHandler.execute(result, CommonKeyConst.PK_ORG_V, null, item.getPk_org_v(),
				BillTypeConst.TIME_PLAN_RECORD);
		return result;
	}
}
