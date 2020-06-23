
delete from pub_msgtemp where typecode = 'KHXX';
go

insert into pub_msgtemp(pk_templet,dr,langcode,messagetitle,pk_org,pk_outtemplet,tempcode,tempdscrpt,tempname,textcontent,ts,typecode,attachdoctype,attachtype,attdeftype,pk_temptype) values('0001ZZZZd8a4b89d3585',0,'simpchn','@&m submitter.user_name@提交的客户信息登记待审批','GLOBLE00000000000000',null,'KHXXT','客户信息登记审批信息','~','<div class="divtext">
<span class="labeltext">财务组织:<span class="normaltext">@&m pk_org.name@</span></span>
</div>
<div class="divtext">
<span class="labeltext">单据编号:<span class="normaltext">@&m billno@</span></span>
</div>','2020-05-08 16:41:45','KHXX',0,0,'~','0001ZZZZc94e957e7647');
go

delete from pub_msgtemp_type where tempcode = 'WF_adprepare';
go
insert into pub_msgtemp_type(pk_temptype,dr,innercode,metaid,name,parentpk,tempcode,ts,comp) values('0001ZZZZ6ba187239b80',0,'DTUQC98Y','~','~','1004Z010000000005ALB','WF_adprepare','2020-05-08 16:41:45',null);
go



