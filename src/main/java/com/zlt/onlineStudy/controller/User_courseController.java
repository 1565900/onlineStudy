package com.zlt.onlineStudy.controller;

import com.zlt.onlineStudy.service.User_courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/User_course")
@CrossOrigin
public class User_courseController {
    @Autowired
    User_courseService user_courseService;
    @GetMapping("updateByChapters")
    public int updateByChapters(int userId,int courseId,int chaptersId){
        return user_courseService.updateByChapters(userId,courseId,chaptersId);
    };
    @GetMapping("ok")
    public int insertJoinCourse(int userId,int courseId){
        return  user_courseService.insertJoinCourse(userId, courseId);
    };
    @GetMapping("insertJoinCourse")
    public String insertJoinCourse(HttpServletRequest request, Integer courseId){
        int userId=(int)request.getSession().getAttribute("USERID");
        System.out.println(userId);
        System.out.println(courseId);
        int ok=user_courseService.insertJoinCourse(userId, courseId);
        System.out.println("ok");
        return "user/myCourse.html";
    };


}
