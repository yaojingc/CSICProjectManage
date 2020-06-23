
delete from pub_msgtemp where typecode = 'PROS';
go

insert into pub_msgtemp(pk_templet,dr,langcode,messagetitle,pk_org,pk_outtemplet,tempcode,tempdscrpt,tempname,textcontent,ts,typecode,attachdoctype,attachtype,attdeftype,pk_temptype) values('0001ZZZZb9ed117157e1',0,'simpchn','@&m submitter.user_name@提交的工程开工单主实体待审批','GLOBLE00000000000000',null,'PROST','工程开工单主实体审批信息','~','<div class="divtext">
<span class="labeltext">财务组织:<span class="normaltext">@&m pk_org.name@</span></span>
</div>
<div class="divtext">
<span class="labeltext">单据编号:<span class="normaltext">@&m billno@</span></span>
</div>','2020-05-28 10:53:17','PROS',0,0,'~','0001ZZZZc0dc5c133d21');
go

delete from pub_msgtemp_type where tempcode = 'WF_adprepare';
go
insert into pub_msgtemp_type(pk_temptype,dr,innercode,metaid,name,parentpk,tempcode,ts,comp) values('0001ZZZZa1ef5827d0a6',0,'DTUQC98Y','~','~','1004Z010000000005ALB','WF_adprepare','2020-05-28 10:53:17',null);
go



