package com.renchaigao.zujuba.mongoDB.info.game.DeepForest;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SettleBasic extends BasicObject {
    private String ownerNum;
    private String settle;
    private String starNum;
    private Integer spend;
    private String result;
    private StarInfo starInfo;
}
