!function(e,t){"object"==typeof exports&&"object"==typeof module?module.exports=t():"function"==typeof define&&define.amd?define([],t):"object"==typeof exports?exports["adprepare/promanage/91h10520/constant/index"]=t():e["adprepare/promanage/91h10520/constant/index"]=t()}(window,function(){return function(e){var t={};function o(a){if(t[a])return t[a].exports;var n=t[a]={i:a,l:!1,exports:{}};return e[a].call(n.exports,n,n.exports,o),n.l=!0,n.exports}return o.m=e,o.c=t,o.d=function(e,t,a){o.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:a})},o.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},o.t=function(e,t){if(1&t&&(e=o(e)),8&t)return e;if(4&t&&"object"==typeof e&&e&&e.__esModule)return e;var a=Object.create(null);if(o.r(a),Object.defineProperty(a,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var n in e)o.d(a,n,function(t){return e[t]}.bind(null,n));return a},o.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return o.d(t,"a",t),t},o.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},o.p="../../../../",o(o.s=85)}({2:function(e,t,o){"use strict";Object.defineProperty(t,"__esModule",{value:!0});t.APPCODE="91H10520",t.BILL_TYPE_CODE="MYDC",t.MULTILANG={moduleId:"91H10520",domainName:"adprepare"},t.LIST={page_title:"91H10520-000011",page_code:"91H10520_LIST",search_id:"list_query",table_id:"list_head",head_btn_code:"list_head",body_btn_code:"list_inner"},t.CARD={page_title:"91H10520-000011",page_code:"91H10520_CARD",form_id:"card_head",table_code:"card_body",table_edit_code:"card_body_edit",table_browse_code:"card_body_browse",head_btn_code:"card_head",shoulder_btn_code:"tabs_head",body_btn_code:"tabs_body"};var a=t.DATASOURCE="tm.fmc.cost.datasource",n=(t.SEARCH_CACHE={key:"tm.fmc.cost.SEARCH_CACHE",dataSource:a},t.CARD_CACHE={key:"tm.fmc.cost.CARD_CACHE",dataSource:a},t.base_path="/nccloud/adprepare/promanage/",t.REQUEST_URL={save:"/nccloud/adprepare/promanage/savesatisfactionHVO.do",delete:"/nccloud/adprepare/promanage/deletesatisfactionHVO.do",queryCard:"/nccloud/adprepare/promanage/querycardsatisfactionHVO.do",queryList:"/nccloud/adprepare/promanage/querypagesatisfactionHVO.do",queryListByPks:"/nccloud/adprepare/promanage/querypagebypksatisfactionHVO.do",commit:"/nccloud/adprepare/promanage/commitsatisfactionHVO.do",unCommit:"/nccloud/adprepare/promanage/uncommitsatisfactionHVO.do",toCard:"/card",toList:"/list"},t.LIST_BUTTON={create:"AddBtn",delete:"DelBtn",commit:"CommitBtn",unCommit:"UnCommitBtn",linkGroup:"JointBtn",attachment:"AttachmentBtn",approvalLink:"DetailBtn",billTrack:"TrackBtn",print:"PrintBtn",output:"OutputBtn",refresh:"RefreshBtn",bodyUpdate:"edit",bodyDelete:"delete",bodyCommit:"commit",bodyUnCommit:"unCommit",copy:"copy"}),r=(t.LIST_DISABLED_BUTTON=[n.delete,n.commit,n.unCommit,n.linkGroup,n.approvalLink,n.billTrack,n.attachment,n.print,n.output],t.CARD_BUTTON={save:"SaveBtn",saveAdd:"SaveAddBtn",saveCommit:"SaveCommitBtn",cancel:"CancelBtn",create:"CreateBtn",update:"UpdateBtn",delete:"DeleteBtn",copy:"CopyBtn",commit:"CommitBtn",unCommit:"UnCommitBtn",attachment:"AttachmentBtn",approvalLink:"DetailBtn",billTrack:"TrackBtn",print:"PrintBtn",output:"OutputBtn",refresh:"RefreshBtn",back:"Back",addRow:"addRow",deleteRow:"deleteRow",copyRows:"copyRows",pasteTail:"pasteTail",pasteCancel:"pasteCancel",expand:"expand",insertRow:"insertRow",delRow:"delRow",copyRow:"copyRow",fold:"fold",unfold:"unfold",pasteHere:"pasteHere"});t.CARD_DISABLED_BUTTON=[r.deleteRow,r.copyRows],t.CARD_ADD_DISABLED_BUTTON=[r.addRow,r.save,r.saveAdd,r.saveCommit],t.FIELD={org:"pk_org",billStatus:"billstatus",ts:"ts"},t.PRIMARY_KEY={head_id:"pk_satisfaction_h",body_id:"pk_satisfaction_b",bill_no:"billno",id:"id"},t.STATUS={status:"status",edit:"edit",browse:"browse",add:"add",info:"info",warning:"warning",success:"success",danger:"danger",NOSTATE:"-1",NOPASS:"0",PASSING:"1",GOINGON:"2",COMMIT:"3"}},85:function(e,t,o){e.exports=o(2)}})});