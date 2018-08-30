
package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Equip;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EquipmentBasic extends BasicObject {
    private String imagePath;
    private String name;
    private String effect;
    private String form;
    private String grade;
    private String introduce;
    private Boolean isUse;
    private Integer price;
    private Integer amount;
    private String limiting;

}
