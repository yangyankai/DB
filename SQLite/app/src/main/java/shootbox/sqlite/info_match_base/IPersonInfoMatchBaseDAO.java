package shootbox.sqlite.info_match_base;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoMatchBaseDAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoMatchBase infoMatchmBase) throws Exception;
    /**
     *更新数据
     * @param infoMatchmBase
     * @throws Exception
     */
    int Update(InfoMatchBase infoMatchmBase) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoMatchBase> GetAll(InfoMatchBase infoMatchmBase);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoMatchBase GetOne(InfoMatchBase infoMatchmBase);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoMatchBase infoMatchmBase);
}
