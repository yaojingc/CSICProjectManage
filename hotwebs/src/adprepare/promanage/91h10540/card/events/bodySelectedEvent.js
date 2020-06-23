/*
 * @Author: Your name
 * @Date:   2020-05-28 19:27:04
 * @Last Modified by:   Your name
 * @Last Modified time: 2020-05-28 19:27:04
 */
import { CARD, CARD_DISABLED_BUTTON } from "../../constant";

//单选
export function bodySelectedEvent(props, moduleId, record, index, status) {
    let checkedRows = props.cardTable.getCheckedRows(CARD.table_code_linkperson);
    if (checkedRows.length > 0) {
        props.button.setButtonDisabled(CARD_DISABLED_BUTTON, false);
    } else {
        props.button.setButtonDisabled(CARD_DISABLED_BUTTON, true);
    }
}

//全选
export function bodySelectedAllEvent(props, moduleId, status, length) {
    props.button.setButtonDisabled(CARD_DISABLED_BUTTON, !(status && length > 0));
}
