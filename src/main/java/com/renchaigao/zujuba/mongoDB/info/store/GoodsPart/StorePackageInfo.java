package com.renchaigao.zujuba.mongoDB.info.store.GoodsPart;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.store.GoodsPart.Goods;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class StorePackageInfo extends BasicObject{
    private ArrayList<Goods> storeAllGoods;
    private Integer storeAllGoodsSum;
}
