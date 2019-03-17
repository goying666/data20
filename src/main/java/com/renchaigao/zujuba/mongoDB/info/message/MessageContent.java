package com.renchaigao.zujuba.mongoDB.info.message;

import lombok.Getter;
import lombok.Setter;
import normal.UUIDUtil;
import normal.dateUse;

import java.util.ArrayList;

@Getter
@Setter
public class MessageContent {
    private String id = UUIDUtil.getUUID();
    private Boolean deleteStyle = false;
    private String upTime = dateUse.GetStringDateNow();
    private Long idLong = 0L; //Long型的id
    private Boolean isMe = false; //判断是否是我发送的
    private Boolean isGroup = false; //判断是否是俱乐部
    private String senderId = "null"; //发送者的ID
    private String title = "null"; //消息抬头
    private String content = "null"; //消息内容
    private String gotoId = "null"; //
    private Long sendTime = 0L; //发送数据时的毫秒时间
    private Boolean isReceived = false; //是否接收到
    private String senderImageUrl = "null"; //发送者的imge地址
    private String myImageUrl = "null"; //我自己的image地址
    private String teamId = "null"; //组队编号
    private String friendId = "null"; //好友id
    private String messageClass = "null"; //消息类型
    private String userId = "null"; //用户id：本人
    private String clubId = "null"; //俱乐部编号
    private String classId = "null"; //类型编号（同各id:team/club/friend）
    private ArrayList<String> readList = new ArrayList<String>(); //消息可读取者list

}
