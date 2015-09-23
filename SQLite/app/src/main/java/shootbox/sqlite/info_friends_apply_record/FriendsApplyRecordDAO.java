package shootbox.sqlite.info_friends_apply_record;

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
public class FriendsApplyRecordDAO extends BaseDAO<InfoFriendsApplyRecord> implements IPersonInfoFriendsApplyRecordDAO
{
		public FriendsApplyRecordDAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(InfoFriendsApplyRecord infoFriendsApplyRecord) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_USERID       	,infoFriendsApplyRecord.cUserID);
		values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLICATID   	,infoFriendsApplyRecord.cApplicatID);
		values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYTIME    	,infoFriendsApplyRecord.tApplyTime);
		values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYNOTE     ,infoFriendsApplyRecord.cApplyNote);
		values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMSTATUS	,infoFriendsApplyRecord.nConfirmStatus);
		values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMTIME   ,infoFriendsApplyRecord.tConfirmTime);
		values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_REPLYNOTE     ,infoFriendsApplyRecord.cReplyNote);

		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.INFO_FRIENDS_APPLY_RECORD, values);
		}catch (Exception e){

		}

	}

	/**
	 * 更新数据
	 * @param infoFriendsApplyRecord
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(InfoFriendsApplyRecord infoFriendsApplyRecord) throws Exception
	{
		ContentValues values = new ContentValues();

		if (infoFriendsApplyRecord.cUserID != null)
			values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_USERID, infoFriendsApplyRecord.cUserID);
		if (infoFriendsApplyRecord.cApplicatID != null)
			values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLICATID, infoFriendsApplyRecord.cApplicatID);
		if (infoFriendsApplyRecord.tApplyTime != null)
			values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYTIME, infoFriendsApplyRecord.tApplyTime);
		if (infoFriendsApplyRecord.cApplyNote != null)
			values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYNOTE, infoFriendsApplyRecord.cApplyNote);
		if (infoFriendsApplyRecord.nConfirmStatus != 0)
			values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMSTATUS, infoFriendsApplyRecord.nConfirmStatus);
		if (infoFriendsApplyRecord.tConfirmTime != null)
			values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMTIME, infoFriendsApplyRecord.tConfirmTime);
		if (infoFriendsApplyRecord.cReplyNote != null)
			values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_REPLYNOTE, infoFriendsApplyRecord.cReplyNote);

		String strUpdateById = TablesFields.INFO_FRIENDS_APPLY_RECORD_USERID + Config.SQL_LIKE_ARGS;
		int nCount = 0;
		try {
			nCount = update(Tables.INFO_FRIENDS_APPLY_RECORD, values, strUpdateById, new String[]{infoFriendsApplyRecord.cUserID});  //根据ID进行更新
		} catch (Exception e) {
		}
		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<InfoFriendsApplyRecord> GetAll(InfoFriendsApplyRecord infoFriendsApplyRecord)
	{
		if(infoFriendsApplyRecord==null) return null;


		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoFriendsApplyRecord.cUserID != null) {
			listStrID.add(infoFriendsApplyRecord.cUserID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_USERID+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.cApplicatID != null) {
			listStrID.add(infoFriendsApplyRecord.cApplicatID);
			strSelection += Config.SQL_AND + TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLICATID+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.tApplyTime != null) {
			listStrID.add(infoFriendsApplyRecord.tApplyTime + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.cApplyNote != null) {
			listStrID.add(infoFriendsApplyRecord.cApplyNote+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYNOTE+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.nConfirmStatus != 0) {
			listStrID.add(infoFriendsApplyRecord.nConfirmStatus +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMSTATUS+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.tConfirmTime != null) {
			listStrID.add(infoFriendsApplyRecord.tConfirmTime+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.cReplyNote != null) {
			listStrID.add(infoFriendsApplyRecord.cReplyNote + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_REPLYNOTE+Config.SQL_LIKE_ARGS;
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完
		List<InfoFriendsApplyRecord> friendsApplyRecord = queryList(InfoFriendsApplyRecord.class,
				Tables.INFO_FRIENDS_APPLY_RECORD,
				new String[]{Config.COLUMN_NAME},
				strSelection,
				arrStrID,
				null,
				Config.PAGENUM,
				Config.PAGESIZE);
		return friendsApplyRecord;
	}

	/**
	 * 查询某一条数据
	 * @param
	 * @return
	 */
	@Override
	public InfoFriendsApplyRecord GetOne(InfoFriendsApplyRecord infoFriendsApplyRecord){
		if(infoFriendsApplyRecord==null)return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoFriendsApplyRecord.cUserID != null) {
			listStrID.add(infoFriendsApplyRecord.cUserID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_USERID+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.cApplicatID != null) {
			listStrID.add(infoFriendsApplyRecord.cApplicatID);
			strSelection += Config.SQL_AND + TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLICATID+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.tApplyTime != null) {
			listStrID.add(infoFriendsApplyRecord.tApplyTime + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.cApplyNote != null) {
			listStrID.add(infoFriendsApplyRecord.cApplyNote+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYNOTE+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.nConfirmStatus != 0) {
			listStrID.add(infoFriendsApplyRecord.nConfirmStatus +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMSTATUS+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.tConfirmTime != null) {
			listStrID.add(infoFriendsApplyRecord.tConfirmTime+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoFriendsApplyRecord.cReplyNote != null) {
			listStrID.add(infoFriendsApplyRecord.cReplyNote + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_FRIENDS_APPLY_RECORD_REPLYNOTE+Config.SQL_LIKE_ARGS;
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完
		InfoFriendsApplyRecord friendsApplyRecord = queryObject(InfoFriendsApplyRecord.class,
											Tables.INFO_FRIENDS_APPLY_RECORD,
											new String[]{Config.COLUMN_NAME},
											strSelection,
											arrStrID);

		return friendsApplyRecord;
	}

	/**
	 * 删除数据
	 * @param
	 */
	@Override
	public int Del(InfoFriendsApplyRecord infoFriendsApplyRecord)
	{
		if(infoFriendsApplyRecord==null)return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYTIME, -5); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串
		if (infoFriendsApplyRecord.cUserID != null) {
			strUpdateWhere = TablesFields.INFO_FRIENDS_APPLY_RECORD_USERID + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_FRIENDS_APPLY_RECORD, values, strUpdateWhere,new String[]{infoFriendsApplyRecord.cUserID});
			return nCount;
		}
		if (infoFriendsApplyRecord.cApplicatID != null){
			strUpdateWhere=TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLICATID + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_FRIENDS_APPLY_RECORD, values,strUpdateWhere ,new String[]{infoFriendsApplyRecord.cApplicatID+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoFriendsApplyRecord.tApplyTime != null) {
			strUpdateWhere = TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYTIME + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_FRIENDS_APPLY_RECORD, values, strUpdateWhere, new String[]{infoFriendsApplyRecord.tApplyTime+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoFriendsApplyRecord.cApplyNote != null) {
			strUpdateWhere = TablesFields.INFO_FRIENDS_APPLY_RECORD_APPLYNOTE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_FRIENDS_APPLY_RECORD, values, strUpdateWhere,new String[]{infoFriendsApplyRecord.cApplyNote+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoFriendsApplyRecord.nConfirmStatus != 0) {
			strUpdateWhere = TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMSTATUS + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_FRIENDS_APPLY_RECORD, values, strUpdateWhere, new String[]{infoFriendsApplyRecord.nConfirmStatus+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoFriendsApplyRecord.tConfirmTime != null) {
			strUpdateWhere = TablesFields.INFO_FRIENDS_APPLY_RECORD_CONFIRMTIME + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_FRIENDS_APPLY_RECORD, values, strUpdateWhere, new String[]{infoFriendsApplyRecord.tConfirmTime+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoFriendsApplyRecord.cReplyNote != null) {
			strUpdateWhere = TablesFields.INFO_FRIENDS_APPLY_RECORD_REPLYNOTE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_FRIENDS_APPLY_RECORD, values, strUpdateWhere, new String[]{infoFriendsApplyRecord.cReplyNote+Config.COLUMN_QUOTES});
			return nCount;
		}
		return 0;
	}
}
