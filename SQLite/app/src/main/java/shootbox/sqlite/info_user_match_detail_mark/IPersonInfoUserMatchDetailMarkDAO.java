package shootbox.sqlite.info_user_match_detail_mark;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoUserMatchDetailMarkDAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoUserMatchDetailMark infoUserMatchDetailMark) throws Exception;
    /**
     *更新数据
     * @param infoUserMatchDetailMark
     * @throws Exception
     */
    int Update(InfoUserMatchDetailMark infoUserMatchDetailMark) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoUserMatchDetailMark> GetAll(InfoUserMatchDetailMark infoUserMatchDetailMark);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoUserMatchDetailMark GetOne(InfoUserMatchDetailMark infoUserMatchDetailMark);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoUserMatchDetailMark infoUserMatchDetailMark);
}
