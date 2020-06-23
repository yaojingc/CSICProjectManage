insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ0d41a19fae20','91H10555','nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO','91H10555_LIST',null,'~',0,'list_head','Y',null,null,'~','旬计划列表','91H10555_LIST','root',null,null,null,null,'旬计划列表页面','2020-05-27 16:48:58');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ0b6fab6d9e9d','91H10555','nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO','91H10555_CARD',null,'~',0,'card_head','N',null,null,'~','旬计划卡片','91H10555_CARD','root',null,null,null,null,'旬计划卡片页面','2020-05-27 16:48:58');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ2f0a3160cd66','91H10555','nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO','91H10555L_CARD',null,'~',0,'card_head','N',null,null,'~','旬计划联查卡片','91H10555L_CARD','root',null,null,null,null,'旬计划联查卡片页面','2020-05-27 16:48:58');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ4ee39e2e7ec3','91H10555A','nc.vo.adprepare.xunprojectplan.AggXunprojectplanHVO','91H10555A_CARD',null,'~',0,'card_head','N',null,null,'~','旬计划审批卡片','91H10555A_CARD','root',null,null,null,null,'旬计划审批卡片页面','2020-05-27 16:48:58');
go







insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ30f726d7f20b',null,'browse',0,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','list_query',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体',null,null,'~','查询区',null,2,null,'','0001ZZZZ0d41a19fae20','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ53a54d8656b8',null,'browse',2,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','list_head',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体',null,null,'~','表头',null,1,null,'','0001ZZZZ0d41a19fae20','2020-05-27 16:48:58');
go




insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ1174af6b0373',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_head',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划主实体',null,1,null,null,'0001ZZZZ0b6fab6d9e9d','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ5fda6ee77cb8',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_operate',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZ0b6fab6d9e9d','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ0a07c27e179f',null,'browse',2,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,3,null,null,'0001ZZZZ0b6fab6d9e9d','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ688e8b49492b',null,'edit',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_edit',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,4,'card_body',null,'0001ZZZZ0b6fab6d9e9d','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ6746f08a199d',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_browse',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,5,'card_body',null,'0001ZZZZ0b6fab6d9e9d','2020-05-27 16:48:58');
go


insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ870c32e6bc19',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_head',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划主实体',null,1,null,null,'0001ZZZZ2f0a3160cd66','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZa2438b622eb1',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_operate',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZ2f0a3160cd66','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ7b36bbb141cb',null,'browse',2,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,3,null,null,'0001ZZZZ2f0a3160cd66','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ7694096ee400',null,'edit',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_edit',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,4,'card_body',null,'0001ZZZZ2f0a3160cd66','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ2df889d42156',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_browse',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,5,'card_body',null,'0001ZZZZ2f0a3160cd66','2020-05-27 16:48:58');
go

insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ5c226b4749ea',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_head',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划主实体',null,1,null,null,'0001ZZZZ4ee39e2e7ec3','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ82626969d16c',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanHVO','card_operate',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZ4ee39e2e7ec3','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZa2946001145e',null,'browse',2,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,3,null,null,'0001ZZZZ4ee39e2e7ec3','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ53684e1191f6',null,'edit',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_edit',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,4,'card_body',null,'0001ZZZZ4ee39e2e7ec3','2020-05-27 16:48:58');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ1f22b44ffa7a',null,'browse',1,'nc.vo.adprepare.xunprojectplan.XunprojectplanBVO','card_body_browse',null,'~',0,null,'9eca453e-1c9b-461e-a9de-45302344d73e','旬计划主实体','adprepare.xunprojectplan',null,'~','旬计划子实体',null,5,'card_body',null,'0001ZZZZ4ee39e2e7ec3','2020-05-27 16:48:58');
go




            insert into pub_query_property(pk_query_property,areaid,classid,code,containlower,creationtime,creator,datatype,dataval,defaultvalue,define1,define2,define3,define4,define5,disabled,dr,isbeyondorg,ischeck,isdefined,isfixedcondition,ismultiselectedenabled,isnotmeta,isquerycondition,isuse,itemtype,label,maxlength,metadataproperty,metapath,opersign,opersignname,position,proid,querytablename,refcode,refname,required,resid,returntype,showtype,tablecode,ts,usefunc,visible,visibleposition,width)
            values('0001ZZZZd60c9e43f97c','0001ZZZZ30f726d7f20b','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group',null,null,'~',204,'','','','','','','','N',0,'N','N','N','N','N','N','Y','Y','refer','集团',20,'uap.group.name','pk_group','=@','等于@',2,'c4116c34-e2ff-4ad3-93ea-5fc9926ea6be','','uap/refer/riart/groupTreeRef/index','集团','N','','refpk',1,'','2020-05-27 16:48:58','N','Y',null,1);
            go


        insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
        values('0001ZZZZf37071237086','0001ZZZZ53a54d8656b8','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group',null,'#111111',null,'~',204, '', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer',null,28,'uap.group.name','3b6dd171-2900-47f3-bfbe-41e4483a2a65','pk_group',null,'~',2,'b81cbc95-49da-4e09-89ba-6c5cae9323da','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10555_00087',null,null,'2020-05-27 16:48:58',null,'Y',null);
        go








            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ8ac6a1dda086','0001ZZZZ1174af6b0373','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group','1','#111111',null,'~',204,'' , null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer',null,28,'uap.group.name','','pk_group',null,'~',2,'19d9673d-7658-4129-b507-bc168cbb62df','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10555_00087',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go






            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ176e78397001','0001ZZZZ0a07c27e179f','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'890e31b1-1391-416c-a1d7-a6b181f47fa9',null,null,null,'N','app_91H10555_00001',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ176e78397002','0001ZZZZ0a07c27e179f','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'ac86ea86-8f50-4b9b-befc-45dea35613fd',null,null,null,'N','app_91H10555_00002',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ48f525a46001','0001ZZZZ688e8b49492b','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'a499d3c1-13fb-4024-ace0-8068004991dc',null,null,null,'N','app_91H10555_00001',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ48f525a46002','0001ZZZZ688e8b49492b','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'d849535a-c0e3-4cc8-be36-95e1c77dcf3d',null,null,null,'N','app_91H10555_00002',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ72849f8ec001','0001ZZZZ6746f08a199d','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'03c0c947-68bd-4eef-8840-2629f427084e',null,null,null,'N','app_91H10555_00001',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ72849f8ec002','0001ZZZZ6746f08a199d','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'9018ac6c-420c-4db5-8f5d-6caf5df11f22',null,null,null,'N','app_91H10555_00002',null,null,'2020-05-27 16:48:58',null,'Y',null);
            go











            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ9a85cc3eb086','0001ZZZZ870c32e6bc19','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer',null,28,'uap.group.name','','pk_group',null,'~',2,'8d81828d-8ff4-4e12-ab84-68e3d62ba59c','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go




            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZe147db038001','0001ZZZZ7b36bbb141cb','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'11f15020-7797-4dd9-b278-d774a801f3f3',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZe147db038002','0001ZZZZ7b36bbb141cb','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'1f2c25cb-84d9-476f-8d7a-ff3463e2856a',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ5d972ffcd001','0001ZZZZ7694096ee400','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'f05003a2-c3db-4796-8d8f-3b408b48f6fc',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ5d972ffcd002','0001ZZZZ7694096ee400','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'995d0fa0-4c8d-46c4-81a0-f962c49b2941',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZa20916cd0001','0001ZZZZ2df889d42156','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'9bbf9589-c7b6-4891-80cd-3dec66b6aac7',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZa20916cd0002','0001ZZZZ2df889d42156','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'13b3c428-c35c-4070-84ae-a9df3e98958a',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go







            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZe41bb276f086','0001ZZZZ5c226b4749ea','9eca453e-1c9b-461e-a9de-45302344d73e','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,'uap.group.name','','pk_group',null,'~',2,'2983c72f-80c8-4207-834d-be8f6ed78194','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go




            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ3a51142fb001','0001ZZZZa2946001145e','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'d5abb74b-223b-4733-9d02-f8c4bbcd4160',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ3a51142fb002','0001ZZZZa2946001145e','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'550fac5b-144f-4c13-979f-b408c262aabd',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ7497f27da001','0001ZZZZ53684e1191f6','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'0b0fa73f-7fdd-4e39-9be2-64aed5d26acf',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ7497f27da002','0001ZZZZ53684e1191f6','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'38acc211-8228-406e-b0e1-66874eed0130',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ764659b14001','0001ZZZZ1f22b44ffa7a','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','name','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务名称',28,NULL,'','id_xunprojectplanbvo.name',null,'~',7,'249b0c3e-c524-49fb-9279-1bf0204fd7db',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ764659b14002','0001ZZZZ1f22b44ffa7a','654b95d5-9975-410a-bef4-f0f9d8dc0d1f','description','1','#111111',null,'~',1,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','input','任务描述',28,NULL,'','id_xunprojectplanbvo.description',null,'~',8,'233e7688-93b5-4594-a967-72ec4324b433',null,null,null,'N',null,null,null,'2020-05-27 16:48:58',null,'Y',null);
            go
