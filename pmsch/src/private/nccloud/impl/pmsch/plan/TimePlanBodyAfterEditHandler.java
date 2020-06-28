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
 * ��������������Ϣ,ѡ������ʱ�Զ��������,�ͺ�,������λ
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
		// ��ȡ���ڱ༭���ֶ�
		String key = event.getChangeKey();
		
		
		/**
		 * �����event�л�ȡ����Ϣʱ������,����һ���쳣
		 */
		MlyprojectplanBVO monthProjectPlanBVO  = null;
		try {
			// ��ȡ�û��༭����
			monthProjectPlanBVO = (MlyprojectplanBVO) vo.getChildren(MlyprojectplanBVO.class)[event.getRow()];	
		} catch (Exception e) {
			ExceptionUtils.wrappBusinessException("�������������Ѿ��������޸�,���˳����б����ˢ��ҳ�棡");
		}
		
		
		switch (key) {
			// �༭��ʼʱ��ʱ,���н���ʱ��,��У�鿪ʼʱ��Ҫ���ڽ���ʱ�䲢���㹤��,���й���,��������ʱ��
			case "plan_start_date":
				// �õ��޸ĵ��ֶε�����ֵ(�ƻ���ʼʱ��)
				Object plan_start_date = event.getChangrows()[0].getNewvalue();
				// ��ȡ�ƻ�����ʱ��
				UFDate plan_end_date_old = monthProjectPlanBVO.getPlan_end_date();
				// ��ȡ����
				Integer duration_old1 = monthProjectPlanBVO.getDuration();
				if(CSICCommonUtils.isNotEmpty(plan_start_date)) {
					UFDate plan_start_date_new = new  UFDate(plan_start_date.toString());
					if(CSICCommonUtils.isNotEmpty(plan_end_date_old) && CSICCommonUtils.isEmpty(duration_old1)) {
						// У��У�鿪ʼʱ��Ҫ���ڽ���ʱ��
						if(plan_end_date_old.before(plan_start_date_new)) {
							ExceptionUtils.wrappBusinessException("�ƻ���ʼ����Ҫ���ڼƻ���ֹ���ڣ�");
						}
						Integer durationdays = UFDate.getDaysBetween(plan_start_date_new, plan_end_date_old);
						monthProjectPlanBVO.setDuration(durationdays);
					}else if(CSICCommonUtils.isNotEmpty(duration_old1) && CSICCommonUtils.isEmpty(plan_end_date_old)) {
						UFDate end_date_new = plan_start_date_new.getDateAfter(duration_old1);
						monthProjectPlanBVO.setPlan_end_date(end_date_new);
					}else if(CSICCommonUtils.isNotEmpty(duration_old1) && CSICCommonUtils.isNotEmpty(plan_end_date_old)) {
						// У��У�鿪ʼʱ��Ҫ���ڽ���ʱ��
						if(plan_end_date_old.before(plan_start_date_new)) {
							ExceptionUtils.wrappBusinessException("�ƻ���ʼ����Ҫ���ڼƻ���ֹ���ڣ�");
						}
						Integer durationdays = UFDate.getDaysBetween(plan_start_date_new, plan_end_date_old);
						monthProjectPlanBVO.setDuration(durationdays);
					}
				}
				break;
				
			// �༭����ʱ��ʱ,���п�ʼʱ��,��У�鿪ʼʱ��Ҫ���ڽ���ʱ�䲢���㹤��,���й���,����㿪ʼʱ��
			case "plan_end_date":
				// �õ��޸ĵ��ֶε�����ֵ(�ƻ�����ʱ��)
				Object plan_end_date = event.getChangrows()[0].getNewvalue();
				// ��ȡ�ƻ���ʼʱ��
				UFDate plan_start_date_old = monthProjectPlanBVO.getPlan_start_date();
				// ��ȡ����
				Integer duration_old2 = monthProjectPlanBVO.getDuration();
				
				if(CSICCommonUtils.isNotEmpty(plan_end_date)) {
					UFDate plan_end_date_new = new  UFDate(plan_end_date.toString());
					if(CSICCommonUtils.isNotEmpty(plan_start_date_old) && CSICCommonUtils.isEmpty(duration_old2)) {
						// У��У�鿪ʼʱ��Ҫ���ڽ���ʱ��
						if(plan_end_date_new.before(plan_start_date_old)) {
							ExceptionUtils.wrappBusinessException("�ƻ���ʼ����Ҫ���ڼƻ���ֹ���ڣ�");
						}
						Integer durationdays = UFDate.getDaysBetween(plan_start_date_old, plan_end_date_new);
						monthProjectPlanBVO.setDuration(durationdays);
					}else if(CSICCommonUtils.isNotEmpty(duration_old2) && CSICCommonUtils.isEmpty(plan_start_date_old)) {
						UFDate start_date_new = plan_end_date_new.getDateBefore(duration_old2);
						monthProjectPlanBVO.setPlan_start_date(start_date_new);
					}else if(CSICCommonUtils.isNotEmpty(duration_old2) && CSICCommonUtils.isNotEmpty(plan_start_date_old)) {
						// У��У�鿪ʼʱ��Ҫ���ڽ���ʱ��
						if(plan_end_date_new.before(plan_start_date_old)) {
							ExceptionUtils.wrappBusinessException("�ƻ���ʼ����Ҫ���ڼƻ���ֹ���ڣ�");
						}
						Integer durationdays = UFDate.getDaysBetween(plan_start_date_old, plan_end_date_new);
						monthProjectPlanBVO.setDuration(durationdays);
					}
					
				}
				break;
				
			// �༭����ʱ,���п�ʼʱ��,��������ʱ��,���н���ʱ��,����㿪ʼʱ��	
			case "duration":
				// �õ��޸ĵ��ֶε�����ֵ(����)
				Object duration = event.getChangrows()[0].getNewvalue();
				// ��ȡ�ƻ���ʼʱ��
				UFDate plan_start_date_last = monthProjectPlanBVO.getPlan_start_date();
				// ��ȡ�ƻ�����ʱ��
				UFDate plan_end_date_last = monthProjectPlanBVO.getPlan_end_date();
				
				if(CSICCommonUtils.isNotEmpty(duration)) {
					Integer durations = Integer.parseInt(duration.toString());
					if(CSICCommonUtils.isNotEmpty(plan_start_date_last) && CSICCommonUtils.isEmpty(plan_end_date_last)) {
						// �ɿ�ʼʱ�������ʱ��
						UFDate end_date_new = plan_start_date_last.getDateAfter(durations);
						monthProjectPlanBVO.setPlan_end_date(end_date_new);
					}else if(CSICCommonUtils.isNotEmpty(plan_end_date_last) && CSICCommonUtils.isEmpty(plan_start_date_last)) {
						// �ɽ���ʱ���㿪ʼʱ��
						UFDate end_date_new = plan_end_date_last.getDateBefore(durations);
						monthProjectPlanBVO.setPlan_end_date(end_date_new);
					}
				}
				break;
				
			case "def17":	 //  ���ϲ����õı��� def17�ֶ�
				// �õ��޸ĵ��ֶε�����ֵ
				Object pk_material = event.getChangrows()[0].getNewvalue();
				if(CSICCommonUtils.isNotEmpty(pk_material)) {
					String pk_material_new = (String) pk_material;
					List<MaterialVO> materialList = CSICCommonUtils.isContainMaterial(new String[] {pk_material_new});
					if(CSICCommonUtils.isNotEmpty(materialList)) {
						MaterialVO materialVO = materialList.get(0);
						// ���
						String materialspec = materialVO.getMaterialspec();
						// �ͺ�
						String materialtype = materialVO.getMaterialtype();
						// ������λ����(��Ҫ��ת��)
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
		// ǰ�üƻ�
		case TimePlanItemVO.PK_FRONT_PLAN:
			TimePlanDependencyResolver resolver = new TimePlanDependencyResolver(vo);
			// ��·���
			PlanDependencyChecker checker = new PlanDependencyChecker(resolver);
			checker.init();
			if (!ArrayUtil.isEmpty(checker.checkCycle())) {
				ExceptionUtils.wrappBusinessException("ѡ��ǰ�ƻ���Ϊǰ�ڼƻ�������ֻ�·��");
			}
			break;
		case TimePlanItemVO.PLAN_START_DATE:
		case TimePlanItemVO.PLAN_END_DATE:
		case TimePlanItemVO.DURATION:
			// ��ȡ��Ŀ����
			String pkProject = vo.getParentVO().getPk_project();
			if (StringUtil.isEmpty(pkProject)) {
				ExceptionUtils.wrappBusinessException("��ѡ����Ŀ��");
			}
			SuperVO project = PMProxy.lookup(IProjectQueryService.class)
					.queryProjectHeadVOsByPK(new String[] { pkProject })[0];
			if (project == null
					|| ((ProjectHeadVO) project).getPk_workcalendar() == null) {
				ExceptionUtils.wrappBusinessException("��ά����Ӧ��Ŀ�ϵĹ���������");
			}
			DurationUtil.resetDuration((TimePlanItemVO) vo
					.getChildren(TimePlanItemVO.class)[event.getRow()],
					TimePlanItemVO.PLAN_START_DATE,
					TimePlanItemVO.PLAN_END_DATE, TimePlanItemVO.DURATION,
					((ProjectHeadVO) project).getPk_workcalendar(), key, event
							.getChangrows()[0].getOldvalue(), event
							.getChangrows()[0].getNewvalue());
			// ���¸�����ʱ��
			new TimePlanDateSummarizer(pkProject).summarizeByOneRow(
					(TimePlanBillVO) billvo, event.getRow());
			// ���±�ͷʱ��
			updateHeadDate(vo);
			break;
			
			
		case TimePlanItemVO.DEF17:	 //  ���ϲ����õı��� def17�ֶ�
			// ��ȡ�û��༭����
			TimePlanItemVO timePlanItemVO = (TimePlanItemVO) vo.getChildren(TimePlanItemVO.class)[event.getRow()];			
			// �õ��޸ĵ��ֶε�����ֵ
			Object pk_material = event.getChangrows()[0].getNewvalue();
			if(CSICCommonUtils.isNotEmpty(pk_material)) {
				String pk_material_new = (String) pk_material;
				List<MaterialVO> materialList = CSICCommonUtils.isContainMaterial(new String[] {pk_material_new});
				if(CSICCommonUtils.isNotEmpty(materialList)) {
					MaterialVO materialVO = materialList.get(0);
					// ���
					String materialspec = materialVO.getMaterialspec();
					// �ͺ�
					String materialtype = materialVO.getMaterialtype();
					// ������λ����(��Ҫ��ת��)
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
