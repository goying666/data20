package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ToiletInfo extends BasicObject {
    private ArrayList<Photo> toiletAllPhotos;
    private String instruction;//店家对厕所的备注说明；
}
