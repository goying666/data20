package com.renchaigao.zujuba.mongoDB.info.store.BusinessPart;
import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;
import normal.dateUse;

import java.util.ArrayList;

@Getter
@Setter
public class DayBusinessInfo extends BasicObject {
    private String dayDate = dateUse.getTodayDate();;//当天日期；
    private ArrayList<BusinessTimeInfo> businessTimes;
    private Integer allTimeSum;//当天天共营业几个小时；

}
