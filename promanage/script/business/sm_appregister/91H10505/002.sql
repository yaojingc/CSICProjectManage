INSERT INTO SM_APPREGISTER (APP_DESC, APPTYPE, CODE, CREATIONTIME, CREATOR, DR, FUN_PROPERTY, FUNTYPE, HEIGHT, HELP_NAME, IMAGE_SRC, ISCAUSERUSABLE, ISCOPYPAGE, ISENABLE, MDID, MOUNTID, NAME, ORGTYPECODE, OWN_MODULE, PARENT_ID, PK_APPREGISTER, PK_GROUP, SOURCE_APP_CODE, TARGET_PATH, USELICENSE_LOAD, WIDTH, TS)
VALUES (null, 1, '91H10505', '2020-05-04 16:02:22', '~', 0, 0, 0, 1, null, 'yewuchulilei2', 'N', 'N', 'Y', '92adc06c-0c3d-4667-b8c6-12e8624f6cb5', null, '客户回访', 'GLOBLE00000000000000', '91H1', '0001ZZZZZZ000091H105', '0001ZZZZf90846aa6a4f', '~', '91H10505', null, 'Y', 1, '2020-05-04 16:02:22');
go

INSERT INTO SM_APPREGISTER (APP_DESC, APPTYPE, CODE, CREATIONTIME, CREATOR, DR, FUN_PROPERTY, FUNTYPE, HEIGHT, HELP_NAME, IMAGE_SRC, ISCAUSERUSABLE, ISCOPYPAGE, ISENABLE, MDID, MOUNTID, NAME, ORGTYPECODE, OWN_MODULE, PARENT_ID, PK_APPREGISTER, PK_GROUP, SOURCE_APP_CODE, TARGET_PATH, USELICENSE_LOAD, WIDTH, TS)
VALUES (null, 1, '91H10505A', '2020-05-04 16:02:22', '~', 0, 1, 0, 1, null, 'yewuchulilei3', 'N', 'N', 'Y', '92adc06c-0c3d-4667-b8c6-12e8624f6cb5', null, '客户回访审批', 'GLOBLE00000000000000', '91H1', '0001ZZZZZZ000091H105', '0001ZZZZa7de89d1fc32', '~', '91H10505A', '0001ZZZZb4e9b6c6b622', 'Y', 1, '2020-05-04 16:02:22');
go


INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'Y', null, '~', '91H10505_LIST', '客户回访列表页', '客户回访列表', '/nccloud/resources/adprepare/promanage/91h10505/main/index.html#/list', '0001ZZZZf90846aa6a4f', '91H10505', '0001ZZZZ1f22e302e6b8', '2020-05-04 16:02:22');
go

INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'N', null, '~', '91H10505_CARD', '客户回访卡片页', '客户回访卡片', '/nccloud/resources/adprepare/promanage/91h10505/main/index.html#/card', '0001ZZZZf90846aa6a4f', '91H10505', '0001ZZZZ7ffff2ae266b', '2020-05-04 16:02:22');
go

INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'N', null, '~', '91H10505L_CARD', '客户回访联查卡片页', '客户回访卡片联查', '/nccloud/resources/adprepare/promanage/91h10505/main/index.html#/card', '0001ZZZZf90846aa6a4f', '91H10505', '0001ZZZZ031469560a21', '2020-05-04 16:02:22');
go


INSERT INTO SM_APPPAGE (CREATIONTIME, CREATOR, DR, ISCARDDEFAULT, ISDEFAULT, MODIFIEDTIME, MODIFIER, PAGECODE, PAGEDESC, PAGENAME, PAGEURL, PARENT_ID, PARENTCODE, PK_APPPAGE, TS) VALUES (null, '~', 0, 'N', 'Y', null, '~', '91H10505A_CARD', '客户回访审批', '客户回访审批', '/nccloud/resources/adprepare/promanage/91h10505/main/index.html#/card', '0001ZZZZa7de89d1fc32', '91H10505A', '0001ZZZZb4e9b6c6b622', '2020-05-04 16:02:22');
go


INSERT INTO SM_APPMENUITEM (APPCODE, APPID, DR, MENUDES, MENUITEMCODE, MENUITEMNAME, PARENTCODE, PK_GROUP, PK_MENU, PK_MENUITEM, TS) VALUES ('91H10505', '0001ZZZZf90846aa6a4f', 0, null, '91H10505', 'promanage', '91H105', '~', '1004Z510000000000FFL', '0001ZZZZ02b1c6784e33', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPMENUITEM (APPCODE, APPID, DR, MENUDES, MENUITEMCODE, MENUITEMNAME, PARENTCODE, PK_GROUP, PK_MENU, PK_MENUITEM, TS) VALUES ('91H10505A', '0001ZZZZa7de89d1fc32', 0, null, '91H10505A', 'promanage审批', '91H105', '~', '1004Z510000000000FFL', '0001ZZZZe47f1fe60c5b', '2020-05-04 16:02:22');
go



INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZa7de89d1fc32', 'card_head', 'AttachmentBtn', 'button_secondary', null, '附件', 0, 'general_btn', 0, 'Y', 'N', null, null, '91H10505A_CARD', null, '0001ZZZZ787e152f9ebe', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZa7de89d1fc32', 'card_head', 'JointBtn', 'button_secondary', null, '联查', 1, 'dropdown', 0, 'Y', 'N', null, null, '91H10505A_CARD', null, '0001ZZZZb165baf91083', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZa7de89d1fc32', 'card_head', 'JointGroup', 'button_secondary', null, null, 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10505A_CARD', 'JointBtn', '0001ZZZZ06a7265b2257', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZa7de89d1fc32', 'card_head', 'DetailBtn', 'button_secondary', null, '审批详情', 3, 'general_btn', 0, 'Y', 'N', null, null, '91H10505A_CARD', 'JointGroup', '0001ZZZZ5546c8a80d61', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZa7de89d1fc32', 'card_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10505A_CARD', 'JointGroup', '0001ZZZZ2a28a4017093', '2020-05-04 16:02:22');
go



INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'AttachmentBtn', 'button_secondary', null, '附件', 0, 'general_btn', 0, 'Y', 'N', null, null, '91H10505L_CARD', null, '0001ZZZZd6491797f351', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'JointBtn', 'button_secondary', null, '联查', 1, 'dropdown', 0, 'Y', 'N', null, null, '91H10505L_CARD', null, '0001ZZZZb9e53dc79205', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'JointGroup', 'button_secondary', null, null, 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10505L_CARD', 'JointBtn', '0001ZZZZ558e994d3c36', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'DetailBtn', 'button_secondary', null, '审批详情', 3, 'general_btn', 0, 'Y', 'N', null, null, '91H10505L_CARD', 'JointGroup', '0001ZZZZ04ca0e2487cc', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10505L_CARD', 'JointGroup', '0001ZZZZ02c8d81b04d6', '2020-05-04 16:02:22');
go

INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'SaveGroup', 'button_secondary', null, null, 0, 'buttongroup', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ6c76dca7682f', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'SaveBtn', 'button_main', null, '保存', 1, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'SaveGroup', '0001ZZZZa7dc62c7b37e', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'SaveAddBtn', 'button_secondary', null, '保存新增', 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'SaveGroup', '0001ZZZZcc1a0798e805', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'SaveCommitBtn', 'button_secondary', null, '保存提交', 3, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'SaveGroup', '0001ZZZZdc8ec0ab30fa', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'CancelBtn', 'button_secondary', null, '取消', 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ6ab7f68d374e', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'CUDGroup', 'button_secondary', null, null, 5, 'buttongroup', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ3db0b47cf679', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'CreateBtn', 'button_main', null, '新增', 6, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'CUDGroup', '0001ZZZZ11b1d5f30246', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'UpdateBtn', 'button_secondary', null, '修改', 7, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'CUDGroup', '0001ZZZZ43b218f5bc42', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'DeleteBtn', 'button_secondary', null, '删除', 8, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'CUDGroup', '0001ZZZZ33df2e6193ff', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'CommitBtn', 'button_main', null, '提交', 9, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ22f40dcd16d2', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'UnCommitBtn', 'button_main', null, '收回', 10, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ3ec6c45af869', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'CopyBtn', 'button_secondary', null, '复制', 11, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZf968efbcfca6', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'AttachmentBtn', 'button_secondary', null, '附件', 12, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ66606d509113', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'JointBtn', 'button_secondary', null, '联查', 13, 'dropdown', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ60a73363415c', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'JointGroup', 'button_secondary', null, null, 14, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'JointBtn', '0001ZZZZd57d25cfdb27', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'DetailBtn', 'button_secondary', null, '审批详情', 15, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'JointGroup', '0001ZZZZbac3e038a320', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 16, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'JointGroup', '0001ZZZZ87449f8231a5', '2020-05-04 16:02:22');
go

INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'card_head', 'RefreshBtn', 'button_secondary', null, null, 20, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ559ee13bc510', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_head', 'tabGroup', 'button_secondary', null, null, 21, 'buttongroup', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ6dde8253b167', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_head', 'addRow', 'button_secondary', null, '增行', 22, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'tabGroup', '0001ZZZZ7cd71ad7d43e', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_head', 'deleteRow', 'button_secondary', null, '删行', 23, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', 'tabGroup', '0001ZZZZ772c843e3342', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_head', 'copyRows', 'button_secondary', null, '复制行', 24, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZc6f44b4098ed', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_head', 'pasteTail', 'button_secondary', null, '粘贴至末行', 25, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZfab07b14a1ce', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_head', 'pasteCancel', 'button_secondary', null, '取消粘贴', 26, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ736d7136841a', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_body', 'expand', 'button_secondary', null, '展开', 27, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ7020ebe994ef', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_body', 'fold', 'button_secondary', null, '收起', 28, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZd785abdf114d', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_body', 'unfold', 'button_secondary', null, '展开', 29, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZd0b925b80508', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_body', 'insertRow', 'button_secondary', null, '插行', 30, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ0dbc88284132', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_body', 'delRow', 'button_secondary', null, '删行', 31, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZb6f51d579a3e', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_body', 'copyRow', 'button_secondary', null, '复制', 32, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZ428465544375', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'tabs_body', 'pasteHere', 'button_secondary', null, '粘贴至此', 33, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_CARD', null, '0001ZZZZf0e51621b3d0', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'AddDelGroup', 'button_secondary', null, null, 0, 'buttongroup', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZ1c88ff4b5539', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'AddBtn', 'button_main', null, '新增', 1, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', 'AddDelGroup', '0001ZZZZ4d86ee9cfae4', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'DelBtn', 'button_secondary', null, '删除', 2, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', 'AddDelGroup', '0001ZZZZ497dfcd0d6fa', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'CommitBtn', 'button_secondary', null, '提交', 3, 'divider', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZfb0de70fbebf', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'CommitGroup', 'button_secondary', null, null, 4, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', 'CommitBtn', '0001ZZZZc3e6f4bbdf3e', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'UnCommitBtn', 'button_secondary', null, '收回', 5, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', 'CommitGroup', '0001ZZZZ8a445ebb1ed3', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'AttachmentBtn', 'button_secondary', null, '附件', 6, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZ079888a8e756', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'JointBtn', 'button_secondary', null, '联查', 7, 'dropdown', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZ705df928b33b', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'JointGroup', 'button_secondary', null, null, 8, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', 'JointBtn', '0001ZZZZ6e7f1d8ea96e', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'DetailBtn', 'button_secondary', null, '审批详情', 9, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', 'JointGroup', '0001ZZZZ2d6cc7da5cef', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'TrackBtn', 'button_secondary', null, '单据追溯', 10, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', 'JointGroup', '0001ZZZZb5c8d1f44c0f', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'PrintBtn', 'button_secondary', null, '打印', 11, 'divider', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZ66dbf02afd33', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'PrintGroup', 'button_secondary', null, null, 12, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', 'PrintBtn', '0001ZZZZb5e68588f41f', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'OutputBtn', 'button_secondary', null, '输出', 13, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', 'PrintGroup', '0001ZZZZ0d299dd92934', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_head', 'RefreshBtn', 'button_secondary', null, null, 14, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZ45c39029105f', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_inner', 'edit', 'button_secondary', null, '修改', 15, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZc966626c24a7', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_inner', 'commit', 'button_secondary', null, '提交', 16, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZ56c662ff3692', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_inner', 'delete', 'button_secondary', null, '删除', 17, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZe3ac0e999167', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_inner', 'unCommit', 'button_secondary', null, '收回', 18, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZa00b8a114163', '2020-05-04 16:02:22');
go
INSERT INTO SM_APPBUTNREGISTER (APPID, BTNAREA, BTNCODE, BTNCOLOR, BTNDESC, BTNNAME, BTNORDER, BTNTYPE, DR, ISENABLE, ISKEYFUNC, KEYBOARD, PAGEAREACODE, PAGECODE, PARENT_CODE, PK_BTN, TS) VALUES ('0001ZZZZf90846aa6a4f', 'list_inner', 'copy', 'button_secondary', null, '复制', 19, 'general_btn', 0, 'Y', 'N', null, null, '91H10505_LIST', null, '0001ZZZZ9342af50963a', '2020-05-04 16:02:22');
go






