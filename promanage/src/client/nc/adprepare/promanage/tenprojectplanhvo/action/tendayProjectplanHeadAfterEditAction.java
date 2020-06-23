package nc.adprepare.promanage.tenprojectplanhvo.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.adprepare.promanage.tenprojectplanhvo.promanage.bean.PageQueryInfo;
import nc.adprepare.promanage.tenprojectplanhvo.promanage.util.CommonUtil;
import nc.bs.dao.BaseDAO;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO;
import nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO;
import nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO;
import nc.vo.pub.lang.UFBoolean;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.ui.pattern.billcard.BillCardOperator;
import nccloud.web.pmpub.action.PMNCCAction;

/**
   * ��Ŀ����Ѯ�ƻ��ڵ�,��Ƭ�༭̬,��ͷ�༭���¼�
   * ��ȡ��ͷ������ �Լ���Ŀ ��Ϣ
   * ��������
 * @author yao
 *
 */
public class tendayProjectplanHeadAfterEditAction extends PMNCCAction {
	
	public <T> Object execute(IRequest request, T para) throws Exception {
		BillCardOperator billCardOperator = new BillCardOperator();//91H10560_CARD
		// 1����ȡAGGVO ��requestת������VO��
		AggTenprojectplanHVO aggVO = billCardOperator.toBill(request);
		// �õ���ͷVO
		TenprojectplanHVO hvo = aggVO.getParentVO();
		// ��ȡ��ͷ��Ŀ
		String pk_project = hvo.getPk_project();
		// ��ȡ��ͷ�Ĳ�������(ʹ�ñ�ͷ���Զ�����һ)
		String refdate = hvo.getDef1();
		// ��ȡ��ͷѮ(����û��ö��)    0:��Ѯ   1:��Ѯ  2:��Ѯ
		String xun = hvo.getTendaymonth();
		
		List<TenprojectplanBVO> bodylist = new ArrayList<TenprojectplanBVO>();
		// ��ʼ��װ���� ��һ���� �����¶ȼƻ�()  ���״̬def5
		
		
		// �ڶ�����  ���ձ��ڵ�Ѯ�ƻ�(��ʷδ���)  ���״̬def5
		Collection<AggTenprojectplanHVO> bills = this.queryBills(pk_project,refdate,xun);//���ͷ
		List<AggTenprojectplanHVO> billsList = new ArrayList<>(bills);
		if (!billsList.isEmpty()) {
			for (AggTenprojectplanHVO vo : billsList) {
				if (vo.getChildren(TenprojectplanBVO.class) == null) {
					String con = "pk_time_plan='" + vo.getParentVO().getPk_time_plan() + " and def5 = 0' order by full_seq asc";
					// �����
					Collection<TenprojectplanBVO> result = new BaseDAO().retrieveByClause(TenprojectplanBVO.class,con);
					List<TenprojectplanBVO> childs = new ArrayList<>(result);
					for (int i = 0; i < childs.size(); i++) {
						bodylist.add(childs.get(i));
					}
				}
			}
		}
		
		
		TenprojectplanBVO[] bvos = bodylist.toArray(new TenprojectplanBVO[bodylist.size()]);
		
		
		
		//TenprojectplanBVO[] bvos = new TenprojectplanBVO[13];
		
//		for (int i = 0; i < 13; i++) {
//			Integer index = i+1;
//			TenprojectplanBVO bvo = new TenprojectplanBVO();
//			// �������
//			bvo.setFull_seq(index.toString());
//			bvo.setMilestone(UFBoolean.FALSE);
//			bvo.setPk_time_plan_item("1591260067234"+index);
//			// ����
//			// bvo.setPlan_level("1");
//			bvo.setRowno(index.toString());
//			bvo.setSeq(index);
//			
//			bvos[i] = bvo;
//		}
		aggVO.setChildrenVO(bvos);
		
		
		return billCardOperator.toCard(aggVO);
	}
	
	/**
	 * ���ݱ�ͷ����Ŀ��  �������� ��ѯҵ�񵥾�
	 * @param pk_project/def1(refdate)/tendaymonth
	 * @return
	 * @throws MetaDataException
	 */
	private Collection<AggTenprojectplanHVO> queryBills(String pk_project,String refdate,String xun) throws MetaDataException {
		IMDPersistenceQueryService service = CommonUtil.getMDPersistenceQueryService();
		String wheresql = " pk_project = '"+pk_project+"' and def1 = '"+refdate+"' and tendaymonth = "+xun;
		Collection<AggTenprojectplanHVO> bills = service.queryBillOfVOByCond(AggTenprojectplanHVO.class, wheresql, true,
				false);
		return bills;
	}

	

	@Override
	protected Class getParaClass() {
		return null;
	}
	

}
