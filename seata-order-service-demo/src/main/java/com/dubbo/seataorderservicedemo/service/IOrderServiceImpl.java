package com.dubbo.seataorderservicedemo.service;

import com.dubbo.seatacommondemo.dto.Account;
import com.dubbo.seatacommondemo.dto.Order;
import com.dubbo.seatacommondemo.dubbo.AccountService;
import com.dubbo.seatacommondemo.enums.RspStatusEnum;
import com.dubbo.seatacommondemo.response.ObjectResponse;

import com.dubbo.seataorderservicedemo.entity.OrderPo;
import com.dubbo.seataorderservicedemo.mapper.OrderMapper;
import org.apache.dubbo.config.annotation.Reference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IOrderServiceImpl implements IOrderService {
    private Logger log=LoggerFactory.getLogger(IOrderServiceImpl.class);
    @Reference(version = "1.0.0")
    private AccountService accountService;
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public ObjectResponse createOrder(Order orderDto) {
       ObjectResponse response=new ObjectResponse();
        Account account=new Account();
        account.setUserId(orderDto.getUserId());
        account.setAmount(orderDto.getAmount());

        ObjectResponse objectResponse=accountService.decreaseAccount(account);
        log.info("调用结果",objectResponse);
        OrderPo orderPo=new OrderPo();
        orderPo.setUserId(orderDto.getUserId());
        orderPo.setAmount(orderDto.getAmount());
        orderPo.setCommodityCode(orderDto.getCommodityCode());
        orderPo.setCount(orderDto.getCount());
        try {
            orderMapper.createOrder(orderPo);
        } catch (Exception e) {
            response.setStatus(RspStatusEnum.FAIL.getCode());
            response.setMessage(RspStatusEnum.FAIL.getMessage());
            return response;
        }

        if (objectResponse.getStatus() != 200) {
            response.setStatus(RspStatusEnum.FAIL.getCode());
            response.setMessage(RspStatusEnum.FAIL.getMessage());
            return response;
        }
        response.setStatus(RspStatusEnum.SUCCESS.getCode());
        response.setMessage(RspStatusEnum.SUCCESS.getMessage());
        return response;

    }
}
