package shootbox.sqlite.info_user_match_detail_comment;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import shootbox.sqlite.SQLiteDAO.BaseDAO;
import shootbox.sqlite.SQLiteDAO.Config;
import shootbox.sqlite.SQLiteDAO.TablesFields;
import shootbox.sqlite.SQLiteDAO.Tables;
import shootbox.sqlite.SQLiteDAO.TablesFields;
import shootbox.sqlite.info_user_match_detail.InfoUserMatchDetail;

/**
 * DAO   需要继承BaseDao
 */
public class UserMatchDetailCommentDAO extends BaseDAO<InfoUserMatchDetailComment> implements IPersonInfoUserMatchDetailCommentDAO
{
    public UserMatchDetailCommentDAO(Context context) {
        super(context);
    }

    /*
     *
     *添加一条数据
     */
    public void Add(InfoUserMatchDetailComment infoUserMatchDetailComment) {
        ContentValues values = new ContentValues();

        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_MATCHID     , infoUserMatchDetailComment.cMatchID);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_USERID      , infoUserMatchDetailComment.cUserID);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_SELFCOMMENT , infoUserMatchDetailComment.blobSelfComment);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENGOOD   , infoUserMatchDetailComment.nGivenGood);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENBAD    , infoUserMatchDetailComment.nGivenBad);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTERID , infoUserMatchDetailComment.cCommenterID);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTTIME , infoUserMatchDetailComment.tCommentTime);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENGOOD  ,  infoUserMatchDetailComment.bGivenGood);
         values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENBAD   ,  infoUserMatchDetailComment.bGivenBad);
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENCOMMENT,  infoUserMatchDetailComment.blobGivenComment);
        //调用BaseDAO的inserts的方法
        long id = 0;
        try {
            id = insert(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values);
        } catch (Exception e) {

        }
    }

    /**
     * 随意更新某个字段数据
     *
     * @param infoUserMatchDetailComment 传入一个类，按照ID更新剩下所有字段
     * @return
     * @throws Exception
     */
    @Override
    public int Update(InfoUserMatchDetailComment infoUserMatchDetailComment) throws Exception {
        ContentValues values = new ContentValues();

        if (infoUserMatchDetailComment.cMatchID != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_MATCHID, infoUserMatchDetailComment.cMatchID);
        if (infoUserMatchDetailComment.cUserID != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_USERID, infoUserMatchDetailComment.cUserID);
        if (infoUserMatchDetailComment.blobSelfComment != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_SELFCOMMENT, infoUserMatchDetailComment.blobSelfComment);
        if (infoUserMatchDetailComment.nGivenGood != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENGOOD, infoUserMatchDetailComment.nGivenGood);
        if (infoUserMatchDetailComment.nGivenBad != 0)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENBAD, infoUserMatchDetailComment.nGivenBad);
        if (infoUserMatchDetailComment.cCommenterID != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTERID, infoUserMatchDetailComment.cCommenterID);
        if (infoUserMatchDetailComment.tCommentTime != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTTIME, infoUserMatchDetailComment.tCommentTime);//原本是boolean类
        if (infoUserMatchDetailComment.bGivenGood != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENGOOD, infoUserMatchDetailComment.bGivenGood);
        if (infoUserMatchDetailComment.bGivenBad != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENBAD, infoUserMatchDetailComment.bGivenBad);
        if (infoUserMatchDetailComment.blobGivenComment != null)
            values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENCOMMENT, infoUserMatchDetailComment.blobGivenComment);

        String strUpdateById = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_MATCHID + Config.SQL_LIKE+" ? ";
        int nCount = 0;
        try {
            nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateById, new String[]{infoUserMatchDetailComment.cMatchID});
        } catch (Exception e) {
        }

        return nCount;
    }

    /**
     * 根据所有的字段获取所有的对象，并且分页展示。
     *
     * @return
     */
    public List<InfoUserMatchDetailComment> GetAll(InfoUserMatchDetailComment infoUserMatchDetailComment) {

        List<String> listStrID = new ArrayList<String>();
        String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接字符串

//		------------------------   拼接参数， 始
        if (infoUserMatchDetailComment.cMatchID != null) {
            listStrID.add(infoUserMatchDetailComment.cMatchID);
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_MATCHID+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.cUserID != null) {
            listStrID.add(infoUserMatchDetailComment.cUserID);
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_USERID+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.blobSelfComment != null) {
            listStrID.add(infoUserMatchDetailComment.blobSelfComment+ "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_SELFCOMMENT+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.nGivenGood != 0) //0表示没有传值
        {              // 不等于0表示传入这个值，则要查找这个值
            listStrID.add(infoUserMatchDetailComment.nGivenGood + "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENGOOD+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.nGivenBad != 0) {
            listStrID.add(infoUserMatchDetailComment.nGivenBad + "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENBAD+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.cCommenterID != null) {
            listStrID.add(infoUserMatchDetailComment.cCommenterID);
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTERID+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.tCommentTime != null) {
            listStrID.add(infoUserMatchDetailComment.tCommentTime + "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTTIME+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.bGivenGood != null)
        {
            if (infoUserMatchDetailComment.bGivenGood ==true)
                strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENGOOD+Config.SQL_LIKE+" 1 ";
            if (infoUserMatchDetailComment.bGivenGood ==false)
                strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENGOOD+Config.SQL_LIKE+" 0 ";
        }
        if (infoUserMatchDetailComment.bGivenBad != null)
        {
            if (infoUserMatchDetailComment.bGivenBad == true)
                strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENBAD+Config.SQL_LIKE+" 1 ";
            else if (infoUserMatchDetailComment.bGivenBad == false)
                strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENBAD+Config.SQL_LIKE+" 0 ";
        }
        if (infoUserMatchDetailComment.blobGivenComment != null) {
            listStrID.add(infoUserMatchDetailComment.blobGivenComment + "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENCOMMENT+Config.SQL_LIKE+" ? ";
        }
        String[] arrStrID = new String[listStrID.size()];
        listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完

        List<InfoUserMatchDetailComment> userBases = queryList(InfoUserMatchDetailComment.class,
                Tables.INFO_USER_MATCH_DETAIL_COMMENT,
                new String[]{"*"},
                strSelection,
                arrStrID,
                null,
                Config.PAGENUM,
                Config.PAGESIZE);
        return userBases;
    }

    /**
     * 根据 UserName 或者 UserID 查询某一条数据
     *
     * @param
     * @return
     */
    public InfoUserMatchDetailComment GetOne(InfoUserMatchDetailComment infoUserMatchDetailComment) {
        List<String> listStrID = new ArrayList<String>();
        String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接字符串

//		------------------------   拼接参数， 始
        if (infoUserMatchDetailComment.cMatchID != null) {
            listStrID.add(infoUserMatchDetailComment.cMatchID);
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_MATCHID+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.cUserID != null) {
            listStrID.add(infoUserMatchDetailComment.cUserID);
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_USERID+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.blobSelfComment != null) {
            listStrID.add(infoUserMatchDetailComment.blobSelfComment+ "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_SELFCOMMENT+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.nGivenGood != 0) //0表示没有传值
        {              // 不等于0表示传入这个值，则要查找这个值
            listStrID.add(infoUserMatchDetailComment.nGivenGood + "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENGOOD+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.nGivenBad != 0) {
            listStrID.add(infoUserMatchDetailComment.nGivenBad + "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENBAD+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.cCommenterID != null) {
            listStrID.add(infoUserMatchDetailComment.cCommenterID);
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTERID+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.tCommentTime != null) {
            listStrID.add(infoUserMatchDetailComment.tCommentTime + "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTTIME+Config.SQL_LIKE+" ? ";
        }
        if (infoUserMatchDetailComment.bGivenGood != null)
       {
            if (infoUserMatchDetailComment.bGivenGood ==true)
                strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENGOOD+Config.SQL_LIKE+" 1 ";
            if (infoUserMatchDetailComment.bGivenGood ==false)
                strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENGOOD+Config.SQL_LIKE+" 0 ";
        }
        if (infoUserMatchDetailComment.bGivenBad != null)
        {
            if (infoUserMatchDetailComment.bGivenBad == true)
                strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENBAD+Config.SQL_LIKE+" 1 ";
            else if (infoUserMatchDetailComment.bGivenBad == false)
                strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENBAD+Config.SQL_LIKE+" 0 ";
        }
        if (infoUserMatchDetailComment.blobGivenComment != null) {
            listStrID.add(infoUserMatchDetailComment.blobGivenComment + "");
            strSelection += " and " + TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENCOMMENT+Config.SQL_LIKE+" ? ";
        }
        String[] arrStrID = new String[listStrID.size()];
        listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完
        InfoUserMatchDetailComment m_InfoUserMatchDetailComment=null;
        m_InfoUserMatchDetailComment = queryObject(InfoUserMatchDetailComment.class,
                Tables.INFO_USER_MATCH_DETAIL_COMMENT,
                new String[]{"*"},
                strSelection,
                arrStrID);

        return m_InfoUserMatchDetailComment;
    }

    /**
     * 根据 id 删除数据,全删除
     *
     * @param
     */
    @Override
    public int Del(InfoUserMatchDetailComment infoUserMatchDetailComment)  //目前只能根据ID删除
    {
        ContentValues values = new ContentValues();
        values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTERID, -1); // 值置为 -1 ，表示删除
        String strUpdateWhere = "";

        if (infoUserMatchDetailComment.cMatchID != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_MATCHID +Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateWhere,new String[]{infoUserMatchDetailComment.cMatchID});
            return nCount;
        }
        if (infoUserMatchDetailComment.cUserID != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_USERID + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateWhere,new String[]{infoUserMatchDetailComment.cUserID});
            return nCount;
        }
        if (infoUserMatchDetailComment.blobSelfComment != null){              // 不等于0表示传入这个值，则要查找这个值
            strUpdateWhere=TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_SELFCOMMENT +Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values,strUpdateWhere ,new String[]{infoUserMatchDetailComment.blobSelfComment+""});
            return nCount;
        }
        if (infoUserMatchDetailComment.nGivenGood != 0) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENGOOD +Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateWhere, new String[]{infoUserMatchDetailComment.nGivenGood+""});
            return nCount;
        }
        if (infoUserMatchDetailComment.nGivenBad != 0) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENBAD + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateWhere, new String[]{infoUserMatchDetailComment.nGivenBad+""});
            return nCount;
        }
        if (infoUserMatchDetailComment.cCommenterID != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTERID + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateWhere, new String[]{infoUserMatchDetailComment.cCommenterID});
            return nCount;
        }
        if (infoUserMatchDetailComment.tCommentTime != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTTIME +Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateWhere, new String[]{infoUserMatchDetailComment.tCommentTime});
            return nCount;
        }
        if (infoUserMatchDetailComment.bGivenGood != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENGOOD + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateWhere, new String[]{infoUserMatchDetailComment.bGivenGood==true?"1":"0"});
            return nCount;
        }
        if (infoUserMatchDetailComment.bGivenBad != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_BGIVENBAD + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateWhere,new String[]{infoUserMatchDetailComment.bGivenBad==true?"1":"0"});
            return nCount;
        }
        if (infoUserMatchDetailComment.blobGivenComment != null) {
            strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_GIVENCOMMENT + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_MATCH_DETAIL_COMMENT, values, strUpdateWhere, new String[]{infoUserMatchDetailComment.blobGivenComment+""});
            return nCount;
        }
        return 0;
    }
}
