package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 系信息实体类
 * clazz --> major --> department --> college
 *                         ^
**/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    Integer id;

    String name;

    Integer college_id;

    String college_name;

}
