
package nc.vo.adprepare.xunprojectplan;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggXunprojectplanHVOMeta extends AbstractBillMeta{
        
        public AggXunprojectplanHVOMeta(){
                this.init();
        }
        
        private void init() {
                this.setParent(nc.vo.adprepare.xunprojectplan.XunprojectplanHVO.class);
                this.addChildren(nc.vo.adprepare.xunprojectplan.XunprojectplanBVO.class);
        }
}