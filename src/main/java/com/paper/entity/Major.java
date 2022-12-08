package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 专业信息实体类
 * clazz --> major --> department --> college
 *             ^
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Major {
    Integer id;

    String name;

    Integer dep_id;

    Integer dep_name;

    Integer college_id;

    String college_name;
}
