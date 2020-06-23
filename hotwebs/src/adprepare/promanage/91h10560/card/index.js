import React, { Component } from 'react';
import { createPage, base, high } from 'nc-lightapp-front';
import initTemplate from './events/initTemplate';
import { buttonClick } from './events/buttonClick';
import { beforeHeadEvent } from './events/beforeHeadEvent';
import { beforeTableEvent } from './events/beforeTableEvent';
import { afterHeadEvent } from './events/afterHeadEvent';
import { afterTableEvent } from './events/afterTableEvent';
import { bodySelectedEvent, bodySelectedAllEvent } from './events/bodySelectedEvent';
import { MULTILANG, CARD, PRIMARY_KEY, CARD_BUTTON, DATASOURCE, STATUS, BILL_TYPE_CODE } from '../constant';
import { pageClick, cardCommit } from './events/cardOperator';
import { bodyButtonClick } from './events/bodyButtonClick';

// 导入平台的excel导入组件
import { ajax, toast, cardCache, excelImportconfig } from 'nc-lightapp-front';

const { ExcelImport } = high;

import { headAfterEvent,bodyAfterEvent } from './events/afterEvent';

import { bodyBeforeEvent } from './events/bodyBeforeEvent_xun';

import './index.less';

import { pageConfig } from '../common/const';
import { commitCallback, loadDataByPkSelf } from '../common/utils';
import { doSave } from './events/buttonClick';
import { getMultiLangByID } from '../../../../pmbd/pmpub/utils/multiLangUtils';
import unOrCommitAction from '../../../../pmbd/pmpub/commonEvents/unOrCommitAction';
import {
	createCardTitleArea,
	getCommonTableHeadLeft,
	pageInfoClick,
	setBatchBtnsEnable,
	toggleShow
} from '../../../../pmbd/pmpub/utils/cardUtils';
import { DataFormatType, operatorType } from '../../../../pmbd/pmpub/constants';

import Gtt from '../common/gtt/index';

import {
	loginContext,
	getContext,
	loginContextKeys
} from '../../../../pmbd/pmpub/utils/loginContext';

const { setDefData, getDefData } = cardCache;
const { BillTrack, ApproveDetail, ApprovalTrans } = high;
const { NCBackBtn, NCUpload } = base;
const {
	cardFormId,
	cardTableId,
	cardPageId,
	bill_type,
	transi_type,
	dataSource,
} = pageConfig;


/**
* @description: 卡片
* 卡片态还存在的问题:
*
*/
const { NCAffix } = base;

class Card extends Component {
	constructor(props) {
		super(props);
		this.state = {
			showTrack: false,
			showApprove: false,
			pk: '',
			compositedata: {},
			compositedisplay: false,
			data: []
		};
		this.pageConfig = pageConfig;
		this.taxCodeRate = {};
		this.priority = {};
		this.loadDataByPkSelf = loadDataByPkSelf.bind(this);
		this.commitCallback = commitCallback.bind(this);
		this.bodyList = [];
		this.treetable = true;
		this.treetableData = [];
		this.deletedRows = [];
	}

	//返回列表界面
	backToList = () => {
		this.props.pushTo('/list', {});
	};

	componentWillMount() {
		// json： 多语json格式参数； 
		// status： 是否请求到json多语，可用来判断多语资源是否请求到并进行一些别的操作； 
		// inlt： 可用来进行占位符的一些操作
		let callback = (json, status, inlt) => {
			if (status) {
				initTemplate.call(this, this.props); // 如模板内也有多语处理，平台推荐模板加载操作放于此处， 在取到json多语资源后用传参的方式传入intemplate模板函数中

				// 保存json和inlt到页面state中并刷新页面
				this.setState({ json, inlt })
			}
		}
		this.props.MultiInit.getMultiLang({ moduleId: MULTILANG.moduleId, domainName: MULTILANG.domainName, callback });

		// 关闭浏览器
		window.onbeforeunload = () => {
			let status = this.props.cardTable.getStatus(CARD.table_code);
			if (status == STATUS.edit) {
				return this.state.json['91H10545-000007'];/* 国际化处理： 当前单据未保存，您确认离开此页面？*/
			}
		};
	}

	componentDidMount() {

	}

	handlePageInfoChange = (props, id) => {
		pageClick({ ...props, json: this.state.json }, id);
	}

	//获取列表肩部信息
	getTableHead = () => (
		<div className="shoulder-definition-area">
			<div className="definition-icons">
				{this.props.button.createButtonApp({
					area: CARD.shoulder_btn_code,
					onButtonClick: bodyButtonClick.bind(this),
					popContainer: document.querySelector('.header-button-area')
				})}
			</div>
		</div>
	);

	//指派提交
	getAssignUser = (value) => {
		cardCommit({ ...this.props, json: this.state.json }, {
			pks: this.state.curPk,
			userObj: value
		});
		this.compositeTurnOff();
	};

	//关闭指派
	compositeTurnOff = () => {
		this.setState({
			compositeData: null,
			compositeDisplay: false
		});
	};

	render() {
		let { table, button, search, ncmodal, form, cardTable, cardPagination, ncUploader } = this.props;
		let { createEditTable, setTableData, getAllRows } = this.props.editTable;
		let { createButtonApp } = button;
		let { createForm } = form;
		let { createCardTable } = cardTable;
		let { createNCUploader } = ncUploader;


		return (
			<div className="nc-bill-card">
				<div className="nc-bill-top-area">
					<NCAffix>
						<div className="nc-bill-header-area">
							{createCardTitleArea.call(this, this.props, {
								title: this.props.type == 'qq' ? '前期任务编制' : '旬计划编制',
								backBtnClick: this.backToList
							})}
							<div className="header-button-area">
								{
									createButtonApp({
										area: cardFormId,
										onButtonClick: buttonClick.bind(this),
									})
								}
							</div>
							<div className="header-cardPagination-area">
								{cardPagination.createCardPagination({
									handlePageInfoChange: pageInfoClick.bind(this),
									dataSource
								})}
							</div>
						</div>
					</NCAffix>
					<div className="nc-bill-form-area">
						{createForm(cardFormId, {
							onAfterEvent: headAfterEvent.bind(this),
							setVisibleByForm: true
						})}
					</div>

					
				</div>
				<div className="nc-bill-bottom-area">
					<div className="nc-bill-table-area treetable">
						{createCardTable(cardTableId, {
							// tableHeadLeft: this.getTableHeadLeft.bind(this, cardTableId),
							// tableHead: this.getTableHead.bind(this, cardTableId),
							// modelSave: this.modelSave.bind(this, cardTableId),
							showCheck: true,
							showIndex: true,
							isAddRow: true,
							onAfterEvent: bodyAfterEvent.bind(this),
							onBeforeEvent: bodyBeforeEvent.bind(this),
							// selectedChange: this.rowselected.bind(this),
							isAddRow: false,
							hideModelSave: true,
							hideAdd: true,
							hideDel: true,
							height: 550,
							// addRowCallback: this.addLine,
						})}
					</div>

					{/* 节点中卡片浏览态右方的甘特图 */}
					<Gtt useCase='card' data={this.state.data} containerClass={'nc-bill-table-area'} />
				</div>
				<BillTrack
					show={this.state.showTrack}
					close={() => {
						this.setState({ showTrack: false });
					}}
					pk={this.state.pk} //单据id
					type={'XUN1'} //单据类型
				/>
				<ApproveDetail
					show={this.state.showApprove}
					close={() => {
						this.setState({ showApprove: false });
					}}
					billtype={getContext('transtype') || '4D80'}
					billid={this.state.pk}
				/>
				{/* 平台附件组件 */}
				{/* {createNCUploader('warcontract-uploader', {})} */}
				{/* {createNCUploader(`${cardPageId}-uploader`, {})} */}
				{/* <NCUpload {...config}>
					<div className="import" />
				</NCUpload> */}
				{/* 提交及指派 */}
				{this.state.compositedisplay ? (
					<ApprovalTrans
						title={getMultiLangByID("amcommon-000002")}
						data={this.state.compositedata}
						display={this.state.compositedisplay}
						getResult={(content) => {
							if (this.operatorType == 'SAVECOMMIT') {
								doSave.call(this, this.props, operatorType.SAVECOMMIT, content);
							} else {
								unOrCommitAction.call(this, 'SAVE', content);
							}
						}}
						cancel={() => {
							this.setState({
								compositedisplay: false
							});
						}}
					/>
				) : (
						''
					)}


				{/* <ExcelImport 
					{...this.props}
					moduleName='pmsch'//模块名
					billType='importpmsch'//单据类型  命名自定义，但要与xml配置文件名一致
					selectedPKS={[]} //若只做导入，此处为空数组即可，若是导出数据需放入主键数组 this.state.pks
					appcode='4830020005'
					pagecode={'4830020005_card'}
				/> */}
			</div>
		);
	}


}





Card = createPage({
	billinfo: {
		billtype: 'XUN1',
		pagecode: CARD.page_code,
		headcode: CARD.form_id,
		bodycode: CARD.table_code
	}
})(Card);
export default Card;


