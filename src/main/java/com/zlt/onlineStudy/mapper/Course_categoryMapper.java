package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.Course_category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Course_categoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course_category record);

    int insertSelective(Course_category record);

    List<Course_category> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course_category record);

    int updateByPrimaryKey(Course_category record);

    List<Course_category> findAllCourse_category();
}