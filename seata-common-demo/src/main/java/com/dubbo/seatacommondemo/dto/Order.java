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
    public long id;
    /**
     * The User id.
     */
    public String userId;
    /**
     * The Commodity code.
     */
    public String commodityCode;
    /**
     * The Count.
     */
    public int count;
    /**
     * The Money.
     */
    public BigDecimal amount;

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
