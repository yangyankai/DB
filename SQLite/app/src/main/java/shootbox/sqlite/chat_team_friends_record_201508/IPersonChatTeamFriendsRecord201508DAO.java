package shootbox.sqlite.chat_team_friends_record_201508;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonChatTeamFriendsRecord201508DAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508) throws Exception;
    /**
     *更新数据
     * @param chatTeamFriendsRecord201508
     * @throws Exception
     */
    int Update(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<ChatTeamFriendsRecord201508> GetAll(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508);
    /**
     * 查找数据
     * @param
     * @return
     */
    ChatTeamFriendsRecord201508 GetOne(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508);
    /**
     * 删除数据
     * @param
     */
    int Del(ChatTeamFriendsRecord201508 chatTeamFriendsRecord201508);
}
