package com.renchaigao.zujuba.mongoDB.info.shopping;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter
@Setter
public class ShoppingInfo extends BasicObject {
    private String  shopId;
    private String  userId;
    private String  goodsId;
    /*   state："购物状态：
        “X”：已下单，等待支付；
        “Z”：已支付，等待使用；
        ”ST“：申请退款，进入退款流程，随时可撤销；
        ”YT“：已退款，等待完结；
        ”FT“：退款失败，进入异常流程；
        “S”：已使用，等待评价；
        “P”：已评价，等待完结；
        ”F“：已完结；"    */
    private String  state;
    private String  happenTime;//发生时间
    private Integer  money=0;
    private ArrayList<ShoppingFlow> shoppingFlows;//过程流
}
