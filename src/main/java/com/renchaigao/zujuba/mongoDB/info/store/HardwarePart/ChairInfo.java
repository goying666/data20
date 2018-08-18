package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;
import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ChairInfo extends BasicObject {
    private ArrayList<Photo> chairAllPhotos;
    private String instruction="";
    private String chairClass="";
}
