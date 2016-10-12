package com.ryx.server.zljj;

/**
 * 众禄基金用户表
 * Created by lenovo on 2016/10/12.
 * 1.用户申购
 */
public class User {
    /**
     *用户ID
     */
    private String memberId;
    /**
     * 0:未开户  1：已开户
     */
    private Integer isOpenAccount;

    /**
     * 众禄客户号
     */
    private String clientId;
}
