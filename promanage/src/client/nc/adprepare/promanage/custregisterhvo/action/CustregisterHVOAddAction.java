package nc.adprepare.promanage.custregisterhvo.action;

import java.util.ArrayList;
import java.util.List;
import nc.bs.logging.Logger;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nccloud.framework.web.ui.model.PageInfo;
import nc.vo.adprepare.custregister.AggCustregisterHVO;
import nc.vo.adprepare.custregister.CustregisterHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.pub.Constructor;
import nccloud.base.exception.ExceptionUtils;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.querytemplet.QueryUtil4NCC;
import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nc.adprepare.promanage.custregisterhvo.promanage.bean.PageQueryVO;
import nc.adprepare.promanage.custregisterhvo.promanage.util.CommonUtil;

public class CustregisterHVOAddAction  implements ICommonAction{

	@Override
	public Object doAction(IRequest request) {
		String strRead = request.read();
		
		
		AggCustregisterHVO bills = new AggCustregisterHVO();
		
		CustregisterHVO hvo = new CustregisterHVO();
		
		hvo.setPk_group("0001A110000000000GZC");
		
		bills.setParentVO(hvo);
		return bills;
	}
	
}
