insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ18a1e051f960','adprepare','2020-05-28 16:26:11','~',0,0,0,null,'~','~',null,'~','~',1,null,'2020-05-28 16:26:11',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZe32fb52b3969','91H1_H','2020-05-28 16:26:11','~',0,0,20,null,'~','~','0001ZZZZ18a1e051f960','~','~',0,null,'2020-05-28 16:26:11',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ863fc6022121','91H1_B','2020-05-28 16:26:11','~',0,0,10,null,'~','~','0001ZZZZ18a1e051f960','~','~',0,null,'2020-05-28 16:26:11',null);
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ59863f11ce3d',null,'2020-05-28 16:26:11','~',null,0,'2020-05-28 16:26:11','~','0001ZZZZe32fb52b3969','75b207dc-fd09-462e-b776-4dca55dd08f4','2020-05-28 16:26:11','vdef')
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZcff8652895ef',null,'2020-05-28 16:26:11','~',null,0,null,'~','0001ZZZZ863fc6022121','bbd037d6-7577-4da2-b2d5-d04e8cd62f6c','2020-05-28 16:26:11','vbdef')
go

