
delete from pub_msgtemp where typecode = 'MPJP';
go

insert into pub_msgtemp(pk_templet,dr,langcode,messagetitle,pk_org,pk_outtemplet,tempcode,tempdscrpt,tempname,textcontent,ts,typecode,attachdoctype,attachtype,attdeftype,pk_temptype) values('0001ZZZZ489d1c37e507',0,'simpchn','@&m submitter.user_name@提交的项目月度计划主实体待审批','GLOBLE00000000000000',null,'MPJPT','项目月度计划主实体审批信息','~','<div class="divtext">
<span class="labeltext">财务组织:<span class="normaltext">@&m pk_org.name@</span></span>
</div>
<div class="divtext">
<span class="labeltext">单据编号:<span class="normaltext">@&m billno@</span></span>
</div>','2020-05-20 15:32:57','MPJP',0,0,'~','0001ZZZZf54f339db4e0');
go

delete from pub_msgtemp_type where tempcode = 'WF_adprepare';
go
insert into pub_msgtemp_type(pk_temptype,dr,innercode,metaid,name,parentpk,tempcode,ts,comp) values('0001ZZZZ57d049eb016f',0,'DTUQC98Y','~','~','1004Z010000000005ALB','WF_adprepare','2020-05-20 15:32:57',null);
go



