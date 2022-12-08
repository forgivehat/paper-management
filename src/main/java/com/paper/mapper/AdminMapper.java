package com.paper.mapper;

import com.paper.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    int insertAdmin(Admin admin);

    int deleteAdmin(Admin admin);

    int updateAdmin(Admin admin);

    int updateNotNull(Admin Admin);

    Admin selectById(int id);

    List<Admin> selectWhere(Admin admin);

    List<Admin> selectAll();
}
