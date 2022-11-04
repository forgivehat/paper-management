package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
    Integer id;

    String name;

    Integer parent_id;

    String org_key;

    Integer level;

    String note;
}
