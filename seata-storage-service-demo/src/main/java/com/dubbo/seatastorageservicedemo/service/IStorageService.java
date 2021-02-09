package com.dubbo.seatastorageservicedemo.service;


import com.dubbo.seatacommondemo.dto.Commodity;
import com.dubbo.seatacommondemo.response.ObjectResponse;
import com.dubbo.seatastorageservicedemo.entity.CommodityPo;


public interface IStorageService {

   ObjectResponse decreaseStorage(Commodity commodity);
   ObjectResponse addStorage(CommodityPo commodity);
}
