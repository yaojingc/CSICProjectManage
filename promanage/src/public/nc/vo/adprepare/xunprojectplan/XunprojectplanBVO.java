package nc.vo.adprepare.xunprojectplan;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 * �˴�����۵�������Ϣ
 * </p>
 * ��������:2020-5-27
 * 
 * @author yonyouBQ
 * @version NCPrj ??
 */

public class XunprojectplanBVO extends SuperVO {

	/**
	 * Ѯ�ƻ���Ŀ����
	 */
	public java.lang.String pk_time_plan_item;
	/**
	 * �к�
	 */
	public java.lang.String rowno;
	/**
	 * �������
	 */
	public java.lang.Integer seq;
	/**
	 * ����
	 */
	public java.lang.String pk_group;
	/**
	 * ��֯���°汾
	 */
	public java.lang.String pk_org;
	/**
	 * ��֯
	 */
	public java.lang.String pk_org_v;
	/**
	 * ��������
	 */
	public java.lang.String name;
	/**
	 * ��������
	 */
	public java.lang.String description;
	/**
	 * ���β�������
	 */
	public java.lang.String pk_duty_dept;
	/**
	 * ���β���
	 */
	public java.lang.String pk_duty_dept_v;
	/**
	 * ������
	 */
	public java.lang.String pk_dutier;
	/**
	 * �ƻ���ʼ����
	 */
	public nc.vo.pub.lang.UFDate plan_start_date;
	/**
	 * �ƻ���ֹ����
	 */
	public nc.vo.pub.lang.UFDate plan_end_date;
	/**
	 * ��ע
	 */
	public java.lang.String memo;
	/**
	 * ������
	 */
	public java.lang.String pk_parent;
	/**
	 * ����
	 */
	public java.lang.String innercode;
	/**
	 * �Զ�����1
	 */
	public java.lang.String def1;
	/**
	 * �Զ�����2
	 */
	public java.lang.String def2;
	/**
	 * �Զ�����3
	 */
	public java.lang.String def3;
	/**
	 * �Զ�����4
	 */
	public java.lang.String def4;
	/**
	 * �Զ�����5
	 */
	public java.lang.String def5;
	/**
	 * �Զ�����6
	 */
	public java.lang.String def6;
	/**
	 * �Զ�����7
	 */
	public java.lang.String def7;
	/**
	 * �Զ�����8
	 */
	public java.lang.String def8;
	/**
	 * �Զ�����9
	 */
	public java.lang.String def9;
	/**
	 * �Զ�����10
	 */
	public java.lang.String def10;
	/**
	 * �Զ�����11
	 */
	public java.lang.String def11;
	/**
	 * �Զ�����12
	 */
	public java.lang.String def12;
	/**
	 * �Զ�����13
	 */
	public java.lang.String def13;
	/**
	 * �Զ�����14
	 */
	public java.lang.String def14;
	/**
	 * �Զ�����15
	 */
	public java.lang.String def15;
	/**
	 * �Զ�����16
	 */
	public java.lang.String def16;
	/**
	 * �Զ�����17
	 */
	public java.lang.String def17;
	/**
	 * �Զ�����18
	 */
	public java.lang.String def18;
	/**
	 * �Զ�����19
	 */
	public java.lang.String def19;
	/**
	 * �Զ�����20
	 */
	public java.lang.String def20;
	/**
	 * �Զ�����21
	 */
	public java.lang.String def21;
	/**
	 * �Զ�����22
	 */
	public java.lang.String def22;
	/**
	 * �Զ�����23
	 */
	public java.lang.String def23;
	/**
	 * �Զ�����24
	 */
	public java.lang.String def24;
	/**
	 * �Զ�����25
	 */
	public java.lang.String def25;
	/**
	 * �Զ�����26
	 */
	public java.lang.String def26;
	/**
	 * �Զ�����27
	 */
	public java.lang.String def27;
	/**
	 * �Զ�����28
	 */
	public java.lang.String def28;
	/**
	 * �Զ�����29
	 */
	public java.lang.String def29;
	/**
	 * �Զ�����30
	 */
	public java.lang.String def30;
	/**
	 * �Զ�����31
	 */
	public java.lang.String def31;
	/**
	 * �Զ�����32
	 */
	public java.lang.String def32;
	/**
	 * �Զ�����33
	 */
	public java.lang.String def33;
	/**
	 * �Զ�����34
	 */
	public java.lang.String def34;
	/**
	 * �Զ�����35
	 */
	public java.lang.String def35;
	/**
	 * �Զ�����36
	 */
	public java.lang.String def36;
	/**
	 * �Զ�����37
	 */
	public java.lang.String def37;
	/**
	 * �Զ�����38
	 */
	public java.lang.String def38;
	/**
	 * �Զ�����39
	 */
	public java.lang.String def39;
	/**
	 * �Զ�����40
	 */
	public java.lang.String def40;
	/**
	 * �Զ�����41
	 */
	public java.lang.String def41;
	/**
	 * �Զ�����42
	 */
	public java.lang.String def42;
	/**
	 * �Զ�����43
	 */
	public java.lang.String def43;
	/**
	 * �Զ�����44
	 */
	public java.lang.String def44;
	/**
	 * �Զ�����45
	 */
	public java.lang.String def45;
	/**
	 * �Զ�����46
	 */
	public java.lang.String def46;
	/**
	 * �Զ�����47
	 */
	public java.lang.String def47;
	/**
	 * �Զ�����48
	 */
	public java.lang.String def48;
	/**
	 * �Զ�����49
	 */
	public java.lang.String def49;
	/**
	 * �Զ�����50
	 */
	public java.lang.String def50;
	/**
	 * ����
	 */
	public java.lang.Integer duration;
	/**
	 * ��̱�
	 */
	public UFBoolean milestone;
	/**
	 * �汾��
	 */
	public java.lang.Integer version;
	/**
	 * ���°汾��
	 */
	public java.lang.Integer max_version;
	/**
	 * ǰ������
	 */
	public java.lang.String pk_front_plan;
	/**
	 * ģ������
	 */
	public java.lang.String pk_temp_b;
	/**
	 * ��Ч��Ŀ����
	 */
	public java.lang.String pk_origin_item;
	/**
	 * �������
	 */
	public java.lang.String full_seq;
	/**
	 * ����
	 */
	public java.lang.Integer plan_level;
	/**
	 * Ҷ�ӽڵ�
	 */
	public Boolean leaf;
	/**
	 * ���ȼ�¼
	 */
	public java.lang.String pk_progress;
	/**
	 * ��Ŀ
	 */
	public java.lang.String pk_project;
	/**
	 * �ϲ㵥������
	 */
	public String pk_time_plan;
	/**
	 * ʱ���
	 */
	public UFDateTime ts;

	/**
	 * ���� pk_time_plan_item��Getter����.��������Ѯ�ƻ���Ŀ���� ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_time_plan_item() {
		return this.pk_time_plan_item;
	}

	/**
	 * ����pk_time_plan_item��Setter����.��������Ѯ�ƻ���Ŀ���� ��������:2020-5-27
	 * 
	 * @param newPk_time_plan_item java.lang.String
	 */
	public void setPk_time_plan_item(java.lang.String pk_time_plan_item) {
		this.pk_time_plan_item = pk_time_plan_item;
	}

	/**
	 * ���� rowno��Getter����.���������к� ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getRowno() {
		return this.rowno;
	}

	/**
	 * ����rowno��Setter����.���������к� ��������:2020-5-27
	 * 
	 * @param newRowno java.lang.String
	 */
	public void setRowno(java.lang.String rowno) {
		this.rowno = rowno;
	}

	/**
	 * ���� seq��Getter����.��������������� ��������:2020-5-27
	 * 
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getSeq() {
		return this.seq;
	}

	/**
	 * ����seq��Setter����.��������������� ��������:2020-5-27
	 * 
	 * @param newSeq java.lang.Integer
	 */
	public void setSeq(java.lang.Integer seq) {
		this.seq = seq;
	}

	/**
	 * ���� pk_group��Getter����.������������ ��������:2020-5-27
	 * 
	 * @return nc.vo.org.GroupVO
	 */
	public java.lang.String getPk_group() {
		return this.pk_group;
	}

	/**
	 * ����pk_group��Setter����.������������ ��������:2020-5-27
	 * 
	 * @param newPk_group nc.vo.org.GroupVO
	 */
	public void setPk_group(java.lang.String pk_group) {
		this.pk_group = pk_group;
	}

	/**
	 * ���� pk_org��Getter����.����������֯���°汾 ��������:2020-5-27
	 * 
	 * @return nc.vo.org.ItemOrgVO
	 */
	public java.lang.String getPk_org() {
		return this.pk_org;
	}

	/**
	 * ����pk_org��Setter����.����������֯���°汾 ��������:2020-5-27
	 * 
	 * @param newPk_org nc.vo.org.ItemOrgVO
	 */
	public void setPk_org(java.lang.String pk_org) {
		this.pk_org = pk_org;
	}

	/**
	 * ���� pk_org_v��Getter����.����������֯ ��������:2020-5-27
	 * 
	 * @return nc.vo.vorg.ItemOrgVersionVO
	 */
	public java.lang.String getPk_org_v() {
		return this.pk_org_v;
	}

	/**
	 * ����pk_org_v��Setter����.����������֯ ��������:2020-5-27
	 * 
	 * @param newPk_org_v nc.vo.vorg.ItemOrgVersionVO
	 */
	public void setPk_org_v(java.lang.String pk_org_v) {
		this.pk_org_v = pk_org_v;
	}

	/**
	 * ���� name��Getter����.���������������� ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getName() {
		return this.name;
	}

	/**
	 * ����name��Setter����.���������������� ��������:2020-5-27
	 * 
	 * @param newName java.lang.String
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * ���� description��Getter����.���������������� ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDescription() {
		return this.description;
	}

	/**
	 * ����description��Setter����.���������������� ��������:2020-5-27
	 * 
	 * @param newDescription java.lang.String
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * ���� pk_duty_dept��Getter����.�����������β������� ��������:2020-5-27
	 * 
	 * @return nc.vo.org.DeptVO
	 */
	public java.lang.String getPk_duty_dept() {
		return this.pk_duty_dept;
	}

	/**
	 * ����pk_duty_dept��Setter����.�����������β������� ��������:2020-5-27
	 * 
	 * @param newPk_duty_dept nc.vo.org.DeptVO
	 */
	public void setPk_duty_dept(java.lang.String pk_duty_dept) {
		this.pk_duty_dept = pk_duty_dept;
	}

	/**
	 * ���� pk_duty_dept_v��Getter����.�����������β��� ��������:2020-5-27
	 * 
	 * @return nc.vo.vorg.DeptVersionVO
	 */
	public java.lang.String getPk_duty_dept_v() {
		return this.pk_duty_dept_v;
	}

	/**
	 * ����pk_duty_dept_v��Setter����.�����������β��� ��������:2020-5-27
	 * 
	 * @param newPk_duty_dept_v nc.vo.vorg.DeptVersionVO
	 */
	public void setPk_duty_dept_v(java.lang.String pk_duty_dept_v) {
		this.pk_duty_dept_v = pk_duty_dept_v;
	}

	/**
	 * ���� pk_dutier��Getter����.�������������� ��������:2020-5-27
	 * 
	 * @return nc.vo.bd.psn.PsndocVO
	 */
	public java.lang.String getPk_dutier() {
		return this.pk_dutier;
	}

	/**
	 * ����pk_dutier��Setter����.�������������� ��������:2020-5-27
	 * 
	 * @param newPk_dutier nc.vo.bd.psn.PsndocVO
	 */
	public void setPk_dutier(java.lang.String pk_dutier) {
		this.pk_dutier = pk_dutier;
	}

	/**
	 * ���� plan_start_date��Getter����.���������ƻ���ʼ���� ��������:2020-5-27
	 * 
	 * @return nc.vo.pub.lang.UFDate
	 */
	public nc.vo.pub.lang.UFDate getPlan_start_date() {
		return this.plan_start_date;
	}

	/**
	 * ����plan_start_date��Setter����.���������ƻ���ʼ���� ��������:2020-5-27
	 * 
	 * @param newPlan_start_date nc.vo.pub.lang.UFDate
	 */
	public void setPlan_start_date(nc.vo.pub.lang.UFDate plan_start_date) {
		this.plan_start_date = plan_start_date;
	}

	/**
	 * ���� plan_end_date��Getter����.���������ƻ���ֹ���� ��������:2020-5-27
	 * 
	 * @return java.lang.Integer
	 */
	public nc.vo.pub.lang.UFDate getPlan_end_date() {
		return this.plan_end_date;
	}

	/**
	 * ����plan_end_date��Setter����.���������ƻ���ֹ���� ��������:2020-5-27
	 * 
	 * @param newPlan_end_date java.lang.Integer
	 */
	public void setPlan_end_date(nc.vo.pub.lang.UFDate plan_end_date) {
		this.plan_end_date = plan_end_date;
	}

	/**
	 * ���� memo��Getter����.����������ע ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMemo() {
		return this.memo;
	}

	/**
	 * ����memo��Setter����.����������ע ��������:2020-5-27
	 * 
	 * @param newMemo java.lang.String
	 */
	public void setMemo(java.lang.String memo) {
		this.memo = memo;
	}

	/**
	 * ���� pk_parent��Getter����.�������������� ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_parent() {
		return this.pk_parent;
	}

	/**
	 * ����pk_parent��Setter����.�������������� ��������:2020-5-27
	 * 
	 * @param newPk_parent java.lang.String
	 */
	public void setPk_parent(java.lang.String pk_parent) {
		this.pk_parent = pk_parent;
	}

	/**
	 * ���� innercode��Getter����.������������ ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getInnercode() {
		return this.innercode;
	}

	/**
	 * ����innercode��Setter����.������������ ��������:2020-5-27
	 * 
	 * @param newInnercode java.lang.String
	 */
	public void setInnercode(java.lang.String innercode) {
		this.innercode = innercode;
	}

	/**
	 * ���� def1��Getter����.���������Զ�����1 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef1() {
		return this.def1;
	}

	/**
	 * ����def1��Setter����.���������Զ�����1 ��������:2020-5-27
	 * 
	 * @param newDef1 java.lang.String
	 */
	public void setDef1(java.lang.String def1) {
		this.def1 = def1;
	}

	/**
	 * ���� def2��Getter����.���������Զ�����2 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef2() {
		return this.def2;
	}

	/**
	 * ����def2��Setter����.���������Զ�����2 ��������:2020-5-27
	 * 
	 * @param newDef2 java.lang.String
	 */
	public void setDef2(java.lang.String def2) {
		this.def2 = def2;
	}

	/**
	 * ���� def3��Getter����.���������Զ�����3 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef3() {
		return this.def3;
	}

	/**
	 * ����def3��Setter����.���������Զ�����3 ��������:2020-5-27
	 * 
	 * @param newDef3 java.lang.String
	 */
	public void setDef3(java.lang.String def3) {
		this.def3 = def3;
	}

	/**
	 * ���� def4��Getter����.���������Զ�����4 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef4() {
		return this.def4;
	}

	/**
	 * ����def4��Setter����.���������Զ�����4 ��������:2020-5-27
	 * 
	 * @param newDef4 java.lang.String
	 */
	public void setDef4(java.lang.String def4) {
		this.def4 = def4;
	}

	/**
	 * ���� def5��Getter����.���������Զ�����5 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef5() {
		return this.def5;
	}

	/**
	 * ����def5��Setter����.���������Զ�����5 ��������:2020-5-27
	 * 
	 * @param newDef5 java.lang.String
	 */
	public void setDef5(java.lang.String def5) {
		this.def5 = def5;
	}

	/**
	 * ���� def6��Getter����.���������Զ�����6 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef6() {
		return this.def6;
	}

	/**
	 * ����def6��Setter����.���������Զ�����6 ��������:2020-5-27
	 * 
	 * @param newDef6 java.lang.String
	 */
	public void setDef6(java.lang.String def6) {
		this.def6 = def6;
	}

	/**
	 * ���� def7��Getter����.���������Զ�����7 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef7() {
		return this.def7;
	}

	/**
	 * ����def7��Setter����.���������Զ�����7 ��������:2020-5-27
	 * 
	 * @param newDef7 java.lang.String
	 */
	public void setDef7(java.lang.String def7) {
		this.def7 = def7;
	}

	/**
	 * ���� def8��Getter����.���������Զ�����8 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef8() {
		return this.def8;
	}

	/**
	 * ����def8��Setter����.���������Զ�����8 ��������:2020-5-27
	 * 
	 * @param newDef8 java.lang.String
	 */
	public void setDef8(java.lang.String def8) {
		this.def8 = def8;
	}

	/**
	 * ���� def9��Getter����.���������Զ�����9 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef9() {
		return this.def9;
	}

	/**
	 * ����def9��Setter����.���������Զ�����9 ��������:2020-5-27
	 * 
	 * @param newDef9 java.lang.String
	 */
	public void setDef9(java.lang.String def9) {
		this.def9 = def9;
	}

	/**
	 * ���� def10��Getter����.���������Զ�����10 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef10() {
		return this.def10;
	}

	/**
	 * ����def10��Setter����.���������Զ�����10 ��������:2020-5-27
	 * 
	 * @param newDef10 java.lang.String
	 */
	public void setDef10(java.lang.String def10) {
		this.def10 = def10;
	}

	/**
	 * ���� def11��Getter����.���������Զ�����11 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef11() {
		return this.def11;
	}

	/**
	 * ����def11��Setter����.���������Զ�����11 ��������:2020-5-27
	 * 
	 * @param newDef11 java.lang.String
	 */
	public void setDef11(java.lang.String def11) {
		this.def11 = def11;
	}

	/**
	 * ���� def12��Getter����.���������Զ�����12 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef12() {
		return this.def12;
	}

	/**
	 * ����def12��Setter����.���������Զ�����12 ��������:2020-5-27
	 * 
	 * @param newDef12 java.lang.String
	 */
	public void setDef12(java.lang.String def12) {
		this.def12 = def12;
	}

	/**
	 * ���� def13��Getter����.���������Զ�����13 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef13() {
		return this.def13;
	}

	/**
	 * ����def13��Setter����.���������Զ�����13 ��������:2020-5-27
	 * 
	 * @param newDef13 java.lang.String
	 */
	public void setDef13(java.lang.String def13) {
		this.def13 = def13;
	}

	/**
	 * ���� def14��Getter����.���������Զ�����14 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef14() {
		return this.def14;
	}

	/**
	 * ����def14��Setter����.���������Զ�����14 ��������:2020-5-27
	 * 
	 * @param newDef14 java.lang.String
	 */
	public void setDef14(java.lang.String def14) {
		this.def14 = def14;
	}

	/**
	 * ���� def15��Getter����.���������Զ�����15 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef15() {
		return this.def15;
	}

	/**
	 * ����def15��Setter����.���������Զ�����15 ��������:2020-5-27
	 * 
	 * @param newDef15 java.lang.String
	 */
	public void setDef15(java.lang.String def15) {
		this.def15 = def15;
	}

	/**
	 * ���� def16��Getter����.���������Զ�����16 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef16() {
		return this.def16;
	}

	/**
	 * ����def16��Setter����.���������Զ�����16 ��������:2020-5-27
	 * 
	 * @param newDef16 java.lang.String
	 */
	public void setDef16(java.lang.String def16) {
		this.def16 = def16;
	}

	/**
	 * ���� def17��Getter����.���������Զ�����17 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef17() {
		return this.def17;
	}

	/**
	 * ����def17��Setter����.���������Զ�����17 ��������:2020-5-27
	 * 
	 * @param newDef17 java.lang.String
	 */
	public void setDef17(java.lang.String def17) {
		this.def17 = def17;
	}

	/**
	 * ���� def18��Getter����.���������Զ�����18 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef18() {
		return this.def18;
	}

	/**
	 * ����def18��Setter����.���������Զ�����18 ��������:2020-5-27
	 * 
	 * @param newDef18 java.lang.String
	 */
	public void setDef18(java.lang.String def18) {
		this.def18 = def18;
	}

	/**
	 * ���� def19��Getter����.���������Զ�����19 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef19() {
		return this.def19;
	}

	/**
	 * ����def19��Setter����.���������Զ�����19 ��������:2020-5-27
	 * 
	 * @param newDef19 java.lang.String
	 */
	public void setDef19(java.lang.String def19) {
		this.def19 = def19;
	}

	/**
	 * ���� def20��Getter����.���������Զ�����20 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef20() {
		return this.def20;
	}

	/**
	 * ����def20��Setter����.���������Զ�����20 ��������:2020-5-27
	 * 
	 * @param newDef20 java.lang.String
	 */
	public void setDef20(java.lang.String def20) {
		this.def20 = def20;
	}

	/**
	 * ���� def21��Getter����.���������Զ�����21 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef21() {
		return this.def21;
	}

	/**
	 * ����def21��Setter����.���������Զ�����21 ��������:2020-5-27
	 * 
	 * @param newDef21 java.lang.String
	 */
	public void setDef21(java.lang.String def21) {
		this.def21 = def21;
	}

	/**
	 * ���� def22��Getter����.���������Զ�����22 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef22() {
		return this.def22;
	}

	/**
	 * ����def22��Setter����.���������Զ�����22 ��������:2020-5-27
	 * 
	 * @param newDef22 java.lang.String
	 */
	public void setDef22(java.lang.String def22) {
		this.def22 = def22;
	}

	/**
	 * ���� def23��Getter����.���������Զ�����23 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef23() {
		return this.def23;
	}

	/**
	 * ����def23��Setter����.���������Զ�����23 ��������:2020-5-27
	 * 
	 * @param newDef23 java.lang.String
	 */
	public void setDef23(java.lang.String def23) {
		this.def23 = def23;
	}

	/**
	 * ���� def24��Getter����.���������Զ�����24 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef24() {
		return this.def24;
	}

	/**
	 * ����def24��Setter����.���������Զ�����24 ��������:2020-5-27
	 * 
	 * @param newDef24 java.lang.String
	 */
	public void setDef24(java.lang.String def24) {
		this.def24 = def24;
	}

	/**
	 * ���� def25��Getter����.���������Զ�����25 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef25() {
		return this.def25;
	}

	/**
	 * ����def25��Setter����.���������Զ�����25 ��������:2020-5-27
	 * 
	 * @param newDef25 java.lang.String
	 */
	public void setDef25(java.lang.String def25) {
		this.def25 = def25;
	}

	/**
	 * ���� def26��Getter����.���������Զ�����26 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef26() {
		return this.def26;
	}

	/**
	 * ����def26��Setter����.���������Զ�����26 ��������:2020-5-27
	 * 
	 * @param newDef26 java.lang.String
	 */
	public void setDef26(java.lang.String def26) {
		this.def26 = def26;
	}

	/**
	 * ���� def27��Getter����.���������Զ�����27 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef27() {
		return this.def27;
	}

	/**
	 * ����def27��Setter����.���������Զ�����27 ��������:2020-5-27
	 * 
	 * @param newDef27 java.lang.String
	 */
	public void setDef27(java.lang.String def27) {
		this.def27 = def27;
	}

	/**
	 * ���� def28��Getter����.���������Զ�����28 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef28() {
		return this.def28;
	}

	/**
	 * ����def28��Setter����.���������Զ�����28 ��������:2020-5-27
	 * 
	 * @param newDef28 java.lang.String
	 */
	public void setDef28(java.lang.String def28) {
		this.def28 = def28;
	}

	/**
	 * ���� def29��Getter����.���������Զ�����29 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef29() {
		return this.def29;
	}

	/**
	 * ����def29��Setter����.���������Զ�����29 ��������:2020-5-27
	 * 
	 * @param newDef29 java.lang.String
	 */
	public void setDef29(java.lang.String def29) {
		this.def29 = def29;
	}

	/**
	 * ���� def30��Getter����.���������Զ�����30 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef30() {
		return this.def30;
	}

	/**
	 * ����def30��Setter����.���������Զ�����30 ��������:2020-5-27
	 * 
	 * @param newDef30 java.lang.String
	 */
	public void setDef30(java.lang.String def30) {
		this.def30 = def30;
	}

	/**
	 * ���� def31��Getter����.���������Զ�����31 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef31() {
		return this.def31;
	}

	/**
	 * ����def31��Setter����.���������Զ�����31 ��������:2020-5-27
	 * 
	 * @param newDef31 java.lang.String
	 */
	public void setDef31(java.lang.String def31) {
		this.def31 = def31;
	}

	/**
	 * ���� def32��Getter����.���������Զ�����32 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef32() {
		return this.def32;
	}

	/**
	 * ����def32��Setter����.���������Զ�����32 ��������:2020-5-27
	 * 
	 * @param newDef32 java.lang.String
	 */
	public void setDef32(java.lang.String def32) {
		this.def32 = def32;
	}

	/**
	 * ���� def33��Getter����.���������Զ�����33 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef33() {
		return this.def33;
	}

	/**
	 * ����def33��Setter����.���������Զ�����33 ��������:2020-5-27
	 * 
	 * @param newDef33 java.lang.String
	 */
	public void setDef33(java.lang.String def33) {
		this.def33 = def33;
	}

	/**
	 * ���� def34��Getter����.���������Զ�����34 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef34() {
		return this.def34;
	}

	/**
	 * ����def34��Setter����.���������Զ�����34 ��������:2020-5-27
	 * 
	 * @param newDef34 java.lang.String
	 */
	public void setDef34(java.lang.String def34) {
		this.def34 = def34;
	}

	/**
	 * ���� def35��Getter����.���������Զ�����35 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef35() {
		return this.def35;
	}

	/**
	 * ����def35��Setter����.���������Զ�����35 ��������:2020-5-27
	 * 
	 * @param newDef35 java.lang.String
	 */
	public void setDef35(java.lang.String def35) {
		this.def35 = def35;
	}

	/**
	 * ���� def36��Getter����.���������Զ�����36 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef36() {
		return this.def36;
	}

	/**
	 * ����def36��Setter����.���������Զ�����36 ��������:2020-5-27
	 * 
	 * @param newDef36 java.lang.String
	 */
	public void setDef36(java.lang.String def36) {
		this.def36 = def36;
	}

	/**
	 * ���� def37��Getter����.���������Զ�����37 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef37() {
		return this.def37;
	}

	/**
	 * ����def37��Setter����.���������Զ�����37 ��������:2020-5-27
	 * 
	 * @param newDef37 java.lang.String
	 */
	public void setDef37(java.lang.String def37) {
		this.def37 = def37;
	}

	/**
	 * ���� def38��Getter����.���������Զ�����38 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef38() {
		return this.def38;
	}

	/**
	 * ����def38��Setter����.���������Զ�����38 ��������:2020-5-27
	 * 
	 * @param newDef38 java.lang.String
	 */
	public void setDef38(java.lang.String def38) {
		this.def38 = def38;
	}

	/**
	 * ���� def39��Getter����.���������Զ�����39 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef39() {
		return this.def39;
	}

	/**
	 * ����def39��Setter����.���������Զ�����39 ��������:2020-5-27
	 * 
	 * @param newDef39 java.lang.String
	 */
	public void setDef39(java.lang.String def39) {
		this.def39 = def39;
	}

	/**
	 * ���� def40��Getter����.���������Զ�����40 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef40() {
		return this.def40;
	}

	/**
	 * ����def40��Setter����.���������Զ�����40 ��������:2020-5-27
	 * 
	 * @param newDef40 java.lang.String
	 */
	public void setDef40(java.lang.String def40) {
		this.def40 = def40;
	}

	/**
	 * ���� def41��Getter����.���������Զ�����41 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef41() {
		return this.def41;
	}

	/**
	 * ����def41��Setter����.���������Զ�����41 ��������:2020-5-27
	 * 
	 * @param newDef41 java.lang.String
	 */
	public void setDef41(java.lang.String def41) {
		this.def41 = def41;
	}

	/**
	 * ���� def42��Getter����.���������Զ�����42 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef42() {
		return this.def42;
	}

	/**
	 * ����def42��Setter����.���������Զ�����42 ��������:2020-5-27
	 * 
	 * @param newDef42 java.lang.String
	 */
	public void setDef42(java.lang.String def42) {
		this.def42 = def42;
	}

	/**
	 * ���� def43��Getter����.���������Զ�����43 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef43() {
		return this.def43;
	}

	/**
	 * ����def43��Setter����.���������Զ�����43 ��������:2020-5-27
	 * 
	 * @param newDef43 java.lang.String
	 */
	public void setDef43(java.lang.String def43) {
		this.def43 = def43;
	}

	/**
	 * ���� def44��Getter����.���������Զ�����44 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef44() {
		return this.def44;
	}

	/**
	 * ����def44��Setter����.���������Զ�����44 ��������:2020-5-27
	 * 
	 * @param newDef44 java.lang.String
	 */
	public void setDef44(java.lang.String def44) {
		this.def44 = def44;
	}

	/**
	 * ���� def45��Getter����.���������Զ�����45 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef45() {
		return this.def45;
	}

	/**
	 * ����def45��Setter����.���������Զ�����45 ��������:2020-5-27
	 * 
	 * @param newDef45 java.lang.String
	 */
	public void setDef45(java.lang.String def45) {
		this.def45 = def45;
	}

	/**
	 * ���� def46��Getter����.���������Զ�����46 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef46() {
		return this.def46;
	}

	/**
	 * ����def46��Setter����.���������Զ�����46 ��������:2020-5-27
	 * 
	 * @param newDef46 java.lang.String
	 */
	public void setDef46(java.lang.String def46) {
		this.def46 = def46;
	}

	/**
	 * ���� def47��Getter����.���������Զ�����47 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef47() {
		return this.def47;
	}

	/**
	 * ����def47��Setter����.���������Զ�����47 ��������:2020-5-27
	 * 
	 * @param newDef47 java.lang.String
	 */
	public void setDef47(java.lang.String def47) {
		this.def47 = def47;
	}

	/**
	 * ���� def48��Getter����.���������Զ�����48 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef48() {
		return this.def48;
	}

	/**
	 * ����def48��Setter����.���������Զ�����48 ��������:2020-5-27
	 * 
	 * @param newDef48 java.lang.String
	 */
	public void setDef48(java.lang.String def48) {
		this.def48 = def48;
	}

	/**
	 * ���� def49��Getter����.���������Զ�����49 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef49() {
		return this.def49;
	}

	/**
	 * ����def49��Setter����.���������Զ�����49 ��������:2020-5-27
	 * 
	 * @param newDef49 java.lang.String
	 */
	public void setDef49(java.lang.String def49) {
		this.def49 = def49;
	}

	/**
	 * ���� def50��Getter����.���������Զ�����50 ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDef50() {
		return this.def50;
	}

	/**
	 * ����def50��Setter����.���������Զ�����50 ��������:2020-5-27
	 * 
	 * @param newDef50 java.lang.String
	 */
	public void setDef50(java.lang.String def50) {
		this.def50 = def50;
	}

	/**
	 * ���� duration��Getter����.������������ ��������:2020-5-27
	 * 
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDuration() {
		return this.duration;
	}

	/**
	 * ����duration��Setter����.������������ ��������:2020-5-27
	 * 
	 * @param newDuration java.lang.Integer
	 */
	public void setDuration(java.lang.Integer duration) {
		this.duration = duration;
	}

	/**
	 * ���� milestone��Getter����.����������̱� ��������:2020-5-27
	 * 
	 * @return nc.vo.pub.lang.UFBoolean
	 */
	public UFBoolean getMilestone() {
		return this.milestone;
	}

	/**
	 * ����milestone��Setter����.����������̱� ��������:2020-5-27
	 * 
	 * @param newMilestone nc.vo.pub.lang.UFBoolean
	 */
	public void setMilestone(UFBoolean milestone) {
		this.milestone = milestone;
	}

	/**
	 * ���� version��Getter����.���������汾�� ��������:2020-5-27
	 * 
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getVersion() {
		return this.version;
	}

	/**
	 * ����version��Setter����.���������汾�� ��������:2020-5-27
	 * 
	 * @param newVersion java.lang.Integer
	 */
	public void setVersion(java.lang.Integer version) {
		this.version = version;
	}

	/**
	 * ���� max_version��Getter����.�����������°汾�� ��������:2020-5-27
	 * 
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getMax_version() {
		return this.max_version;
	}

	/**
	 * ����max_version��Setter����.�����������°汾�� ��������:2020-5-27
	 * 
	 * @param newMax_version java.lang.Integer
	 */
	public void setMax_version(java.lang.Integer max_version) {
		this.max_version = max_version;
	}

	/**
	 * ���� pk_front_plan��Getter����.��������ǰ������ ��������:2020-5-27
	 * 
	 * @return nc.vo.pmsch.plan.TimePlanItemVO
	 */
	public java.lang.String getPk_front_plan() {
		return this.pk_front_plan;
	}

	/**
	 * ����pk_front_plan��Setter����.��������ǰ������ ��������:2020-5-27
	 * 
	 * @param newPk_front_plan nc.vo.pmsch.plan.TimePlanItemVO
	 */
	public void setPk_front_plan(java.lang.String pk_front_plan) {
		this.pk_front_plan = pk_front_plan;
	}

	/**
	 * ���� pk_temp_b��Getter����.��������ģ������ ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_temp_b() {
		return this.pk_temp_b;
	}

	/**
	 * ����pk_temp_b��Setter����.��������ģ������ ��������:2020-5-27
	 * 
	 * @param newPk_temp_b java.lang.String
	 */
	public void setPk_temp_b(java.lang.String pk_temp_b) {
		this.pk_temp_b = pk_temp_b;
	}

	/**
	 * ���� pk_origin_item��Getter����.����������Ч��Ŀ���� ��������:2020-5-27
	 * 
	 * @return nc.vo.pmsch.plan.TimePlanItemVO
	 */
	public java.lang.String getPk_origin_item() {
		return this.pk_origin_item;
	}

	/**
	 * ����pk_origin_item��Setter����.����������Ч��Ŀ���� ��������:2020-5-27
	 * 
	 * @param newPk_origin_item nc.vo.pmsch.plan.TimePlanItemVO
	 */
	public void setPk_origin_item(java.lang.String pk_origin_item) {
		this.pk_origin_item = pk_origin_item;
	}

	/**
	 * ���� full_seq��Getter����.��������������� ��������:2020-5-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getFull_seq() {
		return this.full_seq;
	}

	/**
	 * ����full_seq��Setter����.��������������� ��������:2020-5-27
	 * 
	 * @param newFull_seq java.lang.String
	 */
	public void setFull_seq(java.lang.String full_seq) {
		this.full_seq = full_seq;
	}

	/**
	 * ���� plan_level��Getter����.������������ ��������:2020-5-27
	 * 
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getPlan_level() {
		return this.plan_level;
	}

	/**
	 * ����plan_level��Setter����.������������ ��������:2020-5-27
	 * 
	 * @param newPlan_level java.lang.Integer
	 */
	public void setPlan_level(java.lang.Integer plan_level) {
		this.plan_level = plan_level;
	}

	/**
	 * ���� leaf��Getter����.��������Ҷ�ӽڵ� ��������:2020-5-27
	 * 
	 * @return nc.vo.pub.lang.UFBoolean
	 */
	public Boolean getLeaf() {
		return this.leaf;
	}

	/**
	 * ����leaf��Setter����.��������Ҷ�ӽڵ� ��������:2020-5-27
	 * 
	 * @param newLeaf nc.vo.pub.lang.UFBoolean
	 */
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}

	/**
	 * ���� pk_progress��Getter����.�����������ȼ�¼ ��������:2020-5-27
	 * 
	 * @return nc.vo.pmsch.plan.progress.TimeProgressItemVO
	 */
	public java.lang.String getPk_progress() {
		return this.pk_progress;
	}

	/**
	 * ����pk_progress��Setter����.�����������ȼ�¼ ��������:2020-5-27
	 * 
	 * @param newPk_progress nc.vo.pmsch.plan.progress.TimeProgressItemVO
	 */
	public void setPk_progress(java.lang.String pk_progress) {
		this.pk_progress = pk_progress;
	}

	/**
	 * ���� pk_project��Getter����.����������Ŀ ��������:2020-5-27
	 * 
	 * @return nc.vo.pmpub.project.ProjectHeadVO
	 */
	public java.lang.String getPk_project() {
		return this.pk_project;
	}

	/**
	 * ����pk_project��Setter����.����������Ŀ ��������:2020-5-27
	 * 
	 * @param newPk_project nc.vo.pmpub.project.ProjectHeadVO
	 */
	public void setPk_project(java.lang.String pk_project) {
		this.pk_project = pk_project;
	}

	/**
	 * ���� �����ϲ�������Getter����.���������ϲ����� ��������:2020-5-27
	 * 
	 * @return String
	 */
	public String getPk_time_plan() {
		return this.pk_time_plan;
	}

	/**
	 * ���������ϲ�������Setter����.���������ϲ����� ��������:2020-5-27
	 * 
	 * @param newPk_time_plan String
	 */
	public void setPk_time_plan(String pk_time_plan) {
		this.pk_time_plan = pk_time_plan;
	}

	/**
	 * ���� ����ʱ�����Getter����.��������ʱ��� ��������:2020-5-27
	 * 
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public UFDateTime getTs() {
		return this.ts;
	}

	/**
	 * ��������ʱ�����Setter����.��������ʱ��� ��������:2020-5-27
	 * 
	 * @param newts nc.vo.pub.lang.UFDateTime
	 */
	public void setTs(UFDateTime ts) {
		this.ts = ts;
	}

	@Override
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("adprepare.xunprojectplanBVO");
	}
}
