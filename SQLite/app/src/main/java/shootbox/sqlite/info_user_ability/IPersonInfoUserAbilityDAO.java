package shootbox.sqlite.info_user_ability;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoUserAbilityDAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoUserAbility infoUserAbility) throws Exception;
    /**
     *更新数据
     * @param infoUserAbility
     * @throws Exception
     */
    int Update(InfoUserAbility infoUserAbility) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoUserAbility> GetAll(InfoUserAbility infoUserAbility);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoUserAbility GetOne(InfoUserAbility infoUserAbility);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoUserAbility infoUserAbility);
}
