package com.paper.service.impl;

import com.paper.entity.Account;
import com.paper.mapper.AccountMapper;
import com.paper.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public Account findByUsername(String username) {
        return accountMapper.selectByUsername(username);
    }
}
