package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Award;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AwardBasic extends BasicObject {
    private float probability;
    private Integer friendNum;
    private String grade;
    private String name;
    private String form;
    private String content;
}
