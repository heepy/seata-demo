package com.dubbo.seataorderservicedemo.service;

import com.dubbo.seatacommondemo.dto.Order;
import com.dubbo.seatacommondemo.response.ObjectResponse;
import com.dubbo.seataorderservicedemo.entity.OrderPo;

public interface IOrderService {
    ObjectResponse createOrder(Order order);
}
