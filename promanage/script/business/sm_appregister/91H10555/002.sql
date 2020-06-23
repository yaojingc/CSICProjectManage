INSERT INTO SM_APPREGISTER (APP_DESC, APPTYPE, CODE, CREATIONTIME, CREATOR, DR, FUN_PROPERTY, FUNTYPE, HEIGHT, HELP_NAME, IMAGE_SRC, ISCAUSERUSABLE, ISCOPYPAGE, ISENABLE, MDID, MOUNTID, NAME, ORGTYPECODE, OWN_MODULE, PARENT_ID, PK_APPREGISTER, PK_GROUP, SOURCE_APP_CODE, TARGET_PATH, USELICENSE_LOAD, WIDTH, TS)
VALUES (null, 1, '91H10555', '2020-05-27 16:48:58', '~', 0, 0, 0, 1, null, 'yewuchulilei2', 'N', 'N', 'Y', '9eca453e-1c9b-461e-a9de-45302344d73e', null, '旬计划', 'GLOBLE00000000000000', '91H1', '0001ZZZZZZ000091H105', '0001ZZZZ80866bfa0313', '~', '91H10555', null, 'Y', 1, '2020-05-27 16:48:58');
go

INSERT INTO SM_APPREGISTER (APP_DESC, APPTYPE, CODE, CREATIONTIME, CREATOR, DR, FUN_PROPERTY, FUNTYPE, HEIGHT, HELP_NAME, IMAGE_SRC, ISCAUSERUSABLE, ISCOPYPAGE, ISENABLE, MDID, MOUNTID, NAME, ORGTYPECODE, OWN_MODULE, PARENT_ID, PK_APPREGISTER, PK_GROUP, SOURCE_APP_CODE, TARGET_PATH, USELICENSE_LOAD, WIDTH, TS)
VALUES (null, 1, '91H10555A', '2020-05-27 16:48:58', '~', 0, 1, 0, 1, null, 'yewuchulilei3', 'N', 'N', 'Y', '9eca453e-1c9b-461e-a9de-45302344d73e', null, '旬计划审批', 'GLOBLE00000000000000', '91H1', '0001ZZZZZZ000091H105', '0001ZZZZfb046936528f', '~', '91H10555A', '0001ZZZZc3bcee9d7db4', 'Y', 1, '2020-05-27 16:48:58');
go


INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'Y', null, '~', '91H10555_LIST', '旬计划列表页', '旬计划列表', '/nccloud/resources/adprepare/promanage/91h10555/main/index.html#/list', '0001ZZZZ80866bfa0313', '91H10555', '0001ZZZZe8a7d9d96d0e', '2020-05-27 16:48:58');
go

INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'N', null, '~', '91H10555_CARD', '旬计划卡片页', '旬计划卡片', '/nccloud/resources/adprepare/promanage/91h10555/main/index.html#/card', '0001ZZZZ80866bfa0313', '91H10555', '0001ZZZZ0dc403750eb9', '2020-05-27 16:48:58');
go

INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'N', null, '~', '91H10555L_CARD', '旬计划联查卡片页', '旬计划卡片联查', '/nccloud/resources/adprepare/promanage/91h10555/main/index.html#/card', '0001ZZZZ80866bfa0313', '91H10555', '0001ZZZZb05faf6f9586', '2020-05-27 16:48:58');
go


INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'Y', null, '~', '91H10555A_CARD', '旬计划审批', '旬计划审批', '/nccloud/resources/adprepare/promanage/91h10555/main/index.html#/card', '0001ZZZZfb046936528f', '91H10555A', '0001ZZZZc3bcee9d7db4', '2020-05-27 16:48:58');
go


INSERT INTO SM_APPMENUITEM (APPCODE, APPID, DR, MENUDES, MENUITEMCODE, MENUITEMNAME, PARENTCODE, PK_GROUP, PK_MENU, PK_MENUITEM, TS) VALUES ('91H10555', '0001ZZZZ80866bfa0313', 0, null, '91H10555', 'promanage', '91H105', '~', '1004Z510000000000FFL', '0001ZZZZ562979551240', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPMENUITEM (APPCODE, APPID, DR, MENUDES, MENUITEMCODE, MENUITEMNAME, PARENTCODE, PK_GROUP, PK_MENU, PK_MENUITEM, TS) VALUES ('91H10555A', '0001ZZZZfb046936528f', 0, null, '91H10555A', 'promanage审批', '91H105', '~', '1004Z510000000000FFL', '0001ZZZZ486f37587207', '2020-05-27 16:48:58');
go



INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZfb046936528f', 'card_head', 'AttachmentBtn', 'button_secondary', null, '附件', 0, 'general_btn', 0, 'Y', 'N', null, null, '91H10555A_CARD', null, '0001ZZZZ757c46aa8567', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZfb046936528f', 'card_head', 'JointBtn', 'button_secondary', null, '联查', 1, 'dropdown', 0, 'Y', 'N', null, null, '91H10555A_CARD', null, '0001ZZZZ17bedc2dba7a', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZfb046936528f', 'card_head', 'JointGroup', 'button_secondary', null, null, 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10555A_CARD', 'JointBtn', '0001ZZZZ45b064d456ea', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZfb046936528f', 'card_head', 'DetailBtn', 'button_secondary', null, '审批详情', 3, 'general_btn', 0, 'Y', 'N', null, null, '91H10555A_CARD', 'JointGroup', '0001ZZZZ760406ae87e4', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZfb046936528f', 'card_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10555A_CARD', 'JointGroup', '0001ZZZZ63131634e4aa', '2020-05-27 16:48:58');
go



INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'AttachmentBtn', 'button_secondary', null, '附件', 0, 'general_btn', 0, 'Y', 'N', null, null, '91H10555L_CARD', null, '0001ZZZZ1f3416c7b58d', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'JointBtn', 'button_secondary', null, '联查', 1, 'dropdown', 0, 'Y', 'N', null, null, '91H10555L_CARD', null, '0001ZZZZ0644b594f645', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'JointGroup', 'button_secondary', null, null, 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10555L_CARD', 'JointBtn', '0001ZZZZ4ca8810a3da3', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'DetailBtn', 'button_secondary', null, '审批详情', 3, 'general_btn', 0, 'Y', 'N', null, null, '91H10555L_CARD', 'JointGroup', '0001ZZZZc991565a67f5', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10555L_CARD', 'JointGroup', '0001ZZZZ55d7312394a0', '2020-05-27 16:48:58');
go

INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'SaveGroup', 'button_secondary', null, null, 0, 'buttongroup', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ651e9439920b', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'SaveBtn', 'button_main', null, '保存', 1, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'SaveGroup', '0001ZZZZfe1cf6d83850', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'SaveAddBtn', 'button_secondary', null, '保存新增', 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'SaveGroup', '0001ZZZZ3c0a86cf835e', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'SaveCommitBtn', 'button_secondary', null, '保存提交', 3, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'SaveGroup', '0001ZZZZ3bb6b59d8361', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'CancelBtn', 'button_secondary', null, '取消', 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ64b25d9900da', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'CUDGroup', 'button_secondary', null, null, 5, 'buttongroup', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZc6da18447c08', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'CreateBtn', 'button_main', null, '新增', 6, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'CUDGroup', '0001ZZZZ80521743d7b4', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'UpdateBtn', 'button_secondary', null, '修改', 7, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'CUDGroup', '0001ZZZZf6d521cc18b5', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'DeleteBtn', 'button_secondary', null, '删除', 8, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'CUDGroup', '0001ZZZZb1ede12f83c1', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'CommitBtn', 'button_main', null, '提交', 9, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ07be40655dee', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'UnCommitBtn', 'button_main', null, '收回', 10, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZd419e53c451f', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'CopyBtn', 'button_secondary', null, '复制', 11, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ9cc707560e03', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'AttachmentBtn', 'button_secondary', null, '附件', 12, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ8449add737af', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'JointBtn', 'button_secondary', null, '联查', 13, 'dropdown', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ0265a02d03ec', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'JointGroup', 'button_secondary', null, null, 14, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'JointBtn', '0001ZZZZe69eec4a6922', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'DetailBtn', 'button_secondary', null, '审批详情', 15, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'JointGroup', '0001ZZZZc618e86dac4b', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 16, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'JointGroup', '0001ZZZZ711ab0de0154', '2020-05-27 16:48:58');
go

INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'card_head', 'RefreshBtn', 'button_secondary', null, null, 20, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZd749c72380ff', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_head', 'tabGroup', 'button_secondary', null, null, 21, 'buttongroup', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ2bfdd9703ac9', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_head', 'addRow', 'button_secondary', null, '增行', 22, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'tabGroup', '0001ZZZZ1a1a93efac5f', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_head', 'deleteRow', 'button_secondary', null, '删行', 23, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', 'tabGroup', '0001ZZZZ0a7b162e1215', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_head', 'copyRows', 'button_secondary', null, '复制行', 24, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ6385a82fe0b2', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_head', 'pasteTail', 'button_secondary', null, '粘贴至末行', 25, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ36f21aa0cf47', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_head', 'pasteCancel', 'button_secondary', null, '取消粘贴', 26, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZf3fa279d2a13', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_body', 'expand', 'button_secondary', null, '展开', 27, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ1056439b2140', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_body', 'fold', 'button_secondary', null, '收起', 28, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZc1c906453d74', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_body', 'unfold', 'button_secondary', null, '展开', 29, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZb5f207810bc1', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_body', 'insertRow', 'button_secondary', null, '插行', 30, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZb9b922c68a02', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_body', 'delRow', 'button_secondary', null, '删行', 31, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ7f6af20474ca', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_body', 'copyRow', 'button_secondary', null, '复制', 32, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZfff05426ee58', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'tabs_body', 'pasteHere', 'button_secondary', null, '粘贴至此', 33, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_CARD', null, '0001ZZZZ58034c7bdc21', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'AddDelGroup', 'button_secondary', null, null, 0, 'buttongroup', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZf8eb131fc295', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'AddBtn', 'button_main', null, '新增', 1, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', 'AddDelGroup', '0001ZZZZd559d57709ff', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'DelBtn', 'button_secondary', null, '删除', 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', 'AddDelGroup', '0001ZZZZ213d498f0563', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'CommitBtn', 'button_secondary', null, '提交', 3, 'divider', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZ430702f46abd', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'CommitGroup', 'button_secondary', null, null, 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', 'CommitBtn', '0001ZZZZ91f0d3c55c22', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'UnCommitBtn', 'button_secondary', null, '收回', 5, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', 'CommitGroup', '0001ZZZZe9c87829b36d', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'AttachmentBtn', 'button_secondary', null, '附件', 6, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZfc9d7053c485', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'JointBtn', 'button_secondary', null, '联查', 7, 'dropdown', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZf75850f73858', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'JointGroup', 'button_secondary', null, null, 8, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', 'JointBtn', '0001ZZZZe154f1a97cbc', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'DetailBtn', 'button_secondary', null, '审批详情', 9, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', 'JointGroup', '0001ZZZZfb18487c18bc', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 10, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', 'JointGroup', '0001ZZZZ95d9aeb72b12', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'PrintBtn', 'button_secondary', null, '打印', 11, 'divider', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZ33a2a7dca1bb', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'PrintGroup', 'button_secondary', null, null, 12, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', 'PrintBtn', '0001ZZZZf66880644947', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'OutputBtn', 'button_secondary', null, '输出', 13, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', 'PrintGroup', '0001ZZZZ2f415a933bf9', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_head', 'RefreshBtn', 'button_secondary', null, null, 14, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZ6b84d2d9fc69', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_inner', 'edit', 'button_secondary', null, '修改', 15, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZ986b383e5726', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_inner', 'commit', 'button_secondary', null, '提交', 16, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZ29af1de518be', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_inner', 'delete', 'button_secondary', null, '删除', 17, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZ6bb1b8604a49', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_inner', 'unCommit', 'button_secondary', null, '收回', 18, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZ9b6176940f8b', '2020-05-27 16:48:58');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZ80866bfa0313', 'list_inner', 'copy', 'button_secondary', null, '复制', 19, 'general_btn', 0, 'Y', 'N', null, null, '91H10555_LIST', null, '0001ZZZZ6fcf5040cc76', '2020-05-27 16:48:58');
go






