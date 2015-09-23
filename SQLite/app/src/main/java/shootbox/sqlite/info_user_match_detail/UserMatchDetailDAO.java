package shootbox.sqlite.info_user_match_detail;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import shootbox.sqlite.SQLiteDAO.BaseDAO;
import shootbox.sqlite.SQLiteDAO.Config;
import shootbox.sqlite.SQLiteDAO.Tables;
import shootbox.sqlite.SQLiteDAO.TablesFields;

/**
 * DAO   需要继承BaseDao
 */
public class UserMatchDetailDAO extends BaseDAO<InfoUserMatchDetail> implements IPersonInfoUserMatchDetailDAO {
    public UserMatchDetailDAO(Context context) {
        super(context);
    }

    /*
     *
     *添加一条数据
     */
    public void Add(InfoUserMatchDetail infoUserMatchDetail) {
        ContentValues values = new ContentValues();

        values.put(TablesFields.INFO_USER_MATCH_DETAIL_MATCHID      ,    infoUserMatchDetail.cMatchID);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_MATCHNAME      ,    infoUserMatchDetail.cMatchName);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_USERID         ,    infoUserMatchDetail.cUserID);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_USERNAME     ,    infoUserMatchDetail.cUserName);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_SEASONTYPE    ,    infoUserMatchDetail.nSeasonType);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_TOTALGOALS    ,    infoUserMatchDetail.nTotalGoals);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_TOTALASSISTS  ,    infoUserMatchDetail.nTotalAssists);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSTYLE ,    infoUserMatchDetail.nFieldPosStyle);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSFIRST ,    infoUserMatchDetail.nFieldPosFirst);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSECOND,    infoUserMatchDetail.nFieldPosSecond);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSTHIRD ,    infoUserMatchDetail.nFieldPosThird);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSOTHER ,    infoUserMatchDetail.nFieldPosOther);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_ISATTEND      ,    infoUserMatchDetail.bIsAttend);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_SELFCOMMENT   ,    infoUserMatchDetail.blobSelfComment);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_PROFILE       ,    infoUserMatchDetail.textProfile);

        //调用BaseDAO的inserts的方法
        long id = 0;
        try {
            id = insert(Tables.INFO_USER_MATCH_DETAIL, values);
        } catch (Exception e) {

        }
    }

    /**
     * 随意更新某个字段数据
     *
     * @param infoUserMatchDetail 传入一个类，按照MATCHID更新剩下所有字段
     * @return
     * @throws Exception
     */
    @Override
    public int Update(InfoUserMatchDetail infoUserMatchDetail) throws Exception {
        ContentValues values = new ContentValues();

        if (infoUserMatchDetail.cMatchID != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_MATCHID, infoUserMatchDetail.cMatchID);
        if (infoUserMatchDetail.cMatchName != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_MATCHNAME, infoUserMatchDetail.cMatchName);
        if (infoUserMatchDetail.cUserID != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_USERID, infoUserMatchDetail.cUserID);
        if (infoUserMatchDetail.cUserName != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_USERNAME, infoUserMatchDetail.cUserName);
        if (infoUserMatchDetail.nSeasonType != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_SEASONTYPE, infoUserMatchDetail.nSeasonType);
        if (infoUserMatchDetail.nTotalGoals != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_TOTALGOALS, infoUserMatchDetail.nTotalGoals);
        if (infoUserMatchDetail.nTotalAssists != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_TOTALASSISTS, infoUserMatchDetail.nTotalAssists);
        if (infoUserMatchDetail.nFieldPosStyle != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSTYLE, infoUserMatchDetail.nFieldPosStyle);
        if (infoUserMatchDetail.nFieldPosFirst != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSFIRST, infoUserMatchDetail.nFieldPosFirst);
        if (infoUserMatchDetail.nFieldPosSecond != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSECOND, infoUserMatchDetail.nFieldPosSecond);
        if (infoUserMatchDetail.nFieldPosThird != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSTHIRD, infoUserMatchDetail.nFieldPosThird);
        if (infoUserMatchDetail.nFieldPosOther != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSOTHER, infoUserMatchDetail.nFieldPosOther);
        if (infoUserMatchDetail.bIsAttend != false)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_ISATTEND, infoUserMatchDetail.bIsAttend);
        if (infoUserMatchDetail.blobSelfComment != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_SELFCOMMENT, infoUserMatchDetail.blobSelfComment);
        if (infoUserMatchDetail.textProfile != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_PROFILE, infoUserMatchDetail.textProfile);

        String strUpdateById = TablesFields.INFO_USER_MATCH_DETAIL_MATCHID + Config.SQL_LIKE + " ? ";
        int nCount = 0;
        try {
            nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateById, new String[]{infoUserMatchDetail.cMatchID});
        } catch (Exception e) {
        }

        return nCount;
    }

    /**
     * 根据所有的字段获取所有的对象，并且分页展示。
     *
     * @return
     */
    public List<InfoUserMatchDetail> GetAll(InfoUserMatchDetail infoUserMatchDetail) {

        List<String> listStrID = new ArrayList<String>();

        String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接字符串

//		------------------------   拼接参数， 始
        if (infoUserMatchDetail.cMatchID != null) {
            listStrID.add(infoUserMatchDetail.cMatchID);
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_MATCHID +Config.SQL_LIKE +" ? " ;
        }
        
        if (infoUserMatchDetail.cMatchName != null) {
            listStrID.add(infoUserMatchDetail.cMatchName);
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_MATCHNAME +Config.SQL_LIKE +" ? " ;
        }
        
        if (infoUserMatchDetail.cUserID != null) {
            listStrID.add(infoUserMatchDetail.cUserID);
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_USERID +Config.SQL_LIKE +" ? " ;
        }
        
        if (infoUserMatchDetail.cUserName != null) {
            listStrID.add(infoUserMatchDetail.cUserName);
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_USERNAME +Config.SQL_LIKE +" ? " ;
        }
        
        if (infoUserMatchDetail.nSeasonType != 0) //0表示没有传值
        {              // 不等于0表示传入这个值，则要查找这个值
            listStrID.add(infoUserMatchDetail.nSeasonType+"");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_SEASONTYPE +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nTotalGoals != 0) {
            listStrID.add(infoUserMatchDetail.nTotalGoals + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_TOTALGOALS +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nTotalAssists != 0) {
            listStrID.add(infoUserMatchDetail.nTotalAssists+ "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_TOTALASSISTS +Config.SQL_LIKE +" ? " ;
        }
        if (infoUserMatchDetail.nFieldPosStyle != 0) {
            listStrID.add(infoUserMatchDetail.nFieldPosStyle + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSTYLE +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nFieldPosFirst != 0) {
			listStrID.add(infoUserMatchDetail.nFieldPosFirst + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSFIRST +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nFieldPosSecond != 0) {
            listStrID.add(infoUserMatchDetail.nFieldPosSecond + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSECOND +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nFieldPosThird != 0) {
            listStrID.add(infoUserMatchDetail.nFieldPosThird + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSTHIRD +Config.SQL_LIKE +" ? " ;
        }
        if (infoUserMatchDetail.nFieldPosOther != 0) {
            listStrID.add(infoUserMatchDetail.nFieldPosOther + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSOTHER +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.bIsAttend != false) {
//            listStrID.add(infoUserMatchDetail.bIsAttend + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_ISATTEND +Config.SQL_LIKE +" 1 " ;
        }

//        if (infoUserMatchDetail.blobSelfComment != null) {    byte[] 型数据在此不作为查找索引
//            listStrID.add(infoUserMatchDetail.blobSelfComment + "");
//            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_SELFCOMMENT +Config.SQL_LIKE +" ? " ;
//        }

        if (infoUserMatchDetail.textProfile != null) {
            listStrID.add(infoUserMatchDetail.textProfile + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_PROFILE +Config.SQL_LIKE +" ? " ;
        }

        String[] arrStrID = new String[listStrID.size()];
        listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完

        List<InfoUserMatchDetail> userMatchDetail = queryList(InfoUserMatchDetail.class,
                Tables.INFO_USER_MATCH_DETAIL,
                new String[]{Config.COLUMN_NAME},
                strSelection,
                arrStrID,
                null,
                Config.PAGENUM,
                Config.PAGESIZE);

        return userMatchDetail;
    }

    /**
     * 根据 UserName 或者 UserID 查询某一条数据
     *
     * @param
     * @return
     */
    public InfoUserMatchDetail GetOne(InfoUserMatchDetail infoUserMatchDetail) {

        InfoUserMatchDetail m_InfoUserMatchDetail= new InfoUserMatchDetail();
        
        List<String> listStrID = new ArrayList<String>();

        String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接字符串
//		------------------------   拼接参数， 始
        if (infoUserMatchDetail.cMatchID != null) {
            listStrID.add(infoUserMatchDetail.cMatchID);
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_MATCHID +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.cMatchName != null) {
            listStrID.add(infoUserMatchDetail.cMatchName);
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_MATCHNAME +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.cUserID != null) {
            listStrID.add(infoUserMatchDetail.cUserID);
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_USERID +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.cUserName != null) {
            listStrID.add(infoUserMatchDetail.cUserName);
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_USERNAME +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nSeasonType != 0) //0表示没有传值
        {              // 不等于0表示传入这个值，则要查找这个值
            listStrID.add(infoUserMatchDetail.nSeasonType+"");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_SEASONTYPE +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nTotalGoals != 0) {
            listStrID.add(infoUserMatchDetail.nTotalGoals + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_TOTALGOALS +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nTotalAssists != 0) {
            listStrID.add(infoUserMatchDetail.nTotalAssists+ "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_TOTALASSISTS +Config.SQL_LIKE +" ? " ;
        }
        if (infoUserMatchDetail.nFieldPosStyle != 0) {
            listStrID.add(infoUserMatchDetail.nFieldPosStyle + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSTYLE +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nFieldPosFirst != 0) {
			listStrID.add(infoUserMatchDetail.nFieldPosFirst+"");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSFIRST +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nFieldPosSecond != 0) {
            listStrID.add(infoUserMatchDetail.nFieldPosSecond + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSECOND +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.nFieldPosThird != 0) {
            listStrID.add(infoUserMatchDetail.nFieldPosThird + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSTHIRD +Config.SQL_LIKE +" ? " ;
        }
        if (infoUserMatchDetail.nFieldPosOther != 0) {
            listStrID.add(infoUserMatchDetail.nFieldPosOther + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSOTHER +Config.SQL_LIKE +" ? " ;
        }

        if (infoUserMatchDetail.bIsAttend != false) {
//            listStrID.add(infoUserMatchDetail.bIsAttend + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_ISATTEND +Config.SQL_LIKE +" 1 " ;
        }

//        if (infoUserMatchDetail.blobSelfComment != null) {    byte[] 型数据在此不作为查找索引
//            listStrID.add(infoUserMatchDetail.blobSelfComment + "");
//            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_SELFCOMMENT +Config.SQL_LIKE +" ? " ;
//        }

        if (infoUserMatchDetail.textProfile != null) {
            listStrID.add(infoUserMatchDetail.textProfile + "");
            strSelection += " and "+TablesFields.INFO_USER_MATCH_DETAIL_PROFILE +Config.SQL_LIKE +" ? " ;
        }

        String[] arrStrID = new String[listStrID.size()];
        listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完

        m_InfoUserMatchDetail = queryObject(InfoUserMatchDetail.class,
                                     Tables.INFO_USER_MATCH_DETAIL,
                                    new String[]{Config.COLUMN_NAME},
                                    strSelection,
                                    arrStrID);

        return m_InfoUserMatchDetail;
    }

    /**
     * 根据 id 删除数据,全删除
     *
     * @param
     */
    @Override
    public int Del(InfoUserMatchDetail infoUserMatchDetail)  //目前只能根据ID删除
    {
        ContentValues values = new ContentValues();
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_SEASONTYPE, -1);// 值置为 -1 ，表示删除
        String strUpdateWhere = "";
     
        if (infoUserMatchDetail.cMatchID != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MATCHID + Config.SQL_LIKE + "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,new String[]{infoUserMatchDetail.cMatchID});
            return nCount;
        }

        if (infoUserMatchDetail.cMatchName != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MATCHNAME +Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,new String[]{infoUserMatchDetail.cMatchName});
            return nCount;
        }
        if (infoUserMatchDetail.cUserID != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_USERID + Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,new String[]{infoUserMatchDetail.cUserID});
            return nCount;
        }

        if (infoUserMatchDetail.cUserName != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_USERNAME +Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,new String[]{infoUserMatchDetail.cUserName});
        
            return nCount;
        }

        if (infoUserMatchDetail.nSeasonType != 0) //0表示没有传值
        {              // 不等于0表示传入这个值，则要查找这个值
            strUpdateWhere=TablesFields.INFO_USER_MATCH_DETAIL_SEASONTYPE +Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values,strUpdateWhere ,new String[]{infoUserMatchDetail.nSeasonType+""});
            return nCount;
        }

        if (infoUserMatchDetail.nTotalGoals != 0) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_TOTALGOALS +Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere, new String[]{infoUserMatchDetail.nTotalGoals+""});
            return nCount;
        }

        if (infoUserMatchDetail.nTotalAssists != 0) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_TOTALASSISTS + Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,new String[]{infoUserMatchDetail.nTotalAssists+""});
            return nCount;
        }


        if (infoUserMatchDetail.nFieldPosStyle != 0) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSTYLE + Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere, new String[]{infoUserMatchDetail.nFieldPosStyle+""});
            return nCount;
        }

        if (infoUserMatchDetail.nFieldPosFirst != 0) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSFIRST +Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere, new String[]{infoUserMatchDetail.nFieldPosFirst+""});
            return nCount;
        }
        if (infoUserMatchDetail.nFieldPosSecond != 0) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSSECOND + Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere, new String[]{infoUserMatchDetail.nFieldPosSecond+""});
            return nCount;
        }
        if (infoUserMatchDetail.nFieldPosThird != 0) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSTHIRD + Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,new String[]{infoUserMatchDetail.nFieldPosThird+""});
            return nCount;
        }

        if (infoUserMatchDetail.nFieldPosOther != 0) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_FIELDPOSOTHER + Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,new String[]{infoUserMatchDetail.nFieldPosOther+""});
            return nCount;
        }

        if (infoUserMatchDetail.bIsAttend != false) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_ISATTEND + Config.SQL_LIKE+ "1";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,null);//new String[]{infoUserMatchDetail.bIsAttend+""});
            return nCount;
        }
//        if (infoUserMatchDetail.blobSelfComment != null) {    // 不按照 byte[] 型作为索引，来删除数据
//            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_SELFCOMMENT + Config.SQL_LIKE+ "?";
//            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,new String[]{infoUserMatchDetail.blobSelfComment+""});
//            return nCount;
//        }

        if (infoUserMatchDetail.textProfile != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_PROFILE + Config.SQL_LIKE+ "?";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL, values, strUpdateWhere,new String[]{infoUserMatchDetail.textProfile});
            return nCount;
        }
        return 0;
    }
}
