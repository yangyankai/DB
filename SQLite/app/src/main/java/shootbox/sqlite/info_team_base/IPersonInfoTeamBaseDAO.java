package shootbox.sqlite.info_team_base;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoTeamBaseDAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoTeamBase infoTeamBase) throws Exception;
    /**
     *更新数据
     * @param infoTeamBase
     * @throws Exception
     */
    int Update(InfoTeamBase infoTeamBase) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoTeamBase> GetAll(InfoTeamBase infoTeamBase);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoTeamBase GetOne(InfoTeamBase infoTeamBase);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoTeamBase infoTeamBase);
}
