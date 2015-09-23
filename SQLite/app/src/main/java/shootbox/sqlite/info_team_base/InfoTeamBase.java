package shootbox.sqlite.info_team_base;

/**
 * 个人信息表格字段
 * Created by LiHua on 2015/7/31.
 */
public class InfoTeamBase
{
    public  String      cTeamID;
    public  String      cTeamName;
    public  String      cTeamLeader;
    public  int         nCity;
    public  byte[]      blobLogo;

    public  boolean     bAdd;
    public  int         nMemberNum;
    public  int         nTotalScores;
    public  int         nStyle;
    public  String      textProfile;
}
