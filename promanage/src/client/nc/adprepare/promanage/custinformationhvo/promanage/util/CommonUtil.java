
package nc.adprepare.promanage.custinformationhvo.promanage.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import nc.itf.adprepare.promanage.ICustinformationhvoMaintain;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.pubitf.org.cache.IOrgUnitPubService_C;
import nc.vo.adprepare.promanage.CustinformationHVOConst;
import nc.vo.org.OrgVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nccloud.base.exception.ExceptionUtils;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.SessionContext;
import nccloud.pubitf.riart.pflow.ICloudScriptPFlowService;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.pub.SqlBuilder;

public class CommonUtil {

	private static ICustinformationhvoMaintain maintain = null;

	private static IMDPersistenceQueryService persistenceQueryService = null;

	private static ICloudScriptPFlowService cloudScriptPFlowService = null;

	/**
	 * 单据类型编码
	 *
	 * @return
	 */
	public static String getBillTypeCode() {
		return CustinformationHVOConst.CONST_BILLTYPE_COST;
	}

	/**
	 * 获取当前业务时间
	 *
	 * @return
	 */
	public static UFDate getBusiDate() {
		return new UFDate(SessionContext.getInstance().getClientInfo().getBizDateTime());
	}

	/**
	 * 获取当前业务日期时间
	 *
	 * @return
	 */
	public static UFDateTime getBusiDateTime() {
		return new UFDateTime(SessionContext.getInstance().getClientInfo().getBizDateTime());
	}

	/**
	 * 平台脚本服务类
	 *
	 * @return
	 */
	public static synchronized ICloudScriptPFlowService getCloudScriptPFlowService() {
		if (CommonUtil.cloudScriptPFlowService == null) {
			CommonUtil.cloudScriptPFlowService = ServiceLocator.find(ICloudScriptPFlowService.class);
		}
		return CommonUtil.cloudScriptPFlowService;
	}

	/**
	 * 查询财务组织所在集团
	 *
	 * @param pk_org
	 * @return
	 * @throws BusinessException
	 */
	public static String getGroupByOrg(String pk_org) throws BusinessException {
		IOrgUnitPubService_C orgUnitQryService = ServiceLocator.find(IOrgUnitPubService_C.class);
		OrgVO[] orgVOs = orgUnitQryService.getOrgs(new String[] { pk_org }, new String[] { OrgVO.PK_GROUP });
		if ((orgVOs == null) || (orgVOs.length <= 0)) {
			return null;
		}
		return (String) orgVOs[0].getAttributeValue(OrgVO.PK_GROUP);
	}

	/**
	 * 查询财务组织最新版本
	 *
	 * @param pk_org
	 * @return
	 */
	public static String getOrgVByOrg(String pk_org) throws BusinessException {
		IOrgUnitPubService_C orgUnitQryService = ServiceLocator.find(IOrgUnitPubService_C.class);
		HashMap<String, String> org_vs = orgUnitQryService.getNewVIDSByOrgIDS(new String[] { pk_org });
		if ((org_vs == null) || (org_vs.size() <= 0)) {
			return null;
		}
		return org_vs.get(pk_org);
	}

	/**
	 * 管理服务
	 *
	 * @return
	 */
	public static synchronized ICustinformationhvoMaintain getFinancingcostMaintainService() {
		if (CommonUtil.maintain == null) {
			CommonUtil.maintain = ServiceLocator.find(ICustinformationhvoMaintain.class);
		}
		return CommonUtil.maintain;
	}

	/**
	 * 元数据查询服务
	 *
	 * @return
	 */
	public static synchronized IMDPersistenceQueryService getMDPersistenceQueryService() {
		if (CommonUtil.persistenceQueryService == null) {
			CommonUtil.persistenceQueryService = ServiceLocator.find(IMDPersistenceQueryService.class);
		}
		return CommonUtil.persistenceQueryService;
	}

	/**
	 * 后台VO赋值前台的时间戳
	 *
	 * @param pk_org
	 * @return
	 */
	public static void setBillsTs(Map<String, String> pkMapTs, AbstractBill[] bills) {
		if (pkMapTs == null) {
			return;
		}
		for (AbstractBill bill : bills) {
			String ts = pkMapTs.get(bill.getParent().getPrimaryKey());
			if ((ts == null) || ts.equals("")) {
				break;
			}
			bill.getParent().setAttributeValue(CustinformationHVOConst.CONST_TS, ts);
		}
	}

	public static boolean isNotEmpty(Object value) {
		return !CommonUtil.isEmpty(value);
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
	 * @param value 被检查值。
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

}
