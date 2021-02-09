package com.dubbo.seatacommondemo.dto;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author horan
 * @since 2021/01/26
 * @describe 订单对象
 *
 */
public class Order implements Serializable {
    /**
     * The Id.
     */
    private long id;
    /**
     * The User id.
     */
    private String userId;

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
     * The Commodity code.
     */
    private String commodityCode;
    /**
     * The Count.
     */
    private int count;
    /**
     * The Money.
     */
    private BigDecimal amount;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", commodityCode='" + commodityCode + '\'' +
                ", count=" + count +
                ", amount=" + amount +
                '}';
    }


}
