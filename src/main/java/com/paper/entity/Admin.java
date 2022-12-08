package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员信息实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    Integer id;

    String name;

    Integer level;

    Integer acc_id; //对应的是Account的唯一id, 而不是用户名username!

    Integer org_id; // 根据admin_level判断是哪层机构的管理员，查对应机构信息

    String org_name;
}
