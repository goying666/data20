package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.World;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Message.WorldMessageInfo;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Role.RoleInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class MxtWorldGameDoingData extends BasicObject {
    private Integer roleSum;
    private String gameState;
    private ArrayList<RoleInfo> roleInfoList;
    private ArrayList<WorldMessageInfo> gameWorldMessages;
    private GameMapsInfo worldMaps;
    private Integer currentRound;
    private WorldVoteInfo worldVoteInfo;
    private String roundState;
}
