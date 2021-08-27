package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.mapper.User_courseMapper;
import com.zlt.onlineStudy.po.User_course;

import javax.annotation.Resource;

public interface User_courseService {
     //修改用户上次学到的章节
     int updateByChapters(int userId,int courseId,int chaptersId);
     //用户加入课程(上次学到章节数默认为0)
     int insertJoinCourse(int userId,int courseId);
     //用户上传课程
     int insertUploadCourse(int userId,int courseId);

}


