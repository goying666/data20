package com.renchaigao.zujuba.TaskFlow;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point extends BasicObject{

    private Boolean isSonPoin = false; //是否有父节点
    private String fatherPoinId = "null"; //父节点ID
    private String state = "null"; //节点状态
    private String upPoin = "null"; //上级节点
    private String nextPoin = "null"; //下级节点
    private String flowId = "null"; //流Id
    private String flowName = "null"; //流名称
    private String taskId = "null"; //task拥有者
    private String taskName = "null"; //task名称
    private String isBeginPoint = "null"; //是否是终结节点
    private String isEndPoint = "null"; //是否是起始节点
    private String customerId = "null"; //节点消费者Id
    private String customerName = "null"; //消费者名称
    private String customerIP = "null"; //消费者IP
    private String cutstomerTAG = "null"; //消费者定位标识
    private Integer customerTryTimes = 0; //消费者尝试次数
    private Integer customerWorngTimes = 0; //消费者消费错误次数
    private Integer woringLimit = 0; //消费错误次数限制
    private String redisId = "null"; //redisId
    private String DBId = "null"; //数据库Id
    private String upTimeLong = "null"; //更新时间Long型
    private String number = "null"; //节点序号：表明该节点在流中的第几位
    private String content = "null"; //节点数据备份

}
