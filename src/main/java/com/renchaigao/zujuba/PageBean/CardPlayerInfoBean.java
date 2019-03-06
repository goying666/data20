package com.renchaigao.zujuba.PageBean;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2019/2/24/024.
 */
@Setter
@Getter
public class CardPlayerInfoBean {
    private String imageUrl; //头像url
    private String gender; //男女（默认无）
    private String nickName; //昵称
    private String teamTimes; //组局次数
    private String gameTimes; //游戏次数
    private String ageFlag; //年龄段
    private String teamState; //状态
    private String userNote; //简介

}
