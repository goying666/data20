package com.renchaigao.zujuba.mongoDB.info;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.dao.UserOpenInfo;
import lombok.Getter;
import lombok.Setter;
import normal.dateUse;

@Setter
@Getter
public class PlayerInfo extends BasicObject {
    private String homeOwner; //player:玩家;  owner:房主;

    private Integer distance = 0;

    private String state;
    /*******************************
     * """WAITING"":等待审批环节;
     * ""READY"":审批通过，准备环节;
     * ""ARRIVALS"":玩家已到场;
     * ""GAME"":游戏环节;
     * ""END"":结束;"
     ******************************/
    private String comeFrom;
    /*******************************
       ""T"":正常组队;
       ""L"":（游戏开始后）临时进入;
       ""S"":（游戏开始后）系统推荐;
     *******************************/
    private String joinTime = dateUse.GetStringDateNow();

    private UserOpenInfo userOpenInfo = new UserOpenInfo();

    private  Integer playerNumber;

}
