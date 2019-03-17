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
    private String teamId = "null"; //teamID
    private String teamName = "null"; //team的名字
    private String userClass = "null"; //浏览者类型
    private String teamState = "null"; //队伍状态
    private ArrayList<String> teamPhotoUrlList = new ArrayList<String>(); //地点图片url + 游戏图片
    private String placeName = "null"; //地点名称
    private String distance = "null"; //距离我的距离
    private String placeScore = "null"; //地点评分
    private String placeRank = "null"; //地点名次
    private String startDate = "null"; //组局日期
    private String startTime = "null"; //组局开始时间
    private String endTime = "null"; //结束时间
    private String timeLeft = "null"; //组局倒计时
    private String allPlayerNum = "null"; //已入局的玩家人数
    private String boyPlayerNum = "null"; //已入局的男玩家人数
    private String girlPlayerNum = "null"; //已入局的女玩家人数
    private String minPlayer = "null"; //组局最小人数
    private String maxPlayer = "null"; //组局最大人数
    private ArrayList<CardPlayerInfoBean> playerList = new ArrayList<CardPlayerInfoBean>(); //玩家card的bean信息列表
    private String mainGame = "null"; //主要游戏

}
