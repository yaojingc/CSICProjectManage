package nc.bs.pmsch.plan;

import java.util.List;

import nc.vo.pmsch.plan.TimePlanBillVO;
import nc.vo.pmsch.plan.TimePlanItemVO;
import nc.vo.pmsch.plan.dependency.TimePlanTreeResovler;
import nc.vo.ppm.wbs.workingCalendar.WorkCalendarByProject;
import nc.vo.pub.VOStatus;
import nc.vo.pub.lang.UFDate;

public class TimePlanDateSummarizer {
	private String pkProject;
	private WorkCalendarByProject calendar;

	public TimePlanDateSummarizer(String pkProject) {
		this.pkProject = pkProject;
		calendar = new WorkCalendarByProject(this.pkProject);
	}

	public void summarizeAll(TimePlanBillVO vo) {
		TimePlanTreeResovler resolver = new TimePlanTreeResovler(vo);
		// 用深度优先遍历，只选择根节点
		for (int i = 0; i < resolver.getPlanIndexCount(); i++) {
			if (resolver.getParentIndex(i) >= 0 && resolver.getChildrenByIndex(i) == null) {
				continue;
			}
			updateRecursive(i, resolver);
		}
	}

	private void updateRecursive(int parentIndex, TimePlanTreeResovler resolver) {
		// 获取子节点
		List<Integer> children = resolver.getChildrenByIndex(parentIndex);
		if (children == null) {
			return;
		}
		for (Integer child : children) {
			if (resolver.getChildrenByIndex(child) != null) {
				updateRecursive(child, resolver);
			}
		}
		updateByChild(resolver, parentIndex, children);
	}

	public void summarizeByOneRow(TimePlanBillVO vo, int row) {
		recomputeDurationOfRowOnly((TimePlanItemVO) vo.getChildren(TimePlanItemVO.class)[row]);
		TimePlanTreeResovler resolver = new TimePlanTreeResovler(vo);
		int parentIndex, cur = row;
		while ((parentIndex = resolver.getParentIndex(cur)) >= 0) {
			// 获取子节点
			List<Integer> children = resolver.getChildrenByIndex(parentIndex);
			updateByChild(resolver, parentIndex, children);
			cur = parentIndex;
		}
	}

	private void updateByChild(TimePlanTreeResovler resolver, int parentIndex, List<Integer> children) {
		// 获取最早开始与最晚结束
		UFDate start = null, end = null;
		for (Integer child : children) {
			TimePlanItemVO childPlan = (TimePlanItemVO) resolver.getPlanByIndex(child);
			UFDate childStart = childPlan.getPlan_start_date();
			if (start == null || childStart != null && start.afterDate(childStart)) {
				start = childStart;
			}
			UFDate childEnd = childPlan.getPlan_end_date();
			if (end == null || childEnd != null && end.beforeDate(childEnd)) {
				end = childEnd;
			}
		}
		boolean changed = false;
		TimePlanItemVO parentPlan = (TimePlanItemVO) resolver.getPlanByIndex(parentIndex);
		if (parentPlan.getPlan_start_date() == null && start != null
				|| start != null && !start.asBegin().equals(parentPlan.getPlan_start_date().asBegin())) {
			parentPlan.setPlan_start_date(start.asBegin());
			changed = true;
		}
		if (parentPlan.getPlan_end_date() == null && end != null
				|| end != null && !end.asEnd().equals(parentPlan.getPlan_end_date().asEnd())) {
			parentPlan.setPlan_end_date(end.asEnd());
			changed = true;
		}
		recomputeDurationOfRowOnly(parentPlan);
		if (changed && parentPlan.getStatus() == VOStatus.UNCHANGED) {
			parentPlan.setStatus(VOStatus.UPDATED);
		}
	}

	public void recomputeDurationOnly(TimePlanBillVO vo) {
		TimePlanItemVO[] vos = (TimePlanItemVO[]) vo.getChildren(TimePlanItemVO.class);
		for (TimePlanItemVO item : vos) {
			if (item.getStatus() == VOStatus.DELETED) {
				continue;
			}
			recomputeDurationOfRowOnly(item);

		}
	}

	protected void recomputeDurationOfRowOnly(TimePlanItemVO vo) {
		int newDuration = calendar.getDaysBetween(vo.getPlan_start_date(), vo.getPlan_end_date());
		Integer oldDuration = vo.getDuration();
		if (oldDuration == null) {
			oldDuration = Integer.valueOf(0);
		}
		if (oldDuration != newDuration) {
			vo.setDuration(newDuration);
			if (vo.getStatus() == VOStatus.UNCHANGED) {
				vo.setStatus(VOStatus.UPDATED);
			}
		}
	}
}
