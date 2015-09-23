package shootbox.sqlite.info_team_apply_detail;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoApplyDetailDAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoTeamApplyDetail infoTeamApplyDetail) throws Exception;
    /**
     *更新数据
     * @param infoTeamApplyDetail
     * @throws Exception
     */
    int Update(InfoTeamApplyDetail infoTeamApplyDetail) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoTeamApplyDetail> GetAll(InfoTeamApplyDetail infoTeamApplyDetail);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoTeamApplyDetail GetOne(InfoTeamApplyDetail infoTeamApplyDetail);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoTeamApplyDetail infoTeamApplyDetail);
}
