import { ajax, toast } from 'nc-lightapp-front';
import { pageConfig } from '../../common/const';
const {
	cardFormId,
	cardTableId,
	cardPageId,
	cardLeftArea,
	dataSource
} = pageConfig;
import { dealDataBeforeToBack, dealDataFromBack, filterData } from './treetableAction';

import { REQUEST_URL, CARD, PRIMARY_KEY, CARD_BUTTON, CARD_CACHE, DATASOURCE, STATUS, FIELD, BILL_TYPE_CODE, CARD_ADD_DISABLED_BUTTON } from '../../constant';

export function bodyAfterEvent(props, moduleId, key, value, changedrows, index) {
	let pk_org = props.form.getFormItemsValue(cardFormId, 'pk_org').value;
	let rowdata = props.cardTable.getDataByIndex(cardTableId, index);
	let dateArr = ['plan_start_date', 'plan_end_date', 'duration', 'pk_front_plan'];
	if (key == 'pk_dutier') {
		if (value.values) {
			props.cardTable.setValByKeyAndIndex(cardTableId, index, 'pk_duty_dept', {
				value: value.values.pk_dept.value,
				display: value.values.deptname.value,
				scale: 0,
				isEdit: false
			});
		}
		props.handleRelationItems({
			type: 'table',
			areaCode: cardTableId,
			key: "pk_duty_dept",
			value: { value: value.values ? value.values.pk_dept.value : '' },
			changedrows,
			index,
			callback: () => { },  //请求成功的回调（业务组自己的编辑后事件）,
			formMetaCode: cardFormId  //若编辑的是分组表单，为当前编辑的表单分组的区域编码
		})
	} else if (dateArr.includes(key)) {
		bodyAfter.call(this, props, key, index, changedrows);
	}
}

function bodyAfter(props, key, index, changedrows) {
	let cardData = props.createMasterChildDataSimple(cardPageId, cardFormId, cardTableId);
	let predata = props.cardTable.getAllRows(cardTableId);
	dealDataBeforeToBack.call(this, cardData.body);
	let rowid = changedrows[0].rowid;
	let data = {
		card: cardData,
		key,
		changedrows,
		index: cardData.body[cardTableId].rows.findIndex((cur, index) => {
			return cur.rowid == rowid
		})
	};
	/* ajax({
		url: '/nccloud/pmsch/planncc/bodyAfterEdit.do',
		data: data,
		success: (res) => {
			debugger;
			if (res.success) {
				if (res.data) {
					let { body, head } = res.data;
					// if (head && head[cardFormId]) {
					// 	props.form.setAllFormValue({ [cardFormId]: head[cardFormId] });
					// }
					if (body && body[cardTableId]) {
						body[cardTableId].rows.forEach(cur => {
							cur.values.plan_level = { value: parseInt(cur.values.plan_level.value) };
						})
						// let rows = body[cardTableId].rows;
						this.treetableData = body[cardTableId].rows;
						props.cardTable.setTableData(cardTableId, { rows: filterData(this.treetableData) });
					}
				}
			}
		},
		error: (e) => {
			if (key == 'pk_front_plan') {
				props.cardTable.setValByKeyAndRowId(cardTableId, changedrows[0].rowid, key,
					{ value: null, display: null });
			} else {
				props.cardTable.setValByKeyAndRowId(cardTableId, changedrows[0].rowid, key,
					changedrows[0].oldvalue);
			}
			toast({ color: 'danger', content: e.message });
		}
	}); */
}




export function headAfterEvent(props, moduleId, key, value, oldValue, val) {
	debugger
	// 最终由用户选择表头旬时触发此编辑事件
	let headAfterArr = ['tendaymonth']; 
	// 前台获取表头的项目
	let pk_project = props.form.getFormItemsValue(cardFormId, 'pk_project').value;
	// 前台获取表头的参照日期
	let refdate = props.form.getFormItemsValue(cardFormId, 'def1').value;

	if (headAfterArr.includes(key) && pk_project && refdate) {
		headAfter.call(this, props, key, value, oldValue);
	}
}

function headAfter(props, key, value, oldValue) {
	debugger
	let cardData = props.createMasterChildDataSimple(cardPageId, cardFormId, cardTableId);
	dealDataBeforeToBack.call(this, cardData.body);

	let data = props.createMasterChildData(CARD.page_code, CARD.form_id, CARD.table_code, 'cardTable');
	
	ajax({
		url: '/nccloud/adprepare/promanage/tendayProjectplanHeadAfterEdit.do',
		data: data,
		success: (res) => {
			debugger
			if (res.success) {
				if (res.data) {
					if (res.data.body && res.data.body[CARD.table_code]) {
						props.cardTable.setTableData(CARD.table_code, res.data.body[CARD.table_code]);
					}
				}
			}
		},
		error: (e) => {
			debugger
			toast({ color: 'danger', content: e.message });
		}
	});
}