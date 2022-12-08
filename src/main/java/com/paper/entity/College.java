package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学院信息实体类
 * clazz --> major --> department --> college
 *                                       ^
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class College {
    Integer id;

    String name;

    String note;
}
