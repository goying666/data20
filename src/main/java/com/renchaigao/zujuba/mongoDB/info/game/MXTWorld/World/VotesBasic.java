package com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.World;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.game.MXTWorld.Map.GameOneMapInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class VotesBasic extends BasicObject {
       private String voterId;
       private ArrayList<VoteBasic> roundVote;
       private Integer currentRound;

    public class VoteBasic extends BasicObject{
        private String votedId;
        private Integer normalVoteNumber;
        private Integer moneyVoteNumber;

    }
}
