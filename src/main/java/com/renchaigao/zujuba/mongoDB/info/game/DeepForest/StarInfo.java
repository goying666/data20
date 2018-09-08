package com.renchaigao.zujuba.mongoDB.info.game.DeepForest;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StarInfo extends BasicObject {
    private Integer number;
    private String name;
    private Boolean destroy;
    //    civilizationInfo
//            moveInfo
    private String imagePath;

}
