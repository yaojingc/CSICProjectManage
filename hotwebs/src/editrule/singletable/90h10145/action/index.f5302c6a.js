!function(t,e){"object"==typeof exports&&"object"==typeof module?module.exports=e(require("nc-lightapp-front")):"function"==typeof define&&define.amd?define(["nc-lightapp-front"],e):"object"==typeof exports?exports["editrule/singletable/90h10145/action/index"]=e(require("nc-lightapp-front")):t["editrule/singletable/90h10145/action/index"]=e(t["nc-lightapp-front"])}(window,function(t){return function(t){var e={};function a(s){if(e[s])return e[s].exports;var o=e[s]={i:s,l:!1,exports:{}};return t[s].call(o.exports,o,o.exports,a),o.l=!0,o.exports}return a.m=t,a.c=e,a.d=function(t,e,s){a.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:s})},a.r=function(t){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},a.t=function(t,e){if(1&e&&(t=a(t)),8&e)return t;if(4&e&&"object"==typeof t&&t&&t.__esModule)return t;var s=Object.create(null);if(a.r(s),Object.defineProperty(s,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var o in t)a.d(s,o,function(e){return t[e]}.bind(null,o));return s},a.n=function(t){var e=t&&t.__esModule?function(){return t.default}:function(){return t};return a.d(e,"a",e),e},a.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},a.p="../../../../",a(a.s=166)}({0:function(e,a){e.exports=t},166:function(t,e,a){t.exports=a(56)},56:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.initTemplate=function(t,e){var a=this;t.createUIDom({pagecode:r},function(o){if(o){if(o.template){var i=o.template;i=function(t,e){var a=this;return e[n].showindex=!0,e[n].status="browse",e[n].pagination=!1,e[n].items.push({attrcode:"opr",label:this.state.json["90H10145-000001"],width:200,fixed:"right",className:"table-opr",itemtype:"customer",visible:!0,render:function(e,o,i){var l=function(t){return"browse"===t.editTable.getStatus(n)?["EditLine","DelLine"]:["Spread","DelLine"]}(t);return t.button.createOprationButton(l,{area:"table-opr-area",buttonLimit:3,onButtonClick:function(t,l){return function(t,e,a,o,i){var l=this;switch(e){case"DelLine":var u=t.editTable.getStatus(n);if("browse"==u||null==u){var d={status:"3",values:o.values},p={pageid:r,model:{areaType:"table",rows:[d]}};(0,s.ajax)({url:c.saveUrl,data:p,success:function(e){if(e.success){(0,s.toast)({color:"success",title:l.state.json["pk_lang-000002"]}),t.editTable.deleteTableRowsByIndex(n,i);var a=t.editTable.getAllData(n);!function(t){for(var e=t.length-1;e>=0;e--)"3"===t[e].status&&t.splice(e,1)}(a.rows),t.editTable.setTableData(n,a),b.call(l,t)}else alert(e.message)}})}else t.editTable.deleteTableRowsByIndex(n,i);break;case"EditLine":t.editTable.setStatus(n,"edit"),t.button.setMainButton("Add",!1),t.editTable.openModel(n,"edit",o,i);break;case"Spread":t.editTable.setStatus(n,"edit"),t.editTable.openModel(n,"edit",o,i);break;default:console.log(e,i)}}.call(a,t,l,e,o,i)}})}}),e}.call(a,t,i),t.meta.setMeta(i)}if(o.button){var l=o.button;t.button.setButtons(l),t.button.setButtonDisabled({Delete:!0}),t.button.setButtonDisabled({Edit:!0}),t.button.setPopContent("DelLine",a.state.json["90H10145-000019"])}}e()})},e.onloaddata=function(){this.props.button.setButtonsVisible({Save:!1,Cancel:!1});var t={querycondition:{},pageInfo:this.props.editTable.getTablePageInfo(n),pagecode:r,queryAreaCode:i,oid:this.props.meta.getMeta()[i].oid,querytype:"tree"};g.call(this,!1,t)},e.onClickButton=function(t,e){var a=this,l=t.editTable.getCheckedRows(n),u=t.editTable.getTablePageInfo(n),b=this.state.hasSearched&&1==this.state.hasSearched?t.search.getAllSearchData(i,!1):null,v=this.props.meta.getMeta()[i].oid,T={pageInfo:u,querycondition:null==b?{}:b,pagecode:r,queryAreaCode:i,oid:v,querytype:"tree"};switch(e){case"Add":t.editTable.setStatus(n,"edit");var w=this.props.editTable.getNumberOfRows(n);t.editTable.addRow(n,w,!0),t.button.setButtonsVisible("Edit",!1),t.button.setMainButton("Add",!1);break;case"Cancel":(0,s.promptBox)({color:"warning",title:this.state.json["90H10145-000006"],content:this.state.json["90H10145-000007"],beSureBtnClick:function(){t.editTable.cancelEdit(n),t.editTable.setStatus(n,"browse"),t.button.setButtonDisabled("Edit",!0),t.button.setMainButton("Add",!0),t.button.setButtonDisabled("Delete",!0),p.call(a)}});break;case"Edit":t.editTable.setStatus(n,"edit"),t.button.setButtonsVisible("Edit",!1),t.button.setMainButton("Add",!1);break;case"Save":t.editTable.filterEmptyRows(n,d);var y=t.editTable.getAllData(n);if(!y||0===y.length)return t.editTable.cancelEdit(n),t.editTable.setStatus(n,"browse"),t.button.setButtonsVisible("Edit",!0),t.button.setMainButton("Add",!0),void p.call(this);if(!t.editTable.checkRequired(n,y.rows))return;t.editTable.setStatus(n,"browse");var m={pageid:r,model:{pageInfo:u,rows:y.rows,areaType:"table",areacode:"head"}};this.props.validateToSave(m,function(){(0,s.ajax)({url:c.saveUrl,data:m,success:function(e){if(this.props.editTable.setStatus(n,"browse"),e.data){var a=this.props.editTable.getAllData(n);!function(t,e){if(!e)return;t.rows&&t.rows.forEach(function(a,s){e.forEach(function(e,o){e.rowid===a.rowid&&(t.rows[s]=e)})})}(a,e.data[n].rows),this.props.editTable.setTableData(n,a),(0,s.toast)({color:"success",title:this.state.json["90H10145-000008"]})}t.button.setButtonDisabled("Edit",!0),t.button.setMainButton("Add",!0),t.button.setButtonDisabled("Delete",!0),p.call(this)}.bind(a)})},o({},n,"editTable"),"grid");break;case"Delete":if(0!=l.length)if(t.editTable.getStatus(n)&&"edit"==t.editTable.getStatus(n)){var S=l.map(function(t){return t.index});t.editTable.deleteTableRowsByIndex(n,S)}else{var D=l.map(function(t){return{status:"3",values:t.data.values}}),B={pageid:r,model:{areaType:"table",pageInfo:u,rows:D}};(0,s.promptBox)({color:"warning",title:this.state.json["90H10145-000009"],content:this.state.json["90H10145-000010"],beSureBtnClick:f.bind(this,B,T)})}else(0,s.promptBox)({color:"warning",title:this.state.json["90H10145-000011"],content:this.state.json["90H10145-000012"]});break;case"PrintGrp":case"Print":h.call(this);break;case"Output":(function(){var t=this.props.editTable.getAllData(n);if(0===t.length)return void(0,s.toast)({content:this.state.json["90H10145-000014"],color:"warning"});var e=[];t.rows.forEach(function(t,a){e.push(t.values.true.value)}),this.setState({ids:e},this.refs.printOutput.open())}).call(this);break;case"Refresh":g.call(this,!1,T),(0,s.toast)({title:this.state.json["90H10145-000020"],color:"success"})}},e.onSelected=function(){var t=this.props.editTable.getCheckedRows(n),e=!(t&&t.length>0);this.props.button.setButtonDisabled(["Delete"],e),this.props.button.setButtonDisabled(["Edit"],e),this.setState(this.state)},e.gridBeChecked=b,e.gridStatusChange=p,e.onClickPageInfo=function(t,e,a){var s=t.editTable.getTablePageInfo(n),o=t.search.getAllSearchData(i),r={pks:a,pageInfo:s,querycondition:o};g.call(this,!1,r,"pageQueryUrl")},e.onClickSearchBtn=function(t,e){t.editTable.getStatus()&&"edit"==t.editTable.getStatus()&&(0,s.promptBox)({color:"warning",title:this.state.json["90H10145-000011"],content:this.state.json["90H10145-000015"]});var a=this.props.meta.getMeta()[i].oid,o={querycondition:null==e?{}:e,pageInfo:t.editTable.getTablePageInfo(n),pagecode:r,queryAreaCode:i,oid:a,querytype:"tree"};g.call(this,!0,o)};var s=a(0);function o(t,e,a){return e in t?Object.defineProperty(t,e,{value:a,enumerable:!0,configurable:!0,writable:!0}):t[e]=a,t}var n="head",i="search",r="90H10145_spottestVO",l="90H10145",u=null,d=["iseucountry"],c={queryUrl:"/nccloud/editrule/spottestVO/SpottestVOQuery.do",pageQueryUrl:"/nccloud/editrule/spottestVO/SpottestVOQueryPageGridByPks.do",saveUrl:"/nccloud/editrule/spottestVO/SpottestVOSave.do",printUrl:"/nccloud/editrule/spottestVO/SpottestVOPrint.do"};function b(t){var e=t.editTable.getCheckedRows(n).length;t.button.setDisabled({btnDel:0===e})}function p(){var t=this.props.editTable.getStatus(n);this.props.button.setButtonsVisible({Save:"browse"!==t,Cancel:"browse"!==t,Add:"browse"===t,Edit:"browse"===t,Delete:"browse"===t,Refresh:"browse"===t,PrintGrp:"browse"===t,Output:"browse"===t}),this.props.button.setPopContent("DelLine","browse"===t?this.state.json["90H10145-000000"]:"")}function f(t,e){var a=this;(0,s.ajax)({url:c.saveUrl,data:t,success:function(t){t.success?(a.props.button.setButtonDisabled(["Delete"],!0),g.call(a,!1,e),(0,s.toast)({color:"success",title:a.state.json["90H10145-000002"]})):alert(t.message)}})}function h(){var t=this.props.editTable.getAllData(n);if(0!==t.length){var e=[];t.rows.forEach(function(t,a){e.push(t.values.pk_country.value)}),(0,s.print)("pdf",c.printUrl,{funcode:l,nodekey:u,oids:e})}else(0,s.toast)({content:this.state.json["90H10145-000013"],color:"warning"})}function g(t,e,a){var i=this,r=this,l=null==a?"queryUrl":a;(0,s.ajax)({url:c[l],data:e,success:function(e){var a=e.success,l=e.data;if(a){if(e.formulamsg&&e.formulamsg instanceof Array&&e.formulamsg.length>0&&r.props.dealFormulamsg(e.formulamsg,o({},n,"table")),e.hasOwnProperty("data")&&null!=l)r.props.editTable.setTableData(n,l[n]),r.props.button.setButtonDisabled({PrintGrp:!1,Output:!1,Delete:!0,Edit:!0});else{r.props.editTable.setTableData(n,{rows:[]}),r.props.button.setButtonDisabled({PrintGrp:!0,Output:!0,Delete:!0,Edit:!0})}r.props.editTable.setStatus("browse"),!0===t&&(0,s.toast)({color:"success",content:i.state.json["90H10145-000003"]+l[n].allpks.length+i.state.json["90H10145-000004"]}),i.setState({hasSearched:!0})}},error:function(e){!0===t&&(0,s.toast)({color:"warning",content:i.state.json["90H10145-000005"]})}})}}})});