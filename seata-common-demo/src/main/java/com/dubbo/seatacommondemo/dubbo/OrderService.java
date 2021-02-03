package com.dubbo.seatacommondemo.dubbo;

import com.dubbo.seatacommondemo.dto.Order;
import com.dubbo.seatacommondemo.response.ObjectResponse;

/**
 * @author horan
 * @createtime 2021/01/26
 *@describe 订单服务
 */
public interface OrderService {
    /**
     * 创建订单
     */
    ObjectResponse create(Order order);
}
