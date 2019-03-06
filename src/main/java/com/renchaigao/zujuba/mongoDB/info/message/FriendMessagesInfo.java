package com.renchaigao.zujuba.mongoDB.info.message;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.message.MessageContent;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class FriendMessagesInfo extends BasicObject {
    private String friendId;
    private ArrayList<MessageContent> messageContentArrayList = new ArrayList<MessageContent>();
}
