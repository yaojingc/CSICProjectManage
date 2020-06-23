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
 * @author Edit By yaojing 2020/06/09 修改计划编制表头编辑事件 新增编辑态时: 获取表头的年月 以及项目 信息
 *         带出月度计划节点数据+本节点数据
 */
public class TimePlanHeadAfterHandler extends PMAbstractCardHeadAfterHandler {
	
	// 计划编制表体明细VO
	private List<TimePlanItemVO> bodylist = null;

	@Override
	protected AggregatedValueObject doAfterEdit(AggregatedValueObject billvo, BillCardHeadEditEvent event,
			Map userobject) throws BusinessException {
		
		// 从监听中获取用户正在编辑的字段名称
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
				ExceptionUtils.asBusinessRuntimeException("所选项目不存在");
			}
			ProjectHeadVO project = (ProjectHeadVO) projects[0];
			if (StringUtil.isEmpty(project.getPk_workcalendar())) {
				ExceptionUtils.asBusinessRuntimeException("所选项目未维护项目日历，请先维护该项目的项目日历");
			}
			break;
			
			
		// Add By yaojing
		case "def2":	
			TimePlanHeadVO headVO = (TimePlanHeadVO) billvo.getParentVO();
			// 获取表头的项目
			String pk_project = headVO.getPk_project();
			// 获取表头的参照日期   2020-06-09 15:54:29
			String refdate  = headVO.getDef1();
			if(CSICCommonUtils.isNotEmpty(refdate)) {
				// 参照日期处理
				refdate = refdate.substring(0,7);
			}
			// 获取表头的旬    0:上旬   1:中旬  2:下旬
			String xun = headVO.getDef2();
			
			bodylist = new ArrayList<TimePlanItemVO>();
			
			// 开始组装数据 第一部分 参照月度计划()  完成状态def5
			this.queryMonthBills(pk_project,refdate);
			// 第二部分  参照本节点旬计划(历史未完成)  完成状态def5
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
		// 先通过表头的项目/参照日期得到唯一的月度计划单据(月度计划每个项目每个月填写一张单据)
		//IMDPersistenceQueryService service = ServiceLocator.find(IMDPersistenceQueryService.class);
		
		IMDPersistenceQueryService service = NCLocator.getInstance().lookup(IMDPersistenceQueryService.class);
		
		String wheresql = " pk_project = '"+pk_project+"' and def1 like '"+refdate+"%'";
		// 查询得到整张单据
		Collection<AggMlyprojectplanHVO> bills = service.queryBillOfVOByCond(AggMlyprojectplanHVO.class, wheresql, true,false);
		// 然后逐个取出表体,筛选出未完成/顺延/终止 的计划明细
		
		List<AggMlyprojectplanHVO> billsList = new ArrayList<>(bills);
		for (int i = 0; i < billsList.size(); i++) {
			AggMlyprojectplanHVO billVO = billsList.get(i);
			MlyprojectplanBVO[] bodyVOS = (MlyprojectplanBVO[]) billVO.getChildrenVO();
			for (int j = 0; j < bodyVOS.length; j++) {
				// 需要过滤掉已完成跟暂停的明细数据
				String def5 = bodyVOS[j].getDef5();// 计划完成状态
				if("0".equals(def5) || "3".equals(def5) || "4".equals(def5)) {
					// 月度计划明细VO转换成计划编制明细VO
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
					
					// 级次 数据有问题 处理一下
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
	 * 计划编制(旬计划)
	 * 本节点参照查询方法
	 * 同一项目,所有计划状态为未完成的表体明细数据
	 * @param pk_project/def1(refdate)/def2
	 * @return
	 * @throws MetaDataException
	 * @throws DAOException 
	 */
	private Collection<TimePlanItemVO> queryXunBills(String pk_project) throws DAOException {
		String con = " dr = 0 and  pk_project = '"+pk_project + "' and def5 in ('0','3','4') order by full_seq asc";
		// 查表体
		Collection<TimePlanItemVO> result = new BaseDAO().retrieveByClause(TimePlanItemVO.class,con);
		return result;
	}
}
