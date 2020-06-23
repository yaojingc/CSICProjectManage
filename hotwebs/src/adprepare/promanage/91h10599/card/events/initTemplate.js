import { cacheTools, ajax, cardCache, excelImportconfig } from 'nc-lightapp-front';
import {buttonClick} from './buttonClick';
import { tableButtonClick } from './tableButtonClick';
import { pageConfig } from '../../common/const';
import { loadDataByPkSelf } from '../../common/utils';
import RreTaskRefer from './preTaskRefer';
import { loadTreeData, hasChildrenFn, setWidth, oncloseclick, onopenclick, addBrother, addSub, deleteRow } from './treetableAction';
import { getMultiLangByID } from '../../../../../pmbd/pmpub/utils/multiLangUtils';
import { loginContext, getContext, loginContextKeys } from '../../../../../pmbd/pmpub/utils/loginContext';
import { UISTATE } from '../../../../../pmbd/pmpub/constants/StatusUtils';
import { afterModifyCardMeta, toggleShow } from '../../../../../pmbd/pmpub/utils/cardUtils';
import getPullBillActions from '../../../../../pmbd/pmpub/utils/getPullBillActions';
import constUrls from '../../../../../pmbd/pmpub/constants/constUrls';
import { mustParamsForJava } from "./../../../../../pmbd/pmpub/utils/mustParamsForJava"
import { projectFormCon } from '../../../../../pmbd/pmpub/commonQueryConditions';
import { getCardData, copyClear } from './cardOperator';
import { setBatchBtnsEnable } from '../../../../../pmbd/pmpub/utils/cardUtils';
const {
	pageindexforcard,
	appCode,
	cardLeftArea,
	cardPageId,
	cardFormId,
	cardTableId,
	billType,
	dataSource,
	pretasksUrl
} = pageConfig;
let { setDefData, getDefData } = cardCache;

import { Initcardpageindex } from '../../constant/index';

export default function (props) {
	debugger
	let fromPage = props.getUrlParam('fromPage');
	props.createUIDom(
		{
			pagecode: cardPageId //页面id
		},
		(data) => {
			if (data) {
				if (data.context) {
					//初始化上下文变量
					loginContext.call(this, data.context);
				}
				if (data.button && !props.approveCenter) {

					debugger
					let button = data.button;
					props.button.setButtons(button, () => {

					}); // 行删除时悬浮框提示
					props.button.setPopContent('delLine', getMultiLangByID("msgUtils-000001"));

					/* //单据类型命名自定义，但要与xml配置文件名一致
					let excelimportconfig = excelImportconfig(props, 'pmsch', 'importpmsch', true, '', 
						{ appcode: appCode, pagecode: cardPageId }, () => {
						this.getData();//导入完成后回调列表查询方法
					});
					props.button.setUploadConfig("ImportExcel", excelimportconfig); */
				}
				if (data.template) {
					let meta = data.template;
					meta = modifierMeta.call(this, props, meta);
					props.form.setFormStatus(cardFormId, 'add');
					props.meta.setMeta(meta, () => {
						afterInitTemplet.call(this, props);
					});
				}

				// if (data.template) {
				// 	let meta = data.template;
				// 	meta = modifierMeta.call(this, props, meta);
				// 	props.meta.setMeta(meta, () => {
				// 		let status = this.props.getUrlParam(STATUS.status);
				// 		let id = this.props.getUrlParam(PRIMARY_KEY.id);
				// 		if (status === STATUS.add) { //新增
				// 			cardCreate(this.props);
				// 		} else if (id) {
				// 			getCardData(this.props, id, false, copyClear);
				// 		}
				// 	});
				// }

			}
		}
	);
}

function modifierMeta(props, meta) {
	// let pk_group = getContext.call(this, loginContextKeys.groupId);
	//给单据号列添加超链接
	debugger
	meta[cardFormId].items.forEach((item) => {
		if (item.attrcode == 'pk_org_v') {
			// item.initialvalue = {
			// 	value: getContext('pk_org_v'),
			// 	display: getContext('org_v_Name'),
			// 	scale: -1
			// };
			item.queryCondition = () => {
				return {
					TreeRefActionExt: 'nccloud.web.pmpub.action.refCondition.PMPermOrgVRefFilter',
				};
			};
		} else if (item.attrcode == 'pk_group') {
			item.initialvalue = {
				value: getContext('groupId'),
				display: getContext('groupName'),
				scale: -1
			}
		} else if (item.attrcode == 'pk_project') {
			item.initialvalue = {
				display: getContext('project_name'),
				value: getContext('pk_project')
			};
			projectFormCon(props, item, cardFormId, 'pk_org');
		} else if (item.attrcode == 'transi_type') {
			item.initialvalue = {
				value: getContext('transtype'),
			}
		} else if (item.attrcode == 'pk_transitype') {
			item.initialvalue = {
				value: getContext('pk_transtype'),
			}
		}
	});

	meta[cardTableId].items.forEach((item, key) => {
		item.isSort = false;
		if (item.attrcode == 'full_seq') {
			// item.render = (text, record, index) => {
			// 	return (
			// 		<div class="simple-table-td" field="full_seq" fieldname={'编码'}>
			// 			<span class="abcopen"></span>123
			// 			<span class="abcclose"></span>
			// 		</div>
			// 	);
			// };
		} else if (item.attrcode == "pk_duty_dept_v") {

			item.queryCondition = () => {
				let pkOrgsValue = props.form.getFormItemsValue(cardFormId, 'pk_org').value;
				return {

					unitPks: pkOrgsValue,
					busifuncode: 'it',

				};
			};
		} else if (item.attrcode == 'pk_dutier') {

			item.queryCondition = () => {
				let pkOrgsValue = props.form.getFormItemsValue(cardFormId, 'pk_org').value;
				return {

					unitPks: pkOrgsValue,
					busifuncode: 'it',

				};
			};
		} else if (item.attrcode == 'pk_front_plan') {

			item.metadataProperty = "pim.TimePlanItemVO.full_seq"

			item.width = '100';
			item.className = 'table-opr2';
			item.itemtype = 'refer';
			item.visible = true;
			item.isSort = false;

			item.render = (text, record, index) => {

				return (
					<RreTaskRefer
						value={this.state.currency1}
						onChange={(value) => {
							this.setState({
								currency1: value
							});
						}}
						refName="前置任务"
						refType="tree"
						placeholder="单选表格"
						popWindowClassName='pretasks'
						treeConfig={{ name: ['refname'], code: ['refname'] }}
						// queryTreeUrl={pretasksUrl}
						loadTreeData={loadTreeData.bind(this)}
						fieldDisplayed={['refcode']}

					/>
				);
			}
		}
	});
	//添加操作列
	let opr = {
		attrcode: 'opr',
		label: '操作',
		width: 200,
		fixed: 'right',
		className: 'table-opr',
		itemtype: 'customer',
		visible: true,
		render: (text, record, index) => {
			return (
				<div class='tempopr'>
					<a calss='' onClick={(e) => { addBrother.call(this, e, props, record, index) }}>添加同级</a>
					<a onClick={(e) => { addSub.call(this, e, props, record, index) }}>添加子级</a>
					<a onClick={(e) => { deleteRow.call(this, e, props, record, index) }}>删除</a>
				</div >
			)
		}
	};
	//添加树样式列
	let openClose = {
		attrcode: 'openclose',
		label: '',
		width: '60',
		fixed: 'left',
		className: 'table-opr1',
		itemtype: 'customer',
		visible: true,
		isSort: false,
		render: (text, record, index) => {
			let { children, open, plan_level } = record.values;
			let hasChildren = hasChildrenFn(children);
			return (
				<div class="simple-table-td openclose" field="openclose" fieldname={'编码'}>
					{
						hasChildren && (
							open.value ?
								<span class="openclose_close" style={{ marginLeft: plan_level.value * 20 - 20 }}
									onClick={() => { oncloseclick.call(this, props, record, index); }
									}></span>
								:
								<span class="openclose_open" style={{ marginLeft: plan_level.value * 20 - 20 }}
									onClick={() => { onopenclick.call(this, props, record, index); }
									}></span>

						)
					}
					{/* {
						<span class="openclose_item" style={{
							marginLeft: hasChildren ? 7 :
								plan_level.value * 20 - 20 + 20
						}}></span>
					} */}
				</div>
			);
		}
	};

	meta[cardTableId].items.push(opr);
	meta[cardTableId].items.unshift(openClose);

	return meta;
}



/**
 * 模板初始化以后
 * @param {*} props 
 */
function afterInitTemplet(props) {
	let status = props.getUrlParam('status') || UISTATE.browse;

	if (status == UISTATE.add) {
		// let paramsKey = {
		// 	pkOrg: 'pk_org',
		// 	orgName,
		// 	pkOrgV,
		// 	// orgVName,
		// 	groupId,
		// 	groupName,
		// 	transtype,
		// 	pkTranstype,
		// 	pkProject,
		// 	// projectName
		// };
		// mustParamsForJava.call(this, undefined, cardFormId, getContext(''), paramsKey);
		// buttonClick.call(this, props, 'Add');
		let newpk = new Date().getTime().toString();
		props.cardTable.addRow(cardTableId, 0, {
			plan_level: { value: 1 },
			children: { value: '' },
			full_seq: {
				value: '1',
				display: '1'
			},
			pk_time_plan_item: { value: newpk },
			pk_parent: { value: '' }
		},
			true,
			() => {
				setWidth.call(this, props);
				this.treetableData = [...this.props.cardTable.getAllRows(cardTableId)];
			});
		toggleShow.call(this, props, status);
	}
	// else if (status == UISTATE.edit) {
	// 	debugger
	// 	// buttonClick.call(this, props, 'Edit');
	// }
	else {

		let pk = this.props.getUrlParam('id');
		getCardData(this.props, pk, false, copyClear);
		loadDataByPkSelf.call(this, pk);
		// toggleShow.call(this, props, status);
	}
	// setBatchBtnsEnable.call(this, props, cardTableId);
	// props.editTable.setTableData(cardTableId, initdata);


	// toggleShow.call(this, props, status);
	// props.editTable.setStatus(cardTableId, 'edit', () => {
	// 	setWidth(props);
	// })
	//Initcardpageindex(1)
	//}
}