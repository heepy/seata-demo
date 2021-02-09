package com.dubbo.seataaccoutservicedemo.service;


import com.dubbo.seataaccoutservicedemo.entity.AccountPo;
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
    ObjectResponse decreaseAccount(AccountPo accountDTO);
    /**
     * 添加用户
     */
    ObjectResponse addAccount(AccountPo accountPo);
}
