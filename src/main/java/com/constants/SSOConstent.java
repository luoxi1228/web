package com.constants;

/**
 *  这是SSO系统的常量配置
 */
public class SSOConstent {

    /**
     * 单点登录系统登录地址
     */
    public static final String SSO_LOGIN_URL = "http://localhost:8080/server_war/LoginServlet";

    /**
     * 单点登录系统退出地址
     */
    public static final String SSO_LOGOUT_URL = "http://localhost:8080/server_war/LogoutServlet";

    /**
     * 单点登录系统Token校验地址
     */
    public static final String SSO_LOGIN_TOKEN_VERIFY = "http://localhost:8080/server_war/VerifyServlet";

}
