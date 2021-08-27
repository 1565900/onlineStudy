package com.zlt.onlineStudy.controller;

import com.zlt.onlineStudy.po.Chapters;
import com.zlt.onlineStudy.po.Comment;
import com.zlt.onlineStudy.po.Course;
import com.zlt.onlineStudy.po.User;
import com.zlt.onlineStudy.service.*;
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
    private ChaptersService chaptersService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private CourseService courseService;

    @Autowired
    User_courseService user_courseService;

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
            return "user/uindex.html";
        }else {
            System.out.println("error");
            return "user/login.html";
        }
    }
    @RequestMapping("uindex")
    public String uindex(){
        return "user/uindex.html";
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
    @RequestMapping("uploadCou")
    public String uplodaCou(){
        return "course/uploadCourse.html";
    }
    @RequestMapping("exupload")
    public String exupload(Course course){
        return "course/courseAll.html";
    }


    @RequestMapping("courseDet")
    public String courseDet(Model model,Integer id){
        List<Course> course=courseService.selectByPrimaryKey(id);
        Course o=new Course();
        List<Comment> comments=commentService.findCommentByCourseId(id);
        List<Chapters> chapters=chaptersService.findChaptersByCourseId(id);
        for (int i = 0; i < chapters.size(); i++) {
            Chapters chapters1=(Chapters) chapters.get(i);
        }
        for (int i = 0; i < course.size(); i++) {
            Course s = (Course) course.get(i);
            o.setImg(s.getImg());
            o.setId(s.getId());
            o.setState(s.getState());
            o.setCategoryId(s.getCategoryId());
            o.setChargingmode(s.getChargingmode());
            o.setCreatetime(s.getCreatetime());
            o.setEndtime(s.getEndtime());
            o.setIntroduce(s.getIntroduce());
            o.setName(s.getName());
            o.setPrice(s.getPrice());
            o.setTeacher(s.getTeacher());
        }
        model.addAttribute("course",o);
        model.addAttribute("comment",comments);
        model.addAttribute("cha",chapters);
        return "course/course_detail.html";
    }
    //加入课程
    @GetMapping("insertJoinCourse")
    public String insertJoinCourse(HttpServletRequest request,Integer courseId){
        int userId=(int)request.getSession().getAttribute("USERID");
        int ok=user_courseService.insertJoinCourse(userId, courseId);
        System.out.println(ok);
        return "user/myCourse.html";
    };

    @GetMapping("myCourse")
    public String myCourse(HttpServletRequest request,Model model){
        int userId=(int)request.getSession().getAttribute("USERID");
        List<Course> courses=courseService.findCourseByUserId(userId);
        model.addAttribute("course",courses);
        return "user/myCourse.html";
    };
    @GetMapping("ownCourse")
    public String ownCourse(HttpServletRequest request,Model model){
        int userId=(int)request.getSession().getAttribute("USERID");
        List<Course> courses=courseService.findOwnCourseByUserId(userId);
        model.addAttribute("course",courses);
        return "user/myCourse.html";
    };
    @GetMapping("gerenshezhi")
    public String gerenshezhi(HttpServletRequest request,Model model){
        int userId=(int)request.getSession().getAttribute("USERID");
        List<User> user=userService.selectByPrimaryKey(userId);
        for (int i = 0; i < user.size(); i++) {
            User user1=(User) user.get(i);
            model.addAttribute("user",user1);
        }
        return "user/userInfo.html";
    };
}
