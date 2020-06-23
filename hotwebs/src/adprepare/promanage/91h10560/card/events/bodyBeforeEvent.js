import { pageConfig } from '../../common/const';
const { cardTableId } = pageConfig;
export default function bodyBeforeEvent(props, moduleId, key, value, index, record) {
	let editFlag = true;
	editFlag = isEnable.call(this, props, moduleId, key, value, index, record);
	return editFlag;
}

function isEnable(props, moduleId, key, value, index, record) {
	if (moduleId == cardTableId) {
		//配置申请页签

		return true;
	}
}
