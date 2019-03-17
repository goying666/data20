package com.renchaigao.zujuba.PageBean;


import com.renchaigao.zujuba.mongoDB.info.message.ClubMessages;
import com.renchaigao.zujuba.mongoDB.info.message.FriendMessages;
import com.renchaigao.zujuba.mongoDB.info.message.SystemMessages;
import com.renchaigao.zujuba.mongoDB.info.message.TeamMessages;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/2/24/024.
 */
@Setter
@Getter
public class MessageFragmentCardBean {

    private ArrayList<CardMessageFragmentTipBean> allMessageTips = new ArrayList<CardMessageFragmentTipBean>(); //所有消息tip的bean
    private ArrayList<TeamMessages> teamMessagesArrayList = new ArrayList<TeamMessages>();
    private ArrayList<SystemMessages> systemMessagesArrayList = new ArrayList<SystemMessages>();
    private ArrayList<ClubMessages> clubMessagesArrayList = new ArrayList<ClubMessages>();
    private ArrayList<FriendMessages> friendMessagesArrayList = new ArrayList<FriendMessages>();
    private Integer allNoRead = 0; //所有未读消息数

}
