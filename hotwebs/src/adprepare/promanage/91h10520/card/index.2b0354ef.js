!function(e,t){"object"==typeof exports&&"object"==typeof module?module.exports=t(require("nc-lightapp-front"),require("react")):"function"==typeof define&&define.amd?define(["nc-lightapp-front","react"],t):"object"==typeof exports?exports["adprepare/promanage/91h10520/card/index"]=t(require("nc-lightapp-front"),require("react")):e["adprepare/promanage/91h10520/card/index"]=t(e["nc-lightapp-front"],e.React)}(window,function(e,t){return function(e){var t={};function a(o){if(t[o])return t[o].exports;var r=t[o]={i:o,l:!1,exports:{}};return e[o].call(r.exports,r,r.exports,a),r.l=!0,r.exports}return a.m=e,a.c=t,a.d=function(e,t,o){a.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:o})},a.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},a.t=function(e,t){if(1&t&&(e=a(e)),8&t)return e;if(4&t&&"object"==typeof e&&e&&e.__esModule)return e;var o=Object.create(null);if(a.r(o),Object.defineProperty(o,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var r in e)a.d(o,r,function(t){return e[t]}.bind(null,r));return o},a.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return a.d(t,"a",t),t},a.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},a.p="../../../../",a(a.s=84)}({0:function(t,a){t.exports=e},12:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.cardBack=function(e){e.pushTo(r.REQUEST_URL.toList,{})},t.cardCreate=function(e){e.setUrlParam({status:r.STATUS.add}),e.initMetaByPkorg(),e.button.setButtonDisabled(r.CARD_ADD_DISABLED_BUTTON,!0),e.cardTable.setAllCheckboxAble(r.CARD.table_code,!1),m(e),T(e);var t=(0,o.cardCache.getDefData)(r.CARD_CACHE.key,r.CARD_CACHE.dataSource);if(t){var a=t.pk_org,n=t.org_Name;e.form.setFormItemsValue(r.CARD.form_id,i({},r.FIELD.org,{value:a,display:n})),(0,l.afterHeadEvent)(e,r.CARD.form_id,r.FIELD.org,{display:n,value:a},{display:null,value:null})}},t.copyClear=A,t.cardSave=function(e){return new Promise(function(t,a){var n=e.form.isCheckNow(r.CARD.form_id)&&e.cardTable.checkTableRequired(r.CARD.table_code);if(n){var l=e.createMasterChildData(r.CARD.page_code,r.CARD.form_id,r.CARD.table_code,"cardTable");e.validateToSave(l,function(){var a=e.getUrlParam(r.STATUS.status);(0,o.ajax)({url:r.REQUEST_URL.save,data:l,success:function(n){var l=n.success,d=n.data;if(l){(0,o.toast)({color:r.STATUS.success,content:e.json["91H10520-000004"]}),n.formulamsg&&n.formulamsg instanceof Array&&n.formulamsg.length>0&&e.dealFormulamsg(n.formulamsg);var u=null;n.data&&(n.data.head&&n.data.head[r.CARD.form_id]&&(u=n.data.head[r.CARD.form_id].rows[0].values[r.PRIMARY_KEY.head_id].value,e.form.setAllFormValue(i({},r.CARD.form_id,n.data.head[r.CARD.form_id]))),n.data.body&&n.data.body[r.CARD.table_code]&&e.cardTable.setTableData(r.CARD.table_code,n.data.body[r.CARD.table_code])),e.setUrlParam({id:u,status:r.STATUS.browse}),a===r.STATUS.add?c(u,d,r.CARD.form_id,r.DATASOURCE):s(r.PRIMARY_KEY.head_id,u,d,r.CARD.form_id,r.DATASOURCE),T(e),t(!0)}}})},i({},r.CARD.table_code,"cardTable"))}})},t.cardUpdate=function(e){e.setUrlParam({status:r.STATUS.edit}),T(e)},t.cardCopy=function(e){e.setUrlParam({isCopy:!0}),A(e),T(e)},t.cardDelete=function(e){var t=e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id).value||e.getUrlParam(r.PRIMARY_KEY.id),a=e.form.getFormItemsValue(r.CARD.form_id,r.FIELD.ts)&&e.form.getFormItemsValue(r.CARD.form_id,r.FIELD.ts).value,n=new Map;t&&a&&n.set(t,a);var l={pks:[t],pkMapTs:n};(0,o.ajax)({url:r.REQUEST_URL.delete,data:l,success:function(a){if(a.success){(0,o.toast)({color:r.STATUS.success,content:e.json["91H10520-000005"]});var n=d(t,r.DATASOURCE);u(r.PRIMARY_KEY.head_id,t,r.DATASOURCE);var l=n||null;e.setUrlParam({status:r.STATUS.browse,id:l}),l?p(e,l):(m(e),T(e))}}})},t.getCardData=p,t.cardCancel=function(e){var t=e.getUrlParam(r.PRIMARY_KEY.id);if(e.setUrlParam({status:r.STATUS.browse}),t)e.form.cancel(r.CARD.form_id),e.cardTable.resetTableData(r.CARD.table_code),p(e,t);else{var a=_(r.DATASOURCE),o=a||null;e.setUrlParam({id:o}),o?p(e,o):(m(e),T(e))}},t.cardRefresh=b,t.pageClick=function(e,t){e.setUrlParam({status:r.STATUS.browse,id:t}),p(e,t)},t.cardAttachment=function(e){var t=e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id)&&e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id).value,a=e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.bill_no)&&e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.bill_no).value;this.setState({showUploader:!this.state.showUploader,billInfo:{billId:t,billNo:a}})},t.cardBillTrack=function(e){var t=e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id)&&e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id).value;this.setState({showBillTrack:!0,billTrackBillId:t,billTrackBillType:r.BILL_TYPE_CODE})},t.cardLinkApprove=function(e){var t=e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id)&&e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id).value;this.setState({showApproveDetail:!0,billId:t})},t.cardCommit=function(e,t){var a=this;if(!t){var n=e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id)&&e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id).value,l=e.form.getFormItemsValue(r.CARD.form_id,r.FIELD.ts)&&e.form.getFormItemsValue(r.CARD.form_id,r.FIELD.ts).value,i=new Map;n&&l&&i.set(n,l),t={pks:[n],pkMapTs:i}}(0,o.ajax)({url:r.REQUEST_URL.commit,data:t,success:function(n){n.success?n.data&&n.data.workflow&&("approveflow"==n.data.workflow||"workflow"==n.data.workflow)?a.setState({compositeData:n.data,compositeDisplay:!0,curPk:t.pks}):b(e):(0,o.toast)({color:r.STATUS.warning,content:e.json["91H10520-000015"]})}})},t.cardUnCommit=function(e){var t=e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id)&&e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.head_id).value,a=e.form.getFormItemsValue(r.CARD.form_id,r.FIELD.ts)&&e.form.getFormItemsValue(r.CARD.form_id,r.FIELD.ts).value,n=new Map;t&&a&&n.set(t,a);var l={pks:[t],pkMapTs:n};(0,o.ajax)({url:r.REQUEST_URL.unCommit,data:l,success:function(t){t.success?b(e):(0,o.toast)({color:r.STATUS.warning,content:e.json["91H10520-000017"]})}})};var o=a(0),r=a(2),n=a(20),l=a(13);function i(e,t,a){return t in e?Object.defineProperty(e,t,{value:a,enumerable:!0,configurable:!0,writable:!0}):e[t]=a,e}var s=o.cardCache.updateCache,c=o.cardCache.addCache,d=o.cardCache.getNextId,u=o.cardCache.deleteCacheById,f=o.cardCache.getCacheById,_=o.cardCache.getCurrentLastId;function T(e){(0,n.buttonVisibilityControl)(e);var t=e.getUrlParam(r.STATUS.status);e.BillHeadInfo.setBillHeadInfoVisible({showBackBtn:t===r.STATUS.browse,showBillCode:t===r.STATUS.browse,billCode:e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.bill_no)&&e.form.getFormItemsValue(r.CARD.form_id,r.PRIMARY_KEY.bill_no).value}),t!==r.STATUS.add&&e.resMetaAfterPkorgEdit()}function m(e){e.form.EmptyAllFormValue(r.CARD.form_id),e.cardTable.setTableData(r.CARD.table_code,{rows:[]})}function A(e){if(e.getUrlParam("isCopy")){var t;e.form.setFormItemsValue(r.CARD.form_id,(i(t={},r.PRIMARY_KEY.head_id,{value:null,display:null}),i(t,r.PRIMARY_KEY.bill_no,{value:null,display:null}),i(t,r.FIELD.billStatus,{value:r.STATUS.NOSTATE,display:"自由"}),t)),e.cardTable.setColValue(r.CARD.table_code,r.PRIMARY_KEY.head_id,{value:null,display:null}),e.cardTable.setColValue(r.CARD.table_code,r.PRIMARY_KEY.body_id,{value:null,display:null});for(var a=e.cardTable.getNumberOfRows(r.CARD.table_code,!1),o=new Array,n=0;n<a;n++)o.push({index:n,status:"2"});e.cardTable.setRowStatusByIndexs(r.CARD.table_code,o),e.setUrlParam({id:null,isCopy:!1,status:r.STATUS.add})}}function p(e,t){var a=arguments.length>2&&void 0!==arguments[2]&&arguments[2],n=arguments[3];if(m(e),!a){var l=f(t,r.DATASOURCE);if(l)return l.head&&e.form.setAllFormValue(i({},r.CARD.form_id,l.head[r.CARD.form_id])),l.body&&e.cardTable.setTableData(r.CARD.table_code,l.body[r.CARD.table_code]),void T(e)}(0,o.ajax)({url:r.REQUEST_URL.queryCard,data:{pk:t,pagecode:r.CARD.page_code},success:function(a){var o=a.success,l=a.data;o&&(l&&l.head&&e.form.setAllFormValue(i({},r.CARD.form_id,l.head[r.CARD.form_id])),l&&l.body&&e.cardTable.setTableData(r.CARD.table_code,l.body[r.CARD.table_code]),s(r.PRIMARY_KEY.head_id,t,l,r.CARD.form_id,r.DATASOURCE),n&&n(e),T(e))},error:function(t){(0,o.toast)({color:r.STATUS.danger,content:t.message}),m(e),T(e)}})}function b(e){var t=e.getUrlParam(r.PRIMARY_KEY.id);p(e,t,!0)}},13:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.afterHeadEvent=function(e,t,a,r,n){a===o.FIELD.org&&(e.resMetaAfterPkorgEdit(),e.button.setButtonDisabled(o.CARD_ADD_DISABLED_BUTTON,!1),e.cardTable.setAllCheckboxAble(o.CARD.table_code,!0))};var o=a(2)},2:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});t.APPCODE="91H10520",t.BILL_TYPE_CODE="MYDC",t.MULTILANG={moduleId:"91H10520",domainName:"adprepare"},t.LIST={page_title:"91H10520-000011",page_code:"91H10520_LIST",search_id:"list_query",table_id:"list_head",head_btn_code:"list_head",body_btn_code:"list_inner"},t.CARD={page_title:"91H10520-000011",page_code:"91H10520_CARD",form_id:"card_head",table_code:"card_body",table_edit_code:"card_body_edit",table_browse_code:"card_body_browse",head_btn_code:"card_head",shoulder_btn_code:"tabs_head",body_btn_code:"tabs_body"};var o=t.DATASOURCE="tm.fmc.cost.datasource",r=(t.SEARCH_CACHE={key:"tm.fmc.cost.SEARCH_CACHE",dataSource:o},t.CARD_CACHE={key:"tm.fmc.cost.CARD_CACHE",dataSource:o},t.base_path="/nccloud/adprepare/promanage/",t.REQUEST_URL={save:"/nccloud/adprepare/promanage/savesatisfactionHVO.do",delete:"/nccloud/adprepare/promanage/deletesatisfactionHVO.do",queryCard:"/nccloud/adprepare/promanage/querycardsatisfactionHVO.do",queryList:"/nccloud/adprepare/promanage/querypagesatisfactionHVO.do",queryListByPks:"/nccloud/adprepare/promanage/querypagebypksatisfactionHVO.do",commit:"/nccloud/adprepare/promanage/commitsatisfactionHVO.do",unCommit:"/nccloud/adprepare/promanage/uncommitsatisfactionHVO.do",toCard:"/card",toList:"/list"},t.LIST_BUTTON={create:"AddBtn",delete:"DelBtn",commit:"CommitBtn",unCommit:"UnCommitBtn",linkGroup:"JointBtn",attachment:"AttachmentBtn",approvalLink:"DetailBtn",billTrack:"TrackBtn",print:"PrintBtn",output:"OutputBtn",refresh:"RefreshBtn",bodyUpdate:"edit",bodyDelete:"delete",bodyCommit:"commit",bodyUnCommit:"unCommit",copy:"copy"}),n=(t.LIST_DISABLED_BUTTON=[r.delete,r.commit,r.unCommit,r.linkGroup,r.approvalLink,r.billTrack,r.attachment,r.print,r.output],t.CARD_BUTTON={save:"SaveBtn",saveAdd:"SaveAddBtn",saveCommit:"SaveCommitBtn",cancel:"CancelBtn",create:"CreateBtn",update:"UpdateBtn",delete:"DeleteBtn",copy:"CopyBtn",commit:"CommitBtn",unCommit:"UnCommitBtn",attachment:"AttachmentBtn",approvalLink:"DetailBtn",billTrack:"TrackBtn",print:"PrintBtn",output:"OutputBtn",refresh:"RefreshBtn",back:"Back",addRow:"addRow",deleteRow:"deleteRow",copyRows:"copyRows",pasteTail:"pasteTail",pasteCancel:"pasteCancel",expand:"expand",insertRow:"insertRow",delRow:"delRow",copyRow:"copyRow",fold:"fold",unfold:"unfold",pasteHere:"pasteHere"});t.CARD_DISABLED_BUTTON=[n.deleteRow,n.copyRows],t.CARD_ADD_DISABLED_BUTTON=[n.addRow,n.save,n.saveAdd,n.saveCommit],t.FIELD={org:"pk_org",billStatus:"billstatus",ts:"ts"},t.PRIMARY_KEY={head_id:"pk_satisfaction_h",body_id:"pk_satisfaction_b",bill_no:"billno",id:"id"},t.STATUS={status:"status",edit:"edit",browse:"browse",add:"add",info:"info",warning:"warning",success:"success",danger:"danger",NOSTATE:"-1",NOPASS:"0",PASSING:"1",GOINGON:"2",COMMIT:"3"}},20:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.buttonVisibilityControl=function(e){var t=e.button.getButtons();if(!t||0==t.length)return;var a=e.getUrlParam(o.STATUS.status),n=e.getUrlParam(o.PRIMARY_KEY.id),l=a===o.STATUS.browse,i=e.form.getFormItemsValue(o.CARD.form_id,o.FIELD.billStatus)&&e.form.getFormItemsValue(o.CARD.form_id,o.FIELD.billStatus).value,s={},c=[],d=[o.CARD_BUTTON.save,o.CARD_BUTTON.saveAdd,o.CARD_BUTTON.saveCommit,o.CARD_BUTTON.cancel,o.CARD_BUTTON.addRow,o.CARD_BUTTON.deleteRow,o.CARD_BUTTON.copyRows,o.CARD_BUTTON.insertRow,o.CARD_BUTTON.delRow,o.CARD_BUTTON.copyRow,o.CARD_BUTTON.pasteHere,o.CARD_BUTTON.expand],u=[o.CARD_BUTTON.billTrack,o.CARD_BUTTON.approvalLink],f=t.map(function(e){return e.key}),_=[].concat(r(f),d,u,[o.CARD_BUTTON.create,o.CARD_BUTTON.update,o.CARD_BUTTON.delete,o.CARD_BUTTON.copy,o.CARD_BUTTON.output]);if(l)if(n){var T=[o.CARD_BUTTON.create,o.CARD_BUTTON.copy,o.CARD_BUTTON.attachment].concat(u,[o.CARD_BUTTON.print,o.CARD_BUTTON.output,o.CARD_BUTTON.refresh,o.CARD_BUTTON.fold,o.CARD_BUTTON.unfold]);switch(i){case o.STATUS.NOSTATE:c=[o.CARD_BUTTON.update,o.CARD_BUTTON.delete,o.CARD_BUTTON.commit].concat(r(T));break;case o.STATUS.PASSING:case o.STATUS.COMMIT:case o.STATUS.GOINGON:c=[o.CARD_BUTTON.unCommit].concat(r(T));break;default:c=[].concat(r(T))}}else c=[o.CARD_BUTTON.create];else c=d;var m=!0,A=!1,p=void 0;try{for(var b,R=_[Symbol.iterator]();!(m=(b=R.next()).done);m=!0){var C=b.value;s[C]=c.includes(C)}}catch(e){A=!0,p=e}finally{try{!m&&R.return&&R.return()}finally{if(A)throw p}}e.button.setButtonVisible(s),e.button.setButtonDisabled(o.CARD_DISABLED_BUTTON,!0),e.cardTable.setStatus(o.CARD.table_code,l?o.STATUS.browse:o.STATUS.edit),e.form.setFormStatus(o.CARD.form_id,a)};var o=a(2);function r(e){if(Array.isArray(e)){for(var t=0,a=Array(e.length);t<e.length;t++)a[t]=e[t];return a}return Array.from(e)}},21:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.bodyButtonClick=function(e,t,a,o,n){switch(t){case r.CARD_BUTTON.addRow:e.cardTable.addRow(r.CARD.table_code);break;case r.CARD_BUTTON.deleteRow:var s=e.cardTable.getCheckedRows(r.CARD.table_code),c=s&&s.map(function(e){return e.index});s.length>0&&(e.cardTable.delRowsByIndex(r.CARD.table_code,c),e.button.setButtonDisabled(r.CARD_DISABLED_BUTTON,!0));break;case r.CARD_BUTTON.expand:e.cardTable.openTabModel(r.CARD.table_code,r.STATUS.edit,o,n);break;case r.CARD_BUTTON.unfold:case r.CARD_BUTTON.fold:e.cardTable.toggleTabRowView(r.CARD.table_code,o);break;case r.CARD_BUTTON.insertRow:e.cardTable.addRow(r.CARD.table_code,n);break;case r.CARD_BUTTON.delRow:e.cardTable.delRowsByIndex(r.CARD.table_code,n);break;case r.CARD_BUTTON.copyRow:e.cardTable.pasteRow(r.CARD.table_code,n,[r.PRIMARY_KEY.body_id]);break;case r.CARD_BUTTON.copyRows:l.call(this,e,!0);break;case r.CARD_BUTTON.pasteCancel:l.call(this,e,!1);break;case r.CARD_BUTTON.pasteTail:var d=e.cardTable.getNumberOfRows(r.CARD.table_code);e.cardTable.insertRowsAfterIndex(r.CARD.table_code,i(e),d),l.call(this,e,!1),e.cardTable.selectAllRows(r.CARD.table_code,!1);break;case r.CARD_BUTTON.pasteHere:e.cardTable.insertRowsAfterIndex(r.CARD.table_code,i(e),n),l.call(this,e,!1),e.cardTable.selectAllRows(r.CARD.table_code,!1)}[r.CARD_BUTTON.unfold,r.CARD_BUTTON.fold].includes(t)||e.cardTable.setStatus(r.CARD.table_code,r.STATUS.edit)};var o=a(0),r=a(2);function n(e,t,a){return t in e?Object.defineProperty(e,t,{value:a,enumerable:!0,configurable:!0,writable:!0}):e[t]=a,e}function l(e,t){var a;e.button.setButtonVisible((n(a={},r.CARD_BUTTON.addRow,!t),n(a,r.CARD_BUTTON.deleteRow,!t),n(a,r.CARD_BUTTON.copyRows,!t),n(a,r.CARD_BUTTON.pasteTail,t),n(a,r.CARD_BUTTON.pasteCancel,t),a)),e.cardTable.setAllCheckboxAble(r.CARD.table_code,!t),this.setState({isPaste:t})}function i(e){var t=e.cardTable.getCheckedRows(r.CARD.table_code);return(0,o.deepClone)(t).map(function(e){return e.data.selected=!1,e.data.values[r.PRIMARY_KEY.head_id]&&(e.data.values[r.PRIMARY_KEY.head_id].value=null),e.data.values[r.PRIMARY_KEY.body_id]&&(e.data.values[r.PRIMARY_KEY.body_id].value=null),e.data})}},39:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o,r,n,l=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var o in a)Object.prototype.hasOwnProperty.call(a,o)&&(e[o]=a[o])}return e},i=function(){function e(e,t){for(var a=0;a<t.length;a++){var o=t[a];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(e,o.key,o)}}return function(t,a,o){return a&&e(t.prototype,a),o&&e(t,o),t}}(),s=a(5),c=(n=s)&&n.__esModule?n:{default:n},d=a(0),u=a(40),f=a(41),_=a(42),T=(a(43),a(13)),m=(a(44),a(45),a(2)),A=a(12),p=a(21);var b=d.base.NCAffix,R=(o=function(e){function t(e){!function(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(this,t);var a=function(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return r.call(a),a.state={json:{},showUploader:!1,billInfo:{},compositeData:null,compositeDisplay:!1,curPk:null,showApproveDetail:!1,billId:null},a}return function(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}(t,s.Component),i(t,[{key:"componentWillMount",value:function(){var e=this;this.props.MultiInit.getMultiLang({moduleId:m.MULTILANG.moduleId,domainName:m.MULTILANG.domainName,callback:function(t,a,o){a&&(u.initTemplate.call(e,e.props),e.setState({json:t,inlt:o}))}}),window.onbeforeunload=function(){if(e.props.cardTable.getStatus(m.CARD.table_code)==m.STATUS.edit)return e.state.json["91H10520-000007"]}}},{key:"componentDidMount",value:function(){}},{key:"render",value:function(){var e=this,t=this.props,a=t.form,o=t.cardPagination,r=t.BillHeadInfo,n=t.cardTable,i=o.createCardPagination,s=a.createForm,u=(n.createCardTable,r.createBillHeadInfo),A=d.high.NCUploader,p=d.high.BillTrack,R=d.high.ApprovalTrans,C=d.high.ApproveDetail,D=this.props.getUrlParam(m.STATUS.status),h=this.props.getUrlParam(m.PRIMARY_KEY.id),v=this.props.form.getFormItemsValue(m.CARD.page_code,m.PRIMARY_KEY.bill_no);return c.default.createElement("div",{className:"nc-bill-card"},c.default.createElement("div",{className:"nc-bill-top-area"},c.default.createElement(b,null,c.default.createElement("div",{className:"nc-bill-header-area"},c.default.createElement("div",null,u({title:this.state.json[m.CARD.page_title],billCode:v&&v.value,backBtnClick:f.buttonClick.bind(this,this.props,m.CARD_BUTTON.back)})),c.default.createElement("div",{className:"header-button-area"},this.props.button.createButtonApp({area:m.CARD.head_btn_code,onButtonClick:f.buttonClick.bind(this)})),D==m.STATUS.browse&&h&&c.default.createElement("div",{className:"header-cardPagination-area",style:{float:"right"}},i({dataSource:m.DATASOURCE,pkname:m.PRIMARY_KEY.head_id,handlePageInfoChange:this.handlePageInfoChange})))),c.default.createElement("div",{className:"nc-bill-form-area"},s(m.CARD.form_id,{onAfterEvent:T.afterHeadEvent,onBeforeEvent:_.beforeHeadEvent}))),c.default.createElement("div",{className:"nc-bill-bottom-area"}),this.state.showUploader&&c.default.createElement(A,l({placement:"bottom"},this.state.billInfo,{onHide:function(){e.setState({showUploader:!1})}})),c.default.createElement(p,{show:this.state.showBillTrack,close:function(){e.setState({showBillTrack:!1})},pk:this.state.billTrackBillId,type:this.state.billTrackBillType}),this.state.compositeDisplay&&c.default.createElement(R,{title:this.state.json["91H10520-000018"],data:this.state.compositeData,display:this.state.compositeDisplay,getResult:this.getAssignUser,cancel:this.compositeTurnOff}),c.default.createElement(C,{show:this.state.showApproveDetail,billtype:m.BILL_TYPE_CODE,billid:this.state.billId,close:function(){e.setState({showApproveDetail:!1})}}))}}]),t}(),r=function(){var e=this;this.handlePageInfoChange=function(t,a){(0,A.pageClick)(l({},t,{json:e.state.json}),a)},this.getTableHead=function(){return c.default.createElement("div",{className:"shoulder-definition-area"},c.default.createElement("div",{className:"definition-icons"},e.props.button.createButtonApp({area:m.CARD.shoulder_btn_code,onButtonClick:p.bodyButtonClick.bind(e),popContainer:document.querySelector(".header-button-area")})))},this.getAssignUser=function(t){(0,A.cardCommit)(l({},e.props,{json:e.state.json}),{pks:e.state.curPk,userObj:t}),e.compositeTurnOff()},this.compositeTurnOff=function(){e.setState({compositeData:null,compositeDisplay:!1})}},o);R=(0,d.createPage)({billinfo:{billtype:"card",pagecode:m.CARD.page_code,headcode:m.CARD.form_id,bodycode:m.CARD.table_code}})(R),t.default=R},40:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.initTemplate=function(e){var t=this;e.createUIDom({},function(a){if(a){if(a.button){var c=a.button;e.button.setButtons(c),(0,i.buttonVisibilityControl)(e)}if(a.template){var d=a.template;d=function(e,t){var a=this;t[r.CARD.form_id].items.map(function(t){t.attrcode===r.FIELD.org&&(t.queryCondition=function(){return{funcode:e.getSearchParam("c")}})});var o=!0,n=!1,i=void 0;try{for(var s,c=Object.keys(t.gridrelation)[Symbol.iterator]();!(o=(s=c.next()).done);o=!0){var d=s.value;t[d].items.push({attrcode:"opr",label:this.state.json["91H10520-000006"],itemtype:"customer",fixed:"right",className:"table-opr",visible:!0,width:200,render:function(t,o,n){var i=e.getUrlParam(r.STATUS.status),s=[];return s=i===r.STATUS.browse?[o.expandRowStatus?r.CARD_BUTTON.fold:r.CARD_BUTTON.unfold]:a.state.isPaste?[r.CARD_BUTTON.pasteHere]:[r.CARD_BUTTON.expand,r.CARD_BUTTON.insertRow,r.CARD_BUTTON.delRow,r.CARD_BUTTON.copyRow],e.button.createOprationButton(s,{area:r.CARD.body_btn_code,buttonLimit:4,onButtonClick:function(e,r){return l.bodyButtonClick.call(a,e,r,t,o,n)}})}})}}catch(e){n=!0,i=e}finally{try{!o&&c.return&&c.return()}finally{if(n)throw i}}return t}.call(t,e,d),e.meta.setMeta(d,function(){var e=t.props.getUrlParam(r.STATUS.status),a=t.props.getUrlParam(r.PRIMARY_KEY.id);e===r.STATUS.add?(0,n.cardCreate)(t.props):a&&(0,n.getCardData)(t.props,a,!1,n.copyClear)})}if(a.context&&a.context.pk_org){if(e.getUrlParam(r.STATUS.status)===r.STATUS.add){var u=a.context,f=u.pk_org,_=u.org_Name;e.form.setFormItemsValue(r.CARD.form_id,function(e,t,a){t in e?Object.defineProperty(e,t,{value:a,enumerable:!0,configurable:!0,writable:!0}):e[t]=a;return e}({},r.FIELD.org,{value:f,display:_})),(0,s.afterHeadEvent)(e,r.CARD.form_id,r.FIELD.org,{display:_,value:f},{display:null,value:null})}var T=o.cardCache.setDefData;T(r.CARD_CACHE.key,r.CARD_CACHE.dataSource,a.context)}}})};var o=a(0),r=a(2),n=a(12),l=a(21),i=a(20),s=a(13)},41:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var o in a)Object.prototype.hasOwnProperty.call(a,o)&&(e[o]=a[o])}return e};t.buttonClick=function(e,t,a,i){var s=this;switch(t){case n.CARD_BUTTON.back:(0,l.cardBack)(e);break;case n.CARD_BUTTON.create:(0,l.cardCreate)(e);break;case n.CARD_BUTTON.save:(0,l.cardSave)(o({},e,{json:this.state.json})).then(function(){i&&e.cardTable.closeModel(n.CARD.table_code)});break;case n.CARD_BUTTON.saveAdd:(0,l.cardSave)(o({},e,{json:this.state.json})).then(function(t){t&&(0,l.cardCreate)(e)});break;case n.CARD_BUTTON.saveCommit:(0,l.cardSave)(o({},e,{json:this.state.json})).then(function(t){t&&l.cardCommit.call(s,o({},e,{json:s.state.json}))});break;case n.CARD_BUTTON.update:(0,l.cardUpdate)(e);break;case n.CARD_BUTTON.copy:(0,l.cardCopy)(e);break;case n.CARD_BUTTON.delete:(0,r.promptBox)({color:n.STATUS.warning,title:this.state.json["91H10520-000000"],content:this.state.json["91H10520-000001"],beSureBtnClick:function(){(0,l.cardDelete)(o({},e,{json:s.state.json}))}});break;case n.CARD_BUTTON.cancel:(0,r.promptBox)({color:n.STATUS.warning,title:this.state.json["91H10520-000002"],content:this.state.json["91H10520-000003"],beSureBtnClick:function(){(0,l.cardCancel)(o({},e,{json:s.state.json}))}});break;case n.CARD_BUTTON.refresh:(0,l.cardRefresh)(o({},e,{json:this.state.json}));break;case n.CARD_BUTTON.attachment:l.cardAttachment.call(this,e);break;case n.CARD_BUTTON.billTrack:l.cardBillTrack.call(this,e);break;case n.CARD_BUTTON.approvalLink:l.cardLinkApprove.call(this,e);break;case n.CARD_BUTTON.commit:l.cardCommit.call(this,o({},e,{json:this.state.json}));break;case n.CARD_BUTTON.unCommit:(0,l.cardUnCommit)(o({},e,{json:this.state.json}))}};var r=a(0),n=a(2),l=a(12)},42:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.beforeHeadEvent=function(e,t,a,o,r){return!0}},43:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.beforeTableEvent=function(e,t,a,o,r,n,l){return!0}},44:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.afterTableEvent=function(e,t,a,o,r,n,l,i,s){}},45:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.bodySelectedEvent=function(e,t,a,r,n){e.cardTable.getCheckedRows(o.CARD.table_code).length>0?e.button.setButtonDisabled(o.CARD_DISABLED_BUTTON,!1):e.button.setButtonDisabled(o.CARD_DISABLED_BUTTON,!0)},t.bodySelectedAllEvent=function(e,t,a,r){e.button.setButtonDisabled(o.CARD_DISABLED_BUTTON,!(a&&r>0))};var o=a(2)},5:function(e,a){e.exports=t},84:function(e,t,a){e.exports=a(39)}})});