package com.paper.controller;


import com.paper.entity.Account;
import com.paper.service.IAccountService;
import com.paper.util.Param;
import com.paper.util.Result;
import com.paper.util.TokenUtil;
import com.paper.util.VerifyToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author weish
 * @create 2021/4/29 15:00
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;


    /**
     *      注册接口
     *     入参为JSON格式，包括账号、密码 用户类型（需要注册的用户只能为学生，role值为“0”）
     * @param userInfo
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody Param<Account> userInfo){
        Account account = userInfo.account;
        return new Result("101","注册成功！");
    }

    /**
     * 登录接口
     * 账号(username)、密码(password)、用户类型（role）
     * @param account
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody Account account){
        Account u = accountService.findByUsername(account.getUsername());
        if (u == null || !u.getPassword().equals(account.getPassword())){
            return new Result("201","用户名或密码错误");
        }
        Integer role = u.getRole();
        String token = TokenUtil.getToken(u.getUsername(),u.getPassword(), String.valueOf(role));
        return new Result("100",String.valueOf(role), token);
    }

    /**
     * 更新账户密码
     * @param account
     * @return
     */
    @VerifyToken
    @RequestMapping("/updateAcc")
    public Result updateAcc(@RequestBody Account account,HttpServletRequest request){
        String username = TokenUtil.getUsernameFromToken(request);

        return new Result("101","更新账户信息成功");
    }










}
