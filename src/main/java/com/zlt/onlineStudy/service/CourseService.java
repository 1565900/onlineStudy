package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.po.Course;
import com.zlt.onlineStudy.po.User_course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    List<Course> findAllCourse();

    List<Course> findCourseByUserId(Integer id);

    List<Course> findCheckCourseByUserId(Integer id);

    List<Course> findOwnCourseByUserId(Integer id);

    List<Course> findCourseByLei(Integer id);

    List<Course> findBySqlReturnEntity(String sql);

}
