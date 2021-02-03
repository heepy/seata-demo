package com.dubbo.seataaccoutservicedemo.entity;


import java.io.Serializable;

public class Account implements Serializable {

    private long Id;
    private String userId;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    private Double amount;

    public Account() {
    }


}
