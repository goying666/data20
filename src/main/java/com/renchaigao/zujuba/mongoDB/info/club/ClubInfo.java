package com.renchaigao.zujuba.mongoDB.info.club;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ClubInfo extends BasicObject {
    //    =IF(ISBLANK(C6),"",CONCATENATE("private ",D6," ",C6," ",IF(ISBLANK(E6),IF(D6="String","= "&"""null"&"""",IF(D6="Integer","= 0",IF(FIND("ArrayList",D6,1)=1,CONCATENATE("= new ",D6,"()"),""))),CONCATENATE("= ",E6)),"; //",F6))
    private String createrId = "null"; //创建者ID
    private Integer boyNum = 0; //男生数量
    private Integer girlNum = 0; //女生数量
    private Integer allPeopleNum = 0; //总人数
    private Integer activitiesNum = 0; //活动次数
    private String clubName = "null"; //俱乐部名称
    private Integer renameTimesNow = 0; //名称修改次数
    private Integer renameTimesLimit = 0; //修改次数上限
    private ArrayList<String> teamIdList = new ArrayList<String>(); //活动id的list
    private ArrayList<String> userIdList = new ArrayList<String>(); //用户id的list
    private ArrayList<String> doingTeamIdList = new ArrayList<String>(); //正在进行的活动idList
    private ArrayList<String> closeTeamIdList = new ArrayList<String>(); //已完成的活动idList
}
