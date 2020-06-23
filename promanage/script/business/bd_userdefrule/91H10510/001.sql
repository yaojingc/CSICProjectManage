insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZfcdaeccb512d','adprepare','2020-05-04 00:24:29','~',0,0,0,null,'~','~',null,'~','~',1,null,'2020-05-04 00:24:29',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ129a6f8fc869','91H1_H','2020-05-04 00:24:29','~',0,0,20,null,'~','~','0001ZZZZfcdaeccb512d','~','~',0,null,'2020-05-04 00:24:29',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZdd02496b81e8','91H1_B','2020-05-04 00:24:29','~',0,0,10,null,'~','~','0001ZZZZfcdaeccb512d','~','~',0,null,'2020-05-04 00:24:29',null);
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ39f99291bfb3',null,'2020-05-04 00:24:29','~',null,0,'2020-05-04 00:24:29','~','0001ZZZZ129a6f8fc869','a5d92601-e7b0-4de9-9a59-9c743a2646e9','2020-05-04 00:24:29','vdef')
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ31e23c0994c0',null,'2020-05-04 00:24:29','~',null,0,null,'~','0001ZZZZdd02496b81e8','f3d41520-a98a-4d4e-9ae7-dcda3d69e1a5','2020-05-04 00:24:29','vbdef')
go

