insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZeedf15a4ef07','adprepare','2020-06-15 16:24:31','~',0,0,0,null,'~','~',null,'~','~',1,null,'2020-06-15 16:24:31',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ036e8365f9f9','91H1_H','2020-06-15 16:24:31','~',0,0,20,null,'~','~','0001ZZZZeedf15a4ef07','~','~',0,null,'2020-06-15 16:24:31',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ093cdc754505','91H1_B','2020-06-15 16:24:31','~',0,0,10,null,'~','~','0001ZZZZeedf15a4ef07','~','~',0,null,'2020-06-15 16:24:31',null);
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ5567215af22b',null,'2020-06-15 16:24:31','~',null,0,'2020-06-15 16:24:31','~','0001ZZZZ036e8365f9f9','6067d29e-8041-4fd0-8dcf-26190d377b0d','2020-06-15 16:24:31','vdef')
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ7cf938275e64',null,'2020-06-15 16:24:31','~',null,0,null,'~','0001ZZZZ093cdc754505','d2be191f-b9ec-4b0e-8667-cc0fd8e45c1e','2020-06-15 16:24:31','vbdef')
go

