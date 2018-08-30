package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.World;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Map.GameOneMapInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class GameMapsInfo  extends BasicObject {
    private Integer mapNum;
    private ArrayList<GameOneMapInfo> gameAllMapsList;
}
