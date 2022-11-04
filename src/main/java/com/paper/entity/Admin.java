package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    Integer id;

    Integer acc_id;

    Integer admin_level;
}
