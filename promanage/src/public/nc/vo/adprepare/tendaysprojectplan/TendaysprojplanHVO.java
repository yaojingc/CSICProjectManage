package nc.vo.adprepare.tendaysprojectplan;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加累的描述信息
 * </p>
 *  创建日期:2020-5-20
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class TendaysprojplanHVO extends SuperVO {
	
/**
*项目旬计划主表主键
*/
public java.lang.String pk_tendaysprojplan_h;
/**
*集团
*/
public java.lang.String pk_group;
/**
*组织最新版本
*/
public java.lang.String pk_org;
/**
*组织
*/
public java.lang.String pk_org_v;
/**
*项目
*/
public java.lang.String pk_project;
/**
*总任务数
*/
public java.lang.Integer item_num;
/**
*模板主键
*/
public java.lang.String pk_template;
/**
*版本号
*/
public java.lang.Integer version;
/**
*生效版本
*/
public java.lang.String pk_origin;
/**
*最新版本号
*/
public java.lang.Integer max_version;
/**
*是否最新版本
*/
public UFBoolean last_v_flag;
/**
*进度
*/
public java.lang.String pk_progress;
/**
*工期
*/
public java.lang.Integer duration;
/**
*项目名称
*/
public java.lang.String projectname;
/**
*计划名称
*/
public java.lang.String planname;
/**
*任务编码
*/
public java.lang.String missioncode;
/**
*任务名称
*/
public java.lang.String missionname;
/**
*计划开始日期
*/
public UFDate projectstartdate;
/**
*计划截止日期
*/
public UFDate projectdeaddate;
/**
*计划工期
*/
public java.lang.String planduration;
/**
*任务描述
*/
public java.lang.String missiondetail;
/**
*前置计划
*/
public java.lang.String advanceplan;
/**
*里程碑
*/
public java.lang.String milepost;
/**
*责任人
*/
public java.lang.String dutyperson;
/**
*责任部门
*/
public java.lang.String dutydept;
/**
*审批时间
*/
public UFDateTime approvedate;
/**
*单据日期
*/
public UFDate dbilldate;
/**
*单据状态
*/
public java.lang.Integer billstatus;
/**
*单据号
*/
public java.lang.String billno;
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
* 属性 pk_tendaysprojplan_h的Getter方法.属性名：项目旬计划主表主键
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPk_tendaysprojplan_h() {
return this.pk_tendaysprojplan_h;
} 

/**
* 属性pk_tendaysprojplan_h的Setter方法.属性名：项目旬计划主表主键
* 创建日期:2020-5-20
* @param newPk_tendaysprojplan_h java.lang.String
*/
public void setPk_tendaysprojplan_h ( java.lang.String pk_tendaysprojplan_h) {
this.pk_tendaysprojplan_h=pk_tendaysprojplan_h;
} 
 
/**
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2020-5-20
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2020-5-20
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 pk_org的Getter方法.属性名：组织最新版本
*  创建日期:2020-5-20
* @return nc.vo.org.ItemOrgVO
*/
public java.lang.String getPk_org() {
return this.pk_org;
} 

/**
* 属性pk_org的Setter方法.属性名：组织最新版本
* 创建日期:2020-5-20
* @param newPk_org nc.vo.org.ItemOrgVO
*/
public void setPk_org ( java.lang.String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* 属性 pk_org_v的Getter方法.属性名：组织
*  创建日期:2020-5-20
* @return nc.vo.vorg.ItemOrgVersionVO
*/
public java.lang.String getPk_org_v() {
return this.pk_org_v;
} 

/**
* 属性pk_org_v的Setter方法.属性名：组织
* 创建日期:2020-5-20
* @param newPk_org_v nc.vo.vorg.ItemOrgVersionVO
*/
public void setPk_org_v ( java.lang.String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* 属性 pk_project的Getter方法.属性名：项目
*  创建日期:2020-5-20
* @return nc.vo.pim.project.ProjectHeadVO
*/
public java.lang.String getPk_project() {
return this.pk_project;
} 

/**
* 属性pk_project的Setter方法.属性名：项目
* 创建日期:2020-5-20
* @param newPk_project nc.vo.pim.project.ProjectHeadVO
*/
public void setPk_project ( java.lang.String pk_project) {
this.pk_project=pk_project;
} 
 
/**
* 属性 item_num的Getter方法.属性名：总任务数
*  创建日期:2020-5-20
* @return java.lang.Integer
*/
public java.lang.Integer getItem_num() {
return this.item_num;
} 

/**
* 属性item_num的Setter方法.属性名：总任务数
* 创建日期:2020-5-20
* @param newItem_num java.lang.Integer
*/
public void setItem_num ( java.lang.Integer item_num) {
this.item_num=item_num;
} 
 
/**
* 属性 pk_template的Getter方法.属性名：模板主键
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPk_template() {
return this.pk_template;
} 

/**
* 属性pk_template的Setter方法.属性名：模板主键
* 创建日期:2020-5-20
* @param newPk_template java.lang.String
*/
public void setPk_template ( java.lang.String pk_template) {
this.pk_template=pk_template;
} 
 
/**
* 属性 version的Getter方法.属性名：版本号
*  创建日期:2020-5-20
* @return java.lang.Integer
*/
public java.lang.Integer getVersion() {
return this.version;
} 

/**
* 属性version的Setter方法.属性名：版本号
* 创建日期:2020-5-20
* @param newVersion java.lang.Integer
*/
public void setVersion ( java.lang.Integer version) {
this.version=version;
} 
 
/**
* 属性 pk_origin的Getter方法.属性名：生效版本
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPk_origin() {
return this.pk_origin;
} 

/**
* 属性pk_origin的Setter方法.属性名：生效版本
* 创建日期:2020-5-20
* @param newPk_origin java.lang.String
*/
public void setPk_origin ( java.lang.String pk_origin) {
this.pk_origin=pk_origin;
} 
 
/**
* 属性 max_version的Getter方法.属性名：最新版本号
*  创建日期:2020-5-20
* @return java.lang.Integer
*/
public java.lang.Integer getMax_version() {
return this.max_version;
} 

/**
* 属性max_version的Setter方法.属性名：最新版本号
* 创建日期:2020-5-20
* @param newMax_version java.lang.Integer
*/
public void setMax_version ( java.lang.Integer max_version) {
this.max_version=max_version;
} 
 
/**
* 属性 last_v_flag的Getter方法.属性名：是否最新版本
*  创建日期:2020-5-20
* @return nc.vo.pub.lang.UFUFBoolean
*/
public UFBoolean getLast_v_flag() {
return this.last_v_flag;
} 

/**
* 属性last_v_flag的Setter方法.属性名：是否最新版本
* 创建日期:2020-5-20
* @param newLast_v_flag nc.vo.pub.lang.UFUFBoolean
*/
public void setLast_v_flag ( UFBoolean last_v_flag) {
this.last_v_flag=last_v_flag;
} 
 
/**
* 属性 pk_progress的Getter方法.属性名：进度
*  创建日期:2020-5-20
* @return nc.vo.pmsch.plan.progress.TimeProgressHeadVO
*/
public java.lang.String getPk_progress() {
return this.pk_progress;
} 

/**
* 属性pk_progress的Setter方法.属性名：进度
* 创建日期:2020-5-20
* @param newPk_progress nc.vo.pmsch.plan.progress.TimeProgressHeadVO
*/
public void setPk_progress ( java.lang.String pk_progress) {
this.pk_progress=pk_progress;
} 
 
/**
* 属性 duration的Getter方法.属性名：工期
*  创建日期:2020-5-20
* @return java.lang.Integer
*/
public java.lang.Integer getDuration() {
return this.duration;
} 

/**
* 属性duration的Setter方法.属性名：工期
* 创建日期:2020-5-20
* @param newDuration java.lang.Integer
*/
public void setDuration ( java.lang.Integer duration) {
this.duration=duration;
} 
 
/**
* 属性 projectname的Getter方法.属性名：项目名称
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getProjectname() {
return this.projectname;
} 

/**
* 属性projectname的Setter方法.属性名：项目名称
* 创建日期:2020-5-20
* @param newProjectname java.lang.String
*/
public void setProjectname ( java.lang.String projectname) {
this.projectname=projectname;
} 
 
/**
* 属性 planname的Getter方法.属性名：计划名称
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPlanname() {
return this.planname;
} 

/**
* 属性planname的Setter方法.属性名：计划名称
* 创建日期:2020-5-20
* @param newPlanname java.lang.String
*/
public void setPlanname ( java.lang.String planname) {
this.planname=planname;
} 
 
/**
* 属性 missioncode的Getter方法.属性名：任务编码
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getMissioncode() {
return this.missioncode;
} 

/**
* 属性missioncode的Setter方法.属性名：任务编码
* 创建日期:2020-5-20
* @param newMissioncode java.lang.String
*/
public void setMissioncode ( java.lang.String missioncode) {
this.missioncode=missioncode;
} 
 
/**
* 属性 missionname的Getter方法.属性名：任务名称
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getMissionname() {
return this.missionname;
} 

/**
* 属性missionname的Setter方法.属性名：任务名称
* 创建日期:2020-5-20
* @param newMissionname java.lang.String
*/
public void setMissionname ( java.lang.String missionname) {
this.missionname=missionname;
} 
 
/**
* 属性 projectstartdate的Getter方法.属性名：计划开始日期
*  创建日期:2020-5-20
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getProjectstartdate() {
return this.projectstartdate;
} 

/**
* 属性projectstartdate的Setter方法.属性名：计划开始日期
* 创建日期:2020-5-20
* @param newProjectstartdate nc.vo.pub.lang.UFDate
*/
public void setProjectstartdate ( UFDate projectstartdate) {
this.projectstartdate=projectstartdate;
} 
 
/**
* 属性 projectdeaddate的Getter方法.属性名：计划截止日期
*  创建日期:2020-5-20
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getProjectdeaddate() {
return this.projectdeaddate;
} 

/**
* 属性projectdeaddate的Setter方法.属性名：计划截止日期
* 创建日期:2020-5-20
* @param newProjectdeaddate nc.vo.pub.lang.UFDate
*/
public void setProjectdeaddate ( UFDate projectdeaddate) {
this.projectdeaddate=projectdeaddate;
} 
 
/**
* 属性 planduration的Getter方法.属性名：计划工期
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPlanduration() {
return this.planduration;
} 

/**
* 属性planduration的Setter方法.属性名：计划工期
* 创建日期:2020-5-20
* @param newPlanduration java.lang.String
*/
public void setPlanduration ( java.lang.String planduration) {
this.planduration=planduration;
} 
 
/**
* 属性 missiondetail的Getter方法.属性名：任务描述
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getMissiondetail() {
return this.missiondetail;
} 

/**
* 属性missiondetail的Setter方法.属性名：任务描述
* 创建日期:2020-5-20
* @param newMissiondetail java.lang.String
*/
public void setMissiondetail ( java.lang.String missiondetail) {
this.missiondetail=missiondetail;
} 
 
/**
* 属性 advanceplan的Getter方法.属性名：前置计划
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getAdvanceplan() {
return this.advanceplan;
} 

/**
* 属性advanceplan的Setter方法.属性名：前置计划
* 创建日期:2020-5-20
* @param newAdvanceplan java.lang.String
*/
public void setAdvanceplan ( java.lang.String advanceplan) {
this.advanceplan=advanceplan;
} 
 
/**
* 属性 milepost的Getter方法.属性名：里程碑
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getMilepost() {
return this.milepost;
} 

/**
* 属性milepost的Setter方法.属性名：里程碑
* 创建日期:2020-5-20
* @param newMilepost java.lang.String
*/
public void setMilepost ( java.lang.String milepost) {
this.milepost=milepost;
} 
 
/**
* 属性 dutyperson的Getter方法.属性名：责任人
*  创建日期:2020-5-20
* @return nc.vo.bd.psn.PsndocVO
*/
public java.lang.String getDutyperson() {
return this.dutyperson;
} 

/**
* 属性dutyperson的Setter方法.属性名：责任人
* 创建日期:2020-5-20
* @param newDutyperson nc.vo.bd.psn.PsndocVO
*/
public void setDutyperson ( java.lang.String dutyperson) {
this.dutyperson=dutyperson;
} 
 
/**
* 属性 dutydept的Getter方法.属性名：责任部门
*  创建日期:2020-5-20
* @return nc.vo.org.DeptVO
*/
public java.lang.String getDutydept() {
return this.dutydept;
} 

/**
* 属性dutydept的Setter方法.属性名：责任部门
* 创建日期:2020-5-20
* @param newDutydept nc.vo.org.DeptVO
*/
public void setDutydept ( java.lang.String dutydept) {
this.dutydept=dutydept;
} 
 
/**
* 属性 approvedate的Getter方法.属性名：审批时间
*  创建日期:2020-5-20
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getApprovedate() {
return this.approvedate;
} 

/**
* 属性approvedate的Setter方法.属性名：审批时间
* 创建日期:2020-5-20
* @param newApprovedate nc.vo.pub.lang.UFDateTime
*/
public void setApprovedate ( UFDateTime approvedate) {
this.approvedate=approvedate;
} 
 
/**
* 属性 dbilldate的Getter方法.属性名：单据日期
*  创建日期:2020-5-20
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDbilldate() {
return this.dbilldate;
} 

/**
* 属性dbilldate的Setter方法.属性名：单据日期
* 创建日期:2020-5-20
* @param newDbilldate nc.vo.pub.lang.UFDate
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
} 
 
/**
* 属性 billstatus的Getter方法.属性名：单据状态
*  创建日期:2020-5-20
* @return nc.vo.pub.pf.BillStatusEnum
*/
public java.lang.Integer getBillstatus() {
return this.billstatus;
} 

/**
* 属性billstatus的Setter方法.属性名：单据状态
* 创建日期:2020-5-20
* @param newBillstatus nc.vo.pub.pf.BillStatusEnum
*/
public void setBillstatus ( java.lang.Integer billstatus) {
this.billstatus=billstatus;
} 
 
/**
* 属性 billno的Getter方法.属性名：单据号
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getBillno() {
return this.billno;
} 

/**
* 属性billno的Setter方法.属性名：单据号
* 创建日期:2020-5-20
* @param newBillno java.lang.String
*/
public void setBillno ( java.lang.String billno) {
this.billno=billno;
} 
 
/**
* 属性 pk_busitype的Getter方法.属性名：业务类型
*  创建日期:2020-5-20
* @return nc.vo.pf.pub.BusitypeVO
*/
public java.lang.String getPk_busitype() {
return this.pk_busitype;
} 

/**
* 属性pk_busitype的Setter方法.属性名：业务类型
* 创建日期:2020-5-20
* @param newPk_busitype nc.vo.pf.pub.BusitypeVO
*/
public void setPk_busitype ( java.lang.String pk_busitype) {
this.pk_busitype=pk_busitype;
} 
 
/**
* 属性 pk_billtypeid的Getter方法.属性名：单据类型
*  创建日期:2020-5-20
* @return nc.vo.pub.billtype.BilltypeVO
*/
public java.lang.String getPk_billtypeid() {
return this.pk_billtypeid;
} 

/**
* 属性pk_billtypeid的Setter方法.属性名：单据类型
* 创建日期:2020-5-20
* @param newPk_billtypeid nc.vo.pub.billtype.BilltypeVO
*/
public void setPk_billtypeid ( java.lang.String pk_billtypeid) {
this.pk_billtypeid=pk_billtypeid;
} 
 
/**
* 属性 billtype的Getter方法.属性名：单据类型编码
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getBilltype() {
return this.billtype;
} 

/**
* 属性billtype的Setter方法.属性名：单据类型编码
* 创建日期:2020-5-20
* @param newBilltype java.lang.String
*/
public void setBilltype ( java.lang.String billtype) {
this.billtype=billtype;
} 
 
/**
* 属性 transtypecode的Getter方法.属性名：交易类型编码
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getTranstypecode() {
return this.transtypecode;
} 

/**
* 属性transtypecode的Setter方法.属性名：交易类型编码
* 创建日期:2020-5-20
* @param newTranstypecode java.lang.String
*/
public void setTranstypecode ( java.lang.String transtypecode) {
this.transtypecode=transtypecode;
} 
 
/**
* 属性 pk_transtype的Getter方法.属性名：交易类型
*  创建日期:2020-5-20
* @return nc.vo.pub.billtype.BilltypeVO
*/
public java.lang.String getPk_transtype() {
return this.pk_transtype;
} 

/**
* 属性pk_transtype的Setter方法.属性名：交易类型
* 创建日期:2020-5-20
* @param newPk_transtype nc.vo.pub.billtype.BilltypeVO
*/
public void setPk_transtype ( java.lang.String pk_transtype) {
this.pk_transtype=pk_transtype;
} 
 
/**
* 属性 billmaker的Getter方法.属性名：制单人
*  创建日期:2020-5-20
* @return nc.vo.sm.UserVO
*/
public java.lang.String getBillmaker() {
return this.billmaker;
} 

/**
* 属性billmaker的Setter方法.属性名：制单人
* 创建日期:2020-5-20
* @param newBillmaker nc.vo.sm.UserVO
*/
public void setBillmaker ( java.lang.String billmaker) {
this.billmaker=billmaker;
} 
 
/**
* 属性 maketime的Getter方法.属性名：制单时间
*  创建日期:2020-5-20
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getMaketime() {
return this.maketime;
} 

/**
* 属性maketime的Setter方法.属性名：制单时间
* 创建日期:2020-5-20
* @param newMaketime nc.vo.pub.lang.UFDate
*/
public void setMaketime ( UFDate maketime) {
this.maketime=maketime;
} 
 
/**
* 属性 creator的Getter方法.属性名：创建人
*  创建日期:2020-5-20
* @return nc.vo.sm.UserVO
*/
public java.lang.String getCreator() {
return this.creator;
} 

/**
* 属性creator的Setter方法.属性名：创建人
* 创建日期:2020-5-20
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( java.lang.String creator) {
this.creator=creator;
} 
 
/**
* 属性 creationtime的Getter方法.属性名：创建时间
*  创建日期:2020-5-20
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* 属性creationtime的Setter方法.属性名：创建时间
* 创建日期:2020-5-20
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* 属性 modifier的Getter方法.属性名：修改人
*  创建日期:2020-5-20
* @return nc.vo.sm.UserVO
*/
public java.lang.String getModifier() {
return this.modifier;
} 

/**
* 属性modifier的Setter方法.属性名：修改人
* 创建日期:2020-5-20
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( java.lang.String modifier) {
this.modifier=modifier;
} 
 
/**
* 属性 modifiedtime的Getter方法.属性名：修改时间
*  创建日期:2020-5-20
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* 属性modifiedtime的Setter方法.属性名：修改时间
* 创建日期:2020-5-20
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* 属性 approver的Getter方法.属性名：审批人
*  创建日期:2020-5-20
* @return nc.vo.sm.UserVO
*/
public java.lang.String getApprover() {
return this.approver;
} 

/**
* 属性approver的Setter方法.属性名：审批人
* 创建日期:2020-5-20
* @param newApprover nc.vo.sm.UserVO
*/
public void setApprover ( java.lang.String approver) {
this.approver=approver;
} 
 
/**
* 属性 approvestatus的Getter方法.属性名：审批状态
*  创建日期:2020-5-20
* @return nc.vo.pub.pf.BillStatusEnum
*/
public java.lang.Integer getApprovestatus() {
return this.approvestatus;
} 

/**
* 属性approvestatus的Setter方法.属性名：审批状态
* 创建日期:2020-5-20
* @param newApprovestatus nc.vo.pub.pf.BillStatusEnum
*/
public void setApprovestatus ( java.lang.Integer approvestatus) {
this.approvestatus=approvestatus;
} 
 
/**
* 属性 approvenote的Getter方法.属性名：审批批语
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getApprovenote() {
return this.approvenote;
} 

/**
* 属性approvenote的Setter方法.属性名：审批批语
* 创建日期:2020-5-20
* @param newApprovenote java.lang.String
*/
public void setApprovenote ( java.lang.String approvenote) {
this.approvenote=approvenote;
} 
 
/**
* 属性 vnote的Getter方法.属性名：备注
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVnote() {
return this.vnote;
} 

/**
* 属性vnote的Setter方法.属性名：备注
* 创建日期:2020-5-20
* @param newVnote java.lang.String
*/
public void setVnote ( java.lang.String vnote) {
this.vnote=vnote;
} 
 
/**
* 属性 srcbilltype的Getter方法.属性名：来源单据类型
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcbilltype() {
return this.srcbilltype;
} 

/**
* 属性srcbilltype的Setter方法.属性名：来源单据类型
* 创建日期:2020-5-20
* @param newSrcbilltype java.lang.String
*/
public void setSrcbilltype ( java.lang.String srcbilltype) {
this.srcbilltype=srcbilltype;
} 
 
/**
* 属性 srcbillid的Getter方法.属性名：来源单据id
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcbillid() {
return this.srcbillid;
} 

/**
* 属性srcbillid的Setter方法.属性名：来源单据id
* 创建日期:2020-5-20
* @param newSrcbillid java.lang.String
*/
public void setSrcbillid ( java.lang.String srcbillid) {
this.srcbillid=srcbillid;
} 
 
/**
* 属性 srccode的Getter方法.属性名：来源单据号
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrccode() {
return this.srccode;
} 

/**
* 属性srccode的Setter方法.属性名：来源单据号
* 创建日期:2020-5-20
* @param newSrccode java.lang.String
*/
public void setSrccode ( java.lang.String srccode) {
this.srccode=srccode;
} 
 
/**
* 属性 srcid的Getter方法.属性名：来源单据主表id
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcid() {
return this.srcid;
} 

/**
* 属性srcid的Setter方法.属性名：来源单据主表id
* 创建日期:2020-5-20
* @param newSrcid java.lang.String
*/
public void setSrcid ( java.lang.String srcid) {
this.srcid=srcid;
} 
 
/**
* 属性 srcbid的Getter方法.属性名：来源单据子表id
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcbid() {
return this.srcbid;
} 

/**
* 属性srcbid的Setter方法.属性名：来源单据子表id
* 创建日期:2020-5-20
* @param newSrcbid java.lang.String
*/
public void setSrcbid ( java.lang.String srcbid) {
this.srcbid=srcbid;
} 
 
/**
* 属性 srcrowno的Getter方法.属性名：来源单据行号
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcrowno() {
return this.srcrowno;
} 

/**
* 属性srcrowno的Setter方法.属性名：来源单据行号
* 创建日期:2020-5-20
* @param newSrcrowno java.lang.String
*/
public void setSrcrowno ( java.lang.String srcrowno) {
this.srcrowno=srcrowno;
} 
 
/**
* 属性 srctrantype的Getter方法.属性名：来源交易类型
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrctrantype() {
return this.srctrantype;
} 

/**
* 属性srctrantype的Setter方法.属性名：来源交易类型
* 创建日期:2020-5-20
* @param newSrctrantype java.lang.String
*/
public void setSrctrantype ( java.lang.String srctrantype) {
this.srctrantype=srctrantype;
} 
 
/**
* 属性 vfirsttype的Getter方法.属性名：源头单据类型
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirsttype() {
return this.vfirsttype;
} 

/**
* 属性vfirsttype的Setter方法.属性名：源头单据类型
* 创建日期:2020-5-20
* @param newVfirsttype java.lang.String
*/
public void setVfirsttype ( java.lang.String vfirsttype) {
this.vfirsttype=vfirsttype;
} 
 
/**
* 属性 vfirstcode的Getter方法.属性名：源头单据号
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirstcode() {
return this.vfirstcode;
} 

/**
* 属性vfirstcode的Setter方法.属性名：源头单据号
* 创建日期:2020-5-20
* @param newVfirstcode java.lang.String
*/
public void setVfirstcode ( java.lang.String vfirstcode) {
this.vfirstcode=vfirstcode;
} 
 
/**
* 属性 vfirstid的Getter方法.属性名：源头单据主表id
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirstid() {
return this.vfirstid;
} 

/**
* 属性vfirstid的Setter方法.属性名：源头单据主表id
* 创建日期:2020-5-20
* @param newVfirstid java.lang.String
*/
public void setVfirstid ( java.lang.String vfirstid) {
this.vfirstid=vfirstid;
} 
 
/**
* 属性 vfirstbid的Getter方法.属性名：源头单据子表id
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirstbid() {
return this.vfirstbid;
} 

/**
* 属性vfirstbid的Setter方法.属性名：源头单据子表id
* 创建日期:2020-5-20
* @param newVfirstbid java.lang.String
*/
public void setVfirstbid ( java.lang.String vfirstbid) {
this.vfirstbid=vfirstbid;
} 
 
/**
* 属性 vfirstrowno的Getter方法.属性名：源头单据行号
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirstrowno() {
return this.vfirstrowno;
} 

/**
* 属性vfirstrowno的Setter方法.属性名：源头单据行号
* 创建日期:2020-5-20
* @param newVfirstrowno java.lang.String
*/
public void setVfirstrowno ( java.lang.String vfirstrowno) {
this.vfirstrowno=vfirstrowno;
} 
 
/**
* 属性 vfirsttrantype的Getter方法.属性名：源头交易类型
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirsttrantype() {
return this.vfirsttrantype;
} 

/**
* 属性vfirsttrantype的Setter方法.属性名：源头交易类型
* 创建日期:2020-5-20
* @param newVfirsttrantype java.lang.String
*/
public void setVfirsttrantype ( java.lang.String vfirsttrantype) {
this.vfirsttrantype=vfirsttrantype;
} 
 
/**
* 属性 def0的Getter方法.属性名：自定义项0
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef0() {
return this.def0;
} 

/**
* 属性def0的Setter方法.属性名：自定义项0
* 创建日期:2020-5-20
* @param newDef0 java.lang.String
*/
public void setDef0 ( java.lang.String def0) {
this.def0=def0;
} 
 
/**
* 属性 def1的Getter方法.属性名：自定义项1
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef1() {
return this.def1;
} 

/**
* 属性def1的Setter方法.属性名：自定义项1
* 创建日期:2020-5-20
* @param newDef1 java.lang.String
*/
public void setDef1 ( java.lang.String def1) {
this.def1=def1;
} 
 
/**
* 属性 def2的Getter方法.属性名：自定义项2
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef2() {
return this.def2;
} 

/**
* 属性def2的Setter方法.属性名：自定义项2
* 创建日期:2020-5-20
* @param newDef2 java.lang.String
*/
public void setDef2 ( java.lang.String def2) {
this.def2=def2;
} 
 
/**
* 属性 def3的Getter方法.属性名：自定义项3
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef3() {
return this.def3;
} 

/**
* 属性def3的Setter方法.属性名：自定义项3
* 创建日期:2020-5-20
* @param newDef3 java.lang.String
*/
public void setDef3 ( java.lang.String def3) {
this.def3=def3;
} 
 
/**
* 属性 def4的Getter方法.属性名：自定义项4
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef4() {
return this.def4;
} 

/**
* 属性def4的Setter方法.属性名：自定义项4
* 创建日期:2020-5-20
* @param newDef4 java.lang.String
*/
public void setDef4 ( java.lang.String def4) {
this.def4=def4;
} 
 
/**
* 属性 def5的Getter方法.属性名：自定义项5
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef5() {
return this.def5;
} 

/**
* 属性def5的Setter方法.属性名：自定义项5
* 创建日期:2020-5-20
* @param newDef5 java.lang.String
*/
public void setDef5 ( java.lang.String def5) {
this.def5=def5;
} 
 
/**
* 属性 def6的Getter方法.属性名：自定义项6
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef6() {
return this.def6;
} 

/**
* 属性def6的Setter方法.属性名：自定义项6
* 创建日期:2020-5-20
* @param newDef6 java.lang.String
*/
public void setDef6 ( java.lang.String def6) {
this.def6=def6;
} 
 
/**
* 属性 def7的Getter方法.属性名：自定义项7
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef7() {
return this.def7;
} 

/**
* 属性def7的Setter方法.属性名：自定义项7
* 创建日期:2020-5-20
* @param newDef7 java.lang.String
*/
public void setDef7 ( java.lang.String def7) {
this.def7=def7;
} 
 
/**
* 属性 def8的Getter方法.属性名：自定义项8
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef8() {
return this.def8;
} 

/**
* 属性def8的Setter方法.属性名：自定义项8
* 创建日期:2020-5-20
* @param newDef8 java.lang.String
*/
public void setDef8 ( java.lang.String def8) {
this.def8=def8;
} 
 
/**
* 属性 def10的Getter方法.属性名：自定义项10
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef10() {
return this.def10;
} 

/**
* 属性def10的Setter方法.属性名：自定义项10
* 创建日期:2020-5-20
* @param newDef10 java.lang.String
*/
public void setDef10 ( java.lang.String def10) {
this.def10=def10;
} 
 
/**
* 属性 def11的Getter方法.属性名：自定义项11
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef11() {
return this.def11;
} 

/**
* 属性def11的Setter方法.属性名：自定义项11
* 创建日期:2020-5-20
* @param newDef11 java.lang.String
*/
public void setDef11 ( java.lang.String def11) {
this.def11=def11;
} 
 
/**
* 属性 def12的Getter方法.属性名：自定义项12
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef12() {
return this.def12;
} 

/**
* 属性def12的Setter方法.属性名：自定义项12
* 创建日期:2020-5-20
* @param newDef12 java.lang.String
*/
public void setDef12 ( java.lang.String def12) {
this.def12=def12;
} 
 
/**
* 属性 def13的Getter方法.属性名：自定义项13
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef13() {
return this.def13;
} 

/**
* 属性def13的Setter方法.属性名：自定义项13
* 创建日期:2020-5-20
* @param newDef13 java.lang.String
*/
public void setDef13 ( java.lang.String def13) {
this.def13=def13;
} 
 
/**
* 属性 def14的Getter方法.属性名：自定义项14
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef14() {
return this.def14;
} 

/**
* 属性def14的Setter方法.属性名：自定义项14
* 创建日期:2020-5-20
* @param newDef14 java.lang.String
*/
public void setDef14 ( java.lang.String def14) {
this.def14=def14;
} 
 
/**
* 属性 def15的Getter方法.属性名：自定义项15
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef15() {
return this.def15;
} 

/**
* 属性def15的Setter方法.属性名：自定义项15
* 创建日期:2020-5-20
* @param newDef15 java.lang.String
*/
public void setDef15 ( java.lang.String def15) {
this.def15=def15;
} 
 
/**
* 属性 def16的Getter方法.属性名：自定义项16
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef16() {
return this.def16;
} 

/**
* 属性def16的Setter方法.属性名：自定义项16
* 创建日期:2020-5-20
* @param newDef16 java.lang.String
*/
public void setDef16 ( java.lang.String def16) {
this.def16=def16;
} 
 
/**
* 属性 def17的Getter方法.属性名：自定义项17
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef17() {
return this.def17;
} 

/**
* 属性def17的Setter方法.属性名：自定义项17
* 创建日期:2020-5-20
* @param newDef17 java.lang.String
*/
public void setDef17 ( java.lang.String def17) {
this.def17=def17;
} 
 
/**
* 属性 def18的Getter方法.属性名：自定义项18
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef18() {
return this.def18;
} 

/**
* 属性def18的Setter方法.属性名：自定义项18
* 创建日期:2020-5-20
* @param newDef18 java.lang.String
*/
public void setDef18 ( java.lang.String def18) {
this.def18=def18;
} 
 
/**
* 属性 def19的Getter方法.属性名：自定义项19
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef19() {
return this.def19;
} 

/**
* 属性def19的Setter方法.属性名：自定义项19
* 创建日期:2020-5-20
* @param newDef19 java.lang.String
*/
public void setDef19 ( java.lang.String def19) {
this.def19=def19;
} 
 
/**
* 属性 def20的Getter方法.属性名：自定义项20
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef20() {
return this.def20;
} 

/**
* 属性def20的Setter方法.属性名：自定义项20
* 创建日期:2020-5-20
* @param newDef20 java.lang.String
*/
public void setDef20 ( java.lang.String def20) {
this.def20=def20;
} 
 
/**
* 属性 def21的Getter方法.属性名：自定义项21
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef21() {
return this.def21;
} 

/**
* 属性def21的Setter方法.属性名：自定义项21
* 创建日期:2020-5-20
* @param newDef21 java.lang.String
*/
public void setDef21 ( java.lang.String def21) {
this.def21=def21;
} 
 
/**
* 属性 def22的Getter方法.属性名：自定义项22
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef22() {
return this.def22;
} 

/**
* 属性def22的Setter方法.属性名：自定义项22
* 创建日期:2020-5-20
* @param newDef22 java.lang.String
*/
public void setDef22 ( java.lang.String def22) {
this.def22=def22;
} 
 
/**
* 属性 def23的Getter方法.属性名：自定义项23
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef23() {
return this.def23;
} 

/**
* 属性def23的Setter方法.属性名：自定义项23
* 创建日期:2020-5-20
* @param newDef23 java.lang.String
*/
public void setDef23 ( java.lang.String def23) {
this.def23=def23;
} 
 
/**
* 属性 def24的Getter方法.属性名：自定义项24
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef24() {
return this.def24;
} 

/**
* 属性def24的Setter方法.属性名：自定义项24
* 创建日期:2020-5-20
* @param newDef24 java.lang.String
*/
public void setDef24 ( java.lang.String def24) {
this.def24=def24;
} 
 
/**
* 属性 def25的Getter方法.属性名：自定义项25
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef25() {
return this.def25;
} 

/**
* 属性def25的Setter方法.属性名：自定义项25
* 创建日期:2020-5-20
* @param newDef25 java.lang.String
*/
public void setDef25 ( java.lang.String def25) {
this.def25=def25;
} 
 
/**
* 属性 def26的Getter方法.属性名：自定义项26
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef26() {
return this.def26;
} 

/**
* 属性def26的Setter方法.属性名：自定义项26
* 创建日期:2020-5-20
* @param newDef26 java.lang.String
*/
public void setDef26 ( java.lang.String def26) {
this.def26=def26;
} 
 
/**
* 属性 def27的Getter方法.属性名：自定义项27
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef27() {
return this.def27;
} 

/**
* 属性def27的Setter方法.属性名：自定义项27
* 创建日期:2020-5-20
* @param newDef27 java.lang.String
*/
public void setDef27 ( java.lang.String def27) {
this.def27=def27;
} 
 
/**
* 属性 def28的Getter方法.属性名：自定义项28
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef28() {
return this.def28;
} 

/**
* 属性def28的Setter方法.属性名：自定义项28
* 创建日期:2020-5-20
* @param newDef28 java.lang.String
*/
public void setDef28 ( java.lang.String def28) {
this.def28=def28;
} 
 
/**
* 属性 def29的Getter方法.属性名：自定义项29
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef29() {
return this.def29;
} 

/**
* 属性def29的Setter方法.属性名：自定义项29
* 创建日期:2020-5-20
* @param newDef29 java.lang.String
*/
public void setDef29 ( java.lang.String def29) {
this.def29=def29;
} 
 
/**
* 属性 def30的Getter方法.属性名：自定义项30
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef30() {
return this.def30;
} 

/**
* 属性def30的Setter方法.属性名：自定义项30
* 创建日期:2020-5-20
* @param newDef30 java.lang.String
*/
public void setDef30 ( java.lang.String def30) {
this.def30=def30;
} 
 
/**
* 属性 def31的Getter方法.属性名：自定义项31
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef31() {
return this.def31;
} 

/**
* 属性def31的Setter方法.属性名：自定义项31
* 创建日期:2020-5-20
* @param newDef31 java.lang.String
*/
public void setDef31 ( java.lang.String def31) {
this.def31=def31;
} 
 
/**
* 属性 def32的Getter方法.属性名：自定义项32
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef32() {
return this.def32;
} 

/**
* 属性def32的Setter方法.属性名：自定义项32
* 创建日期:2020-5-20
* @param newDef32 java.lang.String
*/
public void setDef32 ( java.lang.String def32) {
this.def32=def32;
} 
 
/**
* 属性 def33的Getter方法.属性名：自定义项33
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef33() {
return this.def33;
} 

/**
* 属性def33的Setter方法.属性名：自定义项33
* 创建日期:2020-5-20
* @param newDef33 java.lang.String
*/
public void setDef33 ( java.lang.String def33) {
this.def33=def33;
} 
 
/**
* 属性 def34的Getter方法.属性名：自定义项34
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef34() {
return this.def34;
} 

/**
* 属性def34的Setter方法.属性名：自定义项34
* 创建日期:2020-5-20
* @param newDef34 java.lang.String
*/
public void setDef34 ( java.lang.String def34) {
this.def34=def34;
} 
 
/**
* 属性 def35的Getter方法.属性名：自定义项35
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef35() {
return this.def35;
} 

/**
* 属性def35的Setter方法.属性名：自定义项35
* 创建日期:2020-5-20
* @param newDef35 java.lang.String
*/
public void setDef35 ( java.lang.String def35) {
this.def35=def35;
} 
 
/**
* 属性 def36的Getter方法.属性名：自定义项36
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef36() {
return this.def36;
} 

/**
* 属性def36的Setter方法.属性名：自定义项36
* 创建日期:2020-5-20
* @param newDef36 java.lang.String
*/
public void setDef36 ( java.lang.String def36) {
this.def36=def36;
} 
 
/**
* 属性 def37的Getter方法.属性名：自定义项37
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef37() {
return this.def37;
} 

/**
* 属性def37的Setter方法.属性名：自定义项37
* 创建日期:2020-5-20
* @param newDef37 java.lang.String
*/
public void setDef37 ( java.lang.String def37) {
this.def37=def37;
} 
 
/**
* 属性 def38的Getter方法.属性名：自定义项38
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef38() {
return this.def38;
} 

/**
* 属性def38的Setter方法.属性名：自定义项38
* 创建日期:2020-5-20
* @param newDef38 java.lang.String
*/
public void setDef38 ( java.lang.String def38) {
this.def38=def38;
} 
 
/**
* 属性 def39的Getter方法.属性名：自定义项39
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef39() {
return this.def39;
} 

/**
* 属性def39的Setter方法.属性名：自定义项39
* 创建日期:2020-5-20
* @param newDef39 java.lang.String
*/
public void setDef39 ( java.lang.String def39) {
this.def39=def39;
} 
 
/**
* 属性 def40的Getter方法.属性名：自定义项40
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef40() {
return this.def40;
} 

/**
* 属性def40的Setter方法.属性名：自定义项40
* 创建日期:2020-5-20
* @param newDef40 java.lang.String
*/
public void setDef40 ( java.lang.String def40) {
this.def40=def40;
} 
 
/**
* 属性 def41的Getter方法.属性名：自定义项41
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef41() {
return this.def41;
} 

/**
* 属性def41的Setter方法.属性名：自定义项41
* 创建日期:2020-5-20
* @param newDef41 java.lang.String
*/
public void setDef41 ( java.lang.String def41) {
this.def41=def41;
} 
 
/**
* 属性 def42的Getter方法.属性名：自定义项42
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef42() {
return this.def42;
} 

/**
* 属性def42的Setter方法.属性名：自定义项42
* 创建日期:2020-5-20
* @param newDef42 java.lang.String
*/
public void setDef42 ( java.lang.String def42) {
this.def42=def42;
} 
 
/**
* 属性 def43的Getter方法.属性名：自定义项43
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef43() {
return this.def43;
} 

/**
* 属性def43的Setter方法.属性名：自定义项43
* 创建日期:2020-5-20
* @param newDef43 java.lang.String
*/
public void setDef43 ( java.lang.String def43) {
this.def43=def43;
} 
 
/**
* 属性 def44的Getter方法.属性名：自定义项44
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef44() {
return this.def44;
} 

/**
* 属性def44的Setter方法.属性名：自定义项44
* 创建日期:2020-5-20
* @param newDef44 java.lang.String
*/
public void setDef44 ( java.lang.String def44) {
this.def44=def44;
} 
 
/**
* 属性 def45的Getter方法.属性名：自定义项45
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef45() {
return this.def45;
} 

/**
* 属性def45的Setter方法.属性名：自定义项45
* 创建日期:2020-5-20
* @param newDef45 java.lang.String
*/
public void setDef45 ( java.lang.String def45) {
this.def45=def45;
} 
 
/**
* 属性 def46的Getter方法.属性名：自定义项46
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef46() {
return this.def46;
} 

/**
* 属性def46的Setter方法.属性名：自定义项46
* 创建日期:2020-5-20
* @param newDef46 java.lang.String
*/
public void setDef46 ( java.lang.String def46) {
this.def46=def46;
} 
 
/**
* 属性 def47的Getter方法.属性名：自定义项47
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef47() {
return this.def47;
} 

/**
* 属性def47的Setter方法.属性名：自定义项47
* 创建日期:2020-5-20
* @param newDef47 java.lang.String
*/
public void setDef47 ( java.lang.String def47) {
this.def47=def47;
} 
 
/**
* 属性 def48的Getter方法.属性名：自定义项48
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef48() {
return this.def48;
} 

/**
* 属性def48的Setter方法.属性名：自定义项48
* 创建日期:2020-5-20
* @param newDef48 java.lang.String
*/
public void setDef48 ( java.lang.String def48) {
this.def48=def48;
} 
 
/**
* 属性 def49的Getter方法.属性名：自定义项49
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef49() {
return this.def49;
} 

/**
* 属性def49的Setter方法.属性名：自定义项49
* 创建日期:2020-5-20
* @param newDef49 java.lang.String
*/
public void setDef49 ( java.lang.String def49) {
this.def49=def49;
} 
 
/**
* 属性 def50的Getter方法.属性名：自定义项50
*  创建日期:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef50() {
return this.def50;
} 

/**
* 属性def50的Setter方法.属性名：自定义项50
* 创建日期:2020-5-20
* @param newDef50 java.lang.String
*/
public void setDef50 ( java.lang.String def50) {
this.def50=def50;
} 
 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2020-5-20
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2020-5-20
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("adprepare.tendaysprojplanHVO");
    }
   }
    