package com.dubbo.seatabusinessservicedemo.service;

import com.dubbo.seatacommondemo.dto.Account;
import com.dubbo.seatacommondemo.dto.Business;
import com.dubbo.seatacommondemo.response.ObjectResponse;

public interface IBussinessService {

    ObjectResponse businessService(Business businessDto);

}
