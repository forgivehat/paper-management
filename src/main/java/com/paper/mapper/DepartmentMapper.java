package com.paper.mapper;


import com.paper.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    int insertDepartment(Department department);

    int deleteDepartment(Department department);

    int updateDepartment(Department department);

    int updateNotNull(Department department);

    Department selectById(int id);

    List<Department> selectWhere(Department department);

    List<Department> selectAll();
}
