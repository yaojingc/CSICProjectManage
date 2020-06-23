insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ722191f81291','91H10560','nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO','91H10560_LIST',null,'~',0,'list_head','Y',null,null,'~','项目旬计划列表','91H10560_LIST','root',null,null,null,null,'项目旬计划列表页面','2020-05-28 16:26:11');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZc32c2aab3a59','91H10560','nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO','91H10560_CARD',null,'~',0,'card_head','N',null,null,'~','项目旬计划卡片','91H10560_CARD','root',null,null,null,null,'项目旬计划卡片页面','2020-05-28 16:26:11');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ9ff94ce060b9','91H10560','nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO','91H10560L_CARD',null,'~',0,'card_head','N',null,null,'~','项目旬计划联查卡片','91H10560L_CARD','root',null,null,null,null,'项目旬计划联查卡片页面','2020-05-28 16:26:11');
go

insert into pub_page_templet(pk_page_templet,appcode,clazz,code,creationtime,creator,dr,headcode,isdefault,metaid,modifiedtime,modifier,name,pagecode,parentid,pk_group,pk_org,resid,resmodule,templetdesc,ts)
values('0001ZZZZ58b6e4d08fb5','91H10560A','nc.vo.adprepare.tendayprojectplan.AggTenprojectplanHVO','91H10560A_CARD',null,'~',0,'card_head','N',null,null,'~','项目旬计划审批卡片','91H10560A_CARD','root',null,null,null,null,'项目旬计划审批卡片页面','2020-05-28 16:26:11');
go







insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ17ebef70141d',null,'browse',0,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','list_query',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体',null,null,'~','查询区',null,2,null,'','0001ZZZZ722191f81291','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ845e40f579c1',null,'browse',2,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','list_head',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体',null,null,'~','表头',null,1,null,'','0001ZZZZ722191f81291','2020-05-28 16:26:11');
go




insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZdc9eaaee2e48',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_head',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划主实体',null,1,null,null,'0001ZZZZc32c2aab3a59','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ931caca517d4',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_operate',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZc32c2aab3a59','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ4c09b0efe1cb',null,'browse',2,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,3,null,null,'0001ZZZZc32c2aab3a59','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ3d18db0b0b46',null,'edit',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_edit',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,4,'card_body',null,'0001ZZZZc32c2aab3a59','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZd5af959826e9',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_browse',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,5,'card_body',null,'0001ZZZZc32c2aab3a59','2020-05-28 16:26:11');
go


insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ46946b8afaa8',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_head',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划主实体',null,1,null,null,'0001ZZZZ9ff94ce060b9','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZc0f4aa522c46',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_operate',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZ9ff94ce060b9','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZf0c4fce8ba64',null,'browse',2,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,3,null,null,'0001ZZZZ9ff94ce060b9','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ5e367801bdee',null,'edit',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_edit',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,4,'card_body',null,'0001ZZZZ9ff94ce060b9','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZf2df75230313',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_browse',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,5,'card_body',null,'0001ZZZZ9ff94ce060b9','2020-05-28 16:26:11');
go

insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ8cc698b8590a',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_head',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划主实体',null,1,null,null,'0001ZZZZ58b6e4d08fb5','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ5b4a8801f51f',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanHVO','card_operate',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','操作信息',null,2,'card_head',null,'0001ZZZZ58b6e4d08fb5','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZa6d22d7e0d14',null,'browse',2,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,3,null,null,'0001ZZZZ58b6e4d08fb5','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ80152acfba22',null,'edit',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_edit',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,4,'card_body',null,'0001ZZZZ58b6e4d08fb5','2020-05-28 16:26:11');
go
insert into pub_area(pk_area,areadesc,areastatus,areatype,clazz,code,creationtime,creator,dr,isunfold,metaid,metaname,metaspace,modifiedtime,modifier,name,pagination,position,relationcode,resid,templetid,ts)
values('0001ZZZZ22dfde5b00d3',null,'browse',1,'nc.vo.adprepare.tendayprojectplan.TenprojectplanBVO','card_body_browse',null,'~',0,null,'75b207dc-fd09-462e-b776-4dca55dd08f4','项目旬计划主实体','adprepare.tendayprojectplan',null,'~','项目旬计划子实体',null,5,'card_body',null,'0001ZZZZ58b6e4d08fb5','2020-05-28 16:26:11');
go



















            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ6e62ec8c9001','0001ZZZZ4c09b0efe1cb','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,'', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'a9137113-c825-4cac-8d1f-09a3b8ec2762','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10560_00080',null,null,'2020-05-28 16:26:11',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZb5547ee84001','0001ZZZZ3d18db0b0b46','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,'', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'7572c5ab-3694-4652-9b15-488362c81ce6','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10560_00080',null,null,'2020-05-28 16:26:11',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ476d10ee5001','0001ZZZZd5af959826e9','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,'', null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'e13e40a4-e662-4130-9a71-fc0b816f92cb','uap/refer/riart/groupTreeRef/index','集团',null,'N','app_91H10560_00080',null,null,'2020-05-28 16:26:11',null,'Y',null);
            go















            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ87e5e7669001','0001ZZZZf0c4fce8ba64','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'65957c51-6e55-4841-b8bb-5c456933616b','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:11',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZcf0a0978f001','0001ZZZZ5e367801bdee','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'915ff55b-fd70-4244-a509-b1e2f426143d','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:11',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZ265c86451001','0001ZZZZf2df75230313','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'660f35e4-2ee1-459d-8050-4c8543089c76','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:11',null,'Y',null);
            go











            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZf7e447199001','0001ZZZZa6d22d7e0d14','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'322346b5-e464-44fa-af68-624a4bb1012b','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:11',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZb9f08718d001','0001ZZZZ80152acfba22','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'709b01c3-bd9b-41a7-817e-6aa8f013cd2c','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:11',null,'Y',null);
            go

            insert into pub_form_property(pk_form_property,areaid,classid,code,colnum,color,creationtime,creator,datatype,dataval,defaultvalue,defaultvar,define1,define2,define3,disabled,dr,editformula,hyperlinkflag,iscode,isdefined,ismultiselectedenabled,isnextrow,isrevise,istotal,itemtype,label,maxlength,metadataproperty,metaid,metapath,modifiedtime,modifier,position,proid,refcode,refname,relatemeta,required,resid,showformula,textrows,ts,validateformula,visible,width)
            values('0001ZZZZf67508df3001','0001ZZZZ22dfde5b00d3','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','pk_group','1','#111111',null,'~',204,null, null,null,null,null,null,'N',0,null,'N','N','N',null,'N','N','N','refer','集团',28,NULL,'3b6dd171-2900-47f3-bfbe-41e4483a2a65','items.pk_group',null,'~',4,'07b0dfb9-c704-4913-955b-e0cb94f300cd','uap/refer/riart/groupTreeRef/index','集团',null,'N',null,null,null,'2020-05-28 16:26:11',null,'Y',null);
            go
