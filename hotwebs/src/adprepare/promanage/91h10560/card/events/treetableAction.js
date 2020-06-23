import { pageConfig } from '../../common/const';
const { cardPageId, cardTableId, cardFormId, primaryKey, dataSource, pretasksUrl } = pageConfig;
import emptyRow from './treetableRow';

export function loadTreeData() {
    let data = this.treetableData;//this.props.cardTable.getAllRows(cardTableId);
    let treeData = data.map(cur => {
        let hasChildren = hasChildrenFn(cur.values.children);
        return {
            refcode: cur.values.full_seq.value,
            refname: cur.values.full_seq.value + ' ' + (cur.values.name.value || ''),
            refpk: cur.values.pk_time_plan_item.value,
            values: {},
            pid: cur.values.pk_parent.value,
            isleaf: !hasChildren
        }
    });

    return {
        "rows": treeData
    };
}

export function hasChildrenFn(children) {
    if (children && children.value && children.value.split(',').filter(cur => cur != '').length > 0) {
        return true;
    }
    return false;
}

export function filterData(treetableData) {
    return treetableData.filter(cur => !(cur.values.line_state && cur.values.line_state.value === '3'));
}

export function setWidth(props) {
    let data = props.cardTable.getVisibleRows(cardTableId);
    let maxlevel = 1;
   
    data.forEach(cur => {
        maxlevel = Math.max(maxlevel, cur.values.plan_level.value);
    })
    // Array.from(document.getElementsByClassName('table-opr1')).forEach(cur => {
    //     cur.style.width = maxlevel * 20 + 40 + 'px';

    // })
    let meta = props.meta.getMeta();
    meta[cardTableId].items.find((cur, index) => cur.attrcode == 'openclose').width = maxlevel * 20 + 20;
    props.meta.setMeta(meta, () => {
    });
}



export function oncloseclick(props, record, index) {
    let data = this.treetableData;//props.cardTable.getAllRows(cardTableId);
    index = data.findIndex(cur => cur.rowid == record.rowid);
    let plan_level = record.values.plan_level.value;

    data[index].values.open.value = false;
    let i1 = index + 1;
    for (; i1 < data.length; i1++) {
        let targetRecord = data[i1];
        if (targetRecord.values.plan_level.value <= plan_level) {
            break;
        } else {
            targetRecord.values.line_state = { value: '3' };
            targetRecord.values.open = { value: false };
        }
    }
    let showRows = filterData(data);
    props.cardTable.setTableData(cardTableId, { rows: showRows }, () => {
        setWidth.call(this, props);
    });
    this.setState({
        data: showRows
    })
}

export function onopenclick(props, record, index) {
    let data = this.treetableData; //props.cardTable.getAllRows(cardTableId);
    index = data.findIndex(cur => cur.rowid == record.rowid);
    let plan_level = record.values.plan_level.value;

    data[index].values.open = { value: true };
    let i1 = index + 1;
    for (; i1 < data.length; i1++) {
        let targetRecord = data[i1];
        if (targetRecord.values.plan_level.value <= plan_level) {
            break;
        } else if (targetRecord.values.plan_level.value == plan_level + 1) {
            targetRecord.values.line_state = { value: '' };
        }
    }
    let showRows = filterData(data);
    props.cardTable.setTableData(cardTableId, { rows: showRows }, () => {
        //setWidth.call(this, props);
    });
    this.setState({
        data: showRows
    })
}

export function addBrother(e, props, record, index) {
    debugger


    let { plan_level, full_seq, pk_parent, pk_time_plan_item,numberindex } = record.values;
    let newpk = new Date().getTime().toString();
    let data =  props.cardTable.getAllRows(cardTableId);
    index = data.findIndex(cur => cur.rowid == record.rowid);
    let parentindex = data.findIndex(cur => cur.values.pk_time_plan_item.value == pk_parent.value);
    let levelCur = record.values.plan_level.value;

    let i1 = index + 1;
    for (; i1 < data.length; i1++) {
        let targetRecord = data[i1];
        if (targetRecord.values.plan_level.value <= plan_level.value) {
            break;
        }
    }

    let pre = full_seq.value;
    let self = pre.split('.');
    self[levelCur - 1] = (parseInt(self[levelCur - 1]) + 1).toString();
    let newRow = {};
    for (let field in emptyRow) {
        newRow[field] = { value: emptyRow[field].value, display: emptyRow[field].display }
    }
    data.splice(i1, 0, {
        values: {
            ...newRow,
            plan_level: { value: plan_level.value },
            children: { value: '' },
            full_seq: {
                value: self.join('.'),
                display: self.join('.')
            },
            pk_time_plan_item: { value: newpk },
            pk_parent: pk_parent,
        },
        status: '2',
        rowid: String(new Date().getTime()).slice(-5) + Math.random().toString(12),
    });
    if (parentindex != -1) {
        let brothers = (data[parentindex].values.children.value || '').split(',').filter(cur => cur != '');
        brothers.splice(brothers.findIndex(cur => cur == pk_time_plan_item.value) + 1, 0, newpk);
        data[parentindex].values.children.value = brothers.join(',');
    }

    for (let i = i1 + 1; i < data.length; i++) {
        let cur = data[i].values;
        if (cur.plan_level.value < plan_level.value) {
            break;
        }

        let old = cur.full_seq.value;
        let newvalue = old.split('.');
        newvalue[levelCur - 1] = (parseInt(newvalue[levelCur - 1]) + 1).toString();
        cur.full_seq = {
            display: newvalue.join('.'),
            value: newvalue.join('.')
        }
    }
    dealPreTask(data);
    props.cardTable.setTableData(cardTableId, { rows: filterData(data) }, () => {
        setWidth.call(this, props);
    })


    e.preventDefault();
}

export function addSub(e, props, record, index) {
    debugger
    let { plan_level, full_seq, pk_parent, children, pk_time_plan_item } = record.values;
    let newpk = new Date().getTime().toString();
    let data = props.cardTable.getAllRows(cardTableId);// props.cardTable.getAllRows(cardTableId);  this.treetableData
    index = data.findIndex(cur => cur.rowid == record.rowid);
    let levelCur = plan_level.value;

    let i1 = index + 1;
    for (; i1 < data.length; i1++) {
        let targetRecord = data[i1];
        if (targetRecord.values.plan_level.value <= plan_level.value) {
            break;
        }
    }

    let pre = full_seq.value;
    let result = pre + '.' + ((children.value || '').split(',').filter(cur => cur != '').length + 1).toString();
    let newRow = {};
    for (let field in emptyRow) {
        newRow[field] = { value: emptyRow[field].value, display: emptyRow[field].display }
    }
    data.splice(i1, 0, {
        values: {
            ...newRow,
            plan_level: { value: levelCur + 1 },
            children: { value: '' },
            full_seq: {
                value: result,
                display: result
            },
            pk_parent: pk_time_plan_item,
            pk_time_plan_item: { value: newpk, display: newpk, }
        },
        status: '2',
        rowid: String(new Date().getTime()).slice(-5) + Math.random().toString(12),
    });
    for (let i = index; i < data.length; i++) {
        let cur = data[i].values;
        if (i == index) {
            cur.open.value = true;
            cur.children.value = (children.value || '') + ',' + newpk;
        } else if (cur.plan_level.value <= levelCur) {
            break;
        } else if (cur.pk_parent.value == pk_time_plan_item.value) {
            cur.line_state = {
                value: ''
            }
        }
    }
    dealPreTask(data);
    props.cardTable.setTableData(cardTableId, { rows: filterData(data) }, () => {
        setWidth.call(this, props);
    });
    e.preventDefault();
}

export function deleteRow(e, props, record, index) {


    props.cardTable.delRowsByIndex("card_body", index);
    debugger

    /* let { plan_level, full_seq, pk_parent, children, pk_time_plan_item ,numberindex} = record.values;
    let data = props.cardTable.getAllRows(cardTableId);//props.cardTable.getAllRows(cardTableId);    this.treetableData


    index = data.findIndex(cur => cur.rowid == record.rowid);


    let parentindex = data.findIndex(cur => cur.values.pk_time_plan_item.value == pk_parent.value);
    let levelCur = plan_level.value;


    let i1 = index + 1;
    let deletedArr = [index];
    for (; i1 < data.length; i1++) {
        let cur = data[i1];
        if (cur.values.plan_level.value <= plan_level.value) {
            break;
        } else {
            deletedArr.push(i1);
        }
    }
    // props.cardTable.delRowsByIndex(cardTableId, deletedArr);
    // data = props.cardTable.getAllRows(cardTableId);
    let deleterows = data.splice(index, deletedArr.length);
    this.deletedRows = this.deletedRows.concat(deleterows.filter(cur => cur.status !== '2'));
    // data = data.filter((cur, index) => !deletedArr.includes(index));
    if (data.length == 0) {
        let newpk = new Date().getTime().toString();
        props.cardTable.addRow(cardTableId, 0, {
            plan_level: { value: 1 },
            children: { value: '' },
            full_seq: {
                value: '1',
                display: '1'
            },
            pk_time_plan_item: { value: newpk },
            pk_parent: { value: '' }
        },
            true,
            () => {
                this.treetableData = [...this.props.cardTable.getAllRows(cardTableId)];
                setWidth.call(this, props);
            });
        return;
    }
    if (parentindex != -1) {
        let brothers = (data[parentindex].values.children.value || '').split(',').filter(cur => cur != '');
        brothers.splice(brothers.findIndex(cur => cur == pk_time_plan_item.value), 1);
        data[parentindex].values.children.value = brothers.join(',');
    }

    for (let i = index; i < data.length; i++) {
        let cur = data[i].values;
        if (cur.plan_level.value < plan_level.value) {
            break;
        }

        let old = cur.full_seq.value;
        let newvalue = old.split('.');
        newvalue[levelCur - 1] = (parseInt(newvalue[levelCur - 1]) - 1).toString();
        newvalue = newvalue.join('.');

        cur.full_seq = {
            display: newvalue,
            value: newvalue
        }
        cur.line_state = {
            value: '1'
        }
    }
    dealPreTask(data);
    props.cardTable.setTableData(cardTableId, { rows: filterData(data) }, () => {
        setWidth.call(this, props);
    })

    e.preventDefault(); */
}

export function dealDataFromBack(body) {
    let rows = body[cardTableId].rows;
    // rows.sort((a, b) => {
    //     return parseInt(a.values.rowno.value) - parseInt(b.values.rowno.value);
    // })
    let temp = {};
    for (let i = 0; i < rows.length; i++) {
        let cur = rows[i];
        cur.values.open = { value: true };
        cur.values.plan_level = { value: parseInt(cur.values.plan_level.value) }
        let pk_parent = cur.values.pk_parent.value;
        if (pk_parent) {
            temp[pk_parent] = (temp[pk_parent] || []).concat([cur.values.pk_time_plan_item.value]);
        }
    }
    for (let j = 0; j < rows.length; j++) {
        let cur = rows[j];
        if (temp[cur.values.pk_time_plan_item.value]) {
            cur.values.children.value = temp[cur.values.pk_time_plan_item.value].join(',');
        }
    }
    this.treetableData = rows;
    this.deletedRows = [];
}

export function dealDataBeforeToBack(body, saveFlag) {
    body[cardTableId].rows = this.treetableData;
    if (saveFlag) {
        this.deletedRows.forEach(cur => cur.status = '3');
        body[cardTableId].rows = body[cardTableId].rows.concat(this.deletedRows);
    }
    body[cardTableId].rows.forEach((cur, index) => {
        let full_seq = cur.values.full_seq.value;
        let level = cur.values.plan_level.value;
        cur.values.seq = {
            value: full_seq.split('.')[level - 1]
        }
        cur.values.plan_level = {
            value: level + ''
        }
        cur.values.rowno = {
            value: index + 1 + ''
        }
    })
}

export function dealPreTask(data) {
    let pre = {};
    data.forEach(cur => {
        if (cur.status !== '3') {
            pre[cur.values.pk_time_plan_item.value] = {
                display: cur.values.full_seq.value,
                value: cur.values.pk_time_plan_item.value
            }
        }
    })
    data.forEach(cur => {
        if (cur.values.pk_front_plan.value) {
            cur.values.pk_front_plan = pre[cur.values.pk_front_plan.value] || {
                display: null,
                value: null
            };
        }
    })
}
