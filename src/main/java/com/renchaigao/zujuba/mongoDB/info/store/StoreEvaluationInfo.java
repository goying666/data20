package com.renchaigao.zujuba.mongoDB.info.store;
import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Evaluation;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class StoreEvaluationInfo extends BasicObject {

    private ArrayList<Evaluation> storeAllEvaluations;
    private Integer storeAllEvaluationsNum = 0;
    private Integer storeScore = 0;
}