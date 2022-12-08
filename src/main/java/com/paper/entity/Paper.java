package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 论文实体类，与论文命题不同
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paper {
    Integer id;

    String version; // 论文版本

    String url; // 论文网络存储路径

    Integer thesis_id;

    String thesis_title;

    Integer author_id;  // 作者id，即学生id

    String author_name;

    Integer teacher_id;

    String teacher_name;


}
