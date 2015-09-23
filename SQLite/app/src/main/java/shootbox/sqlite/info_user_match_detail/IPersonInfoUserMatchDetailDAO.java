package shootbox.sqlite.info_user_match_detail;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoUserMatchDetailDAO<T, PK extends Serializable>
{

    /**
     * 添加一行数据
     *
     */
    void Add(InfoUserMatchDetail infoUserMatchDetail) throws Exception;
    /**
     *更新任意字段数据
     * @param infoUserMatchDetail
     * @throws Exception
     */
    int Update(InfoUserMatchDetail infoUserMatchDetail) throws Exception;

    /**
     * 根据任意字段查找所有数据
     * @param
     * @return
     */
    List<InfoUserMatchDetail> GetAll(InfoUserMatchDetail infoUserMatchDetail);
    /**
     * 根据任意字段查找一行数据
     * @param
     * @return
     */
    InfoUserMatchDetail GetOne(InfoUserMatchDetail infoUserMatchDetail);
    /**
     * 根据任意字段删除数据
     * @param
     */
    int Del(InfoUserMatchDetail infoUserMatchDetail);
}
