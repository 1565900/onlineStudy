package com.zlt.onlineStudy.controller;
import com.zlt.onlineStudy.po.Course;
import com.zlt.onlineStudy.po.User_course;
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
    @GetMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        return courseService.deleteByPrimaryKey(id);
    };
    @PostMapping("/insert")
    public int insert(Course record){
        return courseService.insert(record);
    };
    @GetMapping("/insertSelective")
    public int insertSelective(Course record){
        if(record.getImg()!=null) {
            String url = record.getImg();
            String imageName = url.substring(url.lastIndexOf("/") + 1, url.length());
            record.setImg(imageName);
        }
        return courseService.insertSelective(record);
    };
    @GetMapping("/selectByPrimaryKey")
    public List<Course> selectByPrimaryKey(Integer id){
        return courseService.selectByPrimaryKey(id);
    };
    @GetMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(Course record){
        if(record.getImg()!=null) {
            String url = record.getImg();
            String imageName = url.substring(url.lastIndexOf("\\") + 1, url.length());
            record.setImg(imageName);
        }
        System.out.println(record.getImg());
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
    @GetMapping("/findCourseByUserId")
    public List<Course> findCourseByUserId(Integer id){
        return courseService.findCourseByUserId(id);
    };
    @GetMapping("findCheckCourseByUserId")
    public List<Course> findCheckCourseByUserId(Integer id){
        return courseService.findCheckCourseByUserId(id);
    };
    @GetMapping("indOwnCourseByUserId")
    public List<Course> findOwnCourseByUserId(Integer id){
        return courseService.findOwnCourseByUserId(id);
    };
}
