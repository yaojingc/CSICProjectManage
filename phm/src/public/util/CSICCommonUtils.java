package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import nc.adprepare.promanage.tenprojectplanhvo.promanage.util.CommonUtil;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.util.mmf.framework.base.MMValueCheck;
import nc.vo.bd.bom.bom0202.entity.BomVO;
import nc.vo.bd.config.BDModeSelectedVO;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.material.MaterialVO;
import nc.vo.bd.material.measdoc.MeasdocVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nc.vo.util.BDModeManager;
import nc.vo.util.BDPKLockUtil;
import nc.vo.util.bizlock.BizlockDataUtil;
import nccloud.framework.service.ServiceLocator;


/**
 * 武船重工公共工具类
 * 
 * @author yaojing
 * 
 */
public class CSICCommonUtils {
	private static IMDPersistenceQueryService persistenceQueryService = null;
	
	/**
	 * 元数据查询服务
	 */
	public static IMDPersistenceQueryService getMDPersistenceQueryService() {
		if (persistenceQueryService == null) {
			persistenceQueryService = ServiceLocator.find(IMDPersistenceQueryService.class);
		}
		return persistenceQueryService;
	}

	/**
	 * 通过得到的物料主键查询bom中的信息
	 * 
	 * @param pk_material
	 * @return
	 */
	public static String queryBomByPk_material(String pk_material) {
		SqlBuilder sql = new SqlBuilder();
		sql.append(" hcmaterialid ", pk_material);
		sql.append(" and dr ", 0);
		String[] names = new String[] { "hvdef1" };
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		List<BomVO> list = new ArrayList<BomVO>();
		try {
			list = (List<BomVO>) queryBS.retrieveByClause(BomVO.class,
					sql.toString(), names);
		} catch (BusinessException e) {
			e.printStackTrace();
		}

		if (CSICCommonUtils.isNotEmpty(list) && list.size() == 1) {
			return list.get(0).getAttributeValue("hvdef1").toString();
		} else {
			return null;
		}
	}

	

	/**
	 * 根据客户档案的主键查询客户名称
	 * 
	 * @param pk_customer
	 * @return
	 */
	public static String queryCustByPK(String pk_customer) {
		SqlBuilder sql = new SqlBuilder();
		sql.append(" pk_customer ", pk_customer);
		sql.append(" and dr ", 0);
		String[] names = new String[] { "name" };
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		List<CustomerVO> list = new ArrayList<CustomerVO>();
		try {
			list = (List<CustomerVO>) queryBS.retrieveByClause(
					CustomerVO.class, sql.toString(), names);
		} catch (BusinessException e) {
			e.printStackTrace();
		}

		if (CSICCommonUtils.isNotEmpty(list) && list.size() == 1) {
			return (String) list.get(0).getAttributeValue("name");
		} else {
			return null;
		}
	}

	

	/**
	 * 通过主计量单位主键查询物料中的主计量单位
	 * 
	 * @param pk_measdoc
	 * @return
	 * @throws BusinessException
	 */
	public static String queryMeasdocBypk(String pk_measdoc)
			throws BusinessException {
		SqlBuilder sql = new SqlBuilder();
		sql.append(" pk_measdoc ", pk_measdoc);
		sql.append(" and dr ", 0);
		String[] names = new String[] { MeasdocVO.NAME };
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		List<MeasdocVO> list = (List<MeasdocVO>) queryBS.retrieveByClause(
				MeasdocVO.class, sql.toString(), names);

		if (CSICCommonUtils.isNotEmpty(list)) {
			return list.get(0).getName();
		} else {
			return null;
		}
	}

	/**
	 * 列表界面中参照显示中文
	 * 
	 * @param arrs
	 * @param pk
	 * @return
	 */
	public static String findRefNameByPKInVector(Vector arrs, String pk) {
		if (CSICCommonUtils.isNotEmpty(pk)) {
			Vector childernarr = null;
			for (int i = 0; i < arrs.size(); i++) {
				childernarr = (Vector) arrs.get(i);
				if (pk.equals(childernarr.get(2))) {
					return (String) childernarr.get(1);
				}
			}
			return null;
		} else {
			return null;
		}
	}

	/**
	 * 通过单个数字 生成一个从0 开始数的数组 适用于 出库单 切换工号生成表体数据
	 */
	public static int[] generateArrByAmount(int amount) {
		// 新建一个长度为amount的数组
		int[] resultArr = new int[amount];
		// 默认传进来的数量大于0
		if (CSICCommonUtils.isNotEmpty(amount)) {
			// 循环对其赋值
			for (int i = 0; i < resultArr.length; i++) {
				resultArr[i] = i;
			}
		} else {
			ExceptionUtils.wrappBusinessException("表体加载失败");
		}
		return resultArr;
	}
//
//	/**
//	 * 将同类型的多个vo中按照某几个相同字段进行合并，将某个数值字段相加 适用于入库单to台账！！！ 后期可优化成通用方法
//	 * 
//	 * 此处将入库单表体 同库位 同物料的 数据进行合并
//	 * 
//	 * @param aggstandingbookvos
//	 * @return
//	 */
//	public static AggCrmstockinVO combineVOS(AggCrmstockinVO aggstockinvo) {
//
//		StockindetailVO[] stockinbvos = null;
//		List<StockindetailVO> stockinbvolist = new ArrayList<StockindetailVO>();
//		// 实收数量初始化为0;
//		UFDouble realityputaway = new UFDouble(0);
//		List<StockindetailVO> resultlist = new ArrayList<StockindetailVO>();
//
//		// 克隆一个新的入库单聚合vo
//		AggCrmstockinVO clonestockinvo = (AggCrmstockinVO) deepClone(aggstockinvo);
//
//		if (CrmCommonUtils.isNotEmpty(clonestockinvo)) {
//			// 得到所有的表体数据
//			stockinbvos = (StockindetailVO[]) aggstockinvo.getChildrenVO();
//			// 将表体数组转换为对应集合
//			stockinbvolist = Arrays.asList(stockinbvos);
//
//			// 进行分组<库位，对应的多个vo>，将相同库位的数据先分成一组
//			Map<String, List<StockindetailVO>> map = group(stockinbvolist,
//					new GroupBy<String>() {
//						@Override
//						public String groupby(Object obj) {
//							StockindetailVO stockinbvo = (StockindetailVO) obj;
//							return stockinbvo.getStoragelocation();// 根据库位分组
//						}
//					});
//
//			Iterator<Map.Entry<String, List<StockindetailVO>>> it1 = map
//					.entrySet().iterator();
//			// 遍历得到的按照相同库位分组好的map
//			while (it1.hasNext()) {
//				stockinbvolist = it1.next().getValue();
//				// 在对每一组库位相同的数据，对物料进行分组<物料，对应的多个vo>，将相同物料的数据再分成一组
//				Map<String, List<StockindetailVO>> materialMap = group(
//						stockinbvolist, new GroupBy<String>() {
//							@Override
//							public String groupby(Object obj) {
//								StockindetailVO stockinbvo = (StockindetailVO) obj;
//								return stockinbvo.getMaterialcode();// 根据物料分组
//							}
//						});
//
//				Iterator<Map.Entry<String, List<StockindetailVO>>> it2 = materialMap
//						.entrySet().iterator();
//				while (it2.hasNext()) {
//					stockinbvolist = it2.next().getValue();
//
//					if (stockinbvolist.size() == 1) {
//						resultlist.add(stockinbvolist.get(0));
//					} else {
//						for (StockindetailVO stockinbVO : stockinbvolist) {
//							// 累加实收数量
//							realityputaway = realityputaway.add(stockinbVO
//									.getRealityputaway());
//						}
//						stockinbvolist.get(0).setRealityputaway(realityputaway);
//						resultlist.add(stockinbvolist.get(0));
//						realityputaway = new UFDouble(0);// 实收数量初始化为0;
//					}
//				}
//			}
//		}
//		// 最终将合并好的表体vo设置到最新的聚合vo中并返回
//		clonestockinvo.setChildrenVO(resultlist
//				.toArray(new StockindetailVO[resultlist.size()]));
//		return clonestockinvo;
//	}

	/**
	 * 新增时所需的加锁操作
	 * 
	 * @param vos
	 * @throws BusinessException
	 */
	public static void insertlockOperate(SuperVO... vos)
			throws BusinessException {
		BizlockDataUtil.lockDataByBizlock(vos);
	}

	/**
	 * 修改时所需的加锁操作
	 * 
	 * @param vos
	 * @throws BusinessException
	 */
	public static void updatelockOperate(SuperVO... vos)
			throws BusinessException {
		BDPKLockUtil.lockSuperVO(vos);
		BizlockDataUtil.lockDataByBizlock(vos);
	}

	/**
	 * 删除时所需的加锁操作
	 * 
	 * @param vos
	 * @throws BusinessException
	 */
	public static void deletelockOperate(SuperVO... vos)
			throws BusinessException {
		BDPKLockUtil.lockSuperVO(vos);
	}

	/**
	 * 方法功能描述：将聚合VO生成［表头主键，表头VO］的Map
	 * 
	 * @param @param vos
	 * @param @return
	 * @return Map<String,E>
	 * @throws
	 */
	public static <T extends ISuperVO> Map<String, T> toPrimaryKeyHeadMap(
			SuperVO[] vos) {
		if (isEmpty(vos)) {
			return null;
		}
		Map<String, T> keyMap = new LinkedHashMap<String, T>();
		for (SuperVO vo : vos) {
			if (isEmpty(vo)) {
				continue;
			}
			String id = vo.getPrimaryKey();
			if (CSICCommonUtils.isEmpty(id)) {
				keyMap.put(id, (T) vo);
			}
		}
		return keyMap;
	}

	/**
	 * @param <T>
	 * @Title: getMaterialCache
	 * @Description: 得到所有物料的缓存
	 * @param @return Map<物料主键，物料名称>
	 * @param @throws BusinessException 参数
	 * @return Map<String,String> 返回类型
	 * @throws 由于船机项目物料参照重写的原因
	 *             目前单据上手动新增的物料参照中后台存的是物料表中的pk_source 但是由接口同步过来的数据直接是pk_material
	 */
	public static List<MaterialVO> isContainMaterial(String[] materialcode)
			throws BusinessException {
		SqlBuilder sql = new SqlBuilder();
		sql.append(" pk_material ", materialcode);
		sql.append(" or pk_source ", materialcode);
		sql.append(" and enablestate ", 2);// 物料为启用状态
		sql.append(" and dr ", 0);
		// def4中存放张立雄定义的物料启用标记，用于物料条码打印功能
		String[] names = new String[] { MaterialVO.PK_MATERIAL,
				MaterialVO.NAME, MaterialVO.CODE, MaterialVO.DEF4,
				MaterialVO.DEF6, MaterialVO.MATERIALSPEC,
				MaterialVO.PK_MEASDOC, MaterialVO.MATERIALTYPE };// materialtype
																	// 物料类型
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		List<MaterialVO> list = (List<MaterialVO>) queryBS.retrieveByClause(
				MaterialVO.class, sql.toString(), names);

		return list;
	}
	
	public static List<MaterialVO> queryMaterialByPk(String[] pk_material,String[] attr)
			throws BusinessException {
		SqlBuilder sql = new SqlBuilder();
		sql.append(" pk_material ", pk_material);
		sql.append(" or pk_source ", pk_material);
		sql.append(" and enablestate ", 2);// 物料为启用状态
		sql.append(" and dr ", 0);
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		List<MaterialVO> list = (List<MaterialVO>) queryBS.retrieveByClause(
				MaterialVO.class, sql.toString(), attr);

		return list;
	}

	/**
	 * 通过value获得map中的key
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList valueGetKey(Map map, String value) {
		Set set = map.entrySet();
		ArrayList arr = new ArrayList<>();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			if (entry.getValue().equals(value)) {
				String s = (String) entry.getKey();
				arr.add(s);
			}
		}
		return arr;
	}

	/**
	 * 将vos转换成指定字段值与pk值作为key的map
	 * 
	 * @param <T>
	 * @param voList
	 * @return Map<fieldValue,T>
	 */
	public static Map<String, String> toKeyVOMap(SuperVO[] vos, String field) {
		if (CSICCommonUtils.isEmpty(vos)) {
			return null;
		}
		Map<String, String> keyMap = new LinkedHashMap<String, String>();
		for (SuperVO t : vos) {
			if (MMValueCheck.isEmpty(t)) {
				continue;
			}
			ISuperVO vo = null;
			if (t instanceof ISuperVO) {
				vo = ISuperVO.class.cast(t);
			}
			if (MMValueCheck.isEmpty(vo)) {
				continue;
			}
			Object value = null;
			if (MMValueCheck.isNotEmpty(field)) {
				value = vo.getAttributeValue(field);
			} else {
				value = vo.getPrimaryKey();
			}
			if (MMValueCheck.isNotEmpty(value)) {
				keyMap.put(vo.getPrimaryKey(), (String) value);
			}
		}
		return keyMap;
	}

	/**
	 * 通过自定义档案信息得到主键 defdoc-档案详细信息的编码或名称 defdoclist-所属档案列表的编码或名称
	 * 
	 * @param materialid
	 * @return
	 * @throws BusinessException
	 */
	public static String queryDefdocPk(String defdoc, String defdoclist)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT pk_defdoc FROM bd_defdoc where ( name='" + defdoc
				+ "' or code='" + defdoc + "' ) ");
		sql.append(" and pk_defdoclist in ");
		sql.append(" (SELECT pk_defdoclist FROM bd_defdoclist where name='"
				+ defdoclist + "' or code='" + defdoclist + "') ");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过用户id查询当前用户的组织信息
	 * 
	 * */
	public static String queryPkorg(String pk_loginUser)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PK_ORG FROM SM_USER where  CUSERID='"
				+ pk_loginUser + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 查询寿命件数据库中的数据有多少条
	 * 
	 * */
	public static int queryLmCount() throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT COUNT(*) FROM  CRM_LIFELIMITS ");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return 0;
		return Integer.parseInt(result.toString());
	}

	/**
	 * 通过当前主键查询是否存在该条数据
	 * 
	 * */
	public static Object queryPkServicePlan(String pk_serviceplan)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT * FROM CRM_SERVICEPLAN where  pk_serviceplan='"
				+ pk_serviceplan + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());

		return CSICCommonUtils.isNotEmpty(result) ? result : null;
	}

	/**
	 * 通过传入的物料名称查询对应主键的pk值
	 * 
	 * */
	public static String queryPkByMaterialname(String materialname)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PK_MATERIAL FROM BD_MATERIAL_V WHERE NAME = '"
				+ materialname + "'");
		String pk_material = (String) queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());

		return CSICCommonUtils.isNotEmpty(pk_material) ? pk_material : null;
	}

	/**
	 * 通过船级社名字查询主键
	 * 
	 * */
	public static String queryPkshipclub(String name) throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PK_SHIPCLUB FROM CRM_SHIPCLUB where  NAME='" + name
				+ "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}
	
	/**
	 * 通过物料主键查询物料名称
	 * 
	 * */
	public static String queryNameByMaterial(String materialcode)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT NAME FROM BD_MATERIAL_V WHERE PK_MATERIAL ='"
				+ materialcode + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}
	/**
	 * 通过物料主键查询规格型号
	 * 
	 * */
	public static String queryModelByMaterial(String materialcode)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT MATERIALSPEC FROM BD_MATERIAL_V WHERE PK_MATERIAL ='"
				+ materialcode + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过工号主键查询工号编码
	 * 
	 * */
	public static String queryCodeByProjectno(String projectno)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PROJECTCODE FROM CRM_PROJECTNO WHERE PK_PROJECTNO ='"
				+ projectno + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过销售订单主键查询该单据的集团和组织
	 * 
	 * */
	public static String queryGroupByPksalesorder(String pk_salesorder)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append("SELECT PK_GROUP FROM CRM_SALESORDER WHERE PK_SALESORDER = '"
				+ pk_salesorder + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	public static String queryOrgByPksalesorder(String pk_salesorder)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append("SELECT PK_ORG FROM CRM_SALESORDER WHERE PK_SALESORDER = '"
				+ pk_salesorder + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过工号编码查询工号主键
	 * 
	 * */
	public static String queryPkByProjectcode(String projectcode)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PK_PROJECTNO FROM CRM_PROJECTNO WHERE PROJECTCODE ='"
				+ projectcode + "'");
		Object pk_projectno = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (pk_projectno == null)
			return "";
		return pk_projectno.toString();
	}

	/**
	 * 通过工号主键查询工号名称
	 * 
	 * */
	public static String queryNameByProjectcode(String projectno)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PROJECTCODE FROM CRM_PROJECTNO WHERE PK_PROJECTNO ='"
				+ projectno + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过工号名称查询工号主键
	 * 
	 * */
	public static String queryPKByProjectname(String projectname)
			throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PK_PROJECTNO FROM CRM_PROJECTNO WHERE PROJECTNAME ='"
				+ projectname + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过船型名字查询主键
	 * 
	 * */
	public static String queryPkshiptype(String name) throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PK_SHIPTYPE FROM CRM_SHIPTYPE where  NAME='" + name
				+ "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过部门名字查询主键
	 * 
	 * */
	public static String queryPkdept(String name) throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PK_DEPT FROM ORG_DEPT where  NAME='" + name + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过用户主键查名称
	 * 
	 * */
	public static String queryCustNameByPK(String pk) throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT name FROM BD_CUSTOMER where  pk_customer='" + pk
				+ "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过用戶名字查询主键
	 * 
	 * */
	public static String queryPkcustomer(String name) throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PK_customer FROM BD_CUSTOMER where  NAME='" + name
				+ "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}

	/**
	 * 通过船东名字查询主键
	 * 
	 * */
	public static String queryPkshipowner(String name) throws BusinessException {
		IUAPQueryBS queryBS = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT PK_SHIPOWNER FROM CRM_SHIPOWNER where  NAME='"
				+ name + "'");
		Object result = queryBS.executeQuery(sql.toString(),
				new ColumnProcessor());
		if (result == null)
			return "";
		return result.toString();
	}


	/**
	 * 将string数组转化为逗号隔开的字符串
	 * 
	 * @param ids
	 * @return
	 */
	public static String StringarrayToString(String[] ids) {
		StringBuffer idsStr = new StringBuffer();
		for (int i = 0; i < ids.length; i++) {
			if (i > 0) {
				idsStr.append(",");
			}
			idsStr.append(ids[i]);
		}
		return idsStr.toString();
	}

	/**
	 * 将string数组转化为sql的in条件（逗号隔开的字符串）
	 * 
	 * @param ids
	 * @return
	 */
	public static String StringarrayToInsql(String[] ids) {
		StringBuffer idsStr = new StringBuffer();
		for (int i = 0; i < ids.length; i++) {
			if (i > 0) {
				idsStr.append(",");
			}
			idsStr.append("'").append(ids[i]).append("'");
		}
		return idsStr.toString();
	}

	public static boolean isNotEmpty(Object value) {
		return !CSICCommonUtils.isEmpty(value);
	}

	/**
	 * 检查参数是否为空。
	 * 
	 * @return boolean 如果被检查值为null，返回true。
	 *         如果value的类型为String，并且value.length()为0，返回true。
	 *         如果value的类型为Object[]，并且value.length为0，返回true。
	 *         如果value的类型为Collection，并且value.size()为0，返回true。
	 *         如果value的类型为Dictionary，并且value.size()为0，返回true。 否则返回false。
	 * 
	 * @param value
	 *            被检查值。
	 */
	public static boolean isEmpty(Object value) {
		if (value == null) {
			return true;
		}
		if (value instanceof String && ((String) value).trim().length() <= 0) {
			return true;
		}
		if (value instanceof Object[] && ((Object[]) value).length <= 0) {
			return true;
		}
		if (value instanceof Collection && ((Collection<?>) value).size() <= 0) {
			return true;
		}
		if (value instanceof Map && ((Map<?, ?>) value).size() <= 0) {
			return true;
		}
		if (value instanceof StringBuilder) {
			return value.toString().trim().length() <= 0;
		}
		if (value instanceof StringBuffer) {
			return value.toString().trim().length() <= 0;
		}
		if (value instanceof SqlBuilder) {
			return value.toString().trim().length() <= 0;
		}
		return false;
	}

	/**
	 * 方法功能描述：将Object数组转换为需要类型的数组
	 * 
	 * @param objs
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T[] convertArrayType(Object[] objs) {
		if (isEmpty(objs)) {
			return null;
		}
		T[] convertArray = (T[]) Array.newInstance(objs[0].getClass(),
				objs.length);
		System.arraycopy(objs, 0, convertArray, 0, objs.length);
		return convertArray;
	}

	/**
	 * 根据不同类型转换成数组
	 * 
	 * @param obj
	 * @return
	 */
	public static <T> T[] getObjs(T obj) {
		if (isEmpty(obj)) {
			return null;
		}
		T[] objs = null;
		if (obj.getClass().isArray()) {
			objs = (T[]) obj;
		} else {
			objs[0] = obj;
		}
		return objs;
	}

	/**
	 * 方法功能描述：单对象转换为数组，如果本身不是数组则返回size=1的数组
	 * 
	 * @param @param obj
	 * @param @return
	 * @return T[]
	 * @throws
	 */
	public static <T> T[] convertToArray(T obj) {
		T[] array = getObjs(obj);
		if (isEmpty(array)) {
			return null;
		}
		T[] convertArray = (T[]) Array.newInstance(array[0].getClass(),
				array.length);
		System.arraycopy(array, 0, convertArray, 0, array.length);
		return convertArray;
	}

	/**
	 * 是否基于管控模式管理
	 * 
	 * @param clz
	 * @return
	 */
	public static boolean isManagerMode(Class<?> className) {
		try {
			IBean ibean = MDBaseQueryFacade.getInstance()
					.getBeanByFullClassName(className.getName());
			BDModeSelectedVO vo = BDModeManager.getInstance()
					.getBDModeSelectedVOByMDClassID(ibean.getID());
			return isNotEmpty(vo);
		} catch (MetaDataException e) {
			Logger.warn("获取是否有管控模式发生异常，作为没有管控模式处理", e);
		}
		return false;
	}

	/**
	 * 构造一个类型的实例
	 * 
	 * @param voclass
	 * @return
	 */
	public static <T> T construct(Class<T> voclass) {
		T instance = null;
		try {
			instance = voclass.newInstance();
		} catch (InstantiationException ex) {
			ExceptionUtils.wrappException(ex);
		} catch (IllegalAccessException ex) {
			ExceptionUtils.wrappException(ex);
		}
		return instance;
	}

	/**
	 * 根据全路径构造一个类
	 * 
	 * @param voClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T newInstance(String voClass) {
		T instance = null;
		try {
			instance = (T) Class.forName(voClass);
		} catch (ClassNotFoundException e) {
			ExceptionUtils.wrappBusinessException("找不到类型名为：" + voClass
					+ " 的类型！");
		}
		return instance;
	}

	/**
	 * 深度克隆
	 * 
	 * @param obj
	 *            要克隆的对象
	 * 
	 * @return 克隆出来的新对象
	 */
	public static Object deepClone(Serializable obj) {
		byte[] bytes = serialize(obj);
		Object value = deserialize(bytes);
		return value;
	}

	public static Object deserialize(byte[] bytes) {
		if (bytes == null) {
			throw new IllegalArgumentException("The byte[] must not be null");
		}
		Object value = null;
		ObjectInputStream in = null;
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		try {
			in = new ObjectInputStream(bais);
			value = in.readObject();
		} catch (ClassNotFoundException e) {
			ExceptionUtils.wrappException(e);
		} catch (IOException e) {
			ExceptionUtils.wrappException(e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				ExceptionUtils.wrappException(e);
			}
		}
		return value;
	}

	public static byte[] serialize(Serializable obj) {
		if (obj == null) {
			throw new IllegalArgumentException(
					"The Serializable must not be null");
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(baos);
			out.writeObject(obj);
		} catch (IOException e) {
			ExceptionUtils.wrappException(e);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				ExceptionUtils.wrappException(e);
			}
		}
		return baos.toByteArray();
	}

	/**
	 * 方法功能描述：将聚合VO生成［表头主键，表头VO］的Map
	 * 
	 * @param @param vos
	 * @param @return
	 * @return Map<String,E>
	 * @throws
	 */
	public static <T extends ISuperVO> Map<String, T> toPrimaryKeyHeadMap(
			IBill[] vos) {
		if (isEmpty(vos)) {
			return null;
		}
		Map<String, T> keyMap = new LinkedHashMap<String, T>();
		for (IBill vo : vos) {
			if (isEmpty(vo) || isEmpty(vo.getParent())) {
				continue;
			}
			String id = vo.getPrimaryKey();
			if (isNotEmpty(id)) {
				keyMap.put(id, (T) vo.getParent());
			}
		}
		return keyMap;
	}

	/**
	 * 方法功能描述：将聚合VO生成［表体主键，表体VO］的Map
	 * 
	 * @param @param vos
	 * @param @return
	 * @return Map<String,E>
	 * @throws
	 */
	public static <K, E extends ISuperVO> Map<K, E> toPrimaryKeyItemMap(
			AbstractBill[] vos) {
		return toFieldItemMap(vos, null);
	}

	/**
	 * 方法功能描述：将聚合VO生成［表体指定字段，表体VO］的Map
	 * 
	 * @param @param vos
	 * @param @return
	 * @return Map<String,E>
	 * @throws
	 */
	public static <K, E extends ISuperVO> Map<K, E> toFieldItemMap(
			AbstractBill[] vos, String field) {
		return toFieldItemMap(vos, field, null);
	}

	/**
	 * 方法功能描述：将聚合VO生成［表体主键，表体VO］的Map
	 * 
	 * @param @param vos
	 * @param @param className
	 * @param @return
	 * @return Map<String,E>
	 * @throws
	 */
	public static <K, E extends ISuperVO> Map<K, E> toFieldItemMap(
			AbstractBill[] vos, String field, Class<E> clazz) {
		if (isEmpty(vos)) {
			return null;
		}
		Map<K, E> keyMap = new LinkedHashMap<K, E>();
		for (AbstractBill vo : vos) {
			if (isEmpty(vo)) {
				continue;
			}
			ISuperVO[] bvos = null;
			if (isNotEmpty(clazz)) {
				bvos = vo.getChildren(clazz);
			} else {
				bvos = (ISuperVO[]) vo.getChildrenVO();
			}
			if (isEmpty(bvos)) {
				continue;
			}
			for (ISuperVO bvo : bvos) {
				if (isEmpty(bvo)) {
					continue;
				}
				Object value = null;
				if (isNotEmpty(field)) {
					value = bvo.getAttributeValue(field);
				} else {
					value = bvo.getPrimaryKey();
				}
				if (isNotEmpty(value)) {
					keyMap.put((K) value, (E) bvo);
				}
			}
		}
		return keyMap;
	}

	/**
	 * 获得聚合vo的主表vos
	 * 
	 * @param @param aggvos
	 * @param @return
	 * @return SuperVO[]
	 * @throws
	 */
	public static <E extends ISuperVO> E[] toParentVOs(IBill[] vos) {
		if (isEmpty(vos)) {
			return null;
		}
		List<E> voList = new ArrayList<E>();
		for (IBill vo : vos) {
			if (isEmpty(vo) || isEmpty(vo.getParent())) {
				continue;
			}
			voList.add((E) vo.getParent());
		}
		return convertArrayType(voList.toArray());
	}

	/**
	 * 获得聚合vo的子表vos
	 * 
	 * @param @param aggvos
	 * @param @return
	 * @return SuperVO[]
	 * @throws
	 */
	public static <E extends ISuperVO> E[] toChildrenVOs(AbstractBill[] vos) {
		return toChildrenVOs(vos, null);
	}

	/**
	 * 获得聚合vo的子表vos
	 * 
	 * @param @param aggvos
	 * @param @return
	 * @return SuperVO[]
	 * @throws
	 */
	public static <E extends ISuperVO> E[] toChildrenVOs(AbstractBill[] vos,
			Class<E> clazz) {
		if (isEmpty(vos)) {
			return null;
		}
		List<E> bvoList = new ArrayList<E>();
		for (AbstractBill vo : vos) {
			if (isEmpty(vo)) {
				continue;
			}
			ISuperVO[] bvos = null;
			if (isNotEmpty(clazz)) {
				bvos = vo.getChildren(clazz);
			} else {
				bvos = (ISuperVO[]) vo.getChildrenVO();
			}
			if (isEmpty(bvos)) {
				continue;
			}
			for (ISuperVO bvo : bvos) {
				if (isEmpty(bvo)) {
					continue;
				}
				bvoList.add((E) bvo);
			}
		}
		return convertArrayType(bvoList.toArray());
	}

	/**
	 * 根据VO获取pks集合
	 * 
	 * @param vos
	 * @param feildName
	 * @return
	 */
	public static <T> String[] getPrimaryKeys(T[] vos) {
		return getFieldValues(vos, null);
	}

	/**
	 * 根据VO获取某项数据集合
	 * 
	 * @param vos
	 * @param feildName
	 * @return
	 */
	public static <T> String[] getFieldValues(T[] vos, String field) {
		Map<Object, T> keyMap = toKeyVOMap(vos, field);
		return isNotEmpty(keyMap) ? keyMap.keySet().toArray(new String[0])
				: null;
	}

	/**
	 * 根据VO获取某项数据集合
	 * 
	 * @param vos
	 * @param feildName
	 * @return
	 */
	public static <T> Object[] getAttributeValues(T[] vos, String field) {
		if (isEmpty(vos)) {
			return null;
		}
		List<Object> objs = new ArrayList<Object>();
		for (T t : vos) {
			if (isEmpty(t)) {
				continue;
			}
			ISuperVO vo = null;
			if (t instanceof ISuperVO) {
				vo = ISuperVO.class.cast(t);
			} else if (t instanceof AbstractBill) {
				vo = AbstractBill.class.cast(t).getParent();
			} else {
				ExceptionUtils
						.wrappBusinessException("目前只支持SuperVO和AbstractBill结构的数据");
			}
			if (isEmpty(vo)) {
				continue;
			}
			Object value = null;
			if (isNotEmpty(field)) {
				value = vo.getAttributeValue(field);
			} else {
				value = vo.getPrimaryKey();
			}
			if (isNotEmpty(value)) {
				objs.add(value);
			}
		}
		return isNotEmpty(objs) ? objs.toArray() : null;
	}

	/**
	 * 将vos转换成PK值为key的map
	 * 
	 * 
	 * @param <T>
	 * @param voList
	 * @return Map<fieldValue,T>
	 */
	public static <K, T> Map<K, T> toPrimaryKeyMap(T[] vos) {
		return toKeyVOMap(vos, null);
	}

	/**
	 * 将vos转换成字段值或PK值为key的map
	 * 
	 * 
	 * @param <T>
	 * @param voList
	 * @return Map<fieldValue,T>
	 */
	public static <K, T> Map<K, T> toKeyVOMap(T[] vos, String field) {
		if (isEmpty(vos)) {
			return null;
		}
		Map<K, T> keyMap = new LinkedHashMap<K, T>();
		for (T t : vos) {
			if (isEmpty(t)) {
				continue;
			}
			ISuperVO vo = null;
			if (t instanceof ISuperVO) {
				vo = ISuperVO.class.cast(t);
			} else if (t instanceof AbstractBill) {
				vo = AbstractBill.class.cast(t).getParent();
			} else {
				ExceptionUtils
						.wrappBusinessException("目前只支持SuperVO和AbstractBill结构的数据");
			}
			if (isEmpty(vo)) {
				continue;
			}
			Object value = null;
			if (isNotEmpty(field)) {
				value = vo.getAttributeValue(field);
			} else {
				value = vo.getPrimaryKey();
			}
			if (isNotEmpty(value)) {
				keyMap.put((K) value, (T) t);
			}
		}
		return keyMap;
	}

	/**
	 * 将vos转换成指定字段值为key的map
	 * 
	 * @param <T>
	 * @param voList
	 * @param field
	 *            主表字段
	 * 
	 * @return Map<fieldValue,List<T>>
	 */
	public static <K, T> Map<K, List<T>> toKeyListVOMap(T[] vos, String field) {
		return toKeyListVOMap(vos, new String[] { field });
	}

	/**
	 * 将voList转换成指定字段值为key的map
	 * 
	 * @param <T>
	 * @param voList
	 * @param field
	 *            主表字段
	 * 
	 * @return Map<fieldValue,List<T>>
	 */
	public static <K, T> Map<K, List<T>> toKeyListVOMap(T[] vos, String[] fields) {
		if (isEmpty(vos)) {
			return null;
		}
		Map<K, List<T>> keyMap = new LinkedHashMap<K, List<T>>();
		for (T t : vos) {
			if (isEmpty(t)) {
				continue;
			}
			ISuperVO vo = null;
			if (t instanceof ISuperVO) {
				vo = ISuperVO.class.cast(t);
			} else if (t instanceof AbstractBill) {
				vo = AbstractBill.class.cast(t).getParent();
			} else {
				ExceptionUtils
						.wrappBusinessException("目前只支持SuperVO和AbstractBill结构的数据");
			}
			if (isEmpty(vo)) {
				continue;
			}
			StringBuffer buffer = new StringBuffer("");
			for (String field : fields) {
				Object value = vo.getAttributeValue(field);
				buffer.append(isNotEmpty(value) ? value : "");
			}
			if (isEmpty(buffer)) {
				continue;
			}
			String key = buffer.toString().trim();
			if (keyMap.containsKey(key)) {
				keyMap.get(key).add((T) t);
			} else {
				List<T> listVO = new ArrayList<T>();
				listVO.add((T) t);
				keyMap.put((K) key, listVO);
			}
		}
		return keyMap;
	}

	/**
	 * 根据aggVO获取子表pks集合
	 * 
	 * @param vos
	 * @param feildName
	 * @return
	 */
	public static <T> String[] getItmePrimaryKeys(AbstractBill[] vos) {
		return getItmePrimaryKeys(vos, null);
	}

	/**
	 * 根据aggVO获取子表pks集合
	 * 
	 * @param vos
	 * @param feildName
	 * @return
	 */
	public static <T> String[] getItmePrimaryKeys(AbstractBill[] vos,
			Class<? extends ISuperVO> clazz) {
		Map<Object, ?> keyMpa = toFieldItemMap(vos, null, clazz);
		return isNotEmpty(keyMpa) ? keyMpa.keySet().toArray(new String[0])
				: null;
	}

	/**
	 * 将vos转换成指定字段值为key的map
	 * 
	 * @param <T>
	 * @param voList
	 * @param field
	 *            主表字段
	 * 
	 * @return Map<fieldValue,List<T>>
	 */
	public static <K, T extends AbstractBill> Map<K, List<T>> toKeyItemMap(
			T[] vos, String[] fields) {
		return toKeyItemMap(vos, fields, null);
	}

	/**
	 * 将vos转换成指定字段值为key的map
	 * 
	 * @param <T>
	 * @param voList
	 * @param field
	 *            主表字段
	 * 
	 * @return Map<fieldValue,List<T>>
	 */
	public static <K, T extends AbstractBill> Map<K, List<T>> toKeyItemMap(
			T[] vos, String[] fields, Class<? extends ISuperVO> clazz) {
		if (isEmpty(vos) || isEmpty(fields)) {
			return null;
		}
		Map<K, List<T>> keyMap = new LinkedHashMap<K, List<T>>();
		for (AbstractBill t : vos) {
			if (isEmpty(t)) {
				continue;
			}
			ISuperVO[] bvos = null;
			if (isNotEmpty(clazz)) {
				bvos = t.getChildren(clazz);
			} else {
				bvos = (ISuperVO[]) t.getChildrenVO();
			}
			if (isEmpty(bvos)) {
				continue;
			}
			for (ISuperVO bvo : bvos) {
				if (isEmpty(bvo)) {
					continue;
				}
				StringBuffer buffer = new StringBuffer("");
				for (String field : fields) {
					Object value = bvo.getAttributeValue(field);
					buffer.append(isNotEmpty(value) ? value : "");
				}
				if (isEmpty(buffer)) {
					continue;
				}
				String key = buffer.toString().trim();
				if (keyMap.containsKey(key)) {
					keyMap.get(key).add((T) t);
				} else {
					List<T> listVO = new ArrayList<T>();
					listVO.add((T) t);
					keyMap.put((K) key, listVO);
				}
			}
		}
		return keyMap;
	}

	/**
	 * 将aggvos转换成表体指定字段值的集合
	 * 
	 * @param @param vos
	 * @param @param field
	 * @param @param distinct
	 * @param @return
	 * @return String[]
	 * @throws
	 */
	public static <T extends AbstractBill> String[] getItemStringValues(
			T[] vos, String field, boolean distinct) {
		return getItemStringValues(vos, field, null, distinct);
	}

	/**
	 * 将aggvos转换成表体指定字段值的集合
	 * 
	 * @param @param vos
	 * @param @param field
	 * @param @param distinct
	 * @param @return
	 * @return String[]
	 * @throws
	 */
	public static <T extends AbstractBill> String[] getItemStringValues(
			T[] vos, String field, Class<? extends ISuperVO> clazz,
			boolean distinct) {
		Object[] objs = getItemObjectValues(vos, field, clazz, distinct);
		return convertArrayType(objs);
	}

	/**
	 * 将aggvos转换成表体指定字段值的集合
	 * 
	 * @param <T>
	 * @param voList
	 * @param field
	 *            主表字段
	 * 
	 * @return Map<fieldValue,List<T>>
	 */
	public static <T extends AbstractBill> Object[] getItemObjectValues(
			T[] vos, String field, boolean distinct) {
		return getItemObjectValues(vos, field, null, distinct);
	}

	/**
	 * 将aggvos转换成表体指定字段值的集合
	 * 
	 * @param @param vos
	 * @param @param field
	 * @param @param clazz
	 * @param @param distinct
	 * @param @return
	 * @return Object[]
	 */
	public static <T extends AbstractBill> Object[] getItemObjectValues(
			T[] vos, String field, Class<? extends ISuperVO> clazz,
			boolean distinct) {
		if (isEmpty(vos)) {
			return null;
		}
		List<Object> objs = new ArrayList<Object>();
		for (AbstractBill t : vos) {
			if (isEmpty(t)) {
				continue;
			}
			ISuperVO[] bvos = null;
			if (isNotEmpty(clazz)) {
				bvos = t.getChildren(clazz);
			} else {
				bvos = (ISuperVO[]) t.getChildrenVO();
			}
			if (isEmpty(bvos)) {
				continue;
			}
			for (ISuperVO bvo : bvos) {
				if (isEmpty(bvo)) {
					continue;
				}
				Object value = null;
				if (isNotEmpty(field)) {
					value = bvo.getAttributeValue(field);
				} else {
					value = bvo.getPrimaryKey();
				}
				if (isNotEmpty(value)) {
					if (distinct) {
						if (objs.contains(value)) {
							continue;
						}
						objs.add(value);
					} else {
						objs.add(value);
					}
				}
			}
		}
		return isNotEmpty(objs) ? objs.toArray() : null;
	}

	/**
	 * 根据key，升序、降序排序
	 * 
	 * @param @param asc
	 * @param @param map
	 * @param @return
	 * @return Map<K,V>
	 * @throws
	 */
//	public static <K, V> Map<K, V> keyComparator(final boolean asc,
//			Map<K, V> map) {
//		Map<K, V> treeMap = new TreeMap<K, V>(new Comparator<K>() {
//			@Override
//			public int compare(K obj1, K obj2) {
//				String a = obj1.toString();
//				String b = obj2.toString();
//				if (obj1 instanceof String) {
//					if (NumberUtils.isNumber(a) && NumberUtils.isNumber(b)) {
//						if (asc) {
//							return new BigDecimal(a)
//									.compareTo(new BigDecimal(b));
//						}
//						return new BigDecimal(b).compareTo(new BigDecimal(a));
//					} else {
//						if (asc) {
//							return a.compareTo(b);
//						}
//						return b.compareTo(a);
//					}
//				} else {
//					if (asc) {
//						return CompareToBuilder.reflectionCompare(obj1, obj2);
//					}
//					return CompareToBuilder.reflectionCompare(obj2, obj1);
//				}
//			}
//		});
//		treeMap.putAll(map);
//		return treeMap;
//	}

	/**
	 * 分组依据接口，用于集合分组时，获取分组字段的条件
	 */
	public interface GroupBy<T> {
		T groupby(Object obj);
	}

	/**
	 * @Title: group
	 * @Description:
	 * @param @param colls 集合抽象对象
	 * @param @param gb 接口对象
	 * @param @return 参数
	 * @return Map<T,List<D>> 返回类型
	 * @throws
	 */
	public static final <K, V> Map<K, List<V>> group(Collection<V> colls,
			GroupBy<K> gb) {
		if (isEmpty(colls)) {
			return null;
		}
		if (isEmpty(gb)) {
			return null;
		}
		Iterator<V> iter = colls.iterator();
		Map<K, List<V>> map = new HashMap<K, List<V>>();
		while (iter.hasNext()) {
			V d = iter.next();
			K t = gb.groupby(d);
			if (map.containsKey(t)) {
				map.get(t).add(d);
			} else {
				List<V> list = new ArrayList<V>();
				list.add(d);
				map.put(t, list);
			}
		}
		return map;
	}

}
