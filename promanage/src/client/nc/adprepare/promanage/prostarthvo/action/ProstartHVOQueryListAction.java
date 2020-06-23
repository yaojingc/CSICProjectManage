
package nc.adprepare.promanage.prostarthvo.action;

import java.util.ArrayList;
import java.util.List;

import nc.bs.logging.Logger;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nccloud.framework.web.ui.model.PageInfo;
import nc.vo.adprepare.projectstart.AggProstartHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.pub.Constructor;
import nccloud.base.exception.ExceptionUtils;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nccloud.framework.web.action.itf.ICommonAction;
import nccloud.framework.web.container.IRequest;
import nccloud.framework.web.json.JsonFactory;
import nccloud.framework.web.querytemplet.QueryUtil4NCC;
import nccloud.framework.web.ui.pattern.grid.Grid;
import nccloud.framework.web.ui.pattern.grid.GridOperator;
import nc.adprepare.promanage.prostarthvo.promanage.bean.PageQueryVO;
import nc.adprepare.promanage.prostarthvo.promanage.util.CommonUtil;

/**
 * �б���ѯ����ѯ����������
 * @version  @since v3.5.6-1903
 */
public class ProstartHVOQueryListAction implements ICommonAction {

  @Override
  public Object doAction(IRequest paramIRequest) {
    PageQueryVO page = null;
    QueryTreeFormatVO queryParam = this.getQueryParam(paramIRequest);
    try {

      // 1�� ��ȡscheme
      IQueryScheme scheme = this.getScheme(queryParam);
      // 2�����÷���,��ȡVO��Ϣ(ƽ̨Ĭ�����ɷ�������Ч�����⣬���ʵ��Ҫ�ĵ�)
      AggProstartHVO[] aggvos =
          CommonUtil.getFinancingcostMaintainService().query(scheme);
      // ��ѯ����(scheme);
      if ((aggvos != null) && (aggvos.length > 0)) {
        // 3��������ҳ
        String[] pks = this.getPks(aggvos);
        AggProstartHVO[] bills =
            this.getDefaulePageBill(queryParam, aggvos);
        page = new PageQueryVO(pks, bills);
      }
      else {
        page = this.createNullPage();
      }
      // 4��ת��grid��Ϣ������ǰ��
      return this.transPageInfoToGrid(page, queryParam,
          queryParam.getPageCode());
    }
    catch (BusinessException ex) {
      // �����쳣��Ϣ
      Logger.error(ex);
      ExceptionUtils.wrapException(ex);
    }
    return null;
  }

  /**
   * ת��Grid��Ϣ
   *
   * @param pagevo
   * @param pageSize
   * @param pagecode
   * @return
   */
  private Grid covert(PageQueryVO pagevo, int pageSize, String pagecode) {
    AggProstartHVO[] bills =
        (AggProstartHVO[]) pagevo.getCurrentPageBills();

    Grid grid = null;
    if (bills != null) {
      int size = bills.length > pageSize ? pageSize : bills.length;
      Object[] heads = new Object[size];

      for (int i = 0; i < size; i++) {
        heads[i] = bills[i].getParent();
      }
      GridOperator operator = new GridOperator(pagecode);
      grid = operator.toGrid(heads);
      grid.getModel().setAllpks(pagevo.getPks());
    }
    return grid;
  }

  /**
   * ������ҳ����Ϣ
   *
   * @return
   */
  private PageQueryVO createNullPage() {
    String[] ids = new String[0];
    AggProstartHVO[] bills =
        Constructor.construct(AggProstartHVO.class, 0);
    PageQueryVO page = new PageQueryVO(ids, bills);
    return page;
  }

  /**
   * ����Ĭ��ҳ��
   *
   * @param info
   * @param aggvos
   * @return
   */
  private AggProstartHVO[] getDefaulePageBill(QueryTreeFormatVO info,
      AggProstartHVO... aggvos) {
    String pageSizeStr = info.getPageInfo().getPageSize();
    int pageSize = 10;
    if ((pageSizeStr != null) && (pageSizeStr.length() > 0)) {
      pageSize = Integer.parseInt(pageSizeStr);
    }
    info.getPageInfo().setPageIndex("0");
    List<AggProstartHVO> billLst = new ArrayList<AggProstartHVO>();
    for (int i = 0; (i < aggvos.length) && (i < pageSize); i++) {
      AggProstartHVO bill = new AggProstartHVO();

      bill.setParent(aggvos[i].getParent());
      billLst.add(bill);
    }
    return billLst.toArray(new AggProstartHVO[0]);
  }

  /**
   * ��ȡ������Ϣ
   *
   * @param aggvos
   * @return
   */
  private String[] getPks(AggProstartHVO... aggvos) {
    List<String> pks = new ArrayList<String>();
    for (AggProstartHVO bill : aggvos) {
      pks.add(bill.getPrimaryKey());
    }
    return pks.toArray(new String[0]);
  }

  /**
   * ��ȡ��ѯ����
   *
   * @param paramIRequest
   * @return
   */
  private QueryTreeFormatVO getQueryParam(IRequest paramIRequest) {
    String strRead = paramIRequest.read();
    QueryTreeFormatVO queryParam =
        JsonFactory.create().fromJson(strRead, QueryTreeFormatVO.class);
    return queryParam;
  }

  /**
   * ��ȡ��ѯ����
   *
   * @param queryParam
   * @return
   */
  private IQueryScheme getScheme(QueryTreeFormatVO queryParam) {
    QueryUtil4NCC queryutil = new QueryUtil4NCC(queryParam);
    IQueryScheme scheme = queryutil.convertCondition();
    return scheme;
  }

  /**
   * ��ҳ��
   *
   * @param pageInfo
   * @param length
   * @return
   */
  private int getTotalPage(nccloud.framework.web.ui.model.PageInfo pageInfo,
      int length) {
    int size = pageInfo.getPageSize();
    int total = 0;
    if ((length % size) == 0) {
      total = length / size;
    }
    else {
      total = (length / size) + 1;
    }
    return total;
  }

  /**
   * ҳ������
   *
   * @param retObj
   * @param pagevo
   * @param pageSize
   * @param pageIndex
   * @return
   */
    private void pageSet(Grid grid, PageQueryVO pagevo, int pageSize,
    int pageIndex) {
        PageInfo pageInfo = new PageInfo();
        pageInfo.setTotal(pagevo.getPks().length);
        pageInfo.setPageSize(pageSize);
        pageInfo.setPageIndex(pageIndex);
        pageInfo.setTotalPage(this.getTotalPage(pageInfo, pagevo.getPks().length));

        grid.getModel().setPageinfo(pageInfo);
    }

  /**
   * page��Ϣתǰ����Ҫ��gridģ��
   *
   * @param pagevo
   * @param info
   * @param pagecode
   * @return
   */
  private Object transPageInfoToGrid(PageQueryVO pagevo,
      QueryTreeFormatVO info, String pagecode) {
        Grid grid = null;
    int pageSize = Integer.parseInt(info.getPageInfo().getPageSize());
    int pageIndex = Integer.parseInt(info.getPageInfo().getPageIndex());
    if (pagevo != null) {
      if (pagevo.getCurrentPageBills().length == 0) {
        return null;
      }
      grid = this.covert(pagevo, pageSize, pagecode);

      this.pageSet(grid, pagevo, pageSize, pageIndex);
    }
    return grid;
  }
}