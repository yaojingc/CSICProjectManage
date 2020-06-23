package nc.impl.pmsch.plan;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import nc.bs.framework.common.InvocationInfoProxy;
import nc.impl.pubapp.pattern.data.vo.VOQuery;
import nc.itf.pm.pvt.IPMQueryService;
import nc.itf.pmsch.plan.ITimePlanItemQuery;
import nc.itf.pmsch.plan.progress.ITimePlanProgressQuery;
import nc.pubitf.rbac.IUserPubService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pm.proxy.PMProxy;
import nc.vo.pmsch.plan.TimePlanItemExVO;
import nc.vo.pmsch.plan.TimePlanItemVO;
import nc.vo.pmsch.plan.TimePlanStatusConst;
import nc.vo.pmsch.plan.progress.TimeProgressItemVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class TimePlanItemQueryImpl implements ITimePlanItemQuery {
	private final static UFDouble HUNDRED = new UFDouble(100);

	@Override
	public String[] queryItemPKByQuerySchemeOfUser(IQueryScheme queryScheme, int[] status) throws BusinessException {
		return PMProxy.lookup(IPMQueryService.class).queryPksByQS(queryScheme,
				getPlanStatusQueryCondition(status).toString());
	}

	@Override
	public TimePlanItemExVO[] queryExVOByQuerySchemeOfUser(IQueryScheme queryScheme, int[] status)
			throws BusinessException {
		String[] pks = queryItemPKByQuerySchemeOfUser(queryScheme, status);
		return (TimePlanItemExVO[]) fillPlanItemExecMark(queryExVOByPKs(pks));
	}

	@Override
	public TimePlanItemExVO[] queryExVOByPKs(String[] pks) throws BusinessException {
		VOQuery<TimePlanItemExVO> query = new VOQuery<>(TimePlanItemExVO.class);
		TimePlanItemExVO[] result = query.query(pks);
		return (TimePlanItemExVO[]) fillPlanItemExecMark(result);
	}

	@Override
	public TimePlanItemVO[] queryByQuerySchemeOfUser(IQueryScheme queryScheme, int[] status) throws BusinessException {
		String[] pks = queryItemPKByQuerySchemeOfUser(queryScheme, status);
		return fillPlanItemExecMark(queryByPKs(pks));
	}

	@Override
	public TimePlanItemVO[] queryByPKs(String[] pks) throws BusinessException {
		VOQuery<TimePlanItemVO> query = new VOQuery<>(TimePlanItemVO.class);
		TimePlanItemVO[] result = query.query(pks);
		return fillPlanItemExecMark(result);
	}

	private StringBuilder getPlanStatusQueryCondition(int[] itemStatus) throws BusinessException {
		StringBuilder sql = new StringBuilder();
		// 查询人员
		String psn = PMProxy.lookup(IUserPubService.class)
				.queryPsndocByUserid(InvocationInfoProxy.getInstance().getUserId());
		sql.append(" and ").append(TimePlanItemVO.PK_DUTIER).append("='").append(psn).append("'");
		sql.append(" and ").append(TimePlanItemVO.VERSION).append("=").append(0);
		sql.append(" and ").append(TimePlanItemVO.LEAF).append("='").append(UFBoolean.TRUE).append("'");
		//add by libing start 过滤暂停状态的计划编制-def5<>2 
		sql.append(" and ").append(TimePlanItemVO.DEF5).append("<>").append("'2'");
		//end
		// 查询状态
		if (itemStatus != null) {
			sql.append("and ").append(TimePlanItemVO.PK_TIME_PLAN_ITEM).append(" in (").append("select ")
					.append(TimeProgressItemVO.PK_PLAN_ITEM).append(" from pmsch_time_progress_item where ")
					.append(TimeProgressItemVO.BILL_STATUS).append(" in (");
			for (int state : itemStatus) {
				sql.append(state);
				sql.append(',');
			}
			sql.deleteCharAt(sql.length() - 1);
			sql.append(')').append(')');

		}
		return sql;
	}

	@Override
	public TimePlanItemVO[] fillPlanItemExecMark(TimePlanItemVO[] vos) throws BusinessException {
		List<String> pks = Stream.of(vos).map(TimePlanItemVO::getPk_time_plan_item).collect(Collectors.toList());
		TimeProgressItemVO[] progress = PMProxy.lookup(ITimePlanProgressQuery.class)
				.queryProgressItemByPlan(pks.toArray(new String[0]));
		Map<String, TimeProgressItemVO> itemProgress = Stream.of(progress)
				.collect(Collectors.toMap(TimeProgressItemVO::getPk_plan_item, Function.identity()));
		UFDate now = new UFDate();
		Stream.of(vos).forEach((vo) -> {
			TimeProgressItemVO item = itemProgress.get(vo.getPk_time_plan_item());
			if (item.getPercentage() == null
					|| HUNDRED.compareTo(item.getPercentage()) > 0 && now.afterDate(vo.getPlan_end_date())) {
				item.setExec_mark(TimePlanStatusConst.EXEC_MARK_EXCEED);
			} else {
				item.setExec_mark(TimePlanStatusConst.EXEC_MARK_OK);
			}
		});
		return vos;
	}

	@Override
	public int queryItemNumByQuerySchemeOfUser(IQueryScheme queryScheme, int[] status) throws BusinessException {
		String[] pks = queryItemPKByQuerySchemeOfUser(queryScheme, status);
		if (pks == null) {
			return 0;
		}
		return pks.length;
	}
}
