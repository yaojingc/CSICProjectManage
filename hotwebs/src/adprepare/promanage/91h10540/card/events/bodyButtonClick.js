/*
 * @Author: Your name
 * @Date:   2020-05-26 09:21:49
 * @Last Modified by:   Your name
 * @Last Modified time: 2020-05-28 19:27:05
 */
import { deepClone } from 'nc-lightapp-front';
import { CARD_BUTTON, CARD, STATUS, CARD_DISABLED_BUTTON, PRIMARY_KEY } from '../../constant';

/**
* @description: 表体按钮点击事件
* @param: key 当前触发按钮名称
* @param: index 当前行序
* @param: record 当前行信息
*/
export function bodyButtonClick(props, key, text, record, index) {
    debugger
    switch (key) {
        //联系人页签 肩 新增
        case CARD_BUTTON.addRow:
            props.cardTable.addRow(CARD.table_code_linkperson);
            break;

        ///联系人页签肩 删除
        case CARD_BUTTON.deleteRow:
            let checkedRows = props.cardTable.getCheckedRows(CARD.table_code_linkperson);
            let checkedIndex = checkedRows && checkedRows.map(item => item.index);
            if (checkedRows.length > 0) {
                props.cardTable.delRowsByIndex(CARD.table_code_linkperson, checkedIndex);
                //props.button.setButtonDisabled(CARD_DISABLED_BUTTON, true);
            }
            break;
        //工程页签 肩 新增
        case CARD_BUTTON.addRowProject:
            props.cardTable.addRow(CARD.table_code_project);
            break;

        ///工程页签肩 删除
        case CARD_BUTTON.deleteRowProject:
            let checkedRows2 = props.cardTable.getCheckedRows(CARD.table_code_project);
            let checkedIndex2 = checkedRows2 && checkedRows2.map(item => item.index);
            if (checkedRows2.length > 0) {
                props.cardTable.delRowsByIndex(CARD.table_code_project, checkedIndex2);
                //props.button.setButtonDisabled(CARD_DISABLED_BUTTON, true);
            }
            break;


        //行 展开
        case CARD_BUTTON.expand:
            props.cardTable.openTabModel(CARD.table_code_linkperson, STATUS.edit, record, index);
            break;

        //行 展开（浏览态）
        case CARD_BUTTON.unfold:
        //行 收起
        case CARD_BUTTON.fold:
            props.cardTable.toggleTabRowView(CARD.table_code_linkperson, record);
            break;

        //行 插行
        case CARD_BUTTON.insertRow:
            props.cardTable.addRow(CARD.table_code_linkperson, index);
            break;

        //行 删行
        case CARD_BUTTON.delRow:
            props.cardTable.delRowsByIndex(CARD.table_code_linkperson, index);
            break;

        //行 复制行
        case CARD_BUTTON.copyRow:
            props.cardTable.pasteRow(CARD.table_code_linkperson, index, [PRIMARY_KEY.body_id]);
            break;

        //肩 复制行
        case CARD_BUTTON.copyRows:
            copyControl.call(this, props, true);
            break;

        //肩 取消复制
        case CARD_BUTTON.pasteCancel:
            copyControl.call(this, props, false);
            break;

        //肩 粘贴至末行
        case CARD_BUTTON.pasteTail:
            let lastIndex = props.cardTable.getNumberOfRows(CARD.table_code_linkperson);
            props.cardTable.insertRowsAfterIndex(CARD.table_code_linkperson, getPasteRows(props), lastIndex);
            copyControl.call(this, props, false);
            props.cardTable.selectAllRows(CARD.table_code_linkperson, false);
            break;

        //行 粘贴至此
        case CARD_BUTTON.pasteHere:
            props.cardTable.insertRowsAfterIndex(CARD.table_code_linkperson, getPasteRows(props), index);
            copyControl.call(this, props, false);
            props.cardTable.selectAllRows(CARD.table_code_linkperson, false);
            break;
    }
    if (![CARD_BUTTON.unfold, CARD_BUTTON.fold].includes(key)) {
        props.cardTable.setStatus(CARD.table_code_linkperson, STATUS.edit);
    }
}

//复制时的状态控制
function copyControl(props, flag) {
    //肩部按钮显示控制
    props.button.setButtonVisible({
        [CARD_BUTTON.addRow]: !flag,
        [CARD_BUTTON.deleteRow]: !flag,
        [CARD_BUTTON.copyRows]: !flag,

        [CARD_BUTTON.pasteTail]: flag,
        [CARD_BUTTON.pasteCancel]: flag,
    });
    props.cardTable.setAllCheckboxAble(CARD.table_code_linkperson, !flag);
    this.setState({ isPaste: flag });
}

/**
 * 获取粘贴行数据
 *
 * @returns 返回粘贴行数据
 */
function getPasteRows(props) {
    let checkedRows = props.cardTable.getCheckedRows(CARD.table_code_linkperson);
    let selectRowCopy = deepClone(checkedRows);
    let selectArr = selectRowCopy.map(item => {
        item.data.selected = false;
        item.data.values[PRIMARY_KEY.head_id] ? item.data.values[PRIMARY_KEY.head_id].value = null : null;
        item.data.values[PRIMARY_KEY.body_id] ? item.data.values[PRIMARY_KEY.body_id].value = null : null;
        return item.data;
    });
    return selectArr;
}
