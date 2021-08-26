package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.po.Course;
import com.zlt.onlineStudy.po.Course_category;

import java.util.List;

public interface Course_categoryService {
    int deleteByPrimaryKey(Integer id);

    int insert(Course_category record);

    int insertSelective(Course_category record);

    List<Course_category> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course_category record);

    int updateByPrimaryKey(Course_category record);

    List<Course_category> findAllCourse_category();
}
