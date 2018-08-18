package com.renchaigao.zujuba.mongoDB.info.store.BusinessPart;
import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class BusinessTimeInfo extends BasicObject {
    String timeFrame; //"":;
    String timeDate;
    String startTime;
    String endTime;
}
