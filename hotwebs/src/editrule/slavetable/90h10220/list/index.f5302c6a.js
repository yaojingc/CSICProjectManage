!function(e,t){"object"==typeof exports&&"object"==typeof module?module.exports=t(require("nc-lightapp-front"),require("react")):"function"==typeof define&&define.amd?define(["nc-lightapp-front","react"],t):"object"==typeof exports?exports["editrule/slavetable/90h10220/list/index"]=t(require("nc-lightapp-front"),require("react")):e["editrule/slavetable/90h10220/list/index"]=t(e["nc-lightapp-front"],e.React)}(window,function(e,t){return function(e){var t={};function a(o){if(t[o])return t[o].exports;var n=t[o]={i:o,l:!1,exports:{}};return e[o].call(n.exports,n,n.exports,a),n.l=!0,n.exports}return a.m=e,a.c=t,a.d=function(e,t,o){a.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:o})},a.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},a.t=function(e,t){if(1&t&&(e=a(e)),8&t)return e;if(4&t&&"object"==typeof e&&e&&e.__esModule)return e;var o=Object.create(null);if(a.r(o),Object.defineProperty(o,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var n in e)a.d(o,n,function(t){return e[t]}.bind(null,n));return o},a.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return a.d(t,"a",t),t},a.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},a.p="../../../../",a(a.s=192)}({0:function(t,a){t.exports=e},1:function(e,a){e.exports=t},101:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o,n,r,c=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var o in a)Object.prototype.hasOwnProperty.call(a,o)&&(e[o]=a[o])}return e},i=function(){function e(e,t){for(var a=0;a<t.length;a++){var o=t[a];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(e,o.key,o)}}return function(t,a,o){return a&&e(t.prototype,a),o&&e(t,o),t}}(),l=a(1),s=(r=l)&&r.__esModule?r:{default:r},d=a(0),u=a(102),f=a(104),b=a(105),p=a(5),_=a(16);function h(e,t,a){return t in e?Object.defineProperty(e,t,{value:a,enumerable:!0,configurable:!0,writable:!0}):e[t]=a,e}var T=(o=function(e){function t(e){!function(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(this,t);var a=function(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return n.call(a),a.state={json:{}},a}return function(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}(t,l.Component),i(t,[{key:"componentWillMount",value:function(){var e=this;this.props.MultiInit.getMultiLang({moduleId:p.MULTILANG.moduleId,domainName:p.MULTILANG.domainName,callback:function(t,a,o){a&&((0,u.initTemplate)(e.props,t),e.setState({json:t,inlt:o}))}})}},{key:"componentDidMount",value:function(){var e,t;(0,d.cardCache.getDefData)(p.SEARCHCACHE.key,p.SEARCHCACHE.dataSource)?this.props.button.setDisabled((h(e={},p.LIST_BUTTON.delete,!0),h(e,p.LIST_BUTTON.refresh,!1),e)):this.props.button.setDisabled((h(t={},p.LIST_BUTTON.delete,!0),h(t,p.LIST_BUTTON.refresh,!0),t))}},{key:"render",value:function(){var e=this.props,t=e.table,a=e.search,o=t.createSimpleTable,n=a.NCCreateSearch;return s.default.createElement("div",{className:"nc-bill-list"},s.default.createElement("div",{className:"nc-bill-header-area"},s.default.createElement("div",{className:"header-title-search-area"},(0,d.createPageIcon)(),s.default.createElement("h2",{className:"title-search-detail"},this.state.json[p.LIST.page_title])),s.default.createElement("div",{className:"header-button-area"},this.props.button.createButtonApp({area:p.LIST.head_btn_code,onButtonClick:this.onButtonClick}))),s.default.createElement("div",{className:"nc-bill-search-area"},n(p.LIST.search_id,{dataSource:p.SEARCHCACHE.dataSource,clickSearchBtn:this.clickSearchBtn})),s.default.createElement("div",{className:"table-area"},o(p.LIST.table_id,{showCheck:!0,dataSource:p.SEARCHCACHE.dataSource,pkname:p.PRIMARTKEY.head_id,handlePageInfoChange:this.handlePageInfoChange,onRowDoubleClick:this.onRowDoubleClick})))}}]),t}(),n=function(){var e=this;this.handlePageInfoChange=function(t,a,o){(0,_.pageInfoClick)(c({},t,{json:e.state.json}),a,o)},this.onRowDoubleClick=function(t,a,o){(0,_.handleDoubleClick)(t,a,c({},o,{json:e.state.json}))},this.clickSearchBtn=function(t){(0,b.searchBtnClick)(c({},t,{json:e.state.json}))},this.onButtonClick=function(t,a){(0,f.buttonClick)(c({},t,{json:e.state.json}),a)}},o);T=(0,d.createPage)({})(T),t.default=T},102:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var o in a)Object.prototype.hasOwnProperty.call(a,o)&&(e[o]=a[o])}return e};t.initTemplate=function(e,t){e.createUIDom({pagecode:n.LIST.page_code,appcode:n.APPCODE},function(a){if(a){if(a.button){var c=a.button;e.button.setButtons(c),e.button.setPopContent(n.LIST_BUTTON.bodyDelete,t["90H10220-000008"])}if(a.template){var i=a.template;i=function(e,t,a){return t[n.LIST.search_id].items.map(function(t){"pk_org"===t.attrcode&&(t.isMultiSelectedEnabled=!0,t.queryCondition=function(){return{funcode:e.getSearchParam("c")}})}),t[n.LIST.table_id].pagination=!0,t[n.LIST.table_id].items=t[n.LIST.table_id].items.map(function(t,a){return t.attrcode==n.PRIMARTKEY.bill_no&&(t.render=function(t,a,o){return React.createElement("a",{style:{cursor:"pointer"},onClick:function(){e.pushTo(n.REQUESTURL.toCard,{status:"browse",id:a[n.PRIMARTKEY.head_id].value,pagecode:n.CARD.page_code})}},a[n.PRIMARTKEY.bill_no]&&a[n.PRIMARTKEY.bill_no].value)}),t}),t[n.LIST.table_id].items.push({itemtype:"customer",attrcode:"opr",label:a["90H10220-000006"],width:"160px",fixed:"right",className:"table-opr",visible:!0,render:function(t,c,i){var l;return l=["edit","delete"],e.button.createOprationButton(l,{area:n.LIST.body_btn_code,buttonLimit:3,onButtonClick:function(e,n){return(0,r.bodyButtonClick)(o({},e,{json:a}),n,t,c,i)}})}}),t}(e,i,t),e.meta.setMeta(i)}}})};var n=a(5),r=a(103)},103:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.bodyButtonClick=function(e,t,a,r,c){var i=r[o.PRIMARTKEY.head_id]&&r[o.PRIMARTKEY.head_id].value;switch(t){case o.LIST_BUTTON.bodyUpdate:(0,n.listEdit)(e,i);break;case o.LIST_BUTTON.bodyDelete:(0,n.listDelete)(e,i,c)}};var o=a(5),n=a(16)},104:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.buttonClick=function(e,t,a,r,c){switch(t){case n.LIST_BUTTON.create:(0,o.listCreate)(e);break;case n.LIST_BUTTON.refresh:(0,o.listRefresh)(e)}};var o=a(16),n=a(5)},105:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.searchBtnClick=function(e){(0,o.listSearch)(e)};var o=a(16)},16:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.listCreate=function(e){e.pushTo(n.REQUESTURL.toCard,{status:"add",pagecode:n.CARD.page_code})},t.listRefresh=function(e){var t=(0,o.cardCache.getDefData)(n.SEARCHCACHE.key,n.SEARCHCACHE.dataSource);r(e,t)},t.listEdit=function(e,t){e.pushTo(n.REQUESTURL.toCard,{status:"edit",id:t,pagecode:n.CARD.page_code})},t.listDelete=function(e,t,a){(0,o.ajax)({url:n.REQUESTURL.delete,data:{pks:[t]},success:function(r){r.success?(e.table.deleteCacheId(n.LIST.table_id,t),e.table.deleteTableRowsByIndex(n.LIST.table_id,a),(0,o.toast)({color:"success",content:e.json["90H10220-000005"]})):(0,o.toast)({color:"warning",content:e.json["90H10220-000009"]})}})},t.listSearch=r,t.pageInfoClick=function(e,t,a){var r={pks:a,pagecode:n.LIST.page_code};(0,o.ajax)({url:n.REQUESTURL.queryListByPks,data:r,success:function(t){var a=t.success,r=t.data;a&&r&&r[n.LIST.table_id]?(e.table.setAllTableData(n.LIST.table_id,r[n.LIST.table_id]),(0,o.toast)({color:"success"})):(e.table.setAllTableData(n.LIST.table_id,{rows:[]}),(0,o.toast)({color:"warning",content:e.json["90H10220-000010"]}))}})},t.handleDoubleClick=function(e,t,a){a.pushTo(n.REQUESTURL.toCard,{status:"browse",id:e[n.PRIMARTKEY.head_id].value,pagecode:n.CARD.page_code,scene:a.getUrlParam("scene")})};var o=a(0),n=a(5);function r(e,t){var a,r,c,i=e.table.getTablePageInfo(n.LIST.table_id);t||(t=e.search.getQueryInfo(n.LIST.search_id)),t.pageInfo=i,t.pageCode=n.LIST.page_code,e.button.setDisabled((a={},r=n.LIST_BUTTON.refresh,c=!1,r in a?Object.defineProperty(a,r,{value:c,enumerable:!0,configurable:!0,writable:!0}):a[r]=c,a)),(0,o.ajax)({url:n.REQUESTURL.queryList,data:t,success:function(a){var r=a.success,c=a.data;a.formulamsg&&a.formulamsg instanceof Array&&a.formulamsg.length>0&&e.dealFormulamsg(a.formulamsg),r&&c&&c[n.LIST.table_id]?(e.table.setAllTableData(n.LIST.table_id,c[n.LIST.table_id]),(0,o.toast)({color:"success"})):(e.table.setAllTableData(n.LIST.table_id,{rows:[]}),(0,o.toast)({color:"warning",content:e.json["90H10220-000010"]})),(0,o.cardCache.setDefData)(n.SEARCHCACHE.key,n.SEARCHCACHE.dataSource,t)}})}},192:function(e,t,a){e.exports=a(101)},5:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});t.APPCODE="90H10220",t.MULTILANG={moduleId:"90H10220",domainName:"editrule"},t.LIST={page_title:"90H10220-000011",page_code:"90H10220_LIST",search_id:"list_query",table_id:"list_head",head_btn_code:"list_head",body_btn_code:"list_inner"},t.PRIMARTKEY={head_id:"pk_mascreg",body_id:"pk_mascreg_b",bill_no:""},t.CARD={page_title:"90H10220-000011",page_code:"90H10220_CARD",form_id:"card_head",table_code:"card_body",table_edit_code:"card_body_edit",table_browse_code:"card_body_browse",head_btn_code:"card_head",shoulder_btn_code:"tabs_head",body_btn_code:"tabs_body"};var o=t.DATASOURCE="tm.fmc.cost.datasource",n=(t.SEARCHCACHE={key:"tm.fmc.cost.searchCache",dataSource:o},t.base_path="/nccloud/editrule/slavetable90h10220");t.REQUESTURL={save:n+"/save.do",delete:n+"/delete.do",queryCard:n+"/querycard.do",queryList:n+"/querypage.do",queryListByPks:n+"/querypagebypk.do",toCard:"/card",toList:"/list"},t.LIST_BUTTON={create:"AddBtn",bodyUpdate:"edit",bodyDelete:"delete",refresh:"RefreshBtn"},t.CARD_BUTTON={save:"SaveBtn",saveAdd:"SaveAddBtn",cancel:"CancelBtn",create:"CreateBtn",update:"UpdateBtn",delete:"DeleteBtn",refresh:"RefreshBtn",back:"Back",expand:"expand",fold:"fold",unfold:"unfold",insertRow:"insertRow",delRow:"delRow",addRow:"addRow",deleteRow:"deleteRow"}}})});