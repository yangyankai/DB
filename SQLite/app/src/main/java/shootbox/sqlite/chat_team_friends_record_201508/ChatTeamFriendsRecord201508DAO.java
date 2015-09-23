package shootbox.sqlite.chat_team_friends_record_201508;

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
public class ChatTeamFriendsRecord201508DAO extends BaseDAO<ChatTeamFriendsRecord201508> implements IPersonChatTeamFriendsRecord201508DAO
{
		public ChatTeamFriendsRecord201508DAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHANNELID  ,chatTeamFriendsRecord201508.cChannelID);
		values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHATROOMID ,chatTeamFriendsRecord201508.cSenderID);
		values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDERID   ,chatTeamFriendsRecord201508.cReceiverID);
		values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDTIME   ,chatTeamFriendsRecord201508.tSendTime);
		values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISSEND     ,chatTeamFriendsRecord201508.bIsSend);
		values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDCONTENT,chatTeamFriendsRecord201508.blobSendContent);
		values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISRECEIVE	,chatTeamFriendsRecord201508.bIsReceive);

		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.CHAT_TEAM_FRIENDS_RECORD, values);
		}catch (Exception e){

		}
	}

	/**
	 * 更新数据
	 * @param chatTeamFriendsRecord201508
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508) throws Exception
	{
		ContentValues values = new ContentValues();

		if (chatTeamFriendsRecord201508.cChannelID != null)
			values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHANNELID, chatTeamFriendsRecord201508.cChannelID);
		if (chatTeamFriendsRecord201508.cSenderID != null)
			values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHATROOMID, chatTeamFriendsRecord201508.cSenderID);
		if (chatTeamFriendsRecord201508.cReceiverID != null)
			values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDERID, chatTeamFriendsRecord201508.cReceiverID);
		if (chatTeamFriendsRecord201508.tSendTime != null)
			values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDTIME, chatTeamFriendsRecord201508.tSendTime);
		if (chatTeamFriendsRecord201508.bIsSend != false)
			values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISSEND, chatTeamFriendsRecord201508.bIsSend);
		if (chatTeamFriendsRecord201508.blobSendContent != null)
			values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDCONTENT, chatTeamFriendsRecord201508.blobSendContent);
		if (chatTeamFriendsRecord201508.bIsReceive != false)
			values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISRECEIVE, chatTeamFriendsRecord201508.bIsReceive);

		String strUpdateById = TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHANNELID + Config.SQL_LIKE_ARGS;
		int nCount = 0;
		try {
			nCount = update(Tables.CHAT_TEAM_FRIENDS_RECORD, values, strUpdateById, new String[]{chatTeamFriendsRecord201508.cChannelID});  //根据ID进行更新
		} catch (Exception e) {

		}
		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<ChatTeamFriendsRecord201508> GetAll(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508)
	{
		if(chatTeamFriendsRecord201508==null) return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (chatTeamFriendsRecord201508.cChannelID != null) {
			listStrID.add(chatTeamFriendsRecord201508.cChannelID);
			strSelection +=Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHANNELID+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.cSenderID != null) {
			listStrID.add(chatTeamFriendsRecord201508.cSenderID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHATROOMID+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.cReceiverID != null) {
			listStrID.add(chatTeamFriendsRecord201508.cReceiverID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDERID+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.tSendTime != null) {
			listStrID.add(chatTeamFriendsRecord201508.tSendTime+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.bIsSend != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISSEND+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.blobSendContent != null) {
			listStrID.add(chatTeamFriendsRecord201508.blobSendContent+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDCONTENT+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.bIsReceive != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND + TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISRECEIVE + Config.SQL_LIKE_ARGS;
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		List<ChatTeamFriendsRecord201508> chatTeamFriendsRecord = queryList
				(ChatTeamFriendsRecord201508.class,
				Tables.CHAT_TEAM_FRIENDS_RECORD,
				new String[]{Config.COLUMN_NAME},
				strSelection,
				arrStrID,
				null,
				Config.PAGENUM,
				Config.PAGESIZE);
		return chatTeamFriendsRecord;
	}

	/**
	 * 查询某一条数据
	 * @param
	 * @return
	 */
	@Override
	public ChatTeamFriendsRecord201508 GetOne(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508)
	{
		if(chatTeamFriendsRecord201508==null)return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (chatTeamFriendsRecord201508.cChannelID != null) {
			listStrID.add(chatTeamFriendsRecord201508.cChannelID);
			strSelection +=Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHANNELID+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.cSenderID != null) {
			listStrID.add(chatTeamFriendsRecord201508.cSenderID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHATROOMID+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.cReceiverID != null) {
			listStrID.add(chatTeamFriendsRecord201508.cReceiverID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDERID+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.tSendTime != null) {
			listStrID.add(chatTeamFriendsRecord201508.tSendTime+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.bIsSend != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISSEND+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.blobSendContent != null) {
			listStrID.add(chatTeamFriendsRecord201508.blobSendContent+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDCONTENT+Config.SQL_LIKE_ARGS;
		}
		if (chatTeamFriendsRecord201508.bIsReceive != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISRECEIVE+Config.SQL_LIKE_ARGS;
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		ChatTeamFriendsRecord201508 chatTeamFriendsRecord = queryObject(ChatTeamFriendsRecord201508.class,
											Tables.CHAT_TEAM_FRIENDS_RECORD,
											new String[]{Config.COLUMN_NAME},
											strSelection,
											arrStrID);

		return chatTeamFriendsRecord;
	}

	/**
	 * 删除数据
	 * @param
	 */
	@Override
	public int Del(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508)
	{
		if(chatTeamFriendsRecord201508==null)return 0;
		ContentValues values = new ContentValues();
		values.put(TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDTIME , -6); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串

		if (chatTeamFriendsRecord201508.cChannelID != null) {
			strUpdateWhere = TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHANNELID + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_TEAM_FRIENDS_RECORD, values, strUpdateWhere,new String[]{chatTeamFriendsRecord201508.cChannelID});
			return nCount;
		}
		if (chatTeamFriendsRecord201508.cSenderID != null) {
			strUpdateWhere = TablesFields.CHAT_TEAM_FRIENDS_RECORD_CHATROOMID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_TEAM_FRIENDS_RECORD, values, strUpdateWhere, new String[]{chatTeamFriendsRecord201508.cSenderID+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (chatTeamFriendsRecord201508.cReceiverID != null) //null表示没有传值
		{
			strUpdateWhere=TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDERID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_TEAM_FRIENDS_RECORD, values,strUpdateWhere ,new String[]{chatTeamFriendsRecord201508.cReceiverID+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (chatTeamFriendsRecord201508.tSendTime != null) {
			strUpdateWhere = TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDTIME + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_TEAM_FRIENDS_RECORD, values, strUpdateWhere,new String[]{chatTeamFriendsRecord201508.tSendTime+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (chatTeamFriendsRecord201508.bIsSend != false) {
			strUpdateWhere = TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISSEND + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_TEAM_FRIENDS_RECORD, values, strUpdateWhere, new String[]{Config.SELECTION_TURE_TO_ONE});
			return nCount;
		}
		if (chatTeamFriendsRecord201508.blobSendContent != null) {
			strUpdateWhere = TablesFields.CHAT_TEAM_FRIENDS_RECORD_SENDCONTENT +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_TEAM_FRIENDS_RECORD, values, strUpdateWhere, new String[]{chatTeamFriendsRecord201508.blobSendContent+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (chatTeamFriendsRecord201508.bIsReceive != false) {
			strUpdateWhere = TablesFields.CHAT_TEAM_FRIENDS_RECORD_ISRECEIVE +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_TEAM_FRIENDS_RECORD, values, strUpdateWhere, new String[]{Config.SELECTION_TURE_TO_ONE});
			return nCount;
		}

		return 0;
	}
}
