package com.renchaigao.zujuba.PageBean;


import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2019/2/24/024.
 */
@Setter
@Getter
public class CardClubFragmentTipBean extends BasicObject{

    private String clubId; //俱乐部Id
    private String clubName; //俱乐部名称
    private String placeName; //俱乐部场地名
    private String whoAmI; //对应身份
    private String allPeopleNum; //人数
    private String activitiesNum; //活动次数

}
