(window.webpackJsonp=window.webpackJsonp||[]).push([[20],{1321:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var l=H(a(58)),o=H(a(41)),c=H(a(6)),n=H(a(13)),r=H(a(3)),d=H(a(8)),s=H(a(4)),u=H(a(5));a(75),a(90);var i=a(1),f=H(i),m=a(29),p=H(a(201)),h=a(18),g=a(34),k=H(a(27)),C=H(a(413)),w=a(1322),E=H(a(57)),v=H(a(1399)),b=H(a(1400)),F=H(a(1401)),j=H(a(1402)),y=H(a(1403)),A=H(a(1404)),B=H(a(1405)),N=H(a(1406)),S=H(a(1407)),x=H(a(1408)),P=H(a(1409)),U=H(a(1410)),D=H(a(1411)),M=H(a(1412)),O=H(a(1413)),_=H(a(1414)),I=H(a(1415)),V=H(a(1416));function H(e){return e&&e.__esModule?e:{default:e}}var z=H(a(33)).default.base,T=z.NCDiv,J=z.NCButton,Y={"#BF381A":"red","#1561CD":"blue","#138346":"green","#A47238":"yellow","#2E2C2C":"black"},q={"#F1F1F1":(0,h.langCheck)("0000PUB-000282"),"#BF381A":(0,h.langCheck)("0000PUB-000283"),"#1561CD":(0,h.langCheck)("0000PUB-000284"),"#138346":(0,h.langCheck)("0000PUB-000285"),"#A47238":(0,h.langCheck)("0000PUB-000286"),"#2E2C2C":(0,h.langCheck)("0000PUB-000287")},L=function(e){function t(e){(0,r.default)(this,t);var a=(0,s.default)(this,(t.__proto__||(0,n.default)(t)).call(this,e));return a.getDefaultColor=function(){var e=a.state.colorArr;(0,k.default)({url:"/nccloud/platform/appregister/querythemecolor.do",data:{},noNeedShowError:!0,success:function(t){var l=t.data;l.success&&l.data?(e.map(function(e){e.color==l.data.color&&(e.checked=!0)}),a.setState({checkedColor:l.data.color,colorArr:e})):(e[0].checked=!0,a.setState({colorArr:e}))},error:function(t){e[0].checked=!0,a.setState({colorArr:e})}})},a.checkItem=function(e,t){var l;a.state[t].map(function(e){e.defaultShow=!1}),a.state[t][e].defaultShow=!0;var o=a.state[t][e].color;a.setState((l={},(0,c.default)(l,t,a.state[t]),(0,c.default)(l,"disabled",!1),(0,c.default)(l,"checkedColor",o),l))},a.getAllData=function(){var e=a.state,t=e.checkedColor,l=e.colorArr,o=a.props.json;(0,k.default)({url:"/nccloud/platform/appregister/addthemecolor.do",data:{color:t,name:q[t],defaultshow:!0,checked:!0},info:{name:(0,h.langCheck)("0000PUB-000258"),action:(0,h.langCheck)("0000PUB-000340")},noNeedShowError:!0,success:function(e){var c=e.data;if(c.success&&c.data){if(l.map(function(e){e.checked=!1,e.color===c.data.color&&(e.checked=!0)}),a.setState({colorArr:l}),"#F1F1F1"==t)return document.getElementById("workbench").className="workbench-default nc-lightapp-front-default",p.default.call(a,"nc-lightapp-front-default"),window.top.nccColor="",(0,g.setStore)("nccColor",""),void(0,E.default)({status:"success",msg:(0,h.langCheck)("Customize-000044","pages",o)});window.top&&(window.top.nccColor=Y[t]),p.default.call(a,"nc-lightapp-front-"+Y[t]),document.getElementById("workbench").className="workbench-"+Y[t]+" nc-lightapp-front-"+Y[t],(0,g.setStore)("nccColor",Y[t]),(0,E.default)({status:"success",msg:(0,h.langCheck)("Customize-000044","pages",o)})}},error:function(e){console.log(e)}})},a.showModalHidden=function(){a.setState({modalVis:!1})},a.showModalVis=function(){a.setState({modalVis:!0})},a.handleColorChange=function(e,t){console.log(e,t)},a.handleChangeComplete=function(e,t){a.setState({addColor:e.hex})},a.handleModalOk=function(){a.showModalHidden()},a.state={colorObj:{name:"",color:""},disabled:!0,checkedColor:"",colorArr:[{key:0,color:"#F1F1F1",name:(0,h.langCheck)("0000PUB-000282"),defaultShow:!1,checked:!1},{key:1,color:"#BF381A",name:(0,h.langCheck)("0000PUB-000283"),defaultShow:!1,checked:!1},{key:2,color:"#1561CD",name:(0,h.langCheck)("0000PUB-000284"),defaultShow:!1,checked:!1},{key:3,color:"#138346",name:(0,h.langCheck)("0000PUB-000285"),defaultShow:!1,checked:!1},{key:4,color:"#A47238",name:(0,h.langCheck)("0000PUB-000286"),defaultShow:!1,checked:!1},{key:5,color:"#2E2C2C",name:(0,h.langCheck)("0000PUB-000287"),defaultShow:!1,checked:!1}],modalVis:!1,addColor:""},a}return(0,u.default)(t,e),(0,d.default)(t,[{key:"componentDidMount",value:function(){this.getDefaultColor()}},{key:"render",value:function(){var e=this,t=this.state,a=t.colorArr,c=t.disabled,n=t.checkedColor,r=this.props.json;return f.default.createElement("div",{className:"subjectSetting"},f.default.createElement(T,{className:"subjectSettingLeft",fieldid:"left",areaCode:T.config.Area},f.default.createElement("article",null,(0,h.langCheck)("0000PUB-000288")),f.default.createElement("div",{className:"colorAlter"},a.map(function(t,a){var l=t.defaultShow,o=t.key,c=t.color,n=t.checked;return f.default.createElement("div",{className:"subjectItem",onClick:function(){return e.checkItem(o,"colorArr")}},f.default.createElement("div",{className:l?"itemObj checkedItem":"itemObj",style:{background:"#F1F1F1"==c?"#DFE6E6":c}},"#F1F1F1"==c&&f.default.createElement("div",{className:"defaultItemObj"}),n?f.default.createElement("i",{className:"iconfont icon-liucheng1"}):l?f.default.createElement("i",{className:"iconfont icon-yulan"}):null))})),f.default.createElement("div",{className:"colorAlter"},a.map(function(e,t){var a=e.name;return f.default.createElement("div",{className:"itemName"},a)}))),f.default.createElement("div",{className:"subjectSettingRight"},f.default.createElement("div",{className:"previewTitle"},(0,h.langCheck)("0000PUB-000019"),":",f.default.createElement("span",null,""+(q[n]?q[n]:""))),""!==n&&f.default.createElement("div",{className:"previewPic"},f.default.createElement("img",{src:"#F1F1F1"==n?_.default:"#BF381A"==n?j.default:"#1561CD"==n?B.default:"#138346"==n?x.default:"#A47238"==n?D.default:v.default}),f.default.createElement("img",{src:"#F1F1F1"==n?I.default:"#BF381A"==n?y.default:"#1561CD"==n?N.default:"#138346"==n?P.default:"#A47238"==n?M.default:b.default}),f.default.createElement("img",{src:"#F1F1F1"==n?V.default:"#BF381A"==n?A.default:"#1561CD"==n?S.default:"#138346"==n?U.default:"#A47238"==n?O.default:F.default}))),f.default.createElement(T,{className:"default-footer",areaCode:T.config.BOTTOM},f.default.createElement(J,{colors:"primary",disabled:c,onClick:this.getAllData,fieldid:"apply"},(0,h.langCheck)("Customize-000020","pages",r))),f.default.createElement(C.default,{closable:!1,title:123,mask:!1,visible:this.state.modalVis,onOk:this.onOkMoveDialog,onCancel:this.showModalHidden,footer:[f.default.createElement(l.default,{placement:"top",overlayClassName:"tootip-default"},f.default.createElement(o.default,{key:"submit",type:"primary",onClick:this.handleModalOk},"确定(",f.default.createElement("span",{className:"underline"},"Y"),")")),f.default.createElement(l.default,{placement:"top",overlayClassName:"tootip-default"},f.default.createElement(o.default,{key:"back",onClick:this.showModalHidden},"取消(",f.default.createElement("span",{className:"underline"},"Y"),")"))]},f.default.createElement(w.SketchPicker,{onChange:this.handleColorChange,onChangeComplete:this.handleChangeComplete})))}}]),t}(i.Component);t.default=(0,m.connect)(function(e){return{}})(L)},1399:function(e,t,a){e.exports=a.p+"images/black1.jpg"},1400:function(e,t,a){e.exports=a.p+"images/black2.jpg"},1401:function(e,t,a){e.exports=a.p+"images/black3.jpg"},1402:function(e,t,a){e.exports=a.p+"images/red1.jpg"},1403:function(e,t,a){e.exports=a.p+"images/red2.jpg"},1404:function(e,t,a){e.exports=a.p+"images/red3.jpg"},1405:function(e,t,a){e.exports=a.p+"images/blue1.jpg"},1406:function(e,t,a){e.exports=a.p+"images/blue2.jpg"},1407:function(e,t,a){e.exports=a.p+"images/blue3.jpg"},1408:function(e,t,a){e.exports=a.p+"images/green1.jpg"},1409:function(e,t,a){e.exports=a.p+"images/green2.jpg"},1410:function(e,t,a){e.exports=a.p+"images/green3.jpg"},1411:function(e,t,a){e.exports=a.p+"images/yellow1.jpg"},1412:function(e,t,a){e.exports=a.p+"images/yellow2.jpg"},1413:function(e,t,a){e.exports=a.p+"images/yellow3.jpg"},1414:function(e,t,a){e.exports=a.p+"images/default1.jpg"},1415:function(e,t,a){e.exports=a.p+"images/default2.jpg"},1416:function(e,t,a){e.exports=a.p+"images/default3.jpg"}}]);
//# sourceMappingURL=20.1c6f6795.js.map