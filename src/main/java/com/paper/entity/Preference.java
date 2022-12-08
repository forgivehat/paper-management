package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Preference {
    int id;
    int thesis_id;
    int stu_id;
    int stu_preference;
    int teacher_id;
    int teacher_preference;
    int result;
}
