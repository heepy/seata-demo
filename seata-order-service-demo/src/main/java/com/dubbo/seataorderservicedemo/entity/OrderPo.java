package com.dubbo.seataorderservicedemo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderPo  implements Serializable {
    /**
     * The Id.
     */
    private long id;
    /**
     * The User id.
     */
    private String userId;
    /**
     * 商品编码.
     */
    private String commodityCode;
    /**
     * 商品数量
     */
    private int count;

    public OrderPo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 商品价格
     */
    private BigDecimal amount;
    /**
     *
     */

}
