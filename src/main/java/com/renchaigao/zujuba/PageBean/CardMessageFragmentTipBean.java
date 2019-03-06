package com.renchaigao.zujuba.PageBean;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2019/2/24/024.
 */
@Setter
@Getter
public class CardMessageFragmentTipBean {
    private int id;
    private String imageUrl; //图片url
    private String name; //聊天室名称
    private String content; //最后一条内容
    private String time; //最后一条发布时间
    private Integer noRead; //未读信息数
    private String mClass; //消息所属类型
    private String ownerId; //消息所属者id
    private Long lastTime; //最后一条消息发送时间logn型

}
