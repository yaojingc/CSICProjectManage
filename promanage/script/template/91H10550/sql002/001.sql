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
                '0001ZZZZBC2A55CFEFF8',
                NULL,
                '~',
                NULL,
                '项目旬计划',
                'Y',
                NULL,
                NULL,
                NULL,
                'tendaysprojectplan',
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
                '91H10550',
                '~',
                'TDPP',
                '~',
                'GLOBLE00000000000000',
                NULL,
                'ADPREPARE',
                NULL,
                '2020-05-20 15:57:12',
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
                '0001ZZZZEC4210E1D163',
                11,
                '~',
                '2',
                NULL,
                'APPROVE',
                'N',
                'N',
                NULL,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                NULL,
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZ7508794F01F6',
                30,
                '~',
                '3',
                NULL,
                'DELETE',
                'N',
                'N',
                NULL,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                NULL,
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZ52F44FB00D18',
                10,
                '~',
                '1',
                NULL,
                'SAVE',
                'N',
                'N',
                NULL,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                NULL,
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZ6033DCA235C7',
                31,
                '~',
                '1',
                NULL,
                'SAVEBASE',
                'Y',
                'N',
                NULL,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                NULL,
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZ033290C42F2F',
                12,
                '~',
                '3',
                NULL,
                'UNAPPROVE',
                'N',
                'N',
                NULL,
                'Y',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                NULL,
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZF05A1ADB1832',
                13,
                '~',
                '3',
                NULL,
                'UNSAVEBILL',
                'N',
                'Y',
                NULL,
                'Y',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                NULL,
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZ2721E8D053EA',
                'SAVE',
                'N_TDPP_SAVE',
                0,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                '~',
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZ5281240128EF',
                'APPROVE',
                'N_TDPP_APPROVE',
                0,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                '~',
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZ6853A452986D',
                'UNSAVEBILL',
                'N_TDPP_UNSAVEBILL',
                0,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                '~',
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZC99B75DFDD26',
                'UNAPPROVE',
                'N_TDPP_UNAPPROVE',
                0,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                '~',
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZ07B07B301656',
                'DELETE',
                'N_TDPP_DELETE',
                0,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                '~',
                '~',
                '2020-05-20 15:57:12'
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
                '0001ZZZZ4D2FF7E8EC9D',
                'SAVEBASE',
                'N_TDPP_SAVEBASE',
                0,
                'N',
                'TDPP',
                '0001ZZZZBC2A55CFEFF8',
                '~',
                '~',
                '2020-05-20 15:57:12'
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
        '0001ZZZZ52026C838A3F',
        0,
        'TDPPT',
        null,
        null,
        '0001ZZZZBC2A55CFEFF8',
        null,
        '2020-05-20 15:57:12',
        'Y',
        'Y'
)
go