package com.renchaigao.zujuba.mongoDB.info.user;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.message.MessageContent;
import com.renchaigao.zujuba.mongoDB.info.team.TeamMessageInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class UserMessagesInfo extends BasicObject {
    private ArrayList<String> userTeamMessageIdList = new ArrayList<String>();
    private Integer nowTeamMessagesNumber = 0;
    private ArrayList<String> userSystemMessageIdList = new ArrayList<String>();
    private Integer nowSystemMessagesNumber = 0;
    private ArrayList<String> userFriendsMessageIdList = new ArrayList<String>();
    private Integer nowFriendMessagesNumber = 0;
    private ArrayList<String> userClubMessageIdList = new ArrayList<String>();
    private Integer nowClubMessagesNumber = 0;
}
