package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Task;
import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class TaskBasic extends BasicObject{
    private String imagePath;
    private String name;
    private String form;
    private String grade;
    private String introduce;
}
