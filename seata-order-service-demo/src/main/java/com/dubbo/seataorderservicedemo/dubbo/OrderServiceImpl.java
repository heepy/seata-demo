package com.dubbo.seataorderservicedemo.dubbo;

import com.dubbo.seatacommondemo.dto.Order;
import com.dubbo.seatacommondemo.dubbo.OrderService;
import com.dubbo.seatacommondemo.response.ObjectResponse;
import com.dubbo.seataorderservicedemo.mapper.OrderMapper;
import com.dubbo.seataorderservicedemo.service.IOrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0",protocol = "${dubbo.protocol.id}",
        application = "${dubbo.application.id}",registry = "${dubbo.registry.id}",
        timeout = 3000)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private IOrderService iOrderService;
    @Override
    public ObjectResponse create(Order order) {

        return iOrderService.createOrder(order) ;
    }
}
