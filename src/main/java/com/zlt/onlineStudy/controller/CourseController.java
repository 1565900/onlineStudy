package com.zlt.onlineStudy.controller;
import com.zlt.onlineStudy.po.Course;
import com.zlt.onlineStudy.service.CourseService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Course")
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseService courseService;
    @DeleteMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        return courseService.deleteByPrimaryKey(id);
    };
    @PostMapping("/insert")
    public int insert(Course record){
        return courseService.insert(record);
    };
    @PostMapping("/insertSelective")
    public int insertSelective(Course record){
        return courseService.insertSelective(record);
    };
    @GetMapping("/selectByPrimaryKey")
    public Course selectByPrimaryKey(Integer id){
        return courseService.selectByPrimaryKey(id);
    };
    @PatchMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(Course record){
        return courseService.updateByPrimaryKeySelective(record);
    };
    @PutMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(Course record){
        return courseService.updateByPrimaryKey(record);
    }
    @GetMapping("/findAllCourse")
    public List<Course> findAllCourse(){
        return courseService.findAllCourse();
    };
}
