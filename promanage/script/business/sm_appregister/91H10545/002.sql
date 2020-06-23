INSERT INTO SM_APPREGISTER (APP_DESC, APPTYPE, CODE, CREATIONTIME, CREATOR, DR, FUN_PROPERTY, FUNTYPE, HEIGHT, HELP_NAME, IMAGE_SRC, ISCAUSERUSABLE, ISCOPYPAGE, ISENABLE, MDID, MOUNTID, NAME, ORGTYPECODE, OWN_MODULE, PARENT_ID, PK_APPREGISTER, PK_GROUP, SOURCE_APP_CODE, TARGET_PATH, USELICENSE_LOAD, WIDTH, TS)
VALUES (null, 1, '91H10545', '2020-05-20 15:32:57', '~', 0, 0, 0, 1, null, 'yewuchulilei2', 'N', 'N', 'Y', '68b5e7d1-5e0e-4845-9f36-9490ebcfcb1e', null, '项目月度计划', 'GLOBLE00000000000000', '91H1', '0001ZZZZZZ000091H105', '0001ZZZZ65ea1c652753', '~', '91H10545', null, 'Y', 1, '2020-05-20 15:32:57');
go

INSERT INTO SM_APPREGISTER (APP_DESC, APPTYPE, CODE, CREATIONTIME, CREATOR, DR, FUN_PROPERTY, FUNTYPE, HEIGHT, HELP_NAME, IMAGE_SRC, ISCAUSERUSABLE, ISCOPYPAGE, ISENABLE, MDID, MOUNTID, NAME, ORGTYPECODE, OWN_MODULE, PARENT_ID, PK_APPREGISTER, PK_GROUP, SOURCE_APP_CODE, TARGET_PATH, USELICENSE_LOAD, WIDTH, TS)
VALUES (null, 1, '91H10545A', '2020-05-20 15:32:57', '~', 0, 1, 0, 1, null, 'yewuchulilei3', 'N', 'N', 'Y', '68b5e7d1-5e0e-4845-9f36-9490ebcfcb1e', null, '项目月度计划审批', 'GLOBLE00000000000000', '91H1', '0001ZZZZZZ000091H105', '0001ZZZZ05228beb7415', '~', '91H10545A', '0001ZZZZd8d00414d424', 'Y', 1, '2020-05-20 15:32:57');
go


INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'Y', null, '~', '91H10545_LIST', '项目月度计划列表页', '项目月度计划列表', '/nccloud/resources/adprepare/promanage/91h10545/main/index.html#/list', '0001ZZZZ65ea1c652753', '91H10545', '0001ZZZZ7c04f433a6b1', '2020-05-20 15:32:57');
go

INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'N', null, '~', '91H10545_CARD', '项目月度计划卡片页', '项目月度计划卡片', '/nccloud/resources/adprepare/promanage/91h10545/main/index.html#/card', '0001ZZZZ65ea1c652753', '91H10545', '0001ZZZZd8a8fdd868dd', '2020-05-20 15:32:57');
go

INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'N', null, '~', '91H10545L_CARD', '项目月度计划联查卡片页', '项目月度计划卡片联查', '/nccloud/resources/adprepare/promanage/91h10545/main/index.html#/card', '0001ZZZZ65ea1c652753', '91H10545', '0001ZZZZdc668131c5bf', '2020-05-20 15:32:57');
go


INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'Y', null, '~', '91H10545A_CARD', '项目月度计划审批', '项目月度计划审批', '/nccloud/resources/adprepare/promanage/91h10545/main/index.html#/card', '0001ZZZZ05228beb7415', '91H10545A', '0001ZZZZd8d00414d424', '2020-05-20 15:32:57');
go


INSERT INTO SM_APPMENUITEM (APPCODE, APPID, DR, MENUDES, MENUITEMCODE, MENUITEMNAME, PARENTCODE, PK_GROUP, PK_MENU, PK_MENUITEM, TS) VALUES ('91H10545', '0001ZZZZ65ea1c652753', 0, null, '91H10545', 'promanage', '91H105', '~', '1004Z510000000000FFL', '0001ZZZZ0c1bc3e2f470', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPMENUITEM (APPCODE, APPID, DR, MENUDES, MENUITEMCODE, MENUITEMNAME, PARENTCODE, PK_GROUP, PK_MENU, PK_MENUITEM, TS) VALUES ('91H10545A', '0001ZZZZ05228beb7415', 0, null, '91H10545A', 'promanage审批', '91H105', '~', '1004Z510000000000FFL', '0001ZZZZ3560092e9374', '2020-05-20 15:32:57');
go



INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ05228beb7415', 'card_head', 'AttachmentBtn', 'button_secondary', null, '附件', 0, 'general_btn', 0, 'Y', 'N', null, null, '91H10545A_CARD', null, '0001ZZZZ72f85c5773ee', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ05228beb7415', 'card_head', 'JointBtn', 'button_secondary', null, '联查', 1, 'dropdown', 0, 'Y', 'N', null, null, '91H10545A_CARD', null, '0001ZZZZef5914df3571', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ05228beb7415', 'card_head', 'JointGroup', 'button_secondary', null, null, 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10545A_CARD', 'JointBtn', '0001ZZZZd0fbe157ac32', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ05228beb7415', 'card_head', 'DetailBtn', 'button_secondary', null, '审批详情', 3, 'general_btn', 0, 'Y', 'N', null, null, '91H10545A_CARD', 'JointGroup', '0001ZZZZ7ad2663934f6', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ05228beb7415', 'card_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10545A_CARD', 'JointGroup', '0001ZZZZ5aa816b14da0', '2020-05-20 15:32:57');
go



INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'AttachmentBtn', 'button_secondary', null, '附件', 0, 'general_btn', 0, 'Y', 'N', null, null, '91H10545L_CARD', null, '0001ZZZZ3bad94f28f88', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'JointBtn', 'button_secondary', null, '联查', 1, 'dropdown', 0, 'Y', 'N', null, null, '91H10545L_CARD', null, '0001ZZZZ2165a300fecb', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'JointGroup', 'button_secondary', null, null, 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10545L_CARD', 'JointBtn', '0001ZZZZb638a47c159e', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'DetailBtn', 'button_secondary', null, '审批详情', 3, 'general_btn', 0, 'Y', 'N', null, null, '91H10545L_CARD', 'JointGroup', '0001ZZZZ8dd4e0c4c8e9', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10545L_CARD', 'JointGroup', '0001ZZZZe44bac3d2845', '2020-05-20 15:32:57');
go

INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'SaveGroup', 'button_secondary', null, null, 0, 'buttongroup', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZfcd05c154ca3', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'SaveBtn', 'button_main', null, '保存', 1, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'SaveGroup', '0001ZZZZa2088735aa51', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'SaveAddBtn', 'button_secondary', null, '保存新增', 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'SaveGroup', '0001ZZZZf489a8800434', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'SaveCommitBtn', 'button_secondary', null, '保存提交', 3, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'SaveGroup', '0001ZZZZba2c734e1aac', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'CancelBtn', 'button_secondary', null, '取消', 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ4d7e25f32686', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'CUDGroup', 'button_secondary', null, null, 5, 'buttongroup', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ8e6ac6296768', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'CreateBtn', 'button_main', null, '新增', 6, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'CUDGroup', '0001ZZZZ4d5117b96fe1', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'UpdateBtn', 'button_secondary', null, '修改', 7, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'CUDGroup', '0001ZZZZca2c61a51f6a', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'DeleteBtn', 'button_secondary', null, '删除', 8, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'CUDGroup', '0001ZZZZ896f904ba7cc', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'CommitBtn', 'button_main', null, '提交', 9, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ428ac849d01b', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'UnCommitBtn', 'button_main', null, '收回', 10, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ4cf5dcf6dc46', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'CopyBtn', 'button_secondary', null, '复制', 11, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ457ff52922bf', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'AttachmentBtn', 'button_secondary', null, '附件', 12, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ6346fcaa1fa1', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'JointBtn', 'button_secondary', null, '联查', 13, 'dropdown', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ6ee91f817459', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'JointGroup', 'button_secondary', null, null, 14, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'JointBtn', '0001ZZZZ42a07bcb157c', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'DetailBtn', 'button_secondary', null, '审批详情', 15, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'JointGroup', '0001ZZZZ8c9494fcf831', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 16, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'JointGroup', '0001ZZZZ6aec3fbc9440', '2020-05-20 15:32:57');
go

INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'card_head', 'RefreshBtn', 'button_secondary', null, null, 20, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ55a09306342f', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_head', 'tabGroup', 'button_secondary', null, null, 21, 'buttongroup', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ1947dbe01485', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_head', 'addRow', 'button_secondary', null, '增行', 22, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'tabGroup', '0001ZZZZd6185d7a8530', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_head', 'deleteRow', 'button_secondary', null, '删行', 23, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', 'tabGroup', '0001ZZZZ2a24b945e724', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_head', 'copyRows', 'button_secondary', null, '复制行', 24, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ54afbec149cd', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_head', 'pasteTail', 'button_secondary', null, '粘贴至末行', 25, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZbb259730d3cc', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_head', 'pasteCancel', 'button_secondary', null, '取消粘贴', 26, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ60a01cd0705e', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_body', 'expand', 'button_secondary', null, '展开', 27, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZe32187e3a904', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_body', 'fold', 'button_secondary', null, '收起', 28, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ34d40f4deadc', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_body', 'unfold', 'button_secondary', null, '展开', 29, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ3386aa2fe8ff', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_body', 'insertRow', 'button_secondary', null, '插行', 30, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZ9f69809cf4af', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_body', 'delRow', 'button_secondary', null, '删行', 31, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZdcfff5fde4ff', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_body', 'copyRow', 'button_secondary', null, '复制', 32, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZaf81ca456611', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'tabs_body', 'pasteHere', 'button_secondary', null, '粘贴至此', 33, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_CARD', null, '0001ZZZZfe2d60764208', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'AddDelGroup', 'button_secondary', null, null, 0, 'buttongroup', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZd3bd06f769a8', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'AddBtn', 'button_main', null, '新增', 1, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', 'AddDelGroup', '0001ZZZZcdd1edd37030', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'DelBtn', 'button_secondary', null, '删除', 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', 'AddDelGroup', '0001ZZZZd099d5b9f8bc', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'CommitBtn', 'button_secondary', null, '提交', 3, 'divider', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZ686d87df8b03', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'CommitGroup', 'button_secondary', null, null, 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', 'CommitBtn', '0001ZZZZ3ab8d0bfbeb9', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'UnCommitBtn', 'button_secondary', null, '收回', 5, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', 'CommitGroup', '0001ZZZZb6486859e5f7', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'AttachmentBtn', 'button_secondary', null, '附件', 6, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZ694fb6042480', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'JointBtn', 'button_secondary', null, '联查', 7, 'dropdown', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZ4fe6c1ca4322', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'JointGroup', 'button_secondary', null, null, 8, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', 'JointBtn', '0001ZZZZafddf48a96bf', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'DetailBtn', 'button_secondary', null, '审批详情', 9, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', 'JointGroup', '0001ZZZZb49a4db89770', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 10, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', 'JointGroup', '0001ZZZZa0c82862028e', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'PrintBtn', 'button_secondary', null, '打印', 11, 'divider', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZdfb668841f24', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'PrintGroup', 'button_secondary', null, null, 12, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', 'PrintBtn', '0001ZZZZ7df7650e23eb', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'OutputBtn', 'button_secondary', null, '输出', 13, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', 'PrintGroup', '0001ZZZZ37b0c4f66861', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_head', 'RefreshBtn', 'button_secondary', null, null, 14, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZ92683de651c3', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_inner', 'edit', 'button_secondary', null, '修改', 15, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZ36b76eedd208', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_inner', 'commit', 'button_secondary', null, '提交', 16, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZafc1245fe8dc', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_inner', 'delete', 'button_secondary', null, '删除', 17, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZfe3341c7cbf3', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_inner', 'unCommit', 'button_secondary', null, '收回', 18, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZf8bdebeae434', '2020-05-20 15:32:57');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ65ea1c652753', 'list_inner', 'copy', 'button_secondary', null, '复制', 19, 'general_btn', 0, 'Y', 'N', null, null, '91H10545_LIST', null, '0001ZZZZ1aaa6233ce1f', '2020-05-20 15:32:57');
go







