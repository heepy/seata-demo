package com.dubbo.seataaccoutservicedemo.service;

import com.dubbo.seatacommondemo.dto.Account;
import com.dubbo.seatacommondemo.response.ObjectResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * * @author lidong
 * @since 2019-09-04
 */
public interface ITAccountService{

    /**
     * 扣用户钱
     */
    ObjectResponse decreaseAccount(Account accountDTO);
}
