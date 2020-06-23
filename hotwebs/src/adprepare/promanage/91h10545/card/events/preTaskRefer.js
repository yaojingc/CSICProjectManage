import React, { Component } from 'react';
import { base, high } from 'nc-lightapp-front';
const { PopRefer } = high.Refer;

export default class Ref extends PopRefer {
    constructor(props) {
        super(props);
        this.state = {
            ...this.state, // 继承state
            // flag: '1' // 自定义扩展state
            
        };
    }

    loadTreeData = () => {
        return Promise.resolve(this.props.loadTreeData());
    }
}
