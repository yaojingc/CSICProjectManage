package nccloud.impl.pmsch.plan;

import java.util.List;
import java.util.Map;

import nc.bs.pmsch.plan.PlanDependencyChecker;
import nc.bs.pmsch.plan.TimePlanDateSummarizer;
import nc.itf.pmbd.pub.IProjectQueryService;
import nc.vo.bd.material.MaterialVO;
import nc.vo.pim.project.ProjectHeadVO;
import nc.vo.pm.proxy.PMProxy;
import nc.vo.pm.util.ArrayUtil;
import nc.vo.pm.util.StringUtil;
import nc.vo.pmsch.plan.TimePlanBillVO;
import nc.vo.pmsch.plan.TimePlanItemVO;
import nc.vo.pmsch.plan.dependency.TimePlanDependencyResolver;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.itf.pmpub.pub.PMAbstractBodyAfterHandler;
import nccloud.pub.pmpub.util.DurationUtil;
import nccloud.pub.pmpub.vo.BillCardBodyEditEvent;
import util.CSICCommonUtils;


/**
 * 新增表体物料信息,选择物料时自动带出规格,型号,计量单位
 * 
 * 
 * Edit By yaojing 
 */
public class TimePlanBodyAfterEditHandler extends PMAbstractBodyAfterHandler {

	@Override
	protected AggregatedValueObject doAfterEdit(AggregatedValueObject billvo,
			BillCardBodyEditEvent event, Map userobject)
			throws BusinessException {
		TimePlanBillVO vo = (TimePlanBillVO) billvo;
		String key = event.getChangeKey();
		switch (key) {
		// 前置计划
		case TimePlanItemVO.PK_FRONT_PLAN:
			TimePlanDependencyResolver resolver = new TimePlanDependencyResolver(vo);
			// 环路检测
			PlanDependencyChecker checker = new PlanDependencyChecker(resolver);
			checker.init();
			if (!ArrayUtil.isEmpty(checker.checkCycle())) {
				ExceptionUtils.wrappBusinessException("选择当前计划作为前期计划将会出现环路！");
			}
			break;
		case TimePlanItemVO.PLAN_START_DATE:
		case TimePlanItemVO.PLAN_END_DATE:
		case TimePlanItemVO.DURATION:
			// 获取项目日历
			String pkProject = vo.getParentVO().getPk_project();
			if (StringUtil.isEmpty(pkProject)) {
				ExceptionUtils.wrappBusinessException("请选择项目！");
			}
			SuperVO project = PMProxy.lookup(IProjectQueryService.class)
					.queryProjectHeadVOsByPK(new String[] { pkProject })[0];
			if (project == null
					|| ((ProjectHeadVO) project).getPk_workcalendar() == null) {
				ExceptionUtils.wrappBusinessException("请维护对应项目上的工作日历！");
			}
			DurationUtil.resetDuration((TimePlanItemVO) vo
					.getChildren(TimePlanItemVO.class)[event.getRow()],
					TimePlanItemVO.PLAN_START_DATE,
					TimePlanItemVO.PLAN_END_DATE, TimePlanItemVO.DURATION,
					((ProjectHeadVO) project).getPk_workcalendar(), key, event
							.getChangrows()[0].getOldvalue(), event
							.getChangrows()[0].getNewvalue());
			// 更新父级的时间
			new TimePlanDateSummarizer(pkProject).summarizeByOneRow(
					(TimePlanBillVO) billvo, event.getRow());
			// 更新表头时间
			updateHeadDate(vo);
			break;
			
			
		case TimePlanItemVO.DEF17:	 //  物料参照用的表体 def17字段
			// 获取用户编辑的行
			TimePlanItemVO timePlanItemVO = (TimePlanItemVO) vo.getChildren(TimePlanItemVO.class)[event.getRow()];			
			// 得到修改的字段的最新值
			Object pk_material = event.getChangrows()[0].getNewvalue();
			if(CSICCommonUtils.isNotEmpty(pk_material)) {
				String pk_material_new = (String) pk_material;
				List<MaterialVO> materialList = CSICCommonUtils.isContainMaterial(new String[] {pk_material_new});
				if(CSICCommonUtils.isNotEmpty(materialList)) {
					MaterialVO materialVO = materialList.get(0);
					// 规格
					String materialspec = materialVO.getMaterialspec();
					// 型号
					String materialtype = materialVO.getMaterialtype();
					// 计量单位主键(需要做转换)
					String pk_measdoc = materialVO.getPk_measdoc();
					String measdoc_name = CSICCommonUtils.queryMeasdocBypk(pk_measdoc);
					timePlanItemVO.setDef18(materialspec);
					timePlanItemVO.setDef19(materialtype);
					timePlanItemVO.setDef20(measdoc_name);
				}
			}
			break;
		default:
			break;
		}
		return vo;
	}

	private void updateHeadDate(TimePlanBillVO vo) {
		TimePlanItemVO[] items = (TimePlanItemVO[]) vo
				.getChildren(TimePlanItemVO.class);
		UFDate start = null, end = null;
		for (TimePlanItemVO item : items) {
			UFDate itemStart = item.getPlan_start_date();
			UFDate itemEnd = item.getPlan_end_date();
			if (start == null || itemStart != null
					&& itemStart.beforeDate(start)) {
				start = itemStart;
			}
			if (end == null || itemEnd != null && itemEnd.afterDate(end)) {
				end = itemStart;
			}
		}
		vo.getParentVO().setPlan_start_date(start);
		vo.getParentVO().setPlan_end_date(end);
	}
}
