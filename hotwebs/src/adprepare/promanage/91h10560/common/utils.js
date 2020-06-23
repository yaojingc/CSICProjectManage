import { ajax, toast, cardCache } from 'nc-lightapp-front';
import { DataFormatType } from '../../../../pmbd/pmpub/constants';
import { pageConfig } from './const';
import { dealDataFromBack, setWidth } from '../card/events/treetableAction';
import { showMulOprMessage } from '../../../../pmbd/pmpub/utils/showMessage';
import { batchRefresh, searchBtnClick } from '../../../../pmbd/pmpub/utils/listUtils';
import { loadDataByPk, toggleShow } from '../../../../pmbd/pmpub/utils/cardUtils';
import constUrls from '../../../../pmbd/pmpub/constants/constUrls';

const {
    listTableId,
    cardFormId,
    cardTableId,
    cardLeftArea,
    dataSource,
    primaryKey,

} = pageConfig;
let { setDefData, getDefData } = cardCache;
export function commitCallback(res, operatorType) {
    let { props, actionData, actionType, pageConfig } = this;
    if (actionType == 'listinner') {
        toast({ color: 'success' });
        props.table.updateDataByIndexs(listTableId,
            [{
                index: actionData.index,
                data: res.data.saveObj.head.list_head.rows[0]
            }]);
    } else if (actionType == 'listhead') {
        showMulOprMessage(res.data);
        batchRefresh.call(this, props, searchBtnClick);
    } else if (actionType == 'card') {
        let { errorMsg, resultState } = res.data;
        if (resultState === 'all_success') {
            switch (operatorType) {
                case 'SAVE':
                    toast({ color: 'success', content: '提交成功' });
                    break;
                case 'UNSAVEBILL':
                    toast({ color: 'success', content: '收回成功' });
                    break;
                default: break;
            }
            props.form.EmptyAllFormValue(cardFormId); // 清空表单数据
            let saveData = res.data.saveObj; // 表单数据
            let { body, head } = saveData;
            if (head && head[cardFormId]) {
                props.form.setAllFormValue({ [cardFormId]: head[cardFormId] });
            }
            if (body && body[cardTableId]) {
                dealDataFromBack.call(this, body);
                let rows = body[cardTableId].rows;
                props.cardTable.setTableData(cardTableId, { rows }, () => {
                    setWidth.call(this, props);
                });
                this.setState({
                    data: rows
                });
            }

            props.form.setAllFormValue({ [cardFormId]: head[cardFormId] }) // 设置表单数据
            cardCache.updateCache(primaryKey, actionData.pk, saveData, cardFormId, dataSource);
            toggleShow.call(this, props, 'browse');
        } else {
            for (let i in errorMsg) {
                toast({ color: 'danger', content: errorMsg[i] });
            }
        }
    }
}

export function loadDataByPkSelf(pk, useCache) {
    debugger
    let { props } = this;
    loadDataByPk.call(this, props, pk, useCache).then(data => {

        let { body, head } = data;
        if (head && head[cardFormId]) {
            props.form.setAllFormValue({ [cardFormId]: head[cardFormId] });
        }
        if (body && body[cardTableId]) {
            dealDataFromBack.call(this, body);
            let rows = body[cardTableId].rows;
            props.cardTable.setTableData(cardTableId, { rows }, () => {
                setWidth.call(this, props);
            });
            this.setState({
                data: body[cardTableId].rows
            });
        }
        cardCache.updateCache(primaryKey, pk, data, cardFormId, dataSource);
        let status = this.props.getUrlParam('status');
        toggleShow.call(this, props, status);
        // setValueToCard.call(this, props, undefined);

    }).catch(error => {
        cardCache.deleteCacheById(primaryKey, pk, dataSource);
        toast({ content: '此数据已删除！', color: 'danger' });
        toggleShow.call(this, props, 'browse');
    });
}