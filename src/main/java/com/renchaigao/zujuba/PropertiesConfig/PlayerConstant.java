package com.renchaigao.zujuba.PropertiesConfig;

import lombok.Getter;

@Getter
public class PlayerConstant {

    public final static String[] PLAYER_ROLE = {"creater", "user", "admin"};
    public final static String PLAYER_ROLE_CREATER = "CREATER";
    public final static String PLAYER_ROLE_USER = "USER";
    public final static String PLAYER_ROLE_PLACE_ADMIN = "PLACE_ADMIN";

    public final static String[] PLAYER_STATE = {"WAITING", "READY", "ARRIVALS", "GAME", "QUIT", "FINISH"};
    public final static String PLAYER_STATE_WAITING = "WAITING";
    public final static String PLAYER_STATE_READY = "READY";
    public final static String PLAYER_STATE_ARRIVALS = "ARRIVALS";
    public final static String PLAYER_STATE_GAME = "GAME";
    public final static String PLAYER_STATE_QUIT = "QUIT";
    public final static String PLAYER_STATE_FINISH = "FINISH";

    public final static String PLAYER_COME_FROM_TEAMJOIN = "TEAMJOIN";
    public final static String PLAYER_COME_FROM_OFFLINE = "OFFLINE";
    public final static String PLAYER_COME_FROM_INVITE = "INVITE";


}
