package nc.vo.adprepare.procomsheet;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加累的描述信息
 * </p>
 *  创建日期:2020-5-4
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class ProjectstartHVO extends SuperVO {
	
/**
*工程开工单主表主键
*/
public java.lang.String pk_projectstart_h;
/**
*项目负责人
*/
public java.lang.String projectdutyperson;
/**
*工程名称
*/
public java.lang.String projectname;
/**
*客户名称
*/
public java.lang.String custname;
/**
*电话
*/
public java.lang.String telnumber;
/**
*开工日期
*/
public java.lang.String startdate;
/**
*预计完工日期
*/
public java.lang.String estimatedate;
/**
*工程地点
*/
public java.lang.String projectplace;
/**
*工期
*/
public java.lang.String projectperiod;
/**
*工程总价
*/
public nc.vo.pub.lang.UFDouble projectprice;
/**
*工程合同
*/
public Boolean projectcontract;
/**
*工程预付款情况
*/
public java.lang.String projectpayment;
/**
*施工方案
*/
public Boolean constractionplan;
/**
*预缴
*/
public Boolean advancepayment;
/**
*计税方式
*/
public java.lang.String taxmethod;
/**
*税率
*/
public java.lang.String tax;
/**
*征税率
*/
public java.lang.String taxrate;
/**
*集团
*/
public java.lang.String pk_group;
/**
*组织
*/
public java.lang.String pk_org;
/**
*组织版本
*/
public java.lang.String pk_org_v;
/**
*单据日期
*/
public UFDate dbilldate;
/**
*单据状态
*/
public java.lang.Integer fstatusflag;
/**
*单据号
*/
public java.lang.String vbillcode;
/**
*业务类型
*/
public java.lang.String pk_busitype;
/**
*单据类型
*/
public java.lang.String pk_billtypeid;
/**
*单据类型编码
*/
public java.lang.String billtype;
/**
*交易类型编码
*/
public java.lang.String transtypecode;
/**
*交易类型
*/
public java.lang.String pk_transtype;
/**
*制单人
*/
public java.lang.String billmaker;
/**
*制单时间
*/
public UFDate maketime;
/**
*创建人
*/
public java.lang.String creator;
/**
*创建时间
*/
public UFDateTime creationtime;
/**
*修改人
*/
public java.lang.String modifier;
/**
*修改时间
*/
public UFDateTime modifiedtime;
/**
*审批人
*/
public java.lang.String approver;
/**
*审批状态
*/
public java.lang.Integer approvestatus;
/**
*审批批语
*/
public java.lang.String approvenote;
/**
*审批时间
*/
public UFDateTime approvedate;
/**
*备注
*/
public java.lang.String vnote;
/**
*来源单据类型
*/
public java.lang.String srcbilltype;
/**
*来源单据id
*/
public java.lang.String srcbillid;
/**
*来源单据号
*/
public java.lang.String srccode;
/**
*来源单据主表id
*/
public java.lang.String srcid;
/**
*来源单据子表id
*/
public java.lang.String srcbid;
/**
*来源单据行号
*/
public java.lang.String srcrowno;
/**
*来源交易类型
*/
public java.lang.String srctrantype;
/**
*源头单据类型
*/
public java.lang.String vfirsttype;
/**
*源头单据号
*/
public java.lang.String vfirstcode;
/**
*源头单据主表id
*/
public java.lang.String vfirstid;
/**
*源头单据子表id
*/
public java.lang.String vfirstbid;
/**
*源头单据行号
*/
public java.lang.String vfirstrowno;
/**
*源头交易类型
*/
public java.lang.String vfirsttrantype;
/**
*自定义项0
*/
public java.lang.String def0;
/**
*自定义项1
*/
public java.lang.String def1;
/**
*自定义项2
*/
public java.lang.String def2;
/**
*自定义项3
*/
public java.lang.String def3;
/**
*自定义项4
*/
public java.lang.String def4;
/**
*自定义项5
*/
public java.lang.String def5;
/**
*自定义项6
*/
public java.lang.String def6;
/**
*自定义项7
*/
public java.lang.String def7;
/**
*自定义项8
*/
public java.lang.String def8;
/**
*自定义项10
*/
public java.lang.String def10;
/**
*自定义项11
*/
public java.lang.String def11;
/**
*自定义项12
*/
public java.lang.String def12;
/**
*自定义项13
*/
public java.lang.String def13;
/**
*自定义项14
*/
public java.lang.String def14;
/**
*自定义项15
*/
public java.lang.String def15;
/**
*自定义项16
*/
public java.lang.String def16;
/**
*自定义项17
*/
public java.lang.String def17;
/**
*自定义项18
*/
public java.lang.String def18;
/**
*自定义项19
*/
public java.lang.String def19;
/**
*自定义项20
*/
public java.lang.String def20;
/**
*自定义项21
*/
public java.lang.String def21;
/**
*自定义项22
*/
public java.lang.String def22;
/**
*自定义项23
*/
public java.lang.String def23;
/**
*自定义项24
*/
public java.lang.String def24;
/**
*自定义项25
*/
public java.lang.String def25;
/**
*自定义项26
*/
public java.lang.String def26;
/**
*自定义项27
*/
public java.lang.String def27;
/**
*自定义项28
*/
public java.lang.String def28;
/**
*自定义项29
*/
public java.lang.String def29;
/**
*自定义项30
*/
public java.lang.String def30;
/**
*自定义项31
*/
public java.lang.String def31;
/**
*自定义项32
*/
public java.lang.String def32;
/**
*自定义项33
*/
public java.lang.String def33;
/**
*自定义项34
*/
public java.lang.String def34;
/**
*自定义项35
*/
public java.lang.String def35;
/**
*自定义项36
*/
public java.lang.String def36;
/**
*自定义项37
*/
public java.lang.String def37;
/**
*自定义项38
*/
public java.lang.String def38;
/**
*自定义项39
*/
public java.lang.String def39;
/**
*自定义项40
*/
public java.lang.String def40;
/**
*自定义项41
*/
public java.lang.String def41;
/**
*自定义项42
*/
public java.lang.String def42;
/**
*自定义项43
*/
public java.lang.String def43;
/**
*自定义项44
*/
public java.lang.String def44;
/**
*自定义项45
*/
public java.lang.String def45;
/**
*自定义项46
*/
public java.lang.String def46;
/**
*自定义项47
*/
public java.lang.String def47;
/**
*自定义项48
*/
public java.lang.String def48;
/**
*自定义项49
*/
public java.lang.String def49;
/**
*自定义项50
*/
public java.lang.String def50;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_projectstart_h的Getter方法.属性名：工程开工单主表主键
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getPk_projectstart_h() {
return this.pk_projectstart_h;
} 

/**
* 属性pk_projectstart_h的Setter方法.属性名：工程开工单主表主键
* 创建日期:2020-5-4
* @param newPk_projectstart_h java.lang.String
*/
public void setPk_projectstart_h ( java.lang.String pk_projectstart_h) {
this.pk_projectstart_h=pk_projectstart_h;
} 
 
/**
* 属性 projectdutyperson的Getter方法.属性名：项目负责人
*  创建日期:2020-5-4
* @return nc.vo.bd.psn.PsndocVO
*/
public java.lang.String getProjectdutyperson() {
return this.projectdutyperson;
} 

/**
* 属性projectdutyperson的Setter方法.属性名：项目负责人
* 创建日期:2020-5-4
* @param newProjectdutyperson nc.vo.bd.psn.PsndocVO
*/
public void setProjectdutyperson ( java.lang.String projectdutyperson) {
this.projectdutyperson=projectdutyperson;
} 
 
/**
* 属性 projectname的Getter方法.属性名：工程名称
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getProjectname() {
return this.projectname;
} 

/**
* 属性projectname的Setter方法.属性名：工程名称
* 创建日期:2020-5-4
* @param newProjectname java.lang.String
*/
public void setProjectname ( java.lang.String projectname) {
this.projectname=projectname;
} 
 
/**
* 属性 custname的Getter方法.属性名：客户名称
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getCustname() {
return this.custname;
} 

/**
* 属性custname的Setter方法.属性名：客户名称
* 创建日期:2020-5-4
* @param newCustname java.lang.String
*/
public void setCustname ( java.lang.String custname) {
this.custname=custname;
} 
 
/**
* 属性 telnumber的Getter方法.属性名：电话
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getTelnumber() {
return this.telnumber;
} 

/**
* 属性telnumber的Setter方法.属性名：电话
* 创建日期:2020-5-4
* @param newTelnumber java.lang.String
*/
public void setTelnumber ( java.lang.String telnumber) {
this.telnumber=telnumber;
} 
 
/**
* 属性 startdate的Getter方法.属性名：开工日期
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getStartdate() {
return this.startdate;
} 

/**
* 属性startdate的Setter方法.属性名：开工日期
* 创建日期:2020-5-4
* @param newStartdate java.lang.String
*/
public void setStartdate ( java.lang.String startdate) {
this.startdate=startdate;
} 
 
/**
* 属性 estimatedate的Getter方法.属性名：预计完工日期
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getEstimatedate() {
return this.estimatedate;
} 

/**
* 属性estimatedate的Setter方法.属性名：预计完工日期
* 创建日期:2020-5-4
* @param newEstimatedate java.lang.String
*/
public void setEstimatedate ( java.lang.String estimatedate) {
this.estimatedate=estimatedate;
} 
 
/**
* 属性 projectplace的Getter方法.属性名：工程地点
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getProjectplace() {
return this.projectplace;
} 

/**
* 属性projectplace的Setter方法.属性名：工程地点
* 创建日期:2020-5-4
* @param newProjectplace java.lang.String
*/
public void setProjectplace ( java.lang.String projectplace) {
this.projectplace=projectplace;
} 
 
/**
* 属性 projectperiod的Getter方法.属性名：工期
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getProjectperiod() {
return this.projectperiod;
} 

/**
* 属性projectperiod的Setter方法.属性名：工期
* 创建日期:2020-5-4
* @param newProjectperiod java.lang.String
*/
public void setProjectperiod ( java.lang.String projectperiod) {
this.projectperiod=projectperiod;
} 
 
/**
* 属性 projectprice的Getter方法.属性名：工程总价
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFDouble
*/
public nc.vo.pub.lang.UFDouble getProjectprice() {
return this.projectprice;
} 

/**
* 属性projectprice的Setter方法.属性名：工程总价
* 创建日期:2020-5-4
* @param newProjectprice nc.vo.pub.lang.UFDouble
*/
public void setProjectprice ( nc.vo.pub.lang.UFDouble projectprice) {
this.projectprice=projectprice;
} 
 
/**
* 属性 projectcontract的Getter方法.属性名：工程合同
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFBoolean
*/
public Boolean getProjectcontract() {
return this.projectcontract;
} 

/**
* 属性projectcontract的Setter方法.属性名：工程合同
* 创建日期:2020-5-4
* @param newProjectcontract nc.vo.pub.lang.UFBoolean
*/
public void setProjectcontract ( Boolean projectcontract) {
this.projectcontract=projectcontract;
} 
 
/**
* 属性 projectpayment的Getter方法.属性名：工程预付款情况
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getProjectpayment() {
return this.projectpayment;
} 

/**
* 属性projectpayment的Setter方法.属性名：工程预付款情况
* 创建日期:2020-5-4
* @param newProjectpayment java.lang.String
*/
public void setProjectpayment ( java.lang.String projectpayment) {
this.projectpayment=projectpayment;
} 
 
/**
* 属性 constractionplan的Getter方法.属性名：施工方案
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFBoolean
*/
public Boolean getConstractionplan() {
return this.constractionplan;
} 

/**
* 属性constractionplan的Setter方法.属性名：施工方案
* 创建日期:2020-5-4
* @param newConstractionplan nc.vo.pub.lang.UFBoolean
*/
public void setConstractionplan ( Boolean constractionplan) {
this.constractionplan=constractionplan;
} 
 
/**
* 属性 advancepayment的Getter方法.属性名：预缴
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFBoolean
*/
public Boolean getAdvancepayment() {
return this.advancepayment;
} 

/**
* 属性advancepayment的Setter方法.属性名：预缴
* 创建日期:2020-5-4
* @param newAdvancepayment nc.vo.pub.lang.UFBoolean
*/
public void setAdvancepayment ( Boolean advancepayment) {
this.advancepayment=advancepayment;
} 
 
/**
* 属性 taxmethod的Getter方法.属性名：计税方式
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getTaxmethod() {
return this.taxmethod;
} 

/**
* 属性taxmethod的Setter方法.属性名：计税方式
* 创建日期:2020-5-4
* @param newTaxmethod java.lang.String
*/
public void setTaxmethod ( java.lang.String taxmethod) {
this.taxmethod=taxmethod;
} 
 
/**
* 属性 tax的Getter方法.属性名：税率
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getTax() {
return this.tax;
} 

/**
* 属性tax的Setter方法.属性名：税率
* 创建日期:2020-5-4
* @param newTax java.lang.String
*/
public void setTax ( java.lang.String tax) {
this.tax=tax;
} 
 
/**
* 属性 taxrate的Getter方法.属性名：征税率
*  创建日期:2020-5-4
* @return nc.vo.txm.taxpub.TaxrateVO
*/
public java.lang.String getTaxrate() {
return this.taxrate;
} 

/**
* 属性taxrate的Setter方法.属性名：征税率
* 创建日期:2020-5-4
* @param newTaxrate nc.vo.txm.taxpub.TaxrateVO
*/
public void setTaxrate ( java.lang.String taxrate) {
this.taxrate=taxrate;
} 
 
/**
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2020-5-4
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2020-5-4
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 pk_org的Getter方法.属性名：组织
*  创建日期:2020-5-4
* @return nc.vo.org.OrgVO
*/
public java.lang.String getPk_org() {
return this.pk_org;
} 

/**
* 属性pk_org的Setter方法.属性名：组织
* 创建日期:2020-5-4
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( java.lang.String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* 属性 pk_org_v的Getter方法.属性名：组织版本
*  创建日期:2020-5-4
* @return nc.vo.vorg.OrgVersionVO
*/
public java.lang.String getPk_org_v() {
return this.pk_org_v;
} 

/**
* 属性pk_org_v的Setter方法.属性名：组织版本
* 创建日期:2020-5-4
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( java.lang.String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* 属性 dbilldate的Getter方法.属性名：单据日期
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDbilldate() {
return this.dbilldate;
} 

/**
* 属性dbilldate的Setter方法.属性名：单据日期
* 创建日期:2020-5-4
* @param newDbilldate nc.vo.pub.lang.UFDate
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
} 
 
/**
* 属性 fstatusflag的Getter方法.属性名：单据状态
*  创建日期:2020-5-4
* @return nc.vo.pub.pf.BillStatusEnum
*/
public java.lang.Integer getFstatusflag() {
return this.fstatusflag;
} 

/**
* 属性fstatusflag的Setter方法.属性名：单据状态
* 创建日期:2020-5-4
* @param newFstatusflag nc.vo.pub.pf.BillStatusEnum
*/
public void setFstatusflag ( java.lang.Integer fstatusflag) {
this.fstatusflag=fstatusflag;
} 
 
/**
* 属性 vbillcode的Getter方法.属性名：单据号
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getVbillcode() {
return this.vbillcode;
} 

/**
* 属性vbillcode的Setter方法.属性名：单据号
* 创建日期:2020-5-4
* @param newVbillcode java.lang.String
*/
public void setVbillcode ( java.lang.String vbillcode) {
this.vbillcode=vbillcode;
} 
 
/**
* 属性 pk_busitype的Getter方法.属性名：业务类型
*  创建日期:2020-5-4
* @return nc.vo.pf.pub.BusitypeVO
*/
public java.lang.String getPk_busitype() {
return this.pk_busitype;
} 

/**
* 属性pk_busitype的Setter方法.属性名：业务类型
* 创建日期:2020-5-4
* @param newPk_busitype nc.vo.pf.pub.BusitypeVO
*/
public void setPk_busitype ( java.lang.String pk_busitype) {
this.pk_busitype=pk_busitype;
} 
 
/**
* 属性 pk_billtypeid的Getter方法.属性名：单据类型
*  创建日期:2020-5-4
* @return nc.vo.pub.billtype.BilltypeVO
*/
public java.lang.String getPk_billtypeid() {
return this.pk_billtypeid;
} 

/**
* 属性pk_billtypeid的Setter方法.属性名：单据类型
* 创建日期:2020-5-4
* @param newPk_billtypeid nc.vo.pub.billtype.BilltypeVO
*/
public void setPk_billtypeid ( java.lang.String pk_billtypeid) {
this.pk_billtypeid=pk_billtypeid;
} 
 
/**
* 属性 billtype的Getter方法.属性名：单据类型编码
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getBilltype() {
return this.billtype;
} 

/**
* 属性billtype的Setter方法.属性名：单据类型编码
* 创建日期:2020-5-4
* @param newBilltype java.lang.String
*/
public void setBilltype ( java.lang.String billtype) {
this.billtype=billtype;
} 
 
/**
* 属性 transtypecode的Getter方法.属性名：交易类型编码
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getTranstypecode() {
return this.transtypecode;
} 

/**
* 属性transtypecode的Setter方法.属性名：交易类型编码
* 创建日期:2020-5-4
* @param newTranstypecode java.lang.String
*/
public void setTranstypecode ( java.lang.String transtypecode) {
this.transtypecode=transtypecode;
} 
 
/**
* 属性 pk_transtype的Getter方法.属性名：交易类型
*  创建日期:2020-5-4
* @return nc.vo.pub.billtype.BilltypeVO
*/
public java.lang.String getPk_transtype() {
return this.pk_transtype;
} 

/**
* 属性pk_transtype的Setter方法.属性名：交易类型
* 创建日期:2020-5-4
* @param newPk_transtype nc.vo.pub.billtype.BilltypeVO
*/
public void setPk_transtype ( java.lang.String pk_transtype) {
this.pk_transtype=pk_transtype;
} 
 
/**
* 属性 billmaker的Getter方法.属性名：制单人
*  创建日期:2020-5-4
* @return nc.vo.sm.UserVO
*/
public java.lang.String getBillmaker() {
return this.billmaker;
} 

/**
* 属性billmaker的Setter方法.属性名：制单人
* 创建日期:2020-5-4
* @param newBillmaker nc.vo.sm.UserVO
*/
public void setBillmaker ( java.lang.String billmaker) {
this.billmaker=billmaker;
} 
 
/**
* 属性 maketime的Getter方法.属性名：制单时间
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getMaketime() {
return this.maketime;
} 

/**
* 属性maketime的Setter方法.属性名：制单时间
* 创建日期:2020-5-4
* @param newMaketime nc.vo.pub.lang.UFDate
*/
public void setMaketime ( UFDate maketime) {
this.maketime=maketime;
} 
 
/**
* 属性 creator的Getter方法.属性名：创建人
*  创建日期:2020-5-4
* @return nc.vo.sm.UserVO
*/
public java.lang.String getCreator() {
return this.creator;
} 

/**
* 属性creator的Setter方法.属性名：创建人
* 创建日期:2020-5-4
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( java.lang.String creator) {
this.creator=creator;
} 
 
/**
* 属性 creationtime的Getter方法.属性名：创建时间
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* 属性creationtime的Setter方法.属性名：创建时间
* 创建日期:2020-5-4
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* 属性 modifier的Getter方法.属性名：修改人
*  创建日期:2020-5-4
* @return nc.vo.sm.UserVO
*/
public java.lang.String getModifier() {
return this.modifier;
} 

/**
* 属性modifier的Setter方法.属性名：修改人
* 创建日期:2020-5-4
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( java.lang.String modifier) {
this.modifier=modifier;
} 
 
/**
* 属性 modifiedtime的Getter方法.属性名：修改时间
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* 属性modifiedtime的Setter方法.属性名：修改时间
* 创建日期:2020-5-4
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* 属性 approver的Getter方法.属性名：审批人
*  创建日期:2020-5-4
* @return nc.vo.sm.UserVO
*/
public java.lang.String getApprover() {
return this.approver;
} 

/**
* 属性approver的Setter方法.属性名：审批人
* 创建日期:2020-5-4
* @param newApprover nc.vo.sm.UserVO
*/
public void setApprover ( java.lang.String approver) {
this.approver=approver;
} 
 
/**
* 属性 approvestatus的Getter方法.属性名：审批状态
*  创建日期:2020-5-4
* @return nc.vo.pub.pf.BillStatusEnum
*/
public java.lang.Integer getApprovestatus() {
return this.approvestatus;
} 

/**
* 属性approvestatus的Setter方法.属性名：审批状态
* 创建日期:2020-5-4
* @param newApprovestatus nc.vo.pub.pf.BillStatusEnum
*/
public void setApprovestatus ( java.lang.Integer approvestatus) {
this.approvestatus=approvestatus;
} 
 
/**
* 属性 approvenote的Getter方法.属性名：审批批语
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getApprovenote() {
return this.approvenote;
} 

/**
* 属性approvenote的Setter方法.属性名：审批批语
* 创建日期:2020-5-4
* @param newApprovenote java.lang.String
*/
public void setApprovenote ( java.lang.String approvenote) {
this.approvenote=approvenote;
} 
 
/**
* 属性 approvedate的Getter方法.属性名：审批时间
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getApprovedate() {
return this.approvedate;
} 

/**
* 属性approvedate的Setter方法.属性名：审批时间
* 创建日期:2020-5-4
* @param newApprovedate nc.vo.pub.lang.UFDateTime
*/
public void setApprovedate ( UFDateTime approvedate) {
this.approvedate=approvedate;
} 
 
/**
* 属性 vnote的Getter方法.属性名：备注
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getVnote() {
return this.vnote;
} 

/**
* 属性vnote的Setter方法.属性名：备注
* 创建日期:2020-5-4
* @param newVnote java.lang.String
*/
public void setVnote ( java.lang.String vnote) {
this.vnote=vnote;
} 
 
/**
* 属性 srcbilltype的Getter方法.属性名：来源单据类型
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getSrcbilltype() {
return this.srcbilltype;
} 

/**
* 属性srcbilltype的Setter方法.属性名：来源单据类型
* 创建日期:2020-5-4
* @param newSrcbilltype java.lang.String
*/
public void setSrcbilltype ( java.lang.String srcbilltype) {
this.srcbilltype=srcbilltype;
} 
 
/**
* 属性 srcbillid的Getter方法.属性名：来源单据id
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getSrcbillid() {
return this.srcbillid;
} 

/**
* 属性srcbillid的Setter方法.属性名：来源单据id
* 创建日期:2020-5-4
* @param newSrcbillid java.lang.String
*/
public void setSrcbillid ( java.lang.String srcbillid) {
this.srcbillid=srcbillid;
} 
 
/**
* 属性 srccode的Getter方法.属性名：来源单据号
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getSrccode() {
return this.srccode;
} 

/**
* 属性srccode的Setter方法.属性名：来源单据号
* 创建日期:2020-5-4
* @param newSrccode java.lang.String
*/
public void setSrccode ( java.lang.String srccode) {
this.srccode=srccode;
} 
 
/**
* 属性 srcid的Getter方法.属性名：来源单据主表id
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getSrcid() {
return this.srcid;
} 

/**
* 属性srcid的Setter方法.属性名：来源单据主表id
* 创建日期:2020-5-4
* @param newSrcid java.lang.String
*/
public void setSrcid ( java.lang.String srcid) {
this.srcid=srcid;
} 
 
/**
* 属性 srcbid的Getter方法.属性名：来源单据子表id
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getSrcbid() {
return this.srcbid;
} 

/**
* 属性srcbid的Setter方法.属性名：来源单据子表id
* 创建日期:2020-5-4
* @param newSrcbid java.lang.String
*/
public void setSrcbid ( java.lang.String srcbid) {
this.srcbid=srcbid;
} 
 
/**
* 属性 srcrowno的Getter方法.属性名：来源单据行号
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getSrcrowno() {
return this.srcrowno;
} 

/**
* 属性srcrowno的Setter方法.属性名：来源单据行号
* 创建日期:2020-5-4
* @param newSrcrowno java.lang.String
*/
public void setSrcrowno ( java.lang.String srcrowno) {
this.srcrowno=srcrowno;
} 
 
/**
* 属性 srctrantype的Getter方法.属性名：来源交易类型
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getSrctrantype() {
return this.srctrantype;
} 

/**
* 属性srctrantype的Setter方法.属性名：来源交易类型
* 创建日期:2020-5-4
* @param newSrctrantype java.lang.String
*/
public void setSrctrantype ( java.lang.String srctrantype) {
this.srctrantype=srctrantype;
} 
 
/**
* 属性 vfirsttype的Getter方法.属性名：源头单据类型
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getVfirsttype() {
return this.vfirsttype;
} 

/**
* 属性vfirsttype的Setter方法.属性名：源头单据类型
* 创建日期:2020-5-4
* @param newVfirsttype java.lang.String
*/
public void setVfirsttype ( java.lang.String vfirsttype) {
this.vfirsttype=vfirsttype;
} 
 
/**
* 属性 vfirstcode的Getter方法.属性名：源头单据号
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getVfirstcode() {
return this.vfirstcode;
} 

/**
* 属性vfirstcode的Setter方法.属性名：源头单据号
* 创建日期:2020-5-4
* @param newVfirstcode java.lang.String
*/
public void setVfirstcode ( java.lang.String vfirstcode) {
this.vfirstcode=vfirstcode;
} 
 
/**
* 属性 vfirstid的Getter方法.属性名：源头单据主表id
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getVfirstid() {
return this.vfirstid;
} 

/**
* 属性vfirstid的Setter方法.属性名：源头单据主表id
* 创建日期:2020-5-4
* @param newVfirstid java.lang.String
*/
public void setVfirstid ( java.lang.String vfirstid) {
this.vfirstid=vfirstid;
} 
 
/**
* 属性 vfirstbid的Getter方法.属性名：源头单据子表id
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getVfirstbid() {
return this.vfirstbid;
} 

/**
* 属性vfirstbid的Setter方法.属性名：源头单据子表id
* 创建日期:2020-5-4
* @param newVfirstbid java.lang.String
*/
public void setVfirstbid ( java.lang.String vfirstbid) {
this.vfirstbid=vfirstbid;
} 
 
/**
* 属性 vfirstrowno的Getter方法.属性名：源头单据行号
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getVfirstrowno() {
return this.vfirstrowno;
} 

/**
* 属性vfirstrowno的Setter方法.属性名：源头单据行号
* 创建日期:2020-5-4
* @param newVfirstrowno java.lang.String
*/
public void setVfirstrowno ( java.lang.String vfirstrowno) {
this.vfirstrowno=vfirstrowno;
} 
 
/**
* 属性 vfirsttrantype的Getter方法.属性名：源头交易类型
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getVfirsttrantype() {
return this.vfirsttrantype;
} 

/**
* 属性vfirsttrantype的Setter方法.属性名：源头交易类型
* 创建日期:2020-5-4
* @param newVfirsttrantype java.lang.String
*/
public void setVfirsttrantype ( java.lang.String vfirsttrantype) {
this.vfirsttrantype=vfirsttrantype;
} 
 
/**
* 属性 def0的Getter方法.属性名：自定义项0
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef0() {
return this.def0;
} 

/**
* 属性def0的Setter方法.属性名：自定义项0
* 创建日期:2020-5-4
* @param newDef0 java.lang.String
*/
public void setDef0 ( java.lang.String def0) {
this.def0=def0;
} 
 
/**
* 属性 def1的Getter方法.属性名：自定义项1
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef1() {
return this.def1;
} 

/**
* 属性def1的Setter方法.属性名：自定义项1
* 创建日期:2020-5-4
* @param newDef1 java.lang.String
*/
public void setDef1 ( java.lang.String def1) {
this.def1=def1;
} 
 
/**
* 属性 def2的Getter方法.属性名：自定义项2
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef2() {
return this.def2;
} 

/**
* 属性def2的Setter方法.属性名：自定义项2
* 创建日期:2020-5-4
* @param newDef2 java.lang.String
*/
public void setDef2 ( java.lang.String def2) {
this.def2=def2;
} 
 
/**
* 属性 def3的Getter方法.属性名：自定义项3
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef3() {
return this.def3;
} 

/**
* 属性def3的Setter方法.属性名：自定义项3
* 创建日期:2020-5-4
* @param newDef3 java.lang.String
*/
public void setDef3 ( java.lang.String def3) {
this.def3=def3;
} 
 
/**
* 属性 def4的Getter方法.属性名：自定义项4
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef4() {
return this.def4;
} 

/**
* 属性def4的Setter方法.属性名：自定义项4
* 创建日期:2020-5-4
* @param newDef4 java.lang.String
*/
public void setDef4 ( java.lang.String def4) {
this.def4=def4;
} 
 
/**
* 属性 def5的Getter方法.属性名：自定义项5
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef5() {
return this.def5;
} 

/**
* 属性def5的Setter方法.属性名：自定义项5
* 创建日期:2020-5-4
* @param newDef5 java.lang.String
*/
public void setDef5 ( java.lang.String def5) {
this.def5=def5;
} 
 
/**
* 属性 def6的Getter方法.属性名：自定义项6
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef6() {
return this.def6;
} 

/**
* 属性def6的Setter方法.属性名：自定义项6
* 创建日期:2020-5-4
* @param newDef6 java.lang.String
*/
public void setDef6 ( java.lang.String def6) {
this.def6=def6;
} 
 
/**
* 属性 def7的Getter方法.属性名：自定义项7
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef7() {
return this.def7;
} 

/**
* 属性def7的Setter方法.属性名：自定义项7
* 创建日期:2020-5-4
* @param newDef7 java.lang.String
*/
public void setDef7 ( java.lang.String def7) {
this.def7=def7;
} 
 
/**
* 属性 def8的Getter方法.属性名：自定义项8
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef8() {
return this.def8;
} 

/**
* 属性def8的Setter方法.属性名：自定义项8
* 创建日期:2020-5-4
* @param newDef8 java.lang.String
*/
public void setDef8 ( java.lang.String def8) {
this.def8=def8;
} 
 
/**
* 属性 def10的Getter方法.属性名：自定义项10
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef10() {
return this.def10;
} 

/**
* 属性def10的Setter方法.属性名：自定义项10
* 创建日期:2020-5-4
* @param newDef10 java.lang.String
*/
public void setDef10 ( java.lang.String def10) {
this.def10=def10;
} 
 
/**
* 属性 def11的Getter方法.属性名：自定义项11
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef11() {
return this.def11;
} 

/**
* 属性def11的Setter方法.属性名：自定义项11
* 创建日期:2020-5-4
* @param newDef11 java.lang.String
*/
public void setDef11 ( java.lang.String def11) {
this.def11=def11;
} 
 
/**
* 属性 def12的Getter方法.属性名：自定义项12
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef12() {
return this.def12;
} 

/**
* 属性def12的Setter方法.属性名：自定义项12
* 创建日期:2020-5-4
* @param newDef12 java.lang.String
*/
public void setDef12 ( java.lang.String def12) {
this.def12=def12;
} 
 
/**
* 属性 def13的Getter方法.属性名：自定义项13
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef13() {
return this.def13;
} 

/**
* 属性def13的Setter方法.属性名：自定义项13
* 创建日期:2020-5-4
* @param newDef13 java.lang.String
*/
public void setDef13 ( java.lang.String def13) {
this.def13=def13;
} 
 
/**
* 属性 def14的Getter方法.属性名：自定义项14
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef14() {
return this.def14;
} 

/**
* 属性def14的Setter方法.属性名：自定义项14
* 创建日期:2020-5-4
* @param newDef14 java.lang.String
*/
public void setDef14 ( java.lang.String def14) {
this.def14=def14;
} 
 
/**
* 属性 def15的Getter方法.属性名：自定义项15
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef15() {
return this.def15;
} 

/**
* 属性def15的Setter方法.属性名：自定义项15
* 创建日期:2020-5-4
* @param newDef15 java.lang.String
*/
public void setDef15 ( java.lang.String def15) {
this.def15=def15;
} 
 
/**
* 属性 def16的Getter方法.属性名：自定义项16
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef16() {
return this.def16;
} 

/**
* 属性def16的Setter方法.属性名：自定义项16
* 创建日期:2020-5-4
* @param newDef16 java.lang.String
*/
public void setDef16 ( java.lang.String def16) {
this.def16=def16;
} 
 
/**
* 属性 def17的Getter方法.属性名：自定义项17
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef17() {
return this.def17;
} 

/**
* 属性def17的Setter方法.属性名：自定义项17
* 创建日期:2020-5-4
* @param newDef17 java.lang.String
*/
public void setDef17 ( java.lang.String def17) {
this.def17=def17;
} 
 
/**
* 属性 def18的Getter方法.属性名：自定义项18
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef18() {
return this.def18;
} 

/**
* 属性def18的Setter方法.属性名：自定义项18
* 创建日期:2020-5-4
* @param newDef18 java.lang.String
*/
public void setDef18 ( java.lang.String def18) {
this.def18=def18;
} 
 
/**
* 属性 def19的Getter方法.属性名：自定义项19
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef19() {
return this.def19;
} 

/**
* 属性def19的Setter方法.属性名：自定义项19
* 创建日期:2020-5-4
* @param newDef19 java.lang.String
*/
public void setDef19 ( java.lang.String def19) {
this.def19=def19;
} 
 
/**
* 属性 def20的Getter方法.属性名：自定义项20
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef20() {
return this.def20;
} 

/**
* 属性def20的Setter方法.属性名：自定义项20
* 创建日期:2020-5-4
* @param newDef20 java.lang.String
*/
public void setDef20 ( java.lang.String def20) {
this.def20=def20;
} 
 
/**
* 属性 def21的Getter方法.属性名：自定义项21
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef21() {
return this.def21;
} 

/**
* 属性def21的Setter方法.属性名：自定义项21
* 创建日期:2020-5-4
* @param newDef21 java.lang.String
*/
public void setDef21 ( java.lang.String def21) {
this.def21=def21;
} 
 
/**
* 属性 def22的Getter方法.属性名：自定义项22
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef22() {
return this.def22;
} 

/**
* 属性def22的Setter方法.属性名：自定义项22
* 创建日期:2020-5-4
* @param newDef22 java.lang.String
*/
public void setDef22 ( java.lang.String def22) {
this.def22=def22;
} 
 
/**
* 属性 def23的Getter方法.属性名：自定义项23
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef23() {
return this.def23;
} 

/**
* 属性def23的Setter方法.属性名：自定义项23
* 创建日期:2020-5-4
* @param newDef23 java.lang.String
*/
public void setDef23 ( java.lang.String def23) {
this.def23=def23;
} 
 
/**
* 属性 def24的Getter方法.属性名：自定义项24
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef24() {
return this.def24;
} 

/**
* 属性def24的Setter方法.属性名：自定义项24
* 创建日期:2020-5-4
* @param newDef24 java.lang.String
*/
public void setDef24 ( java.lang.String def24) {
this.def24=def24;
} 
 
/**
* 属性 def25的Getter方法.属性名：自定义项25
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef25() {
return this.def25;
} 

/**
* 属性def25的Setter方法.属性名：自定义项25
* 创建日期:2020-5-4
* @param newDef25 java.lang.String
*/
public void setDef25 ( java.lang.String def25) {
this.def25=def25;
} 
 
/**
* 属性 def26的Getter方法.属性名：自定义项26
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef26() {
return this.def26;
} 

/**
* 属性def26的Setter方法.属性名：自定义项26
* 创建日期:2020-5-4
* @param newDef26 java.lang.String
*/
public void setDef26 ( java.lang.String def26) {
this.def26=def26;
} 
 
/**
* 属性 def27的Getter方法.属性名：自定义项27
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef27() {
return this.def27;
} 

/**
* 属性def27的Setter方法.属性名：自定义项27
* 创建日期:2020-5-4
* @param newDef27 java.lang.String
*/
public void setDef27 ( java.lang.String def27) {
this.def27=def27;
} 
 
/**
* 属性 def28的Getter方法.属性名：自定义项28
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef28() {
return this.def28;
} 

/**
* 属性def28的Setter方法.属性名：自定义项28
* 创建日期:2020-5-4
* @param newDef28 java.lang.String
*/
public void setDef28 ( java.lang.String def28) {
this.def28=def28;
} 
 
/**
* 属性 def29的Getter方法.属性名：自定义项29
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef29() {
return this.def29;
} 

/**
* 属性def29的Setter方法.属性名：自定义项29
* 创建日期:2020-5-4
* @param newDef29 java.lang.String
*/
public void setDef29 ( java.lang.String def29) {
this.def29=def29;
} 
 
/**
* 属性 def30的Getter方法.属性名：自定义项30
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef30() {
return this.def30;
} 

/**
* 属性def30的Setter方法.属性名：自定义项30
* 创建日期:2020-5-4
* @param newDef30 java.lang.String
*/
public void setDef30 ( java.lang.String def30) {
this.def30=def30;
} 
 
/**
* 属性 def31的Getter方法.属性名：自定义项31
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef31() {
return this.def31;
} 

/**
* 属性def31的Setter方法.属性名：自定义项31
* 创建日期:2020-5-4
* @param newDef31 java.lang.String
*/
public void setDef31 ( java.lang.String def31) {
this.def31=def31;
} 
 
/**
* 属性 def32的Getter方法.属性名：自定义项32
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef32() {
return this.def32;
} 

/**
* 属性def32的Setter方法.属性名：自定义项32
* 创建日期:2020-5-4
* @param newDef32 java.lang.String
*/
public void setDef32 ( java.lang.String def32) {
this.def32=def32;
} 
 
/**
* 属性 def33的Getter方法.属性名：自定义项33
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef33() {
return this.def33;
} 

/**
* 属性def33的Setter方法.属性名：自定义项33
* 创建日期:2020-5-4
* @param newDef33 java.lang.String
*/
public void setDef33 ( java.lang.String def33) {
this.def33=def33;
} 
 
/**
* 属性 def34的Getter方法.属性名：自定义项34
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef34() {
return this.def34;
} 

/**
* 属性def34的Setter方法.属性名：自定义项34
* 创建日期:2020-5-4
* @param newDef34 java.lang.String
*/
public void setDef34 ( java.lang.String def34) {
this.def34=def34;
} 
 
/**
* 属性 def35的Getter方法.属性名：自定义项35
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef35() {
return this.def35;
} 

/**
* 属性def35的Setter方法.属性名：自定义项35
* 创建日期:2020-5-4
* @param newDef35 java.lang.String
*/
public void setDef35 ( java.lang.String def35) {
this.def35=def35;
} 
 
/**
* 属性 def36的Getter方法.属性名：自定义项36
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef36() {
return this.def36;
} 

/**
* 属性def36的Setter方法.属性名：自定义项36
* 创建日期:2020-5-4
* @param newDef36 java.lang.String
*/
public void setDef36 ( java.lang.String def36) {
this.def36=def36;
} 
 
/**
* 属性 def37的Getter方法.属性名：自定义项37
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef37() {
return this.def37;
} 

/**
* 属性def37的Setter方法.属性名：自定义项37
* 创建日期:2020-5-4
* @param newDef37 java.lang.String
*/
public void setDef37 ( java.lang.String def37) {
this.def37=def37;
} 
 
/**
* 属性 def38的Getter方法.属性名：自定义项38
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef38() {
return this.def38;
} 

/**
* 属性def38的Setter方法.属性名：自定义项38
* 创建日期:2020-5-4
* @param newDef38 java.lang.String
*/
public void setDef38 ( java.lang.String def38) {
this.def38=def38;
} 
 
/**
* 属性 def39的Getter方法.属性名：自定义项39
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef39() {
return this.def39;
} 

/**
* 属性def39的Setter方法.属性名：自定义项39
* 创建日期:2020-5-4
* @param newDef39 java.lang.String
*/
public void setDef39 ( java.lang.String def39) {
this.def39=def39;
} 
 
/**
* 属性 def40的Getter方法.属性名：自定义项40
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef40() {
return this.def40;
} 

/**
* 属性def40的Setter方法.属性名：自定义项40
* 创建日期:2020-5-4
* @param newDef40 java.lang.String
*/
public void setDef40 ( java.lang.String def40) {
this.def40=def40;
} 
 
/**
* 属性 def41的Getter方法.属性名：自定义项41
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef41() {
return this.def41;
} 

/**
* 属性def41的Setter方法.属性名：自定义项41
* 创建日期:2020-5-4
* @param newDef41 java.lang.String
*/
public void setDef41 ( java.lang.String def41) {
this.def41=def41;
} 
 
/**
* 属性 def42的Getter方法.属性名：自定义项42
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef42() {
return this.def42;
} 

/**
* 属性def42的Setter方法.属性名：自定义项42
* 创建日期:2020-5-4
* @param newDef42 java.lang.String
*/
public void setDef42 ( java.lang.String def42) {
this.def42=def42;
} 
 
/**
* 属性 def43的Getter方法.属性名：自定义项43
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef43() {
return this.def43;
} 

/**
* 属性def43的Setter方法.属性名：自定义项43
* 创建日期:2020-5-4
* @param newDef43 java.lang.String
*/
public void setDef43 ( java.lang.String def43) {
this.def43=def43;
} 
 
/**
* 属性 def44的Getter方法.属性名：自定义项44
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef44() {
return this.def44;
} 

/**
* 属性def44的Setter方法.属性名：自定义项44
* 创建日期:2020-5-4
* @param newDef44 java.lang.String
*/
public void setDef44 ( java.lang.String def44) {
this.def44=def44;
} 
 
/**
* 属性 def45的Getter方法.属性名：自定义项45
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef45() {
return this.def45;
} 

/**
* 属性def45的Setter方法.属性名：自定义项45
* 创建日期:2020-5-4
* @param newDef45 java.lang.String
*/
public void setDef45 ( java.lang.String def45) {
this.def45=def45;
} 
 
/**
* 属性 def46的Getter方法.属性名：自定义项46
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef46() {
return this.def46;
} 

/**
* 属性def46的Setter方法.属性名：自定义项46
* 创建日期:2020-5-4
* @param newDef46 java.lang.String
*/
public void setDef46 ( java.lang.String def46) {
this.def46=def46;
} 
 
/**
* 属性 def47的Getter方法.属性名：自定义项47
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef47() {
return this.def47;
} 

/**
* 属性def47的Setter方法.属性名：自定义项47
* 创建日期:2020-5-4
* @param newDef47 java.lang.String
*/
public void setDef47 ( java.lang.String def47) {
this.def47=def47;
} 
 
/**
* 属性 def48的Getter方法.属性名：自定义项48
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef48() {
return this.def48;
} 

/**
* 属性def48的Setter方法.属性名：自定义项48
* 创建日期:2020-5-4
* @param newDef48 java.lang.String
*/
public void setDef48 ( java.lang.String def48) {
this.def48=def48;
} 
 
/**
* 属性 def49的Getter方法.属性名：自定义项49
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef49() {
return this.def49;
} 

/**
* 属性def49的Setter方法.属性名：自定义项49
* 创建日期:2020-5-4
* @param newDef49 java.lang.String
*/
public void setDef49 ( java.lang.String def49) {
this.def49=def49;
} 
 
/**
* 属性 def50的Getter方法.属性名：自定义项50
*  创建日期:2020-5-4
* @return java.lang.String
*/
public java.lang.String getDef50() {
return this.def50;
} 

/**
* 属性def50的Setter方法.属性名：自定义项50
* 创建日期:2020-5-4
* @param newDef50 java.lang.String
*/
public void setDef50 ( java.lang.String def50) {
this.def50=def50;
} 
 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2020-5-4
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2020-5-4
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("adprepare.projectstartHVO");
    }
   }
    