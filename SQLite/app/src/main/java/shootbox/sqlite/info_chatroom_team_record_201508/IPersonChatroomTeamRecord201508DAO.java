package shootbox.sqlite.info_chatroom_team_record_201508;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonChatroomTeamRecord201508DAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508) throws Exception;
    /**
     *更新数据
     * @param infoChatroomTeamRecord201508
     * @throws Exception
     */
    int Update(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoChatroomTeamRecord201508> GetAll(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoChatroomTeamRecord201508 GetOne(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoChatroomTeamRecord201508 infoChatroomTeamRecord201508);
}
