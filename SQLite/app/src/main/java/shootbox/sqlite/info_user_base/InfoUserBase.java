package shootbox.sqlite.info_user_base;

/**
 * 个人信息表格字段
 * Created by LiHua on 2015/7/31.
 */
public class InfoUserBase
{
    public      String      cUserID;
    public      String      cUserName;
    public      String      cPwd;
    public      String      cTel;

    public      String      cEmail;
    public      int         nType;   // 类型为 -1 表示删除
    public      int         nCity;
    public      int         nSex;

    public      int         nAge;
    public      int         nWeight;
    public      int         nHeight;
    public      byte[]       blobPicture;//返回值是blob

    public      String      textProfile;//返回值是text
}
