package com.renchaigao.zujuba.mongoDB.info.store.HardwarePart;
import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SignalInfo extends BasicObject {
    private Boolean YD_signal=true;
    private String YD_Strength="HIGH";
    private Boolean LT_signal=true;
    private String LT_Strength="HIGH";
    private Boolean DX_signal=true;
    private String DX_Strength="HIGH";
}
