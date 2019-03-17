package com.renchaigao.zujuba.mongoDB.info.user;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class UserPlaces extends BasicObject {

    private ArrayList<String> allPlaceId = new ArrayList<String>();

}
