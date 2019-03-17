package com.renchaigao.zujuba.mongoDB.info.user;

import com.renchaigao.zujuba.BasicObject;
import com.renchaigao.zujuba.mongoDB.info.Photo;
import com.renchaigao.zujuba.mongoDB.info.team.TeamInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class UserPhotosInfo extends BasicObject {
    private ArrayList<Photo> allPhotoArrayList=new ArrayList<Photo>();
    private Photo headPortrait = new Photo();
    private Photo headPortraitBackground = new Photo();
}
