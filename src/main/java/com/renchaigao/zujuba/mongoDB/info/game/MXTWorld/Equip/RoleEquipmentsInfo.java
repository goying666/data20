package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Equip;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Equip.EquipmentBasic;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class RoleEquipmentsInfo extends BasicObject {
    private ArrayList<EquipmentBasic> BagInfo;
    private ArrayList<EquipmentBasic> EquipmentInfo;
    private ArrayList<EquipmentBasic> TaskEquipInfo;
    private ArrayList<EquipmentBasic> SpendEquipInfo;
    private ArrayList<EquipmentBasic> OtherEquipInfo;
}
