package com.paper.mapper;

import com.paper.entity.Major;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MajorMapper {
    int insertMajor(Major major);

    int deleteMajor(Major major);

    int updateMajor(Major major);

    int updateNotNull(Major major);

    Major selectById(int id);

    List<Major> selectWhere(Major major);

    List<Major> selectAll();
}
