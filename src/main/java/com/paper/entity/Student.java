package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生信息实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    Integer id;

    String no;

    String name;

    String gender;

    String email;

    String telephone;

    Integer clazz_id;

    String clazz_name;

    Integer dep_id;

    String dep_name;

    Integer college_id;

    String college_name;

    Integer acc_id;  // 账号id

    Integer final_thesis_id;

}
