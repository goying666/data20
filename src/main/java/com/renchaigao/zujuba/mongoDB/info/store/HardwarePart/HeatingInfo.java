package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;
import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
/* 暖气 */
public class HeatingInfo extends BasicObject {
    private ArrayList<Photo> heatingAllPhotos;
    private String instruction;
    private String startHeatingDate;
    private String endHeatingDate;
}
