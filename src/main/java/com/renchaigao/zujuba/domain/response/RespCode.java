package com.renchaigao.zujuba.domain.response;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum RespCode {
    //    VerCode Part: 验证码部分
    VERCODE_SUCCESS(RespCodeNumber.VERCODE_SUCCESS, "verCode get success"),
    VERCODE_FAIL(RespCodeNumber.VERCODE_FAIL, "验证码请求失败"),
    VERCODE_REQUEST_TOO_MUCH(RespCodeNumber.VERCODE_REQUEST_TOO_MUCH, "验证码请求频繁"),
    VERCODE_BUSY(RespCodeNumber.VERCODE_BUSY, "验证码请求繁忙"),
    VERCODE_EXCEPTION(RespCodeNumber.VERCODE_EXCEPTION, "验证码请求异常"),
    VERCODE_TIME_OUT(RespCodeNumber.VERCODE_TIME_OUT, "验证码请求超时"),

    //    login part：登录部分
    LOGIN_SECRET_SUCCESS(RespCodeNumber.LOGIN_SECRET_SUCCESS, "密码登录成功"),
    LOGIN_SECRET_FAIL(RespCodeNumber.LOGIN_SECRET_FAIL, "密码登录失败"),
    LOGIN_SECRET_EXCEPTION(RespCodeNumber.LOGIN_SECRET_EXCEPTION, "密码登录异常"),
    LOGIN_SECRET_WRONG(RespCodeNumber.LOGIN_SECRET_WRONG, "密码登录密码错误"),

    LOGIN_AUTO_SUCCESS(RespCodeNumber.LOGIN_AUTO_SUCCESS, "自动登录成功"),
    LOGIN_AUTO_FAIL(RespCodeNumber.LOGIN_AUTO_FAIL, "自动登录失败"),
    LOGIN_AUTO_EXCEPTION(RespCodeNumber.LOGIN_AUTO_EXCEPTION, "自动登录异常"),
    LOGIN_AUTO_WRONG(RespCodeNumber.LOGIN_AUTO_WRONG, "自动登录信息错误"),

    /* message part*/
    MESSAGE_USER_GET_ALL_SUCCESS(RespCodeNumber.MESSAGE_USER_GET_ALL_SUCCESS, "用户查询新消息信息成功"),
    MESSAGE_USER_GET_ALL_FAIL(RespCodeNumber.MESSAGE_USER_GET_ALL_FAIL, "用户查询新消息信息失败"),
    MESSAGE_USER_GET_ALL_ZERO(RespCodeNumber.MESSAGE_USER_GET_ALL_ZERO, "用户查询新消息信息数为0"),
    MESSAGE_USER_GET_TEAM_SUCCESS(RespCodeNumber.MESSAGE_USER_GET_TEAM_SUCCESS, "查询一个Team内的未读消息成功，返回非0条"),
    MESSAGE_USER_GET_TEAM_ZERO(RespCodeNumber.MESSAGE_USER_GET_TEAM_ZERO, "查询一个Team内的未读消息，返回为0条"),
    MESSAGE_USER_GET_TEAM_FAIL(RespCodeNumber.MESSAGE_USER_GET_TEAM_FAIL, "查询一个Team内的未读消息失败"),
    MESSAGE_USER_GET_CLUB_SUCCESS(RespCodeNumber.MESSAGE_USER_GET_CLUB_SUCCESS, "查询一个Club内的未读消息成功，返回非0条"),
    MESSAGE_USER_GET_CLUB_ZERO(RespCodeNumber.MESSAGE_USER_GET_CLUB_ZERO, "查询一个Club内的未读消息，返回为0条"),
    MESSAGE_USER_GET_CLUB_FAIL(RespCodeNumber.MESSAGE_USER_GET_CLUB_FAIL, "查询一个Club内的未读消息失败"),
    MESSAGE_USER_GET_FRIEND_SUCCESS(RespCodeNumber.MESSAGE_USER_GET_FRIEND_SUCCESS, "查询一个Friend内的未读消息成功，返回非0条"),
    MESSAGE_USER_GET_FRIEND_ZERO(RespCodeNumber.MESSAGE_USER_GET_FRIEND_ZERO, "查询一个Friend内的未读消息，返回为0条"),
    MESSAGE_USER_GET_FRIEND_FAIL(RespCodeNumber.MESSAGE_USER_GET_FRIEND_FAIL, "查询一个Friend内的未读消息失败"),
    MESSAGE_ADD_SYSTEM_SUCCESS(RespCodeNumber.MESSAGE_ADD_SYSTEM_SUCCESS, "添加系统消息成功"),
    MESSAGE_ADD_SYSTEM_FAIL(RespCodeNumber.MESSAGE_ADD_SYSTEM_FAIL, "添加系统消息失败"),
    MESSAGE_ADD_TEAM_SUCCESS(RespCodeNumber.MESSAGE_ADD_TEAM_SUCCESS, "添加team消息成功"),
    MESSAGE_ADD_TEAM_FAIL(RespCodeNumber.MESSAGE_ADD_TEAM_FAIL, "添加team消息失败"),
    MESSAGE_ADD_FRIEND_SUCCESS(RespCodeNumber.MESSAGE_ADD_FRIEND_SUCCESS, "添加friend消息成功"),
    MESSAGE_ADD_FRIEND_FAIL(RespCodeNumber.MESSAGE_ADD_FRIEND_FAIL, "添加friend消息失败"),
    MESSAGE_ADD_CLUB_SUCCESS(RespCodeNumber.MESSAGE_ADD_CLUB_SUCCESS, "添加club消息成功"),
    MESSAGE_ADD_CLUB_FAIL(RespCodeNumber.MESSAGE_ADD_CLUB_FAIL, "添加club消息失败"),

    //    signin part：注册部分
    SIGNIN_SUCCESS(RespCodeNumber.SIGNIN_SUCCESS, "注册成功"),
    SIGNIN_FAIL(RespCodeNumber.SIGNIN_FAIL, "注册失败"),
    SIGNIN_EXCEPTION(RespCodeNumber.SIGNIN_EXCEPTION, "注册异常"),
    SIGNIN_WRONG(RespCodeNumber.SIGNIN_WRONG, "注册信息错误"),

    //    Normal Part:常用部分
    SUCCESS(RespCodeNumber.SUCCESS, "成功"),
    FAIL(RespCodeNumber.FAIL, "失败"),
    EXCEPTION(RespCodeNumber.EXCEPTION, "异常"),
    WRONG(RespCodeNumber.WRONG, "错误"),

    //    user update：用户个人信息更新部分
    SUSER_UPDATE_SUCCESS(RespCodeNumber.SUSER_UPDATE_SUCCESS, "更新成功"),
    USER_UPDATE_FAIL(RespCodeNumber.USER_UPDATE_FAIL, "更新失败"),
    USER_UPDATE_EXCEPTION(RespCodeNumber.USER_UPDATE_EXCEPTION, "更新异常"),
    USER_UPDATE_WRONG(RespCodeNumber.USER_UPDATE_WRONG, "更新信息错误"),
    USER_UPDATE_INFO_SUCCESS(RespCodeNumber.USER_UPDATE_INFO_SUCCESS, "更新个人信息成功"),
    USER_UPDATE_INFO_FAIL(RespCodeNumber.USER_UPDATE_INFO_FAIL, "更新个人信息失败"),
    USER_MINE_INFO_SUCCESS(RespCodeNumber.USER_MINE_INFO_SUCCESS, "查询个人信息（主页）成功"),
    USER_MINE_INFO_FAIL(RespCodeNumber.USER_MINE_INFO_FAIL, "查询个人信息（主页）失败"),

    //    club part:
    CLUB_UPDATE_SUCCESS(RespCodeNumber.CLUB_UPDATE_SUCCESS, "更新信息成功"),
    CLUB_UPDATE_FAIL(RespCodeNumber.CLUB_UPDATE_FAIL, "更新信息错误"),
    CLUB_CREATE_SUCCESS(RespCodeNumber.CLUB_CREATE_SUCCESS, "创建俱乐部成功"),
    CLUB_CREATE_FAIL(RespCodeNumber.CLUB_CREATE_FAIL, "创建俱乐部失败"),
    CLUB_HAD_BEEN_CREATE(RespCodeNumber.CLUB_HAD_BEEN_CREATE, "俱乐部已创建过"),
    CLUB_CREATE_LIMIT(RespCodeNumber.CLUB_CREATE_LIMIT, "超过俱乐部数量限制"),

    UPDATEUSERINFOSUCCESS(1002, "Update userinfo success"),

    /* normal part*/
    WRONGPARAMETER(-4, "Wrong parameter"),
    AUTHENTICATIONFAIL(-3, "Authentication Fail"),
    WRONGIP(-2, "IP WRONG"),
    WARN(-1, "Network exception, please try again later"),
    /* normal part*/

    /* user part*/
    USERINFOADD(1002, "Add new userInfo"),
    USERHAD(1001, "User already exists"),


    WRONGPWD(-1001, "Wrong password"),
    USERNOTEL(-1002, "Telephone missing"),
    TOKENOLD(-1003, "Token is Expired"),
    TOKENWRONG(-1004, "Token is wrong"),
    TOKENEXCEPTION(-1005, "Make Token is wrong"),
    USERADDFAIL(-1006, "Add user fail"),
    USERINFONONE(-1007, "No userInfo."),
    PASSWORDMISSING(-1008, "No set pwd."),
    TELEPHONENOJOIN(-1009, "Telephone is not join."),
    NOUSER(-1010, "No user"),
    /* user login part*/
    STOREWRONG(-1100, "Storeinfo is wrong"),
    STOREFILEWRONG(-1101, "StoreFile is wrong"),

    /*  Team Part  */
    TEAMHAD(-1201, "Same team had exists"),
    TEAM_HAD_BEEN_JOIN(-1202, "This team had been join"),
    UPDATE_TEAM_SUCCESS_JOIN(1201, "Update teamInfo success .This team had been join"),
    UPDATE_TEAM_SUCCESS(1200, "Update teamInfo success"),
    TEAM_JOIN_SUCCESS(RespCodeNumber.TEAM_JOIN_SUCCESS, "加入组局成功"),
    TEAM_JOIN_FAIL(RespCodeNumber.TEAM_JOIN_FAIL, "加入组局失败"),

    /* MXT world game part*/
//    init game part
    GAMEWAIT(1310, "game state is WAIT"),
    GAMEINIT(1311, "game state is INIT"),
    GAMEDOING(1312, "game state is DOING"),
    GAMEFINISH(1313, "game state is FINISH"),
    EQUIPMENTBASICEXIST(-1301, "equipment already exit"),

    /* MXT world game part*/
    /* deep forest game part*/
    WRONGFIND(-1100, "canot find gameinfo");
    /* deep forest game part*/


    private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
