package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

/**
 * 论文命题数据实体类
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Thesis {
        Integer id;

        String title;

        String direction;

        String description;

        String state;  // 论文题目选中状态

        Integer teacher_id; // 命题者id

        String teacher_name;

        Integer dep_id;

        String dep_name;

        Integer college_id;

        String college_name;

}
