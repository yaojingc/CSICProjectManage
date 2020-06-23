package nc.adprepare.promanage.mlyprojectplanhvo.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.adprepare.promanage.mlyprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.bean.PageQueryVO;
import nc.adprepare.promanage.mlyprojectplanhvo.promanage.util.CommonUtil;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.mlyprojectplan.AggMlyprojectplanHVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanBVO;
import nc.vo.adprepare.mlyprojectplan.MlyprojectplanHVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pubapp.pattern.pub.Constructor;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.ui.model.PageInfo;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.framework.web.ui.pattern.extbillcard.ExtBillCard;
import nccloud.framework.web.ui.pattern.extbillcard.ExtBillCardOperator;
import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nccloud.web.pmpub.action.PMNCCAction;

/**
 * ��Ŀ�������¶ȼƻ��ڵ�,��Ƭ�༭̬,��ͷ�༭���¼� ��ȡ��ͷ������ �Լ���Ŀ ��Ϣ ��������
 * 
 * @author ycw
 *
 */
public class MlyprojectplanHeadAfterEditAction extends PMNCCAction {

	public <T> Object execute(IRequest request, T para) throws Exception {
		BillCardOperator billCardOperator = new BillCardOperator();// 91H10599_CARD
		// 1����ȡAGGVO ��requestת������VO��
		AggMlyprojectplanHVO aggVO = billCardOperator.toBill(request);
		// �õ���ͷVO
		MlyprojectplanHVO hvo = aggVO.getParentVO();
		// ��ȡ��ͷ��Ŀ
		String pk_project = hvo.getPk_project();
		String pk_time_plan = hvo.getPk_time_plan();
		// ��ȡ��ͷ�� ö��ֵ
		String def5 = hvo.getDef5();
		// ��ȡ��ͷѮ(����û��ö��) 0:��Ѯ 1:��Ѯ 2:��Ѯ

		Collection<AggMlyprojectplanHVO> bills = this.queryBills(pk_project);
		List<MlyprojectplanBVO> childrens = new ArrayList<>();
		List<AggMlyprojectplanHVO> billsList = new ArrayList<>(bills);
		// ������chidren��ֵ����childrens��
		for (AggMlyprojectplanHVO aggMlyprojectplanHVO : billsList) {
			MlyprojectplanBVO[] childrenVO = (MlyprojectplanBVO[]) aggMlyprojectplanHVO.getChildrenVO();
			for (int i = 0; i < childrenVO.length; i++) {
				childrens.add(childrenVO[i]);
			}
		}
		MlyprojectplanBVO[] array = childrens.toArray(new MlyprojectplanBVO[childrens.size()]);
		aggVO.setChildrenVO(array);
		BillCard card = billCardOperator.toCard(aggVO);
		return card;
	}

	/**
	 * ��ѯҵ������
	 *
	 * @param queryParamx`
	 * @return
	 * @throws MetaDataException
	 * 
	 * def5:
	 * 		0 δ���
	 * 		1�����
	 * 		2��ͣ
	 * 		3˳��
	 * 		4��ֹ
	 */
	private Collection<AggMlyprojectplanHVO> queryBills(String pk_project) throws MetaDataException {
		IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
		// ע�⣺ҵ���ṩ��ѯ������Ԫ���ݲ�ѯĬ�ϲ�ѯ��dr=1�������ˣ�
		String wheresql = "pk_project" + "='" + pk_project + "'";
//		String wheresql = "pk_project" + "='" + pk_project + "' and def5 not in (1,2)";
		Collection<AggMlyprojectplanHVO> bills = service.queryBillOfVOByCond(AggMlyprojectplanHVO.class, wheresql, true,
				false);
//		service.queryBillOfVOByCond(AggMlyprojectplanBVO.class, wheresql, true,false)
//		if (!billsList.isEmpty()) {
//			for (AggMlyprojectplanHVO vo : billsList) {
//				vo.setChildrenVO(null);
//			}
//		}

		return bills;
	}

	@Override
	protected Class getParaClass() {
		return null;
	}

}
