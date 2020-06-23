import React, { Component } from 'react';
import './gtt.less';
import moment from 'moment';
import { ButtonGroup, Icon, Button } from 'tinper-bee';
const exceedColor = 'red';
const actualColor = '#00ff2c';
const planColor = '#69c0f4';

export default class Gtt extends Component {
    constructor(props) {
        super(props);
        this.state = {
            // data: props.data
            type: 'd', //d m y
            btnColors: {
                'y': 'secondary',
                'm': 'secondary',
                'd': 'primary',
            },
            useCase: props.useCase
        };
    }

    shouldComponentUpdate = (newProps, newState) => {
        return true;
    }

    onDateClick = (id) => {
        for (let i in this.state.btnColors) {
            this.state.btnColors[i] = 'secondary';
        }
        this.state.btnColors[id] = 'primary';
        this.setState({
            type: id,
        })
    }

    render() {
        let data = this.props.data;
        let min = '3000-1-1';
        let max = '1970-1-1';
        let today = moment().format('YYYY-MM-DD');
        let colors = ['#c23531', '#2f4554', '#61a0a8', '#d48265', '#91c7ae', '#749f83', '#ca8622', '#bda29a', '#6e7074', '#546570', '#c4ccd3'];
        data.forEach(cur => {
            let {
                plan_start_date,
                plan_end_date,
                'pk_progress.real_start_date': real_start_date,
                'pk_progress.real_end_date': real_end_date,
                'pk_progress.last_record_time': last_record_time,
                task_status,
            } = cur.values;
            let start = plan_start_date.value;
            let end = plan_end_date.value;
            let acutalStart = real_start_date && real_start_date.value;
            let acutalEnd = real_end_date && real_end_date.value;
            last_record_time = last_record_time && last_record_time.value;
            if (start && end) {
                if (moment(start).isBefore(min)) {
                    min = start;
                }
                if (moment(end).isAfter(max)) {
                    max = end;
                }
            }
            if (task_status) {
                if (task_status.value == '已完成') {
                    if (moment(acutalStart).isBefore(min)) {
                        min = acutalStart;
                    }
                    if (moment(acutalEnd).isAfter(max)) {
                        max = acutalEnd;
                    }
                } else {
                    if (acutalStart) {
                        if (moment(acutalStart).isBefore(min)) {
                            min = acutalStart;
                        }
                        if (moment(last_record_time).isAfter(max)) {
                            max = last_record_time;
                        }
                    }
                    if (moment(today).isAfter(end) && moment(today).isAfter(max)) {
                        max = today;
                    }
                }
            }
        })
        let daywidth = 20;
        let monthArr = [];
        let yearArr = [];
        let points = {};
        let pointsActual = {};
        let pointsExceed = {};
        let lines = [];
        let alldays = 0;
        if (min == '3000-1-1' || max == '1970-1-1') {

        } else {
            if (this.state.type == 'd') {
                daywidth = 20;
                min = moment(min).date(1);
                max = moment(max).date(1);
            } else if (this.state.type == 'm') {
                daywidth = 3;
                min = moment(min).dayOfYear(1);
                max = moment(max).month(11).date(1);
            } else if (this.state.type == 'y') {
                daywidth = 1;
                min = moment(min).dayOfYear(1);
                max = moment(max).month(11).date(1);
            }
            alldays = moment(max).add(1, 'M').diff(min, 'days');

            for (let i = moment(min); i <= max;) {
                monthArr.push(moment(i));
                i.add(1, 'months');
            }
            for (let i = moment(min); i <= max;) {
                yearArr.push(moment(i));
                i.add(1, 'y');
            }
            data.forEach((cur, index) => {
                let {
                    plan_start_date,
                    plan_end_date,
                    pk_time_plan_item,
                    'pk_progress.real_start_date': real_start_date,
                    'pk_progress.real_end_date': real_end_date,
                    'pk_progress.percentage': percentage,
                    'pk_progress.last_record_time': last_record_time,
                    task_status,
                } = cur.values;
                let b = plan_start_date.value;
                let e = plan_end_date.value;
                let pk = pk_time_plan_item.value.trim();
                let acutalStart = real_start_date && real_start_date.value;
                let acutalEnd = real_end_date && real_end_date.value;
                let progress = percentage && percentage.value;
                last_record_time = last_record_time && last_record_time.value;

                points[pk] = {
                    left: moment(b).diff(min, 'days') * daywidth,
                    top: 30 * index + 3,
                    width: (moment(e).diff(b, 'days') + 1) * daywidth,
                    right: (moment(e).diff(min, 'days') + 1) * daywidth,
                    pk
                }

                if (task_status) {
                    if (acutalStart) {
                        if (task_status.value != '已完成') {
                            acutalEnd = last_record_time;
                        }
                        pointsActual[pk] = {
                            left: moment(acutalStart).diff(min, 'days') * daywidth,
                            top: 30 * index + 13,
                            width: (moment(acutalEnd).diff(acutalStart, 'days') + 1) * daywidth,
                            right: (moment(acutalEnd).diff(min, 'days') + 1) * daywidth,
                            pk,
                            progress,
                            color: actualColor
                        }
                    }
                    if (task_status.value != '已完成') {
                        if (moment(today).isAfter(e)) {
                            pointsExceed[pk] = {
                                left: (moment(e).diff(min, 'days') + 1) * daywidth,
                                top: 30 * index + 23,
                                width: (moment(today).diff(e, 'days') + 1) * daywidth,
                                right: (moment(today).diff(min, 'days') + 1) * daywidth,
                                pk,
                                progress,
                                color: exceedColor
                            }
                        }
                    } else {
                        if (moment(acutalEnd).isAfter(e)) {
                            pointsExceed[pk] = {
                                left: (moment(e).diff(min, 'days') + 1) * daywidth,
                                top: 30 * index + 23,
                                width: (moment(acutalEnd).diff(e, 'days')) * daywidth,
                                right: (moment(acutalEnd).diff(min, 'days') + 1) * daywidth,
                                pk,
                                progress,
                                color: exceedColor
                            }
                        }
                    }
                }
            })

            data.forEach((cur, index) => {
                debugger
                if (cur.values.pk_front_plan && cur.values.pk_front_plan.value) {
                    let parent = points[cur.values.pk_front_plan.value.trim()];//cur.values.pk_front_plan.value

                    let self = points[cur.values.pk_time_plan_item.value.trim()];
                    
                    lines.push({
                        x1: parent.right,
                        y1: parent.top,
                        x2: self.left,
                        y2: self.top,
                    })
                }
            })
        }

        return (
            <div className={`${this.props.containerClass} treetablegtt`}>
                <div className='gtt-container'>
                    {
                        this.state.useCase == 'planprogress' &&
                        <div className='gtt-legend-container'>
                            <span style={{ backgroundColor: planColor }} className='gtt-legend-item'></span>
                            <span className='gtt-legend-text'>计划</span>
                            <span style={{ backgroundColor: actualColor }} className='gtt-legend-item'></span>
                            <span className='gtt-legend-text'>实际</span>
                            <span style={{ backgroundColor: exceedColor }} className='gtt-legend-item'></span>
                            <span className='gtt-legend-text'>超期</span>
                        </div>
                    }
                    <ButtonGroup className='gtt_head_btngroup1'>
                        <Button size='sm' onClick={this.onDateClick.bind(this, 'y')} colors={this.state.btnColors['y']}>年</Button>
                        <Button size='sm' onClick={this.onDateClick.bind(this, 'm')} colors={this.state.btnColors['m']}>月</Button>
                        <Button size='sm' onClick={this.onDateClick.bind(this, 'd')} colors={this.state.btnColors['d']}>日</Button>
                    </ButtonGroup>
                    <div className="gtt-head1">
                    </div>
                    <div className="gtt-head2" style={{ width: alldays * daywidth }}>

                        {this.state.type == 'y' &&
                            yearArr.map(cur => {
                                let days = cur.endOf('year').diff(moment(cur).startOf('year'), 'days') + 1;
                                return (
                                    <div
                                        style={{ width: days * daywidth }}
                                        className='gtt_head_year_y'>{moment(cur).format('YYYY年')}</div>
                                );
                            })
                        }
                        {this.state.type == 'm' &&
                            yearArr.map(cur => {
                                let monthArr = Array.from(new Array(12), (cur, index) => index);
                                return (
                                    <div className='gtt_head_yearcontainer_m'
                                    >
                                        <div className='gtt_head_year_m'>{moment(cur).format('YYYY年')}</div>
                                        {
                                            monthArr.map((curmonth, index) => {
                                                let month = moment(cur).month(curmonth);
                                                let days = month.endOf('M').diff(moment(month).startOf('M'), 'days') + 1;
                                                return (
                                                    <div
                                                        className='gtt_head_month_m'
                                                        style={{ width: days * daywidth }}
                                                    >{month.format('YYYY年M月')}</div>
                                                )
                                            })
                                        }
                                    </div>
                                );
                            })
                        }
                        {this.state.type == 'd' &&
                            monthArr.map(cur => {
                                let days = moment(cur).endOf('M').diff(moment(cur).startOf('M'), 'days') + 1;
                                let daysArr = new Array(days).fill(1);
                                return (
                                    <div className='gtt_head_duration'
                                    >
                                        <div className='gtt_head_year'>{moment(cur).format('YYYY年M月')}</div>
                                        <div>
                                            {
                                                daysArr.map((cur, index) => {
                                                    return (
                                                        <span
                                                            style={{ width: daywidth }}
                                                            className='gtt_head_day'>{index + 1}</span>
                                                    )
                                                })
                                            }
                                        </div>
                                    </div>
                                )
                            })
                        }
                    </div>
                    <div className="body-container" style={{ width: alldays * daywidth }}>
                        {
                            data.map(cur => {
                                return (
                                    <div className='horizontal-line' />
                                )
                            })
                        }
                        {
                            Object.getOwnPropertyNames(points).map((cur, index) => {
                                let { left, top, width } = points[cur];
                                return (
                                    <div
                                        className='planbar'
                                        style={{
                                            position: 'absolute',
                                            left,
                                            top,
                                            width,
                                            height: 5,
                                            backgroundColor: planColor
                                        }}>
                                    </div>
                                )

                            })
                        }
                        {
                            Object.getOwnPropertyNames(pointsActual).map((cur, index) => {
                                let { left, top, width, color, progress } = pointsActual[cur];
                                return (
                                    <div
                                        className='planbar'
                                        style={{
                                            position: 'absolute',
                                            left,
                                            top,
                                            width,
                                            height: 5,
                                            backgroundColor: color,
                                            fontSize: 10,
                                        }}>
                                        {`${progress}%`}
                                    </div>
                                )

                            })
                        }
                        {
                            Object.getOwnPropertyNames(pointsExceed).map((cur, index) => {
                                let { left, top, width, color, progress } = pointsExceed[cur];
                                return (
                                    <div
                                        className='planbar'
                                        style={{
                                            position: 'absolute',
                                            left,
                                            top,
                                            width,
                                            height: 5,
                                            backgroundColor: color,
                                            fontSize: 10,
                                        }}>
                                    </div>
                                )

                            })
                        }
                        {
                            lines.map((cur, index) => {
                                let x1 = cur.x1;
                                let y1 = cur.y1;
                                let x2 = cur.x2;
                                let y2 = cur.y2;
                                let middle1 = [x1, (y1 + y2) / 2];
                                let middle2 = [x2, (y1 + y2) / 2];
                                let color = planColor;//colors[index % 11]
                                return (
                                    <div>
                                        {y1 < y2 ?
                                            <div style={{
                                                position: 'absolute',
                                                left: x1,
                                                top: y1,
                                                width: 2,
                                                height: (y2 - y1) / 2 - 5,
                                                backgroundColor: color
                                            }}></div>
                                            :
                                            <div style={{
                                                position: 'absolute',
                                                left: x1,
                                                top: (y1 + y2) / 2 + 5,
                                                width: 2,
                                                height: (y1 - y2) / 2 - 5,
                                                backgroundColor: color
                                            }}></div>
                                        }

                                        <div style={{
                                            position: 'absolute',
                                            left: Math.min(x1, x2),
                                            top: (y1 + y2) / 2 + (y1 < y2 ? -5 : 5),
                                            height: 2,
                                            width: Math.abs(x1 - x2),
                                            backgroundColor: color
                                        }}></div>
                                        {y1 < y2 ?
                                            <div style={{
                                                position: 'absolute',
                                                left: x2,
                                                top: (y1 + y2) / 2 - 5,
                                                width: 2,
                                                height: (y2 - y1) / 2 + 5,
                                                backgroundColor: color
                                            }}></div>
                                            :
                                            <div style={{
                                                position: 'absolute',
                                                left: x2,
                                                top: y2,
                                                width: 2,
                                                height: (y1 - y2) / 2 + 5,
                                                backgroundColor: color
                                            }}></div>
                                        }
                                        {y1 > y2 ?
                                            <div className='uparrow'
                                                style={{
                                                    position: 'absolute',
                                                    left: x2,
                                                    top: y2
                                                }}>
                                            </div>
                                            :
                                            <div className='downarrow'
                                                style={{
                                                    position: 'absolute',
                                                    left: x2,
                                                    top: y2 - 7
                                                }}>
                                            </div>
                                        }
                                        <div>
                                        </div>
                                    </div>
                                )
                            })

                        }
                    </div>
                </div>
            </div >
        )
    }
}