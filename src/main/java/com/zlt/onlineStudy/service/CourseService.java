package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.po.Course;
import org.springframework.stereotype.Service;


public interface CourseService {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}