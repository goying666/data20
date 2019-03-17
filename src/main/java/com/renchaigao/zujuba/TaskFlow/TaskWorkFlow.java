package com.renchaigao.zujuba.TaskFlow;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class TaskWorkFlow extends BasicObject{

    private String name = "null"; //任务名称
    private String taskTAG = "null"; //任务标识
    private String state = "null"; //任务状态
    private String upTimeLong = "null"; //更新时间Long型
    private String redisId = "null"; //redisId
    private String DBId = "null"; //数据库Id
    private ArrayList<String> flowList = new ArrayList<String>(); //所有flow的List
    private Integer maxTime = 0; //预计完成时间

}
