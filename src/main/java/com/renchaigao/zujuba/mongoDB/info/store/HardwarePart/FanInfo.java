package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;
import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class FanInfo extends BasicObject {
    private ArrayList<Photo> fanAllPhotos;
    private String instruction="";
}