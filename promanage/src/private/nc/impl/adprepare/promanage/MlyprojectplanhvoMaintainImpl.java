
package nc.impl.adprepare.promanage;

import nc.impl.pub.ace.AceAggbusiMlyprojectplanHVOPubServiceImpl;
import nc.itf.adprepare.promanage.IMlyprojectplanhvoMaintain;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.pub.BusinessException;

public class MlyprojectplanhvoMaintainImpl extends AceAggbusiMlyprojectplanHVOPubServiceImpl
		implements IMlyprojectplanhvoMaintain {

	@Override
	public void delete(AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills)
			throws BusinessException {
		super.pubdeleteBills(clientFullVOs, originBills);
	}

	@Override
	public AggMlyprojectplanHVO[] insert(AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills)
			throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public AggMlyprojectplanHVO[] update(AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills)
			throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}

	@Override
	public AggMlyprojectplanHVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

	@Override
	public AggMlyprojectplanHVO[] save(AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills)
			throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggMlyprojectplanHVO[] unsave(AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills)
			throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggMlyprojectplanHVO[] approve(AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills)
			throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggMlyprojectplanHVO[] unapprove(AggMlyprojectplanHVO[] clientFullVOs, AggMlyprojectplanHVO[] originBills)
			throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

}
