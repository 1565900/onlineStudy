package com.zlt.onlineStudy.controller;

import com.zlt.onlineStudy.po.Course;
import com.zlt.onlineStudy.po.User;
import com.zlt.onlineStudy.service.CourseService;
import com.zlt.onlineStudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserLoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private CourseService courseService;
    @RequestMapping("/Login")
    public String Login(Model model, User use,HttpServletRequest request){
        User user1=userService.selectByAccount(use.getAccount());
        List<Course> courses=courseService.findAllCourse();
        if(user1!=null&&use.getPassword().equals(user1.getPassword())){
            System.out.println("OK");
            request.getSession().setAttribute("role",2);
            request.getSession().setAttribute("USERNAME",user1.getNikename());
            request.getSession().setAttribute("USERID",user1.getId());
            model.addAttribute("User",user1);
            model.addAttribute("course",courses);
            System.out.println("OK");
            return "user/uindex.html";
        }else {
            System.out.println("error");
            return "user/login.html";
        }
    }

    @RequestMapping("index")
    public String index(){
        return "index.html";
    }
    @RequestMapping("loginIn")
    public String loginIn(){
        return "user/login.html";
    }

    @RequestMapping("courseAll")
    public String courseAll(Model model){
        List<Course> courses=courseService.findAllCourse();
        model.addAttribute("course",courses);
        return "course/couresAll.html";
    }
    @RequestMapping("courseLei")
    public String courseLei(Model model,Integer id){
        List<Course> courses=courseService.findCourseByLei(id);
        model.addAttribute("course",courses);
        return "course/courseLei.html";
    }
    //名字找course
    @GetMapping("searchByName")
    public String searchByName(String condition, Model model){
        String sql = "select * from course where state=0";
        sql += " and name like '%" + condition +"%' ";
        model.addAttribute("condition",condition);
        List<Course> list=courseService.findBySqlReturnEntity(sql);
        model.addAttribute("obj",list);
        return "";
    }

}
