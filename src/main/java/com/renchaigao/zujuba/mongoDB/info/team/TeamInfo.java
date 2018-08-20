package com.renchaigao.zujuba.mongoDB.info.team;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.AddressInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamInfo extends BasicObject {

    private String teamNumber;

    private Integer playerMax;

    private Integer playerMin;

    private Integer playerNow;

    private String createTime;

    private String startDate;

    private String startTime;

    private String endTime;

    private String createrStyle; //创建方式；"user"

    private String createrNote;

    private String state;

    private String teamName;

    private String createrId;

    private AddressInfo addressInfo = new AddressInfo();
    private teamPlayerInfo teamPlayerInfo = new teamPlayerInfo();
    private teamGameInfo teamGameInfo = new teamGameInfo();
    private teamSpendInfo teamSpendInfo = new teamSpendInfo();
    private teamFilterInfo teamFilterInfo = new teamFilterInfo();
    private teamMessageInfo teamMessageInfo = new teamMessageInfo();

}
