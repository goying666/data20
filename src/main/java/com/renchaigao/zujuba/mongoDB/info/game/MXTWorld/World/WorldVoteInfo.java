package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.World;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class WorldVoteInfo extends BasicObject {
      private String gameId;
      private ArrayList<VotesBasic> allVoteInfos;
      private VotesBasic currentVoteInfo;
}
