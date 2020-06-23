insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ30f1ed6495fd','adprepare','2020-05-20 15:57:12','~',0,0,0,null,'~','~',null,'~','~',1,null,'2020-05-20 15:57:12',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZf3d04de7a6fa','91H1_H','2020-05-20 15:57:12','~',0,0,20,null,'~','~','0001ZZZZ30f1ed6495fd','~','~',0,null,'2020-05-20 15:57:12',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZba53e6edeba9','91H1_B','2020-05-20 15:57:12','~',0,0,10,null,'~','~','0001ZZZZ30f1ed6495fd','~','~',0,null,'2020-05-20 15:57:12',null);
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ1e4f3dcc2b9d',null,'2020-05-20 15:57:12','~',null,0,'2020-05-20 15:57:12','~','0001ZZZZf3d04de7a6fa','23375c27-0c5a-4405-91eb-dca16fe2a3b3','2020-05-20 15:57:12','vdef')
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZf6e74e301bef',null,'2020-05-20 15:57:12','~',null,0,null,'~','0001ZZZZba53e6edeba9','cf959904-e84e-434c-adca-d7c059562774','2020-05-20 15:57:12','vbdef')
go

