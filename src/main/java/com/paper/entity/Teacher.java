package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 老师信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    Integer id;

    String no;

    String name;

    String title;

    String email;

    String address;

    Integer department_id;

    String department_name;

    Integer max_thesis_num;

    Integer acc_id;
}
