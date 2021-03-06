INSERT INTO pub_bcr_nbcr (
        pk_nbcr,
        code,
        codelenth,
        codescope,
        codestyle,
        comp,
        dr,
        metaid,
        name,
        orgtype,
        ts
)
VALUES
        (
                '0001ZZZZ3F197B6913FF',
                'MYDC',
                40,
                'global',
                'after',
                NULL,
                0,
                '3133aad7-7d97-4fa5-b376-98cf8c594074',
                '满意度调查',
                'GLOBLE00000000000000',
                '2020-05-08 16:42:48'
        );

go

INSERT INTO pub_bcr_rulebase (
        pk_billcodebase,
        codemode,
        codescope,
        dataoriginflag,
        dr,
        format,
        isautofill,
        isdefault,
        iseditable,
        isgetpk,
        islenvar,
        isused,
        nbcrcode,
        pk_group,
        rulecode,
        rulename,
        ts
)
VALUES
        (
                '0001ZZZZ8BC8198474E8',
                'after',
                'g',
                0,
                0,
                'yyyyMMdd',
                'Y',
                'N',
                'N',
                'N',
                'Y',
                'Y',
                'MYDC',
                'GLOBLE00000000000000',
                'MYDC',
                '满意度调查',
                '2020-05-08 16:42:48'
        );

go

INSERT INTO pub_bcr_elem (
        pk_billcodeelem,
        dataoriginflag,
        dr,
        elemlenth,
        elemtype,
        elemvalue,
        eorder,
        fillsign,
        fillstyle,
        isrefer,
        pk_billcodebase,
        pk_billcodeentity,
        ts
)
VALUES
        (
                '0001ZZZZ95CD950B1F5B',
                NULL,
                0,
                4,
                0,
                'MYDC',
                0,
                NULL,
                0,
                0,
                '0001ZZZZ8BC8198474E8',
                '~',
                '2020-05-08 16:42:48'
        );
go
INSERT INTO pub_bcr_elem (
        pk_billcodeelem,
        dataoriginflag,
        dr,
        elemlenth,
        elemtype,
        elemvalue,
        eorder,
        fillsign,
        fillstyle,
        isrefer,
        pk_billcodebase,
        pk_billcodeentity,
        ts
)
VALUES
        (
                '0001ZZZZC1DFDDFAB506',
                NULL,
                0,
                8,
                2,
                'billdate',
                1,
                NULL,
                0,
                0,
                '0001ZZZZ8BC8198474E8',
                '~',
                '2020-05-08 16:42:48'
        );
go
INSERT INTO pub_bcr_elem (
        pk_billcodeelem,
        dataoriginflag,
        dr,
        elemlenth,
        elemtype,
        elemvalue,
        eorder,
        fillsign,
        fillstyle,
        isrefer,
        pk_billcodebase,
        pk_billcodeentity,
        ts
)
VALUES
        (
                '0001ZZZZFFA1D013E047',
                NULL,
                0,
                8,
                3,
                'nc.pub.billcode.BillCodePureDigitalSNGenerator',
                2,
                NULL,
                0,
                0,
                '0001ZZZZ8BC8198474E8',
                '~',
                '2020-05-08 16:42:48'
        );
go