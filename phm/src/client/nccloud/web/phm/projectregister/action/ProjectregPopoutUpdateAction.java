package nccloud.web.phm.projectregister.action;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import nc.adprepare.promanage.custregisterhvo.promanage.util.CommonUtil;
import nc.itf.phm.projectregister.prv.IProjectRegister;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.pf.pub.util.SQLUtil;
import nc.vo.phm.projectregister.ProjectRegisterBillVO;
import nc.vo.phm.projectregister.ProjectRegisterHeadVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.IRequest;
import nccloud.web.pmpub.action.PMNCCAction;
import util.CSICCommonUtils;

public class ProjectregPopoutUpdateAction extends PMNCCAction {

	/**
	 * data:{"pk_selectrow":selectRowData[0].data.values.pk_projectregister.value,
	 * "projectname":projectname, "pk_dept":pk_dept, "pk_psndoc":pk_psndoc},
	 */
	@Override
	public <T> Object execute(IRequest request, T para) throws Exception {
		Map<String, String> paramMap = (Map<String, String>) para;

		String pk_projectregister = paramMap.get("pk_selectrow");
		String projectname = paramMap.get("projectname");
		String pk_dept = paramMap.get("pk_dept");
		String pk_psndoc = paramMap.get("pk_psndoc");

		// 根据pk查询单据
		IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
		String wheresql = SQLUtil.buildSqlForIn("pk_projectregister", new String[] { paramMap.get("pk_selectrow") });
		Collection<ProjectRegisterBillVO> bills = service.queryBillOfVOByCond(ProjectRegisterBillVO.class, wheresql,true, false);
		
		
		
		Optional.ofNullable(bills).ifPresent(u->{
			// 查询得到原始单据后更新对应的项目名称,责任部门,责任人字段
			bills.forEach(aggVO -> {
				ProjectRegisterBillVO cloneAggvo = (ProjectRegisterBillVO) aggVO.clone();
				
				ProjectRegisterHeadVO headVO = aggVO.getParentVO();
				headVO.setProject_name(projectname);
				headVO.setPk_operdept_v(pk_dept);
				headVO.setPk_operuser(pk_psndoc);
				
				// 调用项目管理后台更新接口
				try {
					ProjectRegisterBillVO[] resultbill = ServiceLocator.find(IProjectRegister.class)
							.updateProjectRegister(new ProjectRegisterBillVO[]{aggVO}, new ProjectRegisterBillVO[] {cloneAggvo});
				} catch (BusinessException e) {
					e.printStackTrace();
				}
			});
		});

		return "更新成功";
	}

}
