package com.renchaigao.zujuba.mongoDB.info.message;

import lombok.Getter;
import lombok.Setter;

import static com.renchaigao.zujuba.PropertiesConfig.ConstantManagement.SYSTEM_SEND_MESSAGE;

@Getter
@Setter
public class SystemMessages extends MessageContent{
    SystemMessages(){
        this.setMessageClass(SYSTEM_SEND_MESSAGE);
    }
}
