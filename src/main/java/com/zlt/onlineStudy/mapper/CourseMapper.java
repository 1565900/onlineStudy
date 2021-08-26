package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    List<Course> findAllCourse();
    //通过用户id找到用户所加入的非自己上传的课程
    List<Course> findCourseByUserId(Integer id);
    //通过用户id找到用户自己上传的正在审核的课程
    List<Course> findCheckCourseByUserId(Integer id);
    //通过用户id找用户自己上传通过审核的课程
    List<Course> findOwnCourseByUserId(Integer id);

    List<Course> findCourseByLei(Integer id);

    List<Course> findBySqlReturnEntity(String sql);
}