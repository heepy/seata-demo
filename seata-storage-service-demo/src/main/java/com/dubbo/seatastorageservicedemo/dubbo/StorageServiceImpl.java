package com.dubbo.seatastorageservicedemo.dubbo;

import com.dubbo.seatacommondemo.dto.Commodity;
import com.dubbo.seatacommondemo.dubbo.StorageService;
import com.dubbo.seatacommondemo.response.ObjectResponse;
import com.dubbo.seatastorageservicedemo.mapper.StorageMapper;
import com.dubbo.seatastorageservicedemo.service.IStorageService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0",protocol = "${dubbo.protocol.id}",
        application = "${dubbo.application.id}",registry = "${dubbo.registry.id}",
        timeout = 3000)
public class StorageServiceImpl implements StorageService {

    @Autowired
    private IStorageService iStorageService;
    @Override
    public ObjectResponse decreaseStorage(Commodity commodity) {

        return iStorageService.decreaseStorage(commodity);
    }


}
