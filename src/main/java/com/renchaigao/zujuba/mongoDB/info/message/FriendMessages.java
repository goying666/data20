package com.renchaigao.zujuba.mongoDB.info.message;

import lombok.Getter;
import lombok.Setter;

import static com.renchaigao.zujuba.PropertiesConfig.ConstantManagement.FRIEND_SEND_MESSAGE;

@Getter
@Setter
public class FriendMessages extends MessageContent{

   FriendMessages(){
       this.setMessageClass(FRIEND_SEND_MESSAGE);
   }
}
