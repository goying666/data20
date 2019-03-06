package com.renchaigao.zujuba.mongoDB.info.team;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamFilterInfo extends BasicObject {
    private Integer teamId;

    private Integer integrityScore;

    private Integer genderRatio;

    private Integer careerScreening;

    private Integer ageScreening;

    private Integer evaluationScreening;

    private Integer marriage;

    private Integer settleWay;
}
