package shootbox.sqlite.info_chatroom_match_record_201508;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonChatroomMatchRecord201508DAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508) throws Exception;
    /**
     *更新数据
     * @param infoChatroomMatchRecord201508
     * @throws Exception
     */
    int Update(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoChatroomMatchRecord201508> GetAll(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoChatroomMatchRecord201508 GetOne(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoChatroomMatchRecord201508 infoChatroomMatchRecord201508);
}
