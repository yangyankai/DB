package shootbox.sqlite.info_user_match_detail_mood;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoUserMatchDetailMoodDAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoUserMatchDetailMood infoUserMatchDetailMood) throws Exception;
    /**
     *更新数据
     * @param infoUserMatchDetailMood
     * @throws Exception
     */
    int Update(InfoUserMatchDetailMood infoUserMatchDetailMood) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoUserMatchDetailMood> GetAll(InfoUserMatchDetailMood infoUserMatchDetailMood);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoUserMatchDetailMood GetOne(InfoUserMatchDetailMood infoUserMatchDetailMood);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoUserMatchDetailMood infoUserMatchDetailMood);
}
