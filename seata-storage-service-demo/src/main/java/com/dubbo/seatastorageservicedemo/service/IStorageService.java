package com.dubbo.seatastorageservicedemo.service;


import com.dubbo.seatacommondemo.dto.Commodity;
import com.dubbo.seatacommondemo.response.ObjectResponse;


public interface IStorageService {

   ObjectResponse decreaseStorage(Commodity commodity);
}
