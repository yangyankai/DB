package shootbox.sqlite.info_team_apply_detail;

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
public class TeamApplyDetailDAO extends BaseDAO<InfoTeamApplyDetail> implements IPersonInfoApplyDetailDAO
{
		public TeamApplyDetailDAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(InfoTeamApplyDetail infoTeamApplyDetail) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_MATCHID      		,infoTeamApplyDetail.cMatchID);
		values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_TEAMID       		,infoTeamApplyDetail.cTeamID);
		values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_APPLICATID   	,infoTeamApplyDetail.cApplicatID);
		values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYTIME     	,infoTeamApplyDetail.tApplyTime);
		values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYNOTE      	,infoTeamApplyDetail.cApplyNote);
		values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMSTATUS   	,infoTeamApplyDetail.nConfirmStatus);
		values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMTIME    	,infoTeamApplyDetail.tConfirmTime);
		values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_REPLYNOTE      	,infoTeamApplyDetail.cReplyNote);

		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.INFO_TEAM_APPLY_DETAIL, values);
		}catch (Exception e){

		}

	}

	/**
	 * 更新数据
	 * @param infoTeamApplyDetail
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(InfoTeamApplyDetail infoTeamApplyDetail) throws Exception
	{
		ContentValues values = new ContentValues();

		if (infoTeamApplyDetail.cMatchID != null)
			values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_MATCHID, infoTeamApplyDetail.cMatchID);
		if (infoTeamApplyDetail.cTeamID != null)
			values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_TEAMID, infoTeamApplyDetail.cTeamID);
		if (infoTeamApplyDetail.cApplicatID != null)
			values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_APPLICATID, infoTeamApplyDetail.cApplicatID);
		if (infoTeamApplyDetail.tApplyTime != null)
			values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYTIME, infoTeamApplyDetail.tApplyTime);
		if (infoTeamApplyDetail.cApplyNote != null)
			values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYNOTE, infoTeamApplyDetail.cApplyNote);
		if (infoTeamApplyDetail.nConfirmStatus != 0)
			values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMSTATUS, infoTeamApplyDetail.nConfirmStatus);
		if (infoTeamApplyDetail.tConfirmTime != null)
			values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMTIME, infoTeamApplyDetail.tConfirmTime);//原本是boolean类
		if (infoTeamApplyDetail.cReplyNote != null)
			values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_REPLYNOTE, infoTeamApplyDetail.cReplyNote);

		String strUpdateById = TablesFields.INFO_TEAM_APPLY_DETAIL_MATCHID + Config.SQL_LIKE_ARGS;
		int nCount = 0;
		try {
			nCount = update(Tables.INFO_TEAM_APPLY_DETAIL, values, strUpdateById, new String[]{infoTeamApplyDetail.cMatchID});  //根据ID进行更新
		} catch (Exception e) {
		}
		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<InfoTeamApplyDetail> GetAll(InfoTeamApplyDetail infoTeamApplyDetail)
	{
		if(infoTeamApplyDetail==null) return null;


		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoTeamApplyDetail.cMatchID != null) {
			listStrID.add(infoTeamApplyDetail.cMatchID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_MATCHID+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamApplyDetail.cTeamID != null) {
			listStrID.add(infoTeamApplyDetail.cTeamID);
			strSelection += Config.SQL_AND + TablesFields.INFO_TEAM_APPLY_DETAIL_TEAMID+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.cApplicatID != null) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoTeamApplyDetail.cApplicatID +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_TEAM_APPLY_DETAIL_APPLICATID+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.tApplyTime != null) {
			listStrID.add(infoTeamApplyDetail.tApplyTime + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYTIME+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.cApplyNote != null) {
			listStrID.add(infoTeamApplyDetail.cApplyNote+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYNOTE+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamApplyDetail.nConfirmStatus != 0) {
			listStrID.add(infoTeamApplyDetail.nConfirmStatus +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMSTATUS+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.tConfirmTime != null) {
			listStrID.add(infoTeamApplyDetail.tConfirmTime+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMTIME+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.cReplyNote != null) {
			listStrID.add(infoTeamApplyDetail.cReplyNote + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_REPLYNOTE+Config.SQL_LIKE_ARGS;
		}

//		if (infoTeamApplyDetail.blobPicture != null) {     // byte[] 储存图像的不查找
//			listStrID.add(infoTeamApplyDetail.blobPicture + "");
//			strSelection += " and "+ TablesFields.INFO_USER_BASE_BLOBPICTURE+" like ? ";
//		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		List<InfoTeamApplyDetail> teamApplyDetail = queryList(InfoTeamApplyDetail.class,
				Tables.INFO_TEAM_APPLY_DETAIL,
				new String[]{Config.COLUMN_NAME},
				strSelection,
				arrStrID,
				null,
				Config.PAGENUM,
				Config.PAGESIZE);
		return teamApplyDetail;
	}

	/**
	 * 查询某一条数据
	 * @param
	 * @return
	 */
	@Override
	public InfoTeamApplyDetail GetOne(InfoTeamApplyDetail infoTeamApplyDetail) //
	// 按照cUserID 或者cUserName 查找
	{
		if(infoTeamApplyDetail==null)return null;


		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoTeamApplyDetail.cMatchID != null) {
			listStrID.add(infoTeamApplyDetail.cMatchID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_MATCHID+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamApplyDetail.cTeamID != null) {
			listStrID.add(infoTeamApplyDetail.cTeamID);
			strSelection += Config.SQL_AND + TablesFields.INFO_TEAM_APPLY_DETAIL_TEAMID+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.cApplicatID != null) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoTeamApplyDetail.cApplicatID +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_TEAM_APPLY_DETAIL_APPLICATID+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.tApplyTime != null) {
			listStrID.add(infoTeamApplyDetail.tApplyTime + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYTIME+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.cApplyNote != null) {
			listStrID.add(infoTeamApplyDetail.cApplyNote+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYNOTE+Config.SQL_LIKE_ARGS;
		}
		if (infoTeamApplyDetail.nConfirmStatus != 0) {
			listStrID.add(infoTeamApplyDetail.nConfirmStatus +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMSTATUS+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.tConfirmTime != null) {
			listStrID.add(infoTeamApplyDetail.tConfirmTime+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMTIME+Config.SQL_LIKE_ARGS;
		}

		if (infoTeamApplyDetail.cReplyNote != null) {
			listStrID.add(infoTeamApplyDetail.cReplyNote + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_TEAM_APPLY_DETAIL_REPLYNOTE+Config.SQL_LIKE_ARGS;
		}

//		if (infoTeamApplyDetail.blobPicture != null) {     // byte[] 储存图像的不查找
//			listStrID.add(infoTeamApplyDetail.blobPicture + "");
//			strSelection += " and "+ TablesFields.INFO_USER_BASE_BLOBPICTURE+" like ? ";
//		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完

		InfoTeamApplyDetail teamApplyDetail = queryObject(InfoTeamApplyDetail.class,
											Tables.INFO_TEAM_APPLY_DETAIL,
											new String[]{Config.COLUMN_NAME},
											strSelection,
											arrStrID);

		return teamApplyDetail;
	}

	/**
	 * 删除数据
	 * @param
	 */
	@Override
	public int Del(InfoTeamApplyDetail infoTeamApplyDetail)
	{
		if(infoTeamApplyDetail==null)return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYTIME, -6); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串

	
		if (infoTeamApplyDetail.cMatchID != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_APPLY_DETAIL_MATCHID + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_APPLY_DETAIL, values, strUpdateWhere,new String[]{infoTeamApplyDetail.cMatchID});
			return nCount;
		}

		if (infoTeamApplyDetail.cTeamID != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_APPLY_DETAIL_TEAMID +Config.SQL_LIKE_ARGS;//infoTeamApplyDetail.cUserName;
			int nCount = update(Tables.INFO_TEAM_APPLY_DETAIL, values, strUpdateWhere,new String[]{infoTeamApplyDetail.cTeamID});
			return nCount;
		}

		if (infoTeamApplyDetail.cApplicatID != null) //null表示没有传值
		{
			strUpdateWhere=TablesFields.INFO_TEAM_APPLY_DETAIL_APPLICATID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_APPLY_DETAIL, values,strUpdateWhere ,new String[]{infoTeamApplyDetail.cApplicatID+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamApplyDetail.tApplyTime != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYTIME +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_APPLY_DETAIL, values, strUpdateWhere, new String[]{infoTeamApplyDetail.tApplyTime+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamApplyDetail.cApplyNote != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_APPLY_DETAIL_APPLYNOTE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_APPLY_DETAIL, values, strUpdateWhere,new String[]{infoTeamApplyDetail.cApplyNote+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamApplyDetail.nConfirmStatus != 0) {
			strUpdateWhere = TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMSTATUS + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_APPLY_DETAIL, values, strUpdateWhere, new String[]{infoTeamApplyDetail.nConfirmStatus+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamApplyDetail.tConfirmTime != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_APPLY_DETAIL_CONFIRMTIME +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_APPLY_DETAIL, values, strUpdateWhere, new String[]{infoTeamApplyDetail.tConfirmTime+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoTeamApplyDetail.cReplyNote != null) {
			strUpdateWhere = TablesFields.INFO_TEAM_APPLY_DETAIL_REPLYNOTE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_TEAM_APPLY_DETAIL, values, strUpdateWhere, new String[]{infoTeamApplyDetail.cReplyNote+Config.COLUMN_QUOTES});
			return nCount;
		}
//		if (infoTeamApplyDetail.blobPicture != null) {   //不按照图像进行索引删除
////			strUpdateWhere = TablesFields.INFO_USER_BASE_BLOBPICTURE + Config.SQL_LIKE+infoTeamApplyDetail.blobPicture ;
////			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,null);
//			return 0;
//		}

		return 0;
	}
}
