package com.zlt.onlineStudy.controller;

import com.zlt.onlineStudy.po.Comment;
import com.zlt.onlineStudy.po.Course_category;
import com.zlt.onlineStudy.service.CommentService;
import com.zlt.onlineStudy.service.Course_categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/Course_category")
@CrossOrigin
public class Course_categoryController {
    @Autowired
    private Course_categoryService course_categoryService;
    @DeleteMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        return course_categoryService.deleteByPrimaryKey(id);
    };
    @PostMapping("/insert")
    public int insert(Course_category record){
        return course_categoryService.insert(record);
    };
    @PostMapping("/insertSelective")
    public int insertSelective(Course_category record){
        return course_categoryService.insertSelective(record);
    };
    @GetMapping("/selectByPrimaryKey")
    public Course_category selectByPrimaryKey(Integer id){
        return course_categoryService.selectByPrimaryKey(id);
    };
    @PatchMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(Course_category record){
        return course_categoryService.updateByPrimaryKeySelective(record);
    };
    @PutMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(Course_category record){
        return course_categoryService.updateByPrimaryKey(record);
}}
