import React, {Component} from 'react';
import { base } from 'nc-lightapp-front';
// import { Button } from 'tinper-bee';
const { NCModal } = base

class ModalDemo1 extends Component {
    constructor(props) {
        super(props);
        this.state = {
            showModal: false
        };
        this.close = this.close.bind(this);
        this.open = this.open.bind(this);
    }

    // componentDidMount() {
    //     debugger
    //     this.props.onRef(this)
    // }

    close() {
        this.setState({ showModal: false });
    }

    open() {
        debugger
        this.setState({ showModal: true });
    }
    render () {
        return (
            <div>
              <Button color="primary" onClick={this.open}>
                点击打开模态框
              </Button>
              <NCModal 
                  show = {
                      this.state.showModal
                  }
                  onHide = {
                      this.close
                  }
              >
                <NCModal.Header  closeButton={true}>
                  <NCModal.Title>标题</NCModal.Title>
                  <i className="dnd-cancel" onClick={()=>{}}>我绑定了要执行的事件</i>
                </NCModal.Header>

                <NCModal.Body>
                  正文描述。。。
                </NCModal.Body>

                <NCModal.Footer>
                  <Button>关闭</Button>
                  <Button color="primary">确认</Button>
                </NCModal.Footer>

              </NCModal>
            </div>
        );
    }
};


export default ModalDemo1;