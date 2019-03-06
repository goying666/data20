package com.renchaigao.zujuba.mongoDB.info;

import com.renchaigao.zujuba.BasicObject;
import lombok.Getter;
import lombok.Setter;
import normal.dateUse;

@Setter
@Getter
public class VerificationCodeInfo extends BasicObject{


    private String code;
    private String phoneNumber;
    private String state;//
    private String requestStyle;//
    private Integer requestTimes;
    private String return_code;//
/* *
    错误码	错误信息	描述
    10000	参数异常	必传参数有空值()
    10001	手机号格式不正确	手机号应为11位手机号
    10002	模板不存在	没有申请模板,或模板未通过审核
    10003	模板变量不正确	模板中含有变量,但未将变量传入,变量传值格式错误
    10004	变量中含有敏感词	变量中含有违法敏感词
    10005	变量名称不匹配	申请的模板中含有变量名称,变量的名称与所传变量名称不匹配
    10006	短信长度过长	签名+模板+变量长度超过70字,超过一条短信长度,如果有超长短信需求请联系客服
    10007	手机号查询不到归属地	所传手机号查询不到归属地
    10008	产品错误	系统错误,详情请联系客服
    10009	价格错误	系统错误,详情请联系客服
    10010	重复调用	由于网络原因重复调用接口
    99999	系统错误	详情请联系客服
    00000	调用成功
* */
    private String order_id;//


}
