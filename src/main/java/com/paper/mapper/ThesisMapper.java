package com.paper.mapper;

import com.paper.entity.Teacher;
import com.paper.entity.Thesis;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ThesisMapper {
    int insertThesis(Thesis thesis);

    int deleteThesis(Thesis thesis);

    int updateThesis(Thesis thesis);

    int updateNotNull(Thesis thesis);

    Thesis selectById(int id);

    List<Thesis> selectWhere(Thesis thesis);

    List<Thesis> selectAll();

    int SelectNums(Teacher teacher);
}
