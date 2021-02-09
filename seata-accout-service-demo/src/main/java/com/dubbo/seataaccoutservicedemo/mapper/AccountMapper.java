package com.dubbo.seataaccoutservicedemo.mapper;

import com.dubbo.seataaccoutservicedemo.entity.AccountPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper  {
    /**
     * 减少账户余额
     * @param userId
     * @param amount
     * @return
     */
    int decreaseAccount(@Param("userId") String userId, @Param("amount") Double amount);

    void addAccount(@Param("account") AccountPo accountPo);
}
