package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    Integer id;

    String name;

    String gender;

    String email;

    String telephone;

    String class_id;

    Integer acc_id;  // 账号id

}
