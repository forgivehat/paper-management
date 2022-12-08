package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 账号信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    Integer id;

    String username;

    String password;

    Integer role;
}
