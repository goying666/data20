package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Skill;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class RoleSkillsInfo extends BasicObject {

    private ArrayList<SkillBasic> allSkillsInfo;
    private ArrayList<SkillBasic> allAttackSkillsInfo;
    private ArrayList<SkillBasic> allDefenseSkillsInfo;
    private ArrayList<SkillBasic> allEffectSkillsInfo;
    private ArrayList<SkillBasic> allOtherSkillsInfo;
}
