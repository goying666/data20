package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class DeskInfo extends BasicObject {
    private ArrayList<Photo> deskAllPhotos;
    private String instruction = "";
    private String deskClass = "";
    private String storeDesk = "";
    private Integer maxUserNum = 12;
    private Integer minUserNum = 1;
    private ArrayList<ChairInfo> chairInfos;
}
