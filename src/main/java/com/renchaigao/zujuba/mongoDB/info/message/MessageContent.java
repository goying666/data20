package com.renchaigao.zujuba.mongoDB.info.message;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;
import normal.UUIDUtil;
import normal.dateUse;

@Getter
@Setter
public class MessageContent   {
    private String id = UUIDUtil.getUUID();
    private Boolean deleteStyle = false;
    private String upTime = dateUse.GetStringDateNow();
    private Long idLong;
    private Boolean isMe= false; //判断是否是我发送的
    private Boolean isGroup= false; //判断是否是俱乐部
    private String senderId;
    private String title;
    private String content;
    private String gotoId = null;
    private Long sendTime; //发送数据时的毫秒时间
    private Boolean isReceived= false;
    private String senderImageUrl;
    private String myImageUrl;
    private String teamId;
    private String friendId;//好友id
    private String messageClass;
    private String userId;
}
