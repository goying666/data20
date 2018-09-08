package com.renchaigao.zujuba.mongoDB.info.game.DeepForest;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MessageInfo extends BasicObject {
    private String ownerId;
    private String happenTime;
    private String level;
    private String starNum;
    private String starName;
    private String starImagePath;
    private String userNum;
    private String technologyValue;
    private String defenceValue;
    private String civilizationName;

}
