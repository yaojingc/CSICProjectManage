package nccloud.impl.pmsch.plan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.itf.pmbd.pub.IProjectQueryService;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanBVO;
import nc.vo.pim.project.ProjectHeadVO;
import nc.vo.pm.constant.BillStatusConst;
import nc.vo.pm.constant.BillTypeConst;
import nc.vo.pm.proxy.PMProxy;
import nc.vo.pm.util.ArrayUtil;
import nc.vo.pm.util.StringUtil;
import nc.vo.pmbd.common.utils.ExceptionUtils;
import nc.vo.pmsch.plan.TimePlanHeadVO;
import nc.vo.pmsch.plan.TimePlanItemVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nccloud.framework.service.ServiceLocator;
import nccloud.itf.pmpub.pub.PMAbstractCardHeadAfterHandler;
import nccloud.pub.pmpub.util.OrgChangeDefaultHandler;
import nccloud.pub.pmpub.vo.BillCardHeadEditEvent;
import util.CSICCommonUtils;

/**
 * @author Edit By yaojing 2020/06/09 �޸ļƻ����Ʊ�ͷ�༭�¼� �����༭̬ʱ: ��ȡ��ͷ������ �Լ���Ŀ ��Ϣ
 *         �����¶ȼƻ��ڵ�����+���ڵ�����
 */
public class TimePlanHeadAfterHandler extends PMAbstractCardHeadAfterHandler {
	
	// �ƻ����Ʊ�����ϸVO
	private List<TimePlanItemVO> bodylist = null;

	@Override
	protected AggregatedValueObject doAfterEdit(AggregatedValueObject billvo, BillCardHeadEditEvent event,
			Map userobject) throws BusinessException {
		
		// �Ӽ����л�ȡ�û����ڱ༭���ֶ�����
		String editKey = event.getChangeKey();
		
		if (editKey == null) {
			return billvo;
		}

		switch (editKey) {
		case TimePlanHeadVO.PK_ORG_V:
			OrgChangeDefaultHandler.execute((SuperVO) billvo.getParentVO(), editKey,
					(String) event.getOldValue(), (String) event.getNewValue(), BillTypeConst.TIME_PLAN);
			billvo.setParentVO(resetVoData((TimePlanHeadVO) billvo.getParentVO()));
			break;
		case TimePlanHeadVO.PK_PROJECT:
			if (StringUtil.isEmpty((String) event.getNewValue())) {
				break;
			}
			SuperVO[] projects = PMProxy.lookup(IProjectQueryService.class)
					.queryProjectHeadVOsByPK((String[]) new String[] { (String) event.getNewValue() });
			if (ArrayUtil.isEmpty(projects)) {
				ExceptionUtils.asBusinessRuntimeException("��ѡ��Ŀ������");
			}
			ProjectHeadVO project = (ProjectHeadVO) projects[0];
			if (StringUtil.isEmpty(project.getPk_workcalendar())) {
				ExceptionUtils.asBusinessRuntimeException("��ѡ��Ŀδά����Ŀ����������ά������Ŀ����Ŀ����");
			}
			break;
			
			
		// Add By yaojing
		case "def2":	
			TimePlanHeadVO headVO = (TimePlanHeadVO) billvo.getParentVO();
			// ��ȡ��ͷ����Ŀ
			String pk_project = headVO.getPk_project();
			// ��ȡ��ͷ�Ĳ�������   2020-06-09 15:54:29
			String refdate  = headVO.getDef1();
			if(CSICCommonUtils.isNotEmpty(refdate)) {
				// �������ڴ���
				refdate = refdate.substring(0,7);
			}
			// ��ȡ��ͷ��Ѯ    0:��Ѯ   1:��Ѯ  2:��Ѯ
			String xun = headVO.getDef2();
			
			bodylist = new ArrayList<TimePlanItemVO>();
			
			// ��ʼ��װ���� ��һ���� �����¶ȼƻ�()  ���״̬def5
			this.queryMonthBills(pk_project,refdate);
			// �ڶ�����  ���ձ��ڵ�Ѯ�ƻ�(��ʷδ���)  ���״̬def5
			Collection<TimePlanItemVO> timeplanitemVOS = this.queryXunBills(pk_project);
			
			List<TimePlanItemVO> billsList = new ArrayList<>(timeplanitemVOS);
			
			if(CSICCommonUtils.isNotEmpty(billsList)) {
				for (TimePlanItemVO vo : billsList) {
					
					TimePlanItemVO itemVO = new TimePlanItemVO();
					itemVO.setDef5(vo.getDef5());
					itemVO.setDuration(vo.getDuration());
					itemVO.setFull_seq(vo.getFull_seq());
					itemVO.setInnercode(vo.getInnercode());
					itemVO.setMilestone(vo.getMilestone());
					itemVO.setName(vo.getName());
					itemVO.setPk_dutier(vo.getPk_dutier());
					itemVO.setPk_duty_dept(vo.getPk_duty_dept());
					itemVO.setPk_duty_dept_v(vo.getPk_duty_dept_v());
					itemVO.setPk_group(vo.getPk_group());
					itemVO.setPk_org(vo.getPk_org());
					itemVO.setPk_org_v(vo.getPk_org_v());
					itemVO.setPk_project(vo.getPk_project());
					itemVO.setPk_time_plan(vo.getPk_time_plan());
					itemVO.setPk_time_plan_item(vo.getPk_time_plan_item());
					itemVO.setPlan_start_date(vo.getPlan_start_date());
					itemVO.setPlan_end_date(vo.getPlan_end_date());
					itemVO.setPlan_level(vo.getPlan_level());
					itemVO.setRowno(vo.getRowno());
					itemVO.setSeq(vo.getSeq());
					itemVO.setVersion(vo.getVersion());
					
					bodylist.add(itemVO);
				}
			}
			TimePlanItemVO[] bvos = bodylist.toArray(new TimePlanItemVO[bodylist.size()]);
			
		

			
			
			billvo.setChildrenVO(bvos);
			
			break;
		}
		return billvo;
	}

	private TimePlanHeadVO resetVoData(TimePlanHeadVO headVO) {
		TimePlanHeadVO resetVO = new TimePlanHeadVO();
		resetVO.setPk_group(headVO.getPk_group());
		resetVO.setPk_org(headVO.getPk_org());
		resetVO.setPk_org_v(headVO.getPk_org_v());
		resetVO.setBill_type(BillTypeConst.TIME_PLAN);
		resetVO.setBill_code(headVO.getBill_code());
		resetVO.setBill_status(BillStatusConst.free);
		resetVO.setVersion(1);
		resetVO.setLast_v_flag(UFBoolean.TRUE);
		resetVO.setTransi_type(headVO.getTransi_type());
		resetVO.setPk_transitype(headVO.getPk_transitype());
		return resetVO;
	}
	
	
	
	private Collection<TimePlanItemVO> queryMonthBills(String pk_project,String refdate) throws DAOException, MetaDataException {
		// MlyprojectplanHVO	MlyprojectplanBVO
		// ��ͨ����ͷ����Ŀ/�������ڵõ�Ψһ���¶ȼƻ�����(�¶ȼƻ�ÿ����Ŀÿ������дһ�ŵ���)
		//IMDPersistenceQueryService service = ServiceLocator.find(IMDPersistenceQueryService.class);
		
		IMDPersistenceQueryService service = NCLocator.getInstance().lookup(IMDPersistenceQueryService.class);
		
		String wheresql = " pk_project = '"+pk_project+"' and def1 like '"+refdate+"%'";
		// ��ѯ�õ����ŵ���
		Collection<AggMlyprojectplanHVO> bills = service.queryBillOfVOByCond(AggMlyprojectplanHVO.class, wheresql, true,false);
		// Ȼ�����ȡ������,ɸѡ��δ���/˳��/��ֹ �ļƻ���ϸ
		
		List<AggMlyprojectplanHVO> billsList = new ArrayList<>(bills);
		for (int i = 0; i < billsList.size(); i++) {
			AggMlyprojectplanHVO billVO = billsList.get(i);
			MlyprojectplanBVO[] bodyVOS = (MlyprojectplanBVO[]) billVO.getChildrenVO();
			for (int j = 0; j < bodyVOS.length; j++) {
				// ��Ҫ���˵�����ɸ���ͣ����ϸ����
				String def5 = bodyVOS[j].getDef5();// �ƻ����״̬
				if("0".equals(def5) || "3".equals(def5) || "4".equals(def5)) {
					// �¶ȼƻ���ϸVOת���ɼƻ�������ϸVO
					TimePlanItemVO timeplanitemVO = new TimePlanItemVO();
					timeplanitemVO.setPk_time_plan_item(bodyVOS[j].getPk_time_plan_item());
					timeplanitemVO.setPk_group(bodyVOS[j].getPk_group());
					timeplanitemVO.setPk_org(bodyVOS[j].getPk_org());
					timeplanitemVO.setPk_org_v(bodyVOS[j].getPk_org_v());
					timeplanitemVO.setName(bodyVOS[j].getName());
					timeplanitemVO.setFull_seq(bodyVOS[j].getFull_seq());
					timeplanitemVO.setMilestone(bodyVOS[j].getMilestone());
					timeplanitemVO.setPk_dutier(bodyVOS[j].getPk_dutier());
					timeplanitemVO.setPk_duty_dept(bodyVOS[j].getPk_duty_dept());
					timeplanitemVO.setPk_duty_dept_v(bodyVOS[j].getPk_duty_dept_v());
					timeplanitemVO.setPk_front_plan(bodyVOS[j].getPk_front_plan());
					
					// ���� ���������� ����һ��
					String plan_level = bodyVOS[j].getPlan_level();
					if(plan_level != null ) {
						if(plan_level.contains(".")) {
							plan_level = plan_level.substring(0 , plan_level.length() - 2);
							timeplanitemVO.setPlan_level(Integer.parseInt(plan_level));
						}else {
							timeplanitemVO.setPlan_level(Integer.parseInt(plan_level));
						}
					}
					
					timeplanitemVO.setPlan_start_date(bodyVOS[j].getPlan_start_date());
					timeplanitemVO.setPlan_end_date(bodyVOS[j].getPlan_end_date());
					bodylist.add(timeplanitemVO);
				}
			}
		}
		
		return bodylist;
	}
	
	
	
	/**
	 * �ƻ�����(Ѯ�ƻ�)
	 * ���ڵ���ղ�ѯ����
	 * ͬһ��Ŀ,���мƻ�״̬Ϊδ��ɵı�����ϸ����
	 * @param pk_project/def1(refdate)/def2
	 * @return
	 * @throws MetaDataException
	 * @throws DAOException 
	 */
	private Collection<TimePlanItemVO> queryXunBills(String pk_project) throws DAOException {
		String con = " dr = 0 and  pk_project = '"+pk_project + "' and def5 in ('0','3','4') order by full_seq asc";
		// �����
		Collection<TimePlanItemVO> result = new BaseDAO().retrieveByClause(TimePlanItemVO.class,con);
		return result;
	}
}
