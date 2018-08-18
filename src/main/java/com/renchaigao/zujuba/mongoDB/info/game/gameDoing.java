package com.renchaigao.zujuba.mongoDB.info.game;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class gameDoing extends BasicObject {
    private String startTime;
    private String endTime;
    private String state;
    private String nowPlayerId;


}
