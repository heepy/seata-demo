package com.dubbo.seataaccoutservicedemo.dubbo;

import com.dubbo.seataaccoutservicedemo.service.ITAccountService;
import com.dubbo.seatacommondemo.dto.Account;
import com.dubbo.seatacommondemo.dubbo.AccountService;
import com.dubbo.seatacommondemo.response.ObjectResponse;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service(version = "1.0.0",protocol = "${dubbo.protocol.id}",
        application = "${dubbo.application.id}",registry = "${dubbo.registry.id}",
        timeout = 3000)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private ITAccountService itAccountService;
    @Override
    public ObjectResponse decreaseAccount(Account account) {

        itAccountService.decreaseAccount(account);

        return null;
    }
}
