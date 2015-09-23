package shootbox.sqlite.info_friends_apply_record;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoFriendsApplyRecordDAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoFriendsApplyRecord infoFriendsApplyRecord) throws Exception;
    /**
     *更新数据
     * @param infoFriendsApplyRecord
     * @throws Exception
     */
    int Update(InfoFriendsApplyRecord infoFriendsApplyRecord) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoFriendsApplyRecord> GetAll(InfoFriendsApplyRecord infoFriendsApplyRecord);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoFriendsApplyRecord GetOne(InfoFriendsApplyRecord infoFriendsApplyRecord);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoFriendsApplyRecord infoFriendsApplyRecord);
}
