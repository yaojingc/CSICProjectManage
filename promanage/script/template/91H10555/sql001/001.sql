insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZab52a1078f83','91H10555','nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO','91H10555_LIST',null,'~',0,'list_head','Y',null,null,'~','旬计划列表','91H10555_LIST','root',null,null,null,null,'旬计划列表页面','2020-05-27 16:48:58');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZe7e282cbf47d','91H10555','nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO','91H10555_CARD',null,'~',0,'card_head','N',null,null,'~','旬计划卡片','91H10555_CARD','root',null,null,null,null,'旬计划卡片页面','2020-05-27 16:48:58');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZb79823bcc61e','91H10555','nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO','91H10555L_CARD',null,'~',0,'card_head','N',null,null,'~','旬计划联查卡片','91H10555L_CARD','root',null,null,null,null,'旬计划联查卡片页面','2020-05-27 16:48:58');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ5d00aa0f41fb','91H10555A','nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO','91H10555A_CARD',null,'~',0,'card_head','N',null,null,'~','旬计划审批卡片','91H10555A_CARD','root',null,null,null,null,'旬计划审批卡片页面','2020-05-27 16:48:58');
go







insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ5c2099ffe46a',null,'browse',0,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','list_query',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体',null,null,'~','查询区',null,2,null,'','0001ZZZZab52a1078f83','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZa5bbb8586473',null,'browse',2,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','list_head',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体',null,null,'~','表头',null,1,null,'','0001ZZZZab52a1078f83','2020-05-27 16:48:58');
go




insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZbc37d4fb1a5c',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_head',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划主实体',null,1,null,null,'0001ZZZZe7e282cbf47d','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZe14dabce0a83',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_operate',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZe7e282cbf47d','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZb15e1daa33e5',null,'browse',2,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,3,null,null,'0001ZZZZe7e282cbf47d','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ3b7afa173ab9',null,'edit',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_edit',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,4,'card_body',null,'0001ZZZZe7e282cbf47d','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZde7173dca127',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_browse',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,5,'card_body',null,'0001ZZZZe7e282cbf47d','2020-05-27 16:48:58');
go


insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ95e51bb749c1',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_head',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划主实体',null,1,null,null,'0001ZZZZb79823bcc61e','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ61923e31d6b4',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_operate',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZb79823bcc61e','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ03626fc18e1a',null,'browse',2,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,3,null,null,'0001ZZZZb79823bcc61e','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZfc20061bc890',null,'edit',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_edit',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,4,'card_body',null,'0001ZZZZb79823bcc61e','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZd930fd21af62',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_browse',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,5,'card_body',null,'0001ZZZZb79823bcc61e','2020-05-27 16:48:58');
go

insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ7d56d613ee66',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_head',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划主实体',null,1,null,null,'0001ZZZZ5d00aa0f41fb','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ575cd2a06c8a',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_operate',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZ5d00aa0f41fb','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZfef898c5bba0',null,'browse',2,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,3,null,null,'0001ZZZZ5d00aa0f41fb','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ345fd3d7ea32',null,'edit',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_edit',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,4,'card_body',null,'0001ZZZZ5d00aa0f41fb','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ016f7523c8fa',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_browse',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,5,'card_body',null,'0001ZZZZ5d00aa0f41fb','2020-05-27 16:48:58');
go




            insert into pub_query_property(pk_query_property,areaid,classid,code,containlower,creationtime,creator,datatype,dataval,defaultvalue,define1,define2,define3,define4,define5,disabled,dr,isbeyondorg,ischeck,isdefined,isfixedcondition,ismultiselectedenabled,isnotmeta,isquerycondition,isuse,itemtype,label,maxlength,metadataproperty,metapath,opersign,opersignname,position,proid,querytablename,refcode,refname,required,resid,returntype,showtype,tablecode,ts,usefunc,visible,visibleposition,width)
            values('0001ZZZZ4cb654212d3b','0001ZZZZ5c2099ffe46a','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group',null,null,'~',204,'','','','','','','','N',0,'N','N','N','N','N','N','Y','Y','refer','集团',20,'uap.group.name','pk_group','=@','等于@',2,'b69bb062-de60-48e9-a350-b885c770b6cf','','uap/refer/riart/groupTreeRef/index','集团','N','','refpk',1,'','2020-05-27 16:48:58','N','Y',null,1);
            go


        insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
        values('0001ZZZZc72027707086','0001ZZZZa5bbb8586473','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group',null,'#111111',null,'~',204, '', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer',null,28,'uap.group.name','3b6dd171-2900-47f3-bfbe-41e4483a2a65','pk_group',null,'~',2,'0ba13d8e-f560-4cbd-a314-684b58e20b4b','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10555_00087',null,null,'2020-05-27 16:48:58',null,'Y',null);
        go








            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ09f5d302f086','0001ZZZZbc37d4fb1a5c','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group','1','#111111',null,'~',204,'' , null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer',null,28,'uap.group.name','','pk_group',null,'~',2,'54fbc270-f5ca-4b43-8fc8-57892e9b1d55','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10555_00087',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go






            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ519df44f2001','0001ZZZZb15e1daa33e5','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'35b4016a-0a20-428b-99fc-7745d2dc263e',null,null,null,'N','app_91H10555_00001',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ519df44f2002','0001ZZZZb15e1daa33e5','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'0317d5ee-1796-4e05-8b68-f84e866b5e42',null,null,null,'N','app_91H10555_00002',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ6bcb701e1001','0001ZZZZ3b7afa173ab9','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'70eb387d-c3b7-495f-8306-b9cbf507d93e',null,null,null,'N','app_91H10555_00001',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ6bcb701e1002','0001ZZZZ3b7afa173ab9','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'ae79fbc3-c3f4-4e28-bf86-f3ed0c9ed4eb',null,null,null,'N','app_91H10555_00002',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZdd69157b7001','0001ZZZZde7173dca127','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'090053eb-d610-4810-bb50-f0f72135db66',null,null,null,'N','app_91H10555_00001',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZdd69157b7002','0001ZZZZde7173dca127','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'571001db-e4d0-4285-b292-756e870f9feb',null,null,null,'N','app_91H10555_00002',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go











            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ70253613b086','0001ZZZZ95e51bb749c1','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer',null,28,'uap.group.name','','pk_group',null,'~',2,'258d0ae5-9156-4ba1-8b2c-7f6a04755230','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go




            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ4528878d4001','0001ZZZZ03626fc18e1a','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'d6f4bf44-9128-436d-8141-a8789edcda96',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ4528878d4002','0001ZZZZ03626fc18e1a','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'0efe93c0-75c3-4bd9-a539-e9b9550975a8',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZf2ae10cba001','0001ZZZZfc20061bc890','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'61baeafd-f899-40b5-a21d-1cde084cc555',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZf2ae10cba002','0001ZZZZfc20061bc890','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'3dd41122-854a-498b-9f71-c788f491071e',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ3e6dc77e8001','0001ZZZZd930fd21af62','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'55500cbb-73bf-41d3-bdb0-42eb38efb974',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ3e6dc77e8002','0001ZZZZd930fd21af62','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'237644e4-8608-40ab-926b-c6e4a13d150d',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go







            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZf0ff8e47e086','0001ZZZZ7d56d613ee66','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,'uap.group.name','','pk_group',null,'~',2,'1472b578-b593-45d9-9d35-6a44bd798407','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go




            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ483095688001','0001ZZZZfef898c5bba0','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'c668d19b-bd66-49bf-9621-68a455afe349',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ483095688002','0001ZZZZfef898c5bba0','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'f71a36b3-920d-4f37-851c-21f9382a0509',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZffe2c12c4001','0001ZZZZ345fd3d7ea32','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'181d3239-05ef-4ee4-8ae1-fa5cfcba502f',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZffe2c12c4002','0001ZZZZ345fd3d7ea32','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'8fa6c974-301d-4a7d-ae7c-1ea75e7d8c15',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZdc6d60731001','0001ZZZZ016f7523c8fa','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'9b58d7de-dfe4-4494-bd2d-81c43fe80b0a',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZdc6d60731002','0001ZZZZ016f7523c8fa','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'2b5c0057-c9d4-4d26-bb2a-e18dea26267c',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
