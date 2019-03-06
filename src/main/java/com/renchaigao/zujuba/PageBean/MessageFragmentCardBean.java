package com.renchaigao.zujuba.PageBean;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/2/24/024.
 */
@Setter
@Getter
public class MessageFragmentCardBean {
    private ArrayList<CardMessageFragmentTipBean> allMessageTips = new ArrayList<CardMessageFragmentTipBean>(); //所有消息tip的bean
    private Integer allNoRead = 0; //所有未读消息数

}
