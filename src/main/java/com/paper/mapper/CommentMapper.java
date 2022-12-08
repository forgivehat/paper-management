package com.paper.mapper;

import com.paper.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    int insertComment(Comment comment);

    int deleteComment(Comment comment);

    int updateComment(Comment comment);

    int updateNotNull(Comment comment);

    Comment selectById(int id);

    List<Comment> selectWhere(Comment comment);

    List<Comment> selectAll();
}
