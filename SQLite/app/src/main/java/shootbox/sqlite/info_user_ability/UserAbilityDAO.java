package shootbox.sqlite.info_user_ability;

import android.content.ContentValues;
import android.content.Context;
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
public class UserAbilityDAO extends BaseDAO<InfoUserAbility> implements IPersonInfoUserAbilityDAO
{
    public UserAbilityDAO(Context context) {
        super(context);
    }
    /**
     *
     *添加一条数据
     */
    public void Add(InfoUserAbility infoUserAbility) {
        ContentValues values = new ContentValues();

        values.put(TablesFields.INFO_USER_ABILITY_ID           ,    infoUserAbility.cUserID);
        values.put(TablesFields.INFO_USER_ABILITY_USERNAME     ,    infoUserAbility.cUserName);
        values.put(TablesFields.INFO_USER_ABILITY_ATTACK       ,    infoUserAbility.nAttack);
        values.put(TablesFields.INFO_USER_ABILITY_DEFENSE      ,    infoUserAbility.nDefense);
        values.put(TablesFields.INFO_USER_ABILITY_SPEED        ,    infoUserAbility.nSpeed);
        values.put(TablesFields.INFO_USER_ABILITY_POWER        ,    infoUserAbility.nPower);
        values.put(TablesFields.INFO_USER_ABILITY_TECHNOLOGY   ,    infoUserAbility.nTechnology);
        values.put(TablesFields.INFO_USER_ABILITY_STAMINA      ,    infoUserAbility.nStamina);
        values.put(TablesFields.INFO_USER_ABILITY_TEAMWORK     ,    infoUserAbility.nTeamwork);
        values.put(TablesFields.INFO_USER_ABILITY_PASSING      ,    infoUserAbility.nPassing);
        values.put(TablesFields.INFO_USER_ABILITY_COMPETITION  ,    infoUserAbility.nCompetition);
        values.put(TablesFields.INFO_USER_ABILITY_SHOOTING     ,    infoUserAbility.nShooting);
        values.put(TablesFields.INFO_USER_ABILITY_SHORTPASS    ,    infoUserAbility.nShortPass);
        values.put(TablesFields.INFO_USER_ABILITY_LONGPASS     ,    infoUserAbility.nLongPass);
        values.put(TablesFields.INFO_USER_ABILITY_CRARRYING    ,    infoUserAbility.nCrarrying);
        values.put(TablesFields.INFO_USER_ABILITY_HEADING      ,    infoUserAbility.nHeading);
        values.put(TablesFields.INFO_USER_ABILITY_SKILLFUL     ,    infoUserAbility.nSkillful);
        values.put(TablesFields.INFO_USER_ABILITY_COMBAT       ,    infoUserAbility.nCombat);
        values.put(TablesFields.INFO_USER_ABILITY_INVERSE      ,    infoUserAbility.nInverse);
        values.put(TablesFields.INFO_USER_ABILITY_STATEHOLDING ,    infoUserAbility.nStateHolding);
        values.put(TablesFields.INFO_USER_ABILITY_TEXTPROFILE  ,    infoUserAbility.textProfile);
        //调用BaseDAO的inserts的方法
        long id = 0;
        try {
            id = insert(Tables.INFO_USER_ABILITY, values);
        } catch (Exception e) {

        }
    }

    /**
     * 随意更新某个字段数据
     *
     * @param infoUserAbility 传入一个类，按照ID更新剩下所有字段
     * @return
     * @throws Exception
     */
    @Override
    public int Update(InfoUserAbility infoUserAbility) throws Exception {
        ContentValues values = new ContentValues();

        if (infoUserAbility.cUserID != null)
            values.put(TablesFields.INFO_USER_ABILITY_ID, infoUserAbility.cUserID);
        if (infoUserAbility.cUserName != null)
            values.put(TablesFields.INFO_USER_ABILITY_USERNAME, infoUserAbility.cUserName);
        if (infoUserAbility.nAttack != 0)
            values.put(TablesFields.INFO_USER_ABILITY_ATTACK, infoUserAbility.nAttack);
        if (infoUserAbility.nDefense != 0)
            values.put(TablesFields.INFO_USER_ABILITY_DEFENSE, infoUserAbility.nDefense);
        if (infoUserAbility.nSpeed != 0)
            values.put(TablesFields.INFO_USER_ABILITY_SPEED, infoUserAbility.nSpeed);
        if (infoUserAbility.nPower != 0)
            values.put(TablesFields.INFO_USER_ABILITY_POWER, infoUserAbility.nPower);
        if (infoUserAbility.nTechnology != 0)
            values.put(TablesFields.INFO_USER_ABILITY_TECHNOLOGY, infoUserAbility.nTechnology);//原本是boolean类
        if (infoUserAbility.nStamina != 0)
            values.put(TablesFields.INFO_USER_ABILITY_STAMINA, infoUserAbility.nStamina);
        if (infoUserAbility.nTeamwork != 0)
            values.put(TablesFields.INFO_USER_ABILITY_TEAMWORK, infoUserAbility.nTeamwork);
        if (infoUserAbility.nPassing != 0)
            values.put(TablesFields.INFO_USER_ABILITY_PASSING, infoUserAbility.nPassing);
        if (infoUserAbility.nCompetition != 0)
            values.put(TablesFields.INFO_USER_ABILITY_COMPETITION, infoUserAbility.nCompetition);
        if (infoUserAbility.nShooting != 0)
            values.put(TablesFields.INFO_USER_ABILITY_SHOOTING, infoUserAbility.nShooting);
        if (infoUserAbility.nShortPass != 0)
            values.put(TablesFields.INFO_USER_ABILITY_SHORTPASS, infoUserAbility.nShortPass);
        if (infoUserAbility.nLongPass != 0)
            values.put(TablesFields.INFO_USER_ABILITY_LONGPASS, infoUserAbility.nLongPass);
        if (infoUserAbility.nCrarrying != 0)
            values.put(TablesFields.INFO_USER_ABILITY_CRARRYING, infoUserAbility.nCrarrying);
        if (infoUserAbility.nHeading != 0)
            values.put(TablesFields.INFO_USER_ABILITY_HEADING, infoUserAbility.nHeading);
        if (infoUserAbility.nSkillful != 0)
            values.put(TablesFields.INFO_USER_ABILITY_SKILLFUL, infoUserAbility.nSkillful);
        if (infoUserAbility.nCombat != 0)
            values.put(TablesFields.INFO_USER_ABILITY_COMBAT, infoUserAbility.nCombat);
        if (infoUserAbility.nInverse != 0)
            values.put(TablesFields.INFO_USER_ABILITY_INVERSE, infoUserAbility.nInverse);//原本是boolean类
        if (infoUserAbility.nStateHolding != 0)
            values.put(TablesFields.INFO_USER_ABILITY_STATEHOLDING, infoUserAbility.nStateHolding);
        if (infoUserAbility.textProfile != null)
            values.put(TablesFields.INFO_USER_ABILITY_TEXTPROFILE, infoUserAbility.textProfile);

        String strUpdateById = TablesFields.INFO_USER_ABILITY_ID + Config.SQL_LIKE + " ? ";
        int nCount = 0;
        try {
            nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateById, new String[]{infoUserAbility.cUserID});
        } catch (Exception e) {

        }

        return nCount;
    }

    /**
     * 根据所有的字段获取所有的对象，并且分页展示。
     *
     * @return
     */
    public List<InfoUserAbility> GetAll(InfoUserAbility infoUserAbility) {

        List<String> listStrID = new ArrayList<String>();
        String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接字符串

//		------------------------   拼接参数， 始
        if (infoUserAbility.cUserID != null) {
            listStrID.add(infoUserAbility.cUserID);
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_ID +Config.SQL_LIKE +"?";
        }
        if (infoUserAbility.cUserName != null) {
            listStrID.add(infoUserAbility.cUserName);
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_USERNAME+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nAttack != 0){              // 不等于0表示传入这个值，则要查找这个值
            listStrID.add(infoUserAbility.nAttack + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_ATTACK+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nDefense != 0) {
            listStrID.add(infoUserAbility.nDefense + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_DEFENSE+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nSpeed != 0) {
            listStrID.add(infoUserAbility.nSpeed+"");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_SPEED+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nPower != 0) {
            listStrID.add(infoUserAbility.nPower + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_POWER+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nTechnology != 0) {
            listStrID.add(infoUserAbility.nTechnology+"");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_TECHNOLOGY+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nStamina != 0) {
            listStrID.add(infoUserAbility.nStamina + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_STAMINA+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nTeamwork != 0) {
            listStrID.add(infoUserAbility.nTeamwork + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_TEAMWORK+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nPassing != 0) {
            listStrID.add(infoUserAbility.nPassing + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_PASSING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nCompetition != 0) {
            listStrID.add(infoUserAbility.nCompetition + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_COMPETITION+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nShooting != 0) {
            listStrID.add(infoUserAbility.nShooting + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_SHOOTING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nShortPass != 0) {
            listStrID.add(infoUserAbility.nShortPass + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_SHORTPASS+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nLongPass != 0) {
            listStrID.add(infoUserAbility.nLongPass + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_LONGPASS+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nCrarrying != 0) {
            listStrID.add(infoUserAbility.nCrarrying + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_CRARRYING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nHeading != 0) {
            listStrID.add(infoUserAbility.nHeading + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_HEADING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nSkillful != 0) {
            listStrID.add(infoUserAbility.nSkillful + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_SKILLFUL+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nCombat != 0) {
            listStrID.add(infoUserAbility.nCombat + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_COMBAT+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nInverse != 0) {
            listStrID.add(infoUserAbility.nInverse + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_INVERSE+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nStateHolding != 0) {
            listStrID.add(infoUserAbility.nStateHolding + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_STATEHOLDING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.textProfile != null) {
            listStrID.add(infoUserAbility.textProfile + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_TEXTPROFILE+Config.SQL_LIKE +"?";;
        }

        String[] arrStrID = new String[listStrID.size()];
        listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完

        List<InfoUserAbility> UserAbilitys = queryList(InfoUserAbility.class,
                Tables.INFO_USER_ABILITY,
                new String[]{Config.COLUMN_NAME},
                strSelection,
                arrStrID,
                null,
                Config.PAGENUM,
                Config.PAGESIZE);

        return UserAbilitys;
    }
    /**
     * 根据 UserName 或者 UserID 查询某一条数据
     *
     * @param
     * @return
     */
    public InfoUserAbility GetOne(InfoUserAbility infoUserAbility) {

        List<String> listStrID = new ArrayList<String>();
        String strSelection = Config.SELECTION_TRUE; // 1=1 目的为了方便拼接字符串

//		------------------------   拼接参数， 始
        if (infoUserAbility.cUserID != null) {
            listStrID.add(infoUserAbility.cUserID);
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_ID +Config.SQL_LIKE +"?";
        }
        if (infoUserAbility.cUserName != null) {
            listStrID.add(infoUserAbility.cUserName);
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_USERNAME+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nAttack != 0){              // 不等于0表示传入这个值，则要查找这个值
            listStrID.add(infoUserAbility.nAttack + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_ATTACK+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nDefense != 0) {
            listStrID.add(infoUserAbility.nDefense + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_DEFENSE+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nSpeed != 0) {
            listStrID.add(infoUserAbility.nSpeed+"");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_SPEED+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nPower != 0) {
            listStrID.add(infoUserAbility.nPower + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_POWER+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nTechnology != 0) {
			listStrID.add(infoUserAbility.nTechnology+"");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_TECHNOLOGY+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nStamina != 0) {
            listStrID.add(infoUserAbility.nStamina + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_STAMINA+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nTeamwork != 0) {
            listStrID.add(infoUserAbility.nTeamwork + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_TEAMWORK+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nPassing != 0) {
            listStrID.add(infoUserAbility.nPassing + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_PASSING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nCompetition != 0) {
            listStrID.add(infoUserAbility.nCompetition + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_COMPETITION+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nShooting != 0) {
            listStrID.add(infoUserAbility.nShooting + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_SHOOTING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nShortPass != 0) {
            listStrID.add(infoUserAbility.nShortPass + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_SHORTPASS+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nLongPass != 0) {
            listStrID.add(infoUserAbility.nLongPass + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_LONGPASS+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nCrarrying != 0) {
            listStrID.add(infoUserAbility.nCrarrying + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_CRARRYING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nHeading != 0) {
            listStrID.add(infoUserAbility.nHeading + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_HEADING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nSkillful != 0) {
            listStrID.add(infoUserAbility.nSkillful + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_SKILLFUL+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nCombat != 0) {
            listStrID.add(infoUserAbility.nCombat + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_COMBAT+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nInverse != 0) {
            listStrID.add(infoUserAbility.nInverse + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_INVERSE+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.nStateHolding != 0) {
            listStrID.add(infoUserAbility.nStateHolding + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_STATEHOLDING+Config.SQL_LIKE +"?";;
        }
        if (infoUserAbility.textProfile != null) {
            listStrID.add(infoUserAbility.textProfile + "");
            strSelection += " and "+TablesFields.INFO_USER_ABILITY_TEXTPROFILE+Config.SQL_LIKE +"?";;
        }

        String[] arrStrID = new String[listStrID.size()];
        listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完

        InfoUserAbility m_InfoUserAbility = queryObject(InfoUserAbility.class,
                Tables.INFO_USER_ABILITY,
                new String[]{"*"},
                strSelection,
                arrStrID);

        return m_InfoUserAbility;
    }

    /**
     * 根据 id 删除数据,全删除
     *
     * @param
     */
    @Override
    public int Del(InfoUserAbility infoUserAbility)  //目前只能根据ID删除
    {
        ContentValues values = new ContentValues();
        values.put(TablesFields.INFO_USER_ABILITY_ATTACK,-1);// 值置为 -1 ，表示删除
        String strUpdateWhere = "";
     
        if (infoUserAbility.cUserID != null) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_ID +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.cUserID});
            return nCount;
        }
        if (infoUserAbility.cUserName != null) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_USERNAME + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.cUserName});
            return nCount;
        }
        if (infoUserAbility.nAttack != 0) //0表示没有传值
        {              // 不等于0表示传入这个值，则要查找这个值
      //      strUpdateWhere = TablesFields.INFO_USER_PLAYER_LEVEL + "= ?"+infoUserAbility.nLevel+"";
            strUpdateWhere=TablesFields.INFO_USER_ABILITY_ATTACK + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values,strUpdateWhere ,new String[]{infoUserAbility.nAttack+""});
            return nCount;
        }
        if (infoUserAbility.nDefense != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_DEFENSE + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nDefense+""});
            return nCount;
        }
        if (infoUserAbility.nSpeed != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_SPEED +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere, new String[]{infoUserAbility.nSpeed+""});
            return nCount;
        }
        if (infoUserAbility.nPower != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_POWER +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere, new String[]{infoUserAbility.nPower+""});
            return nCount;
        }
        if (infoUserAbility.nTechnology != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_TECHNOLOGY + Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere, new String[]{infoUserAbility.nTechnology+""});
            return nCount;
        }
        if (infoUserAbility.nStamina != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_STAMINA +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere, new String[]{infoUserAbility.nStamina+""});
            return nCount;
        }
        if (infoUserAbility.nTeamwork != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_TEAMWORK +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nTeamwork+""});
            return nCount;
        }
        if (infoUserAbility.nPassing != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_PASSING +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere, new String[]{infoUserAbility.nPassing+""});
            return nCount;
        }
        if (infoUserAbility.nCompetition != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_COMPETITION +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nCompetition+""});
            return nCount;
        }
        if (infoUserAbility.nShooting != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_SHOOTING +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nShooting+""});
            return nCount;
        }
        if (infoUserAbility.nShortPass != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_SHORTPASS +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nShortPass+""});
            return nCount;
        }
        if (infoUserAbility.nLongPass != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_LONGPASS +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nLongPass+""});
            return nCount;
        }
        if (infoUserAbility.nCrarrying != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_CRARRYING +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nCrarrying+""});
            return nCount;
        }
        if (infoUserAbility.nHeading != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_HEADING +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nHeading+""});
            return nCount;
        }
        if (infoUserAbility.nSkillful != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_SKILLFUL +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nSkillful+""});
            return nCount;
        }
        if (infoUserAbility.nCombat != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_COMBAT +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nCombat+""});
            return nCount;
        }
        if (infoUserAbility.nInverse != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_INVERSE +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nInverse+""});
            return nCount;
        }
        if (infoUserAbility.nStateHolding != 0) {
            strUpdateWhere = TablesFields.INFO_USER_ABILITY_STATEHOLDING +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.nStateHolding+""});
            return nCount;
        }
        if (infoUserAbility.textProfile != null) {
            strUpdateWhere = TablesFields.INFO_USER_BASE_TEXTPROFILE +  Config.SQL_LIKE+" ? ";
            int nCount = update(Tables.INFO_USER_ABILITY, values, strUpdateWhere,new String[]{infoUserAbility.textProfile});
            strUpdateWhere.toString();
            return nCount;
        }
        return 0;
    }
}
