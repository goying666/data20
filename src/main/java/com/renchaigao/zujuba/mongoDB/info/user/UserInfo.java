package com.renchaigao.zujuba.mongoDB.info.user;

import com.renchaigao.zujuba.dao.User;
import com.renchaigao.zujuba.dao.UserOpenInfo;
import com.renchaigao.zujuba.dao.UserRank;
import com.renchaigao.zujuba.mongoDB.info.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserInfo extends User {

    private myTeamsInfo myTeamsInfo;
    private myPlayGamesInfo myPlayGamesInfo;
    private myStoresInfo myStoresInfo;
    private Photo myPhotoInfo;
    private AddressInfo myAddressInfo;
    private userSpendInfo mySpendInfo;
    private UserRank myRankInfo;
    private userFriendInfo myFreiendInfo;
//    private ; //积分信息
//    private ; //名单信息
    private userPermissionInfo myPermissionInfo;
    private UserOpenInfo userOpenInfo;


}
