package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Message;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MessageBasic extends BasicObject {
    private String happenTime;
    private String address;
    private String userName;
    private String things;
    private String notePart;
    private Integer currentRound;

}
