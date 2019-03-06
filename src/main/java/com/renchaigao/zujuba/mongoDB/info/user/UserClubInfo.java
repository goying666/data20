package com.renchaigao.zujuba.mongoDB.info.user;


import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class UserClubInfo extends BasicObject{
    private String userId = "null"; //用户的userId
    private ArrayList<String> clubIdList = new ArrayList<String>(); //clubId list
    private ArrayList<String> myClubList = new ArrayList<String>(); //myClubList

}
