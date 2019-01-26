package com.renchaigao.zujuba.mongoDB.info;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Photo extends BasicObject {

    private String ownerClass;
    private String ownerId;
    private String photoPath;
    private String photoName;
    private ArrayList<String> pathList;
    private String photoNote;

    private boolean replace =false;
    private String newPhotoId = null;

}
