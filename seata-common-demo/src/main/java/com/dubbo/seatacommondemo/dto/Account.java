package com.dubbo.seatacommondemo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author horan
 * @since 2021/01/27
 * @describe 账户对象
 */
public class Account implements Serializable {
    private Integer id;

    private String userId;

    private BigDecimal amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
