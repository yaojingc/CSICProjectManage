package nc.vo.adprepare.tendaysprojectplan;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴�����۵�������Ϣ
 * </p>
 *  ��������:2020-5-20
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class TendaysprojplanHVO extends SuperVO {
	
/**
*��ĿѮ�ƻ���������
*/
public java.lang.String pk_tendaysprojplan_h;
/**
*����
*/
public java.lang.String pk_group;
/**
*��֯���°汾
*/
public java.lang.String pk_org;
/**
*��֯
*/
public java.lang.String pk_org_v;
/**
*��Ŀ
*/
public java.lang.String pk_project;
/**
*��������
*/
public java.lang.Integer item_num;
/**
*ģ������
*/
public java.lang.String pk_template;
/**
*�汾��
*/
public java.lang.Integer version;
/**
*��Ч�汾
*/
public java.lang.String pk_origin;
/**
*���°汾��
*/
public java.lang.Integer max_version;
/**
*�Ƿ����°汾
*/
public UFBoolean last_v_flag;
/**
*����
*/
public java.lang.String pk_progress;
/**
*����
*/
public java.lang.Integer duration;
/**
*��Ŀ����
*/
public java.lang.String projectname;
/**
*�ƻ�����
*/
public java.lang.String planname;
/**
*�������
*/
public java.lang.String missioncode;
/**
*��������
*/
public java.lang.String missionname;
/**
*�ƻ���ʼ����
*/
public UFDate projectstartdate;
/**
*�ƻ���ֹ����
*/
public UFDate projectdeaddate;
/**
*�ƻ�����
*/
public java.lang.String planduration;
/**
*��������
*/
public java.lang.String missiondetail;
/**
*ǰ�üƻ�
*/
public java.lang.String advanceplan;
/**
*��̱�
*/
public java.lang.String milepost;
/**
*������
*/
public java.lang.String dutyperson;
/**
*���β���
*/
public java.lang.String dutydept;
/**
*����ʱ��
*/
public UFDateTime approvedate;
/**
*��������
*/
public UFDate dbilldate;
/**
*����״̬
*/
public java.lang.Integer billstatus;
/**
*���ݺ�
*/
public java.lang.String billno;
/**
*ҵ������
*/
public java.lang.String pk_busitype;
/**
*��������
*/
public java.lang.String pk_billtypeid;
/**
*�������ͱ���
*/
public java.lang.String billtype;
/**
*�������ͱ���
*/
public java.lang.String transtypecode;
/**
*��������
*/
public java.lang.String pk_transtype;
/**
*�Ƶ���
*/
public java.lang.String billmaker;
/**
*�Ƶ�ʱ��
*/
public UFDate maketime;
/**
*������
*/
public java.lang.String creator;
/**
*����ʱ��
*/
public UFDateTime creationtime;
/**
*�޸���
*/
public java.lang.String modifier;
/**
*�޸�ʱ��
*/
public UFDateTime modifiedtime;
/**
*������
*/
public java.lang.String approver;
/**
*����״̬
*/
public java.lang.Integer approvestatus;
/**
*��������
*/
public java.lang.String approvenote;
/**
*��ע
*/
public java.lang.String vnote;
/**
*��Դ��������
*/
public java.lang.String srcbilltype;
/**
*��Դ����id
*/
public java.lang.String srcbillid;
/**
*��Դ���ݺ�
*/
public java.lang.String srccode;
/**
*��Դ��������id
*/
public java.lang.String srcid;
/**
*��Դ�����ӱ�id
*/
public java.lang.String srcbid;
/**
*��Դ�����к�
*/
public java.lang.String srcrowno;
/**
*��Դ��������
*/
public java.lang.String srctrantype;
/**
*Դͷ��������
*/
public java.lang.String vfirsttype;
/**
*Դͷ���ݺ�
*/
public java.lang.String vfirstcode;
/**
*Դͷ��������id
*/
public java.lang.String vfirstid;
/**
*Դͷ�����ӱ�id
*/
public java.lang.String vfirstbid;
/**
*Դͷ�����к�
*/
public java.lang.String vfirstrowno;
/**
*Դͷ��������
*/
public java.lang.String vfirsttrantype;
/**
*�Զ�����0
*/
public java.lang.String def0;
/**
*�Զ�����1
*/
public java.lang.String def1;
/**
*�Զ�����2
*/
public java.lang.String def2;
/**
*�Զ�����3
*/
public java.lang.String def3;
/**
*�Զ�����4
*/
public java.lang.String def4;
/**
*�Զ�����5
*/
public java.lang.String def5;
/**
*�Զ�����6
*/
public java.lang.String def6;
/**
*�Զ�����7
*/
public java.lang.String def7;
/**
*�Զ�����8
*/
public java.lang.String def8;
/**
*�Զ�����10
*/
public java.lang.String def10;
/**
*�Զ�����11
*/
public java.lang.String def11;
/**
*�Զ�����12
*/
public java.lang.String def12;
/**
*�Զ�����13
*/
public java.lang.String def13;
/**
*�Զ�����14
*/
public java.lang.String def14;
/**
*�Զ�����15
*/
public java.lang.String def15;
/**
*�Զ�����16
*/
public java.lang.String def16;
/**
*�Զ�����17
*/
public java.lang.String def17;
/**
*�Զ�����18
*/
public java.lang.String def18;
/**
*�Զ�����19
*/
public java.lang.String def19;
/**
*�Զ�����20
*/
public java.lang.String def20;
/**
*�Զ�����21
*/
public java.lang.String def21;
/**
*�Զ�����22
*/
public java.lang.String def22;
/**
*�Զ�����23
*/
public java.lang.String def23;
/**
*�Զ�����24
*/
public java.lang.String def24;
/**
*�Զ�����25
*/
public java.lang.String def25;
/**
*�Զ�����26
*/
public java.lang.String def26;
/**
*�Զ�����27
*/
public java.lang.String def27;
/**
*�Զ�����28
*/
public java.lang.String def28;
/**
*�Զ�����29
*/
public java.lang.String def29;
/**
*�Զ�����30
*/
public java.lang.String def30;
/**
*�Զ�����31
*/
public java.lang.String def31;
/**
*�Զ�����32
*/
public java.lang.String def32;
/**
*�Զ�����33
*/
public java.lang.String def33;
/**
*�Զ�����34
*/
public java.lang.String def34;
/**
*�Զ�����35
*/
public java.lang.String def35;
/**
*�Զ�����36
*/
public java.lang.String def36;
/**
*�Զ�����37
*/
public java.lang.String def37;
/**
*�Զ�����38
*/
public java.lang.String def38;
/**
*�Զ�����39
*/
public java.lang.String def39;
/**
*�Զ�����40
*/
public java.lang.String def40;
/**
*�Զ�����41
*/
public java.lang.String def41;
/**
*�Զ�����42
*/
public java.lang.String def42;
/**
*�Զ�����43
*/
public java.lang.String def43;
/**
*�Զ�����44
*/
public java.lang.String def44;
/**
*�Զ�����45
*/
public java.lang.String def45;
/**
*�Զ�����46
*/
public java.lang.String def46;
/**
*�Զ�����47
*/
public java.lang.String def47;
/**
*�Զ�����48
*/
public java.lang.String def48;
/**
*�Զ�����49
*/
public java.lang.String def49;
/**
*�Զ�����50
*/
public java.lang.String def50;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_tendaysprojplan_h��Getter����.����������ĿѮ�ƻ���������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPk_tendaysprojplan_h() {
return this.pk_tendaysprojplan_h;
} 

/**
* ����pk_tendaysprojplan_h��Setter����.����������ĿѮ�ƻ���������
* ��������:2020-5-20
* @param newPk_tendaysprojplan_h java.lang.String
*/
public void setPk_tendaysprojplan_h ( java.lang.String pk_tendaysprojplan_h) {
this.pk_tendaysprojplan_h=pk_tendaysprojplan_h;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2020-5-20
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2020-5-20
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� pk_org��Getter����.����������֯���°汾
*  ��������:2020-5-20
* @return nc.vo.org.ItemOrgVO
*/
public java.lang.String getPk_org() {
return this.pk_org;
} 

/**
* ����pk_org��Setter����.����������֯���°汾
* ��������:2020-5-20
* @param newPk_org nc.vo.org.ItemOrgVO
*/
public void setPk_org ( java.lang.String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ���� pk_org_v��Getter����.����������֯
*  ��������:2020-5-20
* @return nc.vo.vorg.ItemOrgVersionVO
*/
public java.lang.String getPk_org_v() {
return this.pk_org_v;
} 

/**
* ����pk_org_v��Setter����.����������֯
* ��������:2020-5-20
* @param newPk_org_v nc.vo.vorg.ItemOrgVersionVO
*/
public void setPk_org_v ( java.lang.String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* ���� pk_project��Getter����.����������Ŀ
*  ��������:2020-5-20
* @return nc.vo.pim.project.ProjectHeadVO
*/
public java.lang.String getPk_project() {
return this.pk_project;
} 

/**
* ����pk_project��Setter����.����������Ŀ
* ��������:2020-5-20
* @param newPk_project nc.vo.pim.project.ProjectHeadVO
*/
public void setPk_project ( java.lang.String pk_project) {
this.pk_project=pk_project;
} 
 
/**
* ���� item_num��Getter����.����������������
*  ��������:2020-5-20
* @return java.lang.Integer
*/
public java.lang.Integer getItem_num() {
return this.item_num;
} 

/**
* ����item_num��Setter����.����������������
* ��������:2020-5-20
* @param newItem_num java.lang.Integer
*/
public void setItem_num ( java.lang.Integer item_num) {
this.item_num=item_num;
} 
 
/**
* ���� pk_template��Getter����.��������ģ������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPk_template() {
return this.pk_template;
} 

/**
* ����pk_template��Setter����.��������ģ������
* ��������:2020-5-20
* @param newPk_template java.lang.String
*/
public void setPk_template ( java.lang.String pk_template) {
this.pk_template=pk_template;
} 
 
/**
* ���� version��Getter����.���������汾��
*  ��������:2020-5-20
* @return java.lang.Integer
*/
public java.lang.Integer getVersion() {
return this.version;
} 

/**
* ����version��Setter����.���������汾��
* ��������:2020-5-20
* @param newVersion java.lang.Integer
*/
public void setVersion ( java.lang.Integer version) {
this.version=version;
} 
 
/**
* ���� pk_origin��Getter����.����������Ч�汾
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPk_origin() {
return this.pk_origin;
} 

/**
* ����pk_origin��Setter����.����������Ч�汾
* ��������:2020-5-20
* @param newPk_origin java.lang.String
*/
public void setPk_origin ( java.lang.String pk_origin) {
this.pk_origin=pk_origin;
} 
 
/**
* ���� max_version��Getter����.�����������°汾��
*  ��������:2020-5-20
* @return java.lang.Integer
*/
public java.lang.Integer getMax_version() {
return this.max_version;
} 

/**
* ����max_version��Setter����.�����������°汾��
* ��������:2020-5-20
* @param newMax_version java.lang.Integer
*/
public void setMax_version ( java.lang.Integer max_version) {
this.max_version=max_version;
} 
 
/**
* ���� last_v_flag��Getter����.���������Ƿ����°汾
*  ��������:2020-5-20
* @return nc.vo.pub.lang.UFUFBoolean
*/
public UFBoolean getLast_v_flag() {
return this.last_v_flag;
} 

/**
* ����last_v_flag��Setter����.���������Ƿ����°汾
* ��������:2020-5-20
* @param newLast_v_flag nc.vo.pub.lang.UFUFBoolean
*/
public void setLast_v_flag ( UFBoolean last_v_flag) {
this.last_v_flag=last_v_flag;
} 
 
/**
* ���� pk_progress��Getter����.������������
*  ��������:2020-5-20
* @return nc.vo.pmsch.plan.progress.TimeProgressHeadVO
*/
public java.lang.String getPk_progress() {
return this.pk_progress;
} 

/**
* ����pk_progress��Setter����.������������
* ��������:2020-5-20
* @param newPk_progress nc.vo.pmsch.plan.progress.TimeProgressHeadVO
*/
public void setPk_progress ( java.lang.String pk_progress) {
this.pk_progress=pk_progress;
} 
 
/**
* ���� duration��Getter����.������������
*  ��������:2020-5-20
* @return java.lang.Integer
*/
public java.lang.Integer getDuration() {
return this.duration;
} 

/**
* ����duration��Setter����.������������
* ��������:2020-5-20
* @param newDuration java.lang.Integer
*/
public void setDuration ( java.lang.Integer duration) {
this.duration=duration;
} 
 
/**
* ���� projectname��Getter����.����������Ŀ����
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getProjectname() {
return this.projectname;
} 

/**
* ����projectname��Setter����.����������Ŀ����
* ��������:2020-5-20
* @param newProjectname java.lang.String
*/
public void setProjectname ( java.lang.String projectname) {
this.projectname=projectname;
} 
 
/**
* ���� planname��Getter����.���������ƻ�����
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPlanname() {
return this.planname;
} 

/**
* ����planname��Setter����.���������ƻ�����
* ��������:2020-5-20
* @param newPlanname java.lang.String
*/
public void setPlanname ( java.lang.String planname) {
this.planname=planname;
} 
 
/**
* ���� missioncode��Getter����.���������������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getMissioncode() {
return this.missioncode;
} 

/**
* ����missioncode��Setter����.���������������
* ��������:2020-5-20
* @param newMissioncode java.lang.String
*/
public void setMissioncode ( java.lang.String missioncode) {
this.missioncode=missioncode;
} 
 
/**
* ���� missionname��Getter����.����������������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getMissionname() {
return this.missionname;
} 

/**
* ����missionname��Setter����.����������������
* ��������:2020-5-20
* @param newMissionname java.lang.String
*/
public void setMissionname ( java.lang.String missionname) {
this.missionname=missionname;
} 
 
/**
* ���� projectstartdate��Getter����.���������ƻ���ʼ����
*  ��������:2020-5-20
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getProjectstartdate() {
return this.projectstartdate;
} 

/**
* ����projectstartdate��Setter����.���������ƻ���ʼ����
* ��������:2020-5-20
* @param newProjectstartdate nc.vo.pub.lang.UFDate
*/
public void setProjectstartdate ( UFDate projectstartdate) {
this.projectstartdate=projectstartdate;
} 
 
/**
* ���� projectdeaddate��Getter����.���������ƻ���ֹ����
*  ��������:2020-5-20
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getProjectdeaddate() {
return this.projectdeaddate;
} 

/**
* ����projectdeaddate��Setter����.���������ƻ���ֹ����
* ��������:2020-5-20
* @param newProjectdeaddate nc.vo.pub.lang.UFDate
*/
public void setProjectdeaddate ( UFDate projectdeaddate) {
this.projectdeaddate=projectdeaddate;
} 
 
/**
* ���� planduration��Getter����.���������ƻ�����
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getPlanduration() {
return this.planduration;
} 

/**
* ����planduration��Setter����.���������ƻ�����
* ��������:2020-5-20
* @param newPlanduration java.lang.String
*/
public void setPlanduration ( java.lang.String planduration) {
this.planduration=planduration;
} 
 
/**
* ���� missiondetail��Getter����.����������������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getMissiondetail() {
return this.missiondetail;
} 

/**
* ����missiondetail��Setter����.����������������
* ��������:2020-5-20
* @param newMissiondetail java.lang.String
*/
public void setMissiondetail ( java.lang.String missiondetail) {
this.missiondetail=missiondetail;
} 
 
/**
* ���� advanceplan��Getter����.��������ǰ�üƻ�
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getAdvanceplan() {
return this.advanceplan;
} 

/**
* ����advanceplan��Setter����.��������ǰ�üƻ�
* ��������:2020-5-20
* @param newAdvanceplan java.lang.String
*/
public void setAdvanceplan ( java.lang.String advanceplan) {
this.advanceplan=advanceplan;
} 
 
/**
* ���� milepost��Getter����.����������̱�
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getMilepost() {
return this.milepost;
} 

/**
* ����milepost��Setter����.����������̱�
* ��������:2020-5-20
* @param newMilepost java.lang.String
*/
public void setMilepost ( java.lang.String milepost) {
this.milepost=milepost;
} 
 
/**
* ���� dutyperson��Getter����.��������������
*  ��������:2020-5-20
* @return nc.vo.bd.psn.PsndocVO
*/
public java.lang.String getDutyperson() {
return this.dutyperson;
} 

/**
* ����dutyperson��Setter����.��������������
* ��������:2020-5-20
* @param newDutyperson nc.vo.bd.psn.PsndocVO
*/
public void setDutyperson ( java.lang.String dutyperson) {
this.dutyperson=dutyperson;
} 
 
/**
* ���� dutydept��Getter����.�����������β���
*  ��������:2020-5-20
* @return nc.vo.org.DeptVO
*/
public java.lang.String getDutydept() {
return this.dutydept;
} 

/**
* ����dutydept��Setter����.�����������β���
* ��������:2020-5-20
* @param newDutydept nc.vo.org.DeptVO
*/
public void setDutydept ( java.lang.String dutydept) {
this.dutydept=dutydept;
} 
 
/**
* ���� approvedate��Getter����.������������ʱ��
*  ��������:2020-5-20
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getApprovedate() {
return this.approvedate;
} 

/**
* ����approvedate��Setter����.������������ʱ��
* ��������:2020-5-20
* @param newApprovedate nc.vo.pub.lang.UFDateTime
*/
public void setApprovedate ( UFDateTime approvedate) {
this.approvedate=approvedate;
} 
 
/**
* ���� dbilldate��Getter����.����������������
*  ��������:2020-5-20
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDbilldate() {
return this.dbilldate;
} 

/**
* ����dbilldate��Setter����.����������������
* ��������:2020-5-20
* @param newDbilldate nc.vo.pub.lang.UFDate
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
} 
 
/**
* ���� billstatus��Getter����.������������״̬
*  ��������:2020-5-20
* @return nc.vo.pub.pf.BillStatusEnum
*/
public java.lang.Integer getBillstatus() {
return this.billstatus;
} 

/**
* ����billstatus��Setter����.������������״̬
* ��������:2020-5-20
* @param newBillstatus nc.vo.pub.pf.BillStatusEnum
*/
public void setBillstatus ( java.lang.Integer billstatus) {
this.billstatus=billstatus;
} 
 
/**
* ���� billno��Getter����.�����������ݺ�
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getBillno() {
return this.billno;
} 

/**
* ����billno��Setter����.�����������ݺ�
* ��������:2020-5-20
* @param newBillno java.lang.String
*/
public void setBillno ( java.lang.String billno) {
this.billno=billno;
} 
 
/**
* ���� pk_busitype��Getter����.��������ҵ������
*  ��������:2020-5-20
* @return nc.vo.pf.pub.BusitypeVO
*/
public java.lang.String getPk_busitype() {
return this.pk_busitype;
} 

/**
* ����pk_busitype��Setter����.��������ҵ������
* ��������:2020-5-20
* @param newPk_busitype nc.vo.pf.pub.BusitypeVO
*/
public void setPk_busitype ( java.lang.String pk_busitype) {
this.pk_busitype=pk_busitype;
} 
 
/**
* ���� pk_billtypeid��Getter����.����������������
*  ��������:2020-5-20
* @return nc.vo.pub.billtype.BilltypeVO
*/
public java.lang.String getPk_billtypeid() {
return this.pk_billtypeid;
} 

/**
* ����pk_billtypeid��Setter����.����������������
* ��������:2020-5-20
* @param newPk_billtypeid nc.vo.pub.billtype.BilltypeVO
*/
public void setPk_billtypeid ( java.lang.String pk_billtypeid) {
this.pk_billtypeid=pk_billtypeid;
} 
 
/**
* ���� billtype��Getter����.���������������ͱ���
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getBilltype() {
return this.billtype;
} 

/**
* ����billtype��Setter����.���������������ͱ���
* ��������:2020-5-20
* @param newBilltype java.lang.String
*/
public void setBilltype ( java.lang.String billtype) {
this.billtype=billtype;
} 
 
/**
* ���� transtypecode��Getter����.���������������ͱ���
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getTranstypecode() {
return this.transtypecode;
} 

/**
* ����transtypecode��Setter����.���������������ͱ���
* ��������:2020-5-20
* @param newTranstypecode java.lang.String
*/
public void setTranstypecode ( java.lang.String transtypecode) {
this.transtypecode=transtypecode;
} 
 
/**
* ���� pk_transtype��Getter����.����������������
*  ��������:2020-5-20
* @return nc.vo.pub.billtype.BilltypeVO
*/
public java.lang.String getPk_transtype() {
return this.pk_transtype;
} 

/**
* ����pk_transtype��Setter����.����������������
* ��������:2020-5-20
* @param newPk_transtype nc.vo.pub.billtype.BilltypeVO
*/
public void setPk_transtype ( java.lang.String pk_transtype) {
this.pk_transtype=pk_transtype;
} 
 
/**
* ���� billmaker��Getter����.���������Ƶ���
*  ��������:2020-5-20
* @return nc.vo.sm.UserVO
*/
public java.lang.String getBillmaker() {
return this.billmaker;
} 

/**
* ����billmaker��Setter����.���������Ƶ���
* ��������:2020-5-20
* @param newBillmaker nc.vo.sm.UserVO
*/
public void setBillmaker ( java.lang.String billmaker) {
this.billmaker=billmaker;
} 
 
/**
* ���� maketime��Getter����.���������Ƶ�ʱ��
*  ��������:2020-5-20
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getMaketime() {
return this.maketime;
} 

/**
* ����maketime��Setter����.���������Ƶ�ʱ��
* ��������:2020-5-20
* @param newMaketime nc.vo.pub.lang.UFDate
*/
public void setMaketime ( UFDate maketime) {
this.maketime=maketime;
} 
 
/**
* ���� creator��Getter����.��������������
*  ��������:2020-5-20
* @return nc.vo.sm.UserVO
*/
public java.lang.String getCreator() {
return this.creator;
} 

/**
* ����creator��Setter����.��������������
* ��������:2020-5-20
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( java.lang.String creator) {
this.creator=creator;
} 
 
/**
* ���� creationtime��Getter����.������������ʱ��
*  ��������:2020-5-20
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* ����creationtime��Setter����.������������ʱ��
* ��������:2020-5-20
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* ���� modifier��Getter����.���������޸���
*  ��������:2020-5-20
* @return nc.vo.sm.UserVO
*/
public java.lang.String getModifier() {
return this.modifier;
} 

/**
* ����modifier��Setter����.���������޸���
* ��������:2020-5-20
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( java.lang.String modifier) {
this.modifier=modifier;
} 
 
/**
* ���� modifiedtime��Getter����.���������޸�ʱ��
*  ��������:2020-5-20
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* ����modifiedtime��Setter����.���������޸�ʱ��
* ��������:2020-5-20
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* ���� approver��Getter����.��������������
*  ��������:2020-5-20
* @return nc.vo.sm.UserVO
*/
public java.lang.String getApprover() {
return this.approver;
} 

/**
* ����approver��Setter����.��������������
* ��������:2020-5-20
* @param newApprover nc.vo.sm.UserVO
*/
public void setApprover ( java.lang.String approver) {
this.approver=approver;
} 
 
/**
* ���� approvestatus��Getter����.������������״̬
*  ��������:2020-5-20
* @return nc.vo.pub.pf.BillStatusEnum
*/
public java.lang.Integer getApprovestatus() {
return this.approvestatus;
} 

/**
* ����approvestatus��Setter����.������������״̬
* ��������:2020-5-20
* @param newApprovestatus nc.vo.pub.pf.BillStatusEnum
*/
public void setApprovestatus ( java.lang.Integer approvestatus) {
this.approvestatus=approvestatus;
} 
 
/**
* ���� approvenote��Getter����.����������������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getApprovenote() {
return this.approvenote;
} 

/**
* ����approvenote��Setter����.����������������
* ��������:2020-5-20
* @param newApprovenote java.lang.String
*/
public void setApprovenote ( java.lang.String approvenote) {
this.approvenote=approvenote;
} 
 
/**
* ���� vnote��Getter����.����������ע
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVnote() {
return this.vnote;
} 

/**
* ����vnote��Setter����.����������ע
* ��������:2020-5-20
* @param newVnote java.lang.String
*/
public void setVnote ( java.lang.String vnote) {
this.vnote=vnote;
} 
 
/**
* ���� srcbilltype��Getter����.����������Դ��������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcbilltype() {
return this.srcbilltype;
} 

/**
* ����srcbilltype��Setter����.����������Դ��������
* ��������:2020-5-20
* @param newSrcbilltype java.lang.String
*/
public void setSrcbilltype ( java.lang.String srcbilltype) {
this.srcbilltype=srcbilltype;
} 
 
/**
* ���� srcbillid��Getter����.����������Դ����id
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcbillid() {
return this.srcbillid;
} 

/**
* ����srcbillid��Setter����.����������Դ����id
* ��������:2020-5-20
* @param newSrcbillid java.lang.String
*/
public void setSrcbillid ( java.lang.String srcbillid) {
this.srcbillid=srcbillid;
} 
 
/**
* ���� srccode��Getter����.����������Դ���ݺ�
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrccode() {
return this.srccode;
} 

/**
* ����srccode��Setter����.����������Դ���ݺ�
* ��������:2020-5-20
* @param newSrccode java.lang.String
*/
public void setSrccode ( java.lang.String srccode) {
this.srccode=srccode;
} 
 
/**
* ���� srcid��Getter����.����������Դ��������id
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcid() {
return this.srcid;
} 

/**
* ����srcid��Setter����.����������Դ��������id
* ��������:2020-5-20
* @param newSrcid java.lang.String
*/
public void setSrcid ( java.lang.String srcid) {
this.srcid=srcid;
} 
 
/**
* ���� srcbid��Getter����.����������Դ�����ӱ�id
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcbid() {
return this.srcbid;
} 

/**
* ����srcbid��Setter����.����������Դ�����ӱ�id
* ��������:2020-5-20
* @param newSrcbid java.lang.String
*/
public void setSrcbid ( java.lang.String srcbid) {
this.srcbid=srcbid;
} 
 
/**
* ���� srcrowno��Getter����.����������Դ�����к�
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrcrowno() {
return this.srcrowno;
} 

/**
* ����srcrowno��Setter����.����������Դ�����к�
* ��������:2020-5-20
* @param newSrcrowno java.lang.String
*/
public void setSrcrowno ( java.lang.String srcrowno) {
this.srcrowno=srcrowno;
} 
 
/**
* ���� srctrantype��Getter����.����������Դ��������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getSrctrantype() {
return this.srctrantype;
} 

/**
* ����srctrantype��Setter����.����������Դ��������
* ��������:2020-5-20
* @param newSrctrantype java.lang.String
*/
public void setSrctrantype ( java.lang.String srctrantype) {
this.srctrantype=srctrantype;
} 
 
/**
* ���� vfirsttype��Getter����.��������Դͷ��������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirsttype() {
return this.vfirsttype;
} 

/**
* ����vfirsttype��Setter����.��������Դͷ��������
* ��������:2020-5-20
* @param newVfirsttype java.lang.String
*/
public void setVfirsttype ( java.lang.String vfirsttype) {
this.vfirsttype=vfirsttype;
} 
 
/**
* ���� vfirstcode��Getter����.��������Դͷ���ݺ�
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirstcode() {
return this.vfirstcode;
} 

/**
* ����vfirstcode��Setter����.��������Դͷ���ݺ�
* ��������:2020-5-20
* @param newVfirstcode java.lang.String
*/
public void setVfirstcode ( java.lang.String vfirstcode) {
this.vfirstcode=vfirstcode;
} 
 
/**
* ���� vfirstid��Getter����.��������Դͷ��������id
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirstid() {
return this.vfirstid;
} 

/**
* ����vfirstid��Setter����.��������Դͷ��������id
* ��������:2020-5-20
* @param newVfirstid java.lang.String
*/
public void setVfirstid ( java.lang.String vfirstid) {
this.vfirstid=vfirstid;
} 
 
/**
* ���� vfirstbid��Getter����.��������Դͷ�����ӱ�id
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirstbid() {
return this.vfirstbid;
} 

/**
* ����vfirstbid��Setter����.��������Դͷ�����ӱ�id
* ��������:2020-5-20
* @param newVfirstbid java.lang.String
*/
public void setVfirstbid ( java.lang.String vfirstbid) {
this.vfirstbid=vfirstbid;
} 
 
/**
* ���� vfirstrowno��Getter����.��������Դͷ�����к�
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirstrowno() {
return this.vfirstrowno;
} 

/**
* ����vfirstrowno��Setter����.��������Դͷ�����к�
* ��������:2020-5-20
* @param newVfirstrowno java.lang.String
*/
public void setVfirstrowno ( java.lang.String vfirstrowno) {
this.vfirstrowno=vfirstrowno;
} 
 
/**
* ���� vfirsttrantype��Getter����.��������Դͷ��������
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getVfirsttrantype() {
return this.vfirsttrantype;
} 

/**
* ����vfirsttrantype��Setter����.��������Դͷ��������
* ��������:2020-5-20
* @param newVfirsttrantype java.lang.String
*/
public void setVfirsttrantype ( java.lang.String vfirsttrantype) {
this.vfirsttrantype=vfirsttrantype;
} 
 
/**
* ���� def0��Getter����.���������Զ�����0
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef0() {
return this.def0;
} 

/**
* ����def0��Setter����.���������Զ�����0
* ��������:2020-5-20
* @param newDef0 java.lang.String
*/
public void setDef0 ( java.lang.String def0) {
this.def0=def0;
} 
 
/**
* ���� def1��Getter����.���������Զ�����1
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef1() {
return this.def1;
} 

/**
* ����def1��Setter����.���������Զ�����1
* ��������:2020-5-20
* @param newDef1 java.lang.String
*/
public void setDef1 ( java.lang.String def1) {
this.def1=def1;
} 
 
/**
* ���� def2��Getter����.���������Զ�����2
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef2() {
return this.def2;
} 

/**
* ����def2��Setter����.���������Զ�����2
* ��������:2020-5-20
* @param newDef2 java.lang.String
*/
public void setDef2 ( java.lang.String def2) {
this.def2=def2;
} 
 
/**
* ���� def3��Getter����.���������Զ�����3
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef3() {
return this.def3;
} 

/**
* ����def3��Setter����.���������Զ�����3
* ��������:2020-5-20
* @param newDef3 java.lang.String
*/
public void setDef3 ( java.lang.String def3) {
this.def3=def3;
} 
 
/**
* ���� def4��Getter����.���������Զ�����4
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef4() {
return this.def4;
} 

/**
* ����def4��Setter����.���������Զ�����4
* ��������:2020-5-20
* @param newDef4 java.lang.String
*/
public void setDef4 ( java.lang.String def4) {
this.def4=def4;
} 
 
/**
* ���� def5��Getter����.���������Զ�����5
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef5() {
return this.def5;
} 

/**
* ����def5��Setter����.���������Զ�����5
* ��������:2020-5-20
* @param newDef5 java.lang.String
*/
public void setDef5 ( java.lang.String def5) {
this.def5=def5;
} 
 
/**
* ���� def6��Getter����.���������Զ�����6
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef6() {
return this.def6;
} 

/**
* ����def6��Setter����.���������Զ�����6
* ��������:2020-5-20
* @param newDef6 java.lang.String
*/
public void setDef6 ( java.lang.String def6) {
this.def6=def6;
} 
 
/**
* ���� def7��Getter����.���������Զ�����7
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef7() {
return this.def7;
} 

/**
* ����def7��Setter����.���������Զ�����7
* ��������:2020-5-20
* @param newDef7 java.lang.String
*/
public void setDef7 ( java.lang.String def7) {
this.def7=def7;
} 
 
/**
* ���� def8��Getter����.���������Զ�����8
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef8() {
return this.def8;
} 

/**
* ����def8��Setter����.���������Զ�����8
* ��������:2020-5-20
* @param newDef8 java.lang.String
*/
public void setDef8 ( java.lang.String def8) {
this.def8=def8;
} 
 
/**
* ���� def10��Getter����.���������Զ�����10
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef10() {
return this.def10;
} 

/**
* ����def10��Setter����.���������Զ�����10
* ��������:2020-5-20
* @param newDef10 java.lang.String
*/
public void setDef10 ( java.lang.String def10) {
this.def10=def10;
} 
 
/**
* ���� def11��Getter����.���������Զ�����11
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef11() {
return this.def11;
} 

/**
* ����def11��Setter����.���������Զ�����11
* ��������:2020-5-20
* @param newDef11 java.lang.String
*/
public void setDef11 ( java.lang.String def11) {
this.def11=def11;
} 
 
/**
* ���� def12��Getter����.���������Զ�����12
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef12() {
return this.def12;
} 

/**
* ����def12��Setter����.���������Զ�����12
* ��������:2020-5-20
* @param newDef12 java.lang.String
*/
public void setDef12 ( java.lang.String def12) {
this.def12=def12;
} 
 
/**
* ���� def13��Getter����.���������Զ�����13
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef13() {
return this.def13;
} 

/**
* ����def13��Setter����.���������Զ�����13
* ��������:2020-5-20
* @param newDef13 java.lang.String
*/
public void setDef13 ( java.lang.String def13) {
this.def13=def13;
} 
 
/**
* ���� def14��Getter����.���������Զ�����14
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef14() {
return this.def14;
} 

/**
* ����def14��Setter����.���������Զ�����14
* ��������:2020-5-20
* @param newDef14 java.lang.String
*/
public void setDef14 ( java.lang.String def14) {
this.def14=def14;
} 
 
/**
* ���� def15��Getter����.���������Զ�����15
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef15() {
return this.def15;
} 

/**
* ����def15��Setter����.���������Զ�����15
* ��������:2020-5-20
* @param newDef15 java.lang.String
*/
public void setDef15 ( java.lang.String def15) {
this.def15=def15;
} 
 
/**
* ���� def16��Getter����.���������Զ�����16
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef16() {
return this.def16;
} 

/**
* ����def16��Setter����.���������Զ�����16
* ��������:2020-5-20
* @param newDef16 java.lang.String
*/
public void setDef16 ( java.lang.String def16) {
this.def16=def16;
} 
 
/**
* ���� def17��Getter����.���������Զ�����17
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef17() {
return this.def17;
} 

/**
* ����def17��Setter����.���������Զ�����17
* ��������:2020-5-20
* @param newDef17 java.lang.String
*/
public void setDef17 ( java.lang.String def17) {
this.def17=def17;
} 
 
/**
* ���� def18��Getter����.���������Զ�����18
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef18() {
return this.def18;
} 

/**
* ����def18��Setter����.���������Զ�����18
* ��������:2020-5-20
* @param newDef18 java.lang.String
*/
public void setDef18 ( java.lang.String def18) {
this.def18=def18;
} 
 
/**
* ���� def19��Getter����.���������Զ�����19
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef19() {
return this.def19;
} 

/**
* ����def19��Setter����.���������Զ�����19
* ��������:2020-5-20
* @param newDef19 java.lang.String
*/
public void setDef19 ( java.lang.String def19) {
this.def19=def19;
} 
 
/**
* ���� def20��Getter����.���������Զ�����20
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef20() {
return this.def20;
} 

/**
* ����def20��Setter����.���������Զ�����20
* ��������:2020-5-20
* @param newDef20 java.lang.String
*/
public void setDef20 ( java.lang.String def20) {
this.def20=def20;
} 
 
/**
* ���� def21��Getter����.���������Զ�����21
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef21() {
return this.def21;
} 

/**
* ����def21��Setter����.���������Զ�����21
* ��������:2020-5-20
* @param newDef21 java.lang.String
*/
public void setDef21 ( java.lang.String def21) {
this.def21=def21;
} 
 
/**
* ���� def22��Getter����.���������Զ�����22
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef22() {
return this.def22;
} 

/**
* ����def22��Setter����.���������Զ�����22
* ��������:2020-5-20
* @param newDef22 java.lang.String
*/
public void setDef22 ( java.lang.String def22) {
this.def22=def22;
} 
 
/**
* ���� def23��Getter����.���������Զ�����23
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef23() {
return this.def23;
} 

/**
* ����def23��Setter����.���������Զ�����23
* ��������:2020-5-20
* @param newDef23 java.lang.String
*/
public void setDef23 ( java.lang.String def23) {
this.def23=def23;
} 
 
/**
* ���� def24��Getter����.���������Զ�����24
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef24() {
return this.def24;
} 

/**
* ����def24��Setter����.���������Զ�����24
* ��������:2020-5-20
* @param newDef24 java.lang.String
*/
public void setDef24 ( java.lang.String def24) {
this.def24=def24;
} 
 
/**
* ���� def25��Getter����.���������Զ�����25
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef25() {
return this.def25;
} 

/**
* ����def25��Setter����.���������Զ�����25
* ��������:2020-5-20
* @param newDef25 java.lang.String
*/
public void setDef25 ( java.lang.String def25) {
this.def25=def25;
} 
 
/**
* ���� def26��Getter����.���������Զ�����26
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef26() {
return this.def26;
} 

/**
* ����def26��Setter����.���������Զ�����26
* ��������:2020-5-20
* @param newDef26 java.lang.String
*/
public void setDef26 ( java.lang.String def26) {
this.def26=def26;
} 
 
/**
* ���� def27��Getter����.���������Զ�����27
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef27() {
return this.def27;
} 

/**
* ����def27��Setter����.���������Զ�����27
* ��������:2020-5-20
* @param newDef27 java.lang.String
*/
public void setDef27 ( java.lang.String def27) {
this.def27=def27;
} 
 
/**
* ���� def28��Getter����.���������Զ�����28
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef28() {
return this.def28;
} 

/**
* ����def28��Setter����.���������Զ�����28
* ��������:2020-5-20
* @param newDef28 java.lang.String
*/
public void setDef28 ( java.lang.String def28) {
this.def28=def28;
} 
 
/**
* ���� def29��Getter����.���������Զ�����29
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef29() {
return this.def29;
} 

/**
* ����def29��Setter����.���������Զ�����29
* ��������:2020-5-20
* @param newDef29 java.lang.String
*/
public void setDef29 ( java.lang.String def29) {
this.def29=def29;
} 
 
/**
* ���� def30��Getter����.���������Զ�����30
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef30() {
return this.def30;
} 

/**
* ����def30��Setter����.���������Զ�����30
* ��������:2020-5-20
* @param newDef30 java.lang.String
*/
public void setDef30 ( java.lang.String def30) {
this.def30=def30;
} 
 
/**
* ���� def31��Getter����.���������Զ�����31
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef31() {
return this.def31;
} 

/**
* ����def31��Setter����.���������Զ�����31
* ��������:2020-5-20
* @param newDef31 java.lang.String
*/
public void setDef31 ( java.lang.String def31) {
this.def31=def31;
} 
 
/**
* ���� def32��Getter����.���������Զ�����32
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef32() {
return this.def32;
} 

/**
* ����def32��Setter����.���������Զ�����32
* ��������:2020-5-20
* @param newDef32 java.lang.String
*/
public void setDef32 ( java.lang.String def32) {
this.def32=def32;
} 
 
/**
* ���� def33��Getter����.���������Զ�����33
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef33() {
return this.def33;
} 

/**
* ����def33��Setter����.���������Զ�����33
* ��������:2020-5-20
* @param newDef33 java.lang.String
*/
public void setDef33 ( java.lang.String def33) {
this.def33=def33;
} 
 
/**
* ���� def34��Getter����.���������Զ�����34
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef34() {
return this.def34;
} 

/**
* ����def34��Setter����.���������Զ�����34
* ��������:2020-5-20
* @param newDef34 java.lang.String
*/
public void setDef34 ( java.lang.String def34) {
this.def34=def34;
} 
 
/**
* ���� def35��Getter����.���������Զ�����35
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef35() {
return this.def35;
} 

/**
* ����def35��Setter����.���������Զ�����35
* ��������:2020-5-20
* @param newDef35 java.lang.String
*/
public void setDef35 ( java.lang.String def35) {
this.def35=def35;
} 
 
/**
* ���� def36��Getter����.���������Զ�����36
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef36() {
return this.def36;
} 

/**
* ����def36��Setter����.���������Զ�����36
* ��������:2020-5-20
* @param newDef36 java.lang.String
*/
public void setDef36 ( java.lang.String def36) {
this.def36=def36;
} 
 
/**
* ���� def37��Getter����.���������Զ�����37
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef37() {
return this.def37;
} 

/**
* ����def37��Setter����.���������Զ�����37
* ��������:2020-5-20
* @param newDef37 java.lang.String
*/
public void setDef37 ( java.lang.String def37) {
this.def37=def37;
} 
 
/**
* ���� def38��Getter����.���������Զ�����38
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef38() {
return this.def38;
} 

/**
* ����def38��Setter����.���������Զ�����38
* ��������:2020-5-20
* @param newDef38 java.lang.String
*/
public void setDef38 ( java.lang.String def38) {
this.def38=def38;
} 
 
/**
* ���� def39��Getter����.���������Զ�����39
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef39() {
return this.def39;
} 

/**
* ����def39��Setter����.���������Զ�����39
* ��������:2020-5-20
* @param newDef39 java.lang.String
*/
public void setDef39 ( java.lang.String def39) {
this.def39=def39;
} 
 
/**
* ���� def40��Getter����.���������Զ�����40
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef40() {
return this.def40;
} 

/**
* ����def40��Setter����.���������Զ�����40
* ��������:2020-5-20
* @param newDef40 java.lang.String
*/
public void setDef40 ( java.lang.String def40) {
this.def40=def40;
} 
 
/**
* ���� def41��Getter����.���������Զ�����41
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef41() {
return this.def41;
} 

/**
* ����def41��Setter����.���������Զ�����41
* ��������:2020-5-20
* @param newDef41 java.lang.String
*/
public void setDef41 ( java.lang.String def41) {
this.def41=def41;
} 
 
/**
* ���� def42��Getter����.���������Զ�����42
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef42() {
return this.def42;
} 

/**
* ����def42��Setter����.���������Զ�����42
* ��������:2020-5-20
* @param newDef42 java.lang.String
*/
public void setDef42 ( java.lang.String def42) {
this.def42=def42;
} 
 
/**
* ���� def43��Getter����.���������Զ�����43
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef43() {
return this.def43;
} 

/**
* ����def43��Setter����.���������Զ�����43
* ��������:2020-5-20
* @param newDef43 java.lang.String
*/
public void setDef43 ( java.lang.String def43) {
this.def43=def43;
} 
 
/**
* ���� def44��Getter����.���������Զ�����44
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef44() {
return this.def44;
} 

/**
* ����def44��Setter����.���������Զ�����44
* ��������:2020-5-20
* @param newDef44 java.lang.String
*/
public void setDef44 ( java.lang.String def44) {
this.def44=def44;
} 
 
/**
* ���� def45��Getter����.���������Զ�����45
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef45() {
return this.def45;
} 

/**
* ����def45��Setter����.���������Զ�����45
* ��������:2020-5-20
* @param newDef45 java.lang.String
*/
public void setDef45 ( java.lang.String def45) {
this.def45=def45;
} 
 
/**
* ���� def46��Getter����.���������Զ�����46
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef46() {
return this.def46;
} 

/**
* ����def46��Setter����.���������Զ�����46
* ��������:2020-5-20
* @param newDef46 java.lang.String
*/
public void setDef46 ( java.lang.String def46) {
this.def46=def46;
} 
 
/**
* ���� def47��Getter����.���������Զ�����47
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef47() {
return this.def47;
} 

/**
* ����def47��Setter����.���������Զ�����47
* ��������:2020-5-20
* @param newDef47 java.lang.String
*/
public void setDef47 ( java.lang.String def47) {
this.def47=def47;
} 
 
/**
* ���� def48��Getter����.���������Զ�����48
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef48() {
return this.def48;
} 

/**
* ����def48��Setter����.���������Զ�����48
* ��������:2020-5-20
* @param newDef48 java.lang.String
*/
public void setDef48 ( java.lang.String def48) {
this.def48=def48;
} 
 
/**
* ���� def49��Getter����.���������Զ�����49
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef49() {
return this.def49;
} 

/**
* ����def49��Setter����.���������Զ�����49
* ��������:2020-5-20
* @param newDef49 java.lang.String
*/
public void setDef49 ( java.lang.String def49) {
this.def49=def49;
} 
 
/**
* ���� def50��Getter����.���������Զ�����50
*  ��������:2020-5-20
* @return java.lang.String
*/
public java.lang.String getDef50() {
return this.def50;
} 

/**
* ����def50��Setter����.���������Զ�����50
* ��������:2020-5-20
* @param newDef50 java.lang.String
*/
public void setDef50 ( java.lang.String def50) {
this.def50=def50;
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2020-5-20
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2020-5-20
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
    