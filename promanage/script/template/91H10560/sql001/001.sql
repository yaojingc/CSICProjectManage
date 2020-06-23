insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ92ed61f1b4e2','91H10560','nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO','91H10560_LIST',null,'~',0,'list_head','Y',null,null,'~','项目旬计划列表','91H10560_LIST','root',null,null,null,null,'项目旬计划列表页面','2020-05-28 16:26:10');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZe2a9e344d773','91H10560','nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO','91H10560_CARD',null,'~',0,'card_head','N',null,null,'~','项目旬计划卡片','91H10560_CARD','root',null,null,null,null,'项目旬计划卡片页面','2020-05-28 16:26:10');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZc375bd13184c','91H10560','nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO','91H10560L_CARD',null,'~',0,'card_head','N',null,null,'~','项目旬计划联查卡片','91H10560L_CARD','root',null,null,null,null,'项目旬计划联查卡片页面','2020-05-28 16:26:10');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ97aa534f1165','91H10560A','nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO','91H10560A_CARD',null,'~',0,'card_head','N',null,null,'~','项目旬计划审批卡片','91H10560A_CARD','root',null,null,null,null,'项目旬计划审批卡片页面','2020-05-28 16:26:10');
go







insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZdbde490b4b5b',null,'browse',0,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','list_query',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体',null,null,'~','查询区',null,2,null,'','0001ZZZZ92ed61f1b4e2','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZd47d9640b53d',null,'browse',2,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','list_head',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体',null,null,'~','表头',null,1,null,'','0001ZZZZ92ed61f1b4e2','2020-05-28 16:26:10');
go




insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ322c7aefa9f5',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_head',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划主实体',null,1,null,null,'0001ZZZZe2a9e344d773','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ74fb0567ba1f',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_operate',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZe2a9e344d773','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ747e44dc07e1',null,'browse',2,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,3,null,null,'0001ZZZZe2a9e344d773','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ9095f7d87567',null,'edit',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_edit',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,4,'card_body',null,'0001ZZZZe2a9e344d773','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ86db06cd18cc',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_browse',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,5,'card_body',null,'0001ZZZZe2a9e344d773','2020-05-28 16:26:10');
go


insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZb0fc08a6f816',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_head',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划主实体',null,1,null,null,'0001ZZZZc375bd13184c','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZfb2c5e8ca8d9',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_operate',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZc375bd13184c','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ836b606e12ab',null,'browse',2,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,3,null,null,'0001ZZZZc375bd13184c','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ8b3e2aa3dea9',null,'edit',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_edit',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,4,'card_body',null,'0001ZZZZc375bd13184c','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ27313c3f98ed',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_browse',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,5,'card_body',null,'0001ZZZZc375bd13184c','2020-05-28 16:26:10');
go

insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ6b15fa3fedcd',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_head',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划主实体',null,1,null,null,'0001ZZZZ97aa534f1165','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ4abffe7519c0',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_operate',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZ97aa534f1165','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ3463d4416e24',null,'browse',2,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,3,null,null,'0001ZZZZ97aa534f1165','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ7dc51736c3cd',null,'edit',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_edit',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,4,'card_body',null,'0001ZZZZ97aa534f1165','2020-05-28 16:26:10');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ8e18a3967d67',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_browse',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,5,'card_body',null,'0001ZZZZ97aa534f1165','2020-05-28 16:26:10');
go



















            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZb7ab9ed21001','0001ZZZZ747e44dc07e1','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,'', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'80120ffc-3d23-44f3-94b3-b20478f8f9c6','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10560_00080',null,null,'2020-05-28 16:26:10',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZa78b1ef5d001','0001ZZZZ9095f7d87567','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,'', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'4b1bb587-2ff6-48ac-9ac9-ce168180a821','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10560_00080',null,null,'2020-05-28 16:26:10',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ6292c46df001','0001ZZZZ86db06cd18cc','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,'', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'b2bfffd0-9b07-4f91-8b81-789bbf07f583','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10560_00080',null,null,'2020-05-28 16:26:10',null,'Y',null);
            go















            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ3d334bbd3001','0001ZZZZ836b606e12ab','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'977d3753-9507-4a35-8403-c404e8b8f94b','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:10',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ4c608a073001','0001ZZZZ8b3e2aa3dea9','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'052390b8-8ee1-4521-87fe-05e4fb008f13','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:10',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ59b71b22c001','0001ZZZZ27313c3f98ed','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'ef41c30d-20b6-464e-8388-e1daa4c69f14','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:10',null,'Y',null);
            go











            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZfdeb0e13b001','0001ZZZZ3463d4416e24','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'eaaea4fc-cb55-4ddc-908c-fabbc7a9fbe9','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:10',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ626e64c8d001','0001ZZZZ7dc51736c3cd','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'b0de667e-f49e-4b82-936d-6fd79bd4133a','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:10',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ364fa7671001','0001ZZZZ8e18a3967d67','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'9db164e0-c375-4c18-8624-ea8c5838b0f0','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:10',null,'Y',null);
            go
