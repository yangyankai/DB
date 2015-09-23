
CREATE TABLE info_user_base (cUserID varchar(20),
                             cUserName varchar(40),
                             cPwd varchar(20),
                             cTel varchar(11),
                             cEmail varchar(30),
                             nType int,
                             nCity int,
                             nSex int,
                             nAge int,
                             nWeight int,
                             nHeight int,
                             blobPicture blob,
                             textProfile text,
                             primary key (cUserID,cUserName));

CREATE TABLE info_user_player(cUserID varchar(20),
                              cUserName varchar(40),
                              nLevel int,
                              nSimilarStar int,
                              cNickName varchar(30),
                              nTeam int,
                              bIsLeader boolean,
                              nFieldPos int,
                              nBackNum int(2),
                              nStatus int,
                              nMatchTotal int,
                              fAttendPercent float(3,1),
                              fReliabilityPercent float(3,1),
                              textProfile text,
                              primary key (cUserID,cUserName));

CREATE TABLE info_user_ability (cUserID varchar(20),
                                                    cUserName varchar(40),
                                                    nAttack int(2),
                                                    nDefense int(2),
                                                    nSpeed int(2),
                                                    nPower int(2),
                                                    nTechnology int(2),
                                                    nStamina int(2),
                                                    nTeamwork int(2),
                                                    nPassing int(2),
                                                    nCompetition int(2),
                                                    nShooting int(2),
                                                    nShortPass int(2),
                                                    nLongPass int(2),
                                                    nCrarrying int(2),
                                                    nHeading int(2),
                                                    nSkillful int(2),
                                                    nCombat int(2),
                                                    nInverse int(2),
                                                    nStateHolding int(2),
                                                    textProfile text,primary key (cUserID,cUserName));

CREATE TABLE info_user_match_detail (cMatchID varchar(20),
                                                 cMatchName varchar(100),
                                                 cUserID varchar(20),
                                                 cUserName varchar(40),
                                                 nSeasonType int,
                                                 nTotalGoals int,
                                                 nTotalAssists int,
                                                 nFieldPosStyle int,
                                                 nFieldPosFirst int,
                                                 nFieldPosSecond int,
                                                 nFieldPosThird int,
                                                 nFieldPosOther int,
                                                 bIsAttend bool,
                                                 blobSelfComment blob,
                                                 textProfile text,primary key (cMatchID,cMatchName,cUserID,cUserName));

    CREATE TABLE info_user_match_detail_comment (cMatchID varchar(20),
                                                   cUserID varchar(20),
                                                   blobSelfComment blob,
                                                   nGivenGood int,
                                                   nGivenBad int,
                                                   cCommenterID varchar(20),
                                                   tCommentTime timestamp,
                                                   bGivenGood bool,
                                                   bGivenBad bool,
                                                   blobGivenComment blob,primary key (cMatchID,cUserID));

    CREATE TABLE info_user_match_detail_mood (cMatchID varchar(20),
                                               cUserID varchar(20),
                                               blobSelfMood blob,
                                               nGivenGood int,
                                               nGivenBad int,
                                               cCommenterID varchar(20),
                                               tCommentTime timestamp,
                                               bGivenGood bool,
                                               bGivenBad bool,
                                               blobGivenComment blob,primary key (cMatchID,cUserID));

   CREATE TABLE info_user_match_detail_mark (
         cMatchID text  ,
         cUserID text  ,
        cMarkerID text,
           tMarkEndTime ,
          bIsMarkFinish  boolean,

        bIsMarkAttack boolean,
           bIsMarkDefense boolean,
           bIsMarkSpeed boolean,
           bIsMarkPower boolean,
           bIsMarkTechnology boolean,


          bIsMarkStamina boolean,
          bIsMarkTeamwork boolean,
          bIsMarkPassing boolean,
          bIsMarkCompetition boolean,
          bIsMarkShooting boolean,

          bIsMarkShortPass boolean,
          bIsMarkLongPass boolean,
          bIsMarkCrarrying boolean,
          bIsMarkHeading boolean,
          bIsMarkSkillful boolean,


          bIsMarkCombat boolean,
               nAttack int,
               nDefense int,
               nSpeed int,
               nPower int,

               nTechnology int,
               nStamina int,
               nTeamwork int,
               nPassing int,
               nCompetition int,


               nShooting int,
               nShortPass int,
               nLongPass int,
               nCrarrying int,
               nHeading int,

               nSkillful int,
               nCombat int,
               nAttackChange int,
               nDefenseChange int,
               nSpeedChange int,


               nPowerChange int,
               nTechnologyChange int,
               nStaminaChange int,
               nTeamworkChange int,
               nPassingChange int,

               nCompetitionChange int,
               nShootingChange int,
               nShortPassChange int,
               nLongPassChange int,
               nCrarryingChange int,


               nHeadingChange int,
               nSkillfulChange int,
               nCombatChange int, primary key (cMatchID,cUserID )  );
                                                      

 CREATE TABLE info_team_base(cTeamID varchar(20),
                             cTeamName varchar(20),
                             cTeamLeader varchar(40),
                             nCity int,
                             blobLogo int,
							 
                             cCommenterID blob,
                             bAdd bool,
                             nMemberNum int,
                             nTotalScores int,
                             nStyle int,
                             
							 textProfile text,primary key (cTeamID,cTeamName));


CREATE TABLE info_match_base(cMatchID varchar(20),
                               cMatchName varchar(100),
                               cTeamName varchar(100),
                               cOrgniser varchar(100),
                               nMatchType int,
                               nMatchFormatType int(3),
                               tStartTime timestamp,
                               tEndTime timestamp,
                               cAddress varchar(200),
                               nOppenentID varchar(20),
                               nOppenentName varchar(100),
                               nMinNum int(3),
                               nMaxNum int(3),
                               nActualNum int(3),
                               nChannel int,
                               textProfile text,primary key (cMatchID,cMatchName,cTeamName));


CREATE TABLE info_friends_apply_record(cUserID varchar(20),
                                        cApplicatID varchar(20),
                                        tApplyTime timestamp,
                                        cApplyNote blob,
                                        nConfirmStatus int,
                                        tConfirmTime timestamp,
                                        cReplyNote blob,primary key (cUserID,cApplicatID));
										
										
CREATE TABLE info_friends_apply_detail(
			cMatchID text,
			cTeamID text,
			cApplicatID text,
            tApplyTime text,

			cApplyNote blob,
			nConfirmStatus int,
			tConfirmTime text,
			cReplyNote blob,primary key (cMatchID,cTeamID,cApplicatID));
										
										
										
										

CREATE TABLE info_chatroom_team_record_201508(cChannelID varchar(20),
                                                cChatRoomID varchar(40),
                                                cSenderID varchar(20),
                                                tSendTime timestamp,
                                                bIsSend bool,
                                                blobSendContent blob,
                                                primary key(cChannelID,cChatRoomID,cSenderID));

CREATE TABLE info_chatroom_match_record_201508(cChannelID varchar(20),
                                                 cChatRoomID varchar(40),
                                                 cSenderID varchar(20),
                                                 tSendTime timestamp,
                                                 bIsSend bool,
                                                blobSendContent blob,
                                                primary key (cChannelID,cChatRoomID,cSenderID));

CREATE TABLE chat_team_friends_record_201508(cChannelID varchar(20),
                                                 cSenderID varchar(20),
                                                 cReceiverID varchar(20),
                                                 tSendTime timestamp,
                                                 bIsSend bool,
                                                 blobSendContent blob,
                                                 bIsReceive bool,primary key (cChannelID,cSenderID,cReceiverID));

CREATE TABLE chat_match_friends_record_201508(cChannelID varchar(20),
                                                 cSenderID varchar(20),
                                                 cReceiverID varchar(20),
                                                 tSendTime timestamp,
                                                 bIsSend bool,
                                                 blobSendContent blob,
                                                 bIsReceive bool,primary key (cChannelID,cSenderID,cReceiverID));


CREATE TABLE [map_season] (
                              [nYear] INT,
                              [textDes] TEXT,primary key (nYear));

insert into map_season (nYear)values(2015);

CREATE TABLE [map_match_type] (
                              [nType] INT,
                              [textDes] TEXT,primary key (nType));

insert into map_match_type values(0,"联赛");
insert into map_match_type values(1,"业余");
insert into map_match_type values(2,"练习");
insert into map_match_type values(3,"其他");

CREATE TABLE [map_match_format] (
                                [nType] INT,
                                [textDes] TEXT,primary key (nType));
insert into map_match_format (nType)values(1);


CREATE TABLE [map_match_result] (
                              [nType] INT,
                              [textDes] TEXT,primary key (nType));
 insert into map_match_result values(-1,"负");
 insert into map_match_result values(0,"平");
 insert into map_match_result values(1,"胜");

 CREATE TABLE [map_user_play_status] (
                               [nType] INT,
                               [textDes] TEXT,primary key (nType));
 insert into map_user_play_status values(0,"正常");
 insert into map_user_play_status values(1,"伤病");

 CREATE TABLE [map_user_type] (
                                [nType] INT,
                                [textDes] TEXT,primary key (nType));
 insert into map_user_type values(0,"游客");
 insert into map_user_type values(1,"普通");
 insert into map_user_type values(2,"会员");
 insert into map_user_type values(3,"其他");

  CREATE TABLE [map_user_level] (
                                 [nType] INT,
                                 [textDes] TEXT,primary key (nType));
  insert into map_user_level values(1,"业余");
  insert into map_user_level values(2,"专业");

   CREATE TABLE [map_confirm_way] (
                                   [nType] INT,
                                   [textDes] TEXT,primary key (nType));
    insert into map_confirm_way values(0,"拒绝");
    insert into map_confirm_way values(1,"接受");
    insert into map_confirm_way values(2,"待确认");

    CREATE TABLE [map_sex] (
                                  [nType] INT,
                                  [textDes] TEXT,primary key (nType));
    insert into map_sex values(0, "保密");
    insert into map_sex values(1, "男");
    insert into map_sex values(2, "女");

    CREATE TABLE [map_friendship_type] (
                                            [nType] INT,
                                            [textDes] TEXT,primary key (nType));
    insert into map_friendship_type values(1, "球队队友");
    insert into map_friendship_type values(2, "比赛队友");
    insert into map_friendship_type values(3, "手动收索");
    insert into map_friendship_type values(10, "其他");
