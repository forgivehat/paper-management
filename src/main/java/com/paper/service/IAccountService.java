package com.paper.service;

import com.paper.entity.Account;

public interface IAccountService {
    Account findByUsername(String username);
}
