package com.zlt.onlineStudy.service.Impl;

import com.zlt.onlineStudy.mapper.User_courseMapper;
import com.zlt.onlineStudy.po.User_course;
import com.zlt.onlineStudy.service.User_courseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class User_courseServiceImpl implements User_courseService {
    @Resource
    User_courseMapper user_courseMapper;
    public int updateByChapters(int userId,int courseId,int chaptersId){
      User_course user_course = new User_course();
      user_course.setUserId(userId);
      user_course.setCourseId(courseId);
      user_course.setLeaCha(chaptersId);
      return user_courseMapper.updateSelective(user_course);
    };

    public int insertJoinCourse(int userId,int courseId) {
        User_course user_course = new User_course();
        user_course.setUserId(userId);
        user_course.setCourseId(courseId);
        user_course.setState(1);
        user_course.setLeaCha(0);
        return user_courseMapper.insert(user_course);
    }

    public  int insertUploadCourse(int userId,int courseId){
        User_course user_course = new User_course();
        user_course.setUserId(userId);
        user_course.setCourseId(courseId);
        user_course.setState(0);
        user_course.setLeaCha(0);
        return user_courseMapper.insert(user_course);
    };

}
