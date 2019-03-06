package com.renchaigao.zujuba.mongoDB.info.store.BusinessPart;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;
import normal.dateUse;

@Getter
@Setter
public class BusinessTimeInfo extends BasicObject {
    String timeFrame = "ZS"; //"ZS":早 ，"ZW":"WS":;
    String timeDate = dateUse.getTodayDate();
    String startTime = "0";
    String endTime = "0";
    int startHour = 0;
    int startMinute = 0;
    int endHour = 0;
    int endMinute = 0;
    int weekDay = 0;

}
