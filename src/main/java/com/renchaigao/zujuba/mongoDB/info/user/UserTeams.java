package com.renchaigao.zujuba.mongoDB.info.user;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class UserTeams extends BasicObject {
    private ArrayList<String> allTeamsList;
    private ArrayList<String> doingTeamsList;
    private ArrayList<String> finishTeamsList;
    private ArrayList<String> createTeamsList;
}
