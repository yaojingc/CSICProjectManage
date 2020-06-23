
delete from pub_msgtemp where typecode = 'XUN1';
go

insert into pub_msgtemp(pk_templet,dr,langcode,messagetitle,pk_org,pk_outtemplet,tempcode,tempdscrpt,tempname,textcontent,ts,typecode,attachdoctype,attachtype,attdeftype,pk_temptype) values('0001ZZZZ329c2de61163',0,'simpchn','@&m submitter.user_name@提交的项目旬计划主实体待审批','GLOBLE00000000000000',null,'XUN1T','项目旬计划主实体审批信息','~','<div class="divtext">
<span class="labeltext">财务组织:<span class="normaltext">@&m pk_org.name@</span></span>
</div>
<div class="divtext">
<span class="labeltext">单据编号:<span class="normaltext">@&m billno@</span></span>
</div>','2020-05-28 16:26:10','XUN1',0,0,'~','0001ZZZZbc259cb3c0d2');
go

delete from pub_msgtemp_type where tempcode = 'WF_adprepare';
go
insert into pub_msgtemp_type(pk_temptype,dr,innercode,metaid,name,parentpk,tempcode,ts,comp) values('0001ZZZZ61a6ec7b0d4c',0,'DTUQC98Y','~','~','1004Z010000000005ALB','WF_adprepare','2020-05-28 16:26:10',null);
go



