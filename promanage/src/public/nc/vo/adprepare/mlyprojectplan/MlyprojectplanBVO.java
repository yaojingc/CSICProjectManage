package nc.vo.adprepare.mlyprojectplan;

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
 *  创建日期:2020-6-19
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class MlyprojectplanBVO extends SuperVO {
	
/**
*计划条目主键
*/
public java.lang.String pk_time_plan_item;
/**
*行号
*/
public java.lang.String rowno;
/**
*级内序号
*/
public java.lang.Integer seq;
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
*任务名称
*/
public java.lang.String name;
/**
*任务描述
*/
public java.lang.String description;
/**
*责任部门最新
*/
public java.lang.String pk_duty_dept;
/**
*责任部门
*/
public java.lang.String pk_duty_dept_v;
/**
*责任人
*/
public java.lang.String pk_dutier;
/**
*计划开始日期
*/
public nc.vo.pub.lang.UFDate plan_start_date;
/**
*计划截止日期
*/
public nc.vo.pub.lang.UFDate plan_end_date;
/**
*备注
*/
public java.lang.String memo;
/**
*父主键
*/
public java.lang.String pk_parent;
/**
*内码
*/
public java.lang.String innercode;
/**
*工期
*/
public java.lang.Integer duration;
/**
*里程碑
*/
public UFBoolean milestone;
/**
*版本号
*/
public java.lang.Integer version;
/**
*最新版本号
*/
public java.lang.Integer max_version;
/**
*前置任务
*/
public java.lang.String pk_front_plan;
/**
*模板主键
*/
public java.lang.String pk_temp_b;
/**
*生效条目主键
*/
public java.lang.String pk_origin_item;
/**
*任务编码
*/
public java.lang.String full_seq;
/**
*级次
*/
public java.lang.String plan_level;
/**
*叶子节点
*/
public UFBoolean leaf;
/**
*进度记录
*/
public java.lang.String pk_progress;
/**
*项目
*/
public java.lang.String pk_project;
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
*自定义项9
*/
public java.lang.String def9;
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
*上层单据主键
*/
public String pk_time_plan;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_time_plan_item的Getter方法.属性名：计划条目主键
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getPk_time_plan_item() {
return this.pk_time_plan_item;
} 

/**
* 属性pk_time_plan_item的Setter方法.属性名：计划条目主键
* 创建日期:2020-6-19
* @param newPk_time_plan_item java.lang.String
*/
public void setPk_time_plan_item ( java.lang.String pk_time_plan_item) {
this.pk_time_plan_item=pk_time_plan_item;
} 
 
/**
* 属性 rowno的Getter方法.属性名：行号
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getRowno() {
return this.rowno;
} 

/**
* 属性rowno的Setter方法.属性名：行号
* 创建日期:2020-6-19
* @param newRowno java.lang.String
*/
public void setRowno ( java.lang.String rowno) {
this.rowno=rowno;
} 
 
/**
* 属性 seq的Getter方法.属性名：级内序号
*  创建日期:2020-6-19
* @return java.lang.Integer
*/
public java.lang.Integer getSeq() {
return this.seq;
} 

/**
* 属性seq的Setter方法.属性名：级内序号
* 创建日期:2020-6-19
* @param newSeq java.lang.Integer
*/
public void setSeq ( java.lang.Integer seq) {
this.seq=seq;
} 
 
/**
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2020-6-19
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2020-6-19
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 pk_org的Getter方法.属性名：组织最新版本
*  创建日期:2020-6-19
* @return nc.vo.org.ItemOrgVO
*/
public java.lang.String getPk_org() {
return this.pk_org;
} 

/**
* 属性pk_org的Setter方法.属性名：组织最新版本
* 创建日期:2020-6-19
* @param newPk_org nc.vo.org.ItemOrgVO
*/
public void setPk_org ( java.lang.String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* 属性 pk_org_v的Getter方法.属性名：组织
*  创建日期:2020-6-19
* @return nc.vo.vorg.ItemOrgVersionVO
*/
public java.lang.String getPk_org_v() {
return this.pk_org_v;
} 

/**
* 属性pk_org_v的Setter方法.属性名：组织
* 创建日期:2020-6-19
* @param newPk_org_v nc.vo.vorg.ItemOrgVersionVO
*/
public void setPk_org_v ( java.lang.String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* 属性 name的Getter方法.属性名：任务名称
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getName() {
return this.name;
} 

/**
* 属性name的Setter方法.属性名：任务名称
* 创建日期:2020-6-19
* @param newName java.lang.String
*/
public void setName ( java.lang.String name) {
this.name=name;
} 
 
/**
* 属性 description的Getter方法.属性名：任务描述
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDescription() {
return this.description;
} 

/**
* 属性description的Setter方法.属性名：任务描述
* 创建日期:2020-6-19
* @param newDescription java.lang.String
*/
public void setDescription ( java.lang.String description) {
this.description=description;
} 
 
/**
* 属性 pk_duty_dept的Getter方法.属性名：责任部门最新
*  创建日期:2020-6-19
* @return nc.vo.org.DeptVO
*/
public java.lang.String getPk_duty_dept() {
return this.pk_duty_dept;
} 

/**
* 属性pk_duty_dept的Setter方法.属性名：责任部门最新
* 创建日期:2020-6-19
* @param newPk_duty_dept nc.vo.org.DeptVO
*/
public void setPk_duty_dept ( java.lang.String pk_duty_dept) {
this.pk_duty_dept=pk_duty_dept;
} 
 
/**
* 属性 pk_duty_dept_v的Getter方法.属性名：责任部门
*  创建日期:2020-6-19
* @return nc.vo.vorg.DeptVersionVO
*/
public java.lang.String getPk_duty_dept_v() {
return this.pk_duty_dept_v;
} 

/**
* 属性pk_duty_dept_v的Setter方法.属性名：责任部门
* 创建日期:2020-6-19
* @param newPk_duty_dept_v nc.vo.vorg.DeptVersionVO
*/
public void setPk_duty_dept_v ( java.lang.String pk_duty_dept_v) {
this.pk_duty_dept_v=pk_duty_dept_v;
} 
 
/**
* 属性 pk_dutier的Getter方法.属性名：责任人
*  创建日期:2020-6-19
* @return nc.vo.bd.psn.PsndocVO
*/
public java.lang.String getPk_dutier() {
return this.pk_dutier;
} 

/**
* 属性pk_dutier的Setter方法.属性名：责任人
* 创建日期:2020-6-19
* @param newPk_dutier nc.vo.bd.psn.PsndocVO
*/
public void setPk_dutier ( java.lang.String pk_dutier) {
this.pk_dutier=pk_dutier;
} 
 
/**
* 属性 plan_start_date的Getter方法.属性名：计划开始日期
*  创建日期:2020-6-19
* @return nc.vo.pub.lang.UFDate
*/
public nc.vo.pub.lang.UFDate getPlan_start_date() {
return this.plan_start_date;
} 

/**
* 属性plan_start_date的Setter方法.属性名：计划开始日期
* 创建日期:2020-6-19
* @param newPlan_start_date nc.vo.pub.lang.UFDate
*/
public void setPlan_start_date ( nc.vo.pub.lang.UFDate plan_start_date) {
this.plan_start_date=plan_start_date;
} 
 
/**
* 属性 plan_end_date的Getter方法.属性名：计划截止日期
*  创建日期:2020-6-19
* @return java.lang.Integer
*/
public nc.vo.pub.lang.UFDate getPlan_end_date() {
return this.plan_end_date;
} 

/**
* 属性plan_end_date的Setter方法.属性名：计划截止日期
* 创建日期:2020-6-19
* @param newPlan_end_date java.lang.Integer
*/
public void setPlan_end_date ( nc.vo.pub.lang.UFDate plan_end_date) {
this.plan_end_date=plan_end_date;
} 
 
/**
* 属性 memo的Getter方法.属性名：备注
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getMemo() {
return this.memo;
} 

/**
* 属性memo的Setter方法.属性名：备注
* 创建日期:2020-6-19
* @param newMemo java.lang.String
*/
public void setMemo ( java.lang.String memo) {
this.memo=memo;
} 
 
/**
* 属性 pk_parent的Getter方法.属性名：父主键
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getPk_parent() {
return this.pk_parent;
} 

/**
* 属性pk_parent的Setter方法.属性名：父主键
* 创建日期:2020-6-19
* @param newPk_parent java.lang.String
*/
public void setPk_parent ( java.lang.String pk_parent) {
this.pk_parent=pk_parent;
} 
 
/**
* 属性 innercode的Getter方法.属性名：内码
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getInnercode() {
return this.innercode;
} 

/**
* 属性innercode的Setter方法.属性名：内码
* 创建日期:2020-6-19
* @param newInnercode java.lang.String
*/
public void setInnercode ( java.lang.String innercode) {
this.innercode=innercode;
} 
 
/**
* 属性 duration的Getter方法.属性名：工期
*  创建日期:2020-6-19
* @return java.lang.Integer
*/
public java.lang.Integer getDuration() {
return this.duration;
} 

/**
* 属性duration的Setter方法.属性名：工期
* 创建日期:2020-6-19
* @param newDuration java.lang.Integer
*/
public void setDuration ( java.lang.Integer duration) {
this.duration=duration;
} 
 
/**
* 属性 milestone的Getter方法.属性名：里程碑
*  创建日期:2020-6-19
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getMilestone() {
return this.milestone;
} 

/**
* 属性milestone的Setter方法.属性名：里程碑
* 创建日期:2020-6-19
* @param newMilestone nc.vo.pub.lang.UFBoolean
*/
public void setMilestone ( UFBoolean milestone) {
this.milestone=milestone;
} 
 
/**
* 属性 version的Getter方法.属性名：版本号
*  创建日期:2020-6-19
* @return java.lang.Integer
*/
public java.lang.Integer getVersion() {
return this.version;
} 

/**
* 属性version的Setter方法.属性名：版本号
* 创建日期:2020-6-19
* @param newVersion java.lang.Integer
*/
public void setVersion ( java.lang.Integer version) {
this.version=version;
} 
 
/**
* 属性 max_version的Getter方法.属性名：最新版本号
*  创建日期:2020-6-19
* @return java.lang.Integer
*/
public java.lang.Integer getMax_version() {
return this.max_version;
} 

/**
* 属性max_version的Setter方法.属性名：最新版本号
* 创建日期:2020-6-19
* @param newMax_version java.lang.Integer
*/
public void setMax_version ( java.lang.Integer max_version) {
this.max_version=max_version;
} 
 
/**
* 属性 pk_front_plan的Getter方法.属性名：前置任务
*  创建日期:2020-6-19
* @return nc.vo.pmsch.plan.TimePlanItemVO
*/
public java.lang.String getPk_front_plan() {
return this.pk_front_plan;
} 

/**
* 属性pk_front_plan的Setter方法.属性名：前置任务
* 创建日期:2020-6-19
* @param newPk_front_plan nc.vo.pmsch.plan.TimePlanItemVO
*/
public void setPk_front_plan ( java.lang.String pk_front_plan) {
this.pk_front_plan=pk_front_plan;
} 
 
/**
* 属性 pk_temp_b的Getter方法.属性名：模板主键
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getPk_temp_b() {
return this.pk_temp_b;
} 

/**
* 属性pk_temp_b的Setter方法.属性名：模板主键
* 创建日期:2020-6-19
* @param newPk_temp_b java.lang.String
*/
public void setPk_temp_b ( java.lang.String pk_temp_b) {
this.pk_temp_b=pk_temp_b;
} 
 
/**
* 属性 pk_origin_item的Getter方法.属性名：生效条目主键
*  创建日期:2020-6-19
* @return nc.vo.pmsch.plan.TimePlanItemVO
*/
public java.lang.String getPk_origin_item() {
return this.pk_origin_item;
} 

/**
* 属性pk_origin_item的Setter方法.属性名：生效条目主键
* 创建日期:2020-6-19
* @param newPk_origin_item nc.vo.pmsch.plan.TimePlanItemVO
*/
public void setPk_origin_item ( java.lang.String pk_origin_item) {
this.pk_origin_item=pk_origin_item;
} 
 
/**
* 属性 full_seq的Getter方法.属性名：任务编码
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getFull_seq() {
return this.full_seq;
} 

/**
* 属性full_seq的Setter方法.属性名：任务编码
* 创建日期:2020-6-19
* @param newFull_seq java.lang.String
*/
public void setFull_seq ( java.lang.String full_seq) {
this.full_seq=full_seq;
} 
 
/**
* 属性 plan_level的Getter方法.属性名：级次
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getPlan_level() {
return this.plan_level;
} 

/**
* 属性plan_level的Setter方法.属性名：级次
* 创建日期:2020-6-19
* @param newPlan_level java.lang.String
*/
public void setPlan_level ( java.lang.String plan_level) {
this.plan_level=plan_level;
} 
 
/**
* 属性 leaf的Getter方法.属性名：叶子节点
*  创建日期:2020-6-19
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getLeaf() {
return this.leaf;
} 

/**
* 属性leaf的Setter方法.属性名：叶子节点
* 创建日期:2020-6-19
* @param newLeaf nc.vo.pub.lang.UFBoolean
*/
public void setLeaf ( UFBoolean leaf) {
this.leaf=leaf;
} 
 
/**
* 属性 pk_progress的Getter方法.属性名：进度记录
*  创建日期:2020-6-19
* @return nc.vo.pmsch.plan.progress.TimeProgressItemVO
*/
public java.lang.String getPk_progress() {
return this.pk_progress;
} 

/**
* 属性pk_progress的Setter方法.属性名：进度记录
* 创建日期:2020-6-19
* @param newPk_progress nc.vo.pmsch.plan.progress.TimeProgressItemVO
*/
public void setPk_progress ( java.lang.String pk_progress) {
this.pk_progress=pk_progress;
} 
 
/**
* 属性 pk_project的Getter方法.属性名：项目
*  创建日期:2020-6-19
* @return nc.vo.pmpub.project.ProjectHeadVO
*/
public java.lang.String getPk_project() {
return this.pk_project;
} 

/**
* 属性pk_project的Setter方法.属性名：项目
* 创建日期:2020-6-19
* @param newPk_project nc.vo.pmpub.project.ProjectHeadVO
*/
public void setPk_project ( java.lang.String pk_project) {
this.pk_project=pk_project;
} 
 
/**
* 属性 def1的Getter方法.属性名：自定义项1
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef1() {
return this.def1;
} 

/**
* 属性def1的Setter方法.属性名：自定义项1
* 创建日期:2020-6-19
* @param newDef1 java.lang.String
*/
public void setDef1 ( java.lang.String def1) {
this.def1=def1;
} 
 
/**
* 属性 def2的Getter方法.属性名：自定义项2
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef2() {
return this.def2;
} 

/**
* 属性def2的Setter方法.属性名：自定义项2
* 创建日期:2020-6-19
* @param newDef2 java.lang.String
*/
public void setDef2 ( java.lang.String def2) {
this.def2=def2;
} 
 
/**
* 属性 def3的Getter方法.属性名：自定义项3
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef3() {
return this.def3;
} 

/**
* 属性def3的Setter方法.属性名：自定义项3
* 创建日期:2020-6-19
* @param newDef3 java.lang.String
*/
public void setDef3 ( java.lang.String def3) {
this.def3=def3;
} 
 
/**
* 属性 def4的Getter方法.属性名：自定义项4
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef4() {
return this.def4;
} 

/**
* 属性def4的Setter方法.属性名：自定义项4
* 创建日期:2020-6-19
* @param newDef4 java.lang.String
*/
public void setDef4 ( java.lang.String def4) {
this.def4=def4;
} 
 
/**
* 属性 def5的Getter方法.属性名：自定义项5
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef5() {
return this.def5;
} 

/**
* 属性def5的Setter方法.属性名：自定义项5
* 创建日期:2020-6-19
* @param newDef5 java.lang.String
*/
public void setDef5 ( java.lang.String def5) {
this.def5=def5;
} 
 
/**
* 属性 def6的Getter方法.属性名：自定义项6
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef6() {
return this.def6;
} 

/**
* 属性def6的Setter方法.属性名：自定义项6
* 创建日期:2020-6-19
* @param newDef6 java.lang.String
*/
public void setDef6 ( java.lang.String def6) {
this.def6=def6;
} 
 
/**
* 属性 def7的Getter方法.属性名：自定义项7
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef7() {
return this.def7;
} 

/**
* 属性def7的Setter方法.属性名：自定义项7
* 创建日期:2020-6-19
* @param newDef7 java.lang.String
*/
public void setDef7 ( java.lang.String def7) {
this.def7=def7;
} 
 
/**
* 属性 def8的Getter方法.属性名：自定义项8
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef8() {
return this.def8;
} 

/**
* 属性def8的Setter方法.属性名：自定义项8
* 创建日期:2020-6-19
* @param newDef8 java.lang.String
*/
public void setDef8 ( java.lang.String def8) {
this.def8=def8;
} 
 
/**
* 属性 def9的Getter方法.属性名：自定义项9
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef9() {
return this.def9;
} 

/**
* 属性def9的Setter方法.属性名：自定义项9
* 创建日期:2020-6-19
* @param newDef9 java.lang.String
*/
public void setDef9 ( java.lang.String def9) {
this.def9=def9;
} 
 
/**
* 属性 def10的Getter方法.属性名：自定义项10
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef10() {
return this.def10;
} 

/**
* 属性def10的Setter方法.属性名：自定义项10
* 创建日期:2020-6-19
* @param newDef10 java.lang.String
*/
public void setDef10 ( java.lang.String def10) {
this.def10=def10;
} 
 
/**
* 属性 def11的Getter方法.属性名：自定义项11
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef11() {
return this.def11;
} 

/**
* 属性def11的Setter方法.属性名：自定义项11
* 创建日期:2020-6-19
* @param newDef11 java.lang.String
*/
public void setDef11 ( java.lang.String def11) {
this.def11=def11;
} 
 
/**
* 属性 def12的Getter方法.属性名：自定义项12
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef12() {
return this.def12;
} 

/**
* 属性def12的Setter方法.属性名：自定义项12
* 创建日期:2020-6-19
* @param newDef12 java.lang.String
*/
public void setDef12 ( java.lang.String def12) {
this.def12=def12;
} 
 
/**
* 属性 def13的Getter方法.属性名：自定义项13
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef13() {
return this.def13;
} 

/**
* 属性def13的Setter方法.属性名：自定义项13
* 创建日期:2020-6-19
* @param newDef13 java.lang.String
*/
public void setDef13 ( java.lang.String def13) {
this.def13=def13;
} 
 
/**
* 属性 def14的Getter方法.属性名：自定义项14
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef14() {
return this.def14;
} 

/**
* 属性def14的Setter方法.属性名：自定义项14
* 创建日期:2020-6-19
* @param newDef14 java.lang.String
*/
public void setDef14 ( java.lang.String def14) {
this.def14=def14;
} 
 
/**
* 属性 def15的Getter方法.属性名：自定义项15
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef15() {
return this.def15;
} 

/**
* 属性def15的Setter方法.属性名：自定义项15
* 创建日期:2020-6-19
* @param newDef15 java.lang.String
*/
public void setDef15 ( java.lang.String def15) {
this.def15=def15;
} 
 
/**
* 属性 def16的Getter方法.属性名：自定义项16
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef16() {
return this.def16;
} 

/**
* 属性def16的Setter方法.属性名：自定义项16
* 创建日期:2020-6-19
* @param newDef16 java.lang.String
*/
public void setDef16 ( java.lang.String def16) {
this.def16=def16;
} 
 
/**
* 属性 def17的Getter方法.属性名：自定义项17
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef17() {
return this.def17;
} 

/**
* 属性def17的Setter方法.属性名：自定义项17
* 创建日期:2020-6-19
* @param newDef17 java.lang.String
*/
public void setDef17 ( java.lang.String def17) {
this.def17=def17;
} 
 
/**
* 属性 def18的Getter方法.属性名：自定义项18
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef18() {
return this.def18;
} 

/**
* 属性def18的Setter方法.属性名：自定义项18
* 创建日期:2020-6-19
* @param newDef18 java.lang.String
*/
public void setDef18 ( java.lang.String def18) {
this.def18=def18;
} 
 
/**
* 属性 def19的Getter方法.属性名：自定义项19
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef19() {
return this.def19;
} 

/**
* 属性def19的Setter方法.属性名：自定义项19
* 创建日期:2020-6-19
* @param newDef19 java.lang.String
*/
public void setDef19 ( java.lang.String def19) {
this.def19=def19;
} 
 
/**
* 属性 def20的Getter方法.属性名：自定义项20
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef20() {
return this.def20;
} 

/**
* 属性def20的Setter方法.属性名：自定义项20
* 创建日期:2020-6-19
* @param newDef20 java.lang.String
*/
public void setDef20 ( java.lang.String def20) {
this.def20=def20;
} 
 
/**
* 属性 def21的Getter方法.属性名：自定义项21
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef21() {
return this.def21;
} 

/**
* 属性def21的Setter方法.属性名：自定义项21
* 创建日期:2020-6-19
* @param newDef21 java.lang.String
*/
public void setDef21 ( java.lang.String def21) {
this.def21=def21;
} 
 
/**
* 属性 def22的Getter方法.属性名：自定义项22
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef22() {
return this.def22;
} 

/**
* 属性def22的Setter方法.属性名：自定义项22
* 创建日期:2020-6-19
* @param newDef22 java.lang.String
*/
public void setDef22 ( java.lang.String def22) {
this.def22=def22;
} 
 
/**
* 属性 def23的Getter方法.属性名：自定义项23
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef23() {
return this.def23;
} 

/**
* 属性def23的Setter方法.属性名：自定义项23
* 创建日期:2020-6-19
* @param newDef23 java.lang.String
*/
public void setDef23 ( java.lang.String def23) {
this.def23=def23;
} 
 
/**
* 属性 def24的Getter方法.属性名：自定义项24
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef24() {
return this.def24;
} 

/**
* 属性def24的Setter方法.属性名：自定义项24
* 创建日期:2020-6-19
* @param newDef24 java.lang.String
*/
public void setDef24 ( java.lang.String def24) {
this.def24=def24;
} 
 
/**
* 属性 def25的Getter方法.属性名：自定义项25
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef25() {
return this.def25;
} 

/**
* 属性def25的Setter方法.属性名：自定义项25
* 创建日期:2020-6-19
* @param newDef25 java.lang.String
*/
public void setDef25 ( java.lang.String def25) {
this.def25=def25;
} 
 
/**
* 属性 def26的Getter方法.属性名：自定义项26
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef26() {
return this.def26;
} 

/**
* 属性def26的Setter方法.属性名：自定义项26
* 创建日期:2020-6-19
* @param newDef26 java.lang.String
*/
public void setDef26 ( java.lang.String def26) {
this.def26=def26;
} 
 
/**
* 属性 def27的Getter方法.属性名：自定义项27
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef27() {
return this.def27;
} 

/**
* 属性def27的Setter方法.属性名：自定义项27
* 创建日期:2020-6-19
* @param newDef27 java.lang.String
*/
public void setDef27 ( java.lang.String def27) {
this.def27=def27;
} 
 
/**
* 属性 def28的Getter方法.属性名：自定义项28
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef28() {
return this.def28;
} 

/**
* 属性def28的Setter方法.属性名：自定义项28
* 创建日期:2020-6-19
* @param newDef28 java.lang.String
*/
public void setDef28 ( java.lang.String def28) {
this.def28=def28;
} 
 
/**
* 属性 def29的Getter方法.属性名：自定义项29
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef29() {
return this.def29;
} 

/**
* 属性def29的Setter方法.属性名：自定义项29
* 创建日期:2020-6-19
* @param newDef29 java.lang.String
*/
public void setDef29 ( java.lang.String def29) {
this.def29=def29;
} 
 
/**
* 属性 def30的Getter方法.属性名：自定义项30
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef30() {
return this.def30;
} 

/**
* 属性def30的Setter方法.属性名：自定义项30
* 创建日期:2020-6-19
* @param newDef30 java.lang.String
*/
public void setDef30 ( java.lang.String def30) {
this.def30=def30;
} 
 
/**
* 属性 def31的Getter方法.属性名：自定义项31
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef31() {
return this.def31;
} 

/**
* 属性def31的Setter方法.属性名：自定义项31
* 创建日期:2020-6-19
* @param newDef31 java.lang.String
*/
public void setDef31 ( java.lang.String def31) {
this.def31=def31;
} 
 
/**
* 属性 def32的Getter方法.属性名：自定义项32
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef32() {
return this.def32;
} 

/**
* 属性def32的Setter方法.属性名：自定义项32
* 创建日期:2020-6-19
* @param newDef32 java.lang.String
*/
public void setDef32 ( java.lang.String def32) {
this.def32=def32;
} 
 
/**
* 属性 def33的Getter方法.属性名：自定义项33
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef33() {
return this.def33;
} 

/**
* 属性def33的Setter方法.属性名：自定义项33
* 创建日期:2020-6-19
* @param newDef33 java.lang.String
*/
public void setDef33 ( java.lang.String def33) {
this.def33=def33;
} 
 
/**
* 属性 def34的Getter方法.属性名：自定义项34
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef34() {
return this.def34;
} 

/**
* 属性def34的Setter方法.属性名：自定义项34
* 创建日期:2020-6-19
* @param newDef34 java.lang.String
*/
public void setDef34 ( java.lang.String def34) {
this.def34=def34;
} 
 
/**
* 属性 def35的Getter方法.属性名：自定义项35
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef35() {
return this.def35;
} 

/**
* 属性def35的Setter方法.属性名：自定义项35
* 创建日期:2020-6-19
* @param newDef35 java.lang.String
*/
public void setDef35 ( java.lang.String def35) {
this.def35=def35;
} 
 
/**
* 属性 def36的Getter方法.属性名：自定义项36
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef36() {
return this.def36;
} 

/**
* 属性def36的Setter方法.属性名：自定义项36
* 创建日期:2020-6-19
* @param newDef36 java.lang.String
*/
public void setDef36 ( java.lang.String def36) {
this.def36=def36;
} 
 
/**
* 属性 def37的Getter方法.属性名：自定义项37
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef37() {
return this.def37;
} 

/**
* 属性def37的Setter方法.属性名：自定义项37
* 创建日期:2020-6-19
* @param newDef37 java.lang.String
*/
public void setDef37 ( java.lang.String def37) {
this.def37=def37;
} 
 
/**
* 属性 def38的Getter方法.属性名：自定义项38
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef38() {
return this.def38;
} 

/**
* 属性def38的Setter方法.属性名：自定义项38
* 创建日期:2020-6-19
* @param newDef38 java.lang.String
*/
public void setDef38 ( java.lang.String def38) {
this.def38=def38;
} 
 
/**
* 属性 def39的Getter方法.属性名：自定义项39
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef39() {
return this.def39;
} 

/**
* 属性def39的Setter方法.属性名：自定义项39
* 创建日期:2020-6-19
* @param newDef39 java.lang.String
*/
public void setDef39 ( java.lang.String def39) {
this.def39=def39;
} 
 
/**
* 属性 def40的Getter方法.属性名：自定义项40
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef40() {
return this.def40;
} 

/**
* 属性def40的Setter方法.属性名：自定义项40
* 创建日期:2020-6-19
* @param newDef40 java.lang.String
*/
public void setDef40 ( java.lang.String def40) {
this.def40=def40;
} 
 
/**
* 属性 def41的Getter方法.属性名：自定义项41
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef41() {
return this.def41;
} 

/**
* 属性def41的Setter方法.属性名：自定义项41
* 创建日期:2020-6-19
* @param newDef41 java.lang.String
*/
public void setDef41 ( java.lang.String def41) {
this.def41=def41;
} 
 
/**
* 属性 def42的Getter方法.属性名：自定义项42
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef42() {
return this.def42;
} 

/**
* 属性def42的Setter方法.属性名：自定义项42
* 创建日期:2020-6-19
* @param newDef42 java.lang.String
*/
public void setDef42 ( java.lang.String def42) {
this.def42=def42;
} 
 
/**
* 属性 def43的Getter方法.属性名：自定义项43
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef43() {
return this.def43;
} 

/**
* 属性def43的Setter方法.属性名：自定义项43
* 创建日期:2020-6-19
* @param newDef43 java.lang.String
*/
public void setDef43 ( java.lang.String def43) {
this.def43=def43;
} 
 
/**
* 属性 def44的Getter方法.属性名：自定义项44
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef44() {
return this.def44;
} 

/**
* 属性def44的Setter方法.属性名：自定义项44
* 创建日期:2020-6-19
* @param newDef44 java.lang.String
*/
public void setDef44 ( java.lang.String def44) {
this.def44=def44;
} 
 
/**
* 属性 def45的Getter方法.属性名：自定义项45
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef45() {
return this.def45;
} 

/**
* 属性def45的Setter方法.属性名：自定义项45
* 创建日期:2020-6-19
* @param newDef45 java.lang.String
*/
public void setDef45 ( java.lang.String def45) {
this.def45=def45;
} 
 
/**
* 属性 def46的Getter方法.属性名：自定义项46
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef46() {
return this.def46;
} 

/**
* 属性def46的Setter方法.属性名：自定义项46
* 创建日期:2020-6-19
* @param newDef46 java.lang.String
*/
public void setDef46 ( java.lang.String def46) {
this.def46=def46;
} 
 
/**
* 属性 def47的Getter方法.属性名：自定义项47
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef47() {
return this.def47;
} 

/**
* 属性def47的Setter方法.属性名：自定义项47
* 创建日期:2020-6-19
* @param newDef47 java.lang.String
*/
public void setDef47 ( java.lang.String def47) {
this.def47=def47;
} 
 
/**
* 属性 def48的Getter方法.属性名：自定义项48
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef48() {
return this.def48;
} 

/**
* 属性def48的Setter方法.属性名：自定义项48
* 创建日期:2020-6-19
* @param newDef48 java.lang.String
*/
public void setDef48 ( java.lang.String def48) {
this.def48=def48;
} 
 
/**
* 属性 def49的Getter方法.属性名：自定义项49
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef49() {
return this.def49;
} 

/**
* 属性def49的Setter方法.属性名：自定义项49
* 创建日期:2020-6-19
* @param newDef49 java.lang.String
*/
public void setDef49 ( java.lang.String def49) {
this.def49=def49;
} 
 
/**
* 属性 def50的Getter方法.属性名：自定义项50
*  创建日期:2020-6-19
* @return java.lang.String
*/
public java.lang.String getDef50() {
return this.def50;
} 

/**
* 属性def50的Setter方法.属性名：自定义项50
* 创建日期:2020-6-19
* @param newDef50 java.lang.String
*/
public void setDef50 ( java.lang.String def50) {
this.def50=def50;
} 
 
/**
* 属性 生成上层主键的Getter方法.属性名：上层主键
*  创建日期:2020-6-19
* @return String
*/
public String getPk_time_plan(){
return this.pk_time_plan;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2020-6-19
* @param newPk_time_plan String
*/
public void setPk_time_plan(String pk_time_plan){
this.pk_time_plan=pk_time_plan;
} 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2020-6-19
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2020-6-19
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("adprepare.mlyprojectplanBVO");
    }
   }
    