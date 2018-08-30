package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Role;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Basic.AttackBasic;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Basic.DefenseBasic;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Equip.RoleEquipmentsInfo;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Map.RoleMapInfo;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Skill.RoleSkillsInfo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoleInfo extends RoleBasic {
    private String userId;
    private String teamId;
    private String playerId;
    private String gameId;
    private AttackBasic roleAttack;
    private DefenseBasic roleDefense;
    private RoleSkillsInfo roleSkillsInfo;
    private RoleEquipmentsInfo roleEquipmentInfo;
    private RoleMapInfo roleMapInfo;
}
