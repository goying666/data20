package com.renchaigao.zujuba.mongoDB.info.store;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.team.TeamInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class StoreTeamInfo extends BasicObject {
    private Integer allTeamsTimes = 0;//总次数
    private Integer allUsersNum = 0;//总人数
    private ArrayList<TeamInfo> storeAllTeamInfoArrayList;
    private Integer todayPeople = 0;
    private Integer todayDesk = 0;

}
