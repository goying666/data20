package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Map;
import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Basic.AttackBasic;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Basic.DefenseBasic;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleMapTeamInfo extends BasicObject{

    private AttackBasic teamAttack;
    private DefenseBasic teamDefense;
}
