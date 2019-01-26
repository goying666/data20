package com.renchaigao.zujuba.mongoDB.info.team;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.PlayerInfo;
import com.renchaigao.zujuba.mongoDB.info.PlayersInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class TeamPlayerInfo extends BasicObject {
    private String teamId;
    private ArrayList<PlayerInfo> playerArrayList;
    private Integer boySum = 0;
    private Integer girlSum = 0;
    private Integer watingSum = 1;
    private Integer readySum = 1;
    private Integer gameSum = 1;
    private Integer missSum = 1;
}
