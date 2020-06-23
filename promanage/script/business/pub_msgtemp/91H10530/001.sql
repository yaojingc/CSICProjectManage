
delete from pub_msgtemp where typecode = 'XMZZ';
go

insert into pub_msgtemp(pk_templet,dr,langcode,messagetitle,pk_org,pk_outtemplet,tempcode,tempdscrpt,tempname,textcontent,ts,typecode,attachdoctype,attachtype,attdeftype,pk_temptype) values('0001ZZZZ056e97773060',0,'simpchn','@&m submitter.user_name@提交的营销项目跟踪待审批','GLOBLE00000000000000',null,'XMZZT','营销项目跟踪审批信息','~','<div class="divtext">
<span class="labeltext">财务组织:<span class="normaltext">@&m pk_org.name@</span></span>
</div>
<div class="divtext">
<span class="labeltext">单据编号:<span class="normaltext">@&m billno@</span></span>
</div>','2020-05-08 16:43:34','XMZZ',0,0,'~','0001ZZZZ23ae19088480');
go

delete from pub_msgtemp_type where tempcode = 'WF_adprepare';
go
insert into pub_msgtemp_type(pk_temptype,dr,innercode,metaid,name,parentpk,tempcode,ts,comp) values('0001ZZZZ08503850048f',0,'DTUQC98Y','~','~','1004Z010000000005ALB','WF_adprepare','2020-05-08 16:43:34',null);
go



