package shootbox.sqlite.info_user_match_detail_comment;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoUserMatchDetailCommentDAO<T, PK extends Serializable>
{

    /**
     * 添加数据
     *
     */
    void Add(InfoUserMatchDetailComment infoUserMatchDetailComment) throws Exception;
    /**
     *更新数据
     * @param infoUserMatchDetailComment
     * @throws Exception
     */
    int Update(InfoUserMatchDetailComment infoUserMatchDetailComment) throws Exception;

    /**
     * 查找数据
     * @param
     * @return
     */
    List<InfoUserMatchDetailComment> GetAll(InfoUserMatchDetailComment infoUserMatchDetailComment);
    /**
     * 查找数据
     * @param
     * @return
     */
    InfoUserMatchDetailComment GetOne(InfoUserMatchDetailComment infoUserMatchDetailComment);
    /**
     * 删除数据
     * @param
     */
    int Del(InfoUserMatchDetailComment infoUserMatchDetailComment);
}
