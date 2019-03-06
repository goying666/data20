package com.renchaigao.zujuba.mongoDB.info.team;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.message.MessageContent;
import com.renchaigao.zujuba.mongoDB.info.message.MessageNoteInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class TeamMessageInfo extends BasicObject {
    private ArrayList<MessageContent> messageNoteInfoArrayList = new ArrayList<MessageContent>();
    private String placeAdminId;
    private String createId;
    private Long nowNumber = 0L;
    private String messageName;
}
