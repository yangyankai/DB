package shootbox.sqlite.info_user_base;

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
public class UserBaseDAO extends BaseDAO<InfoUserBase> implements IPersonInfoUserBaseDAO
{
		public UserBaseDAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(InfoUserBase infoUserBase) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.INFO_USER_BASE_ID ,         infoUserBase.cUserID);
		values.put(TablesFields.INFO_USER_BASE_NAME ,       infoUserBase.cUserName);
		values.put(TablesFields.INFO_USER_BASE_PWD,         infoUserBase.cPwd);
		values.put(TablesFields.INFO_USER_BASE_TEL,         infoUserBase.cTel);
		values.put(TablesFields.INFO_USER_BASE_EMAIL ,      infoUserBase.cEmail);
		values.put(TablesFields.INFO_USER_BASE_TYPE ,       infoUserBase.nType);
		values.put(TablesFields.INFO_USER_BASE_CITY ,       infoUserBase.nCity);
		values.put(TablesFields.INFO_USER_BASE_SEX ,        infoUserBase.nSex);
		values.put(TablesFields.INFO_USER_BASE_AGE ,        infoUserBase.nAge);
		values.put(TablesFields.INFO_USER_BASE_WEIGHT ,     infoUserBase.nWeight);
		values.put(TablesFields.INFO_USER_BASE_HEIGHT ,     infoUserBase.nHeight);
		values.put(TablesFields.INFO_USER_BASE_BLOBPICTURE ,infoUserBase.blobPicture);
		values.put(TablesFields.INFO_USER_BASE_TEXTPROFILE, infoUserBase.textProfile);
		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.INFO_USER_BASE, values);
		}catch (Exception e){

		}

	}

	/**
	 * 更新数据
	 * @param infoUserBase
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(InfoUserBase infoUserBase) throws Exception
	{
		ContentValues values = new ContentValues();

		if (infoUserBase.cUserID != null)
			values.put(TablesFields.INFO_USER_BASE_ID, infoUserBase.cUserID);
		if (infoUserBase.cUserName != null)
			values.put(TablesFields.INFO_USER_BASE_NAME, infoUserBase.cUserName);
		if (infoUserBase.cPwd != null)
			values.put(TablesFields.INFO_USER_BASE_PWD, infoUserBase.cPwd);
		if (infoUserBase.cTel != null)
			values.put(TablesFields.INFO_USER_BASE_TEL, infoUserBase.cTel);
		if (infoUserBase.cEmail != null)
			values.put(TablesFields.INFO_USER_BASE_EMAIL, infoUserBase.cEmail);
		if (infoUserBase.nType != 0)
			values.put(TablesFields.INFO_USER_BASE_TYPE, infoUserBase.nType);
		if (infoUserBase.nCity != 0)
			values.put(TablesFields.INFO_USER_BASE_CITY, infoUserBase.nCity);//原本是boolean类
		if (infoUserBase.nSex != 0)
			values.put(TablesFields.INFO_USER_BASE_SEX, infoUserBase.nSex);
		if (infoUserBase.nAge != 0)
			values.put(TablesFields.INFO_USER_BASE_AGE, infoUserBase.nAge);
		if (infoUserBase.nWeight != 0)
			values.put(TablesFields.INFO_USER_BASE_WEIGHT, infoUserBase.nWeight);
		if (infoUserBase.nHeight != 0)
			values.put(TablesFields.INFO_USER_BASE_HEIGHT, infoUserBase.nHeight);
		if (infoUserBase.blobPicture != null)
			values.put(TablesFields.INFO_USER_BASE_BLOBPICTURE, infoUserBase.blobPicture);
		if (infoUserBase.textProfile != null)
			values.put(TablesFields.INFO_USER_BASE_TEXTPROFILE, infoUserBase.textProfile);

		String strUpdateById = TablesFields.INFO_USER_BASE_ID + Config.SQL_LIKE+" ? ";
		int nCount = 0;
		try {
			nCount = update(Tables.INFO_USER_BASE, values, strUpdateById, new String[]{infoUserBase.cUserID});  //根据ID进行更新
		} catch (Exception e) {
		}

		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<InfoUserBase> GetAll(InfoUserBase infoUserBase)
	{
		if(infoUserBase==null) return null;


		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始
		String strSelection = "1=1 "; // 1=1 目的为了方便拼接 and 字符串
		if (infoUserBase.cUserID != null) {
			listStrID.add(infoUserBase.cUserID);
			strSelection += " and "+ TablesFields.INFO_USER_BASE_ID+" like ? ";
		}
		if (infoUserBase.cUserName != null) {
			listStrID.add(infoUserBase.cUserName);
			strSelection += " and "+ TablesFields.INFO_USER_BASE_NAME+" like ? ";
		}

		if (infoUserBase.cPwd != null) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserBase.cPwd + "");
			strSelection += " and "+ TablesFields.INFO_USER_BASE_PWD+" like ? ";
		}

		if (infoUserBase.cTel != null) {
			listStrID.add(infoUserBase.cTel + "");
			strSelection += " and "+ TablesFields.INFO_USER_BASE_TEL+" like ? ";
		}

		if (infoUserBase.cEmail != null) {
			listStrID.add(infoUserBase.cEmail);
			strSelection += " and "+ TablesFields.INFO_USER_BASE_EMAIL+" like ? ";
		}
		if (infoUserBase.nType != 0) {
			listStrID.add(infoUserBase.nType + "");
			strSelection += " and "+ TablesFields.INFO_USER_BASE_TYPE+" like ? ";
		}

		if (infoUserBase.nCity != 0) {
			listStrID.add(infoUserBase.nCity+"");
			strSelection += " and "+ TablesFields.INFO_USER_BASE_CITY+" like ? ";
		}

		if (infoUserBase.nSex != 0) {
			listStrID.add(infoUserBase.nSex + "");
			strSelection += " and "+ TablesFields.INFO_USER_BASE_SEX+" like ? ";
		}

		if (infoUserBase.nAge != 0) {
			listStrID.add(infoUserBase.nAge + "");
			strSelection += " and "+ TablesFields.INFO_USER_BASE_AGE+" like ? ";
		}
		if (infoUserBase.nWeight != 0) {
			listStrID.add(infoUserBase.nWeight + "");
			strSelection += " and "+ TablesFields.INFO_USER_BASE_WEIGHT+" like ? ";
		}

		if (infoUserBase.nHeight != 0) {
			listStrID.add(infoUserBase.nHeight + "");
			strSelection += " and "+ TablesFields.INFO_USER_BASE_HEIGHT+" like ? ";
		}

//		if (infoUserBase.blobPicture != null) {     // byte[] 储存图像的不查找
//			listStrID.add(infoUserBase.blobPicture + "");
//			strSelection += " and "+ TablesFields.INFO_USER_BASE_BLOBPICTURE+" like ? ";
//		}

		if (infoUserBase.textProfile != null) {
			listStrID.add(infoUserBase.textProfile + "");
			strSelection += " and "+ TablesFields.INFO_USER_BASE_TEXTPROFILE+" like ? ";
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		List<InfoUserBase> userBases = queryList(InfoUserBase.class,
				Tables.INFO_USER_BASE,
				new String[]{"*"},
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
	public InfoUserBase GetOne(InfoUserBase infoUserBase) // 按照cUserID 或者cUserName 查找
	{
		if(infoUserBase==null)return null;

		List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始

		String strSelection = "1=0 "; // 1=0 目的为了方便拼接 or 字符串
		if (infoUserBase.cUserID != null) {
			listStrID.add(infoUserBase.cUserID);
			strSelection += "or cUserID like ?";
		}
		if (infoUserBase.cUserName != null) {
			listStrID.add(infoUserBase.cUserName);
			strSelection += "or cUserName like ?";
		}

		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		InfoUserBase infoUserBase1 = queryObject(InfoUserBase.class,
												"info_user_base",
												new String[]{"*"},
												strSelection,
												arrStrID);

		return infoUserBase1;
	}

	/**
	 * 删除数据
	 * @param
	 */
	@Override
	public int Del(InfoUserBase infoUserBase)
	{
		if(infoUserBase==null)return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.INFO_USER_BASE_TYPE, -1); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串

	
		if (infoUserBase.cUserID != null) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_ID + Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,new String[]{infoUserBase.cUserID});
			return nCount;
		}

		if (infoUserBase.cUserName != null) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_NAME +Config.SQL_LIKE+ " ? ";//infoUserBase.cUserName;
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,new String[]{infoUserBase.cUserName});
			return nCount;
		}

		if (infoUserBase.cPwd != null) //null表示没有传值
		{
			strUpdateWhere=TablesFields.INFO_USER_BASE_PWD +Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values,strUpdateWhere ,new String[]{infoUserBase.cPwd});
			return nCount;
		}

		if (infoUserBase.cTel != null) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_TEL +Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere, new String[]{infoUserBase.cTel});
			return nCount;
		}

		if (infoUserBase.cEmail != null) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_EMAIL + Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,new String[]{infoUserBase.cEmail});
			return nCount;
		}

		if (infoUserBase.nType != 0) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_TYPE + Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere, new String[]{infoUserBase.nType+"" });
			return nCount;
		}

		if (infoUserBase.nCity != 0) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_CITY +Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere, new String[]{infoUserBase.nCity+""});
			return nCount;
		}

		if (infoUserBase.nSex != 0) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_SEX + Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere, new String[]{infoUserBase.nSex+""});
			return nCount;
		}

		if (infoUserBase.nAge != 0) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_AGE + Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,new String[]{infoUserBase.nAge+""});
			return nCount;
		}

		if (infoUserBase.nWeight != 0) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_WEIGHT + Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere, new String[]{infoUserBase.nWeight+""});
			return nCount;
		}

		if (infoUserBase.nHeight != 0) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_HEIGHT + Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,new String[]{infoUserBase.nHeight+""});
			return nCount;
		}

		if (infoUserBase.blobPicture != null) {   //不按照图像进行索引删除
//			strUpdateWhere = TablesFields.INFO_USER_BASE_BLOBPICTURE + Config.SQL_LIKE+infoUserBase.blobPicture ;
//			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,null);
			return 0;
		}

		if (infoUserBase.textProfile != null) {
			strUpdateWhere = TablesFields.INFO_USER_BASE_TEXTPROFILE + Config.SQL_LIKE+ " ? ";
			int nCount = update(Tables.INFO_USER_BASE, values, strUpdateWhere,new String[]{infoUserBase.textProfile});
			return nCount;
		}

		if (infoUserBase.nType!= 0) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_TEAM + Config.SQL_LIKE+ " ? ";
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere,new String[]{infoUserBase.nType+""});
            return nCount;
        }
		return 0;
	}
}
