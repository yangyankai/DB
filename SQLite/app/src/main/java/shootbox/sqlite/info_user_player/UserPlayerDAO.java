package shootbox.sqlite.info_user_player;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import shootbox.sqlite.SQLiteDAO.BaseDAO;
import shootbox.sqlite.SQLiteDAO.Tables;
import shootbox.sqlite.SQLiteDAO.TablesFields;

/**
 * DAO   需要继承BaseDao
 */
public class UserPlayerDAO extends BaseDAO<InfoUserPlayer> implements IPersonInfoUserPlayerDAO {
    public UserPlayerDAO(Context context) {
        super(context);
    }

    /*
     *
     *添加一条数据
     */
    @Override
    public void Add(InfoUserPlayer infoUserPlayer) {
        ContentValues values = new ContentValues();

        values.put(TablesFields.INFO_USER_PLAYER_ID, infoUserPlayer.cUserID);
        values.put(TablesFields.INFO_USER_PLAYER_USERNAME, infoUserPlayer.cUserName);
        values.put(TablesFields.INFO_USER_PLAYER_LEVEL, infoUserPlayer.nLevel);
        values.put(TablesFields.INFO_USER_PLAYER_SIMILERSTAR, infoUserPlayer.nSimilarStar);
        values.put(TablesFields.INFO_USER_PLAYER_NICKNAME, infoUserPlayer.cNickName);
        values.put(TablesFields.INFO_USER_PLAYER_TEAM, infoUserPlayer.nTeam);
        values.put(TablesFields.INFO_USER_PLAYER_BISLEADER, infoUserPlayer.bIsLeader);//原本是boolean类
        values.put(TablesFields.INFO_USER_PLAYER_FIELDPOS, infoUserPlayer.nFieldPos);
        values.put(TablesFields.INFO_USER_PLAYER_BACKNO, infoUserPlayer.nBackNum);
        values.put(TablesFields.INFO_USER_PLAYER_STATUS, infoUserPlayer.nStatus);
        values.put(TablesFields.INFO_USER_PLAYER_MATCHTOTAL, infoUserPlayer.nMatchTotal);
        values.put(TablesFields.INFO_USER_PLAYER_ATTENDPERCENT, infoUserPlayer.fAttendPercent);
        values.put(TablesFields.INFO_USER_PLAYER_RELIABILITYPERCENT, infoUserPlayer.fReliabilityPercent);
        values.put(TablesFields.INFO_USER_PLAYER_PROFILE, infoUserPlayer.textProfile);
        //调用BaseDAO的inserts的方法
        long id = 0;
        try {
            id = insert(Tables.INFO_USER_PLAYER, values);
        } catch (Exception e) {

        }
    }

    /**
     * 随意更新某个字段数据
     *
     * @param infoUserPlayer 传入一个类，按照ID更新剩下所有字段
     * @return
     * @throws Exception
     */
    @Override
    public int Update(InfoUserPlayer infoUserPlayer) throws Exception {
        ContentValues values = new ContentValues();

        if (infoUserPlayer.cUserID != null)
            values.put(TablesFields.INFO_USER_PLAYER_ID, infoUserPlayer.cUserID);
        if (infoUserPlayer.cUserName != null)
            values.put(TablesFields.INFO_USER_PLAYER_USERNAME, infoUserPlayer.cUserName);
        if (infoUserPlayer.nLevel != 0)
            values.put(TablesFields.INFO_USER_PLAYER_LEVEL, infoUserPlayer.nLevel);
        if (infoUserPlayer.nSimilarStar != 0)
            values.put(TablesFields.INFO_USER_PLAYER_SIMILERSTAR, infoUserPlayer.nSimilarStar);
        if (infoUserPlayer.cNickName != null)
            values.put(TablesFields.INFO_USER_PLAYER_NICKNAME, infoUserPlayer.cNickName);
        if (infoUserPlayer.nTeam != 0)
            values.put(TablesFields.INFO_USER_PLAYER_TEAM, infoUserPlayer.nTeam);
        if (infoUserPlayer.bIsLeader != false)
            values.put(TablesFields.INFO_USER_PLAYER_BISLEADER, infoUserPlayer.bIsLeader);//原本是boolean类
        if (infoUserPlayer.nFieldPos != 0)
            values.put(TablesFields.INFO_USER_PLAYER_FIELDPOS, infoUserPlayer.nFieldPos);
        if (infoUserPlayer.nBackNum != 0)
            values.put(TablesFields.INFO_USER_PLAYER_BACKNO, infoUserPlayer.nBackNum);
        if (infoUserPlayer.nStatus != 0)
            values.put(TablesFields.INFO_USER_PLAYER_STATUS, infoUserPlayer.nStatus);
        if (infoUserPlayer.nMatchTotal != 0)
            values.put(TablesFields.INFO_USER_PLAYER_MATCHTOTAL, infoUserPlayer.nMatchTotal);
        if (infoUserPlayer.fAttendPercent != 0)
            values.put(TablesFields.INFO_USER_PLAYER_ATTENDPERCENT, infoUserPlayer.fAttendPercent);
        if (infoUserPlayer.fReliabilityPercent != 0)
            values.put(TablesFields.INFO_USER_PLAYER_RELIABILITYPERCENT, infoUserPlayer.fReliabilityPercent);
        if (infoUserPlayer.textProfile != null)
            values.put(TablesFields.INFO_USER_PLAYER_PROFILE, infoUserPlayer.textProfile);

        String strUpdateById = TablesFields.INFO_USER_PLAYER_ID + "=" + infoUserPlayer.cUserID;
        int nCount = 0;
        try {
            nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateById, null);
        } catch (Exception e) {
        }

        return nCount;
    }

    /**
     * 根据所有的字段获取所有的对象，并且分页展示。
     *
     * @return
     */
    public List<InfoUserPlayer> GetAll(InfoUserPlayer infoUserPlayer) {

        List<String> listStrID = new ArrayList<String>();
//		------------------------------------- 拼接参数，始

        String strSelection = "1=1 "; // 1=1 目的为了方便拼接字符串
        if (infoUserPlayer.cUserID != null) {
            listStrID.add(infoUserPlayer.cUserID);
            strSelection += "and cUserID like ?";
        }
        if (infoUserPlayer.cUserName != null) {
            listStrID.add(infoUserPlayer.cUserName);
            strSelection += "and cUserName like ?";
        }
        if (infoUserPlayer.nLevel != 0) //0表示没有传值
        {              // 不等于0表示传入这个值，则要查找这个值
            listStrID.add(infoUserPlayer.nLevel + "");
            strSelection += "and nLevel=?";
        }
        if (infoUserPlayer.nSimilarStar != 0) {
            listStrID.add(infoUserPlayer.nSimilarStar + "");
            strSelection += "and nSimilarStar=?";
        }
        if (infoUserPlayer.cNickName != null) {
            listStrID.add(infoUserPlayer.cNickName);
            strSelection += "and cNickName like ?";
        }
        if (infoUserPlayer.nTeam != 0) {
            listStrID.add(infoUserPlayer.nTeam + "");
            strSelection += "and nTeam=?";
        }
        if (infoUserPlayer.bIsLeader != false) {
//			listStrID.add(infoUserPlayer.bIsLeader+"");
            strSelection += "and bIsLeader=1";  //true 在数据库中映射为 1.
        }
        if (infoUserPlayer.nFieldPos != 0) {
            listStrID.add(infoUserPlayer.nFieldPos + "");
            strSelection += "and nFieldPos=?";
        }
        if (infoUserPlayer.nBackNum != 0) {
            listStrID.add(infoUserPlayer.nBackNum + "");
            strSelection += "and nBackNum=?";
        }
        if (infoUserPlayer.nStatus != 0) {
            listStrID.add(infoUserPlayer.nStatus + "");
            strSelection += "and nStatus=?";
        }
        if (infoUserPlayer.nMatchTotal != 0) {
            listStrID.add(infoUserPlayer.nMatchTotal + "");
            strSelection += "and nMatchTotal=?";
        }
        if (infoUserPlayer.fAttendPercent != 0) {
            listStrID.add(infoUserPlayer.fAttendPercent + "");
            strSelection += "and fAttendPercent=?";
        }
        if (infoUserPlayer.fReliabilityPercent != 0) {
            listStrID.add(infoUserPlayer.fReliabilityPercent + "");
            strSelection += "and fReliabilityPercent=?";
        }
        if (infoUserPlayer.textProfile != null) {
            listStrID.add(infoUserPlayer.textProfile);
            strSelection += "and textProfile like ?";
        }
        String[] arrStrID = new String[listStrID.size()];
        listStrID.toArray(arrStrID);
//		------------------------------------- 拼接参数，完


        List<InfoUserPlayer> userPlayer = queryList(InfoUserPlayer.class,
                "info_user_player",
                new String[]{"*"},
                strSelection,
                arrStrID,
                null,
                1,
                300);
        for (InfoUserPlayer infoUserPlayer11 : userPlayer) {

        }

        return userPlayer;
    }

    /**
     * 根据 UserName 或者 UserID 查询某一条数据
     *
     * @param
     * @return
     */
    public InfoUserPlayer GetOne(InfoUserPlayer infoUserPlayer) {
        InfoUserPlayer userPlayer = null;
        String strSelection = "";  //查找条件

        String cUserName = infoUserPlayer.cUserName;
        String cUserID = infoUserPlayer.cUserID;
        if ((cUserID == null || cUserID.length() <= 0) && (cUserName == null || cUserName.length() <= 0)) {
            return null; //两个都空，返回空
        } else if ((cUserID == null || cUserID.length() <= 0)) // cUserID 为空，按照cUserName 查找
        {
            String[] arrStrID = new String[]{infoUserPlayer.cUserName};
            strSelection = "cUserName=?";
            userPlayer = queryObject(InfoUserPlayer.class,
                    "info_user_player",
                    new String[]{"*"},
                    strSelection,
                    arrStrID);
        } else if ((cUserName == null || cUserName.length() <= 0)) // cUserName 为空,按cUserId 查找
        {
            String[] arrStrID = new String[]{infoUserPlayer.cUserID};
            strSelection = "cUserID=?";
            userPlayer = queryObject(InfoUserPlayer.class,
                    "info_user_player",
                    new String[]{"*"},
                    strSelection,
                    arrStrID);
        }
//		else { //两个都有，只要满足其中一个就可以
//			String[] arrStrID=new String[]{infoUserPlayer.cUserID,infoUserPlayer.cUserName };
//			strSelection="cUserID=? and cUserName=?";
//		}

        return userPlayer;
    }

    /**
     * 根据 id 删除数据,全删除
     *
     * @param
     */
    @Override
    public int Del(InfoUserPlayer infoUserPlayer)  //目前只能根据ID删除
    {
        if(infoUserPlayer==null)return 0;

        ContentValues values = new ContentValues();
        values.put(TablesFields.INFO_USER_PLAYER_TEAM, -1);// 值置为 -1 ，表示删除
        String strUpdateWhere = "";

        if (infoUserPlayer.cUserID != null) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_ID + "  =   '"+infoUserPlayer.cUserID+"'";  // text 类型的数据参数两边加单引号 ''
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere,null);
            return nCount;
        }

        if (infoUserPlayer.cUserName != null) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_USERNAME + " =  '"+infoUserPlayer.cUserName+"'";//
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere,null);
            return nCount;
        }



        if (infoUserPlayer.nLevel != 0) //0表示没有传值
        {
            strUpdateWhere="nLevel = "+infoUserPlayer.nLevel;
            int nCount = update(Tables.INFO_USER_PLAYER, values,strUpdateWhere ,null);
            return nCount;
        }

        if (infoUserPlayer.nSimilarStar != 0) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_SIMILERSTAR + "= "+infoUserPlayer.nSimilarStar;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere, null);
            return nCount;
        }

        if (infoUserPlayer.cNickName != null) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_NICKNAME + "="+infoUserPlayer.cNickName;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere, null);
            return nCount;
        }


        if (infoUserPlayer.bIsLeader != false) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_BISLEADER + "= 1 " ;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere, null);
            return nCount;
        }

        if (infoUserPlayer.nFieldPos != 0) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_FIELDPOS + "= "+infoUserPlayer.nFieldPos;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere, null);
            return nCount;
        }

        if (infoUserPlayer.nBackNum != 0) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_BACKNO + "= "+infoUserPlayer.nBackNum ;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere, null);
            return nCount;
        }
        if (infoUserPlayer.nStatus != 0) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_STATUS + "= "+infoUserPlayer.nStatus ;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere,null);
            return nCount;
        }

        if (infoUserPlayer.nMatchTotal != 0) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_MATCHTOTAL + "= "+infoUserPlayer.nMatchTotal;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere, null);
            return nCount;
        }

        if (infoUserPlayer.fAttendPercent != 0) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_ATTENDPERCENT + "= "+infoUserPlayer.fAttendPercent;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere,null);
            return nCount;
        }

        if (infoUserPlayer.fReliabilityPercent != 0) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_RELIABILITYPERCENT + "= "+infoUserPlayer.fReliabilityPercent ;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere,null);
            return nCount;
        }

        if (infoUserPlayer.textProfile != null) {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_PROFILE + "= '"+infoUserPlayer.textProfile+"'";
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere,null);
            return nCount;
        }
       // if (infoUserPlayer.nTeam != 0）   //前面所有字段都空，且 infoUserPlayer 不空.则必然是nTeam
        {
            strUpdateWhere = TablesFields.INFO_USER_PLAYER_TEAM + "= "+infoUserPlayer.nTeam;
            int nCount = update(Tables.INFO_USER_PLAYER, values, strUpdateWhere, null);
            return nCount;
        }
    }
}
