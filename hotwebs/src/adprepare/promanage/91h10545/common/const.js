function returnPageConfig() {
    const pageConfig = {
        
        
        appCode: '91H10545',

        listPageId: '91H10545_LIST',
        listTableId: 'list_head',
        searchId: 'list_query',

        cardPageId: '91H10545_CARD',
        cardFormId: 'card_head',
        cardTableId: 'card_body',

        primaryKey: 'pk_monthprojplan_h',
        dataSource: 'tm.fmc.cost.datasource',

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
        pageConfig.appCode = '91H10545';
        pageConfig.cardPageId = '91H10545_CARD';
        pageConfig.listPageId = '91H10545_LIST';
    }
    return pageConfig;
}



export const pageConfig = returnPageConfig();