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

    private String addressOwnerClass;//“user”：用户；“store”：店铺；
}
