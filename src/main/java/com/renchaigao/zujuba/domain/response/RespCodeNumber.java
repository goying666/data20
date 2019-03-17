package com.renchaigao.zujuba.domain.response;

public class RespCodeNumber {
    //    Normal Part:常用部分
    public static final int SUCCESS = 1000;//成功；
    public static final int FAIL = -1001;//失败；
    public static final int EXCEPTION = -1002;//异常；
    public static final int WRONG = -1003;//错误；

    //    VerCode Part: 验证码部分
    public static final int VERCODE_SUCCESS = 1010;//验证码请求成功；
    public static final int VERCODE_FAIL = -1010;//验证码请求失败；
    public static final int VERCODE_REQUEST_TOO_MUCH = -1011;//验证码请求频繁；
    public static final int VERCODE_BUSY = -1012;//验证码请求繁忙；
    public static final int VERCODE_EXCEPTION = -1013;//验证码请求异常；
    public static final int VERCODE_TIME_OUT = -1014;//验证码请求超时；

    //    login part：登录部分
    public static final int LOGIN_SECRET_SUCCESS = 1020;//密码登录成功；
    public static final int LOGIN_SECRET_FAIL = -1020;//密码登录失败；
    public static final int LOGIN_SECRET_EXCEPTION = -1023;//密码登录异常；
    public static final int LOGIN_SECRET_WRONG = -1021;//密码登录密码错误；

    public static final int LOGIN_AUTO_SUCCESS = 1030;//自动登录成功；
    public static final int LOGIN_AUTO_FAIL = -1030;//自动登录失败；
    public static final int LOGIN_AUTO_EXCEPTION = -1033;//自动登录异常；
    public static final int LOGIN_AUTO_WRONG = -1031;//自动登录信息错误；

    //    signin part：注册部分
    public static final int SIGNIN_SUCCESS = 1040;//注册成功；
    public static final int SIGNIN_FAIL = -1040;//注册失败；
    public static final int SIGNIN_EXCEPTION = -1043;//注册异常；
    public static final int SIGNIN_WRONG = -1041;//注册信息错误；

    //    user update：用户个人信息更新部分
    public static final int SUSER_UPDATE_SUCCESS = 1050;//更新成功；
    public static final int USER_UPDATE_FAIL = -1050;//更新失败；
    public static final int USER_UPDATE_EXCEPTION = -1051;//更新异常；
    public static final int USER_UPDATE_WRONG = -1052;//更新信息错误；
    public static final int USER_UPDATE_INFO_SUCCESS = 1400;//更新个人信息成功
    public static final int USER_UPDATE_INFO_FAIL = -1400;//更新个人信息失败
    public static final int USER_MINE_INFO_SUCCESS = 1401;//查询个人信息（主页）成功
    public static final int USER_MINE_INFO_FAIL = -1401;//查询个人信息（主页）失败


    //    club part:
    public static final int CLUB_UPDATE_SUCCESS = 1060;//更新信息成功;
    public static final int CLUB_UPDATE_FAIL = -1060;//更新信息错误；
    public static final int CLUB_CREATE_SUCCESS = 1300;//创建俱乐部成功
    public static final int CLUB_CREATE_FAIL = -1300;//创建俱乐部失败
    public static final int CLUB_HAD_BEEN_CREATE = -1301;//俱乐部已创建过
    public static final int CLUB_CREATE_LIMIT = -1302;//超过俱乐部数量限制

    //    message part:
    public static final int MESSAGE_USER_GET_ALL_SUCCESS = 1070;//用户查询新消息信息成功
    public static final int MESSAGE_USER_GET_ALL_FAIL = -1070;//用户查询新消息信息失败
    public static final int MESSAGE_USER_GET_ALL_ZERO = -1071;//用户查询新消息信息数为0
    public static final int MESSAGE_USER_GET_TEAM_SUCCESS = 1071;//查询一个Team内的未读消息成功，返回非0条
    public static final int MESSAGE_USER_GET_TEAM_ZERO = -1072;//查询一个Team内的未读消息，返回为0条
    public static final int MESSAGE_USER_GET_TEAM_FAIL = -1073;//查询一个Team内的未读消息失败
    public static final int MESSAGE_USER_GET_CLUB_SUCCESS = 1072;//查询一个Club内的未读消息成功，返回非0条
    public static final int MESSAGE_USER_GET_CLUB_ZERO = -1074;//查询一个Club内的未读消息，返回为0条
    public static final int MESSAGE_USER_GET_CLUB_FAIL = -1075;//查询一个Club内的未读消息失败
    public static final int MESSAGE_USER_GET_FRIEND_SUCCESS = 1073;//查询一个Friend内的未读消息成功，返回非0条
    public static final int MESSAGE_USER_GET_FRIEND_ZERO = -1076;//查询一个Friend内的未读消息，返回为0条
    public static final int MESSAGE_USER_GET_FRIEND_FAIL = -1077;//查询一个Friend内的未读消息失败
    public static final int MESSAGE_ADD_SYSTEM_SUCCESS = 1074;//添加系统消息成功
    public static final int MESSAGE_ADD_SYSTEM_FAIL = -1078;//添加系统消息失败
    public static final int MESSAGE_ADD_TEAM_SUCCESS = 1075;//添加team消息成功
    public static final int MESSAGE_ADD_TEAM_FAIL = -1079;//添加team消息失败
    public static final int MESSAGE_ADD_FRIEND_SUCCESS = 1076;//添加friend消息成功
    public static final int MESSAGE_ADD_FRIEND_FAIL = -1080;//添加friend消息失败
    public static final int MESSAGE_ADD_CLUB_SUCCESS = 1077;//添加club消息成功
    public static final int MESSAGE_ADD_CLUB_FAIL = -1081;//添加club消息失败


    //    Team Part:
    public static final int TEAM_JOIN_SUCCESS = 1202;//加入组局成功
    public static final int TEAM_JOIN_FAIL = -1203;//加入组局失败

}
