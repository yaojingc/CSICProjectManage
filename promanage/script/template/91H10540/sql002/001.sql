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
                '0001ZZZZ5654AFB69FD8',
                NULL,
                '~',
                NULL,
                '客户信息登记',
                'Y',
                NULL,
                NULL,
                NULL,
                'custinformation',
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
                '91H10540',
                '~',
                'KHXX',
                '~',
                'GLOBLE00000000000000',
                NULL,
                'ADPREPARE',
                NULL,
                '2020-05-08 16:41:45',
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
                '0001ZZZZA5C6BD5506E5',
                11,
                '~',
                '2',
                NULL,
                'APPROVE',
                'N',
                'N',
                NULL,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                NULL,
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZA49759979EB1',
                30,
                '~',
                '3',
                NULL,
                'DELETE',
                'N',
                'N',
                NULL,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                NULL,
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZ9E04F79F6B70',
                10,
                '~',
                '1',
                NULL,
                'SAVE',
                'N',
                'N',
                NULL,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                NULL,
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZ4BAD07023FED',
                31,
                '~',
                '1',
                NULL,
                'SAVEBASE',
                'Y',
                'N',
                NULL,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                NULL,
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZ337EB037F4D2',
                12,
                '~',
                '3',
                NULL,
                'UNAPPROVE',
                'N',
                'N',
                NULL,
                'Y',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                NULL,
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZEF50A3D30A2E',
                13,
                '~',
                '3',
                NULL,
                'UNSAVEBILL',
                'N',
                'Y',
                NULL,
                'Y',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                NULL,
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZB7C86377D615',
                'SAVE',
                'N_KHXX_SAVE',
                0,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                '~',
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZ869895B9258E',
                'APPROVE',
                'N_KHXX_APPROVE',
                0,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                '~',
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZ0EB32F627B44',
                'UNSAVEBILL',
                'N_KHXX_UNSAVEBILL',
                0,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                '~',
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZFD8592332392',
                'UNAPPROVE',
                'N_KHXX_UNAPPROVE',
                0,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                '~',
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZ84479D432EA9',
                'DELETE',
                'N_KHXX_DELETE',
                0,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                '~',
                '~',
                '2020-05-08 16:41:45'
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
                '0001ZZZZ3305B28EE3B6',
                'SAVEBASE',
                'N_KHXX_SAVEBASE',
                0,
                'N',
                'KHXX',
                '0001ZZZZ5654AFB69FD8',
                '~',
                '~',
                '2020-05-08 16:41:45'
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
        '0001ZZZZDDD50700CA56',
        0,
        'KHXXT',
        null,
        null,
        '0001ZZZZ5654AFB69FD8',
        null,
        '2020-05-08 16:41:45',
        'Y',
        'Y'
)
go