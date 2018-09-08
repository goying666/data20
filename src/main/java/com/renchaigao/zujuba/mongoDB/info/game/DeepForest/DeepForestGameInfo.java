package com.renchaigao.zujuba.mongoDB.info.game.DeepForest;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class DeepForestGameInfo extends BasicObject {
    private String era;
    private Integer round;
    private String roundIntroduce;
    private Integer countDown;

    private ArrayList<StarInfo> allStarInfo;
    private ArrayList<CivilizationInfo> allCivilizationInfo;
    private ArrayList<MessageInfo> allMessageInfo;
    private ArrayList<SettleInfo> allSettleInfo;

}
