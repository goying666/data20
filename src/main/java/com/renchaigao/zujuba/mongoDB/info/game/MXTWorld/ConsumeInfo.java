package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsumeInfo extends BasicObject{

    private String form;
    private Integer  moneyConsume;
    private Integer  powerConsume;
    private Integer  energyConsume;
    private Integer  bloodConsume;
}
