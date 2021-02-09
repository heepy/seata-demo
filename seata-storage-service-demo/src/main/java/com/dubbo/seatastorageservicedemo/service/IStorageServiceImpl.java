package com.dubbo.seatastorageservicedemo.service;

import com.dubbo.seatacommondemo.dto.Commodity;
import com.dubbo.seatacommondemo.enums.RspStatusEnum;
import com.dubbo.seatacommondemo.response.ObjectResponse;
import com.dubbo.seatastorageservicedemo.entity.CommodityPo;
import com.dubbo.seatastorageservicedemo.mapper.StorageMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class IStorageServiceImpl implements IStorageService {

    @Autowired
    private StorageMapper storageMapper;
    @Override
    public ObjectResponse decreaseStorage(Commodity commodity) {

        CommodityPo commodityPo=new CommodityPo();
        commodityPo.setCommodityCode(commodity.getCommodityCode());
        commodityPo.setCount(commodity.getCount());
        commodityPo.setName(commodity.getName());
        ObjectResponse response=new ObjectResponse();

        try {
            storageMapper.decreaseStorage(commodityPo);
        } catch (Exception e) {
            response.setStatus(RspStatusEnum.FAIL.getCode());
            response.setMessage(RspStatusEnum.FAIL.getMessage());
        }
        if(storageMapper.selectStorageByCommodityCode(commodity.getCommodityCode())<0){
            response.setStatus(RspStatusEnum.FAIL.getCode());
            response.setMessage(RspStatusEnum.FAIL.getMessage());
        }
        response.setStatus(RspStatusEnum.SUCCESS.getCode());
        response.setMessage(RspStatusEnum.SUCCESS.getMessage());
        return response;
    }

    @Override
    public ObjectResponse addStorage(CommodityPo commodityPo) {
        ObjectResponse response=new ObjectResponse();
        try {
            storageMapper.addCommodityCode(commodityPo);
        } catch (Exception e) {
            response.setStatus(RspStatusEnum.FAIL.getCode());
            response.setMessage(RspStatusEnum.FAIL.getMessage());
        }
        response.setStatus(RspStatusEnum.SUCCESS.getCode());
        response.setMessage(RspStatusEnum.SUCCESS.getMessage());
        return response;
    }


}
