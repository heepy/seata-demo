package com.dubbo.seatacommondemo.dubbo;

import com.dubbo.seatacommondemo.dto.Commodity;
import com.dubbo.seatacommondemo.response.ObjectResponse;

/**
 * @author horan
 * @createtime 2021/01/26
 *@describe 仓库服务
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    ObjectResponse decreaseStorage(Commodity commodity);
}
