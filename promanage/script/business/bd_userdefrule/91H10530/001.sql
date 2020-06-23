insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZb6f4c5cc6929','adprepare','2020-05-08 16:43:34','~',0,0,0,null,'~','~',null,'~','~',1,null,'2020-05-08 16:43:34',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZd8b6759a95fc','91H1_H','2020-05-08 16:43:34','~',0,0,20,null,'~','~','0001ZZZZb6f4c5cc6929','~','~',0,null,'2020-05-08 16:43:34',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ4b33d69e442a','91H1_B','2020-05-08 16:43:34','~',0,0,10,null,'~','~','0001ZZZZb6f4c5cc6929','~','~',0,null,'2020-05-08 16:43:34',null);
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZd340c9123066',null,'2020-05-08 16:43:34','~',null,0,'2020-05-08 16:43:34','~','0001ZZZZd8b6759a95fc','8da5d364-ac04-4374-a887-8b96c3ff53bf','2020-05-08 16:43:34','vdef')
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZcd0297fca9f7',null,'2020-05-08 16:43:34','~',null,0,null,'~','0001ZZZZ4b33d69e442a','c6e1957a-9692-4a3f-b843-2ab88910f0ab','2020-05-08 16:43:34','vbdef')
go

