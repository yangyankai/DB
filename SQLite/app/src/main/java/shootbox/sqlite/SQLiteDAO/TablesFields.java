package shootbox.sqlite.SQLiteDAO;

import java.lang.String; /**
 * Created by LiHua on 2015/7/31.
 */
public class TablesFields {

    // sqlite_master
    public static final String   SQLITE_MASTER_COUNT = "count";

    // INFO_USER_BASE
    public static final String   INFO_USER_BASE_ID= "cUserID";
    public static final String   INFO_USER_BASE_NAME= "cUserName";
    public static final String   INFO_USER_BASE_PWD= "cPwd";
    public static final String   INFO_USER_BASE_TEL= "cTel";
    public static final String   INFO_USER_BASE_EMAIL= "cEmail";
    public static final String   INFO_USER_BASE_TYPE= "nType";
    public static final String   INFO_USER_BASE_CITY= "nCity";
    public static final String   INFO_USER_BASE_SEX= "nSex";
    public static final String   INFO_USER_BASE_AGE= "nAge";
    public static final String   INFO_USER_BASE_WEIGHT= "nWeight";
    public static final String   INFO_USER_BASE_HEIGHT= "nHeight";
    public static final String   INFO_USER_BASE_BLOBPICTURE= "blobPicture";
    public static final String   INFO_USER_BASE_TEXTPROFILE= "textProfile";

    // INFO_USER_PLAYER
    public static final String   INFO_USER_PLAYER_ID                = "cUserID";
    public static final String   INFO_USER_PLAYER_USERNAME          = "cUserName";
    public static final String   INFO_USER_PLAYER_LEVEL             = "nLevel";
    public static final String   INFO_USER_PLAYER_SIMILERSTAR       = "nSimilarStar";
    public static final String   INFO_USER_PLAYER_NICKNAME          = "cNickName";
    public static final String   INFO_USER_PLAYER_TEAM              = "nTeam";
    public static final String   INFO_USER_PLAYER_BISLEADER         = "bIsLeader";
    public static final String   INFO_USER_PLAYER_FIELDPOS          = "nFieldPos";
    public static final String   INFO_USER_PLAYER_BACKNO            = "nBackNum";
    public static final String   INFO_USER_PLAYER_STATUS            = "nStatus";
    public static final String   INFO_USER_PLAYER_MATCHTOTAL        = "nMatchTotal";
    public static final String   INFO_USER_PLAYER_ATTENDPERCENT     = "fAttendPercent";
    public static final String   INFO_USER_PLAYER_RELIABILITYPERCENT="fReliabilityPercent";
    public static final String   INFO_USER_PLAYER_PROFILE           ="textProfile";

    // INFO_USER_ABILITY
    public static final String   INFO_USER_ABILITY_ID= "cUserID";
    public static final String   INFO_USER_ABILITY_USERNAME= "cUserName";
    public static final String   INFO_USER_ABILITY_ATTACK= "nAttack";
    public static final String   INFO_USER_ABILITY_DEFENSE= "nDefense";
    public static final String   INFO_USER_ABILITY_SPEED= "nSpeed";
    public static final String   INFO_USER_ABILITY_POWER= "nPower";
    public static final String   INFO_USER_ABILITY_TECHNOLOGY= "nTechnology";
    public static final String   INFO_USER_ABILITY_STAMINA= "nStamina";
    public static final String   INFO_USER_ABILITY_TEAMWORK= "nTeamwork";
    public static final String   INFO_USER_ABILITY_PASSING= "nPassing";
    public static final String   INFO_USER_ABILITY_COMPETITION= "nCompetition";
    public static final String   INFO_USER_ABILITY_SHOOTING= "nShooting";
    public static final String   INFO_USER_ABILITY_SHORTPASS= "nShortPass";
    public static final String   INFO_USER_ABILITY_LONGPASS= "nLongPass";
    public static final String   INFO_USER_ABILITY_CRARRYING= "nCrarrying";
    public static final String   INFO_USER_ABILITY_HEADING= "nHeading";
    public static final String   INFO_USER_ABILITY_SKILLFUL= "nSkillful";
    public static final String   INFO_USER_ABILITY_COMBAT= "nCombat";
    public static final String   INFO_USER_ABILITY_INVERSE= "nInverse";
    public static final String   INFO_USER_ABILITY_STATEHOLDING= "nStateHolding";
    public static final String   INFO_USER_ABILITY_TEXTPROFILE= "textProfile";



    // INFO_USER_MatchDetail
    public static final String   INFO_USER_MATCH_DETAIL_USERID = "cUserID";
    public static final String   INFO_USER_MATCH_DETAIL_USERNAME = "cUserName";
    public static final String   INFO_USER_MATCH_DETAIL_MATCHID = "cMatchID";
    public static final String   INFO_USER_MATCH_DETAIL_MATCHNAME = "cMatchName";

    public static final String   INFO_USER_MATCH_DETAIL_SEASONTYPE ="nSeasonType";
    public static final String   INFO_USER_MATCH_DETAIL_TOTALGOALS = "nTotalGoals";
    public static final String   INFO_USER_MATCH_DETAIL_TOTALASSISTS = "nTotalAssists";
    public static final String   INFO_USER_MATCH_DETAIL_FIELDPOSSTYLE ="nFieldPosStyle";

    public static final String   INFO_USER_MATCH_DETAIL_FIELDPOSFIRST = "nFieldPosFirst";
    public static final String   INFO_USER_MATCH_DETAIL_FIELDPOSSECOND = "nFieldPosSecond";
    public static final String   INFO_USER_MATCH_DETAIL_FIELDPOSTHIRD = "nFieldPosThird";
    public static final String   INFO_USER_MATCH_DETAIL_FIELDPOSOTHER = "nFieldPosOther";

    public static final String   INFO_USER_MATCH_DETAIL_ISATTEND = "bIsAttend";
    public static final String   INFO_USER_MATCH_DETAIL_SELFCOMMENT = "blobSelfComment";
    public static final String   INFO_USER_MATCH_DETAIL_PROFILE = "textProfile";


    //INFO_USER_MATCH_DETAIL_COMMENT
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_MATCHID = "cMatchID";
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_USERID = "cUserID";
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_SELFCOMMENT = "blobSelfComment";
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_GIVENGOOD = "nGivenGood";
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_GIVENBAD = "nGivenBad";
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_COMMENTERID = "cCommenterID";
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_COMMENTTIME = "tCommentTime";
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_BGIVENGOOD= "bGivenGood";
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_BGIVENBAD= "bGivenBad";
    public static final String   INFO_USER_MATCH_DETAIL_COMMENT_GIVENCOMMENT= "blobGivenComment";

    //INFO_USER_MATCH_DETAIL_Mood
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_MATCHID = "cMatchID";
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_USERID = "cUserID";
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_SELFMOOD = "blobSelfMood";
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_GIVENGOOD = "nGivenGood";
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_GIVENBAD = "nGivenBad";
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_COMMENTERID = "cCommenterID";
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_COMMENTTIME = "tCommentTime";
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_BGIVENGOOD = "bGivenGood";
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_BGIVENBAD = "bGivenBad";
    public static final String   INFO_USER_MATCH_DETAIL_MOOD_GIVENCOMMENT = "blobGivenComment";

    //INFO_USER_MATCH_DETAIL_MARK
    public static final String   INFO_USER_MATCH_DETAIL_MARK_MATCHID = "cMatchID";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_USERID = "cUserID";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_MARKERID = "cMarkerID";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_MARKENDTIME = "tMarkEndTime";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKFINISH = "bIsMarkFinish";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKATTACK = "bIsMarkAttack";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKDEFENSE = "bIsMarkDefense";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKSPEED = "bIsMarkSpeed";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKPOWER = "bIsMarkPower";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKTECHNOLOGY = "bIsMarkTechnology";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKSTAMINA = "bIsMarkStamina";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKTEAMWORK = "bIsMarkTeamwork";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKPASSING = "bIsMarkPassing";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMPETITION = "bIsMarkCompetition";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKSHOOTING = "bIsMarkShooting";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKSHORTPASS = "bIsMarkShortPass";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKLONGPASS = "bIsMarkLongPass";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKCRARRYING = "bIsMarkCrarrying";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKHEADING = "bIsMarkHeading";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKSKILLFUL = "bIsMarkSkillful";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ISMARKCOMBAT = "bIsMarkCombat";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ATTACK = "nAttack";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_DEFENSE = "nDefense";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_SPEED = "nSpeed";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_POWER = "nPower";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGY = "nTechnology";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_STAMINA = "nStamina";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_TEAMWORK = "nTeamwork";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_PASSING = "nPassing";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_COMPETITION = "nCompetition";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_SHOOTING = "nShooting";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_SHORTPASS = "nShortPass";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_LONGPASS = "nLongPass";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_CRARRYING = "nCrarrying";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_HEADING = "nHeading";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_SKILLFUL = "nSkillful";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_COMBAT = "nCombat";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_ATTACKCHANGE = "nAttackChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_DEFENSECHANGE = "nDefenseChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_SPEEDCHANGE = "nSpeedChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_POWERCHANGE = "nPowerChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_TECHNOLOGYCHANGE = "nTechnologyChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_STAMINACHANGE = "nStaminaChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_TEAMWORKCHANGE = "nTeamworkChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_PASSINGCHANGE = "nPassingChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_COMPETITIONCHANGE = "nCompetitionChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_SHOOTINGCHANGE = "nShootingChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_SHORTPASSCHANGE = "nShortPassChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_LOONGPASSCHANGE = "nLongPassChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_CRARRYINGCHANGE = "nCrarryingChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_HEADINGCHANGE = "nHeadingChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_SKILLFULCHANGE = "nSkillfulChange";
    public static final String   INFO_USER_MATCH_DETAIL_MARK_COMBATCHANGE = "nCombatChange";

    //into_team_base
    public static final String   INFO_TEAM_BASE_TEAMID = "cTeamID";
    public static final String   INFO_TEAM_BASE_TEAMNAME = "cTeamName";
    public static final String   INFO_TEAM_BASE_TEAMLEADER = "cTeamLeader";
    public static final String   INFO_TEAM_BASE_CITY = "nCity";
    public static final String   INFO_TEAM_BASE_LOBLOGO = "blobLogo";
    public static final String   INFO_TEAM_BASE_ADD = "bAdd";
    public static final String   INFO_TEAM_BASE_MEMBERNUM = "nMemberNum";
    public static final String   INFO_TEAM_BASE_TOTALSCORES = "nTotalScores";
    public static final String   INFO_TEAM_BASE_STYLE = "nStyle";
    public static final String   INFO_TEAM_BASE_PROFILE = "textProfile";

    //into_match_base
    public static final String   INFO_MATCH_BASE_MATCHID            = "cMatchID";
    public static final String   INFO_MATCH_BASE_MATCHNAME          = "cMatchName";
    public static final String   INFO_MATCH_BASE_TEAMNAME           = "cTeamName";
    public static final String   INFO_MATCH_BASE_ORGNISER           = "cOrgniser";
    public static final String   INFO_MATCH_BASE_MATCHTYPE          = "nMatchType";
    public static final String   INFO_MATCH_BASE_MATCHFORMATTYPE    = "nMatchFormatType";
    public static final String   INFO_MATCH_BASE_STARTTIME          = "tStartTime";
    public static final String   INFO_MATCH_BASE_ENDTIME            = "tEndTime";
    public static final String   INFO_MATCH_BASE_ADDRESS            = "cAddress";
    public static final String   INFO_MATCH_BASE_OPPENENTID         = "nOppenentID";
    public static final String   INFO_MATCH_BASE_OPPENENTNAME       = "nOppenentName";
    public static final String   INFO_MATCH_BASE_MINNUM              = "nMinNum";
    public static final String   INFO_MATCH_BASE_MAXNUM             = "nMaxNum";
    public static final String   INFO_MATCH_BASE_ACTUALNUM          = "nActualNum";
    public static final String   INFO_MATCH_BASE_CHANNEL            = "nChannel";
    public static final String   INFO_MATCH_BASE_PROFILE            = "textProfile";

    //info_team_apply_detail
    public static final String   INFO_TEAM_APPLY_DETAIL_MATCHID    = "cMatchID";
    public static final String   INFO_TEAM_APPLY_DETAIL_TEAMID     = "cTeamID";
    public static final String   INFO_TEAM_APPLY_DETAIL_APPLICATID = "cApplicatID";
    public static final String   INFO_TEAM_APPLY_DETAIL_APPLYTIME  = "tApplyTime";
    public static final String   INFO_TEAM_APPLY_DETAIL_APPLYNOTE   = "cApplyNote";
    public static final String   INFO_TEAM_APPLY_DETAIL_CONFIRMSTATUS = "nConfirmStatus";
    public static final String   INFO_TEAM_APPLY_DETAIL_CONFIRMTIME = "tConfirmTime";
    public static final String   INFO_TEAM_APPLY_DETAIL_REPLYNOTE   = "cReplyNote";

    //info_friends_apply_record
    public static final String   INFO_FRIENDS_APPLY_RECORD_USERID    = "cUserID";
    public static final String   INFO_FRIENDS_APPLY_RECORD_APPLICATID = "cApplicatID";
    public static final String   INFO_FRIENDS_APPLY_RECORD_APPLYTIME  = "tApplyTime";
    public static final String   INFO_FRIENDS_APPLY_RECORD_APPLYNOTE   = "cApplyNote";
    public static final String   INFO_FRIENDS_APPLY_RECORD_CONFIRMSTATUS = "nConfirmStatus";
    public static final String   INFO_FRIENDS_APPLY_RECORD_CONFIRMTIME = "tConfirmTime";
    public static final String   INFO_FRIENDS_APPLY_RECORD_REPLYNOTE   = "cReplyNote";

    //info_chatroom_team_record
    public static final String   INFO_CHATROOM_TEAM_RECORD_CHANNELID    = "cChannelID";
    public static final String   INFO_CHATROOM_TEAM_RECORD_CHATROOMID   ="cChatRoomID";
    public static final String   INFO_CHATROOM_TEAM_RECORD_SENDERID     ="cSenderID";
    public static final String   INFO_CHATROOM_TEAM_RECORD_SENDTIME     ="tSendTime";
    public static final String   INFO_CHATROOM_TEAM_RECORD_ISSEND       ="bIsSend";
    public static final String   INFO_CHATROOM_TEAM_RECORD_SENDCONTENT  ="blobSendContent";

    //info_chatroom_match_record
    public static final String   INFO_CHATROOM_MATCH_RECORD_CHANNELID    = "cChannelID";
    public static final String   INFO_CHATROOM_MATCH_RECORD_CHATROOMID   ="cChatRoomID";
    public static final String   INFO_CHATROOM_MATCH_RECORD_SENDERID     ="cSenderID";
    public static final String   INFO_CHATROOM_MATCH_RECORD_SENDTIME     ="tSendTime";
    public static final String   INFO_CHATROOM_MATCH_RECORD_ISSEND       ="bIsSend";
    public static final String   INFO_CHATROOM_MATCH_RECORD_SENDCONTENT  ="blobSendContent";

    //chat_team_friends_record
    public static final String   CHAT_TEAM_FRIENDS_RECORD_CHANNELID    = "cChannelID";
    public static final String   CHAT_TEAM_FRIENDS_RECORD_CHATROOMID   ="cSenderID";
    public static final String   CHAT_TEAM_FRIENDS_RECORD_SENDERID     ="cReceiverID";
    public static final String   CHAT_TEAM_FRIENDS_RECORD_SENDTIME     ="tSendTime";
    public static final String   CHAT_TEAM_FRIENDS_RECORD_ISSEND       ="bIsSend";
    public static final String   CHAT_TEAM_FRIENDS_RECORD_SENDCONTENT  ="blobSendContent";
    public static final String   CHAT_TEAM_FRIENDS_RECORD_ISRECEIVE     ="bIsReceive";

    //chat_match_friends_record
    public static final String   CHAT_MATCH_FRIENDS_RECORD_CHANNELID    = "cChannelID";
    public static final String   CHAT_MATCH_FRIENDS_RECORD_CHATROOMID   ="cSenderID";
    public static final String   CHAT_MATCH_FRIENDS_RECORD_SENDERID     ="cReceiverID";
    public static final String   CHAT_MATCH_FRIENDS_RECORD_SENDTIME     ="tSendTime";
    public static final String   CHAT_MATCH_FRIENDS_RECORD_ISSEND       ="bIsSend";
    public static final String   CHAT_MATCH_FRIENDS_RECORD_SENDCONTENT  ="blobSendContent";
    public static final String   CHAT_MATCH_FRIENDS_RECORD_ISRECEIVE     ="bIsReceive";
}
