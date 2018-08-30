package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Award;


import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class AwardInfo extends BasicObject {

    private String ownerform;
    private ArrayList<AwardBasic> allAwardList;
    private String ownerId;

}
