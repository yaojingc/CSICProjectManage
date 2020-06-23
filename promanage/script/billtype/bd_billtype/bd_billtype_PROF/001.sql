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
                '0001ZZZZF6DEFF9CEC2A',
                NULL,
                '~',
                NULL,
                '工程完工单',
                'Y',
                NULL,
                NULL,
                NULL,
                'profinish',
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
                '91H10515',
                '~',
                'PROF',
                '~',
                'GLOBLE00000000000000',
                NULL,
                'ADPREPARE',
                NULL,
                '2020-05-04 19:09:43',
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
                '0001ZZZZ1B68D32CF3C2',
                11,
                '~',
                '2',
                NULL,
                'APPROVE',
                'N',
                'N',
                NULL,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                NULL,
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ106E9FB8093C',
                30,
                '~',
                '3',
                NULL,
                'DELETE',
                'N',
                'N',
                NULL,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                NULL,
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ1369184E14AA',
                10,
                '~',
                '1',
                NULL,
                'SAVE',
                'N',
                'N',
                NULL,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                NULL,
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ9B399B638667',
                31,
                '~',
                '1',
                NULL,
                'SAVEBASE',
                'Y',
                'N',
                NULL,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                NULL,
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ765F30C52937',
                12,
                '~',
                '3',
                NULL,
                'UNAPPROVE',
                'N',
                'N',
                NULL,
                'Y',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                NULL,
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ4F4012C43BC2',
                13,
                '~',
                '3',
                NULL,
                'UNSAVEBILL',
                'N',
                'Y',
                NULL,
                'Y',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                NULL,
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZAF2F6B2EA94D',
                'SAVE',
                'N_PROF_SAVE',
                0,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                '~',
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ024B13C95567',
                'APPROVE',
                'N_PROF_APPROVE',
                0,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                '~',
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ2C2FBAAB7D3B',
                'UNSAVEBILL',
                'N_PROF_UNSAVEBILL',
                0,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                '~',
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ19D7B43222D2',
                'UNAPPROVE',
                'N_PROF_UNAPPROVE',
                0,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                '~',
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ7BAD4070012F',
                'DELETE',
                'N_PROF_DELETE',
                0,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                '~',
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ29FCAFB5DD2A',
                'SAVEBASE',
                'N_PROF_SAVEBASE',
                0,
                'N',
                'PROF',
                '0001ZZZZF6DEFF9CEC2A',
                '~',
                '~',
                '2020-05-04 19:09:43'
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
        '0001ZZZZ62681E99B172',
        0,
        'PROFT',
        null,
        null,
        '0001ZZZZF6DEFF9CEC2A',
        null,
        '2020-05-04 19:09:43',
        'Y',
        'Y'
)
go