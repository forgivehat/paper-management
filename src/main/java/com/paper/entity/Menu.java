package com.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    Integer id;

    String menu_name;

    Integer father_menu_id;

    List<Menu> children_menu;

}
