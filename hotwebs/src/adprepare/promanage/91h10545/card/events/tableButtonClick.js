import { pageConfig } from '../../common/const';
import { resetTotal } from '../../../../../pmbd/pmpub/utils/calculateTax';
import { setBatchBtnsEnable, openCard } from '../../../../../pmbd/pmpub/utils/cardUtils';

const { cardFormId, cardTableId, dataSource } = pageConfig;

export function tableButtonClick(props, tableId, record, index, key) {
	switch (key) {
		case 'DelLine':
			props.cardTable.delRowsByIndex(tableId, index);
			resetTotal(props, cardFormId, cardTableId, dataSource);
			setBatchBtnsEnable.call(this, props, tableId);
			break;
		case 'OpenCard':
			openCard.call(this, props, tableId, record, index);
			break;
	}
}


