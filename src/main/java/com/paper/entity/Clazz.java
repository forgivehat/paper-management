package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 班级信息实体类
 * clazz --> major --> department --> college
 *   ^
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazz {
    Integer id;

    String name;

    String major_id;

    String major_name;

    Integer dep_id;

    String dep_name;

    Integer college_id;

    String college_name;
}
