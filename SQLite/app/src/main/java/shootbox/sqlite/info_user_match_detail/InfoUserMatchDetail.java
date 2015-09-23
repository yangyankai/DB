package shootbox.sqlite.info_user_match_detail;

/**
 * Created by LiHua on 2015/8/4.
 */
public class InfoUserMatchDetail
{
    public  String      cMatchID;
    public  String      cMatchName;
    public  String      cUserID;
    public  String      cUserName;

    public  int         nSeasonType;
    public  int         nTotalGoals;
    public  int         nTotalAssists;
    public  int         nFieldPosStyle;

    public  int         nFieldPosFirst;
    public  int         nFieldPosSecond;
    public  int         nFieldPosThird;
    public  int         nFieldPosOther;

    public  boolean     bIsAttend;
    public  byte[]      blobSelfComment;
    public  String      textProfile;
}
