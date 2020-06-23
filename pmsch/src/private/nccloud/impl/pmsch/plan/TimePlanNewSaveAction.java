package nccloud.impl.pmsch.plan;

import nc.vo.pmsch.plan.TimePlanBillVO;
import nc.vo.pmsch.plan.TimePlanItemVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.web.container.IRequest;
import nccloud.pub.pmpub.vo.PMPflowInfo4Cloud;
import nccloud.pub.pmpub.vo.PMPflowResultInfo;
import nccloud.web.pmpub.action.PMPflowScriptAction;
import util.CSICCommonUtils;
import nc.jdbc.framework.generator.IdGenerator;
import nc.jdbc.framework.generator.SequenceGenerator;

public class TimePlanNewSaveAction extends PMPflowScriptAction {


	@Override
	protected void afterProcFlow(PMPflowResultInfo result, Object[] vos, Object[] procResult, Object para,
			PMPflowInfo4Cloud pflowInfo) throws BusinessException {
		// TODO Auto-generated method stub
		
		// ���������Ķ���
		IdGenerator generator = new SequenceGenerator();
		
		if(CSICCommonUtils.isNotEmpty(vos)) {
			TimePlanBillVO billVO = (TimePlanBillVO) vos[0];
			TimePlanItemVO[] itemVOs = (TimePlanItemVO[]) billVO.getChildrenVO();
			// ѭ������,�����������ɵ������ŵ�def6, pk_time_plan_item��ֵһ������������
			for (int i = 0; i < itemVOs.length; i++) {
				TimePlanItemVO itemVO = itemVOs[i];
				String pk_item_old = itemVO.getPk_time_plan_item();
				
				itemVO.setDef6(pk_item_old);
				itemVO.setPk_time_plan_item(generator.generate());
			}
		}
		super.afterProcFlow(result, vos, procResult, para, pflowInfo);
	}
	
	
	
	
}
