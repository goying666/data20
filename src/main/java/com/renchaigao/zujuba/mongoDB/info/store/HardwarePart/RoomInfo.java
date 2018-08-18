package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class RoomInfo extends BasicObject{
    private ArrayList<Photo> heatingAllPhotos;
    private String instruction;
    private ArrayList<DeskInfo> deskInfos;
    private ArrayList<HeatingInfo> heatingInfos;
    private ArrayList<AirConditionerInfo> airConditionerInfos;
    private ArrayList<FanInfo> fanInfos;
    private ArrayList<ToiletInfo> toiletInfos;
    private WifiInfo wifiInfo;
    private Boolean SMOKE = false;
    private String smokeAlar;//烟雾报警；
    private SignalInfo signalInfo;
}
