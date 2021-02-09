package com.dubbo.seatabusinessservicedemo.service;

import com.dubbo.seatacommondemo.dto.Account;
import com.dubbo.seatacommondemo.dto.Business;
import com.dubbo.seatacommondemo.dto.Commodity;
import com.dubbo.seatacommondemo.dto.Order;
import com.dubbo.seatacommondemo.dubbo.OrderService;
import com.dubbo.seatacommondemo.dubbo.StorageService;
import com.dubbo.seatacommondemo.enums.RspStatusEnum;
import com.dubbo.seatacommondemo.exception.DefaultException;
import com.dubbo.seatacommondemo.response.ObjectResponse;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements IBussinessService {
    @Reference(version = "1.0.0")
    private OrderService orderService;
    @Reference(version = "1.0.0")
    private StorageService storageService;


    @Override
    @GlobalTransactional
    public ObjectResponse businessService(Business businessDto) {

        /**
         * 扣减库存对象
         */
        ObjectResponse objectResponse=new ObjectResponse();
        Commodity commodityDto=new Commodity();
        commodityDto.setCommodityCode(businessDto.getCommodityCode());
        commodityDto.setCount(businessDto.getCount());
        commodityDto.setName(businessDto.getName());

       ObjectResponse storageResponse= storageService.decreaseStorage(commodityDto);

        /**
         * 生成订单对象
         */
        Order orderDto=new Order();
        orderDto.setAmount(businessDto.getAmount());
        orderDto.setCommodityCode(businessDto.getCommodityCode());
        orderDto.setCount(businessDto.getCount());
        orderDto.setUserId(businessDto.getUserId());
       ObjectResponse orderResponse= orderService.create(orderDto);
        if (storageResponse.getStatus() != 200 || orderResponse.getStatus() != 200) {
            throw new DefaultException(RspStatusEnum.FAIL);
        }

        objectResponse.setStatus(RspStatusEnum.SUCCESS.getCode());
        objectResponse.setMessage(RspStatusEnum.SUCCESS.getMessage());
        objectResponse.setData(orderResponse.getData());
        return objectResponse;

    }
}
