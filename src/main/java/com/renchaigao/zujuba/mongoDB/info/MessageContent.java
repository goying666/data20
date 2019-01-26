package com.renchaigao.zujuba.mongoDB.info;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;
import normal.dateUse;

@Getter
@Setter
public class MessageContent  {
    private Long id;
    private Boolean deleteStyle = false;
    private String upTime = dateUse.GetStringDateNow();
    private Boolean isGroup;
    private String senderId;
    private String content;
    private Long sendTime;
    private Boolean isReceived;
    private Integer senderImageUrl;
    private Integer myImageUrl;
    private String teamId;
}
