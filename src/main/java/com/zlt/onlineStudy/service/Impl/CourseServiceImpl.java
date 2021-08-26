package com.zlt.onlineStudy.service.Impl;

import com.zlt.onlineStudy.mapper.CourseMapper;
import com.zlt.onlineStudy.po.Course;
import com.zlt.onlineStudy.po.User_course;
import com.zlt.onlineStudy.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;

    public int deleteByPrimaryKey(Integer id){
        Course course =new Course();
        course.setId(id);
        course.setState(0);
        return courseMapper.updateByPrimaryKeySelective(course);
    };

    public int insert(Course record){
        return courseMapper.insert(record);
    }

    public int insertSelective(Course record){
        return courseMapper.insertSelective(record);
    };

    public List<Course> selectByPrimaryKey(Integer id){
        return courseMapper.selectByPrimaryKey(id);
    };

    public int updateByPrimaryKeySelective(Course record){
        return courseMapper.updateByPrimaryKeySelective(record);
    };

    public int updateByPrimaryKey(Course record){
        return courseMapper.updateByPrimaryKey(record);
    };

    public List<Course> findAllCourse(){
        return courseMapper.findAllCourse();
    };

    public List<Course> findCourseByUserId(Integer id){
        return courseMapper.findCourseByUserId(id);
    };

    public List<Course> findCheckCourseByUserId(Integer id){
        return courseMapper.findCheckCourseByUserId(id);
    };

    public List<Course> findOwnCourseByUserId(Integer id){
        return courseMapper.findOwnCourseByUserId(id);
    };
}
