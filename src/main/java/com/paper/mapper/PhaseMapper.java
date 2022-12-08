package com.paper.mapper;
import com.paper.entity.Phase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhaseMapper {
    int insertPhase(Phase Phase);

    int deletePhase(Phase Phase);

    int updatePhase(Phase Phase);

    int updateNotNull(Phase Phase);

    Phase selectById(int id);

    List<Phase> selectWhere(Phase Phase);

    List<Phase> selectAll();
}
