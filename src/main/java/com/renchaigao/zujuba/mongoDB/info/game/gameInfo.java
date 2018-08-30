package com.renchaigao.zujuba.mongoDB.info.game;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.dao.GameBasic;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class gameInfo extends BasicObject {
    private String teamId;
    private ArrayList<GameBasic> gameBasicArrayList;
    private Integer gameNum = 0;
    private String nowGameDoingId;
    private ArrayList<gameDoing> gameDoingArrayList;
    private String startTime;
    private String endTime;
    private String state = "WAIT";//"WAIT":等待；"INIT":初始化完毕;“DOING”：进行；“STOP”：暂停；“FINISH”：完结；
    private String buildStyle;//创建方式；
    private String gameDataId;
}
