package com.smalltomato.base.code;

/**
 * 返回码
 * Created by feiL on 2017/11/30.
 */
public class ResultCode {

    /**
     * 成功
     */
    public static final String SUCCESS = "000";
    /**
     * 成功没有数据
     */
    public static final String NULL = "001";
    /**
     * 服务器错误
     */
    private static final String SERVER_ERROR = "1001";
    /**
     * 页面参数错误，或页面参数信息不完整
     */
    private static final String CLIENT_PARAM_ERROR = "1002";
    /**
     * 用户不存在或密码错误
     */
    private static final String USERNAME_PASSWORD_ERROR = "1003";
}
