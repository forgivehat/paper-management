package com.paper.mapper;

import com.paper.entity.Paper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaperMapper {
    int insertPaper(Paper paper);

    int deletePaper(Paper paper);

    int updatePaper(Paper paper);

    int updateNotNull(Paper paper);

    Paper selectById(int id);

    List<Paper> selectWhere(Paper paper);

    List<Paper> selectAll();
}
