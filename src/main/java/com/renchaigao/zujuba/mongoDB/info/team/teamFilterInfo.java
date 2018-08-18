package com.renchaigao.zujuba.mongoDB.info.team;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class teamFilterInfo extends BasicObject {
    private Integer teamId;

    private String integrityScore;

    private String sexRatio;

    private String careerScreening;

    private String ageScreening;

    private String evaluationScreening;

    private String marriage;
}
