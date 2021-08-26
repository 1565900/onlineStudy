package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.po.Comment;

import java.util.List;

public interface CommentService {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> findAllComment();

    List<Comment> findCommentByCourseId(Integer id);




}
