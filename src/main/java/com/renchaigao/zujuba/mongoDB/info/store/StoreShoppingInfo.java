package com.renchaigao.zujuba.mongoDB.info.store;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.shopping.ShoppingFlow;
import com.renchaigao.zujuba.mongoDB.info.shopping.ShoppingInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class StoreShoppingInfo extends BasicObject{
    private ArrayList<ShoppingInfo> shoppingInfos;
    private Integer allSMoney =0;
    private Integer allZMoney=0;
    private Integer averageSpend=0;
}
