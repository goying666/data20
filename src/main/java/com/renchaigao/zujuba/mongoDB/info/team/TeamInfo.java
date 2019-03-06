package com.renchaigao.zujuba.mongoDB.info.team;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.AddressInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamInfo extends BasicObject {

    private String teamNumber;
    private Integer playerMax;
    private Integer playerMin;
    private Integer playerNow;
    private String startDate;
    private String startTime;
    private String startAllTime;
    private String endTime;
    private String createrStyle; //创建方式；"user"
    private String createrNote;
    private String state;
    private String teamName;
    private String placeName;
    private String createrId;
    private String joinCode = null;//加入密码

    private Integer startHour;
    private Integer startMinute;
    private Integer endHour;
    private Integer endMinute;



    private AddressInfo addressInfo = new AddressInfo();
    private TeamPlayerInfo teamPlayerInfo = new TeamPlayerInfo();
    private TeamGameInfo teamGameInfo = new TeamGameInfo();
    private TeamSpendInfo teamSpendInfo = new TeamSpendInfo();
    private TeamFilterInfo teamFilterInfo = new TeamFilterInfo();
    private TeamMessageInfo teamMessageInfo = new TeamMessageInfo();

}
