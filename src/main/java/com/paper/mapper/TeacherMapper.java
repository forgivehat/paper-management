package com.paper.mapper;

import com.paper.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    int insertTeacher(Teacher teacher);

    int deleteTeacher(Teacher teacher);

    int updateStudent(Teacher teacher);

    int updateNotNull(Teacher teacher);

    Teacher selectById(int id);

    List<Teacher> selectWhere(Teacher teacher);

    List<Teacher> selectAll();
}
