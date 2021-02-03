package com.dubbo.seataorderservicedemo.mapper;

import com.dubbo.seataorderservicedemo.entity.OrderPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    /**
     * @description 创建订单
     *
     */
    void createOrder(@Param("order")OrderPo order);

}
