package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Map;
import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MapBasic extends BasicObject{
    private String imagePath;
    private String name;
    private String effect;
    private String form;
    private String grade;
    private String introduce;
}
