package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Message;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class WorldMessageInfo extends BasicObject {
    private ArrayList<MessageBasic> gameAllMessage;
}
