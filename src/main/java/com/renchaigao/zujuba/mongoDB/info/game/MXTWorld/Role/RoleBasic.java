package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Role;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Equip.RoleEquipmentsInfo;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Map.RoleMapInfo;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Skill.RoleSkillsInfo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoleBasic extends BasicObject {
    private String name;
    private String roleIntroduce;
    private String roleImagePath;
    private Integer bloodMax;
    private Integer energyMax;
    private Integer powerMax;

}
