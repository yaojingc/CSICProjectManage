insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ92fbda2c1133','adprepare','2020-06-03 11:51:54','~',0,0,0,null,'~','~',null,'~','~',1,null,'2020-06-03 11:51:54',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ00414a536321','91H1_H','2020-06-03 11:51:54','~',0,0,20,null,'~','~','0001ZZZZ92fbda2c1133','~','~',0,null,'2020-06-03 11:51:54',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZc0f9b3d1a9ee','91H1_B','2020-06-03 11:51:54','~',0,0,10,null,'~','~','0001ZZZZ92fbda2c1133','~','~',0,null,'2020-06-03 11:51:54',null);
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ735b765cd5dc',null,'2020-06-03 11:51:54','~',null,0,'2020-06-03 11:51:54','~','0001ZZZZ00414a536321','aa49f5cf-08af-47e6-8b4d-26ab69259b24','2020-06-03 11:51:54','vdef')
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ7893c9b4ce8b',null,'2020-06-03 11:51:54','~',null,0,null,'~','0001ZZZZc0f9b3d1a9ee','1d12f427-f7cd-46a5-a6b8-1df30a5dce57','2020-06-03 11:51:54','vbdef')
go

