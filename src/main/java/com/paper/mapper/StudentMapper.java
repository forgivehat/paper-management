package com.paper.mapper;

import com.paper.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    int insertStudent(Student student);

    int deleteStudent(Student student);

    int updateStudent(Student student);

    int updateNotNull(Student student);

    Student selectById(int id);

    List<Student> selectWhere(Student student);

    Student selectByAccId(int id);

    List<Student> selectAll();
}
