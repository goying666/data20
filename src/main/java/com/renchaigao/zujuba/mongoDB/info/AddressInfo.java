package com.renchaigao.zujuba.mongoDB.info;

import com.renchaigao.zujuba.dao.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressInfo extends Address {
    private Integer distance;
    private Double startLatitude;
    private Double startLongitude;
    private String addressName;
    private String addressOwnerClass;//“user”：用户；“store”：店铺；“open”：公共场所；
    private Integer starValue;
    private float evaluationValue;
    private String selectCityCode;
    private String selectCityName;
}
