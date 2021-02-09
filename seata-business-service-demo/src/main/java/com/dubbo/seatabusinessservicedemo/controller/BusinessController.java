package com.dubbo.seatabusinessservicedemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.dubbo.seatabusinessservicedemo.service.IBussinessService;
import com.dubbo.seatacommondemo.dto.Business;
import com.dubbo.seatacommondemo.response.ObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/business")
public class BusinessController {
    @Autowired
    private IBussinessService iBussinessService;
    @RequestMapping(value = "/buy")
    public Map<String ,ObjectResponse> business(@RequestBody Map<String,Object> params){
        Map<String,ObjectResponse> result=new HashMap<>();
        Business business=new Business();
        String userId=(String) params.get("user_id");
        String name=(String)params.get("name");
        int count=(Integer)params.get("count");
        String commodityCode=(String)params.get("commodity_code");
        BigDecimal amount=(BigDecimal) params.get("amount");
         business.setUserId(userId);
         business.setCommodityCode(commodityCode);
         business.setCount(count);
         business.setName(name);
         business.setAmount(amount);
         ObjectResponse objectResponse=iBussinessService.businessService(business);
         result.put("message",objectResponse);
        return result;
    }
}
