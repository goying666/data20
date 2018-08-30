package com.renchaigao.zujuba.mongoDB.info.team;

import com.renchaigao.zujuba.mongoDB.info.PlayersInfo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class teamPlayerInfo extends PlayersInfo {

    private String teamId;

}
