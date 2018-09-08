package com.renchaigao.zujuba.mongoDB.info.game.DeepForest;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class SettleInfo extends BasicObject {
    private Integer round;
    private ArrayList<SettleBasic> allSettleBasic;
}
