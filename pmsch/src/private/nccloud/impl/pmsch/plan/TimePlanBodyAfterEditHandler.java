package nccloud.impl.pmsch.plan;

import java.util.List;
import java.util.Map;

import nc.bs.pmsch.plan.PlanDependencyChecker;
import nc.bs.pmsch.plan.TimePlanDateSummarizer;
import nc.itf.pmbd.pub.IProjectQueryService;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanBVO;
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
		
		if(billvo instanceof TimePlanBillVO) {
			TimePlanBillVO vo = this.bodyAfterForTimePlanBillVO(billvo, event, userobject);
			return vo;
		}else if(billvo instanceof  AggMlyprojectplanHVO) {
			AggMlyprojectplanHVO vo = this.bodyAfterForAggMlyprojectplanHVO(billvo, event, userobject);
			
			return vo;
		}
		
		return null;
	}
	
	
	private AggMlyprojectplanHVO bodyAfterForAggMlyprojectplanHVO(AggregatedValueObject billvo,
			BillCardBodyEditEvent event, Map userobject) throws BusinessException {
		AggMlyprojectplanHVO vo = (AggMlyprojectplanHVO) billvo;
		// 获取正在编辑的字段
		String key = event.getChangeKey();
		
		
		/**
		 * 这里从event中获取行信息时有问题,处理一下异常
		 */
		MlyprojectplanBVO monthProjectPlanBVO  = null;
		try {
			// 获取用户编辑的行
			monthProjectPlanBVO = (MlyprojectplanBVO) vo.getChildren(MlyprojectplanBVO.class)[event.getRow()];	
		} catch (Exception e) {
			ExceptionUtils.wrappBusinessException("您操作的数据已经被他人修改,请退出到列表界面刷新页面！");
		}
		
		
		switch (key) {
			// 编辑开始时间时,若有结束时间,则校验开始时间要早于结束时间并计算工期,若有工期,则计算结束时间
			case "plan_start_date":
				// 得到修改的字段的最新值(计划开始时间)
				Object plan_start_date = event.getChangrows()[0].getNewvalue();
				// 获取计划结束时间
				UFDate plan_end_date_old = monthProjectPlanBVO.getPlan_end_date();
				// 获取工期
				Integer duration_old1 = monthProjectPlanBVO.getDuration();
				if(CSICCommonUtils.isNotEmpty(plan_start_date)) {
					UFDate plan_start_date_new = new  UFDate(plan_start_date.toString());
					if(CSICCommonUtils.isNotEmpty(plan_end_date_old) && CSICCommonUtils.isEmpty(duration_old1)) {
						// 校验校验开始时间要早于结束时间
						if(plan_end_date_old.before(plan_start_date_new)) {
							ExceptionUtils.wrappBusinessException("计划开始日期要早于计划截止日期！");
						}
						Integer durationdays = UFDate.getDaysBetween(plan_start_date_new, plan_end_date_old);
						monthProjectPlanBVO.setDuration(durationdays);
					}else if(CSICCommonUtils.isNotEmpty(duration_old1) && CSICCommonUtils.isEmpty(plan_end_date_old)) {
						UFDate end_date_new = plan_start_date_new.getDateAfter(duration_old1);
						monthProjectPlanBVO.setPlan_end_date(end_date_new);
					}else if(CSICCommonUtils.isNotEmpty(duration_old1) && CSICCommonUtils.isNotEmpty(plan_end_date_old)) {
						// 校验校验开始时间要早于结束时间
						if(plan_end_date_old.before(plan_start_date_new)) {
							ExceptionUtils.wrappBusinessException("计划开始日期要早于计划截止日期！");
						}
						Integer durationdays = UFDate.getDaysBetween(plan_start_date_new, plan_end_date_old);
						monthProjectPlanBVO.setDuration(durationdays);
					}
				}
				break;
				
			// 编辑结束时间时,若有开始时间,则校验开始时间要早于结束时间并计算工期,若有工期,则计算开始时间
			case "plan_end_date":
				// 得到修改的字段的最新值(计划结束时间)
				Object plan_end_date = event.getChangrows()[0].getNewvalue();
				// 获取计划开始时间
				UFDate plan_start_date_old = monthProjectPlanBVO.getPlan_start_date();
				// 获取工期
				Integer duration_old2 = monthProjectPlanBVO.getDuration();
				
				if(CSICCommonUtils.isNotEmpty(plan_end_date)) {
					UFDate plan_end_date_new = new  UFDate(plan_end_date.toString());
					if(CSICCommonUtils.isNotEmpty(plan_start_date_old) && CSICCommonUtils.isEmpty(duration_old2)) {
						// 校验校验开始时间要早于结束时间
						if(plan_end_date_new.before(plan_start_date_old)) {
							ExceptionUtils.wrappBusinessException("计划开始日期要早于计划截止日期！");
						}
						Integer durationdays = UFDate.getDaysBetween(plan_start_date_old, plan_end_date_new);
						monthProjectPlanBVO.setDuration(durationdays);
					}else if(CSICCommonUtils.isNotEmpty(duration_old2) && CSICCommonUtils.isEmpty(plan_start_date_old)) {
						UFDate start_date_new = plan_end_date_new.getDateBefore(duration_old2);
						monthProjectPlanBVO.setPlan_start_date(start_date_new);
					}else if(CSICCommonUtils.isNotEmpty(duration_old2) && CSICCommonUtils.isNotEmpty(plan_start_date_old)) {
						// 校验校验开始时间要早于结束时间
						if(plan_end_date_new.before(plan_start_date_old)) {
							ExceptionUtils.wrappBusinessException("计划开始日期要早于计划截止日期！");
						}
						Integer durationdays = UFDate.getDaysBetween(plan_start_date_old, plan_end_date_new);
						monthProjectPlanBVO.setDuration(durationdays);
					}
					
				}
				break;
				
			// 编辑工期时,若有开始时间,则计算结束时间,若有结束时间,则计算开始时间	
			case "duration":
				// 得到修改的字段的最新值(工期)
				Object duration = event.getChangrows()[0].getNewvalue();
				// 获取计划开始时间
				UFDate plan_start_date_last = monthProjectPlanBVO.getPlan_start_date();
				// 获取计划结束时间
				UFDate plan_end_date_last = monthProjectPlanBVO.getPlan_end_date();
				
				if(CSICCommonUtils.isNotEmpty(duration)) {
					Integer durations = Integer.parseInt(duration.toString());
					if(CSICCommonUtils.isNotEmpty(plan_start_date_last) && CSICCommonUtils.isEmpty(plan_end_date_last)) {
						// 由开始时间算结束时间
						UFDate end_date_new = plan_start_date_last.getDateAfter(durations);
						monthProjectPlanBVO.setPlan_end_date(end_date_new);
					}else if(CSICCommonUtils.isNotEmpty(plan_end_date_last) && CSICCommonUtils.isEmpty(plan_start_date_last)) {
						// 由结束时间算开始时间
						UFDate end_date_new = plan_end_date_last.getDateBefore(durations);
						monthProjectPlanBVO.setPlan_end_date(end_date_new);
					}
				}
				break;
				
			case "def17":	 //  物料参照用的表体 def17字段
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
						monthProjectPlanBVO.setDef18(materialspec);
						monthProjectPlanBVO.setDef19(materialtype);
						monthProjectPlanBVO.setDef20(measdoc_name);
					}
				}
				break;
			default:
				break;	
		}
		return vo;
	}
	
	
	
	private TimePlanBillVO  bodyAfterForTimePlanBillVO(AggregatedValueObject billvo,
			BillCardBodyEditEvent event, Map userobject) throws BusinessException {
		
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
