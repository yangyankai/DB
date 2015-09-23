package shootbox.sqlite.chat_match_friends_record_201508;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonChatMatchFriendsRecord201508DAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508) throws Exception;
    /**
     *更新数据
     * @param chatMatchFriendsRecord201508
     * @throws Exception
     */
    int Update(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<ChatMatchFriendsRecord201508> GetAll(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508);
    /**
     * 查找数据
     * @param
     * @return
     */
    ChatMatchFriendsRecord201508 GetOne(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508);
    /**
     * 删除数据
     * @param
     */
    int Del(ChatMatchFriendsRecord201508 chatMatchFriendsRecord201508);
}
