package com.dubbo.seataaccoutservicedemo.controller;

import com.dubbo.seataaccoutservicedemo.entity.AccountPo;
import com.dubbo.seataaccoutservicedemo.service.ITAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(value = "/account")
public class AccountController  {
    @Autowired
    private ITAccountService itAccountService;
    @RequestMapping(value = "/add-account")
    public Map<String,String> addAccount(@RequestParam Integer accountNum){
        Map<String,String> result=new HashMap<>();
        AccountPo accountPo =new AccountPo();
        for (int i=0;i<accountNum;i++){
        accountPo.setAmount(Math.random()*100000+100);
        accountPo.setUserId(UUID.randomUUID().toString());
        itAccountService.addAccount(accountPo);
        }
        result.put("message","OK");

        return result;
    }

}
