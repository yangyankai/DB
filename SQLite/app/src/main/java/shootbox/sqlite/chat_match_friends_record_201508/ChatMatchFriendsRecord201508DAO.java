package shootbox.sqlite.chat_match_friends_record_201508;

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
public class ChatMatchFriendsRecord201508DAO extends BaseDAO<ChatMatchFriendsRecord201508> implements IPersonChatMatchFriendsRecord201508DAO
{
		public ChatMatchFriendsRecord201508DAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHANNELID  ,chatMatchFriendsRecord201508.cChannelID);
		values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHATROOMID ,chatMatchFriendsRecord201508.cSenderID);
		values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDERID   ,chatMatchFriendsRecord201508.cReceiverID);
		values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDTIME   ,chatMatchFriendsRecord201508.tSendTime);
		values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISSEND     ,chatMatchFriendsRecord201508.bIsSend);
		values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDCONTENT,chatMatchFriendsRecord201508.blobSendContent);
		values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISRECEIVE  ,chatMatchFriendsRecord201508.bIsReceive);

		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.CHAT_MATCH_FRIENDS_RECORD, values);
		}catch (Exception e){

		}

	}

	/**
	 * 更新数据
	 * @param chatMatchFriendsRecord201508
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508) throws Exception
	{
		ContentValues values = new ContentValues();

		if (chatMatchFriendsRecord201508.cChannelID != null)
			values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHANNELID, chatMatchFriendsRecord201508.cChannelID);
		if (chatMatchFriendsRecord201508.cSenderID != null)
			values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHATROOMID, chatMatchFriendsRecord201508.cSenderID);
		if (chatMatchFriendsRecord201508.cReceiverID != null)
			values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDERID, chatMatchFriendsRecord201508.cReceiverID);
		if (chatMatchFriendsRecord201508.tSendTime != null)
			values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDTIME, chatMatchFriendsRecord201508.tSendTime);
		if (chatMatchFriendsRecord201508.bIsSend != false)
			values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISSEND, chatMatchFriendsRecord201508.bIsSend);
		if (chatMatchFriendsRecord201508.blobSendContent != null)
			values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDCONTENT, chatMatchFriendsRecord201508.blobSendContent);
		if (chatMatchFriendsRecord201508.bIsReceive != false)
			values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISRECEIVE, chatMatchFriendsRecord201508.bIsReceive);

		String strUpdateById = TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHANNELID + Config.SQL_LIKE_ARGS;
		int nCount = 0;
		try {
			nCount = update(Tables.CHAT_MATCH_FRIENDS_RECORD, values, strUpdateById, new String[]{chatMatchFriendsRecord201508.cChannelID});  //根据ID进行更新
		} catch (Exception e) {
		}
		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<ChatMatchFriendsRecord201508> GetAll(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508)
	{
		if(chatMatchFriendsRecord201508==null) return null;


		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (chatMatchFriendsRecord201508.cChannelID != null) {
			listStrID.add(chatMatchFriendsRecord201508.cChannelID);
			strSelection +=Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHANNELID+Config.SQL_LIKE_ARGS;
		}
		if (chatMatchFriendsRecord201508.cSenderID != null) {
			listStrID.add(chatMatchFriendsRecord201508.cSenderID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHATROOMID+Config.SQL_LIKE_ARGS;
		}
		if (chatMatchFriendsRecord201508.cReceiverID != null) {
			listStrID.add(chatMatchFriendsRecord201508.cReceiverID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDERID+Config.SQL_LIKE_ARGS;
		}
		if (chatMatchFriendsRecord201508.tSendTime != null) {
			listStrID.add(chatMatchFriendsRecord201508.tSendTime+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (chatMatchFriendsRecord201508.bIsSend != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISSEND+Config.SQL_LIKE_ARGS;
		}

		if (chatMatchFriendsRecord201508.blobSendContent != null) {
			listStrID.add(chatMatchFriendsRecord201508.blobSendContent+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDCONTENT+Config.SQL_LIKE_ARGS;
		}

		if (chatMatchFriendsRecord201508.bIsReceive != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISRECEIVE+Config.SQL_LIKE_ARGS;
		}


		//		if (chatMatchFriendsRecord201508.blobPicture != null) {     // byte[] 储存图像的不查找
//			listStrID.add(chatMatchFriendsRecord201508.blobPicture + "");
//			strSelection += " and "+ TablesFields.INFO_USER_BASE_BLOBPICTURE+" like ? ";
//		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		List<ChatMatchFriendsRecord201508> chatMatchFriendsRecord = queryList
				(ChatMatchFriendsRecord201508.class,
				Tables.CHAT_MATCH_FRIENDS_RECORD,
				new String[]{Config.COLUMN_NAME},
				strSelection,
				arrStrID,
				null,
				Config.PAGENUM,
				Config.PAGESIZE);
		return chatMatchFriendsRecord;
	}

	/**
	 * 查询某一条数据
	 * @param
	 * @return
	 */
	@Override
	public ChatMatchFriendsRecord201508 GetOne(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508) //
	// 按照cUserID 或者cUserName 查找
	{
		if(chatMatchFriendsRecord201508==null)return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (chatMatchFriendsRecord201508.cChannelID != null) {
			listStrID.add(chatMatchFriendsRecord201508.cChannelID);
			strSelection +=Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHANNELID+Config.SQL_LIKE_ARGS;
		}
		if (chatMatchFriendsRecord201508.cSenderID != null) {
			listStrID.add(chatMatchFriendsRecord201508.cSenderID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHATROOMID+Config.SQL_LIKE_ARGS;
		}
		if (chatMatchFriendsRecord201508.cReceiverID != null) {
			listStrID.add(chatMatchFriendsRecord201508.cReceiverID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDERID+Config.SQL_LIKE_ARGS;
		}
		if (chatMatchFriendsRecord201508.tSendTime != null) {
			listStrID.add(chatMatchFriendsRecord201508.tSendTime+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (chatMatchFriendsRecord201508.bIsSend != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISSEND+Config.SQL_LIKE_ARGS;
		}

		if (chatMatchFriendsRecord201508.blobSendContent != null) {
			listStrID.add(chatMatchFriendsRecord201508.blobSendContent+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDCONTENT+Config.SQL_LIKE_ARGS;
		}

		if (chatMatchFriendsRecord201508.bIsReceive != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISRECEIVE+Config.SQL_LIKE_ARGS;
		}


		//		if (chatMatchFriendsRecord201508.blobPicture != null) {     // byte[] 储存图像的不查找
//			listStrID.add(chatMatchFriendsRecord201508.blobPicture + "");
//			strSelection += " and "+ TablesFields.INFO_USER_BASE_BLOBPICTURE+" like ? ";
//		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		ChatMatchFriendsRecord201508 chatMatchFriendsRecord = queryObject(ChatMatchFriendsRecord201508.class,
											Tables.CHAT_MATCH_FRIENDS_RECORD,
											new String[]{Config.COLUMN_NAME},
											strSelection,
											arrStrID);

		return chatMatchFriendsRecord;
	}

	/**
	 * 删除数据
	 * @param
	 */
	@Override
	public int Del(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508)
	{
		if(chatMatchFriendsRecord201508==null)return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDTIME , -1); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串

	
		if (chatMatchFriendsRecord201508.cChannelID != null) {
			strUpdateWhere = TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHANNELID + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_MATCH_FRIENDS_RECORD, values, strUpdateWhere,new String[]{chatMatchFriendsRecord201508.cChannelID});
			return nCount;
		}
		if (chatMatchFriendsRecord201508.cSenderID != null) {
			strUpdateWhere = TablesFields.CHAT_MATCH_FRIENDS_RECORD_CHATROOMID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_MATCH_FRIENDS_RECORD, values, strUpdateWhere, new String[]{chatMatchFriendsRecord201508.cSenderID+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (chatMatchFriendsRecord201508.cReceiverID != null) //null表示没有传值
		{
			strUpdateWhere=TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDERID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_MATCH_FRIENDS_RECORD, values,strUpdateWhere ,new String[]{chatMatchFriendsRecord201508.cReceiverID+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (chatMatchFriendsRecord201508.tSendTime != null) {
			strUpdateWhere = TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDTIME + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_MATCH_FRIENDS_RECORD, values, strUpdateWhere,new String[]{chatMatchFriendsRecord201508.tSendTime+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (chatMatchFriendsRecord201508.bIsSend != false) {
			strUpdateWhere =  TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISSEND + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_MATCH_FRIENDS_RECORD, values, strUpdateWhere, new String[]{Config.SELECTION_TURE_TO_ONE});
			return nCount;
		}

		if (chatMatchFriendsRecord201508.blobSendContent != null) {
			strUpdateWhere = TablesFields.CHAT_MATCH_FRIENDS_RECORD_SENDCONTENT +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_MATCH_FRIENDS_RECORD, values, strUpdateWhere, new String[]{chatMatchFriendsRecord201508.blobSendContent+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (chatMatchFriendsRecord201508.bIsReceive != false) {
			strUpdateWhere =  TablesFields.CHAT_MATCH_FRIENDS_RECORD_ISRECEIVE+ Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.CHAT_MATCH_FRIENDS_RECORD, values, strUpdateWhere, new String[]{Config.SELECTION_TURE_TO_ONE});
			return nCount;
		}
//		if (chatMatchFriendsRecord201508.blobPicture != null) {   //不按照图像进行索引删除
////			strUpdateWhere = TablesFields.INFO_USER_BASE_BLOBPICTURE + Config.SQL_LIKE+chatMatchFriendsRecord201508.blobPicture ;
////			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,null);
//			return 0;
//		}

		return 0;
	}
}
