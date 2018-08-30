package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Map;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class RoleMapInfo extends BasicObject {
    private ArrayList<GameOneMapInfo> knowMapList;
    private ArrayList<GameOneMapInfo> unknowMapList;
    private GameOneMapInfo currentMapInfo;
    private RoleMapTeamInfo roleMapTeamInfo;
    private String state;
    private String roleId;
}
