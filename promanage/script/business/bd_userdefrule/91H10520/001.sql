insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ732310ba177f','adprepare','2020-05-08 16:42:48','~',0,0,0,null,'~','~',null,'~','~',1,null,'2020-05-08 16:42:48',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ1e2d36e148bc','91H1_H','2020-05-08 16:42:48','~',0,0,20,null,'~','~','0001ZZZZ732310ba177f','~','~',0,null,'2020-05-08 16:42:48',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ1b2379593eed','91H1_B','2020-05-08 16:42:48','~',0,0,10,null,'~','~','0001ZZZZ732310ba177f','~','~',0,null,'2020-05-08 16:42:48',null);
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZf5400493c946',null,'2020-05-08 16:42:48','~',null,0,'2020-05-08 16:42:48','~','0001ZZZZ1e2d36e148bc','3133aad7-7d97-4fa5-b376-98cf8c594074','2020-05-08 16:42:48','vdef')
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ7f30720731cd',null,'2020-05-08 16:42:48','~',null,0,null,'~','0001ZZZZ1b2379593eed','3c0b3c2f-6214-4c9d-b741-3b7c2154a022','2020-05-08 16:42:48','vbdef')
go

