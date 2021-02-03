package com.dubbo.seataaccoutservicedemo.service;


import com.dubbo.seataaccoutservicedemo.mapper.AccountMapper;
import com.dubbo.seatacommondemo.dto.Account;
import com.dubbo.seatacommondemo.enums.RspStatusEnum;
import com.dubbo.seatacommondemo.response.ObjectResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * * @author horan
 * @since 2019-09-04
 */
@Service
public class TAccountServiceImpl implements ITAccountService {

    @Autowired
    private AccountMapper accountMapper;



    @Override
    public ObjectResponse decreaseAccount(Account accountDTO) {
        int account = accountMapper.decreaseAccount(accountDTO.getUserId(), accountDTO.getAmount().doubleValue());
        ObjectResponse<Object> response = new ObjectResponse<>();
        if (account > 0){
            response.setStatus(RspStatusEnum.SUCCESS.getCode());
            response.setMessage(RspStatusEnum.SUCCESS.getMessage());
            return response;
        }

        response.setStatus(RspStatusEnum.FAIL.getCode());
        response.setMessage(RspStatusEnum.FAIL.getMessage());
        return response;

    }
}
