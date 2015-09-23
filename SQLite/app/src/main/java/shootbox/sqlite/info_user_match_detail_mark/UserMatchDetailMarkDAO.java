package shootbox.sqlite.info_user_match_detail_mark;

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
public class UserMatchDetailMarkDAO extends BaseDAO<InfoUserMatchDetailMark> implements IPersonInfoUserMatchDetailMarkDAO
{
		public UserMatchDetailMarkDAO(Context context)
		{
			super(context);
		}
	/*
	 *
	 *添加用户数据
	 */
	@Override
	public void Add(InfoUserMatchDetailMark infoUserMatchDetailMark) {
		ContentValues values = new ContentValues();

		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_MATCHID             ,infoUserMatchDetailMark. cMatchID);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_USERID              ,infoUserMatchDetailMark. cUserID);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKERID            ,infoUserMatchDetailMark. cMarkerID);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKENDTIME         ,infoUserMatchDetailMark. tMarkEndTime);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKFINISH        ,infoUserMatchDetailMark. bIsMarkFinish);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKATTACK        ,infoUserMatchDetailMark. bIsMarkAttack);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKDEFENSE       ,infoUserMatchDetailMark. bIsMarkDefense);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSPEED         ,infoUserMatchDetailMark. bIsMarkSpeed);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPOWER         ,infoUserMatchDetailMark. bIsMarkPower);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTECHNOLOGY    ,infoUserMatchDetailMark. bIsMarkTechnology);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSTAMINA       ,infoUserMatchDetailMark.bIsMarkStamina);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTEAMWORK      ,infoUserMatchDetailMark.bIsMarkTeamwork);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPASSING       ,infoUserMatchDetailMark.bIsMarkPassing);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMPETITION   ,infoUserMatchDetailMark.bIsMarkCompetition);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHOOTING      ,infoUserMatchDetailMark.bIsMarkShooting);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHORTPASS     ,infoUserMatchDetailMark.bIsMarkShortPass);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKLONGPASS      ,infoUserMatchDetailMark.bIsMarkLongPass);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCRARRYING     ,infoUserMatchDetailMark.bIsMarkCrarrying);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKHEADING       ,infoUserMatchDetailMark.bIsMarkHeading);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSKILLFUL      ,infoUserMatchDetailMark.bIsMarkSkillful);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMBAT        ,infoUserMatchDetailMark.bIsMarkCombat);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACK              ,infoUserMatchDetailMark.nAttack);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSE             ,infoUserMatchDetailMark.nDefense);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEED               ,infoUserMatchDetailMark.nSpeed);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWER               ,infoUserMatchDetailMark.nPower);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGY          ,infoUserMatchDetailMark.nTechnology);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINA             ,infoUserMatchDetailMark.nStamina);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORK            ,infoUserMatchDetailMark.nTeamwork);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSING             ,infoUserMatchDetailMark.nPassing);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITION         ,infoUserMatchDetailMark.nCompetition);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTING            ,infoUserMatchDetailMark.nShooting);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASS           ,infoUserMatchDetailMark.nShortPass);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_LONGPASS            ,infoUserMatchDetailMark.nLongPass);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYING           ,infoUserMatchDetailMark.nCrarrying);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADING             ,infoUserMatchDetailMark.nHeading);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFUL            ,infoUserMatchDetailMark.nSkillful);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBAT              ,infoUserMatchDetailMark.nCombat);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACKCHANGE        ,infoUserMatchDetailMark.nAttackChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSECHANGE       ,infoUserMatchDetailMark.nDefenseChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEEDCHANGE         ,infoUserMatchDetailMark.nSpeedChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWERCHANGE         ,infoUserMatchDetailMark.nPowerChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGYCHANGE    ,infoUserMatchDetailMark.nTechnologyChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINACHANGE        ,infoUserMatchDetailMark.nStaminaChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORKCHANGE       ,infoUserMatchDetailMark.nTeamworkChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSINGCHANGE        ,infoUserMatchDetailMark.nPassingChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITIONCHANGE    ,infoUserMatchDetailMark.nCompetitionChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTINGCHANGE       ,infoUserMatchDetailMark.nShootingChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASSCHANGE       ,infoUserMatchDetailMark.nShortPassChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_LOONGPASSCHANGE       ,infoUserMatchDetailMark.nLongPassChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYINGCHANGE       ,infoUserMatchDetailMark.nCrarryingChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADINGCHANGE         ,infoUserMatchDetailMark.nHeadingChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFULCHANGE        ,infoUserMatchDetailMark.nSkillfulChange);
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBATCHANGE          ,infoUserMatchDetailMark.nCombatChange);

		//调用BaseDAO的inserts的方法
		try {
			long id = insert(Tables.INFO_USER_MATCH_DETAIL_MARK, values);
		}catch (Exception e){

		}

	}

	/**
	 * 更新数据
	 * @param infoUserMatchDetailMark
	 * @return
	 * @throws Exception
	 */
	@Override
	public int Update(InfoUserMatchDetailMark infoUserMatchDetailMark) throws Exception
	{
		ContentValues values = new ContentValues();

		if (infoUserMatchDetailMark.cMatchID != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_MATCHID, infoUserMatchDetailMark.cMatchID);
		if (infoUserMatchDetailMark.cUserID != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_USERID, infoUserMatchDetailMark.cUserID);
		if (infoUserMatchDetailMark.cMarkerID != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKERID, infoUserMatchDetailMark.cMarkerID);
		if (infoUserMatchDetailMark.tMarkEndTime != null)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKENDTIME, infoUserMatchDetailMark.tMarkEndTime);
		if (infoUserMatchDetailMark.bIsMarkFinish != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKFINISH, infoUserMatchDetailMark.bIsMarkFinish);
		if (infoUserMatchDetailMark.bIsMarkAttack != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKATTACK, infoUserMatchDetailMark.bIsMarkAttack);
		if (infoUserMatchDetailMark.bIsMarkDefense != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKDEFENSE, infoUserMatchDetailMark.bIsMarkDefense);//原本是boolean类
		if (infoUserMatchDetailMark.bIsMarkSpeed != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSPEED, infoUserMatchDetailMark.bIsMarkSpeed);
		if (infoUserMatchDetailMark.bIsMarkPower != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPOWER, infoUserMatchDetailMark.bIsMarkPower);
		if (infoUserMatchDetailMark.bIsMarkTechnology != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTECHNOLOGY, infoUserMatchDetailMark.bIsMarkTechnology);
		if (infoUserMatchDetailMark.bIsMarkStamina != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSTAMINA, infoUserMatchDetailMark.bIsMarkStamina);
		if (infoUserMatchDetailMark.bIsMarkTeamwork != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTEAMWORK, infoUserMatchDetailMark.bIsMarkTeamwork);
		if (infoUserMatchDetailMark.bIsMarkPassing != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPASSING, infoUserMatchDetailMark.bIsMarkPassing);
		if (infoUserMatchDetailMark.bIsMarkCompetition != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMPETITION, infoUserMatchDetailMark.bIsMarkCompetition);
		if (infoUserMatchDetailMark.bIsMarkShooting != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHOOTING, infoUserMatchDetailMark.bIsMarkShooting);
		if (infoUserMatchDetailMark.bIsMarkShortPass != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHORTPASS, infoUserMatchDetailMark.bIsMarkShortPass);
		if (infoUserMatchDetailMark.bIsMarkLongPass != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKLONGPASS, infoUserMatchDetailMark.bIsMarkLongPass);//原本是boolean类
		if (infoUserMatchDetailMark.bIsMarkCrarrying != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCRARRYING, infoUserMatchDetailMark.bIsMarkCrarrying);
		if (infoUserMatchDetailMark.bIsMarkHeading != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKHEADING, infoUserMatchDetailMark.bIsMarkHeading);
		if (infoUserMatchDetailMark.bIsMarkSkillful != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSKILLFUL, infoUserMatchDetailMark.bIsMarkSkillful);
		if (infoUserMatchDetailMark.bIsMarkCombat != false)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMBAT, infoUserMatchDetailMark.bIsMarkCombat);
		if (infoUserMatchDetailMark.nAttack != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACK, infoUserMatchDetailMark.nAttack);
		if (infoUserMatchDetailMark.nDefense != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSE, infoUserMatchDetailMark.nDefense);
		if (infoUserMatchDetailMark.nSpeed != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEED, infoUserMatchDetailMark.nSpeed);
		if (infoUserMatchDetailMark.nPower != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWER, infoUserMatchDetailMark.nPower);
		if (infoUserMatchDetailMark.nTechnology != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGY, infoUserMatchDetailMark.nTechnology);
		if (infoUserMatchDetailMark.nStamina != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINA, infoUserMatchDetailMark.nStamina);//原本是boolean类
		if (infoUserMatchDetailMark.nTeamwork != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORK, infoUserMatchDetailMark.nTeamwork);
		if (infoUserMatchDetailMark.nPassing != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSING, infoUserMatchDetailMark.nPassing);
		if (infoUserMatchDetailMark.nCompetition != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITION, infoUserMatchDetailMark.nCompetition);
		if (infoUserMatchDetailMark.nShooting != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTING, infoUserMatchDetailMark.nShooting);
		if (infoUserMatchDetailMark.nShortPass != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASS, infoUserMatchDetailMark.nShortPass);
		if (infoUserMatchDetailMark.nLongPass != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_LONGPASS, infoUserMatchDetailMark.nLongPass);
		if (infoUserMatchDetailMark.nCrarrying != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYING, infoUserMatchDetailMark.nCrarrying);
		if (infoUserMatchDetailMark.nHeading != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADING, infoUserMatchDetailMark.nHeading);
		if (infoUserMatchDetailMark.nSkillful != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFUL, infoUserMatchDetailMark.nSkillful);//原本是boolean类
		if (infoUserMatchDetailMark.nCombat != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBAT, infoUserMatchDetailMark.nCombat);
		if (infoUserMatchDetailMark.nAttackChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACKCHANGE, infoUserMatchDetailMark.nAttackChange);
		if (infoUserMatchDetailMark.nDefenseChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSECHANGE, infoUserMatchDetailMark.nDefenseChange);
		if (infoUserMatchDetailMark.nSpeedChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEEDCHANGE, infoUserMatchDetailMark.nSpeedChange);
		if (infoUserMatchDetailMark.nPowerChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWERCHANGE, infoUserMatchDetailMark.nPowerChange);
		if (infoUserMatchDetailMark.nTechnologyChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGYCHANGE, infoUserMatchDetailMark.nTechnologyChange);
		if (infoUserMatchDetailMark.nStaminaChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINACHANGE, infoUserMatchDetailMark.nStaminaChange);
		if (infoUserMatchDetailMark.nTeamworkChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORKCHANGE, infoUserMatchDetailMark.nTeamworkChange);
		if (infoUserMatchDetailMark.nPassingChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSINGCHANGE, infoUserMatchDetailMark.nPassingChange);
		if (infoUserMatchDetailMark.nCompetitionChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITIONCHANGE, infoUserMatchDetailMark.nCompetitionChange);//原本是boolean类
		if (infoUserMatchDetailMark.nShootingChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTINGCHANGE, infoUserMatchDetailMark.nShootingChange);
		if (infoUserMatchDetailMark.nShortPassChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASSCHANGE, infoUserMatchDetailMark.nShortPassChange);
		if (infoUserMatchDetailMark.nLongPassChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_LOONGPASSCHANGE, infoUserMatchDetailMark.nLongPassChange);
		if (infoUserMatchDetailMark.nCrarryingChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYINGCHANGE, infoUserMatchDetailMark.nCrarryingChange);
		if (infoUserMatchDetailMark.nHeadingChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADINGCHANGE, infoUserMatchDetailMark.nHeadingChange);
		if (infoUserMatchDetailMark.nSkillfulChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFULCHANGE, infoUserMatchDetailMark.nSkillfulChange);
		if (infoUserMatchDetailMark.nCombatChange != 0)
			values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBATCHANGE, infoUserMatchDetailMark.nCombatChange);

		String strUpdateById = TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKERID + Config.SQL_LIKE_ARGS;
		int nCount = 0;
		try {
			nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateById, new String[]{infoUserMatchDetailMark.cMarkerID});  //根据ID进行更新
		} catch (Exception e) {
		}

		return nCount;
	}

	/**
	 * 获取所有的数据
	 * @return
	 */
	@Override
	public List<InfoUserMatchDetailMark> GetAll(InfoUserMatchDetailMark infoUserMatchDetailMark)
	{
		if(infoUserMatchDetailMark==null) return null;
		List<String> listStrID = new ArrayList<String>();

//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串

		if (infoUserMatchDetailMark.cMatchID != null) {
			listStrID.add(infoUserMatchDetailMark.cMatchID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_MATCHID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.cUserID != null) {
			listStrID.add(infoUserMatchDetailMark.cUserID);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_USERID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.cMarkerID != null){              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.cMarkerID);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKERID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.tMarkEndTime != null) {
			listStrID.add(infoUserMatchDetailMark.tMarkEndTime);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkFinish != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkFinish==true ?"1":"0" );//+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKFINISH+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkAttack != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkAttack ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKATTACK+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkDefense != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkDefense==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKDEFENSE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkSpeed != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkSpeed  ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSPEED+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkPower != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkPower ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPOWER+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkTechnology != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkTechnology ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTECHNOLOGY+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkStamina != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkStamina ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSTAMINA+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkTeamwork != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkTeamwork ==true ?"1":"0" );
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTEAMWORK+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkPassing != false){              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.bIsMarkPassing ==true ?"1":"0" );
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPASSING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkCompetition != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkCompetition ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMPETITION+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkShooting != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkShooting ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHOOTING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkShortPass != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkShortPass ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHORTPASS+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkLongPass != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkLongPass==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKLONGPASS+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkCrarrying != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkCrarrying  ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCRARRYING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkHeading != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkHeading ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKHEADING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkSkillful != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkSkillful  ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSKILLFUL+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkPower != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkPower ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPOWER+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkTechnology != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkTechnology  ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTECHNOLOGY+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkCombat != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkCombat ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMBAT+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nAttack != 0) {
			listStrID.add(infoUserMatchDetailMark.nAttack +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACK+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nDefense != 0) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.nDefense +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nSpeed != 0) {
			listStrID.add(infoUserMatchDetailMark.nSpeed + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEED+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nPower != 0) {
			listStrID.add(infoUserMatchDetailMark.nPower+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWER+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nTechnology != 0) {
			listStrID.add(infoUserMatchDetailMark.nTechnology +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGY+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nStamina != 0) {
			listStrID.add(infoUserMatchDetailMark.nStamina+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINA+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nTeamwork != 0) {
			listStrID.add(infoUserMatchDetailMark.nTeamwork + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORK+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nPassing != 0) {
			listStrID.add(infoUserMatchDetailMark.nPassing +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCompetition != 0) {
			listStrID.add(infoUserMatchDetailMark.nCompetition + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITION+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nShooting != 0) {
			listStrID.add(infoUserMatchDetailMark.nShooting+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nShortPass != 0){              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.nShortPass +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASS+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nLongPass != 0) {
			listStrID.add(infoUserMatchDetailMark.nLongPass + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_LONGPASS+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCrarrying != 0) {
			listStrID.add(infoUserMatchDetailMark.nCrarrying+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nHeading != 0) {
			listStrID.add(infoUserMatchDetailMark.nHeading +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nSkillful != 0) {
			listStrID.add(infoUserMatchDetailMark.nSkillful+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFUL+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCombat != 0) {
			listStrID.add(infoUserMatchDetailMark.nCombat + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBAT+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nAttackChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nAttackChange +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACKCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nDefenseChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nDefenseChange + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSECHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nSpeedChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nSpeedChange + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEEDCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nPowerChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nPowerChange+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWERCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nTechnologyChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nTechnologyChange +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGYCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nStaminaChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nStaminaChange+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINACHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nTeamworkChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nTeamworkChange + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORKCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nPassingChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nPassingChange +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSINGCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCompetitionChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nCompetitionChange + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITIONCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nShootingChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nShootingChange+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTINGCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nShortPassChange != 0) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.nShortPassChange +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASSCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nLongPassChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nLongPassChange + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_LOONGPASSCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCrarryingChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nCrarryingChange+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYINGCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nHeadingChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nHeadingChange +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADINGCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nSkillfulChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nSkillfulChange+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFULCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCombatChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nCombatChange + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBATCHANGE+Config.SQL_LIKE_ARGS;
		}
		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);

//		------------------------------------- 拼接参数，完
		List<InfoUserMatchDetailMark> userBases = queryList(InfoUserMatchDetailMark.class,
				Tables.INFO_USER_MATCH_DETAIL_MARK,
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
	public InfoUserMatchDetailMark GetOne(InfoUserMatchDetailMark infoUserMatchDetailMark){

		if(infoUserMatchDetailMark==null) return null;
		List<String> listStrID = new ArrayList<String>();

//		------------------------------------- 拼接参数，始
		String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接 and 字符串

		if (infoUserMatchDetailMark.cMatchID != null) {
			listStrID.add(infoUserMatchDetailMark.cMatchID);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_MATCHID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.cUserID != null) {
			listStrID.add(infoUserMatchDetailMark.cUserID);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_USERID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.cMarkerID != null){              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.cMarkerID);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKERID+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.tMarkEndTime != null) {
			listStrID.add(infoUserMatchDetailMark.tMarkEndTime);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKENDTIME+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkFinish != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkFinish==true ?"1":"0" );//+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKFINISH+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkAttack != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkAttack ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKATTACK+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkDefense != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkDefense==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKDEFENSE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkSpeed != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkSpeed  ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSPEED+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkPower != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkPower ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPOWER+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkTechnology != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkTechnology ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTECHNOLOGY+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkStamina != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkStamina ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSTAMINA+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkTeamwork != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkTeamwork ==true ?"1":"0" );
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTEAMWORK+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkPassing != false){              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.bIsMarkPassing ==true ?"1":"0" );
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPASSING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkCompetition != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkCompetition ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMPETITION+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkShooting != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkShooting ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHOOTING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkShortPass != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkShortPass ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHORTPASS+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkLongPass != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkLongPass==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKLONGPASS+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkCrarrying != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkCrarrying  ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCRARRYING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkHeading != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkHeading ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKHEADING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkSkillful != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkSkillful  ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSKILLFUL+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkPower != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkPower ==true ?"1":"0" );
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPOWER+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkTechnology != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkTechnology  ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTECHNOLOGY+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.bIsMarkCombat != false) {
			listStrID.add(infoUserMatchDetailMark.bIsMarkCombat ==true ?"1":"0" );
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMBAT+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nAttack != 0) {
			listStrID.add(infoUserMatchDetailMark.nAttack +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACK+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nDefense != 0) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.nDefense +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nSpeed != 0) {
			listStrID.add(infoUserMatchDetailMark.nSpeed + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEED+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nPower != 0) {
			listStrID.add(infoUserMatchDetailMark.nPower+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWER+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nTechnology != 0) {
			listStrID.add(infoUserMatchDetailMark.nTechnology +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGY+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nStamina != 0) {
			listStrID.add(infoUserMatchDetailMark.nStamina+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINA+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nTeamwork != 0) {
			listStrID.add(infoUserMatchDetailMark.nTeamwork + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORK+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nPassing != 0) {
			listStrID.add(infoUserMatchDetailMark.nPassing +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCompetition != 0) {
			listStrID.add(infoUserMatchDetailMark.nCompetition + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITION+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nShooting != 0) {
			listStrID.add(infoUserMatchDetailMark.nShooting+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nShortPass != 0){              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.nShortPass +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASS+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nLongPass != 0) {
			listStrID.add(infoUserMatchDetailMark.nLongPass + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_LONGPASS+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCrarrying != 0) {
			listStrID.add(infoUserMatchDetailMark.nCrarrying+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nHeading != 0) {
			listStrID.add(infoUserMatchDetailMark.nHeading +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADING+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nSkillful != 0) {
			listStrID.add(infoUserMatchDetailMark.nSkillful+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFUL+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCombat != 0) {
			listStrID.add(infoUserMatchDetailMark.nCombat + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBAT+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nAttackChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nAttackChange +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACKCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nDefenseChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nDefenseChange + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSECHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nSpeedChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nSpeedChange + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEEDCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nPowerChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nPowerChange+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWERCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nTechnologyChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nTechnologyChange +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGYCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nStaminaChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nStaminaChange+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINACHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nTeamworkChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nTeamworkChange + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORKCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nPassingChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nPassingChange +Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSINGCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCompetitionChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nCompetitionChange + Config.COLUMN_QUOTES);
			strSelection +=Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITIONCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nShootingChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nShootingChange+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTINGCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nShortPassChange != 0) //0表示没有传值
		{              // 不等于0表示传入这个值，则要查找这个值
			listStrID.add(infoUserMatchDetailMark.nShortPassChange +Config.COLUMN_QUOTES);
			strSelection +=  Config.SQL_AND + TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASSCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nLongPassChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nLongPassChange + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_LOONGPASSCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCrarryingChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nCrarryingChange+ Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYINGCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nHeadingChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nHeadingChange +  Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADINGCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nSkillfulChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nSkillfulChange+Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFULCHANGE+Config.SQL_LIKE_ARGS;
		}
		if (infoUserMatchDetailMark.nCombatChange != 0) {
			listStrID.add(infoUserMatchDetailMark.nCombatChange + Config.COLUMN_QUOTES);
			strSelection += Config.SQL_AND+ TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBATCHANGE+Config.SQL_LIKE_ARGS;
		}
		String[] arrStrID = new String[listStrID.size()];
		listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完
		InfoUserMatchDetailMark userMatchDetailMark = queryObject(InfoUserMatchDetailMark.class,
																		Tables.INFO_USER_MATCH_DETAIL_MARK,
																		new String[]{Config.COLUMN_NAME},
																		strSelection,
																		arrStrID);

		return userMatchDetailMark;
	}

	/**
	 * 删除数据
	 * @param
	 */
	@Override
	public int Del(InfoUserMatchDetailMark infoUserMatchDetailMark) {
		if(infoUserMatchDetailMark==null)return 0;

		ContentValues values = new ContentValues();
		values.put(TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACK, -1); // 值置为 -1 ，表示删除
		String strUpdateWhere = "";    // sql语句选择字符串
	
		if (infoUserMatchDetailMark.cMatchID != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_MATCHID + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.cMatchID});
			return nCount;
		}
		if (infoUserMatchDetailMark.cUserID != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_USERID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.cUserID});
			return nCount;
		}
		if (infoUserMatchDetailMark.cMarkerID != null) {
			strUpdateWhere=TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKERID +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values,strUpdateWhere ,new String[]{infoUserMatchDetailMark.cMarkerID+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.tMarkEndTime != null) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_MARKENDTIME +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.tMarkEndTime+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkFinish != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKFINISH + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{"1"});//infoUserMatchDetailMark.bIsMarkFinish+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkAttack != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKATTACK + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{"1"});//bIsMarkAttack+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkDefense != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKDEFENSE +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{"1"});//bIsMarkDefense+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkSpeed != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSPEED + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{"1"});//bIsMarkSpeed+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkPower != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPOWER + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{"1"});//bIsMarkPower+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkTechnology != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTECHNOLOGY + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{"1"});//bIsMarkTechnology+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkStamina != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSTAMINA + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{"1"});//bIsMarkStamina+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkTeamwork != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKTEAMWORK +Config.SQL_LIKE_ARGS;//infoUserMatchDetailMark.cUserName;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{"1"});//bIsMarkTeamwork+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkPassing != false) {
			strUpdateWhere=TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKPASSING +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values,strUpdateWhere ,new String[]{"1"});//bIsMarkPassing+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkCompetition != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMPETITION +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{"1"});//bIsMarkCompetition+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkShooting != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHOOTING + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{"1"});//bIsMarkShooting+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkShortPass != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSHORTPASS + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{"1"});//bIsMarkShortPass+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkLongPass != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKLONGPASS +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{"1"});//bIsMarkLongPass+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkCrarrying != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCRARRYING + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{"1"});//bIsMarkCrarrying+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkHeading != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKHEADING + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{"1"});//bIsMarkHeading+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkSkillful != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKSKILLFUL + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{"1"});//bIsMarkSkillful+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.bIsMarkCombat != false) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMBAT + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{"1"});//bIsMarkCombat+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nAttack != 0) {
		strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACK +Config.SQL_LIKE_ARGS;//infoUserMatchDetailMark.cUserName;
		int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nAttack+Config.COLUMN_QUOTES});
		return nCount;
		}
		if (infoUserMatchDetailMark.nDefense != 0){
			strUpdateWhere=TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSE +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values,strUpdateWhere ,new String[]{infoUserMatchDetailMark.nDefense+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nSpeed != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEED +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nSpeed+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nPower != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWER + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nPower+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nTechnology != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGY + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nTechnology+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nStamina != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINA +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nStamina+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nTeamwork != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORK +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nTeamwork+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nPassing != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSING + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nPassing+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nCompetition != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITION + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nCompetition+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nShooting != 0) {
		strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTING +Config.SQL_LIKE_ARGS;//infoUserMatchDetailMark.cUserName;
		int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nShooting+Config.COLUMN_QUOTES});
		return nCount;
		}
		if (infoUserMatchDetailMark.nShortPass != 0) {
			strUpdateWhere=TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASS +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values,strUpdateWhere ,new String[]{infoUserMatchDetailMark.nShortPass+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nLongPass != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_LONGPASS +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nLongPass+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nCrarrying != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYING +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nCrarrying+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nHeading != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADING + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nHeading+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nSkillful != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFUL +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nSkillful+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nCombat != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBAT + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nCombat+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nAttackChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_ATTACKCHANGE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nAttackChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nDefenseChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_DEFENSECHANGE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nDefenseChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nSpeedChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_SPEEDCHANGE +Config.SQL_LIKE_ARGS;//infoUserMatchDetailMark.cUserName;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nSpeedChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nPowerChange != 0) {
			strUpdateWhere=TablesFields.INFO_USER_MATCH_DETAIL_MARK_POWERCHANGE +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values,strUpdateWhere ,new String[]{infoUserMatchDetailMark.nPowerChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nTechnologyChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGYCHANGE +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nTechnologyChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nStaminaChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_STAMINACHANGE +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nStaminaChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nTeamworkChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_TEAMWORKCHANGE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nTeamworkChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nPassingChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_PASSINGCHANGE +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nPassingChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nCompetitionChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMPETITIONCHANGE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nCompetitionChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nShootingChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHOOTINGCHANGE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nShootingChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nShortPassChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_SHORTPASSCHANGE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nShortPassChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nLongPassChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_LOONGPASSCHANGE +Config.SQL_LIKE_ARGS;//infoUserMatchDetailMark.cUserName;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nLongPassChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nCrarryingChange != 0){
			strUpdateWhere=TablesFields.INFO_USER_MATCH_DETAIL_MARK_CRARRYINGCHANGE +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values,strUpdateWhere ,new String[]{infoUserMatchDetailMark.nCrarryingChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nHeadingChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_HEADINGCHANGE +Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nHeadingChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nSkillfulChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_SKILLFULCHANGE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere,new String[]{infoUserMatchDetailMark.nSkillfulChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		if (infoUserMatchDetailMark.nCombatChange != 0) {
			strUpdateWhere = TablesFields.INFO_USER_MATCH_DETAIL_MARK_COMBATCHANGE + Config.SQL_LIKE_ARGS;
			int nCount = update(Tables.INFO_USER_MATCH_DETAIL_MARK, values, strUpdateWhere, new String[]{infoUserMatchDetailMark.nCombatChange+Config.COLUMN_QUOTES});
			return nCount;
		}
		return 0;
	}
}
