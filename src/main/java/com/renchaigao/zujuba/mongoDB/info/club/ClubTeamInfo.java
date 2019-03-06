package com.renchaigao.zujuba.mongoDB.info.club;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ClubTeamInfo extends BasicObject {
    private String teamId = "null"; //队伍id
    private String clubId = "null"; //俱乐部id
    private String teamState = "null"; //局的状态
    private Integer readNumClub = 0; //俱乐部浏览人数
    private Integer refuseNumClub = 0; //俱乐部拒绝人数
    private Integer indeterminacyNumClub = 0; //俱乐部待定人数
    private Integer joinNumClub = 0; //俱乐部加入人数
    private Integer breakNumClub = 0; //俱乐部爽约人数
    private Integer lieNumClub = 0; //俱乐部违约人数
    private Integer lateNumClub = 0; //俱乐部迟到人数
    private Integer readNumUser = 0; //游客浏览人数
    private Integer refuseNumUser = 0; //游客拒绝人数
    private Integer indeterminacyNumUser = 0; //游客待定人数
    private Integer joinNumUser = 0; //游客加入人数
    private Integer breakNumUser = 0; //游客爽约人数
    private Integer lieNumUser = 0; //游客违约人数
    private Integer lateNumUser = 0; //游客迟到人数
}
