package com.dubbo.seatastorageservicedemo.controller;


import com.dubbo.seatacommondemo.dubbo.StorageService;
import com.dubbo.seatastorageservicedemo.config.Constant;
import com.dubbo.seatastorageservicedemo.entity.CommodityPo;
import com.dubbo.seatastorageservicedemo.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(value = "/storage")
public class StorageController {

    @Autowired
    private IStorageService storageService;


    @RequestMapping(value = "/add-batch")
    public void addStorage(){
        int listLength= Constant.commodityName.length;
        for(int i=0;i<listLength;i++){
            CommodityPo commodityPo=new CommodityPo();
            commodityPo.setName(Constant.commodityName[i]);
            commodityPo.setCommodityCode(getRandomCommodity());
            commodityPo.setCount(Math.round(1000));
            storageService.addStorage(commodityPo);
        }

    }
    private String getRandomCommodity(){
        StringBuffer commodityCodeBuffer=new StringBuffer();
        for(int i=0;i<9;i++){
            Random random=new Random();
            int l=random.nextInt(12);
            commodityCodeBuffer.append(Constant.commodityCode[l]);
        }
        return  commodityCodeBuffer.toString();
    }

}
