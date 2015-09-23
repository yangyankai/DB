package shootbox.sqlite.info_user_match_detail_mood;

import android.content.ContentValues;
import android.content.Context;
import android.support.v4.app.INotificationSideChannel;
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
public class UserMatchDetailMoodDAO extends BaseDAO<InfoUserMatchDetailMood> implements IPersonInfoUserMatchDetailMoodDAO
{
		public UserMatchDetailMoodDAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(InfoUserMatchDetailMood infoUserMatchDetailMood) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_MATCHID      ,infoUserMatchDetailMood.cMatchID);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_USERID       ,infoUserMatchDetailMood.cUserID);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_SELFMOOD     ,infoUserMatchDetailMood.blobSelfMood);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENGOOD    ,infoUserMatchDetailMood.nGivenGood);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENBAD     ,infoUserMatchDetailMood.nGivenBad);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTERID  ,infoUserMatchDetailMood.cCommenterID);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTTIME  ,infoUserMatchDetailMood.tCommentTime);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENGOOD   ,infoUserMatchDetailMood.bGivenGood);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENBAD    ,infoUserMatchDetailMood.bGivenBad);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENCOMMENT ,infoUserMatchDetailMood.blobGivenComment);
		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.INFO_USER_MATCH_DETAIL_MOOD, values);
		}catch (Exception e){

		}

	}

	/**
	 * 更新数据
	 * @param infoUserMatchDetailMood
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(InfoUserMatchDetailMood infoUserMatchDetailMood) throws Exception
	{
		ContentValues values = new ContentValues();

		if (infoUserMatchDetailMood.cMatchID != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_MATCHID, infoUserMatchDetailMood.cMatchID);
		if (infoUserMatchDetailMood.cUserID != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_USERID, infoUserMatchDetailMood.cUserID);
		if (infoUserMatchDetailMood.blobSelfMood != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_SELFMOOD, infoUserMatchDetailMood.blobSelfMood);
		if (infoUserMatchDetailMood.nGivenGood != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENGOOD, infoUserMatchDetailMood.nGivenGood);
		if (infoUserMatchDetailMood.nGivenBad != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENBAD, infoUserMatchDetailMood.nGivenBad);
		if (infoUserMatchDetailMood.cCommenterID != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTERID, infoUserMatchDetailMood.cCommenterID);
		if (infoUserMatchDetailMood.tCommentTime != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTTIME, infoUserMatchDetailMood.tCommentTime);//原本是boolean类
		if (infoUserMatchDetailMood.bGivenGood != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENGOOD, infoUserMatchDetailMood.bGivenGood==true?"1":"0");
		if (infoUserMatchDetailMood.bGivenBad != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENBAD, infoUserMatchDetailMood.bGivenBad==true?"1":"0");
		if (infoUserMatchDetailMood.blobGivenComment != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENCOMMENT, infoUserMatchDetailMood.blobGivenComment);

		String strUpdateById = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_MATCHID + Config.SQL_LIKE_ARGS;
		int nCount = 0;
		try {
			nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateById, new String[]{infoUserMatchDetailMood.cMatchID});  //根据ID进行更新
		} catch (Exception e) {
		}

		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<InfoUserMatchDetailMood> GetAll(InfoUserMatchDetailMood infoUserMatchDetailMood) {

		if(infoUserMatchDetailMood==null) return null;
		List<String> listStrID = new ArrayList<String>();

//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串

		if (infoUserMatchDetailMood.cMatchID != null) {
			listStrID.add(infoUserMatchDetailMood.cMatchID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_MATCHID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.cUserID != null) {
			listStrID.add(infoUserMatchDetailMood.cUserID);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MOOD_USERID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.blobSelfMood != null) {              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMood.blobSelfMood +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MOOD_SELFMOOD+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.nGivenGood != 0) {
			listStrID.add(infoUserMatchDetailMood.nGivenGood + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENGOOD+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.nGivenBad != 0) {
			listStrID.add(infoUserMatchDetailMood.nGivenBad+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENBAD+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.cCommenterID != null) {
			listStrID.add(infoUserMatchDetailMood.cCommenterID +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTERID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.tCommentTime != null) {
			listStrID.add(infoUserMatchDetailMood.tCommentTime+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.bGivenGood != null){
			if (infoUserMatchDetailMood.bGivenGood ==true)
				strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENGOOD+Config.SQL_LIKE+"1";
			else
				strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENGOOD+Config.SQL_LIKE+"0";
		}
		if (infoUserMatchDetailMood.bGivenBad != null){
			if (infoUserMatchDetailMood.bGivenBad ==true)
				strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENBAD+Config.SQL_LIKE+"1";
			else
				strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENBAD+Config.SQL_LIKE+"0";
		}
		if (infoUserMatchDetailMood.blobGivenComment != null) {
			listStrID.add(infoUserMatchDetailMood.blobGivenComment + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENCOMMENT+Config.SQL_LIKE_ARGS;
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完
		List<InfoUserMatchDetailMood> userBases = queryList(InfoUserMatchDetailMood.class,
				Tables.INFO_USER_MATCH_DETAIL_MOOD,
				new String[]{Config.COLUMN_NAME},
				strSelection,
				arrStrID,
				null,
				Config.PAGENUM,
				Config.PAGESIZE);
		return userBases;
	}

	/**
	 * 查询某一条数据
	 * @param
	 * @return
	 */
	@Override
	public InfoUserMatchDetailMood GetOne(InfoUserMatchDetailMood infoUserMatchDetailMood) {

		if(infoUserMatchDetailMood==null) return null;
		List<String> listStrID = new ArrayList<String>();

//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串

		if (infoUserMatchDetailMood.cMatchID != null) {
			listStrID.add(infoUserMatchDetailMood.cMatchID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_MATCHID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.cUserID != null) {
			listStrID.add(infoUserMatchDetailMood.cUserID);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MOOD_USERID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.blobSelfMood != null) {              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMood.blobSelfMood +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MOOD_SELFMOOD+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.nGivenGood != 0) {
			listStrID.add(infoUserMatchDetailMood.nGivenGood + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENGOOD+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.nGivenBad != 0) {
			listStrID.add(infoUserMatchDetailMood.nGivenBad+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENBAD+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.cCommenterID != null) {
			listStrID.add(infoUserMatchDetailMood.cCommenterID +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTERID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.tCommentTime != null) {
			listStrID.add(infoUserMatchDetailMood.tCommentTime+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMood.bGivenGood != null){
			if (infoUserMatchDetailMood.bGivenGood ==true)
				strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENGOOD+Config.SQL_LIKE+"1";
			else
				strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENGOOD+Config.SQL_LIKE+"0";
		}
		if (infoUserMatchDetailMood.bGivenBad != null){
			if (infoUserMatchDetailMood.bGivenBad ==true)
				strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENBAD+Config.SQL_LIKE+"1";
			else
				strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENBAD+Config.SQL_LIKE+"0";
		}
		if (infoUserMatchDetailMood.blobGivenComment != null) {
			listStrID.add(infoUserMatchDetailMood.blobGivenComment + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENCOMMENT+Config.SQL_LIKE_ARGS;
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完

		InfoUserMatchDetailMood infoUserMatchDetailMood1 = queryObject(InfoUserMatchDetailMood.class,
																		Tables.INFO_USER_MATCH_DETAIL_MOOD,
																		new String[]{Config.COLUMN_NAME},
																		strSelection,
																		arrStrID);

		return infoUserMatchDetailMood1;
	}

	/**
	 * 删除数据
	 * @param
	 */
	@Override
	public int Del(InfoUserMatchDetailMood infoUserMatchDetailMood)
	{
		if(infoUserMatchDetailMood==null)return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_COMMENT_COMMENTERID, -8); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串

	
		if (infoUserMatchDetailMood.cMatchID != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_MATCHID +  Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateWhere,new String[]{infoUserMatchDetailMood.cMatchID});
			return nCount;
		}

		if (infoUserMatchDetailMood.cUserID != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_USERID + Config.SQL_LIKE_ARGS ;//infoUserMatchDetailMood.cUserName;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateWhere,new String[]{infoUserMatchDetailMood.cUserID});
			return nCount;
		}

		if (infoUserMatchDetailMood.blobSelfMood != null) //null表示没有传值
		{
			strUpdateWhere=TablesFields.INFO_USER_MATCH_DETAIL_MOOD_SELFMOOD + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values,strUpdateWhere ,new String[]{infoUserMatchDetailMood.blobSelfMood+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoUserMatchDetailMood.nGivenGood != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENGOOD + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateWhere, new String[]{infoUserMatchDetailMood.nGivenGood+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoUserMatchDetailMood.nGivenBad != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENBAD +  Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateWhere,new String[]{infoUserMatchDetailMood.nGivenBad+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoUserMatchDetailMood.cCommenterID != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTERID +  Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateWhere, new String[]{infoUserMatchDetailMood.cCommenterID});
			return nCount;
		}

		if (infoUserMatchDetailMood.tCommentTime != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_COMMENTTIME + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateWhere, new String[]{infoUserMatchDetailMood.tCommentTime});
			return nCount;
		}

		if (infoUserMatchDetailMood.bGivenGood != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENGOOD +  Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateWhere, new String[]{infoUserMatchDetailMood.bGivenGood==true?"1":"0"});
			return nCount;
		}

		if (infoUserMatchDetailMood.bGivenBad != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_BGIVENBAD +  Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateWhere,new String[]{infoUserMatchDetailMood.bGivenBad==true?"1":"0"});
			return nCount;
		}

		if (infoUserMatchDetailMood.blobGivenComment != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MOOD_GIVENCOMMENT +  Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MOOD, values, strUpdateWhere, new String[]{infoUserMatchDetailMood.blobGivenComment+Config.COLUMN_QUOTES});
			return nCount;
		}


		return 0;
	}
}
