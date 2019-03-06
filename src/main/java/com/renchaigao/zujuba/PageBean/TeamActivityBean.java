package com.renchaigao.zujuba.PageBean;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/2/24/024.
 */
@Setter
@Getter
public class TeamActivityBean {
    private String teamId; //teamID
    private String teamName; //team的名字
    private String userClass; //浏览者类型
    private String teamState; //队伍状态
    private ArrayList<String> teamPhotoUrlList; //地点图片url + 游戏图片
    private String placeName; //地点名称
    private String distance; //距离我的距离
    private String placeScore; //地点评分
    private String placeRank; //地点名次
    private String startDate; //组局日期
    private String startTime; //组局开始时间
    private String endTime; //结束时间
    private String timeLeft; //组局倒计时
    private String allPlayerNum; //已入局的玩家人数
    private String boyPlayerNum; //已入局的男玩家人数
    private String girlPlayerNum; //已入局的女玩家人数
    private String minPlayer; //组局最小人数
    private String maxPlayer; //组局最大人数
    private ArrayList<CardPlayerInfoBean> playerList = new ArrayList<CardPlayerInfoBean>(); //玩家card的bean信息列表





}
