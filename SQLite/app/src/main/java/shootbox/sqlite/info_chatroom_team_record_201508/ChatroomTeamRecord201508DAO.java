package shootbox.sqlite.info_chatroom_team_record_201508;

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
public class ChatroomTeamRecord201508DAO extends BaseDAO<InfoChatroomTeamRecord201508> implements IPersonChatroomTeamRecord201508DAO
{
		public ChatroomTeamRecord201508DAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_CHANNELID  ,infoChatroomTeamRecord201508. cChannelID);
		values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_CHATROOMID ,infoChatroomTeamRecord201508. cChatRoomID);
		values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDERID   ,infoChatroomTeamRecord201508. cSenderID);
		values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDTIME   ,infoChatroomTeamRecord201508. tSendTime);
		values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_ISSEND     ,infoChatroomTeamRecord201508.bIsSend);
		values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDCONTENT,infoChatroomTeamRecord201508.blobSendContent);

		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.INFO_CHATROOM_TEAM_RECORD, values);
		}catch (Exception e){

		}

	}

	/**
	 * 更新数据
	 * @param infoChatroomTeamRecord201508
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508) throws Exception
	{
		ContentValues values = new ContentValues();

		if (infoChatroomTeamRecord201508.cChannelID != null)
			values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_CHANNELID, infoChatroomTeamRecord201508.cChannelID);
		if (infoChatroomTeamRecord201508.cChatRoomID != null)
			values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_CHATROOMID, infoChatroomTeamRecord201508.cChatRoomID);
		if (infoChatroomTeamRecord201508.cSenderID != null)
			values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDERID, infoChatroomTeamRecord201508.cSenderID);
		if (infoChatroomTeamRecord201508.tSendTime != null)
			values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDTIME, infoChatroomTeamRecord201508.tSendTime);
		if (infoChatroomTeamRecord201508.bIsSend != false)
			values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_ISSEND, infoChatroomTeamRecord201508.bIsSend);
		if (infoChatroomTeamRecord201508.blobSendContent != null)
			values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDCONTENT, infoChatroomTeamRecord201508.blobSendContent);

		String strUpdateById = TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDERID + Config.SQL_LIKE_ARGS;
		int nCount = 0;
		try {
			nCount = update(Tables.INFO_CHATROOM_TEAM_RECORD, values, strUpdateById, new String[]{infoChatroomTeamRecord201508.cSenderID});  //根据ID进行更新
		} catch (Exception e) {
		}
		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<InfoChatroomTeamRecord201508> GetAll(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508)
	{
		if(infoChatroomTeamRecord201508==null) return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoChatroomTeamRecord201508.cChannelID != null) {
			listStrID.add(infoChatroomTeamRecord201508.cChannelID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_CHATROOM_TEAM_RECORD_CHANNELID+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomTeamRecord201508.cChatRoomID != null) {
			listStrID.add(infoChatroomTeamRecord201508.cChatRoomID);
			strSelection += Config.SQL_AND + TablesFields.INFO_CHATROOM_TEAM_RECORD_CHATROOMID+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomTeamRecord201508.cSenderID != null) {
			listStrID.add(infoChatroomTeamRecord201508.cSenderID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDERID+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomTeamRecord201508.tSendTime != null) {
			listStrID.add(infoChatroomTeamRecord201508.tSendTime+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomTeamRecord201508.bIsSend != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND + TablesFields.INFO_CHATROOM_TEAM_RECORD_ISSEND + Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomTeamRecord201508.blobSendContent != null) {
			listStrID.add(infoChatroomTeamRecord201508.blobSendContent+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDCONTENT+Config.SQL_LIKE_ARGS;
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		List<InfoChatroomTeamRecord201508> chatroomTeamRecord201508 = queryList
				(InfoChatroomTeamRecord201508.class,
				Tables.INFO_CHATROOM_TEAM_RECORD,
				new String[]{Config.COLUMN_NAME},
				strSelection,
				arrStrID,
				null,
				Config.PAGENUM,
				Config.PAGESIZE);
		return chatroomTeamRecord201508;
	}

	/**
	 * 查询某一条数据
	 * @param
	 * @return
	 */
	@Override
	public InfoChatroomTeamRecord201508 GetOne(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508)
	{
		if(infoChatroomTeamRecord201508==null)return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoChatroomTeamRecord201508.cChannelID != null) {
			listStrID.add(infoChatroomTeamRecord201508.cChannelID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_CHATROOM_TEAM_RECORD_CHANNELID+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomTeamRecord201508.cChatRoomID != null) {
			listStrID.add(infoChatroomTeamRecord201508.cChatRoomID);
			strSelection += Config.SQL_AND + TablesFields.INFO_CHATROOM_TEAM_RECORD_CHATROOMID+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomTeamRecord201508.cSenderID != null) {
			listStrID.add(infoChatroomTeamRecord201508.cSenderID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDERID+Config.SQL_LIKE_ARGS;
		}

		if (infoChatroomTeamRecord201508.tSendTime != null) {
			listStrID.add(infoChatroomTeamRecord201508.tSendTime+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomTeamRecord201508.bIsSend != false) {
			listStrID.add( Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_TEAM_RECORD_ISSEND+Config.SQL_LIKE_ARGS;
		}

		if (infoChatroomTeamRecord201508.blobSendContent != null) {
			listStrID.add(infoChatroomTeamRecord201508.blobSendContent+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDCONTENT+Config.SQL_LIKE_ARGS;
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		InfoChatroomTeamRecord201508 chatroomTeamRecord201508 = queryObject(InfoChatroomTeamRecord201508.class,
											Tables.INFO_CHATROOM_TEAM_RECORD,
											new String[]{Config.COLUMN_NAME},
											strSelection,
											arrStrID);

		return chatroomTeamRecord201508;
	}

	/**
	 * 删除数据
	 * @param
	 */
	@Override
	public int Del(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508)
	{
		if(infoChatroomTeamRecord201508==null)return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDERID, -1); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串

		if (infoChatroomTeamRecord201508.cChannelID != null) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_TEAM_RECORD_CHANNELID + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_TEAM_RECORD, values, strUpdateWhere,new String[]{infoChatroomTeamRecord201508.cChannelID});
			return nCount;
		}
		if (infoChatroomTeamRecord201508.cChatRoomID != null) //null表示没有传值
		{
			strUpdateWhere=TablesFields.INFO_CHATROOM_TEAM_RECORD_CHATROOMID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_TEAM_RECORD, values,strUpdateWhere ,new String[]{infoChatroomTeamRecord201508.cChatRoomID+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoChatroomTeamRecord201508.cSenderID != null) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDERID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_TEAM_RECORD, values, strUpdateWhere, new String[]{infoChatroomTeamRecord201508.cSenderID+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoChatroomTeamRecord201508.tSendTime != null) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDTIME + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_TEAM_RECORD, values, strUpdateWhere,new String[]{infoChatroomTeamRecord201508.tSendTime+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoChatroomTeamRecord201508.bIsSend != false) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_TEAM_RECORD_ISSEND + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_TEAM_RECORD, values, strUpdateWhere, new String[]{Config.SELECTION_TURE_TO_ONE});
			return nCount;
		}
		if (infoChatroomTeamRecord201508.blobSendContent != null) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_TEAM_RECORD_SENDCONTENT +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_TEAM_RECORD, values, strUpdateWhere, new String[]{infoChatroomTeamRecord201508.blobSendContent+Config.COLUMN_QUOTES});
			return nCount;
		}
		return 0;
	}
}
