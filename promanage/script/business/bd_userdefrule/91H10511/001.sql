insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZd5728bc94518','adprepare','2020-05-28 10:53:17','~',0,0,0,null,'~','~',null,'~','~',1,null,'2020-05-28 10:53:17',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ694b79c946be','91H1_H','2020-05-28 10:53:17','~',0,0,20,null,'~','~','0001ZZZZd5728bc94518','~','~',0,null,'2020-05-28 10:53:17',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ921aec486c46','91H1_B','2020-05-28 10:53:17','~',0,0,10,null,'~','~','0001ZZZZd5728bc94518','~','~',0,null,'2020-05-28 10:53:17',null);
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ166d69dbeabe',null,'2020-05-28 10:53:17','~',null,0,'2020-05-28 10:53:17','~','0001ZZZZ694b79c946be','3851796c-b9b4-409c-b43c-caab3e53732b','2020-05-28 10:53:17','vdef')
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ0b31d8e95363',null,'2020-05-28 10:53:17','~',null,0,null,'~','0001ZZZZ921aec486c46','2cc58807-1d14-476f-bfc5-5c5565cd1352','2020-05-28 10:53:17','vbdef')
go

