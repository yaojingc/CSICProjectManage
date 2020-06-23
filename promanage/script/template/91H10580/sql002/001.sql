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
                '0001ZZZZA4F62D274238',
                NULL,
                '~',
                NULL,
                '满意度调查新',
                'Y',
                NULL,
                NULL,
                NULL,
                'satisfactionsurvey',
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
                '91H10580',
                '~',
                'XDC1',
                '~',
                'GLOBLE00000000000000',
                NULL,
                'ADPREPARE',
                NULL,
                '2020-06-15 16:24:31',
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
                '0001ZZZZ70222BB68F27',
                11,
                '~',
                '2',
                NULL,
                'APPROVE',
                'N',
                'N',
                NULL,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                NULL,
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZ84A6361B8AA4',
                30,
                '~',
                '3',
                NULL,
                'DELETE',
                'N',
                'N',
                NULL,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                NULL,
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZCB55E3DA6FE7',
                10,
                '~',
                '1',
                NULL,
                'SAVE',
                'N',
                'N',
                NULL,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                NULL,
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZEAC7A942C99B',
                31,
                '~',
                '1',
                NULL,
                'SAVEBASE',
                'Y',
                'N',
                NULL,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                NULL,
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZ163A659CCA59',
                12,
                '~',
                '3',
                NULL,
                'UNAPPROVE',
                'N',
                'N',
                NULL,
                'Y',
                'XDC1',
                '0001ZZZZA4F62D274238',
                NULL,
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZ39690A70A4C7',
                13,
                '~',
                '3',
                NULL,
                'UNSAVEBILL',
                'N',
                'Y',
                NULL,
                'Y',
                'XDC1',
                '0001ZZZZA4F62D274238',
                NULL,
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZ986557A18A43',
                'SAVE',
                'N_XDC1_SAVE',
                0,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                '~',
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZ6D4D941D2083',
                'APPROVE',
                'N_XDC1_APPROVE',
                0,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                '~',
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZE15F440FB5C3',
                'UNSAVEBILL',
                'N_XDC1_UNSAVEBILL',
                0,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                '~',
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZ551AD001A428',
                'UNAPPROVE',
                'N_XDC1_UNAPPROVE',
                0,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                '~',
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZA4B70AC8AE25',
                'DELETE',
                'N_XDC1_DELETE',
                0,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                '~',
                '~',
                '2020-06-15 16:24:31'
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
                '0001ZZZZA8E128910A42',
                'SAVEBASE',
                'N_XDC1_SAVEBASE',
                0,
                'N',
                'XDC1',
                '0001ZZZZA4F62D274238',
                '~',
                '~',
                '2020-06-15 16:24:31'
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
        '0001ZZZZ8CDFC400F0A4',
        0,
        'XDC1T',
        null,
        null,
        '0001ZZZZA4F62D274238',
        null,
        '2020-06-15 16:24:31',
        'Y',
        'Y'
)
go