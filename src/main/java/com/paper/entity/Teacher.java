package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    Integer id;

    String name;

    String email;

    String telephone;

    String address;

    Integer acc_id;
}
