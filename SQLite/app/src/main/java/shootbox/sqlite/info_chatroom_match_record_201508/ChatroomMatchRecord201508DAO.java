package shootbox.sqlite.info_chatroom_match_record_201508;

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
public class ChatroomMatchRecord201508DAO extends BaseDAO<InfoChatroomMatchRecord201508> implements IPersonChatroomMatchRecord201508DAO
{
		public ChatroomMatchRecord201508DAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_CHANNELID  ,infoChatroomMatchRecord201508. cChannelID);
		values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_CHATROOMID ,infoChatroomMatchRecord201508. cChatRoomID);
		values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDERID   ,infoChatroomMatchRecord201508. cSenderID);
		values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDTIME   ,infoChatroomMatchRecord201508. tSendTime);
		values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_ISSEND     ,infoChatroomMatchRecord201508.bIsSend);
		values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDCONTENT,infoChatroomMatchRecord201508.blobSendContent);

		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.INFO_CHATROOM_MATCH_RECORD, values);
		}catch (Exception e){

		}

	}

	/**
	 * 更新数据
	 * @param infoChatroomMatchRecord201508
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508) throws Exception
	{
		ContentValues values = new ContentValues();

		if (infoChatroomMatchRecord201508.cChannelID != null)
			values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_CHANNELID, infoChatroomMatchRecord201508.cChannelID);
		if (infoChatroomMatchRecord201508.cChatRoomID != null)
			values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_CHATROOMID, infoChatroomMatchRecord201508.cChatRoomID);
		if (infoChatroomMatchRecord201508.cSenderID != null)
			values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDERID, infoChatroomMatchRecord201508.cSenderID);
		if (infoChatroomMatchRecord201508.tSendTime != null)
			values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDTIME, infoChatroomMatchRecord201508.tSendTime);
		if (infoChatroomMatchRecord201508.bIsSend != false)
			values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_ISSEND, infoChatroomMatchRecord201508.bIsSend);
		if (infoChatroomMatchRecord201508.blobSendContent != null)
			values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDCONTENT, infoChatroomMatchRecord201508.blobSendContent);

		String strUpdateById = TablesFields.INFO_CHATROOM_MATCH_RECORD_CHANNELID + Config.SQL_LIKE_ARGS;
		int nCount = 0;
		try {
			nCount = update(Tables.INFO_CHATROOM_MATCH_RECORD, values, strUpdateById, new String[]{infoChatroomMatchRecord201508.cChannelID});  //根据ID进行更新
		} catch (Exception e) {
		}
		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<InfoChatroomMatchRecord201508> GetAll(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508)
	{
		if(infoChatroomMatchRecord201508==null) return null;


		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoChatroomMatchRecord201508.cChannelID != null) {
			listStrID.add(infoChatroomMatchRecord201508.cChannelID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_CHANNELID+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomMatchRecord201508.cChatRoomID != null) {
			listStrID.add(infoChatroomMatchRecord201508.cChatRoomID);
			strSelection += Config.SQL_AND + TablesFields.INFO_CHATROOM_MATCH_RECORD_CHATROOMID+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomMatchRecord201508.cSenderID != null) {
			listStrID.add(infoChatroomMatchRecord201508.cSenderID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDERID+Config.SQL_LIKE_ARGS;
		}

		if (infoChatroomMatchRecord201508.tSendTime != null) {
			listStrID.add(infoChatroomMatchRecord201508.tSendTime+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomMatchRecord201508.bIsSend != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_ISSEND+Config.SQL_LIKE_ARGS;
		}

		if (infoChatroomMatchRecord201508.blobSendContent != null) {
			listStrID.add(infoChatroomMatchRecord201508.blobSendContent+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDCONTENT+Config.SQL_LIKE_ARGS;
		}

//		if (infoChatroomMatchRecord201508.blobPicture != null) {     // byte[] 储存图像的不查找
//			listStrID.add(infoChatroomMatchRecord201508.blobPicture + "");
//			strSelection += " and "+ TablesFields.INFO_USER_BASE_BLOBPICTURE+" like ? ";
//		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		List<InfoChatroomMatchRecord201508> chatroomMatchRecord201508 = queryList
				(InfoChatroomMatchRecord201508.class,
				Tables.INFO_CHATROOM_MATCH_RECORD,
				new String[]{Config.COLUMN_NAME},
				strSelection,
				arrStrID,
				null,
				Config.PAGENUM,
				Config.PAGESIZE);
		return chatroomMatchRecord201508;
	}

	/**
	 * 查询某一条数据
	 * @param
	 * @return
	 */
	@Override
	public InfoChatroomMatchRecord201508 GetOne(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508) //
	// 按照cUserID 或者cUserName 查找
	{
		if(infoChatroomMatchRecord201508==null)return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoChatroomMatchRecord201508.cChannelID != null) {
			listStrID.add(infoChatroomMatchRecord201508.cChannelID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_CHANNELID+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomMatchRecord201508.cChatRoomID != null) {
			listStrID.add(infoChatroomMatchRecord201508.cChatRoomID);
			strSelection += Config.SQL_AND + TablesFields.INFO_CHATROOM_MATCH_RECORD_CHATROOMID+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomMatchRecord201508.cSenderID != null) {
			listStrID.add(infoChatroomMatchRecord201508.cSenderID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDERID+Config.SQL_LIKE_ARGS;
		}

		if (infoChatroomMatchRecord201508.tSendTime != null) {
			listStrID.add(infoChatroomMatchRecord201508.tSendTime+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoChatroomMatchRecord201508.bIsSend != false) {
			listStrID.add(Config.SELECTION_TURE_TO_ONE);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_ISSEND+Config.SQL_LIKE_ARGS;
		}

		if (infoChatroomMatchRecord201508.blobSendContent != null) {
			listStrID.add(infoChatroomMatchRecord201508.blobSendContent+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDCONTENT+Config.SQL_LIKE_ARGS;
		}

//		if (infoChatroomMatchRecord201508.blobPicture != null) {     // byte[] 储存图像的不查找
//			listStrID.add(infoChatroomMatchRecord201508.blobPicture + "");
//			strSelection += " and "+ TablesFields.INFO_USER_BASE_BLOBPICTURE+" like ? ";
//		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		InfoChatroomMatchRecord201508 chatroomTeamRecord201508 = queryObject(InfoChatroomMatchRecord201508.class,
											Tables.INFO_CHATROOM_MATCH_RECORD,
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
	public int Del(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508)
	{
		if(infoChatroomMatchRecord201508==null)return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDTIME , -5); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串

	
		if (infoChatroomMatchRecord201508.cChannelID != null) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_MATCH_RECORD_CHANNELID + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_MATCH_RECORD, values, strUpdateWhere,new String[]{infoChatroomMatchRecord201508.cChannelID});
			return nCount;
		}
		if (infoChatroomMatchRecord201508.cChatRoomID != null) //null表示没有传值
		{
			strUpdateWhere=TablesFields.INFO_CHATROOM_MATCH_RECORD_CHATROOMID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_MATCH_RECORD, values,strUpdateWhere ,new String[]{infoChatroomMatchRecord201508.cChatRoomID+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoChatroomMatchRecord201508.cSenderID != null) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDERID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_MATCH_RECORD, values, strUpdateWhere, new String[]{infoChatroomMatchRecord201508.cSenderID+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoChatroomMatchRecord201508.tSendTime != null) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDTIME + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_MATCH_RECORD, values, strUpdateWhere,new String[]{infoChatroomMatchRecord201508.tSendTime+Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoChatroomMatchRecord201508.bIsSend != false) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_MATCH_RECORD_ISSEND + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_MATCH_RECORD, values, strUpdateWhere, new String[]{Config.SELECTION_TURE_TO_ONE});
			return nCount;
		}

		if (infoChatroomMatchRecord201508.blobSendContent != null) {
			strUpdateWhere = TablesFields.INFO_CHATROOM_MATCH_RECORD_SENDCONTENT +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_CHATROOM_MATCH_RECORD, values, strUpdateWhere, new String[]{infoChatroomMatchRecord201508.blobSendContent+Config.COLUMN_QUOTES});
			return nCount;
		}
//		if (infoChatroomMatchRecord201508.blobPicture != null) {   //不按照图像进行索引删除
////			strUpdateWhere = TablesFields.INFO_USER_BASE_BLOBPICTURE + Config.SQL_LIKE+infoChatroomMatchRecord201508.blobPicture ;
////			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,null);
//			return 0;
//		}

		return 0;
	}
}
