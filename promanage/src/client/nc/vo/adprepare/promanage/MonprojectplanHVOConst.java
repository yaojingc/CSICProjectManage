
package nc.vo.adprepare.promanage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.pub.ISuperVO;
import nccloud.vo.tmpub.precison.PrecisionField;
/**
 * ������
 * @since v3.5.6-1903
 */
public class MonprojectplanHVOConst {
         /**
       * ���ݲ���
       */
      public static String CONST_ACTION_APPROVE = "APPROVE"; // ����

      public static String CONST_ACTION_DELETE = "DELETE"; // ɾ��

      public static String CONST_ACTION_DELVERSION = "DELVERSION"; // ɾ���汾

      public static String CONST_ACTION_SAVE = "SAVE"; // �ύ

      public static String CONST_ACTION_SAVEBASE = "SAVEBASE"; // ����

      public static String CONST_ACTION_UNAPPROVE = "UNAPPROVE"; // ȡ������

      public static String CONST_ACTION_UNSAVEBILL = "UNSAVEBILL"; // �ջ�

      /**
       * ��������
       */
      public static String CONST_BILLTYPE_COST = "MPJP";

        /**
        * ���������ֶ�
        */
        public static String CONST_PARENT_PRIMARYKEY = "pk_monthprojplan_h";

        /**
        * ����״̬�ֶ�
        */
        public static String CONST_BILL_STATUS = "billstatus";
        /**
        * ʱ���
        */
        public static String CONST_TS = "ts";

      /**
       * ����
       */
      // ��Ŀ�¶ȼƻ�Ӧ�ñ���
      public static String CONST_CODE_APPCODE = "91H10545";

      // ��Ŀ�¶ȼƻ��б�ҳ���������
      public static String CONST_CODE_AREACODE_LIST_SEARCH = "list_query";

      // ��Ŀ�¶ȼƻ��б�ҳ���������
      public static String CONST_CODE_AREACODE_LIST_TABLE = "list_head";

      // ��Ŀ�¶ȼƻ���Ƭҳ�����
      public static String CONST_CODE_PAGECODE_COST_CARD = "91H10545_CARD";

      // ��Ŀ�¶ȼƻ��б�ҳ�����
      public static String CONST_CODE_PAGECODE_COST_LIST = "91H10545_LIST";

      /**
       * ģ��
       */
      public static String CONST_MODULE = "adprepare";

      public static String CONST_MODULE_CODE = "91H1";

      /**
       * ҵ�����賣��
       */
      public static String CONST_PFLOW_ISRELOADBILL = "IS_RELOADBILL"; // ȡ������

      /**
       * ������������
       */
      public static String FIELD_GLOBALMNYFIELD = "globalMnyField";

      public static String FIELD_GLOBALRATE = "globalRateField";

      public static String FIELD_GROUPMNY = "groupMnyField";

      public static String FIELD_GROUPRATE = "groupRateField";

      public static String FIELD_MONEY = "mnyField";

      public static String FIELD_ORGMNY = "orgMnyField";

      public static String FIELD_ORGRATE = "orgRateField";

      public static String FIELD_PK_CURRTYPE = "pk_currtype";

      public static String FIELD_PK_GROUP = "pk_group";

      public static String FIELD_PK_ORG = "pk_org";


      /**
       * ��ȡ���徫�ȴ����ֶ���ϸ
       *
       * @return key:����class,value:�����ֶ��б�
       */
      public static Map<String, List<PrecisionField>> getBodyPrecisionFields() {
        Map<String, List<PrecisionField>> map =
            new HashMap<String, List<PrecisionField>>();
        List<PrecisionField> list = new ArrayList<PrecisionField>();
        // �����ֶδ���
        map.put("card_body", list);
        return map;
      }

      /**
       *
       * * ������ͷ���ȴ����ֶ�

       * @return
       */
      public static List<PrecisionField> getHeadPrecisionFields() {
        // �����ֶδ���
        List<PrecisionField> headPrecisionFields = new ArrayList<PrecisionField>();
        return headPrecisionFields;
      }
}
