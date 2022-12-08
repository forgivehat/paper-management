package com.paper.service;

import com.paper.entity.Account;
import com.paper.util.Result;

public interface AccountService {
    Result login( Account account);
    Account findByUsername(String username);



}
