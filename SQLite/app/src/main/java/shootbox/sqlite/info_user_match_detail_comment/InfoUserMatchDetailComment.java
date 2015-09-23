package shootbox.sqlite.info_user_match_detail_comment;

/**
 * 个人信息表格字段
 * Created by LiHua on 2015/7/31.
 */
public class  InfoUserMatchDetailComment
{
    public  String      cMatchID;
    public  String      cUserID;
    public  byte[]      blobSelfComment;
    public  int         nGivenGood;

    public  int         nGivenBad;
    public  String      cCommenterID;
    public  String      tCommentTime;
    public  Boolean     bGivenGood;

    public  Boolean     bGivenBad;
    public  byte[]      blobGivenComment;
}
