package com.zlt.onlineStudy.service.Impl;

import com.zlt.onlineStudy.mapper.CommentMapper;
import com.zlt.onlineStudy.po.Comment;
import com.zlt.onlineStudy.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;
    public int deleteByPrimaryKey(Integer id){
        Comment comment =new Comment();
        comment.setId(id);
        comment.setState(0);
        return commentMapper.updateByPrimaryKeySelective(comment);
    };

    public int insert(Comment record){return commentMapper.insert(record);}

    public int insertSelective(Comment record){return commentMapper.insertSelective(record);};

    public Comment selectByPrimaryKey(Integer id){return commentMapper.selectByPrimaryKey(id);};
    public int updateByPrimaryKeySelective(Comment record){return commentMapper.updateByPrimaryKeySelective(record);};

    public int updateByPrimaryKey(Comment record){return commentMapper.updateByPrimaryKey(record);};

    public List<Comment> findAllComment(){
        return commentMapper.findAllComment();
    };

     public List<Comment> findCommentByCourseId(Integer id){
         return commentMapper.findCommentByCourseId(id);
     };
}
