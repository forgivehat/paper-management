package com.paper.mapper;

import com.paper.entity.College;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollegeMapper {
    int insertCollege(College college);

    int deleteCollege(College college);

    int updateCollege(College college);

    int updateNotNull(College College);

    College selectById(int id);

    List<College> selectWhere(College college);

    List<College> selectAll();
}
