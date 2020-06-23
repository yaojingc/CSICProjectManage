function returnPageConfig() {
    const pageConfig = {
        appCode: '91H10599',

        listPageId: '91H10599_LIST',
        listTableId: 'list_head',
        searchId: 'searchArea',

        cardPageId: '91H10599_CARD',
        cardFormId: 'card_head',
        cardTableId: 'card_body',

        primaryKey: 'pk_time_plan',
        dataSource: 'adprepare.peomanage.91H10599.main',

        cardRouter: '/card',

        editBtns: [
            'SaveBtn',
            'SaveCommitBtn',
            'CancelBtn',
            'OpenCard',
            'addRow',
            'deleteRow',
            'DelLines',
        ],
        browseBtns: [
            'CreateBtn',
            'UpdateBtn',
            'DeleteBtn',


            'AddBtn',
            'Edit',
            'DelBtn',

            'CommitBtn',
            'UnCommitBtn',
            'AttachmentBtn',

            'CardPrint',
            'ListPrint',
            'Output',
            'TrackBtn',
            'ApproveDetails',

            'OpenCard',

            'UpdateDuration',

            'Refresh',
        ],
    };
    if (location.href.indexOf('/listqq') != -1) {
        pageConfig.appCode = '91H10599';
        pageConfig.cardPageId = '91H10599_CARD';
        pageConfig.listPageId = '91H10599_LIST';
    }
    return pageConfig;
}



export const pageConfig = returnPageConfig();