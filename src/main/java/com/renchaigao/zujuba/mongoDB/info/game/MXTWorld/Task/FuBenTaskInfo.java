package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Task;
import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Award.AwardInfo;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Basic.AttackBasic;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Basic.DefenseBasic;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.ConsumeInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuBenTaskInfo extends TaskBasic{

    private ConsumeInfo consumeInfo;
    private AwardInfo awardInfo;
    private AttackBasic attackBasic;
    private DefenseBasic defenseBasic;
    private String mapId;
}
