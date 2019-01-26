package com.renchaigao.zujuba.mongoDB.info;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupMessages extends BasicObject {

    private String groupId;
    private String senderId;
    private String content;
    private Long sendTime;
}
