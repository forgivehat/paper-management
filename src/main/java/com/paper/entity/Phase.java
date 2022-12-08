package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Phase {
    Integer id;

    String content;

    Date start_time;

    Date end_time;

    Integer dep_id;

    String dep_name;

    Integer college_id;

    String college_name;
}
