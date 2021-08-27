package com.zlt.onlineStudy.controller;


import com.zlt.onlineStudy.po.*;
import com.zlt.onlineStudy.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/Exam")
@CrossOrigin
public class ExamController {
    @Autowired
    private ExamService examService;
    private CourseService courseService;
    private User_courseService user_courseService;
    private UserService userService;
    private Testpaper testPaper;
    private TestpaperController testpaperController;

    @GetMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id) {
        if (id != null) {
            return examService.deleteByPrimaryKey(id);
        } else {
            System.out.println("error");
            return 0;
        }
    }

    ;

    @PostMapping("/insert")
    public int insert(Exam record) {
        return examService.insert(record);
    }

    ;

    @GetMapping("/insertSelective")
    public int insertSelective(Exam record) {
        return examService.insertSelective(record);
    }

    ;

    @GetMapping("/selectByCourse_id")
    public List<Exam> selectByCourse_id(Integer id) {
        return examService.selectByCourse_id(id);
    }

    @GetMapping("/updateByPrimaryKeySelective")//当部分属性为空时，则不修改；
    public int updateByPrimaryKeySelective(Exam record) {
        return examService.updateByPrimaryKeySelective(record);
    }

    ;

    @PutMapping("/updateByPrimaryKey")//当实体某属性为空是，则将对应列置空；
    public int updateByPrimaryKey(Exam record) {
        return examService.updateByPrimaryKey(record);
    }

    ;

    @GetMapping("/findAllExam")
    public List<Exam> findAllExam() {
        return examService.findAllExam();
    }

    ;

    @PostMapping("/addExam")
    public String add(Exam exam) {
        examService.insert(exam);
        List<User_course> us = user_courseService.selectUsersById(exam.getCourseId());
        int uid;
        int cid = exam.getCourseId();
        int eid = exam.getId();
        String score = "0";
        for(User_course tus : us){
           uid = tus.getUserId();
           testPaper.setCourseId(cid);
           testPaper.setExamId(eid);
           testPaper.setUserId(uid);
           testPaper.setScore(score);
           testpaperController.insert(testPaper);
        }

        return "success_add";
    };

    @PostMapping("/findExamByid")
    public List<Exam> findExamByid(int id , Model model ){
        List<Course> courses = courseService.findCourseByUserId(id);
        List<Exam> exams = new LinkedList<>();
        for(Course course : courses){
            exams=examService.selectByCourse_id(course.getId());
        }
        return exams;
    };
    @PostMapping("/exfindExamByid")
    public List<Exam> exfindExamByid(int id , Model model ){
        List<Course> courses = courseService.findCourseByUserId(id);
        List<Exam> exams = new LinkedList<>();
        for(Course course : courses){
            exams.addAll(examService.exselectByCourse_id(course.getId()));
        }
        return exams;
    };

}
