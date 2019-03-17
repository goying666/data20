package com.renchaigao.zujuba.mongoDB.info.message;

import lombok.Getter;
import lombok.Setter;

import static com.renchaigao.zujuba.PropertiesConfig.ConstantManagement.TEAM_SEND_MESSAGE;

@Getter
@Setter
public class TeamMessages extends MessageContent{
    TeamMessages(){
        this.setMessageClass(TEAM_SEND_MESSAGE);
    }
}
