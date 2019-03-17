package com.renchaigao.zujuba.mongoDB.info.user;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class UserTeams extends BasicObject {
    private ArrayList<String> allTeamsList = new ArrayList<String>();
    private ArrayList<String> doingTeamsList = new ArrayList<String>();
    private ArrayList<String> finishTeamsList = new ArrayList<String>();
    private ArrayList<String> createTeamsList = new ArrayList<String>();
}
