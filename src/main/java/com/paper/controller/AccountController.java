package com.paper.controller;


import com.paper.entity.Account;
import com.paper.service.AccountService;
import com.paper.util.Param;
import com.paper.util.Result;
import com.paper.util.TokenUtil;
import com.paper.util.VerifyToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/login")
    public Result login(@RequestBody Account account){
        return accountService.login(account);
    }

    @VerifyToken
    @RequestMapping("/updateAcc")
    public Result updateAcc(@RequestBody Account account,HttpServletRequest request){
        String username = TokenUtil.getUsernameFromToken(request);
        return new Result("100","更新账户信息成功");
    }










}
