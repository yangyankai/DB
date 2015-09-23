package shootbox.sqlite.info_match_base;

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
public class MatchBaseDAO extends BaseDAO<InfoMatchBase> implements IPersonInfoMatchBaseDAO
{
	public MatchBaseDAO(Context context)
	{
		super(context);
	}

	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(InfoMatchBase infoMatchmBase)
	{
		ContentValues values = new ContentValues();

		values.put(TablesFields.INFO_MATCH_BASE_MATCHID, infoMatchmBase.cMatchID);
		values.put(TablesFields.INFO_MATCH_BASE_MATCHNAME, infoMatchmBase.cMatchName);
		values.put(TablesFields.INFO_MATCH_BASE_TEAMNAME, infoMatchmBase.cTeamName);
		values.put(TablesFields.INFO_MATCH_BASE_ORGNISER, infoMatchmBase.cOrgniser);
		values.put(TablesFields.INFO_MATCH_BASE_MATCHTYPE, infoMatchmBase.nMatchType);
		values.put(TablesFields.INFO_MATCH_BASE_MATCHFORMATTYPE, infoMatchmBase.nMatchFormatType);
		values.put(TablesFields.INFO_MATCH_BASE_STARTTIME, infoMatchmBase.tStartTime);
		values.put(TablesFields.INFO_MATCH_BASE_ENDTIME, infoMatchmBase.tEndTime);
		values.put(TablesFields.INFO_MATCH_BASE_ADDRESS, infoMatchmBase.cAddress);
		values.put(TablesFields.INFO_MATCH_BASE_OPPENENTID, infoMatchmBase.nOppenentID);
		values.put(TablesFields.INFO_MATCH_BASE_OPPENENTNAME, infoMatchmBase.nOppenentName);
		values.put(TablesFields.INFO_MATCH_BASE_MINNUM, infoMatchmBase.nMinNum);
		values.put(TablesFields.INFO_MATCH_BASE_MAXNUM, infoMatchmBase.nMaxNum);
		values.put(TablesFields.INFO_MATCH_BASE_ACTUALNUM, infoMatchmBase.nActualNum);
		values.put(TablesFields.INFO_MATCH_BASE_CHANNEL, infoMatchmBase.nChannel);
		values.put(TablesFields.INFO_MATCH_BASE_PROFILE, infoMatchmBase.textProfile);

		//调用BaseDAO的inserts的方法
		try
		{
			long id = insert(Tables.INFO_MATCH_BASE, values);
		} catch (Exception e)
		{

		}

	}

	/**
	 * 更新数据
	 *
	 * @param infoMatchmBase
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(InfoMatchBase infoMatchmBase) throws Exception
	{
		ContentValues values = new ContentValues();

		if (infoMatchmBase.cMatchID != null)
			values.put(TablesFields.INFO_MATCH_BASE_MATCHID, infoMatchmBase.cMatchID);
		if (infoMatchmBase.cMatchName != null)
			values.put(TablesFields.INFO_MATCH_BASE_MATCHNAME, infoMatchmBase.cMatchName);
		if (infoMatchmBase.cTeamName != null)
			values.put(TablesFields.INFO_MATCH_BASE_TEAMNAME, infoMatchmBase.cTeamName);
		if (infoMatchmBase.cOrgniser != null)
			values.put(TablesFields.INFO_MATCH_BASE_ORGNISER, infoMatchmBase.cOrgniser);
		if (infoMatchmBase.nMatchType != 0)
			values.put(TablesFields.INFO_MATCH_BASE_MATCHTYPE, infoMatchmBase.nMatchType);
		if (infoMatchmBase.nMatchFormatType != 0)
			values.put(TablesFields.INFO_MATCH_BASE_MATCHFORMATTYPE, infoMatchmBase.nMatchFormatType);
		if (infoMatchmBase.tStartTime != null)
			values.put(TablesFields.INFO_MATCH_BASE_STARTTIME, infoMatchmBase.tStartTime);//原本是boolean类
		if (infoMatchmBase.tEndTime != null)
			values.put(TablesFields.INFO_MATCH_BASE_ENDTIME, infoMatchmBase.tEndTime);
		if (infoMatchmBase.cAddress != null)
			values.put(TablesFields.INFO_MATCH_BASE_ADDRESS, infoMatchmBase.cAddress);
		if (infoMatchmBase.nOppenentID != null)
			values.put(TablesFields.INFO_MATCH_BASE_OPPENENTID, infoMatchmBase.nOppenentID);
		if (infoMatchmBase.nOppenentName != null)
			values.put(TablesFields.INFO_MATCH_BASE_OPPENENTNAME, infoMatchmBase.nOppenentName);
		if (infoMatchmBase.nMinNum != 0)
			values.put(TablesFields.INFO_MATCH_BASE_MINNUM, infoMatchmBase.nMinNum);
		if (infoMatchmBase.nMaxNum != 0)
			values.put(TablesFields.INFO_MATCH_BASE_MAXNUM, infoMatchmBase.nMaxNum);
		if (infoMatchmBase.nActualNum != 0)
			values.put(TablesFields.INFO_MATCH_BASE_ACTUALNUM, infoMatchmBase.nActualNum);
		if (infoMatchmBase.nChannel != 0)
			values.put(TablesFields.INFO_MATCH_BASE_CHANNEL, infoMatchmBase.nChannel);
		if (infoMatchmBase.textProfile != null)
			values.put(TablesFields.INFO_MATCH_BASE_PROFILE, infoMatchmBase.textProfile);

		String strUpdateById = TablesFields.INFO_MATCH_BASE_MATCHID + Config.SQL_LIKE_ARGS;
		int    nCount        = 0;
		try
		{
			nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateById, new String[]{infoMatchmBase.cMatchID});  //根据ID进行更新
		} catch (Exception e)
		{
		}
		return nCount;
	}

	/**
	 * 获取所有的数据
	 *
	 * @return
	 */
	@Override
	public List<InfoMatchBase> GetAll(InfoMatchBase infoMatchmBase)
	{
		if (infoMatchmBase == null)
			return null;


		List<String> listStrID = new ArrayList<String>();
		//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoMatchmBase.cMatchID != null)
		{
			listStrID.add(infoMatchmBase.cMatchID);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MATCHID + Config.SQL_LIKE_ARGS;
		}
		if (infoMatchmBase.cMatchName != null)
		{
			listStrID.add(infoMatchmBase.cMatchName);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MATCHNAME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.cTeamName != null) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoMatchmBase.cTeamName + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_TEAMNAME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.cOrgniser != null)
		{
			listStrID.add(infoMatchmBase.cOrgniser + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_ORGNISER + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nMatchType != 0)
		{
			listStrID.add(infoMatchmBase.nMatchType + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MATCHTYPE + Config.SQL_LIKE_ARGS;
		}
		if (infoMatchmBase.nMatchFormatType != 0)
		{
			listStrID.add(infoMatchmBase.nMatchFormatType + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MATCHFORMATTYPE + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.tStartTime != null)
		{
			listStrID.add(infoMatchmBase.tStartTime + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_STARTTIME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.tEndTime != null)
		{
			listStrID.add(infoMatchmBase.tEndTime + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_ENDTIME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.cAddress != null)
		{
			listStrID.add(infoMatchmBase.cAddress + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_ADDRESS + Config.SQL_LIKE_ARGS;
		}
		if (infoMatchmBase.nOppenentID != null)
		{
			listStrID.add(infoMatchmBase.nOppenentID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_OPPENENTID + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nOppenentName != null)
		{
			listStrID.add(infoMatchmBase.nOppenentName);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_OPPENENTNAME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nMinNum != 0) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoMatchmBase.nMinNum + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MINNUM + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nMaxNum != 0)
		{
			listStrID.add(infoMatchmBase.nMaxNum + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MAXNUM + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nActualNum != 0)
		{
			listStrID.add(infoMatchmBase.nActualNum + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_ACTUALNUM + Config.SQL_LIKE_ARGS;
		}
		if (infoMatchmBase.nChannel != 0)
		{
			listStrID.add(infoMatchmBase.nChannel + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_CHANNEL + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.textProfile != null)
		{
			listStrID.add(infoMatchmBase.textProfile + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_PROFILE + Config.SQL_LIKE_ARGS;
		}



		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

		//		------------------------------------- 拼接参数，完

		List<InfoMatchBase> matchBase= queryList(InfoMatchBase.class, Tables.INFO_MATCH_BASE, new
				String[]{Config.COLUMN_NAME}, strSelection, arrStrID, null, Config.PAGENUM, Config.PAGESIZE);

		return matchBase;
	}

	/**
	 * 查询某一条数据
	 *
	 * @param
	 * @return
	 */
	@Override
	public InfoMatchBase GetOne(InfoMatchBase infoMatchmBase) //
	// 按照cUserID 或者cUserName 查找
	{
		if (infoMatchmBase == null)
			return null;

		List<String> listStrID = new ArrayList<String>();
		//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串
		if (infoMatchmBase.cMatchID != null)
		{
			listStrID.add(infoMatchmBase.cMatchID);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MATCHID + Config.SQL_LIKE_ARGS;
		}
		if (infoMatchmBase.cMatchName != null)
		{
			listStrID.add(infoMatchmBase.cMatchName);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MATCHNAME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.cTeamName != null) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoMatchmBase.cTeamName + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_TEAMNAME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.cOrgniser != null)
		{
			listStrID.add(infoMatchmBase.cOrgniser + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_ORGNISER + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nMatchType != 0)
		{
			listStrID.add(infoMatchmBase.nMatchType + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MATCHTYPE + Config.SQL_LIKE_ARGS;
		}
		if (infoMatchmBase.nMatchFormatType != 0)
		{
			listStrID.add(infoMatchmBase.nMatchFormatType + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MATCHFORMATTYPE + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.tStartTime != null)
		{
			listStrID.add(infoMatchmBase.tStartTime + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_STARTTIME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.tEndTime != null)
		{
			listStrID.add(infoMatchmBase.tEndTime + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_ENDTIME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.cAddress != null)
		{
			listStrID.add(infoMatchmBase.cAddress + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_ADDRESS + Config.SQL_LIKE_ARGS;
		}
		if (infoMatchmBase.nOppenentID != null)
		{
			listStrID.add(infoMatchmBase.nOppenentID + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_OPPENENTID + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nOppenentName != null)
		{
			listStrID.add(infoMatchmBase.nOppenentName);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_OPPENENTNAME + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nMinNum != 0) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoMatchmBase.nMinNum + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MINNUM + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nMaxNum != 0)
		{
			listStrID.add(infoMatchmBase.nMaxNum + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_MAXNUM + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.nActualNum != 0)
		{
			listStrID.add(infoMatchmBase.nActualNum + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_ACTUALNUM + Config.SQL_LIKE_ARGS;
		}
		if (infoMatchmBase.nChannel != 0)
		{
			listStrID.add(infoMatchmBase.nChannel + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_CHANNEL + Config.SQL_LIKE_ARGS;
		}

		if (infoMatchmBase.textProfile != null)
		{
			listStrID.add(infoMatchmBase.textProfile + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_MATCH_BASE_PROFILE + Config.SQL_LIKE_ARGS;
		}



		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

		//		------------------------------------- 拼接参数，完


		InfoMatchBase teamBase = queryObject(InfoMatchBase.class,
				Tables.INFO_MATCH_BASE, new String[]{Config.COLUMN_NAME}, strSelection, arrStrID);

		return teamBase;
	}

	/**
	 * 删除数据
	 *
	 * @param
	 */
	@Override
	public int Del(InfoMatchBase infoMatchmBase)
	{
		if (infoMatchmBase == null)
			return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.INFO_MATCH_BASE_MATCHTYPE, -16); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串


		if (infoMatchmBase.cMatchID != null)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_MATCHID + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.cMatchID});
			return nCount;
		}

		if (infoMatchmBase.cMatchName != null)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_MATCHNAME + Config.SQL_LIKE_ARGS ;//infoMatchmBase.cUserName;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.cMatchName});
			return nCount;
		}

		if (infoMatchmBase.cTeamName != null) //null表示没有传值
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_TEAMNAME + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.cTeamName + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.cOrgniser != null)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_ORGNISER + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.cOrgniser + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.nMatchType != 0)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_MATCHTYPE + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.nMatchType + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.nMatchFormatType != 0)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_MATCHFORMATTYPE + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.nMatchFormatType + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.tStartTime != null)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_STARTTIME + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.tStartTime + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.tEndTime != null)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_ENDTIME + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.tEndTime + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.cAddress != null)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_ADDRESS + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.cAddress + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.nOppenentID != null)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_OPPENENTID + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.nOppenentID + Config.COLUMN_QUOTES});
			return nCount;
		}



		if (infoMatchmBase.nOppenentName != null)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_OPPENENTNAME + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.nOppenentName + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.nMinNum != 0)
	{
		strUpdateWhere = TablesFields.INFO_MATCH_BASE_MINNUM + Config.SQL_LIKE_ARGS ;
		int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.nMinNum + Config.COLUMN_QUOTES});
		return nCount;
	}

		if (infoMatchmBase.nMaxNum != 0)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_MAXNUM + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.nMaxNum + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.nActualNum != 0)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_ACTUALNUM + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.nActualNum + Config.COLUMN_QUOTES});
			return nCount;
		}


		if (infoMatchmBase.nChannel != 0)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_CHANNEL + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.nChannel + Config.COLUMN_QUOTES});
			return nCount;
		}

		if (infoMatchmBase.textProfile != null)
		{
			strUpdateWhere = TablesFields.INFO_MATCH_BASE_PROFILE + Config.SQL_LIKE_ARGS ;
			int nCount = update(Tables.INFO_MATCH_BASE, values, strUpdateWhere, new String[]{infoMatchmBase.textProfile + Config.COLUMN_QUOTES});
			return nCount;
		}


		return 0;
	}
}
