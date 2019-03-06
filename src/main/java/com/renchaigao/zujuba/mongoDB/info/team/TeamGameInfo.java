package com.renchaigao.zujuba.mongoDB.info.team;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.dao.GameBasic;
import com.renchaigao.zujuba.mongoDB.info.game.gameInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class TeamGameInfo extends BasicObject {
    private boolean select_LRS = false;
    private boolean select_THQBY = false;
    private boolean select_MXTSJ = false;
    private ArrayList<GameBasic> GameBasicList = new ArrayList<GameBasic>();
    private ArrayList<gameInfo> teamGameList = new ArrayList<gameInfo>();


}
