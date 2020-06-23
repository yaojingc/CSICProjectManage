package nccloud.web.phm.projectregister.action;

import nc.vo.phm.projectregister.ProjectRegisterHeadVO;
import nc.vo.pub.SuperVO;
import nccloud.web.pmpub.action.PMNCCListQueryAction;

public class ProjectRegisterQueryAction extends PMNCCListQueryAction {

	@Override
	protected Class<? extends SuperVO> getBillHeadVOClass(String pageCode) {
		return ProjectRegisterHeadVO.class;
	}
}
