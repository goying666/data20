package com.renchaigao.zujuba.mongoDB.info.store;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class StorePhotoInfo extends BasicObject {
    private ArrayList<Photo> storeAllPhotos;

}
