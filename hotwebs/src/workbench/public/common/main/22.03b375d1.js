(window.webpackJsonp=window.webpackJsonp||[]).push([[22],{1013:function(e,t,a){e.exports=a.p+"images/placeholderNew.png"},1290:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=N(a(926)),r=N(a(427)),o=N(a(139)),l=N(a(111)),i=N(a(2)),u=N(a(137)),s=N(a(65)),c=N(a(13)),f=N(a(4)),d=N(a(7)),p=N(a(3)),m=N(a(5));a(927);var g=a(1),h=N(g),v=a(28),C=a(18),y=N(a(958)),b=N(a(1291)),k=N(a(1292)),T=N(a(1294)),E=N(a(26)),I=N(a(54)),_=N(a(1013));function N(e){return e&&e.__esModule?e:{default:e}}var O=N(a(32)).default.base,P=O.NCDiv,D=O.NCButton,S=function(e){function t(e){(0,f.default)(this,t);var a=(0,p.default)(this,(t.__proto__||(0,c.default)(t)).call(this,e));return a.handdleRefChange=function(e,t){var n=a.props.json,r=(0,C.deepClone)(a.state),o={};if("itemTypeInfo"==t){0==r.submitDate.filter(function(t){return t.itemTypeInfo.refname==e.refname}).length?(o.submitDate=r.submitDate.concat({itemTypeInfo:{refname:e.refcode,showname:e.refname},agentInfo:[]}),o.curItemType=e.refcode):(0,I.default)({status:"warning",msg:(0,C.langCheck)("Customize-000000","pages",n)})}else{var l=r.submitDate;l.map(function(t,r){if(t.itemTypeInfo.refname==a.state.curItemType){var o=[],l=!0,i=!1,c=void 0;try{for(var f,d=(0,u.default)(e);!(l=(f=d.next()).done);l=!0){var p=f.value,m={refcode:p.refcode,refpk:p.refpk,refname:p.refname};o.push(m)}}catch(e){i=!0,c=e}finally{try{!l&&d.return&&d.return()}finally{if(i)throw c}}t.agentInfo=t.agentInfo.concat(o),(0,s.default)(t.agentInfo)!==(0,s.default)((0,C.arrayUnique)(t.agentInfo,"refcode"))&&((0,I.default)({status:"warning",msg:(0,C.langCheck)("Customize-000001","pages",n)}),t.agentInfo=(0,C.arrayUnique)(t.agentInfo,"refcode"))}}),o.submitDate=l}a.setState((0,i.default)({},o),function(){return a.DataCheck()})},a.DataCheck=function(e){var t=(0,s.default)(a.historyData)==(0,s.default)(a.state.submitDate),n=(0,C.deepClone)(a.state.realSubmit);t||e||(n=n.concat(a.state.curItemType)),a.setState({disabled:t,realSubmit:n})},a.deleteEvent=function(e,t){var n=(0,C.deepClone)(a.state),r={};if("itemTypeInfo"==t)r.submitDate=n.submitDate.filter(function(t,a){return e.itemTypeInfo.refname!=t.itemTypeInfo.refname||(console.log(n.submitDate[a-1].itemTypeInfo.refname),r.curItemType=n.submitDate[a-1].itemTypeInfo.refname,r.realSubmit=n.realSubmit,r.realSubmit=r.realSubmit.concat(t.itemTypeInfo.refname),!1)});else{var o=n.submitDate;o.map(function(t,n){t.itemTypeInfo.refname==a.state.curItemType&&(t.agentInfo=t.agentInfo.filter(function(t){return e.refcode!=t.refcode}))}),r.submitDate=o}a.setState((0,i.default)({},r),function(){"itemTypeInfo"==t?a.DataCheck(!0):a.DataCheck()})},a.toggleEvent=function(e){a.setState({curItemType:e})},a.getAllData=function(){for(var e=(0,l.default)(new o.default(a.state.realSubmit)),t=[],n=a.props.json,i=0;i<e.length;i++){var s=!0,c=!0,f=!1,d=void 0;try{for(var p,m=(0,u.default)(a.state.submitDate);!(c=(p=m.next()).done);c=!0){var g=p.value;if(e[i]==g.itemTypeInfo.refname){var h,v=[];if(g.agentInfo){var y=!0,b=!1,k=void 0;try{for(var T,_=(0,u.default)(g.agentInfo.entries());!(y=(T=_.next()).done);y=!0){var N=T.value,O=(0,r.default)(N,2),P=O[0],D=O[1],S={pk_cuserid:a.props.userId,userCode:D.refcode,pk_workflow:D.refpk,userName:D.refname,billtypes:g.itemTypeInfo.refname,sysindex:P+1};v.push(S)}}catch(e){b=!0,k=e}finally{try{!y&&_.return&&_.return()}finally{if(b)throw k}}}h={billname:g.itemTypeInfo.refname,workflowagentVOs:v},t.push(h),s=!1;break}}}catch(e){f=!0,d=e}finally{try{!c&&m.return&&m.return()}finally{if(f)throw d}}s&&t.push({billname:e[i],workflowagentVOs:[]})}(0,E.default)({url:"/nccloud/platform/agent/saveagentinfo.do",data:{userAgentsVOs:t},info:{name:(0,C.langCheck)("Customize-000002","pages",n),action:(0,C.langCheck)("Customize-000003","pages",n)},success:function(e){e.data.data&&((0,I.default)({status:"success",msg:(0,C.langCheck)("Customize-000044","pages",n)}),a.setState({disabled:!0}))}})},a.state={submitDate:[{itemTypeInfo:{refname:"ALL"},agentInfo:[]}],curItemType:"ALL",disabled:!0,realSubmit:[]},a.historyData=(0,C.deepClone)(a.state.submitDate),a}return(0,m.default)(t,e),(0,d.default)(t,[{key:"getRealDate",value:function(e,t){for(var a=[{itemTypeInfo:{refname:"ALL"},agentInfo:[]}],n=function(n){var r=a.filter(function(a){return a.itemTypeInfo.refname==(e[n].vo&&e[n].vo[t])});if(r.length>0){var o={refcode:e[n].vo&&e[n].vo.userCode,refpk:e[n].vo&&e[n].vo.pk_workflow,refname:e[n].vo&&e[n].vo.userName};r[0].agentInfo.push(o)}else if(e[n].vo&&e[n].vo.billtypes){var l={itemTypeInfo:{refname:e[n].vo&&e[n].vo.billtypes,showname:e[n].name},agentInfo:[{refcode:e[n].vo&&e[n].vo.userCode,refpk:e[n].vo&&e[n].vo.pk_workflow,refname:e[n].vo&&e[n].vo.userName}]};a.push(l)}},r=0;r<e.length;r++)n(r);return a}},{key:"componentDidMount",value:function(){var e=this,t=this.props.json;(0,E.default)({url:"/nccloud/platform/agent/queryagentsofuser.do",info:{name:(0,C.langCheck)("Customize-000004","pages",t),action:(0,C.langCheck)("Customize-000005","pages",t)},success:function(t){var a=t.data.data;if(a.length>0){var n=e.getRealDate(a,"billtypes");console.log(a),e.setState({submitDate:n,curItemType:n[0].itemTypeInfo.refname},function(){e.historyData=(0,C.deepClone)(e.state.submitDate)})}}})}},{key:"render",value:function(){var e=this,t=this.state.disabled,a=this.props.json,r=[],o=!0,l=!1,i=void 0;try{for(var s,c=(0,u.default)(this.state.submitDate);!(o=(s=c.next()).done);o=!0){var f=s.value;f.itemTypeInfo.refname==this.state.curItemType&&(r=f.agentInfo)}}catch(e){l=!0,i=e}finally{try{!o&&c.return&&c.return()}finally{if(l)throw i}}return h.default.createElement(y.default,{title:this.props.title},h.default.createElement("div",{className:"agentSetting workbench-auto-scroll"},h.default.createElement("div",{className:"customizeContent"},h.default.createElement(P,{className:"agent-container",fieldid:"container",areaCode:P.config.Area},h.default.createElement(P,{className:"agent-container-left",fieldid:"left",areaCode:P.config.Area},h.default.createElement("div",{className:"agent-container-top"},h.default.createElement("div",{className:"agent-container-div"},(0,C.langCheck)("Customize-000011","pages",a)),h.default.createElement("div",{className:"agent-container-div"},h.default.createElement(b.default,{value:"",placeholder:(0,C.langCheck)("Customize-000006","pages",a),onChange:function(t){e.handdleRefChange(t,"itemTypeInfo")},clickContainer:h.default.createElement(D,{className:"ant-btn ant-btn-primary",colors:"primary",fieldid:"add"},(0,C.langCheck)("Customize-000012","pages",a))}))),h.default.createElement("div",{onClick:function(){e.toggleEvent("ALL")},className:"ALL"==this.state.curItemType?"agent-container-All activeList":"agent-container-All"},"ALL"),h.default.createElement("div",{className:"agent-container-itemType"},this.state.submitDate.map(function(t,r){return"ALL"==t.itemTypeInfo.refname?void 0:h.default.createElement("ul",{onClick:function(){e.toggleEvent(t.itemTypeInfo.refname)},className:t.itemTypeInfo.refname==e.state.curItemType?"activeList":""},h.default.createElement("li",{className:"agent-container-div"},t.itemTypeInfo.showname),h.default.createElement("li",{className:"agent-container-div"},h.default.createElement(n.default,{title:(0,C.langCheck)("Customize-000007","pages",a),cancelText:(0,C.langCheck)("Customize-000008","pages",a),okText:(0,C.langCheck)("Customize-000009","pages",a),onConfirm:function(a){a.stopPropagation(),e.deleteEvent(t,"itemTypeInfo")}},h.default.createElement("a",{className:"agent-container-button"},(0,C.langCheck)("Customize-000013","pages",a)))))}))),h.default.createElement(P,{className:"agent-container-right",fieldid:"right",areaCode:P.config.Area},h.default.createElement("div",{className:"agent-container-top"},h.default.createElement("div",{className:"agent-container-div"},(0,C.langCheck)("Customize-000014","pages",a)),h.default.createElement("div",{className:"agent-container-div"},h.default.createElement(k.default,{value:"",placeholder:(0,C.langCheck)("Customize-000010","pages",a),onChange:function(t){e.handdleRefChange(t,"agentInfo")},clickContainer:h.default.createElement(D,{className:"agent-container-button",fieldid:"agentAdd"},(0,C.langCheck)("Customize-000010","pages",a))}))),h.default.createElement("ul",{className:"agent-info-top"},h.default.createElement("li",null,(0,C.langCheck)("Customize-000015","pages",a)),h.default.createElement("li",null,(0,C.langCheck)("Customize-000016","pages",a)),h.default.createElement("li",null,(0,C.langCheck)("Customize-000017","pages",a)),h.default.createElement("li",null,(0,C.langCheck)("Customize-000018","pages",a))),h.default.createElement("div",{className:"agent-info-content"},r.length>0?h.default.createElement(T.default,{json:a,items:r,deleteEvent:this.deleteEvent,DataCheck:this.DataCheck}):h.default.createElement("div",{className:"CoverPosition-content-treeCardTable"},h.default.createElement("img",{src:_.default,className:"commondataPlaceholder"}),h.default.createElement("p",null,(0,C.langCheck)("Customize-000019","pages",a))))))),h.default.createElement(P,{className:"default-footer",areaCode:P.config.BOTTOM},h.default.createElement(D,{colors:"primary",disabled:t,onClick:this.getAllData,fieldid:"apply"},(0,C.langCheck)("Customize-000020","pages",a)))))}}]),t}(g.Component);t.default=(0,v.connect)(function(e){return{userId:e.appData.userId,userName:e.appData.userName}})(S)},1291:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=i(a(196));t.default=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},t={refType:"grid",refName:(0,l.langCheck)("0000PUB-000051"),placeholder:(0,l.langCheck)("0000PUB-000051"),refCode:"riart.refer.pub.allBillTypeGridRef",queryGridUrl:"/nccloud/riart/ref/allBillRef.do",isMultiSelectedEnabled:!1,columnConfig:[{name:[(0,l.langCheck)("0000PUB-000032"),(0,l.langCheck)("0000PUB-000033")],code:["refcode","refname"]}]};return r.default.createElement(u,(0,n.default)(t,e))};var r=i(a(1)),o=a(857),l=a(18);function i(e){return e&&e.__esModule?e:{default:e}}var u=o.high.Refer},1292:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=m(a(196)),r=m(a(2)),o=m(a(13)),l=m(a(4)),i=m(a(7)),u=m(a(3)),s=m(a(5)),c=m(a(6));t.default=function(){var e,t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},a={queryTreeUrl:"/nccloud/riart/ref/userRefTreeAction.do",queryGridUrl:"/nccloud/riart/ref/userRefTableAction.do",rootNode:{refname:(0,p.langCheck)("0000PUB-000065"),refpk:"root"},columnConfig:[{name:[(0,p.langCheck)("0000PUB-000032"),(0,p.langCheck)("0000PUB-000033"),(0,p.langCheck)("0000PUB-000066"),(0,p.langCheck)("0000PUB-000067")],code:["refcode","refname","groupname","name"]}],queryCondition:{roleRefClassType:"pk_usergroup",group_pk:"firstGroup"},treeConfig:{name:[(0,p.langCheck)("0000PUB-000032"),(0,p.langCheck)("0000PUB-000033")],code:["refcode","refname"]},isMultiSelectedEnabled:!0,refType:"gridTree",refName:(0,p.langCheck)("0000PUB-000068"),unitProps:(e={rootNode:{refname:(0,p.langCheck)("0000PUB-000054"),refpk:"root"},refName:(0,p.langCheck)("0000PUB-000054"),refCode:"pk_group",queryTreeUrl:"/nccloud/riart/ref/groupRefTreeAction.do",refType:"tree",pageSize:50,isCacheable:!0,placeholder:(0,p.langCheck)("0000PUB-000054")},(0,c.default)(e,"refType","tree"),(0,c.default)(e,"treeConfig",{name:[(0,p.langCheck)("0000PUB-000032"),(0,p.langCheck)("0000PUB-000033")],code:["refcode","refname"]}),e),isShowUnit:!1},m=function(e){function t(e){(0,l.default)(this,t);var a=(0,u.default)(this,(t.__proto__||(0,o.default)(t)).call(this,e));return a.rRadioOnChange=function(e){var t=a,n={};n="pk_usergroup"==e?{refname:(0,p.langCheck)("0000PUB-000069"),refpk:"root"}:"pk_dept"==e?{refname:(0,p.langCheck)("0000PUB-000070"),refpk:"root"}:{refname:(0,p.langCheck)("0000PUB-000067"),refpk:"root"},t.setState({value:n},function(){t.render()})},a.state={value:{refname:(0,p.langCheck)("0000PUB-000069"),refpk:"root"}},a}return(0,s.default)(t,e),(0,i.default)(t,[{key:"render",value:function(){return React.createElement(d.default,(0,r.default)({},this.props,{rootNode:this.state.value,rRadioOnChange:this.rRadioOnChange}))}}]),t}(f.Component);return React.createElement(m,(0,n.default)(a,t))};var f=a(1),d=m(a(1293)),p=a(18);function m(e){return e&&e.__esModule?e:{default:e}}},1293:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=f(a(2)),r=f(a(19)),o=f(a(13)),l=f(a(4)),i=f(a(3)),u=f(a(5)),s=a(857),c=a(18);function f(e){return e&&e.__esModule?e:{default:e}}var d=s.base.NCRadio,p=(s.high.Refer,function(e){function t(e){(0,l.default)(this,t);var a=(0,i.default)(this,(t.__proto__||(0,o.default)(t)).call(this,e));return a.getParam=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},t=a.props,n=t.queryCondition,o=t.pageSize,l=t.refType,i=e.keyword,u=void 0===i?"":i,s=e.pid,c=void 0===s?"":s,f=e.pageInfo,d=void 0===f?{}:f;d={pageSize:d.pageSize||o,pageIndex:d.pageIndex||("tree"===l?-1:0)};var p={pid:c,keyword:u,queryCondition:n?"function"==typeof n?n():"object"===(void 0===n?"undefined":(0,r.default)(n))?n:{}:{},pageInfo:d};return p.queryCondition.queryUserType=a.state.radioValue,p.queryCondition.queryUserCode=c,p.queryCondition.group_pk=a.state.unit.refpk,p},a.handleGroupChange=function(e){a.setState({group_pk:e.refpk,expandedKeys:[],currentReffer:e},function(){a.getTreeData()})},a.handleRadioChange=function(e){a.props.rRadioOnChange(e),a.setState({treeSearchVal:"",radioValue:e,unitPks:a.state.unit.refpk},function(){a.getTreeData()})},a.getTreeData=function(){var e=a.props,t=e.queryTreeUrl,n=e.isCacheable,r=e.rootNode,o=a.getParam({pid:"",pageInfo:{pageSize:10,pageIndex:-1},queryCondition:{queryUserType:a.state.radioValue,group_pk:a.state.unit.refpk}}),l=a.hasCache(t,o);a.state.tableData=[{rows:[],page:{pageIndex:0,pageSize:a.props.pageSize,totalPage:1}}],n&&l?a.setTreeData("treeData",r,l):a.loadTreeData(o).then(function(e){a.setTreeData("treeData",r,e)}),a.setState({tableData:a.state.tableData})},a.renderPopoverLeftHeader=function(){return React.createElement("div",{id:"radioGroup",style:{"margin-bottom":"5px","margin-left":"10px"}},React.createElement(d.NCRadioGroup,{name:"role",radioValue:a.state.radioValue,selectedValue:a.state.radioValue,onChange:a.handleRadioChange.bind(a)},React.createElement(d,{value:"pk_usergroup"},(0,c.langCheck)("0000PUB-000069")),React.createElement(d,{value:"pk_dept"},(0,c.langCheck)("0000PUB-000070")),React.createElement(d,{value:"pk_org"},(0,c.langCheck)("0000PUB-000067"))))},a.state=(0,n.default)({},a.state,{radioValue:"pk_usergroup",group_pk:"firstGroup",currentReffer:[]}),a}return(0,u.default)(t,e),t}(s.high.Refer.ReferWithUnit));t.default=p},1294:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=d(a(926)),r=d(a(13)),o=d(a(4)),l=d(a(7)),i=d(a(3)),u=d(a(5));a(927);var s=d(a(1)),c=a(1295),f=a(18);function d(e){return e&&e.__esModule?e:{default:e}}var p=function(e){function t(e){return(0,o.default)(this,t),(0,i.default)(this,(t.__proto__||(0,r.default)(t)).call(this,e))}return(0,u.default)(t,e),(0,l.default)(t,[{key:"render",value:function(){var e=this,t=this.props.json;return s.default.createElement("ul",this.props,s.default.createElement("li",null,this.props["data-id"]+1),s.default.createElement("li",null,this.props.children.refcode),s.default.createElement("li",null,this.props.children.refname),s.default.createElement("li",null,s.default.createElement(n.default,{title:(0,f.langCheck)("Customize-000007","pages",t),cancelText:(0,f.langCheck)("Customize-000008","pages",t),okText:(0,f.langCheck)("Customize-000009","pages",t),onConfirm:function(){e.props.deleteEvent(e.props.children,"agentInfo")}},s.default.createElement("a",{className:"agent-container-button"},(0,f.langCheck)("Customize-000013","pages",t))),s.default.createElement("a",null,s.default.createElement("i",{className:"iconfont icon-tuodong"}))))}}]),t}(s.default.Component),m=(0,c.sortable)(p),g=function(e){function t(){var e,a,n,l;(0,o.default)(this,t);for(var u=arguments.length,s=Array(u),c=0;c<u;c++)s[c]=arguments[c];return a=n=(0,i.default)(this,(e=t.__proto__||(0,r.default)(t)).call.apply(e,[this].concat(s))),n.onSortItems=function(e){n.setState({items:e},function(){return n.props.DataCheck()})},l=a,(0,i.default)(n,l)}return(0,u.default)(t,e),(0,l.default)(t,[{key:"render",value:function(){var e=this,t=this.props.items,a=t.map(function(a,n){return s.default.createElement(m,{key:n,onSortItems:e.onSortItems,items:t,sortId:n,deleteEvent:e.props.deleteEvent,json:e.props.json},a)});return s.default.createElement("div",{className:"sortable-list"},a)}}]),t}(s.default.Component);t.default=g},1295:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=a(1296);Object.defineProperty(t,"sortable",{enumerable:!0,get:function(){return n.SortableComposition}}),Object.defineProperty(t,"Sortable",{enumerable:!0,get:function(){return n.SortableComposition}}),Object.defineProperty(t,"HORIZONTAL",{enumerable:!0,get:function(){return n.HORIZONTAL}}),Object.defineProperty(t,"VERTICAL",{enumerable:!0,get:function(){return n.VERTICAL}})},1296:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.HORIZONTAL=t.VERTICAL=void 0;var n=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var n in a)Object.prototype.hasOwnProperty.call(a,n)&&(e[n]=a[n])}return e},r=function(){function e(e,t){for(var a=0;a<t.length;a++){var n=t[a];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(e,n.key,n)}}return function(t,a,n){return a&&e(t.prototype,a),n&&e(t,n),t}}();t.SortableComposition=function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:s;return function(a){function i(){var e,a,n;!function(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(this,i);for(var r=arguments.length,o=Array(r),d=0;d<r;d++)o[d]=arguments[d];return n=u(this,(e=i.__proto__||Object.getPrototypeOf(i)).call.apply(e,[this].concat(o))),a=n,n.sortEnd=function(e){e.preventDefault(),f=null},n.sortStart=function(e){f=e.currentTarget.dataset.id;var t=e.dataTransfer;void 0!==t&&(e.dataTransfer.setData("text",e.target.innerHTML),t.setDragImage&&"a"===e.currentTarget.tagName.toLowerCase()&&t.setDragImage(e.target,0,0))},n.dragOver=function(e){e.preventDefault();var a=n.props,r=a.moveInMiddle,o=(a.sortId,e.currentTarget),i=Number(o.dataset.id),u=Number(f),d=o.getBoundingClientRect().height,p=o.getBoundingClientRect().width,m=e.clientX,g=e.clientY,h=o.getBoundingClientRect().top,v=o.getBoundingClientRect().left,C=void 0,y=n.props.items;t===s&&(C=(0,l.isMouseBeyond)(g,h,d,r)),t===c&&(C=(0,l.isMouseBeyond)(m,v,p,r));l.isMouseBeyond;i!==u&&C&&(y=(0,l.swapArrayElements)(y,u,i),f=i,n.props.onSortItems(y))},u(n,a)}return function(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}(i,a),r(i,[{key:"render",value:function(){var t=Object.assign({},this.props);delete t.onSortItems;var a=t.sortId,r=function(e,t){var a={};for(var n in e)t.indexOf(n)>=0||Object.prototype.hasOwnProperty.call(e,n)&&(a[n]=e[n]);return a}(t,["sortId"]);return o.default.createElement(e,n({draggable:!0,onDragOver:this.dragOver,onDragStart:this.sortStart,onDragEnd:this.sortEnd,onTouchStart:this.sortStart,onTouchMove:this.dragOver,onTouchEnd:this.sortEnd,"data-id":a},r))}}]),i}(o.default.Component)};var o=i(a(1)),l=(i(a(0)),a(1297));function i(e){return e&&e.__esModule?e:{default:e}}function u(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}var s=t.VERTICAL="VERTICAL",c=t.HORIZONTAL="HORIZONTAL",f=null},1297:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.swapArrayElements=function(e,t,a){var n=e[a];return e[a]=e[t],e[t]=n,e},t.isMouseBeyond=function(e,t,a,n){var r;r=n?a/2:0;return e-t>r}},926:function(e,t,a){"use strict";a.r(t);var n=a(2),r=a.n(n),o=a(4),l=a.n(o),i=a(7),u=a.n(i),s=a(3),c=a.n(s),f=a(5),d=a.n(f),p=a(1),m=a(64),g=a(55),h=a(15),v=a(39),C=a(112),y=a(96),b=function(e,t){var a={};for(var n in e)Object.prototype.hasOwnProperty.call(e,n)&&t.indexOf(n)<0&&(a[n]=e[n]);if(null!=e&&"function"==typeof Object.getOwnPropertySymbols){var r=0;for(n=Object.getOwnPropertySymbols(e);r<n.length;r++)t.indexOf(n[r])<0&&(a[n[r]]=e[n[r]])}return a},k=function(e){function t(e){l()(this,t);var a=c()(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return a.onConfirm=function(e){a.setVisible(!1,e);var t=a.props.onConfirm;t&&t.call(a,e)},a.onCancel=function(e){a.setVisible(!1,e);var t=a.props.onCancel;t&&t.call(a,e)},a.onVisibleChange=function(e){a.setVisible(e)},a.saveTooltip=function(e){a.tooltip=e},a.renderOverlay=function(e){var t=a.props,n=t.prefixCls,r=t.title,o=t.cancelText,l=t.okText,i=t.okType,u=t.icon;return p.createElement("div",null,p.createElement("div",{className:n+"-inner-content"},p.createElement("div",{className:n+"-message"},u,p.createElement("div",{className:n+"-message-title"},r)),p.createElement("div",{className:n+"-buttons"},p.createElement(v.default,{onClick:a.onCancel,size:"small"},o||e.cancelText),p.createElement(v.default,{onClick:a.onConfirm,type:i,size:"small"},l||e.okText))))},a.state={visible:e.visible},a}return d()(t,e),u()(t,[{key:"getPopupDomNode",value:function(){return this.tooltip.getPopupDomNode()}},{key:"setVisible",value:function(e,t){var a=this.props;"visible"in a||this.setState({visible:e});var n=a.onVisibleChange;n&&n(e,t)}},{key:"render",value:function(){var e=this.props,t=e.prefixCls,a=e.placement,n=b(e,["prefixCls","placement"]),o=p.createElement(C.a,{componentName:"Popconfirm",defaultLocale:y.a.Popconfirm},this.renderOverlay);return p.createElement(g.default,r()({},n,{prefixCls:t,placement:a,onVisibleChange:this.onVisibleChange,visible:this.state.visible,overlay:o,ref:this.saveTooltip}))}}],[{key:"getDerivedStateFromProps",value:function(e){return"visible"in e?{visible:e.visible}:null}}]),t}(p.Component);k.defaultProps={prefixCls:"ant-popover",transitionName:"zoom-big",placement:"top",trigger:"click",okType:"primary",icon:p.createElement(h.default,{type:"exclamation-circle",theme:"filled"})},Object(m.polyfill)(k),t.default=k},927:function(e,t,a){"use strict";a.r(t);a(25),a(141),a(91)},958:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=c(a(13)),r=c(a(4)),o=c(a(7)),l=c(a(3)),i=c(a(5)),u=a(1),s=c(u);function c(e){return e&&e.__esModule?e:{default:e}}var f=function(e){function t(e){return(0,r.default)(this,t),(0,l.default)(this,(t.__proto__||(0,n.default)(t)).call(this,e))}return(0,i.default)(t,e),(0,o.default)(t,[{key:"render",value:function(){return s.default.createElement("div",{className:"customize-page "+(this.props.className?this.props.className:"")},s.default.createElement("div",{className:"customize-content"},this.props.children))}}]),t}(u.Component);t.default=f}}]);