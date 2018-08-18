package com.renchaigao.zujuba.mongoDB.info.store.BusinessPart;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.store.BusinessPart.BusinessTimeInfo;
import com.renchaigao.zujuba.mongoDB.info.store.BusinessPart.DayBusinessInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class StoreBusinessInfo extends BasicObject {
    private ArrayList<BusinessTimeInfo> businessTimeInfos;
    private ArrayList<DayBusinessInfo> dayBusinessInfos;
    private Integer allFrameSum = 0;//共几个时段；
    private Integer allDateSum = 0;//总共营业多少天；
    private Integer allTimeSum = 0;//总共营业几个小时；
    private Integer allMoneySum = 0;//总共营业额；
}
