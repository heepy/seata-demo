package com.dubbo.seatacommondemo.dubbo;

import com.dubbo.seatacommondemo.dto.Account;
import com.dubbo.seatacommondemo.response.ObjectResponse;

/**
 * @author horan
 * @createtime 2021/01/26
 * @describe 账户服务
 */
public interface AccountService {

    /**
     * 扣除账户金额
     */
    ObjectResponse decreaseAccount(Account account);
}
