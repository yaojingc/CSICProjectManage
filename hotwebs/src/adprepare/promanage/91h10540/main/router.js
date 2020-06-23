/*
 * @Author: Your name
 * @Date:   2020-05-28 17:33:04
 * @Last Modified by:   Your name
 * @Last Modified time: 2020-05-28 17:33:04
 */
import { asyncComponent } from 'nc-lightapp-front';
import list from '../list';

/**
* @description: 页面路由
* 保留注释 webpackChunkName:项目名/模块名/组件名/...
*/
const card = asyncComponent(() =>
        import(/*webpackChunkName: "fmc/fmc/cost/card/card"*/ /* webpackMode: "eager" */ '../card')
);

const routes = [
        {
                path: '/',
                component: list,
                exact: true
        },
        {
                path: '/list',
                component: list
        },
        {
                path: '/card',
                component: card
        }
];

export default routes;
