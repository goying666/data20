package com.renchaigao.zujuba.mongoDB.info.store;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StoreRankInfo extends BasicObject{

    private String storeId ;

    private Integer integral =0;

    private Integer cityIntegralRank=0;

    private Integer provinceIntegralRank=0;

    private Integer countryIntegralRank=0;
}
