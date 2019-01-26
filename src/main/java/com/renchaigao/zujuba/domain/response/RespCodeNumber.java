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


}
