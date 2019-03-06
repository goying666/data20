package com.renchaigao.zujuba.mongoDB.info.message;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MessageNoteInfo {
    private Integer id;
    private String messageName;
    private String groupId;//消息组ID；
    private String senderId;//0代表自己；
    private String notesInfo;//消息内容；
    private Long sendTime;//发送时间；
    private String state;
    private Integer unreadMessageSum;//消息数
    private String currentContent;//当前最后一条消息；
}