package com.renchaigao.zujuba.mongoDB.info;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.dao.Player;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class playersInfo extends BasicObject {
    private ArrayList<PlayerInfo> playerArrayList;
    private Integer boySum = 0;
    private Integer girlSum = 0;
    private Integer watingSum = 1;
    private Integer readySum = 1;
    private Integer gameSum = 1;
    private Integer missSum = 1;
}
