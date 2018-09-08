package com.renchaigao.zujuba.mongoDB.info.game.DeepForest;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class CivilizationInfo extends BasicObject {
    private Integer number;
    private String name;
    private Integer starNumber;
    private String starName;
    private String active;
    private Integer defenceValue;
    private Integer technologyValue;
    private ArrayList<MessageInfo> ownerMessage;

}
