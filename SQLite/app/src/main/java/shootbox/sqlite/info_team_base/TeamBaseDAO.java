package shootbox.sqlite.info_team_base;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import shootbox.sqlite.SQLiteDAO.BaseDAO;
import shootbox.sqlite.SQLiteDAO.Config;
import shootbox.sqlite.SQLiteDAO.Tables;
import shootbox.sqlite.SQLiteDAO.TablesFields;

/**
 * DAO   需要继承BaseDao
 */
public class TeamBaseDAO extends BaseDAO<InfoTeamBase> implements IPersonInfoTeamBaseDAO
{
		public TeamBaseDAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(InfoTeamBase infoTeamBase) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.INFO_TEAM_BASE_TEAMID     	,infoTeamBase.cTeamID);
		values.put(TablesFields.INFO_TEAM_BASE_TEAMNAME   	,infoTeamBase.cTeamName);
		values.put(TablesFields.INFO_TEAM_BASE_TEAMLEADER 	,infoTeamBase. cTeamLeader);
		values.put(TablesFields.INFO_TEAM_BASE_CITY        	,infoTeamBase.nCity);
		values.put(TablesFields.INFO_TEAM_BASE_LOBLOGO      	,infoTeamBase.blobLogo);
		values.put(TablesFields.INFO_TEAM_BASE_ADD           	,infoTeamBase.bAdd);
		values.put(TablesFields.INFO_TEAM_BASE_MEMBERNUM    	,infoTeamBase. nMemberNum);
		values.put(TablesFields.INFO_TEAM_BASE_TOTALSCORES  	,infoTeamBase. nTotalScores);
		values.put(TablesFields.INFO_TEAM_BASE_STYLE         	,infoTeamBase.nStyle);
		values.put(TablesFields.INFO_TEAM_BASE_PROFILE       	,infoTeamBase.textProfile);

		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.INFO_TEAM_BASE, values);
		}catch (Exception e){

		}

	}

	/**
	 * 更新数据
	 * @param infoTeamBase
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(InfoTeamBase infoTeamBase) throws Exception
	{
		ContentValues values = new ContentValues();

		if (infoTeamBase.cTeamID != null)
			values.put(TablesFields.INFO_TEAM_BASE_TEAMID, infoTeamBase.cTeamID);
		if (infoTeamBase.cTeamName != null)
			values.put(TablesFields.INFO_TEAM_BASE_TEAMNAME, infoTeamBase.cTeamName);
		if (infoTeamBase.cTeamLeader != null)
			values.put(TablesFields.INFO_TEAM_BASE_TEAMLEADER, infoTeamBase.cTeamLeader);
		if (infoTeamBase.nCity != 0)
			values.put(TablesFields.INFO_TEAM_BASE_CITY, infoTeamBase.nCity);
		if (infoTeamBase.blobLogo != null)
			values.put(TablesFields.INFO_TEAM_BASE_LOBLOGO, infoTeamBase.blobLogo);
		if (infoTeamBase.bAdd != false)
			values.put(TablesFields.INFO_TEAM_BASE_ADD, infoTeamBase.bAdd);
		if (infoTeamBase.nMemberNum != 0)
			values.put(TablesFields.INFO_TEAM_BASE_MEMBERNUM, infoTeamBase.nMemberNum);//原本是boolean类
		if (infoTeamBase.nTotalScores != 0)
			values.put(TablesFields.INFO_TEAM_BASE_TOTALSCORES, infoTeamBase.nTotalScores);
		if (infoTeamBase.nStyle != 0)
			values.put(TablesFields.INFO_TEAM_BASE_STYLE, infoTeamBase.nStyle);
		if (infoTeamBase.textProfile != null)
			values.put(TablesFields.INFO_TEAM_BASE_PROFILE, infoTeamBase.textProfile);

		String strUpdateById = TablesFields.INFO_TEAM_BASE_TEAMID + Config.SQL_LIKE_ARGS;
		int nCount = 0;
		try {
			nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateById, new String[]{infoTeamBase.cTeamID});  //根据ID进行更新
		} catch (Exception e) {
		}
		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<InfoTeamBase> GetAll(InfoTeamBase infoTeamBase)
	{
		if(infoTeamBase==null) return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoTeamBase.cTeamID != null) {
			listStrID.add(infoTeamBase.cTeamID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_TEAMID+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamBase.cTeamName != null) {
			listStrID.add(infoTeamBase.cTeamName);
			strSelection += Config.SQL_AND + TablesFields.INFO_TEAM_BASE_TEAMNAME+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.cTeamLeader != null) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoTeamBase.cTeamLeader +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_TEAM_BASE_TEAMLEADER+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.nCity != 0) {
			listStrID.add(infoTeamBase.nCity + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_CITY+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.blobLogo != null) {
			listStrID.add(infoTeamBase.blobLogo+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_LOBLOGO+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamBase.bAdd != false) {
			listStrID.add("1" +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_ADD+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.nMemberNum != 0) {
			listStrID.add(infoTeamBase.nMemberNum+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_MEMBERNUM+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.nTotalScores != 0) {
			listStrID.add(infoTeamBase.nTotalScores + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_TOTALSCORES+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.nStyle != 0) {
			listStrID.add(infoTeamBase.nStyle +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_STYLE+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamBase.textProfile != null) {
			listStrID.add(infoTeamBase.textProfile + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_PROFILE+Config.SQL_LIKE_ARGS;
		}

//		if (infoTeamBase.blobPicture != null) {     // byte[] 储存图像的不查找
//			listStrID.add(infoTeamBase.blobPicture + "");
//			strSelection += " and "+ TablesFields.INFO_USER_BASE_BLOBPICTURE+" like ? ";
//		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		List<InfoTeamBase> userBases = queryList(InfoTeamBase.class,
				Tables.INFO_TEAM_BASE,
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
	public InfoTeamBase GetOne(InfoTeamBase infoTeamBase) //
	// 按照cUserID 或者cUserName 查找
	{
		if(infoTeamBase==null)return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoTeamBase.cTeamID != null) {
			listStrID.add(infoTeamBase.cTeamID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_TEAMID+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamBase.cTeamName != null) {
			listStrID.add(infoTeamBase.cTeamName);
			strSelection += Config.SQL_AND + TablesFields.INFO_TEAM_BASE_TEAMNAME+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.cTeamLeader != null) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoTeamBase.cTeamLeader +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_TEAM_BASE_TEAMLEADER+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.nCity != 0) {
			listStrID.add(infoTeamBase.nCity + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_CITY+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.blobLogo != null) {
			listStrID.add(infoTeamBase.blobLogo+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_LOBLOGO+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamBase.bAdd != false) {
			listStrID.add("1" +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_ADD+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.nMemberNum != 0) {
			listStrID.add(infoTeamBase.nMemberNum+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_MEMBERNUM+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.nTotalScores != 0) {
			listStrID.add(infoTeamBase.nTotalScores + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_TOTALSCORES+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamBase.nStyle != 0) {
			listStrID.add(infoTeamBase.nStyle +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_STYLE+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamBase.textProfile != null) {
			listStrID.add(infoTeamBase.textProfile + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_TEAM_BASE_PROFILE+Config.SQL_LIKE_ARGS;
		}

//		if (infoTeamBase.blobPicture != null) {     // byte[] 储存图像的不查找
//			listStrID.add(infoTeamBase.blobPicture + "");
//			strSelection += " and "+ TablesFields.INFO_USER_BASE_BLOBPICTURE+" like ? ";
//		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		InfoTeamBase teamBase = queryObject(InfoTeamBase.class,
											Tables.INFO_TEAM_BASE,
											new String[]{Config.COLUMN_NAME},
											strSelection,
											arrStrID);

		return teamBase;
	}

	/**
	 * 删除数据
	 * @param
	 */
	@Override
	public int Del(InfoTeamBase infoTeamBase)
	{
		if(infoTeamBase==null)return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.INFO_TEAM_BASE_CITY, -9); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串

	
		if (infoTeamBase.cTeamID != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_BASE_TEAMID + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateWhere,new String[]{infoTeamBase.cTeamID});
			return nCount;
		}

		if (infoTeamBase.cTeamName != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_BASE_TEAMNAME +Config.SQL_LIKE_ARGS;//infoTeamBase.cUserName;
			int nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateWhere,new String[]{infoTeamBase.cTeamName});
			return nCount;
		}

		if (infoTeamBase.cTeamLeader != null) //null表示没有传值
		{
			strUpdateWhere=TablesFields.INFO_TEAM_BASE_TEAMLEADER +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_BASE, values,strUpdateWhere ,new String[]{infoTeamBase.cTeamLeader+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamBase.nCity != 0) {
			strUpdateWhere = TablesFields.INFO_TEAM_BASE_CITY +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateWhere, new String[]{infoTeamBase.nCity+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamBase.blobLogo != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_BASE_LOBLOGO + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateWhere,new String[]{infoTeamBase.blobLogo+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamBase.bAdd != false) {
			strUpdateWhere = TablesFields.INFO_TEAM_BASE_ADD + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateWhere, new String[]{Config.SELECTION_TURE_TO_ONE});
			return nCount;
		}

		if (infoTeamBase.nMemberNum != 0) {
			strUpdateWhere = TablesFields.INFO_TEAM_BASE_MEMBERNUM +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateWhere, new String[]{infoTeamBase.nMemberNum+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamBase.nTotalScores != 0) {
			strUpdateWhere = TablesFields.INFO_TEAM_BASE_TOTALSCORES + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateWhere, new String[]{infoTeamBase.nTotalScores+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamBase.nStyle != 0) {
			strUpdateWhere = TablesFields.INFO_TEAM_BASE_STYLE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateWhere,new String[]{infoTeamBase.nStyle+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamBase.textProfile != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_BASE_PROFILE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_BASE, values, strUpdateWhere, new String[]{infoTeamBase.textProfile+Config.COLUMN_QUOTES});
			return nCount;
		}
//		if (infoTeamBase.blobPicture != null) {   //不按照图像进行索引删除
////			strUpdateWhere = TablesFields.INFO_USER_BASE_BLOBPICTURE + Config.SQL_LIKE+infoTeamBase.blobPicture ;
////			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,null);
//			return 0;
//		}

		return 0;
	}
}
