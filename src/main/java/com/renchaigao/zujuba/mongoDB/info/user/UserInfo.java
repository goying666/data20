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

    private UserRank userRank;
    private UserTeams userTeams;
    private UserGames userGames;
    private UserPlaces userPlaces;
    private UserPhotosInfo userPhotosInfo;
    private AddressInfo addressInfo;
    private UserSpendInfo userSpendInfo;
    private UserMessagesInfo userMessagesInfo;
    private UserFriendInfo userFriendInfo;
    private UserIntegrationInfo userIntegrationInfo;
    private UserPermissionInfo userPermissionInfo;
    private UserOpenInfo userOpenInfo;
}
