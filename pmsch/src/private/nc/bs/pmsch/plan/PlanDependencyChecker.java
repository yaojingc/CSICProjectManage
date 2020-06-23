package nc.bs.pmsch.plan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nc.vo.pmsch.plan.dependency.PlanDependencyResolver;

/**
 * 计划循环依赖检测 <br>
 * 这里使用深度优先遍历，这样可以比较方便的输出环路的路径 <br>
 * 使用拓扑排序不易分析环路的路径
 * */
public class PlanDependencyChecker {
	public static final int VISITED_IN_PATH = 1; // 当前路径中已扫描
	public static final int VISITED_NOT_IN_PATH = -1; // 其他路径中已扫描
	public static final int NOT_VISITED = 0;

	private PlanDependencyResolver resolver; // 获取节点信息及上下级信息的解析器
	private int[] visitRecord;

	public PlanDependencyChecker(PlanDependencyResolver resolver) {
		this.resolver = resolver;
	}

	public void init() {
		// 初始化遍历记录
		visitRecord = new int[resolver.getPlanIndexCount()];
		Arrays.fill(visitRecord, NOT_VISITED);
	}

	public int[] checkCycle() {
		List<Integer> path = new ArrayList<>();
		for (int i = 0; i < resolver.getPlanIndexCount(); i++) {
			if (dfsCheckCycle(i, path)) {
				break;
			}
		}
		if (path.size() == 0) {
			return null;
		}
		int[] result = new int[path.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = path.get(i);
		}
		return result;
	}

	protected boolean dfsCheckCycle(int index, List<Integer> path) {
		if (visitRecord[index] == VISITED_IN_PATH) {
			path.add(index);
			return true;
		}
		if (visitRecord[index] == VISITED_NOT_IN_PATH) {
			return false;
		}
		List<Integer> dependPlans = resolver.getDependPlansByIndex(index);
		if (dependPlans == null || dependPlans.isEmpty()) {
			visitRecord[index] = VISITED_NOT_IN_PATH;
			return false;
		}
		int deepth = path.size();
		path.add(index);
		visitRecord[index] = VISITED_IN_PATH;
		for (int plan : dependPlans) {
			if (dfsCheckCycle(plan, path)) {
				return true;
			}
		}
		visitRecord[index] = VISITED_NOT_IN_PATH;
		path.remove(deepth);
		return false;
	}

}
