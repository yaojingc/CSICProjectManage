INSERT INTO bd_billtype (
        pk_billtypeid,
        accountclass,
        billcoderule,
        billstyle,
        billtypename,
        canextendtransaction,
        checkclassname,
        classname,
        comp,
        component,
        datafinderclz,
        def1,
        def2,
        def3,
        dr,
        emendenumclass,
        forwardbilltype,
        isaccount,
        isapprovebill,
        isbizflowbill,
        iseditableproperty,
        isenablebutton,
        isenabletranstypebcr,
        islightbill,
        islock,
        isrejectuneditableproperty,
        isroot,
        issupportmobile,
        istransaction,
        isworkflowcanautoapprove,
        ncbrcode,
        nodecode,
        parentbilltype,
        pk_billtypecode,
        pk_group,
        pk_org,
        referclassname,
        systemcode,
        transtype_class,
        ts,
        webnodecode,
        wherestring
)
VALUES
        (
                '0001ZZZZ521A7B033F56',
                NULL,
                '~',
                NULL,
                '旬计划',
                'Y',
                NULL,
                NULL,
                NULL,
                'xunprojectplan',
                NULL,
                NULL,
                NULL,
                NULL,
                NULL,
                NULL,
                NULL,
                'Y',
                'Y',
                'N',
                'N',
                'N',
                'N',
                'Y',
                NULL,
                NULL,
                'N',
                'Y',
                'N',
                'N',
                '~',
                '91H10555',
                '~',
                'XPRJ',
                '~',
                'GLOBLE00000000000000',
                NULL,
                'ADPREPARE',
                NULL,
                '2020-05-27 16:48:58',
                '~',
                NULL
        );

go

INSERT INTO pub_billaction (
        pk_billaction,
        action_type,
        actionnote,
        actionstyle,
        actionstyleremark,
        actiontype,
        constrictflag,
        controlflag,
        dr,
        finishflag,
        pk_billtype,
        pk_billtypeid,
        pushflag,
        showhint,
        ts
)
VALUES
        (
                '0001ZZZZDEFD54DCAF2E',
                11,
                '~',
                '2',
                NULL,
                'APPROVE',
                'N',
                'N',
                NULL,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                NULL,
                '~',
                '2020-05-27 16:48:58'
        );
go

INSERT INTO pub_billaction (
        pk_billaction,
        action_type,
        actionnote,
        actionstyle,
        actionstyleremark,
        actiontype,
        constrictflag,
        controlflag,
        dr,
        finishflag,
        pk_billtype,
        pk_billtypeid,
        pushflag,
        showhint,
        ts
)
VALUES
        (
                '0001ZZZZ1C9AF9C78A21',
                30,
                '~',
                '3',
                NULL,
                'DELETE',
                'N',
                'N',
                NULL,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                NULL,
                '~',
                '2020-05-27 16:48:58'
        );

go

INSERT INTO pub_billaction (
        pk_billaction,
        action_type,
        actionnote,
        actionstyle,
        actionstyleremark,
        actiontype,
        constrictflag,
        controlflag,
        dr,
        finishflag,
        pk_billtype,
        pk_billtypeid,
        pushflag,
        showhint,
        ts
)
VALUES
        (
                '0001ZZZZ0EBAE762A920',
                10,
                '~',
                '1',
                NULL,
                'SAVE',
                'N',
                'N',
                NULL,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                NULL,
                '~',
                '2020-05-27 16:48:58'
        );

go

INSERT INTO pub_billaction (
        pk_billaction,
        action_type,
        actionnote,
        actionstyle,
        actionstyleremark,
        actiontype,
        constrictflag,
        controlflag,
        dr,
        finishflag,
        pk_billtype,
        pk_billtypeid,
        pushflag,
        showhint,
        ts
)
VALUES
        (
                '0001ZZZZ1DD538DF25C0',
                31,
                '~',
                '1',
                NULL,
                'SAVEBASE',
                'Y',
                'N',
                NULL,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                NULL,
                '~',
                '2020-05-27 16:48:58'
        );

go

INSERT INTO PUB_BILLACTION (
        PK_BILLACTION,
        ACTION_TYPE,
        ACTIONNOTE,
        ACTIONSTYLE,
        ACTIONSTYLEREMARK,
        ACTIONTYPE,
        CONSTRICTFLAG,
        CONTROLFLAG,
        DR,
        FINISHFLAG,
        PK_BILLTYPE,
        PK_BILLTYPEID,
        PUSHFLAG,
        SHOWHINT,
        TS
)
VALUES
        (
                '0001ZZZZ01BDA738B83A',
                12,
                '~',
                '3',
                NULL,
                'UNAPPROVE',
                'N',
                'N',
                NULL,
                'Y',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                NULL,
                '~',
                '2020-05-27 16:48:58'
        );

go

INSERT INTO PUB_BILLACTION (
        PK_BILLACTION,
        ACTION_TYPE,
        ACTIONNOTE,
        ACTIONSTYLE,
        ACTIONSTYLEREMARK,
        ACTIONTYPE,
        CONSTRICTFLAG,
        CONTROLFLAG,
        DR,
        FINISHFLAG,
        PK_BILLTYPE,
        PK_BILLTYPEID,
        PUSHFLAG,
        SHOWHINT,
        TS
)
VALUES
        (
                '0001ZZZZ948AEEF82499',
                13,
                '~',
                '3',
                NULL,
                'UNSAVEBILL',
                'N',
                'Y',
                NULL,
                'Y',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                NULL,
                '~',
                '2020-05-27 16:48:58'
        );


go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZE73B16653601',
                'SAVE',
                'N_XPRJ_SAVE',
                0,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                '~',
                '~',
                '2020-05-27 16:48:58'
        );

go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZ999370884FAD',
                'APPROVE',
                'N_XPRJ_APPROVE',
                0,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                '~',
                '~',
                '2020-05-27 16:48:58'
        );

go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZ0268520F3101',
                'UNSAVEBILL',
                'N_XPRJ_UNSAVEBILL',
                0,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                '~',
                '~',
                '2020-05-27 16:48:58'
        );

go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZ28206AD5C2CB',
                'UNAPPROVE',
                'N_XPRJ_UNAPPROVE',
                0,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                '~',
                '~',
                '2020-05-27 16:48:58'
        );

go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZ57041695B8C2',
                'DELETE',
                'N_XPRJ_DELETE',
                0,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                '~',
                '~',
                '2020-05-27 16:48:58'
        );

go

INSERT INTO PUB_BUSICLASS (
        PK_BUSICLASS,
        ACTIONTYPE,
        CLASSNAME,
        DR,
        ISBEFORE,
        PK_BILLTYPE,
        PK_BILLTYPEID,
        PK_BUSINESSTYPE,
        PK_GROUP,
        TS
)
VALUES
        (
                '0001ZZZZ8887B26EE256',
                'SAVEBASE',
                'N_XPRJ_SAVEBASE',
                0,
                'N',
                'XPRJ',
                '0001ZZZZ521A7B033F56',
                '~',
                '~',
                '2020-05-27 16:48:58'
        );
go


insert into pub_workitemconfig (
        pk_workitemconfig,
        dr,
        item,
        itemindex,
        itemtype,
        pk_billtype,
        resourceid,
        ts,
        isdefault,
        ismp
)
values
(
        '0001ZZZZ1103AFE0710A',
        0,
        'XPRJT',
        null,
        null,
        '0001ZZZZ521A7B033F56',
        null,
        '2020-05-27 16:48:58',
        'Y',
        'Y'
)
go