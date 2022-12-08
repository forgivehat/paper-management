package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {
    Integer id;

    String content;

    Date created_time;

    Integer paper_id;

    String paper_title;

    Integer author_id; // 论文作者id，即学生id

    String author_name;

    Integer reviewer_id; // 评论者id，即导师id

    String reviewer_name;
}
