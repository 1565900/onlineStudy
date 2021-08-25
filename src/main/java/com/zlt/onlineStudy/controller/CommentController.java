package com.zlt.onlineStudy.controller;

import com.zlt.onlineStudy.po.Comment;
import com.zlt.onlineStudy.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Comment")
@CrossOrigin
public class CommentController {
    @Autowired
    private CommentService commentService;
    @DeleteMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        return commentService.deleteByPrimaryKey(id);
    };
    @PostMapping("/insert")
    public int insert(Comment record){
        return commentService.insert(record);
    };
    @PostMapping("/insertSelective")
    public int insertSelective(Comment record){
        return commentService.insertSelective(record);
    };
    @GetMapping("/selectByPrimaryKey")
    public Comment selectByPrimaryKey(Integer id){
        return commentService.selectByPrimaryKey(id);
    };
    @PatchMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(Comment record){
        return commentService.updateByPrimaryKeySelective(record);
    };
    @PutMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(Comment record){
        return commentService.updateByPrimaryKey(record);
    };
    @GetMapping("/findAllComment")
    public List<Comment> findAllComment(){
        return commentService.findAllComment();
    };
    @GetMapping("/findCommentByCourseId")
    public List<Comment> findCommentByCourseId(Integer id){
        return commentService.findCommentByCourseId(id);
    };
}
