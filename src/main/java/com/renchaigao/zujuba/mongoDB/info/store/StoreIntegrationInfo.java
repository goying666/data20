package com.renchaigao.zujuba.mongoDB.info.store;
import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreIntegrationInfo extends BasicObject{
    private Integer startNum=1;//星级
    private Integer vitality=0;//活跃度
    private Integer credit=0;//信誉度
    private Integer team=0;//组局度
    private Integer game=0;//游戏度
    private Integer activity=0;//活动度
    private Integer allInter=0;//总度
    private Integer service=0;//服务度
    private String instruction="";//说明
}
