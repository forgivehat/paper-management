package com.paper.service.impl;

import com.paper.entity.Account;
import com.paper.mapper.AccountMapper;
import com.paper.util.Result;
import com.paper.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AccountServiceImpl implements com.paper.service.AccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public Result login(@RequestBody Account account) {
        Account u = accountMapper.selectAccountByUsername(account.getUsername());
        if (u == null || !u.getPassword().equals(account.getPassword())){
            return new Result("201","用户名或密码错误");
        }
        Integer role = u.getRole();
        String token = TokenUtil.getToken(u.getUsername(),u.getPassword(), String.valueOf(role));
        return new Result("100",String.valueOf(role), token);
    }

    @Override
    public Account findByUsername(String username) {
        return accountMapper.selectAccountByUsername(username);
    }


}
