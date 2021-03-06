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
                '0001ZZZZE322F94288B2',
                'PROF',
                40,
                'global',
                'after',
                NULL,
                0,
                'ffc45dc6-216c-4a17-942d-b3ed6ca7f898',
                '工程完工单',
                'GLOBLE00000000000000',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ71CD2C9FF5B7',
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
                'PROF',
                'GLOBLE00000000000000',
                'PROF',
                '工程完工单',
                '2020-05-04 19:09:43'
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
                '0001ZZZZBDCB460B7402',
                NULL,
                0,
                4,
                0,
                'PROF',
                0,
                NULL,
                0,
                0,
                '0001ZZZZ71CD2C9FF5B7',
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZDA31A190E682',
                NULL,
                0,
                8,
                2,
                'billdate',
                1,
                NULL,
                0,
                0,
                '0001ZZZZ71CD2C9FF5B7',
                '~',
                '2020-05-04 19:09:43'
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
                '0001ZZZZ21FAF1A3725C',
                NULL,
                0,
                8,
                3,
                'nc.pub.billcode.BillCodePureDigitalSNGenerator',
                2,
                NULL,
                0,
                0,
                '0001ZZZZ71CD2C9FF5B7',
                '~',
                '2020-05-04 19:09:43'
        );
go