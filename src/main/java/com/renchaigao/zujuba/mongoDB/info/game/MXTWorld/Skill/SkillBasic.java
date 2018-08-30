package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Skill;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.ConsumeInfo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SkillBasic extends BasicObject {
    private String imagePath;
    private String name;
    private String effect;
    private String form;
    private String grade;
    private String introduce;
    private ConsumeInfo skillConsumeInfo = new ConsumeInfo();
    private String limiting;
}
