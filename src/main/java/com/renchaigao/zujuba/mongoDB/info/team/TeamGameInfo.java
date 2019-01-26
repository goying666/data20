package com.renchaigao.zujuba.mongoDB.info.team;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.gameInfo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamGameInfo extends gameInfo {
    private boolean select_LRS = false;
    private boolean select_THQBY = false;
    private boolean select_MXTSJ = false;

}
