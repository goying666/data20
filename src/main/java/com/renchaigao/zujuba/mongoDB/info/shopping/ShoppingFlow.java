package com.renchaigao.zujuba.mongoDB.info.shopping;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ShoppingFlow extends BasicObject {
    private String beginState;
    private String endState;
    private String time;
    private String note;
}
