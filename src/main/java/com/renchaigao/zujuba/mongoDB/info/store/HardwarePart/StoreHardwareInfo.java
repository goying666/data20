package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.store.HardwarePart.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class StoreHardwareInfo extends BasicObject {
    private ArrayList<AirConditionerInfo> airConditionerInfos;
    private ArrayList<ChairInfo> chairInfos;
    private ArrayList<DeskInfo> deskInfos;
    private ArrayList<FanInfo> fanInfos;
    private ArrayList<HeatingInfo> heatingInfos;
    private ArrayList<RoomInfo> roomInfos;
    private SignalInfo signalInfo;
    private ArrayList<ToiletInfo> toiletInfos;
    private WifiInfo wifiInfo;
    private Boolean existAir = false;
    private Boolean existHeat= false;
    private Boolean existFan= false;
    private Boolean existRoom= false;
    private Boolean existToilet= false;
    private Boolean existWifi= false;
}
