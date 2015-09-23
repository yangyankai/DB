package shootbox.sqlite.info_user_base;

import java.io.Serializable;
import java.util.List;

import shootbox.sqlite.SQLiteDAO.Tables;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoUserBaseDAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoUserBase info) throws Exception;
    /**
     *更新数据
     * @param info
     * @throws Exception
     */
    int Update(InfoUserBase info) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoUserBase> GetAll(InfoUserBase infoUserBase);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoUserBase GetOne(InfoUserBase infoUserBase);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoUserBase infoUserBase);
}
