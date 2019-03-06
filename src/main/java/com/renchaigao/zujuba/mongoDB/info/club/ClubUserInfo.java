package com.renchaigao.zujuba.mongoDB.info.club;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ClubUserInfo extends BasicObject {
    private String userId = "null"; //用户的id
    private String clubId = "null"; //用户所属俱乐部id
    private String role = "null"; //俱乐部角色（creater、manager、user）
    private String activeState = "null"; //活跃度（待开发）
    private String joinTime = "null"; //加入时间
    private Integer readNum = 0; //浏览次数
    private Integer teamTimes = 0; //组局次数
    private Integer refuseTimes = 0; //拒绝次数
    private Integer indeterminacyTimes = 0; //待定次数
    private Integer breakTimes = 0; //爽约次数
    private Integer lieTimes = 0; //违约次数
    private Integer lateTimes = 0; //迟到次数
    private Integer missTimes = 0; //错过次数
    private Boolean shutUp = false; //是否禁言
    private String shutTime = "null"; //禁言截止
    private ArrayList<String> teamIdList = new ArrayList<String>(); //用户参加过的属于俱乐部的team的id

}
