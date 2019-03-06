package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import com.renchaigao.zujuba.mongoDB.info.store.HardwarePart.*;
import com.renchaigao.zujuba.mongoDB.info.store.StoreInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class StoreHardwareInfo extends BasicObject {
    private ArrayList<AirConditionerInfo> airConditionerInfos = new ArrayList<AirConditionerInfo>();
    private ArrayList<ChairInfo> chairInfos = new ArrayList<ChairInfo>();
    private ArrayList<DeskInfo> deskInfos = new ArrayList<DeskInfo>();
    private ArrayList<FanInfo> fanInfos = new ArrayList<FanInfo>();
    private ArrayList<HeatingInfo> heatingInfos = new ArrayList<HeatingInfo>();
    private ArrayList<RoomInfo> roomInfos = new ArrayList<RoomInfo>();
    private SignalInfo signalInfo = new SignalInfo();
    private ArrayList<ToiletInfo> toiletInfos = new ArrayList<ToiletInfo>();
    private WifiInfo wifiInfo = new WifiInfo();
    private Boolean existAir = false;
    private Boolean existHeat = false;
    private Boolean existFan = false;
    private Boolean existRoom = false;
    private Boolean existToilet = false;
    private Boolean existWifi = false;

}
