package com.renchaigao.zujuba.PropertiesConfig;

import lombok.Getter;

@Getter
public class ConstantManagement {

    /* TEAM状态 :5种*/
    public final static String TEAM_STATE_WAITING = "wating";
    public final static String TEAM_STATE_READY = "ready";
    public final static String TEAM_STATE_ARRIVALS = "arrivals";
    public final static String TEAM_STATE_GAME = "gaming";
    public final static String TEAM_STATE_FINISH = "finish";

    /* TEAM创建来源 :*/
    public final static String TEAM_CREATE_STYLE_USER = "user";
    public final static String TEAM_CREATE_STYLE_STORE = "store";
    public final static String TEAM_CREATE_STYLE_OPEN = "open";
    public final static String TEAM_CREATE_STYLE_SYSTEM = "systeam";

    /* 地址信息所属者 :*/
    public final static String ADDRESS_CLASS_USER = "user";
    public final static String ADDRESS_CLASS_STORE = "store";
    public final static String ADDRESS_CLASS_OPEN = "open";
    public final static String ADDRESS_CLASS_HOME = "home";
    public final static String ADDRESS_CLASS_SCHOOL = "school";


    /* 消息类 :*/
    public final static String MESSAGE_SENDER_SYSTEM = "system";
    public final static String SYSTEM_SEND_MESSAGE = "system_send_messge";
    public final static String USER_SEND_MESSAGE = "user_send_messge";
    public final static String FRIEND_SEND_MESSAGE = "friend_send_messge";
    public final static String TEAM_SEND_MESSAGE = "team_send_messge";
    public final static String CLUB_SEND_MESSAGE = "club_send_messge";

    /* 配置类 :*/
    public final static int CONFIG_RENAME_CLUB_TIMES = 3;



}
