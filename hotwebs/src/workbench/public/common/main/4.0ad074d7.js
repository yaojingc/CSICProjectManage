(window.webpackJsonp=window.webpackJsonp||[]).push([[4],{890:function(e,t,r){"use strict";r.r(t);var n=r(418);t.default=n.a},891:function(e,t,r){"use strict";r.r(t);var n=r(193);t.default=n.a},892:function(e,t,r){"use strict";r.r(t);r(25),r(423)},893:function(e,t,r){"use strict";r.r(t);r(25),r(423)},899:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});t.FILE="__NATIVE_FILE__",t.URL="__NATIVE_URL__",t.TEXT="__NATIVE_TEXT__"},924:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.getEmptyImage=t.NativeTypes=void 0,t.default=function(e){return new n.default(e)};var n=o(r(943)),a=o(r(954)),i=function(e){if(e&&e.__esModule)return e;var t={};if(null!=e)for(var r in e)Object.prototype.hasOwnProperty.call(e,r)&&(t[r]=e[r]);return t.default=e,t}(r(899));function o(e){return e&&e.__esModule?e:{default:e}}t.NativeTypes=i,t.getEmptyImage=a.default},925:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.isSafari=t.isFirefox=void 0;var n,a=r(949),i=(n=a)&&n.__esModule?n:{default:n};t.isFirefox=(0,i.default)(function(){return/firefox/i.test(navigator.userAgent)}),t.isSafari=(0,i.default)(function(){return Boolean(window.safari)})},943:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=function(){function e(e,t){for(var r=0;r<t.length;r++){var n=t[r];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(e,n.key,n)}}return function(t,r,n){return r&&e(t.prototype,r),n&&e(t,n),t}}(),a=f(r(944)),i=f(r(946)),o=f(r(947)),s=r(925),u=r(951),c=r(953),d=function(e){if(e&&e.__esModule)return e;var t={};if(null!=e)for(var r in e)Object.prototype.hasOwnProperty.call(e,r)&&(t[r]=e[r]);return t.default=e,t}(r(899));function f(e){return e&&e.__esModule?e:{default:e}}var h=function(){function e(t){!function(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(this,e),this.actions=t.getActions(),this.monitor=t.getMonitor(),this.registry=t.getRegistry(),this.context=t.getContext(),this.sourcePreviewNodes={},this.sourcePreviewNodeOptions={},this.sourceNodes={},this.sourceNodeOptions={},this.enterLeaveCounter=new o.default,this.dragStartSourceIds=[],this.dropTargetIds=[],this.dragEnterTargetIds=[],this.currentNativeSource=null,this.currentNativeHandle=null,this.currentDragSourceNode=null,this.currentDragSourceNodeOffset=null,this.currentDragSourceNodeOffsetChanged=!1,this.altKeyPressed=!1,this.mouseMoveTimeoutTimer=null,this.getSourceClientOffset=this.getSourceClientOffset.bind(this),this.handleTopDragStart=this.handleTopDragStart.bind(this),this.handleTopDragStartCapture=this.handleTopDragStartCapture.bind(this),this.handleTopDragEndCapture=this.handleTopDragEndCapture.bind(this),this.handleTopDragEnter=this.handleTopDragEnter.bind(this),this.handleTopDragEnterCapture=this.handleTopDragEnterCapture.bind(this),this.handleTopDragLeaveCapture=this.handleTopDragLeaveCapture.bind(this),this.handleTopDragOver=this.handleTopDragOver.bind(this),this.handleTopDragOverCapture=this.handleTopDragOverCapture.bind(this),this.handleTopDrop=this.handleTopDrop.bind(this),this.handleTopDropCapture=this.handleTopDropCapture.bind(this),this.handleSelectStart=this.handleSelectStart.bind(this),this.endDragIfSourceWasRemovedFromDOM=this.endDragIfSourceWasRemovedFromDOM.bind(this),this.endDragNativeItem=this.endDragNativeItem.bind(this),this.asyncEndDragNativeItem=this.asyncEndDragNativeItem.bind(this),this.isNodeInDocument=this.isNodeInDocument.bind(this)}return n(e,[{key:"setup",value:function(){if(void 0!==this.window){if(this.window.__isReactDndBackendSetUp)throw new Error("Cannot have two HTML5 backends at the same time.");this.window.__isReactDndBackendSetUp=!0,this.addEventListeners(this.window)}}},{key:"teardown",value:function(){void 0!==this.window&&(this.window.__isReactDndBackendSetUp=!1,this.removeEventListeners(this.window),this.clearCurrentDragSourceNode(),this.asyncEndDragFrameId&&this.window.cancelAnimationFrame(this.asyncEndDragFrameId))}},{key:"addEventListeners",value:function(e){e.addEventListener&&(e.addEventListener("dragstart",this.handleTopDragStart),e.addEventListener("dragstart",this.handleTopDragStartCapture,!0),e.addEventListener("dragend",this.handleTopDragEndCapture,!0),e.addEventListener("dragenter",this.handleTopDragEnter),e.addEventListener("dragenter",this.handleTopDragEnterCapture,!0),e.addEventListener("dragleave",this.handleTopDragLeaveCapture,!0),e.addEventListener("dragover",this.handleTopDragOver),e.addEventListener("dragover",this.handleTopDragOverCapture,!0),e.addEventListener("drop",this.handleTopDrop),e.addEventListener("drop",this.handleTopDropCapture,!0))}},{key:"removeEventListeners",value:function(e){e.removeEventListener&&(e.removeEventListener("dragstart",this.handleTopDragStart),e.removeEventListener("dragstart",this.handleTopDragStartCapture,!0),e.removeEventListener("dragend",this.handleTopDragEndCapture,!0),e.removeEventListener("dragenter",this.handleTopDragEnter),e.removeEventListener("dragenter",this.handleTopDragEnterCapture,!0),e.removeEventListener("dragleave",this.handleTopDragLeaveCapture,!0),e.removeEventListener("dragover",this.handleTopDragOver),e.removeEventListener("dragover",this.handleTopDragOverCapture,!0),e.removeEventListener("drop",this.handleTopDrop),e.removeEventListener("drop",this.handleTopDropCapture,!0))}},{key:"connectDragPreview",value:function(e,t,r){var n=this;return this.sourcePreviewNodeOptions[e]=r,this.sourcePreviewNodes[e]=t,function(){delete n.sourcePreviewNodes[e],delete n.sourcePreviewNodeOptions[e]}}},{key:"connectDragSource",value:function(e,t,r){var n=this;this.sourceNodes[e]=t,this.sourceNodeOptions[e]=r;var a=function(t){return n.handleDragStart(t,e)},i=function(t){return n.handleSelectStart(t,e)};return t.setAttribute("draggable",!0),t.addEventListener("dragstart",a),t.addEventListener("selectstart",i),function(){delete n.sourceNodes[e],delete n.sourceNodeOptions[e],t.removeEventListener("dragstart",a),t.removeEventListener("selectstart",i),t.setAttribute("draggable",!1)}}},{key:"connectDropTarget",value:function(e,t){var r=this,n=function(t){return r.handleDragEnter(t,e)},a=function(t){return r.handleDragOver(t,e)},i=function(t){return r.handleDrop(t,e)};return t.addEventListener("dragenter",n),t.addEventListener("dragover",a),t.addEventListener("drop",i),function(){t.removeEventListener("dragenter",n),t.removeEventListener("dragover",a),t.removeEventListener("drop",i)}}},{key:"getCurrentSourceNodeOptions",value:function(){var e=this.monitor.getSourceId(),t=this.sourceNodeOptions[e];return(0,a.default)(t||{},{dropEffect:this.altKeyPressed?"copy":"move"})}},{key:"getCurrentDropEffect",value:function(){return this.isDraggingNativeItem()?"copy":this.getCurrentSourceNodeOptions().dropEffect}},{key:"getCurrentSourcePreviewNodeOptions",value:function(){var e=this.monitor.getSourceId(),t=this.sourcePreviewNodeOptions[e];return(0,a.default)(t||{},{anchorX:.5,anchorY:.5,captureDraggingState:!1})}},{key:"getSourceClientOffset",value:function(e){return(0,u.getNodeClientOffset)(this.sourceNodes[e])}},{key:"isDraggingNativeItem",value:function(){var e=this.monitor.getItemType();return Object.keys(d).some(function(t){return d[t]===e})}},{key:"beginDragNativeItem",value:function(e){this.clearCurrentDragSourceNode();var t=(0,c.createNativeDragSource)(e);this.currentNativeSource=new t,this.currentNativeHandle=this.registry.addSource(e,this.currentNativeSource),this.actions.beginDrag([this.currentNativeHandle])}},{key:"asyncEndDragNativeItem",value:function(){this.asyncEndDragFrameId=this.window.requestAnimationFrame(this.endDragNativeItem)}},{key:"endDragNativeItem",value:function(){this.isDraggingNativeItem()&&(this.actions.endDrag(),this.registry.removeSource(this.currentNativeHandle),this.currentNativeHandle=null,this.currentNativeSource=null)}},{key:"isNodeInDocument",value:function(e){return!(!document.body.contains(e)&&!this.window)&&this.window.document.body.contains(e)}},{key:"endDragIfSourceWasRemovedFromDOM",value:function(){var e=this.currentDragSourceNode;this.isNodeInDocument(e)||this.clearCurrentDragSourceNode()&&this.actions.endDrag()}},{key:"setCurrentDragSourceNode",value:function(e){var t=this;this.clearCurrentDragSourceNode(),this.currentDragSourceNode=e,this.currentDragSourceNodeOffset=(0,u.getNodeClientOffset)(e),this.currentDragSourceNodeOffsetChanged=!1;this.mouseMoveTimeoutTimer=setTimeout(function(){return t.mouseMoveTimeoutId=null,t.window.addEventListener("mousemove",t.endDragIfSourceWasRemovedFromDOM,!0)},1e3)}},{key:"clearCurrentDragSourceNode",value:function(){return!!this.currentDragSourceNode&&(this.currentDragSourceNode=null,this.currentDragSourceNodeOffset=null,this.currentDragSourceNodeOffsetChanged=!1,this.window.clearTimeout(this.mouseMoveTimeoutTimer),this.window.removeEventListener("mousemove",this.endDragIfSourceWasRemovedFromDOM,!0),this.mouseMoveTimeoutTimer=null,!0)}},{key:"checkIfCurrentDragSourceRectChanged",value:function(){var e=this.currentDragSourceNode;return!!e&&(!!this.currentDragSourceNodeOffsetChanged||(this.currentDragSourceNodeOffsetChanged=!(0,i.default)((0,u.getNodeClientOffset)(e),this.currentDragSourceNodeOffset),this.currentDragSourceNodeOffsetChanged))}},{key:"handleTopDragStartCapture",value:function(){this.clearCurrentDragSourceNode(),this.dragStartSourceIds=[]}},{key:"handleDragStart",value:function(e,t){this.dragStartSourceIds.unshift(t)}},{key:"handleTopDragStart",value:function(e){var t=this,r=this.dragStartSourceIds;this.dragStartSourceIds=null;var n=(0,u.getEventClientOffset)(e);this.monitor.isDragging()&&this.actions.endDrag(),this.actions.beginDrag(r,{publishSource:!1,getSourceClientOffset:this.getSourceClientOffset,clientOffset:n});var a=e.dataTransfer,i=(0,c.matchNativeItemType)(a);if(this.monitor.isDragging()){if("function"==typeof a.setDragImage){var o=this.monitor.getSourceId(),s=this.sourceNodes[o],d=this.sourcePreviewNodes[o]||s,f=this.getCurrentSourcePreviewNodeOptions(),h={anchorX:f.anchorX,anchorY:f.anchorY},l={offsetX:f.offsetX,offsetY:f.offsetY},g=(0,u.getDragPreviewOffset)(s,d,n,h,l);a.setDragImage(d,g.x,g.y)}try{a.setData("application/json",{})}catch(e){}this.setCurrentDragSourceNode(e.target),this.getCurrentSourcePreviewNodeOptions().captureDraggingState?this.actions.publishDragSource():setTimeout(function(){return t.actions.publishDragSource()})}else if(i)this.beginDragNativeItem(i);else{if(!(a.types||e.target.hasAttribute&&e.target.hasAttribute("draggable")))return;e.preventDefault()}}},{key:"handleTopDragEndCapture",value:function(){this.clearCurrentDragSourceNode()&&this.actions.endDrag()}},{key:"handleTopDragEnterCapture",value:function(e){if(this.dragEnterTargetIds=[],this.enterLeaveCounter.enter(e.target)&&!this.monitor.isDragging()){var t=e.dataTransfer,r=(0,c.matchNativeItemType)(t);r&&this.beginDragNativeItem(r)}}},{key:"handleDragEnter",value:function(e,t){this.dragEnterTargetIds.unshift(t)}},{key:"handleTopDragEnter",value:function(e){var t=this,r=this.dragEnterTargetIds;(this.dragEnterTargetIds=[],this.monitor.isDragging())&&(this.altKeyPressed=e.altKey,(0,s.isFirefox)()||this.actions.hover(r,{clientOffset:(0,u.getEventClientOffset)(e)}),r.some(function(e){return t.monitor.canDropOnTarget(e)})&&(e.preventDefault(),e.dataTransfer.dropEffect=this.getCurrentDropEffect()))}},{key:"handleTopDragOverCapture",value:function(){this.dragOverTargetIds=[]}},{key:"handleDragOver",value:function(e,t){this.dragOverTargetIds.unshift(t)}},{key:"handleTopDragOver",value:function(e){var t=this,r=this.dragOverTargetIds;if(this.dragOverTargetIds=[],!this.monitor.isDragging())return e.preventDefault(),void(e.dataTransfer.dropEffect="none");this.altKeyPressed=e.altKey,this.actions.hover(r,{clientOffset:(0,u.getEventClientOffset)(e)}),r.some(function(e){return t.monitor.canDropOnTarget(e)})?(e.preventDefault(),e.dataTransfer.dropEffect=this.getCurrentDropEffect()):this.isDraggingNativeItem()?(e.preventDefault(),e.dataTransfer.dropEffect="none"):this.checkIfCurrentDragSourceRectChanged()&&(e.preventDefault(),e.dataTransfer.dropEffect="move")}},{key:"handleTopDragLeaveCapture",value:function(e){this.isDraggingNativeItem()&&e.preventDefault(),this.enterLeaveCounter.leave(e.target)&&this.isDraggingNativeItem()&&this.endDragNativeItem()}},{key:"handleTopDropCapture",value:function(e){this.dropTargetIds=[],e.preventDefault(),this.isDraggingNativeItem()&&this.currentNativeSource.mutateItemByReadingDataTransfer(e.dataTransfer),this.enterLeaveCounter.reset()}},{key:"handleDrop",value:function(e,t){this.dropTargetIds.unshift(t)}},{key:"handleTopDrop",value:function(e){var t=this.dropTargetIds;this.dropTargetIds=[],this.actions.hover(t,{clientOffset:(0,u.getEventClientOffset)(e)}),this.actions.drop({dropEffect:this.getCurrentDropEffect()}),this.isDraggingNativeItem()?this.endDragNativeItem():this.endDragIfSourceWasRemovedFromDOM()}},{key:"handleSelectStart",value:function(e){var t=e.target;"function"==typeof t.dragDrop&&("INPUT"===t.tagName||"SELECT"===t.tagName||"TEXTAREA"===t.tagName||t.isContentEditable||(e.preventDefault(),t.dragDrop()))}},{key:"window",get:function(){return this.context&&this.context.window?this.context.window:"undefined"!=typeof window?window:void 0}}]),e}();t.default=h},944:function(e,t,r){var n=r(901),a=r(142),i=r(965),o=r(945),s=Object.prototype,u=s.hasOwnProperty,c=n(function(e,t){e=Object(e);var r=-1,n=t.length,c=n>2?t[2]:void 0;for(c&&i(t[0],t[1],c)&&(n=1);++r<n;)for(var d=t[r],f=o(d),h=-1,l=f.length;++h<l;){var g=f[h],v=e[g];(void 0===v||a(v,s[g])&&!u.call(e,g))&&(e[g]=d[g])}return e});e.exports=c},946:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.default=function(e,t){if(e===t)return!0;var r=Object.keys(e),n=Object.keys(t);if(r.length!==n.length)return!1;for(var a=Object.prototype.hasOwnProperty,i=0;i<r.length;i+=1){if(!a.call(t,r[i])||e[r[i]]!==t[r[i]])return!1;var o=e[r[i]],s=t[r[i]];if(o!==s)return!1}return!0}},947:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=function(){function e(e,t){for(var r=0;r<t.length;r++){var n=t[r];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(e,n.key,n)}}return function(t,r,n){return r&&e(t.prototype,r),n&&e(t,n),t}}(),a=o(r(948)),i=o(r(960));function o(e){return e&&e.__esModule?e:{default:e}}var s=function(){function e(){!function(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(this,e),this.entered=[]}return n(e,[{key:"enter",value:function(e){var t=this.entered.length;return this.entered=(0,a.default)(this.entered.filter(function(t){return document.documentElement.contains(t)&&(!t.contains||t.contains(e))}),[e]),0===t&&this.entered.length>0}},{key:"leave",value:function(e){var t=this.entered.length;return this.entered=(0,i.default)(this.entered.filter(function(e){return document.documentElement.contains(e)}),e),t>0&&0===this.entered.length}},{key:"reset",value:function(){this.entered=[]}}]),e}();t.default=s},948:function(e,t,r){var n=r(962),a=r(901),i=r(963),o=r(929),s=a(function(e){return i(n(e,1,o,!0))});e.exports=s},949:function(e,t,r){var n=r(950),a="Expected a function";function i(e,t){if("function"!=typeof e||null!=t&&"function"!=typeof t)throw new TypeError(a);var r=function(){var n=arguments,a=t?t.apply(this,n):n[0],i=r.cache;if(i.has(a))return i.get(a);var o=e.apply(this,n);return r.cache=i.set(a,o)||i,o};return r.cache=new(i.Cache||n),r}i.Cache=n,e.exports=i},950:function(e,t,r){var n=r(966),a=r(967),i=r(969),o=r(970),s=r(971);function u(e){var t=-1,r=null==e?0:e.length;for(this.clear();++t<r;){var n=e[t];this.set(n[0],n[1])}}u.prototype.clear=n,u.prototype.delete=a,u.prototype.get=i,u.prototype.has=o,u.prototype.set=s,e.exports=u},951:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.getNodeClientOffset=u,t.getEventClientOffset=function(e){return{x:e.clientX,y:e.clientY}},t.getDragPreviewOffset=function(e,t,r,n,i){var s=(T=t,"IMG"===T.nodeName&&((0,a.isFirefox)()||!document.documentElement.contains(T))),c=u(s?e:t),d={x:r.x-c.x,y:r.y-c.y},f=e.offsetWidth,h=e.offsetHeight,l=n.anchorX,g=n.anchorY,v=function(e,t,r,n){var i=e?t.width:r,o=e?t.height:n;(0,a.isSafari)()&&e&&(o/=window.devicePixelRatio,i/=window.devicePixelRatio);return{dragPreviewWidth:i,dragPreviewHeight:o}}(s,t,f,h),p=v.dragPreviewWidth,y=v.dragPreviewHeight,D=i.offsetX,m=i.offsetY,E=0===m||m;var T;return{x:0===D||D?D:new o.default([0,.5,1],[d.x,d.x/f*p,d.x+p-f]).interpolate(l),y:E?m:function(){var e=new o.default([0,.5,1],[d.y,d.y/h*y,d.y+y-h]).interpolate(g);(0,a.isSafari)()&&s&&(e+=(window.devicePixelRatio-1)*y);return e}()}};var n,a=r(925),i=r(952),o=(n=i)&&n.__esModule?n:{default:n};var s=1;function u(e){var t=e.nodeType===s?e:e.parentElement;if(!t)return null;var r=t.getBoundingClientRect(),n=r.top;return{x:r.left,y:n}}},952:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=function(){function e(e,t){for(var r=0;r<t.length;r++){var n=t[r];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(e,n.key,n)}}return function(t,r,n){return r&&e(t.prototype,r),n&&e(t,n),t}}();var a=function(){function e(t,r){!function(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(this,e);for(var n=t.length,a=[],i=0;i<n;i++)a.push(i);a.sort(function(e,r){return t[e]<t[r]?-1:1});for(var o=[],s=[],u=[],c=void 0,d=void 0,f=0;f<n-1;f++)c=t[f+1]-t[f],d=r[f+1]-r[f],s.push(c),o.push(d),u.push(d/c);for(var h=[u[0]],l=0;l<s.length-1;l++){var g=u[l],v=u[l+1];if(g*v<=0)h.push(0);else{c=s[l];var p=s[l+1],y=c+p;h.push(3*y/((y+p)/g+(y+c)/v))}}h.push(u[u.length-1]);for(var D=[],m=[],E=void 0,T=0;T<h.length-1;T++){E=u[T];var w=h[T],O=1/s[T],b=w+h[T+1]-E-E;D.push((E-w-b)*O),m.push(b*O*O)}this.xs=t,this.ys=r,this.c1s=h,this.c2s=D,this.c3s=m}return n(e,[{key:"interpolate",value:function(e){var t=this.xs,r=this.ys,n=this.c1s,a=this.c2s,i=this.c3s,o=t.length-1;if(e===t[o])return r[o];for(var s=0,u=i.length-1,c=void 0;s<=u;){var d=t[c=Math.floor(.5*(s+u))];if(d<e)s=c+1;else{if(!(d>e))return r[c];u=c-1}}var f=e-t[o=Math.max(0,u)],h=f*f;return r[o]+n[o]*f+a[o]*h+i[o]*f*h}}]),e}();t.default=a},953:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n,a=function(){function e(e,t){for(var r=0;r<t.length;r++){var n=t[r];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(e,n.key,n)}}return function(t,r,n){return r&&e(t.prototype,r),n&&e(t,n),t}}();t.createNativeDragSource=function(e){var t=u[e],r=t.exposeProperty,n=t.matchesTypes,i=t.getData;return function(){function e(){var t,n;!function(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(this,e),this.item=(t={},(n={})[r]=n[r]||{},n[r].get=function(){return console.warn("Browser doesn't allow reading \""+r+'" until the drop event.'),null},function(e,t){for(var r in t){var n=t[r];n.configurable=n.enumerable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(e,r,n)}}(t,n),t)}return a(e,[{key:"mutateItemByReadingDataTransfer",value:function(e){delete this.item[r],this.item[r]=i(e,n)}},{key:"canDrag",value:function(){return!0}},{key:"beginDrag",value:function(){return this.item}},{key:"isDragging",value:function(e,t){return t===e.getSourceId()}},{key:"endDrag",value:function(){}}]),e}()},t.matchNativeItemType=function(e){var t=Array.prototype.slice.call(e.types||[]);return Object.keys(u).filter(function(e){var r=u[e].matchesTypes;return r.some(function(e){return t.indexOf(e)>-1})})[0]||null};var i=function(e){if(e&&e.__esModule)return e;var t={};if(null!=e)for(var r in e)Object.prototype.hasOwnProperty.call(e,r)&&(t[r]=e[r]);return t.default=e,t}(r(899));function o(e,t,r){return t in e?Object.defineProperty(e,t,{value:r,enumerable:!0,configurable:!0,writable:!0}):e[t]=r,e}function s(e,t,r){var n=t.reduce(function(t,r){return t||e.getData(r)},null);return null!=n?n:r}var u=(o(n={},i.FILE,{exposeProperty:"files",matchesTypes:["Files"],getData:function(e){return Array.prototype.slice.call(e.files)}}),o(n,i.URL,{exposeProperty:"urls",matchesTypes:["Url","text/uri-list"],getData:function(e,t){return s(e,t,"").split("\n")}}),o(n,i.TEXT,{exposeProperty:"text",matchesTypes:["Text","text/plain"],getData:function(e,t){return s(e,t,"")}}),n)},954:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.default=function(){n||((n=new Image).src="data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==");return n};var n=void 0},996:function(e,t,r){var n=r(22),a=Object.prototype.hasOwnProperty,i=Array.prototype.splice,o=Object.prototype.toString,s=function(e){return o.call(e).slice(8,-1)},u=Object.assign||function(e,t){return c(t).forEach(function(r){a.call(t,r)&&(e[r]=t[r])}),e},c="function"==typeof Object.getOwnPropertySymbols?function(e){return Object.keys(e).concat(Object.getOwnPropertySymbols(e))}:function(e){return Object.keys(e)};function d(e){if(Array.isArray(e))return u(e.constructor(e.length),e);if("Map"===s(e))return new Map(e);if("Set"===s(e))return new Set(e);if(e&&"object"==typeof e){var t=Object.getPrototypeOf(e);return u(Object.create(t),e)}return e}function f(){var e=u({},h);return t.extend=function(t,r){e[t]=r},t.isEquals=function(e,t){return e===t},t;function t(r,i){"function"==typeof i&&(i={$apply:i}),Array.isArray(r)&&Array.isArray(i)||n(!Array.isArray(i),"update(): You provided an invalid spec to update(). The spec may not contain an array except as the value of $set, $push, $unshift, $splice or any custom command allowing an array value."),n("object"==typeof i&&null!==i,"update(): You provided an invalid spec to update(). The spec and every included key path must be plain objects containing one of the following commands: %s.",Object.keys(e).join(", "));var o=r;return c(i).forEach(function(n){if(a.call(e,n)){var u=r===o;o=e[n](i[n],o,i,r),u&&t.isEquals(o,r)&&(o=r)}else{var c="Map"===s(r)?t(r.get(n),i[n]):t(r[n],i[n]),f="Map"===s(o)?o.get(n):o[n];t.isEquals(c,f)&&(void 0!==c||a.call(r,n))||(o===r&&(o=d(r)),"Map"===s(o)?o.set(n,c):o[n]=c)}}),o}}var h={$push:function(e,t,r){return g(t,r,"$push"),e.length?t.concat(e):t},$unshift:function(e,t,r){return g(t,r,"$unshift"),e.length?e.concat(t):t},$splice:function(e,t,r,a){return function(e,t){n(Array.isArray(e),"Expected $splice target to be an array; got %s",e),p(t.$splice)}(t,r),e.forEach(function(e){p(e),t===a&&e.length&&(t=d(a)),i.apply(t,e)}),t},$set:function(e,t,r){return function(e){n(1===Object.keys(e).length,"Cannot have more than one key in an object with $set")}(r),e},$toggle:function(e,t){v(e,"$toggle");var r=e.length?d(t):t;return e.forEach(function(e){r[e]=!t[e]}),r},$unset:function(e,t,r,n){return v(e,"$unset"),e.forEach(function(e){Object.hasOwnProperty.call(t,e)&&(t===n&&(t=d(n)),delete t[e])}),t},$add:function(e,t,r,n){return y(t,"$add"),v(e,"$add"),"Map"===s(t)?e.forEach(function(e){var r=e[0],a=e[1];t===n&&t.get(r)!==a&&(t=d(n)),t.set(r,a)}):e.forEach(function(e){t!==n||t.has(e)||(t=d(n)),t.add(e)}),t},$remove:function(e,t,r,n){return y(t,"$remove"),v(e,"$remove"),e.forEach(function(e){t===n&&t.has(e)&&(t=d(n)),t.delete(e)}),t},$merge:function(e,t,r,a){var i,o;return i=t,n((o=e)&&"object"==typeof o,"update(): $merge expects a spec of type 'object'; got %s",o),n(i&&"object"==typeof i,"update(): $merge expects a target of type 'object'; got %s",i),c(e).forEach(function(r){e[r]!==t[r]&&(t===a&&(t=d(a)),t[r]=e[r])}),t},$apply:function(e,t){var r;return n("function"==typeof(r=e),"update(): expected spec of $apply to be a function; got %s.",r),e(t)}},l=f();function g(e,t,r){n(Array.isArray(e),"update(): expected target of %s to be an array; got %s.",r,e),v(t[r],r)}function v(e,t){n(Array.isArray(e),"update(): expected spec of %s to be an array; got %s. Did you forget to wrap your parameter in an array?",t,e)}function p(e){n(Array.isArray(e),"update(): expected spec of $splice to be an array of arrays; got %s. Did you forget to wrap your parameters in an array?",e)}function y(e,t){var r=s(e);n("Map"===r||"Set"===r,"update(): %s expects a target of type Set or Map; got %s",t,r)}e.exports=l,e.exports.default=l,e.exports.newContext=f}}]);