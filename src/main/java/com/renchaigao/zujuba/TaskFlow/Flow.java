package com.renchaigao.zujuba.TaskFlow;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Flow extends BasicObject{

    private String name = "null"; //流名称
    private ArrayList<String> pointList = new ArrayList<String>(); //所有pontId的list
    private String number = "null"; //当前执行节点
    private String numberId = "null"; //当前执行节点序号
    private String taskId = "null"; //任务TaskId
    private String taskTAG = "null"; //任务TAG
    private String taskName = "null"; //任务名称
    private String state = "null"; //状态
    private String upTimeLong = "null"; //更新时间Long型
    private String redisId = "null"; //redisId
    private String DBId = "null"; //数据库Id
    private String serverName = "null"; //流对应微服务的名称
    private String serverIP = "null"; //流对应微服务的IP
    private String serverTAG = "null"; //流对应微服务的定位标识
    private Integer serverTryTimes = 0; //流对应微服务的尝试次数
    private Integer serverWorngTimes = 0; //流对应微服务的消费错误次数
    private Integer woringLimit = 0; //当前消费错误次数限制

}
