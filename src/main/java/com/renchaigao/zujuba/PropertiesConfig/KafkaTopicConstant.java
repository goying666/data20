package com.renchaigao.zujuba.PropertiesConfig;

import lombok.Getter;

@Getter
public class KafkaTopicConstant {

    public final static String CREATE_NEW_TEAM = "createNewTeam";

    public final static String USER_JOIN_TEAM = "userJoinTeam";
    public final static String DELETE_TEAM = "deleteTeam";
    public final static String UPDATE_TEAM = "updateTeam";
    public final static String JOIN_TEAM = "joinTeam";
    public final static String CREATE_NEW_CLUB = "createNewClub";

    //    message part


    //    TaskFlow Part
    public final static String TASK_CLUB_CREATE_NEW_CLUB = "taskClubCreateNewClub";


}
