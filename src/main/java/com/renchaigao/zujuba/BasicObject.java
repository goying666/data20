package com.renchaigao.zujuba;

import lombok.Getter;
import lombok.Setter;
import normal.UUIDUtil;
import normal.dateUse;


@Getter
@Setter
public class BasicObject {
    private String id = UUIDUtil.getUUID();
    private Boolean deleteStyle = false;
    private String upTime = dateUse.GetStringDateNow();
    private String createTime = dateUse.GetStringDateNow();
}
