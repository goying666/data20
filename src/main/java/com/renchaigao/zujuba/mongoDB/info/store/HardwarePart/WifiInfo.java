package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;
import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class WifiInfo extends BasicObject {
    private ArrayList<Photo> wifiAllPhotos;
    private String downloadSpeed;//下载速度
    private String signalStrength;//信号强度；
}
