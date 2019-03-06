package com.renchaigao.zujuba.mongoDB.info.store.BusinessPart;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;
import normal.dateUse;

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
//
//    @Getter
//    @Setter
//    public class BusinessTimeInfo extends BasicObject {
//        String timeFrame = "ZS"; //"ZS":早 ，"ZW":"WS":;
//        String timeDate = dateUse.getTodayDate();
//        String startTime = "0";
//        String endTime = "0";
//    }
//
//    @Getter
//    @Setter
//    public class DayBusinessInfo extends BasicObject {
//        private String dayDate = dateUse.getTodayDate();;//当天日期；
//        private ArrayList<BusinessTimeInfo> businessTimes;
//        private Integer allTimeSum;//当天天共营业几个小时；
//
//    }

}
