package com.renchaigao.zujuba.mongoDB.info.message;

import lombok.Getter;
import lombok.Setter;

import static com.renchaigao.zujuba.PropertiesConfig.ConstantManagement.CLUB_SEND_MESSAGE;
import static com.renchaigao.zujuba.PropertiesConfig.ConstantManagement.FRIEND_SEND_MESSAGE;

@Getter
@Setter
public class ClubMessages extends MessageContent{
    ClubMessages(){
        this.setMessageClass(CLUB_SEND_MESSAGE);
    }
}
