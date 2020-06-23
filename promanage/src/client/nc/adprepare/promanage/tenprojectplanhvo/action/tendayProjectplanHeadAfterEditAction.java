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
   * 项目管理旬计划节点,卡片编辑态,表头编辑后事件
   * 获取表头的年月 以及项目 信息
   * 带出表体
 * @author yao
 *
 */
public class tendayProjectplanHeadAfterEditAction extends PMNCCAction {
	
	public <T> Object execute(IRequest request, T para) throws Exception {
		BillCardOperator billCardOperator = new BillCardOperator();//91H10560_CARD
		// 1、获取AGGVO （request转换主子VO）
		AggTenprojectplanHVO aggVO = billCardOperator.toBill(request);
		// 得到表头VO
		TenprojectplanHVO hvo = aggVO.getParentVO();
		// 获取表头项目
		String pk_project = hvo.getPk_project();
		// 获取表头的参照年月(使用表头的自定义项一)
		String refdate = hvo.getDef1();
		// 获取表头旬(这里没用枚举)    0:上旬   1:中旬  2:下旬
		String xun = hvo.getTendaymonth();
		
		List<TenprojectplanBVO> bodylist = new ArrayList<TenprojectplanBVO>();
		// 开始组装数据 第一部分 参照月度计划()  完成状态def5
		
		
		// 第二部分  参照本节点旬计划(历史未完成)  完成状态def5
		Collection<AggTenprojectplanHVO> bills = this.queryBills(pk_project,refdate,xun);//查表头
		List<AggTenprojectplanHVO> billsList = new ArrayList<>(bills);
		if (!billsList.isEmpty()) {
			for (AggTenprojectplanHVO vo : billsList) {
				if (vo.getChildren(TenprojectplanBVO.class) == null) {
					String con = "pk_time_plan='" + vo.getParentVO().getPk_time_plan() + " and def5 = 0' order by full_seq asc";
					// 查表体
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
//			// 任务编码
//			bvo.setFull_seq(index.toString());
//			bvo.setMilestone(UFBoolean.FALSE);
//			bvo.setPk_time_plan_item("1591260067234"+index);
//			// 级次
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
	 * 根据表头的项目和  参照日期 查询业务单据
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
