package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Map;

import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Task.FuBenTaskInfo;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Task.HuntingTaskInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class GameOneMapInfo extends MapBasic {
    private Integer number;
    private String allFunctions;
    private Integer moveIn;
    private Integer moveOut;
    private ArrayList<FuBenTaskInfo> fuBenTaskInfo;
    private ArrayList<HuntingTaskInfo> huntingTaskInfo;
    private String dangerous;
    private Integer friendNum;
//    交易部分
//    特殊部分：停留效果等。
//

}
