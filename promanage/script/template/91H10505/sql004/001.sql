
delete from pub_msgtemp where typecode = 'CHDJ';
go

insert into pub_msgtemp(pk_templet,dr,langcode,messagetitle,pk_org,pk_outtemplet,tempcode,tempdscrpt,tempname,textcontent,ts,typecode,attachdoctype,attachtype,attdeftype,pk_temptype) values('0001ZZZZf0a6379f54c3',0,'simpchn','@&m submitter.user_name@提交的客户登记主待审批','GLOBLE00000000000000',null,'CHDJT','客户登记主审批信息','~','<div class="divtext">
<span class="labeltext">财务组织:<span class="normaltext">@&m pk_org.name@</span></span>
</div>
<div class="divtext">
<span class="labeltext">单据编号:<span class="normaltext">@&m billno@</span></span>
</div>','2020-05-04 16:02:22','CHDJ',0,0,'~','0001ZZZZ90ba54b1837f');
go

delete from pub_msgtemp_type where tempcode = 'WF_adprepare';
go
insert into pub_msgtemp_type(pk_temptype,dr,innercode,metaid,name,parentpk,tempcode,ts,comp) values('0001ZZZZ5077ce450b5b',0,'DTUQC98Y','~','~','1004Z010000000005ALB','WF_adprepare','2020-05-04 16:02:22',null);
go



