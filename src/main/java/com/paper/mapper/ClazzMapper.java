package com.paper.mapper;

import com.paper.entity.Clazz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClazzMapper {
    int insertClazz(Clazz clazz);

    int deleteClazz(Clazz clazz);

    int updateClazz(Clazz clazz);
    int updateNotNull(Clazz Clazz);
    Clazz selectById(int id);

    List<Clazz> selectWhere(Clazz clazz);

    List<Clazz> selectAll();
}
