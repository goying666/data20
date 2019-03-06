package com.renchaigao.zujuba.PageBean;


import com.renchaigao.zujuba.mongoDB.info.message.MessageContent;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/2/24/024.
 */
@Setter
@Getter
public class MessageInfoActivityBean {
    private String teamId; //teamID
    private String messageName; //聊天室名字
    private ArrayList<MessageContent> contentList; //聊天内容
    private String createId; //创建者id
    private String placeAdminId; //地点管理者id
    private Long lastContentId; //最后一条消息的id

}
