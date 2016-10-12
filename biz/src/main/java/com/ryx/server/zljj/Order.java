package com.ryx.server.zljj;

/**
 * Created by lenovo on 2016/10/12.
 * N表示无必须  Y表示必须
 */
public class Order {
    /**
     * 基金代码
     */
    private String fundId;
    /**
     * 商户申请流水号 N
     */
    private String serialnoex;
    /**
     * 认申购金额 分
     */
    private Long subamt;

    /**
     * 支付金额
     */
    private Long amount;
    /**
     * 状态
     */
    private Integer status;

}
