package shootbox.sqlite.info_user_player;

import android.database.Cursor;

import java.io.Serializable;
import java.util.List;

/**
 * 接口
 * Created by  on 2015/7/31.
 */
public interface IPersonInfoUserPlayerDAO<T, PK extends Serializable>
{

    /**
     * 添加一行数据
     *
     */
    void Add(InfoUserPlayer info) throws Exception;
    /**
     *更新任意字段数据
     * @param info
     * @throws Exception
     */
    int Update(InfoUserPlayer info) throws Exception;

    /**
     * 根据任意字段查找所有数据
     * @param
     * @return
     */
    List<InfoUserPlayer> GetAll(InfoUserPlayer infoUserPlayer);
    /**
     * 根据任意字段查找一行数据
     * @param
     * @return
     */
    InfoUserPlayer GetOne(InfoUserPlayer infoUserPlayer);
    /**
     * 根据任意字段删除数据
     * @param
     */
    int Del(InfoUserPlayer infoUserPlayer);
}
